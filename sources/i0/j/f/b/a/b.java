package i0.j.f.b.a;

import com.instabug.library.model.AssetEntity;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import com.instabug.survey.announcements.cache.AnnouncementCacheManager;

/* compiled from: NewFeaturesAssetsHelper */
public final class b extends k0.b.b0.b<AssetEntity> {
    public final /* synthetic */ com.instabug.survey.e.c.a d;

    /* compiled from: NewFeaturesAssetsHelper */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            AnnouncementCacheManager.updateAnnouncement(b.this.d);
        }
    }

    /* renamed from: i0.j.f.b.a.b$b  reason: collision with other inner class name */
    /* compiled from: NewFeaturesAssetsHelper */
    public class C0187b implements Runnable {
        public C0187b() {
        }

        public void run() {
            AnnouncementCacheManager.updateAnnouncement(b.this.d);
        }
    }

    public b(com.instabug.survey.e.c.a aVar) {
        this.d = aVar;
    }

    public void b(Object obj) {
        AssetEntity assetEntity = (AssetEntity) obj;
        StringBuilder P0 = i0.d.a.a.a.P0("downloading announcement ");
        P0.append(this.d.c);
        P0.append(" asset started");
        InstabugSDKLogger.d(this, P0.toString());
    }

    public void onComplete() {
        StringBuilder P0 = i0.d.a.a.a.P0("downloading announcement ");
        P0.append(this.d.c);
        P0.append(" assets completed");
        InstabugSDKLogger.d(this, P0.toString());
        this.d.Y1 = 1;
        PoolProvider.postIOTask(new C0187b());
    }

    public void onError(Throwable th) {
        StringBuilder P0 = i0.d.a.a.a.P0("downloading announcement ");
        P0.append(this.d.c);
        P0.append(" assets failed");
        InstabugSDKLogger.d(this, P0.toString());
        this.d.Y1 = 2;
        PoolProvider.postIOTask(new a());
    }
}
