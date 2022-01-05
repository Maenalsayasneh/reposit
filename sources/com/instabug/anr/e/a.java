package com.instabug.anr.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributesDbHelper;
import com.instabug.library.internal.storage.operation.WriteStateToFileDiskOperation;
import com.instabug.library.logging.InstabugLog;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.State;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.ReportHelper;
import com.instabug.library.util.memory.MemoryUtils;
import com.instabug.library.util.threading.ThreadUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: Anr */
public class a {
    public String a;
    public String b;
    public String c;
    public List<Attachment> d;
    public int e;
    public String f;
    public State g;
    public String h;

    /* renamed from: com.instabug.anr.e.a$a  reason: collision with other inner class name */
    /* compiled from: Anr */
    public static class C0091a {
        public a a(String str, String str2) throws JSONException, IOException {
            Context applicationContext = Instabug.getApplicationContext();
            if (applicationContext == null) {
                InstabugSDKLogger.e(this, "Couldn't create a new instance of ANR due to a null context.");
                return null;
            }
            a aVar = new a(applicationContext, ThreadUtils.getMainThreadData(str).toString(), ThreadUtils.getThreadsData().toString(), str2);
            if (aVar.g != null) {
                Context applicationContext2 = Instabug.getApplicationContext();
                if (applicationContext2 != null && !MemoryUtils.isLowMemory(applicationContext2) && InstabugCore.getFeatureState(Feature.USER_EVENTS) == Feature.State.ENABLED) {
                    try {
                        aVar.g.updateUserEvents();
                    } catch (JSONException e) {
                        InstabugSDKLogger.e(this, "Got error while parsing user events logs", e);
                    }
                }
                if (SettingsManager.getInstance().getOnReportCreatedListener() == null) {
                    aVar.g.setTags(InstabugCore.getTagsAsString());
                    aVar.g.updateConsoleLog();
                    Feature.State featureState = InstabugCore.getFeatureState(Feature.USER_DATA);
                    Feature.State state = Feature.State.ENABLED;
                    if (featureState == state) {
                        aVar.g.setUserData(InstabugCore.getUserData());
                    }
                    if (InstabugCore.getFeatureState(Feature.INSTABUG_LOGS) == state) {
                        aVar.g.setInstabugLog(InstabugLog.getLogs());
                    }
                }
                if (!InstabugCore.isFeatureAvailable(Feature.REPORT_PHONE_NUMBER) || aVar.g.getCustomUserAttribute() == null) {
                    aVar.g.setUserAttributes(UserAttributesDbHelper.getSDKUserAttributes());
                } else {
                    State state2 = aVar.g;
                    state2.setUserAttributes(UserAttributesDbHelper.getSDKUserAttributesAndAppendToIt("IBG_phone_number", state2.getCustomUserAttribute()));
                }
                aVar.g.updateVisualUserSteps();
                aVar.g.setUri(DiskUtils.with(applicationContext).writeOperation(new WriteStateToFileDiskOperation(DiskUtils.createStateTextFile(applicationContext), aVar.g.toJson())).execute());
                ReportHelper.update(aVar.g, ReportHelper.getReport(InstabugCore.getOnReportCreatedListener()));
            }
            if (InstabugCore.getExtraAttachmentFiles() != null && InstabugCore.getExtraAttachmentFiles().size() >= 1) {
                for (Map.Entry next : InstabugCore.getExtraAttachmentFiles().entrySet()) {
                    Uri newFileAttachmentUri = AttachmentsUtility.getNewFileAttachmentUri(applicationContext, (Uri) next.getKey(), (String) next.getValue());
                    if (newFileAttachmentUri != null) {
                        Attachment.Type type = Attachment.Type.ATTACHMENT_FILE;
                        Attachment attachment = new Attachment();
                        if (newFileAttachmentUri.getLastPathSegment() != null) {
                            attachment.setName(newFileAttachmentUri.getLastPathSegment());
                        }
                        if (newFileAttachmentUri.getPath() != null) {
                            attachment.setLocalPath(newFileAttachmentUri.getPath());
                        }
                        attachment.setType(type);
                        if (type == Attachment.Type.VISUAL_USER_STEPS) {
                            attachment.setEncrypted(true);
                        }
                        aVar.d.add(attachment);
                    }
                }
            }
            return aVar;
        }
    }

    @SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
    public a() {
    }

    public a(Context context, String str, String str2, String str3) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        State state = State.getState(context);
        this.a = valueOf;
        this.g = state;
        this.b = str;
        this.c = str2;
        this.d = new ArrayList();
        this.d = new ArrayList();
        this.h = str3;
    }
}
