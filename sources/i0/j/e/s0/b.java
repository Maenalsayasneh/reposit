package i0.j.e.s0;

import android.content.Context;
import com.instabug.library.migration.AbstractMigration;
import com.instabug.library.settings.SettingsManager;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.plugins.RxJavaPlugins;
import k0.b.l;
import k0.b.m;
import k0.b.n;

/* compiled from: LastContactedAtToLastBugAndLastChatTimeMigration */
public class b extends AbstractMigration {

    /* compiled from: LastContactedAtToLastBugAndLastChatTimeMigration */
    public class a implements n<AbstractMigration> {
        public a() {
        }

        public void a(m<AbstractMigration> mVar) {
            ObservableCreate.CreateEmitter createEmitter = (ObservableCreate.CreateEmitter) mVar;
            createEmitter.b(b.this);
            createEmitter.a();
        }
    }

    public b() {
        super("last_contacted_at_to_last_bug_and_last_chat_time_migration");
    }

    public void doAfterMigration() {
    }

    public void doPreMigration() {
    }

    public String getMigrationId() {
        return "last_contacted_at_to_last_bug_and_last_chat_time_migration";
    }

    public int getMigrationVersion() {
        return 3;
    }

    public void initialize(Context context) {
    }

    public l<AbstractMigration> migrate() {
        return RxJavaPlugins.onAssembly(new ObservableCreate(new a()));
    }

    public boolean shouldMigrate() {
        return 3 > SettingsManager.getInstance().getLastMigrationVersion() && SettingsManager.getInstance().getLastContactedAt() != 0;
    }
}
