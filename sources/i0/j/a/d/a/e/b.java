package i0.j.a.d.a.e;

import android.content.ContentValues;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import i0.j.a.d.b.f;
import i0.j.a.g.a;

/* compiled from: UiTraceCacheHandlerImpl */
public class b implements a {
    public DatabaseManager a = a.p();
    public i0.j.a.n.a.a b = a.i();

    public long a(f fVar) {
        DatabaseManager databaseManager = this.a;
        if (databaseManager == null) {
            return -1;
        }
        SQLiteDatabaseWrapper openDatabase = databaseManager.openDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(InstabugDbContract.APMUiTraceEntry.COLUMN_NAME, fVar.b);
        String str = fVar.n;
        if (str != null) {
            contentValues.put("session_id", str);
        }
        contentValues.put("duration", Long.valueOf(fVar.c));
        contentValues.put(InstabugDbContract.APMUiTraceEntry.COLUMN_SMALL_DROPS_DURATION, Long.valueOf(fVar.e));
        contentValues.put(InstabugDbContract.APMUiTraceEntry.COLUMN_LARGE_DROPS_DURATION, Long.valueOf(fVar.d));
        contentValues.put(InstabugDbContract.APMUiTraceEntry.COLUMN_BATTERY_LEVEL, Integer.valueOf(fVar.i));
        contentValues.put(InstabugDbContract.APMUiTraceEntry.COLUMN_USER_DEFINED, Boolean.valueOf(fVar.a));
        contentValues.put(InstabugDbContract.APMUiTraceEntry.COLUMN_REFRESH_RATE, Integer.valueOf(fVar.g));
        contentValues.put("start_time", Long.valueOf(fVar.f));
        String str2 = fVar.h;
        if (str2 != null) {
            contentValues.put(InstabugDbContract.APMUiTraceEntry.COLUMN_SCREEN_TITLE, str2);
        }
        Boolean bool = fVar.j;
        if (bool != null) {
            contentValues.put(InstabugDbContract.APMUiTraceEntry.COLUMN_POWER_SAVE_MODE, bool);
        }
        String str3 = fVar.k;
        if (str3 != null) {
            contentValues.put(InstabugDbContract.APMUiTraceEntry.COLUMN_CONTAINER_NAME, str3);
        }
        String str4 = fVar.l;
        if (str4 != null) {
            contentValues.put(InstabugDbContract.APMUiTraceEntry.COLUMN_MODULE_NAME, str4);
        }
        String str5 = fVar.m;
        if (str5 != null) {
            contentValues.put("orientation", str5);
        }
        long insert = openDatabase.insert(InstabugDbContract.APMUiTraceEntry.TABLE_NAME, (String) null, contentValues);
        openDatabase.close();
        return insert;
    }
}
