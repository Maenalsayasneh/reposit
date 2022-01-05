package i0.j.f.b.c.a;

import android.content.Context;
import android.content.Intent;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.ui.BasePresenter;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.TimeUtils;
import com.instabug.survey.announcements.cache.AnnouncementCacheManager;
import com.instabug.survey.announcements.network.InstabugAnnouncementSubmitterService;
import com.instabug.survey.callbacks.OnFinishCallback;
import com.instabug.survey.models.State;
import com.instabug.survey.ui.f;
import h0.o.a.k;
import i0.j.e.c1.b;
import org.json.JSONException;

/* compiled from: AnnouncementPresenter */
public class c extends BasePresenter<b> {

    /* compiled from: AnnouncementPresenter */
    public class a implements Runnable {
        public final /* synthetic */ com.instabug.survey.e.c.a c;
        public final /* synthetic */ b d;

        public a(com.instabug.survey.e.c.a aVar, b bVar) {
            this.c = aVar;
            this.d = bVar;
        }

        public void run() {
            if (this.c.q == 100) {
                AnnouncementCacheManager.deleteAnnouncementAssets();
            }
            InstabugAnnouncementSubmitterService.a((Context) this.d.getViewContext(), new Intent((Context) this.d.getViewContext(), InstabugAnnouncementSubmitterService.class));
            this.d.j(false);
        }
    }

    public c(b bVar) {
        super(bVar);
    }

    public final void k(com.instabug.survey.e.c.a aVar, String str) {
        int i = i0.j.f.o.c.b;
        OnFinishCallback onFinishCallback = i0.j.f.o.a.a().f;
        if (onFinishCallback != null) {
            try {
                onFinishCallback.onFinish(Long.toString(aVar.c), State.SUBMITTED, b.d(aVar, str));
            } catch (JSONException e) {
                InstabugSDKLogger.e(this, "Something went wrong during parsing Announcement object in onFinishCallback", e);
            }
        }
    }

    public void l(boolean z) {
        k kVar;
        b bVar = (b) this.view.get();
        if (bVar != null && bVar.getViewContext() != null && (kVar = (k) bVar.getViewContext()) != null) {
            int a2 = b.a(kVar, f.SECONDARY);
            if (z) {
                bVar.e(a2);
            } else {
                bVar.k(a2);
            }
        }
    }

    public final void m(com.instabug.survey.e.c.a aVar) {
        AnnouncementCacheManager.updateAnnouncement(aVar);
        if (i0.j.f.l.i.b.a() != null) {
            i0.j.f.l.i.b a2 = i0.j.f.l.i.b.a();
            a2.c.putLong("last_announcement_time", TimeUtils.currentTimeMillis());
            a2.c.apply();
        }
        b bVar = (b) this.view.get();
        if (bVar != null && bVar.getViewContext() != null) {
            InstabugCore.doOnBackground(new a(aVar, bVar));
        }
    }
}
