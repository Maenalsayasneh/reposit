package i0.j.e.l0.k.a;

import com.instabug.library.internal.storage.cache.AssetsCacheManager;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.model.AssetEntity;
import com.instabug.library.util.InstabugSDKLogger;

/* compiled from: AssetCache */
public class a extends InMemoryCache<String, AssetEntity> {
    public a(String str) {
        super(str);
    }

    public void invalidate() {
        for (AssetEntity assetEntity : getValues()) {
            StringBuilder P0 = i0.d.a.a.a.P0("Delete file: ");
            P0.append(assetEntity.getFile().getPath());
            P0.append(InstabugDbContract.COMMA_SEP);
            P0.append(assetEntity.getFile().delete());
            InstabugSDKLogger.d(AssetsCacheManager.class, P0.toString());
        }
        super.invalidate();
    }
}
