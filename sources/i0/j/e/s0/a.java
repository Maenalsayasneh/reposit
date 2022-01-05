package i0.j.e.s0;

import android.content.Context;
import com.instabug.library.migration.AbstractMigration;
import com.instabug.library.settings.SettingsManager;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.plugins.RxJavaPlugins;
import k0.b.l;
import k0.b.m;
import k0.b.n;

/* compiled from: LastContactedAtMigration */
public class a extends AbstractMigration {

    /* renamed from: i0.j.e.s0.a$a  reason: collision with other inner class name */
    /* compiled from: LastContactedAtMigration */
    public class C0185a implements n<AbstractMigration> {
        public void a(m<AbstractMigration> mVar) {
        }
    }

    public a() {
        super("last_contacted_at_migration");
    }

    public void doAfterMigration() {
    }

    public void doPreMigration() {
    }

    public String getMigrationId() {
        return "last_contacted_at_migration";
    }

    public int getMigrationVersion() {
        return 1;
    }

    public void initialize(Context context) {
    }

    public l<AbstractMigration> migrate() {
        return RxJavaPlugins.onAssembly(new ObservableCreate(new C0185a()));
    }

    public boolean shouldMigrate() {
        if (1 <= SettingsManager.getInstance().getLastMigrationVersion() || !SettingsManager.getInstance().isDeviceRegistered() || SettingsManager.getInstance().getLastContactedAt() != 0) {
            return false;
        }
        return true;
    }
}
