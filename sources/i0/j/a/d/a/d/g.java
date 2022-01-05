package i0.j.a.d.a.d;

import android.content.ContentValues;
import android.database.Cursor;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import i0.j.a.d.b.e;
import i0.j.a.g.a;

/* compiled from: SessionMetaDataCacheHandlerImpl */
public class g implements f {
    public final DatabaseManager a = a.p();

    public void a() {
        DatabaseManager databaseManager = this.a;
        if (databaseManager != null) {
            synchronized (databaseManager) {
                SQLiteDatabaseWrapper openDatabase = this.a.openDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put(InstabugDbContract.APMSessionMetaDataEntry.COLUMN_UI_TRACES_TOTAL_COUNT, 0);
                contentValues.put(InstabugDbContract.APMSessionMetaDataEntry.COLUMN_UI_TRACES_DROPPED_COUNT, 0);
                openDatabase.update(InstabugDbContract.APMSessionMetaDataEntry.TABLE_NAME, contentValues, (String) null, (String[]) null);
                openDatabase.close();
            }
        }
    }

    public void b() {
        DatabaseManager databaseManager = this.a;
        if (databaseManager != null) {
            synchronized (databaseManager) {
                SQLiteDatabaseWrapper openDatabase = this.a.openDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put(InstabugDbContract.APMSessionMetaDataEntry.COLUMN_APP_LAUNCH_TOTAL_COUNT, 0);
                contentValues.put(InstabugDbContract.APMSessionMetaDataEntry.COLUMN_APP_LAUNCH_DROPPED_COUNT, 0);
                openDatabase.update(InstabugDbContract.APMSessionMetaDataEntry.TABLE_NAME, contentValues, (String) null, (String[]) null);
                openDatabase.close();
            }
        }
    }

    public void c() {
        DatabaseManager databaseManager = this.a;
        if (databaseManager != null) {
            synchronized (databaseManager) {
                SQLiteDatabaseWrapper openDatabase = this.a.openDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put(InstabugDbContract.APMSessionMetaDataEntry.COLUMN_EXECUTION_TRACES_TOTAL_COUNT, 0);
                contentValues.put(InstabugDbContract.APMSessionMetaDataEntry.COLUMN_EXECUTION_TRACES_DROPPED_COUNT, 0);
                openDatabase.update(InstabugDbContract.APMSessionMetaDataEntry.TABLE_NAME, contentValues, (String) null, (String[]) null);
                openDatabase.close();
            }
        }
    }

    public void d() {
        DatabaseManager databaseManager = this.a;
        if (databaseManager != null) {
            synchronized (databaseManager) {
                SQLiteDatabaseWrapper openDatabase = this.a.openDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put(InstabugDbContract.APMSessionMetaDataEntry.COLUMN_NETWORK_LOGS_TOTAL_COUNT, 0);
                contentValues.put(InstabugDbContract.APMSessionMetaDataEntry.COLUMN_NETWORK_LOGS_DROPPED_COUNT, 0);
                openDatabase.update(InstabugDbContract.APMSessionMetaDataEntry.TABLE_NAME, contentValues, (String) null, (String[]) null);
                openDatabase.close();
            }
        }
    }

    public final void e(SQLiteDatabaseWrapper sQLiteDatabaseWrapper, String str, String str2, int i) {
        String[] strArr = {str};
        Cursor query = sQLiteDatabaseWrapper.query(InstabugDbContract.APMSessionMetaDataEntry.TABLE_NAME, (String[]) null, "session_id = ?", strArr, (String) null, (String) null, (String) null);
        if (query != null) {
            if (query.moveToFirst()) {
                int i2 = query.getInt(query.getColumnIndex(str2));
                query.close();
                int i3 = i2 + i;
                ContentValues contentValues = new ContentValues();
                contentValues.put("session_id", str);
                contentValues.put(str2, Integer.valueOf(i3));
                sQLiteDatabaseWrapper.update(InstabugDbContract.APMSessionMetaDataEntry.TABLE_NAME, contentValues, "session_id = ?", strArr);
            }
            query.close();
        }
    }

