package androidx.core.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.JobIntentService;
import com.instabug.library.Instabug;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import java.util.Random;

@SuppressLint({"ERADICATE_FIELD_NOT_NULLABLE"})
public abstract class InstabugBackgroundService extends JobIntentService {
    private static Random random = new Random();

    public static void enqueueInstabugWork(Context context, Class cls, int i, Intent intent) {
        try {
            JobIntentService.enqueueWork(context, (Class<?>) cls, i, intent);
        } catch (IllegalArgumentException | SecurityException e) {
            InstabugSDKLogger.e(InstabugBackgroundService.class, e.getMessage());
            InstabugSDKLogger.v(InstabugBackgroundService.class, "Trying random JobID");
            e.printStackTrace();
            try {
                JobIntentService.enqueueWork(context, (Class<?>) cls, random.nextInt(), intent);
            } catch (IllegalArgumentException | SecurityException e2) {
                InstabugSDKLogger.e(InstabugBackgroundService.class, e2.getMessage());
                e2.printStackTrace();
                InstabugSDKLogger.e(InstabugBackgroundService.class, "Trying random JobID FAILED, Failing silently");
            } catch (Exception e3) {
                InstabugSDKLogger.e(InstabugBackgroundService.class, e3.getMessage());
                e3.printStackTrace();
                InstabugSDKLogger.v(InstabugBackgroundService.class, "job destroyed");
            }
        } catch (Exception e4) {
            InstabugSDKLogger.e(InstabugBackgroundService.class, e4.getMessage());
            InstabugSDKLogger.v(InstabugBackgroundService.class, "job destroyed");
        }
    }

    public JobIntentService.e dequeueWork() {
        try {
            return super.dequeueWork();
        } catch (Exception e) {
            InstabugSDKLogger.e(this, "Dequeue Work Error", e);
            return null;
        }
    }

    public abstract boolean mustHaveNetworkConnection();

    public void onCreate() {
        super.onCreate();
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mJobImpl = new IBGJobIntentServiceImp(this);
            } else {
                this.mJobImpl = null;
            }
            InstabugSDKLogger.v(this, "New " + getClass().getSimpleName() + " created");
        } catch (OutOfMemoryError e) {
            StringBuilder P0 = a.P0("An OutOfMemoryError occurred while doing ");
            P0.append(getClass().getSimpleName());
            P0.append("'s required task ");
            P0.append(e.getMessage());
            InstabugSDKLogger.e(this, P0.toString(), e);
        } catch (Exception e2) {
            StringBuilder P02 = a.P0("An error occurred while doing ");
            P02.append(getClass().getSimpleName());
            P02.append("'s required task ");
            P02.append(e2.getMessage());
            InstabugSDKLogger.e(this, P02.toString(), e2);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        InstabugSDKLogger.v(this, getClass().getSimpleName() + " destroyed");
    }

    public void onHandleWork(Intent intent) {
        InstabugSDKLogger.v(this, getClass().getSimpleName() + " started with intent " + intent);
        if (Instabug.isEnabled() && mustHaveNetworkConnection() && NetworkManager.isOnline(this)) {
            InstabugSDKLogger.v(this, "Internet is good to go");
            try {
                InstabugSDKLogger.v(this, "Starting " + getClass().getSimpleName() + " task");
                runBackgroundTask();
            } catch (OutOfMemoryError e) {
                StringBuilder P0 = a.P0("An OutOfMemoryError occurred while doing ");
                P0.append(getClass().getSimpleName());
                P0.append("'s required task ");
                P0.append(e.getMessage());
                InstabugSDKLogger.e(this, P0.toString(), e);
            } catch (Exception e2) {
                StringBuilder P02 = a.P0("An error occurred while doing ");
                P02.append(getClass().getSimpleName());
                P02.append("'s required task ");
                P02.append(e2.getMessage());
                InstabugSDKLogger.e(this, P02.toString(), e2);
            }
        }
    }

    public abstract void runBackgroundTask() throws Exception;
}
