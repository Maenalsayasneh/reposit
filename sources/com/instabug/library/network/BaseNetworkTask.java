package com.instabug.library.network;

import android.content.Context;
import android.os.AsyncTask;
import com.instabug.library.util.InstabugSDKLogger;

public abstract class BaseNetworkTask {
    public static final String TAG = "BaseNetworkTask";
    /* access modifiers changed from: private */
    public Context context;
    private a taskProcessor;

    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        public Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            InstabugSDKLogger.d(BaseNetworkTask.TAG, a.class.getSimpleName() + " started network task ");
            if (!NetworkManager.isOnline(BaseNetworkTask.this.context)) {
                return null;
            }
            InstabugSDKLogger.d(BaseNetworkTask.TAG, "Internet is good to go");
            try {
                BaseNetworkTask.this.onHandleTask();
                return null;
            } catch (Exception e) {
                StringBuilder P0 = i0.d.a.a.a.P0("An error occurred while doing ");
                P0.append(a.class.getSimpleName());
                P0.append("'s required task ");
                P0.append(e.getMessage());
                InstabugSDKLogger.e(BaseNetworkTask.TAG, P0.toString(), e);
                return null;
            }
        }

        public void onCancelled() {
            super.onCancelled();
            InstabugSDKLogger.v(BaseNetworkTask.TAG, a.class.getSimpleName() + " cancelled");
            BaseNetworkTask.this.onTaskCancelled();
        }

        public void onPostExecute(Object obj) {
            super.onPostExecute((Void) obj);
            InstabugSDKLogger.v(BaseNetworkTask.TAG, a.class.getSimpleName() + " finished");
            BaseNetworkTask.this.onTaskFinished();
        }
    }

    public BaseNetworkTask(Context context2) {
        this.context = context2;
        if (this.taskProcessor == null) {
            a aVar = new a();
            this.taskProcessor = aVar;
            aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public Context getContext() {
        return this.context;
    }

    public abstract void onHandleTask() throws Exception;

    public abstract void onTaskCancelled();

    public abstract void onTaskFinished();
}