    public e f(String str) {
        DatabaseManager databaseManager = this.a;
        e eVar = null;
        if (databaseManager != null) {
            SQLiteDatabaseWrapper openDatabase = databaseManager.openDatabase();
            Cursor query = openDatabase.query(InstabugDbContract.APMSessionMetaDataEntry.TABLE_NAME, (String[]) null, "session_id = ?", new String[]{str}, (String) null, (String) null, (String) null);
            if (query != null) {
                if (query.moveToNext()) {
                    eVar = new e();
                    eVar.b = query.getInt(query.getColumnIndex(InstabugDbContract.APMSessionMetaDataEntry.COLUMN_APP_LAUNCH_TOTAL_COUNT));
                    eVar.a = query.getInt(query.getColumnIndex(InstabugDbContract.APMSessionMetaDataEntry.COLUMN_EXECUTION_TRACES_TOTAL_COUNT));
                    eVar.c = query.getInt(query.getColumnIndex(InstabugDbContract.APMSessionMetaDataEntry.COLUMN_NETWORK_LOGS_TOTAL_COUNT));
                    eVar.d = query.getInt(query.getColumnIndex(InstabugDbContract.APMSessionMetaDataEntry.COLUMN_UI_TRACES_TOTAL_COUNT));
                    eVar.f = query.getInt(query.getColumnIndex(InstabugDbContract.APMSessionMetaDataEntry.COLUMN_APP_LAUNCH_DROPPED_COUNT));
                    eVar.e = query.getInt(query.getColumnIndex(InstabugDbContract.APMSessionMetaDataEntry.COLUMN_EXECUTION_TRACES_DROPPED_COUNT));
                    eVar.g = query.getInt(query.getColumnIndex(InstabugDbContract.APMSessionMetaDataEntry.COLUMN_NETWORK_LOGS_DROPPED_COUNT));
                    eVar.h = query.getInt(query.getColumnIndex(InstabugDbContract.APMSessionMetaDataEntry.COLUMN_UI_TRACES_DROPPED_COUNT));
                }
                query.close();
            }
            openDatabase.close();
        }
        return eVar;
    }

    public void g(String str, int i) {
        DatabaseManager databaseManager = this.a;
        if (databaseManager != null) {
            synchronized (databaseManager) {
                SQLiteDatabaseWrapper openDatabase = this.a.openDatabase();
                e(openDatabase, str, InstabugDbContract.APMSessionMetaDataEntry.COLUMN_NETWORK_LOGS_DROPPED_COUNT, i);
                openDatabase.close();
            }
        }
    }

    public void h(String str, int i) {
        DatabaseManager databaseManager = this.a;
        if (databaseManager != null) {
            synchronized (databaseManager) {
                SQLiteDatabaseWrapper openDatabase = this.a.openDatabase();
                e(openDatabase, str, InstabugDbContract.APMSessionMetaDataEntry.COLUMN_APP_LAUNCH_DROPPED_COUNT, i);
                openDatabase.close();
            }
        }
    }

    public void i(String str, int i) {
        DatabaseManager databaseManager = this.a;
        if (databaseManager != null) {
            synchronized (databaseManager) {
                SQLiteDatabaseWrapper openDatabase = this.a.openDatabase();
                c(openDatabase, str);
                e(openDatabase, str, InstabugDbContract.APMSessionMetaDataEntry.COLUMN_EXECUTION_TRACES_TOTAL_COUNT, i);
                openDatabase.close();
            }
        }
    }

    public void j(String str, int i) {
        DatabaseManager databaseManager = this.a;
        if (databaseManager != null) {
            synchronized (databaseManager) {
                SQLiteDatabaseWrapper openDatabase = this.a.openDatabase();
                c(openDatabase, str);
                e(openDatabase, str, InstabugDbContract.APMSessionMetaDataEntry.COLUMN_UI_TRACES_TOTAL_COUNT, i);
                openDatabase.close();
            }
        }
    }

    public void k(String str, int i) {
        DatabaseManager databaseManager = this.a;
        if (databaseManager != null) {
            synchronized (databaseManager) {
                SQLiteDatabaseWrapper openDatabase = this.a.openDatabase();
                e(openDatabase, str, InstabugDbContract.APMSessionMetaDataEntry.COLUMN_UI_TRACES_DROPPED_COUNT, i);
                openDatabase.close();
            }
        }
    }

    public void l(String str, int i) {
        DatabaseManager databaseManager = this.a;
        if (databaseManager != null) {
            synchronized (databaseManager) {
                SQLiteDatabaseWrapper openDatabase = this.a.openDatabase();
                c(openDatabase, str);
                e(openDatabase, str, InstabugDbContract.APMSessionMetaDataEntry.COLUMN_NETWORK_LOGS_TOTAL_COUNT, i);
                openDatabase.close();
            }
        }
    }

    public void m(String str, int i) {
        DatabaseManager databaseManager = this.a;
        if (databaseManager != null) {
            synchronized (databaseManager) {
                SQLiteDatabaseWrapper openDatabase = this.a.openDatabase();
                c(openDatabase, str);
                e(openDatabase, str, InstabugDbContract.APMSessionMetaDataEntry.COLUMN_APP_LAUNCH_TOTAL_COUNT, i);
                openDatabase.close();
            }
        }
    }

    public void n(String str, int i) {
        DatabaseManager databaseManager = this.a;
        if (databaseManager != null) {
            synchronized (databaseManager) {
                SQLiteDatabaseWrapper openDatabase = this.a.openDatabase();
                e(openDatabase, str, InstabugDbContract.APMSessionMetaDataEntry.COLUMN_EXECUTION_TRACES_DROPPED_COUNT, i);
                openDatabase.close();
            }
        }
    }

    public final void c(SQLiteDatabaseWrapper sQLiteDatabaseWrapper, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("session_id", str);
        sQLiteDatabaseWrapper.insertWithOnConflict(InstabugDbContract.APMSessionMetaDataEntry.TABLE_NAME, (String) null, contentValues);
    }
}
