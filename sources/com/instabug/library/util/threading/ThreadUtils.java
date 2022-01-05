package com.instabug.library.util.threading;

import android.os.Looper;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ThreadUtils {
    private static final String TAG = "ThreadUtils";

    public static String buildStackTraceFromElements(StackTraceElement[] stackTraceElementArr, String str) {
        StringBuilder S0 = a.S0(str, "\n");
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            S0.append("\t at ");
            S0.append(stackTraceElement.toString());
            S0.append("\n");
        }
        return S0.toString();
    }

    public static JSONObject getMainThreadData(String str) throws JSONException {
        JSONObject threadData = getThreadData(Looper.getMainLooper().getThread());
        threadData.put("error", (Object) getStackTraceAsError(Looper.getMainLooper().getThread(), str));
        return threadData;
    }

    private static String getMainThreadStackTrace(String str) {
        return buildStackTraceFromElements(Looper.getMainLooper().getThread().getStackTrace(), str);
    }

    private static JSONObject getStackTraceAsError(Thread thread, String str) {
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("name", (Object) "ANRError: Application Not Responding for at least 5000 ms.\n");
                jSONObject.put("exception", (Object) str);
            } catch (JSONException e) {
                InstabugSDKLogger.e(TAG, e.getMessage() != null ? e.getMessage() : "Json exception while creating formatted exception", e);
            }
        }
        StackTraceElement stackTraceElement = null;
        thread.getStackTrace();
        if (thread.getStackTrace().length > 0) {
            stackTraceElement = thread.getStackTrace()[0];
        }
        if (!(stackTraceElement == null || stackTraceElement.getFileName() == null)) {
            jSONObject.put("location", (Object) stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber());
        }
        if (str == null) {
            str = "";
        }
        jSONObject.put("stackTrace", (Object) getMainThreadStackTrace(str));
        return jSONObject;
    }

    private static JSONObject getThreadData(Thread thread) throws JSONException {
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
        return jSONObject;
    }

    public static JSONArray getThreadsData() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Thread threadData : Thread.getAllStackTraces().keySet()) {
            jSONArray.put((Object) getThreadData(threadData));
        }
        return jSONArray;
    }

    public static boolean isCurrentThreadMain() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
