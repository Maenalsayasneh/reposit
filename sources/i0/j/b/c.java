package i0.j.b;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.instabug.bug.OnSdkDismissedCallback$DismissType;
import com.instabug.chat.synchronization.SynchronizationManager;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.orchestrator.Action;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributesDbHelper;
import com.instabug.library.logging.InstabugLog;
import com.instabug.library.logging.InstabugUserEventLogger;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.Report;
import com.instabug.library.model.State;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.user.UserEvent;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.ReportHelper;
import com.instabug.library.util.memory.MemoryUtils;
import i0.j.b.q.g;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;

/* compiled from: LiveBugManager */
public class c implements Action {
    public final /* synthetic */ Context a;
    public final /* synthetic */ f b;

    /* compiled from: LiveBugManager */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            c.this.b.h();
            c.this.b.b = null;
            Objects.requireNonNull(c.this.b);
            if (SynchronizationManager.getInstance() != null) {
                SynchronizationManager.getInstance().sync();
            }
        }
    }

    public c(f fVar, Context context) {
        this.b = fVar;
        this.a = context;
    }

    public void run() throws Exception {
        if (this.b.b != null) {
            SettingsManager instance = SettingsManager.getInstance();
            if (instance.getOnReportCreatedListener() != null) {
                Report report = new Report();
                instance.getOnReportCreatedListener().onReportCreated(report);
                if (f.g().b != null) {
                    ReportHelper.update(f.g().b.getState(), report);
                }
            }
            f fVar = this.b;
            Context context = this.a;
            Objects.requireNonNull(fVar);
            LinkedHashMap<Uri, String> extraAttachmentFiles = InstabugCore.getExtraAttachmentFiles();
            if (extraAttachmentFiles != null) {
                for (Map.Entry next : extraAttachmentFiles.entrySet()) {
                    fVar.a(context, (Uri) next.getKey(), (String) next.getValue(), Attachment.Type.ATTACHMENT_FILE);
                }
            }
            f fVar2 = this.b;
            Context context2 = this.a;
            if (fVar2.b != null) {
                for (Attachment next2 : fVar2.b.b()) {
                    if (!(next2.getType() == null || next2.getLocalPath() == null)) {
                        if (next2.getType().equals(Attachment.Type.MAIN_SCREENSHOT) || next2.getType().equals(Attachment.Type.EXTRA_IMAGE) || next2.getType().equals(Attachment.Type.GALLERY_IMAGE)) {
                            try {
                                BitmapUtils.compressBitmapAndSave(context2, new File(next2.getLocalPath()));
                            } catch (Exception e) {
                                e.printStackTrace();
                                InstabugSDKLogger.e("LiveBugManager", "Failed to compress MAIN_SCREENSHOT or IMAGE & save original as it is");
                            }
                        }
                    }
                }
            }
            AttachmentsUtility.encryptAttachments(this.b.b.b());
            f fVar3 = this.b;
            if (!(fVar3.b == null || fVar3.b.getState() == null)) {
                Context applicationContext = Instabug.getApplicationContext();
                if (applicationContext != null && !MemoryUtils.isLowMemory(applicationContext) && InstabugCore.getFeatureState(Feature.USER_EVENTS) == Feature.State.ENABLED) {
                    try {
                        fVar3.b.getState().setUserEvents(UserEvent.toJson(InstabugUserEventLogger.getInstance().getUserEvents()).toString());
                    } catch (JSONException e2) {
                        InstabugSDKLogger.e("LiveBugManager", "Got error while parsing user events logs", e2);
                    }
                }
                if ((fVar3.b == null ? null : fVar3.b.getState()) != null) {
                    if (SettingsManager.getInstance().getOnReportCreatedListener() == null) {
                        fVar3.b.getState().setTags(InstabugCore.getTagsAsString());
                        fVar3.b.getState().updateConsoleLog();
                        Feature.State featureState = InstabugCore.getFeatureState(Feature.USER_DATA);
                        Feature.State state = Feature.State.ENABLED;
                        if (featureState == state) {
                            fVar3.b.getState().setUserData(InstabugCore.getUserData());
                        }
                        if (InstabugCore.getFeatureState(Feature.INSTABUG_LOGS) == state) {
                            fVar3.b.getState().setInstabugLog(InstabugLog.getLogs());
                        }
                    }
                    if (!InstabugCore.isFeatureAvailable(Feature.REPORT_PHONE_NUMBER) || fVar3.b.getState().getCustomUserAttribute() == null) {
                        fVar3.b.getState().setUserAttributes(UserAttributesDbHelper.getSDKUserAttributes());
                    } else {
                        fVar3.b.getState().setUserAttributes(UserAttributesDbHelper.getSDKUserAttributesAndAppendToIt("IBG_phone_number", fVar3.b.getState().getCustomUserAttribute()));
                    }
                    fVar3.b.getState().updateVisualUserSteps();
                    fVar3.b.getState().setCurrentView(InstabugCore.getCurrentView());
                }
            }
            f fVar4 = this.b;
            fVar4.d = OnSdkDismissedCallback$DismissType.SUBMIT;
            try {
                State state2 = fVar4.b.getState();
                if (state2 != null) {
                    f.b(this.b, this.a, state2);
                } else {
                    Log.e("LiveBugManager", "State was not created with bug");
                    this.b.b.state = new State.Builder(this.a).build(true);
                }
                InstabugSDKLogger.d("LiveBugManager", "sending bug report to the server");
                if (Instabug.getApplicationContext() != null) {
                    new g(Instabug.getApplicationContext());
                }
            } catch (JSONException e3) {
                InstabugSDKLogger.e("LiveBugManager", "commit bug: ", e3);
            } catch (IOException e4) {
                InstabugSDKLogger.e("LiveBugManager", "IOException while committing bug", e4);
            }
            k0.b.v.a.a.a().b(new a());
        }
    }
}
