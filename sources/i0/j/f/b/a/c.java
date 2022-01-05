package i0.j.f.b.a;

import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.cache.AssetsCacheManager;
import com.instabug.library.model.AssetEntity;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.announcements.cache.AnnouncementCacheManager;
import com.instabug.survey.e.c.e;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.plugins.RxJavaPlugins;
import k0.b.m;
import k0.b.n;

/* compiled from: NewFeaturesAssetsHelper */
public final class c implements n<AssetEntity> {
    public final /* synthetic */ e a;
    public final /* synthetic */ long b;

    /* compiled from: NewFeaturesAssetsHelper */
    public class a implements AssetsCacheManager.OnDownloadFinished {
        public final /* synthetic */ m a;

        /* renamed from: i0.j.f.b.a.c$a$a  reason: collision with other inner class name */
        /* compiled from: NewFeaturesAssetsHelper */
        public class C0188a implements Runnable {
            public final /* synthetic */ AssetEntity c;

            public C0188a(AssetEntity assetEntity) {
                this.c = assetEntity;
            }

            public void run() {
                c cVar = c.this;
                AnnouncementCacheManager.insertAnnouncementAsset(cVar.b, cVar.a.c, this.c.getFile().getPath());
                ((ObservableCreate.CreateEmitter) a.this.a).b(this.c);
                ((ObservableCreate.CreateEmitter) a.this.a).a();
            }
        }

        public a(m mVar) {
            this.a = mVar;
        }

        public void onFailed(Throwable th) {
            if (((ObservableCreate.CreateEmitter) this.a).isDisposed()) {
                InstabugSDKLogger.e(d.class, "Assets Request got error: " + th);
            } else if (!((ObservableCreate.CreateEmitter) this.a).c(th)) {
                RxJavaPlugins.onError(th);
            }
        }

        public void onSuccess(AssetEntity assetEntity) {
            InstabugCore.doOnBackground(new C0188a(assetEntity));
        }
    }

    public c(e eVar, long j) {
        this.a = eVar;
        this.b = j;
    }

    public void a(m<AssetEntity> mVar) {
        if (Instabug.getApplicationContext() != null) {
            AssetsCacheManager.getAssetEntity(Instabug.getApplicationContext(), AssetsCacheManager.createEmptyEntity(Instabug.getApplicationContext(), this.a.x, AssetEntity.AssetType.IMAGE), new a(mVar));
        }
    }
}
