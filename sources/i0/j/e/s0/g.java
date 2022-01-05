package i0.j.e.s0;

import android.annotation.SuppressLint;
import android.content.Context;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.migration.AbstractMigration;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.StringUtility;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.plugins.RxJavaPlugins;
import k0.b.l;
import k0.b.m;
import k0.b.n;

/* compiled from: SDKForwardMigration */
public class g extends AbstractMigration {

    /* compiled from: SDKForwardMigration */
    public class a implements n<AbstractMigration> {
        public a() {
        }

        public void a(m<AbstractMigration> mVar) {
            CacheManager.getInstance().invalidateAllCaches();
            ObservableCreate.CreateEmitter createEmitter = (ObservableCreate.CreateEmitter) mVar;
            createEmitter.b(g.this);
            createEmitter.a();
        }
    }

    public g() {
        super("sdk_forward_migration");
    }

    public void doAfterMigration() {
        InstabugSDKLogger.d(this, "doAfterMigration called");
        SettingsManager.getInstance().setCurrentSDKVersion("10.4.3");
    }

    public void doPreMigration() {
    }

    public int getMigrationVersion() {
        return 4;
    }

    public void initialize(Context context) {
    }

    public l<AbstractMigration> migrate() {
        return RxJavaPlugins.onAssembly(new ObservableCreate(new a()));
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    public boolean shouldMigrate() {
        String lastSDKVersion = SettingsManager.getInstance().getLastSDKVersion();
        if (lastSDKVersion.contains("-")) {
            if (StringUtility.compareVersion(String.valueOf("10.4.3".charAt(0)), String.valueOf(lastSDKVersion.charAt(0))) == 1 || !SettingsManager.getInstance().isSDKVersionSet()) {
                return true;
            }
            return false;
        } else if (StringUtility.compareVersion("10.4.3", lastSDKVersion) == 1 || !SettingsManager.getInstance().isSDKVersionSet()) {
            return true;
        } else {
            return false;
        }
    }
}
