package i0.j.e.s0;

import android.content.Context;
import com.instabug.library.internal.storage.cache.Cache;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.UserAttributesCacheManager;
import com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributeCacheManager;
import com.instabug.library.migration.AbstractMigration;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import k0.b.l;
import k0.b.m;
import k0.b.n;

/* compiled from: UserAttributeMigration */
public class h extends AbstractMigration {
    public WeakReference<Context> a;

    /* compiled from: UserAttributeMigration */
    public class a implements n<AbstractMigration> {
        public a() {
        }

        public void a(m<AbstractMigration> mVar) {
            WeakReference<Context> weakReference = h.this.a;
            if (weakReference != null && weakReference.get() != null) {
                Objects.requireNonNull(h.this);
                HashMap<String, String> all = UserAttributesCacheManager.getAll();
                if (all != null) {
                    for (Map.Entry next : all.entrySet()) {
                        UserAttributeCacheManager.insert((String) next.getKey(), (String) next.getValue());
                    }
                }
                Cache cache = CacheManager.getInstance().getCache(UserAttributesCacheManager.USER_ATTRIBUTES_MEMORY_CACHE_KEY);
                if (cache != null) {
                    CacheManager.getInstance().deleteCache(cache.getId());
                }
                Cache cache2 = CacheManager.getInstance().getCache(UserAttributesCacheManager.USER_ATTRIBUTES_DISK_CACHE_KEY);
                if (cache2 != null) {
                    CacheManager.getInstance().deleteCache(cache2.getId());
                    CacheManager.getInstance().invalidateCache(cache2);
                }
                ObservableCreate.CreateEmitter createEmitter = (ObservableCreate.CreateEmitter) mVar;
                createEmitter.b(h.this);
                createEmitter.a();
            }
        }
    }

    public h() {
        super("user_attributes_migration");
    }

    public void doAfterMigration() {
        SettingsManager.getInstance().setCurrentSDKVersion("10.4.3");
    }

    public void doPreMigration() {
    }

    public int getMigrationVersion() {
        return 1;
    }

    public void initialize(Context context) {
        this.a = new WeakReference<>(context);
    }

    public l<AbstractMigration> migrate() {
        return RxJavaPlugins.onAssembly(new ObservableCreate(new a()));
    }

    public boolean shouldMigrate() {
        boolean z = UserAttributesCacheManager.getAll() != null;
        InstabugSDKLogger.d(this, "Checking if old cache is existing and it's returning " + z);
        return z;
    }
}
