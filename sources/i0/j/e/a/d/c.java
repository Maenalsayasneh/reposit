package i0.j.e.a.d;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.InstabugBackgroundService;
import com.instabug.library.Instabug;
import com.instabug.library.analytics.network.InstabugAnalyticsUploaderService;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import org.json.JSONException;

/* compiled from: UploaderServiceLauncher */
public final class c implements Runnable {
    public final /* synthetic */ Context c;

    public c(Context context) {
        this.c = context;
    }

    public void run() {
        try {
            if (!a.d().isEmpty() && NetworkManager.isOnline(this.c) && Instabug.getApplicationContext() != null) {
                Context applicationContext = Instabug.getApplicationContext();
                Intent intent = new Intent(Instabug.getApplicationContext(), InstabugAnalyticsUploaderService.class);
                int i = InstabugAnalyticsUploaderService.c;
                InstabugBackgroundService.enqueueInstabugWork(applicationContext, InstabugAnalyticsUploaderService.class, 2592, intent);
            }
        } catch (JSONException e) {
            StringBuilder P0 = a.P0("Error occurred during Analytics retrieval from DB: ");
            P0.append(e.getMessage());
            InstabugSDKLogger.e("UploaderServiceLauncher", P0.toString());
        }
    }
}
