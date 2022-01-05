package i0.j.c;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.InstabugBackgroundService;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.e.b;
import com.instabug.chat.network.InstabugMessageUploaderService;
import com.instabug.library.network.NetworkManager;
import java.util.List;

/* compiled from: CoreEventsHandler */
public final class d implements Runnable {
    public final /* synthetic */ Context c;

    public d(Context context) {
        this.c = context;
    }

    public void run() {
        List<b> offlineChats = ChatsCacheManager.getOfflineChats();
        if (offlineChats != null && !offlineChats.isEmpty() && NetworkManager.isOnline(this.c)) {
            Context context = this.c;
            Intent intent = new Intent(this.c, InstabugMessageUploaderService.class);
            int i = InstabugMessageUploaderService.c;
            InstabugBackgroundService.enqueueInstabugWork(context, InstabugMessageUploaderService.class, 2577, intent);
        }
    }
}
