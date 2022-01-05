package i0.j.b;

import com.instabug.library.internal.orchestrator.Action;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import i0.j.b.k.a;
import i0.j.b.s.c;
import java.util.Objects;

/* compiled from: ReportingPluginWrapper */
public final class h implements Action {
    public void run() throws Exception {
        synchronized (a.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            openDatabase.beginTransaction();
            try {
                openDatabase.delete(InstabugDbContract.BugEntry.TABLE_NAME, (String) null, (String[]) null);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
        Objects.requireNonNull(i0.j.b.s.a.h());
        c a = c.a();
        a.c.putBoolean("ib_first_run_after_updating_encryptor", false);
        a.c.apply();
    }
}
