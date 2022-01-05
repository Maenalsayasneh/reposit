package i0.j.f.l;

import android.content.Intent;
import com.instabug.library.network.NetworkManager;
import com.instabug.survey.announcements.cache.AnnouncementCacheManager;
import com.instabug.survey.announcements.network.InstabugAnnouncementSubmitterService;
import java.util.List;

/* compiled from: AnnouncementManager */
public class a implements Runnable {
    public final /* synthetic */ g c;

    public a(g gVar) {
        this.c = gVar;
    }

    public void run() {
        List<com.instabug.survey.e.c.a> readyToBeSend = AnnouncementCacheManager.getReadyToBeSend();
        if (readyToBeSend != null && !readyToBeSend.isEmpty() && NetworkManager.isOnline(this.c.b)) {
            InstabugAnnouncementSubmitterService.a(this.c.b, new Intent(this.c.b, InstabugAnnouncementSubmitterService.class));
        }
    }
}
