package i0.j.e.s0;

import com.instabug.library.migration.AbstractMigration;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import k0.b.b0.b;

/* compiled from: MigrationManager */
public final class c extends b<AbstractMigration> {
    public void b(Object obj) {
        AbstractMigration abstractMigration = (AbstractMigration) obj;
        StringBuilder P0 = a.P0("Migration ");
        P0.append(abstractMigration.getMigrationId());
        P0.append(" done");
        InstabugSDKLogger.d("MigrationManager", P0.toString());
        abstractMigration.doAfterMigration();
    }

    public void onComplete() {
        InstabugSDKLogger.d("MigrationManager", "All Migrations completed, setting lastMigrationVersion to 4");
        SettingsManager.getInstance().setLastMigrationVersion(4);
    }

    public void onError(Throwable th) {
        StringBuilder P0 = a.P0("Migration failed");
        P0.append(th.getMessage());
        InstabugSDKLogger.d("MigrationManager", P0.toString());
    }
}
