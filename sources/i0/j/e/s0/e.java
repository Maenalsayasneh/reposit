package i0.j.e.s0;

import android.content.Context;
import com.instabug.library.analytics.AnalyticsWrapper;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.migration.AbstractMigration;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.StringUtility;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.plugins.RxJavaPlugins;
import k0.b.l;
import k0.b.m;
import k0.b.n;

/* compiled from: SDKAnalyticsMigration */
public class e extends AbstractMigration {
    public Context a;

    /* compiled from: SDKAnalyticsMigration */
    public class a implements n<AbstractMigration> {
        public a() {
        }

        public void a(m<AbstractMigration> mVar) {
            CacheManager.getInstance().invalidateAllCaches();
            i0.j.e.a.d.a.a();
            i0.j.e.a.d.a.c();
            Context context = e.this.a;
            if (context != null) {
                AnalyticsWrapper.setBeingCleaned(true, context);
            }
            ObservableCreate.CreateEmitter createEmitter = (ObservableCreate.CreateEmitter) mVar;
            createEmitter.b(e.this);
            createEmitter.a();
        }
    }

    public e() {
        super("sdk_analytics_migration");
    }

    public void doAfterMigration() {
        SettingsManager.getInstance().setCurrentSDKVersion("10.4.3");
    }

    public void doPreMigration() {
    }

    public int getMigrationVersion() {
        return 4;
    }

    public void initialize(Context context) {
        this.a = context;
    }

    public l<AbstractMigration> migrate() {
        return RxJavaPlugins.onAssembly(new ObservableCreate(new a()));
    }

    public boolean shouldMigrate() {
        Context context;
        if ("10.4.3".equalsIgnoreCase(SettingsManager.getInstance().getLastSDKVersion()) || (context = this.a) == null || AnalyticsWrapper.haveBeenCleanedBefore(context)) {
            return false;
        }
        if (StringUtility.compareVersion("10.4.3", "8.0.0") == 1 || !SettingsManager.getInstance().isSDKVersionSet()) {
            return true;
        }
        return false;
    }
}
