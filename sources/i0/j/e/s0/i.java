package i0.j.e.s0;

import android.annotation.SuppressLint;
import android.content.Context;
import com.instabug.library.migration.AbstractMigration;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.File;
import k0.b.l;
import k0.b.m;
import k0.b.n;

/* compiled from: V2CacheFilesMigration */
public class i extends AbstractMigration {
    public Context a;

    /* compiled from: V2CacheFilesMigration */
    public class a implements n<AbstractMigration> {
        public a() {
        }

        @SuppressLint({"NULL_DEREFERENCE"})
        public void a(m<AbstractMigration> mVar) {
            File file = new File(i.this.a.getCacheDir() + "/issues.cache");
            File file2 = new File(i.this.a.getCacheDir() + "/conversations.cache");
            boolean z = false;
            if (file.exists() ? file.delete() : false) {
                InstabugSDKLogger.v("V2CacheFilesMigration", "Issues cache file found and deleted");
            }
            if (file2.exists()) {
                z = file2.delete();
            }
            if (z) {
                InstabugSDKLogger.v("V2CacheFilesMigration", "Conversations cache file found and deleted");
            }
            ObservableCreate.CreateEmitter createEmitter = (ObservableCreate.CreateEmitter) mVar;
            createEmitter.b(i.this);
            createEmitter.a();
        }
    }

    public i() {
        super("v2_cache_files_migration");
    }

    public void doAfterMigration() {
    }

    public void doPreMigration() {
    }

    public int getMigrationVersion() {
        return 2;
    }

    public void initialize(Context context) {
        this.a = context;
    }

    public l<AbstractMigration> migrate() {
        if (this.a == null) {
            return l.g();
        }
        return RxJavaPlugins.onAssembly(new ObservableCreate(new a()));
    }

    public boolean shouldMigrate() {
        if (2 <= SettingsManager.getInstance().getLastMigrationVersion() || this.a == null) {
            return false;
        }
        File file = new File(this.a.getCacheDir() + "/issues.cache");
        File file2 = new File(this.a.getCacheDir() + "/conversations.cache");
        StringBuilder sb = new StringBuilder();
        sb.append(getMigrationId());
        sb.append(" is ");
        sb.append(file.exists() || file2.exists());
        InstabugSDKLogger.v("V2CacheFilesMigration", sb.toString());
        if (file.exists() || file2.exists()) {
            return true;
        }
        return false;
    }
}
