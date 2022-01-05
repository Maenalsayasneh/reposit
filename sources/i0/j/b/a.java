package i0.j.b;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.InstabugBackgroundService;
import com.instabug.bug.network.InstabugBugsUploaderService;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import org.json.JSONException;

/* compiled from: CoreEventsHandler */
public final class a implements Runnable {
    public final /* synthetic */ Context c;

    public a(Context context) {
        this.c = context;
    }

    public void run() {
        try {
            if (!((ArrayList) i0.j.b.k.a.a(this.c)).isEmpty() && NetworkManager.isOnline(this.c)) {
                Context context = this.c;
                Intent intent = new Intent(this.c, InstabugBugsUploaderService.class);
                int i = InstabugBugsUploaderService.c;
                InstabugBackgroundService.enqueueInstabugWork(context, InstabugBugsUploaderService.class, 2580, intent);
            }
        } catch (JSONException e) {
            StringBuilder P0 = i0.d.a.a.a.P0("Error occurred during Bugs retrieval from DB: ");
            P0.append(e.getMessage());
            InstabugSDKLogger.e("Bug/CoreEventsHandler", P0.toString());
        }
    }
}
