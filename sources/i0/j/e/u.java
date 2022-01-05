package i0.j.e;

import android.database.sqlite.SQLiteFullException;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.logging.InstabugLog;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.q0.c;

/* compiled from: InstabugDelegate */
public class u implements Runnable {
    public void run() {
        Class<c> cls = c.class;
        synchronized (cls) {
            InstabugSDKLogger.d("InstabugNetworkLogDbHelper", "trim");
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            try {
                if (openDatabase.queryNumEntries(InstabugDbContract.NetworkLogEntry.TABLE_NAME) > 100) {
                    openDatabase.execSQL(InstabugDbContract.NetworkLogEntry.DELETE_ALL_EXCEPT_THE_LATEST_100_ENTRY);
                }
                openDatabase.close();
            } catch (SQLiteFullException e) {
                try {
                    openDatabase.execSQL(InstabugDbContract.NetworkLogEntry.SQL_DELETE_ENTRIES);
                    openDatabase.execSQL(InstabugDbContract.NetworkLogEntry.SQL_CREATE_NETWORK_LOGS);
                    InstabugSDKLogger.e(cls, e.getMessage(), e);
                } finally {
                    openDatabase.close();
                }
            }
        }
        InstabugLog.trimLogs();
        return;
    }
}
