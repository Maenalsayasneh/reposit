package i0.j.d.h.c;

import com.instabug.featuresrequest.d.a;
import com.instabug.library.internal.storage.cache.AssetsCacheManager;
import com.instabug.library.model.AssetEntity;
import com.instabug.library.util.InstabugSDKLogger;

/* compiled from: TimelineAdapter */
public class e implements AssetsCacheManager.OnDownloadFinished {
    public final /* synthetic */ a a;
    public final /* synthetic */ d b;

    public e(d dVar, a aVar) {
        this.b = dVar;
        this.a = aVar;
    }

    public void onFailed(Throwable th) {
        InstabugSDKLogger.e("TimelineAdapter", "Asset Entity downloading got error", th);
    }

    public void onSuccess(AssetEntity assetEntity) {
        StringBuilder P0 = i0.d.a.a.a.P0("Asset Entity downloaded: ");
        P0.append(assetEntity.getFile().getPath());
        InstabugSDKLogger.d("TimelineAdapter", P0.toString());
        this.a.c2 = assetEntity.getFile().getAbsolutePath();
        if (!assetEntity.getFile().exists()) {
            InstabugSDKLogger.w("TimelineAdapter", "Asset Entity downloading got FileNotFoundException error");
        }
        this.b.notifyDataSetChanged();
    }
}
