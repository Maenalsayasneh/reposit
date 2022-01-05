package com.instabug.crash;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.core.app.InstabugBackgroundService;
import com.instabug.crash.c.a;
import com.instabug.crash.network.InstabugCrashesUploaderService;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.analytics.AnalyticsWrapper;
import com.instabug.library.apichecker.APIChecker;
import com.instabug.library.apichecker.VoidRunnable;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.AutoScreenRecordingEventBus;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventPublisher;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.internal.storage.operation.WriteStateToFileDiskOperation;
import com.instabug.library.internal.video.InternalAutoScreenRecorderHelper;
import com.instabug.library.internal.video.ScreenRecordingService;
import com.instabug.library.model.Report;
import com.instabug.library.model.State;
import com.instabug.library.model.UserAttributes;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.ReportHelper;
import com.instabug.library.util.threading.PoolProvider;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class CrashReporting {
    private static final String TAG = "CrashReporting";

    public static class a implements VoidRunnable {
        public final /* synthetic */ Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public void run() {
            if (this.a != null && InstabugCore.getFeatureState(Feature.CRASH_REPORTING) != Feature.State.DISABLED) {
                CrashReporting.createFormattedException(this.a, (String) null);
            }
        }
    }

    public static class b implements Runnable {
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ Map q;

        public b(JSONObject jSONObject, boolean z, Map map) {
            this.c = jSONObject;
            this.d = z;
            this.q = map;
        }

        public void run() {
            Context applicationContext = Instabug.getApplicationContext();
            if (applicationContext != null) {
                State state = State.getState(applicationContext);
                Report report = ReportHelper.getReport(InstabugCore.getOnReportCreatedListener());
                com.instabug.crash.c.a crash = CrashReporting.getCrash(this.c, this.d, state);
                ReportHelper.update(crash.y, report);
                Map map = this.q;
                if (map != null && !map.isEmpty()) {
                    CrashReporting.appendUserAttributes(state, this.q);
                }
                if (InstabugCore.getExtraAttachmentFiles() != null && InstabugCore.getExtraAttachmentFiles().size() >= 1) {
                    CrashReporting.addCrashAttachments(applicationContext, crash);
                }
                CrashReporting.createStateTextFile(applicationContext, crash, DiskUtils.createStateTextFile(applicationContext));
                i0.j.c.l.a.H(crash);
                InstabugSDKLogger.d(CrashReporting.TAG, "ReportCaughtException: Your exception has been reported");
                Intent intent = new Intent(applicationContext, InstabugCrashesUploaderService.class);
                int i = InstabugCrashesUploaderService.c;
                InstabugBackgroundService.enqueueInstabugWork(applicationContext, InstabugCrashesUploaderService.class, 2582, intent);
                Objects.requireNonNull(com.instabug.crash.b.a.a());
                InternalAutoScreenRecorderHelper.getInstance().start();
            }
        }
    }

    public static class c implements VoidRunnable {
        public final /* synthetic */ Throwable a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;

        public c(Throwable th, String str, Map map) {
            this.a = th;
            this.b = str;
            this.c = map;
        }

        public void run() {
            if (this.a != null && InstabugCore.getFeatureState(Feature.CRASH_REPORTING) != Feature.State.DISABLED) {
                CrashReporting.createFormattedException(this.a, this.b, this.c);
            }
        }
    }

    public static class d implements VoidRunnable {
        public final /* synthetic */ Feature.State a;

        public d(Feature.State state) {
            this.a = state;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("CrashReporting.setState", i0.d.a.a.a.O("state", Feature.State.class).setValue(this.a));
            InstabugCore.setFeatureState(Feature.CRASH_REPORTING, this.a);
            SDKCoreEventPublisher.post(new SDKCoreEvent(SDKCoreEvent.Feature.TYPE_FEATURES, SDKCoreEvent.Feature.VALUE_UPDATED));
        }
    }

    public static class e implements VoidRunnable {
        public final /* synthetic */ Feature.State a;

        public e(Feature.State state) {
            this.a = state;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("CrashReporting.setAnrState", i0.d.a.a.a.O("state", Feature.State.class).setValue(this.a));
            if (this.a == Feature.State.ENABLED && InstabugCore.getFeatureState(Feature.CRASH_REPORTING) == Feature.State.DISABLED) {
                InstabugSDKLogger.w(CrashReporting.TAG, "Can not enable ANR reporting while Crash reporting is disabled");
                return;
            }
            InstabugCore.setFeatureState(Feature.ANR_REPORTING, this.a);
            SDKCoreEventPublisher.post(new SDKCoreEvent(SDKCoreEvent.Feature.TYPE_FEATURES, SDKCoreEvent.Feature.VALUE_UPDATED));
        }
    }

    public static void addCrashAttachments(Context context, com.instabug.crash.c.a aVar) {
        if (context != null && aVar != null && InstabugCore.getExtraAttachmentFiles() != null) {
            for (Map.Entry next : InstabugCore.getExtraAttachmentFiles().entrySet()) {
                Uri newFileAttachmentUri = AttachmentsUtility.getNewFileAttachmentUri(context, (Uri) next.getKey(), (String) next.getValue());
                if (newFileAttachmentUri != null) {
                    aVar.a(newFileAttachmentUri);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static void appendUserAttributes(State state, Map<String, String> map) {
        UserAttributes userAttributes = new UserAttributes();
        try {
            if (state.getUserAttributes() != null) {
                JSONObject jSONObject = new JSONObject(state.getUserAttributes());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    userAttributes.put(next, jSONObject.getString(next));
                }
            }
        } catch (JSONException e2) {
            InstabugSDKLogger.e(e2, e2.toString());
        }
        if (map.size() > 100) {
            Log.w("Instabug-CrashReporting", "Some old user attributes were removed. Max allowed user attributes reached. Please note that you can add up to " + 100 + " user attributes.");
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            for (Map.Entry<String, String> key : map.entrySet()) {
                linkedHashMap.remove(key.getKey());
                if (linkedHashMap.size() <= 100) {
                    break;
                }
            }
            map.clear();
            map.putAll(linkedHashMap);
        }
        for (Map.Entry next2 : map.entrySet()) {
            if (map.get(next2.getKey()) != null) {
                if (((String) next2.getKey()).length() > 90 || ((String) next2.getValue()).length() > 90) {
                    Log.w("Instabug-CrashReporting", "Some user attributes weren't added. Max allowed user attributes characters limit is reached. Please note that you can add user attributes (key, value) with characters count up to " + 90 + " characters.");
                } else {
                    userAttributes.put((String) next2.getKey(), (String) next2.getValue());
                }
            }
        }
        state.setUserAttributes(userAttributes.toString());
    }

    /* access modifiers changed from: private */
    public static void createFormattedException(Throwable th, String str) {
        createFormattedException(th, str, (Map<String, String>) null);
    }

    /* access modifiers changed from: private */
    public static void createStateTextFile(Context context, com.instabug.crash.c.a aVar, File file) {
        if (file != null && aVar != null && aVar.y != null) {
            try {
                Uri execute = DiskUtils.with(context).writeOperation(new WriteStateToFileDiskOperation(file, aVar.y.toJson())).execute();
                if (execute != null) {
                    aVar.y.setUri(execute);
                }
                AttachmentsUtility.encryptAttachments(aVar.x);
            } catch (Throwable th) {
                InstabugSDKLogger.e(TAG, "error while creating state text file", th);
            }
        }
    }

    public static void deleteAutoScreenRecording() {
        AutoScreenRecordingEventBus.getInstance().post(ScreenRecordingService.Action.STOP_DELETE);
    }

    public static com.instabug.crash.c.a getCrash(JSONObject jSONObject, boolean z, State state) {
        State state2;
        com.instabug.crash.c.a aVar = new com.instabug.crash.c.a();
        aVar.c = System.currentTimeMillis() + "";
        aVar.y = state;
        aVar.a2 = 0;
        aVar.x = new CopyOnWriteArrayList();
        if (InstabugCore.getFeatureState(Feature.REPRO_STEPS) == Feature.State.ENABLED && (state2 = aVar.y) != null) {
            state2.updateVisualUserSteps();
        }
        aVar.q = jSONObject.toString();
        aVar.Y1 = a.C0101a.READY_TO_BE_SENT;
        aVar.Z1 = z;
        return aVar;
    }

    private static void reportCrashingSession() {
        SDKCoreEventPublisher.post(new SDKCoreEvent("cross_platform_crashed"));
    }

    public static void reportException(Throwable th) {
        APIChecker.checkAndRun("CrashReporting.reportException", new a(th));
    }

    private static void reportUncaughtException(JSONObject jSONObject) {
        if (jSONObject != null) {
            reportException(jSONObject, false);
        }
    }

    public static void setAnrState(Feature.State state) {
        APIChecker.checkAndRun("setAnrState", new e(state));
    }

    public static void setState(Feature.State state) {
        APIChecker.checkAndRun("CrashReporting.setState", new d(state));
    }

    /* access modifiers changed from: private */
    public static void createFormattedException(Throwable th, String str, Map<String, String> map) {
        if (th != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error", (Object) i0.j.c.l.a.r(th, str));
                reportException(jSONObject, true, map);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    private static void reportException(JSONObject jSONObject, boolean z) {
        reportException(jSONObject, z, (Map<String, String>) null);
    }

    private static void reportException(JSONObject jSONObject, boolean z, Map<String, String> map) {
        if (jSONObject != null) {
            if (InstabugCore.getPlatform() != 2 && !z) {
                reportCrashingSession();
            }
            if (InstabugCore.getFeatureState(Feature.CRASH_REPORTING) != Feature.State.DISABLED) {
                Objects.requireNonNull(com.instabug.crash.b.a.a());
                if (InternalAutoScreenRecorderHelper.getInstance().isEnabled() && SettingsManager.getInstance().autoScreenRecordingEnabled()) {
                    deleteAutoScreenRecording();
                }
                PoolProvider.postIOTask(new b(jSONObject, z, map));
            }
        }
    }

    public static void reportException(Throwable th, String str) {
        reportException(th, str, (Map<String, String>) null);
    }

    public static void reportException(Throwable th, String str, Map<String, String> map) {
        APIChecker.checkAndRun("CrashReporting.reportException", new c(th, str, map));
    }
}
