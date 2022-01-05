package com.instabug.crash;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.instabug.crash.c.a;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.AutoScreenRecordingEventBus;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.internal.storage.operation.WriteStateToFileDiskOperation;
import com.instabug.library.internal.video.InternalAutoScreenRecorderHelper;
import com.instabug.library.internal.video.ScreenRecordingService;
import com.instabug.library.model.Report;
import com.instabug.library.model.State;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.ReportHelper;
import java.io.IOException;
import java.lang.Thread;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InstabugUncaughtExceptionHandler */
public class a implements Thread.UncaughtExceptionHandler {
    public Thread.UncaughtExceptionHandler c = Thread.getDefaultUncaughtExceptionHandler();

    public com.instabug.crash.c.a a(com.instabug.crash.c.a aVar, JSONObject jSONObject, Context context) {
        aVar.q = jSONObject.toString();
        aVar.Y1 = a.C0101a.READY_TO_BE_SENT;
        aVar.Z1 = false;
        if (InstabugCore.getExtraAttachmentFiles() != null && InstabugCore.getExtraAttachmentFiles().size() >= 1) {
            for (Map.Entry next : InstabugCore.getExtraAttachmentFiles().entrySet()) {
                Uri newFileAttachmentUri = AttachmentsUtility.getNewFileAttachmentUri(context, (Uri) next.getKey(), (String) next.getValue());
                if (newFileAttachmentUri != null) {
                    aVar.a(newFileAttachmentUri);
                }
            }
        }
        return aVar;
    }

    public JSONObject b(Thread thread, Throwable th) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("threadName", (Object) thread.getName());
        jSONObject2.put("threadId", thread.getId());
        jSONObject2.put("threadPriority", thread.getPriority());
        jSONObject2.put("threadState", (Object) thread.getState().toString());
        ThreadGroup threadGroup = thread.getThreadGroup();
        if (threadGroup != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("name", (Object) threadGroup.getName());
            jSONObject3.put("maxPriority", threadGroup.getMaxPriority());
            jSONObject3.put("activeCount", threadGroup.activeCount());
            jSONObject2.put("threadGroup", (Object) jSONObject3);
        }
        jSONObject.put("thread", (Object) jSONObject2);
        jSONObject.put("error", (Object) i0.j.c.l.a.r(th, (String) null));
        return jSONObject;
    }

    public void c(Context context, com.instabug.crash.c.a aVar) throws IOException, JSONException {
        aVar.y.setUri(DiskUtils.with(context).writeOperation(new WriteStateToFileDiskOperation(DiskUtils.createStateTextFile(context), aVar.y.toJson())).execute());
        i0.j.c.l.a.H(aVar);
    }

    public void uncaughtException(Thread thread, Throwable th) {
        State state;
        if (InstabugCore.getFeatureState(Feature.CRASH_REPORTING) == Feature.State.DISABLED) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
                return;
            }
            return;
        }
        try {
            InstabugSDKLogger.e("InstabugUncaughtExceptionHandler", "Instabug Caught an Unhandled Exception: " + th.getClass().getCanonicalName(), th);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject = b(thread, th);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Objects.requireNonNull(com.instabug.crash.b.a.a());
            if (InternalAutoScreenRecorderHelper.getInstance().isEnabled() && SettingsManager.getInstance().autoScreenRecordingEnabled()) {
                AutoScreenRecordingEventBus.getInstance().post(ScreenRecordingService.Action.STOP_DELETE);
            }
            if (jSONObject.toString().contains("com.facebook.react.modules")) {
                this.c.uncaughtException(thread, th);
                return;
            }
            Context applicationContext = Instabug.getApplicationContext();
            if (applicationContext == null) {
                InstabugSDKLogger.e("InstabugUncaughtExceptionHandler", "Instabug context is null while persisting crash");
                return;
            }
            State state2 = State.getState(applicationContext);
            com.instabug.crash.c.a aVar = new com.instabug.crash.c.a();
            aVar.c = System.currentTimeMillis() + "";
            aVar.y = state2;
            aVar.a2 = 0;
            aVar.x = new CopyOnWriteArrayList();
            if (InstabugCore.getFeatureState(Feature.REPRO_STEPS) == Feature.State.ENABLED && (state = aVar.y) != null) {
                state.updateVisualUserSteps();
            }
            a(aVar, jSONObject, applicationContext);
            SettingsManager instance = SettingsManager.getInstance();
            Report report = new Report();
            if (instance.getOnReportCreatedListener() != null) {
                instance.getOnReportCreatedListener().onReportCreated(report);
            }
            ReportHelper.update(aVar.y, report);
            AttachmentsUtility.encryptAttachments(aVar.x);
            try {
                c(applicationContext, aVar);
            } catch (JSONException e2) {
                InstabugSDKLogger.e("InstabugUncaughtExceptionHandler", "uncaughtException: " + e2);
            } catch (IOException e3) {
                InstabugSDKLogger.e("InstabugUncaughtExceptionHandler", "uncaughtException: " + e3);
            }
            InstabugSDKLogger.d("InstabugUncaughtExceptionHandler", "Crash persisted for upload at next startup");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.c;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        } catch (OutOfMemoryError e4) {
            Log.e("IB-UnCaughtException", e4.getLocalizedMessage(), e4);
        }
    }
}
