package i0.j.f.l;

import com.instabug.library.internal.storage.cache.db.InstabugDBInsertionListener;
import com.instabug.survey.announcements.cache.AnnouncementCacheManager;
import com.instabug.survey.common.userInteractions.UserInteractionCacheManager;
import com.instabug.survey.e.c.a;
import java.util.List;

/* compiled from: AnnouncementManager */
public class e implements InstabugDBInsertionListener<String> {
    public void onDataInserted(Object obj) {
        String str = (String) obj;
        List<a> allAnnouncement = AnnouncementCacheManager.getAllAnnouncement();
        if (allAnnouncement != null && !allAnnouncement.isEmpty()) {
            UserInteractionCacheManager.insertUserInteractions(allAnnouncement, str);
            AnnouncementCacheManager.resetAnnouncementUserInteraction(allAnnouncement);
        }
    }
}
