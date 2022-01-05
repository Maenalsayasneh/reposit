package i0.j.f.b.b;

import com.instabug.library.network.Request;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.announcements.cache.AnnouncementCacheManager;
import com.instabug.survey.f.c.f;
import com.instabug.survey.f.c.i;

/* compiled from: InstabugAnnouncementSubmitterService */
public class a implements Request.Callbacks<Boolean, Throwable> {
    public final /* synthetic */ com.instabug.survey.e.c.a a;

    public a(com.instabug.survey.e.c.a aVar) {
        this.a = aVar;
    }

    public void onFailed(Object obj) {
        Throwable th = (Throwable) obj;
        InstabugSDKLogger.e(this, th.getMessage(), th);
    }

    public void onSucceeded(Object obj) {
        Boolean bool = (Boolean) obj;
        com.instabug.survey.e.c.a aVar = this.a;
        f fVar = f.SYNCED;
        i iVar = aVar.a2;
        iVar.g2 = fVar;
        iVar.q.x.clear();
        AnnouncementCacheManager.updateAnnouncement(this.a);
    }
}
