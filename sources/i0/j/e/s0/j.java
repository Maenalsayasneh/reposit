package i0.j.e.s0;

import android.content.Context;
import com.instabug.library.internal.storage.AttachmentManager;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.migration.AbstractMigration;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.StringUtility;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.File;
import java.lang.ref.WeakReference;
import k0.b.l;
import k0.b.m;
import k0.b.n;

/* compiled from: VUSEncryptionMigration */
public class j extends AbstractMigration {
    public WeakReference<Context> a;

    /* compiled from: VUSEncryptionMigration */
    public class a implements n<AbstractMigration> {
        public a() {
        }

        public void a(m<AbstractMigration> mVar) {
            WeakReference<Context> weakReference = j.this.a;
            if (weakReference != null && weakReference.get() != null) {
                AttachmentManager.deleteRecursive(new File(AttachmentManager.getAttachmentDirectory((Context) j.this.a.get()) + "/usersteps"));
                CacheManager.getInstance().invalidateAllCaches();
                ObservableCreate.CreateEmitter createEmitter = (ObservableCreate.CreateEmitter) mVar;
                createEmitter.b(j.this);
                createEmitter.a();
            }
        }
    }

    public j() {
        super("vus_encryption_migration");
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
        this.a = new WeakReference<>(context);
    }

    public l<AbstractMigration> migrate() {
        return RxJavaPlugins.onAssembly(new ObservableCreate(new a()));
    }

    public boolean shouldMigrate() {
        if ("10.4.3".equalsIgnoreCase(SettingsManager.getInstance().getLastSDKVersion())) {
            return false;
        }
        if (StringUtility.compareVersion("10.4.3", "8.0.0") == 1 || !SettingsManager.getInstance().isSDKVersionSet()) {
            return true;
        }
        return false;
    }
}
