package i0.j.f.l;

import com.instabug.library.user.UserManagerWrapper;
import com.instabug.survey.announcements.cache.AnnouncementCacheManager;
import com.instabug.survey.common.userInteractions.UserInteractionCacheManager;
import com.instabug.survey.e.c.a;
import com.instabug.survey.f.c.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: AnnouncementManager */
public class f implements Runnable {
    public final /* synthetic */ g c;

    public f(g gVar) {
        this.c = gVar;
    }

    public void run() {
        List<a> allAnnouncement = AnnouncementCacheManager.getAllAnnouncement();
        if (allAnnouncement != null && !allAnnouncement.isEmpty()) {
            Objects.requireNonNull(this.c);
            String userUUID = UserManagerWrapper.getUserUUID();
            ArrayList arrayList = new ArrayList();
            for (a next : allAnnouncement) {
                i retrieveUserInteraction = UserInteractionCacheManager.retrieveUserInteraction(next.c, userUUID, 1);
                if (retrieveUserInteraction != null) {
                    next.a2 = retrieveUserInteraction;
                    arrayList.add(next);
                }
            }
            if (!allAnnouncement.isEmpty()) {
                AnnouncementCacheManager.updateBulk(arrayList);
            }
        }
    }
}
