package i0.j.a.d.a.d;

import android.database.Cursor;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.utils.stability.handler.exception.ExceptionHandler;
import i0.j.a.d.b.d;

/* compiled from: SessionCacheHandlerImpl */
public class e implements a {
    public final DatabaseManager a;
    public final ExceptionHandler b;

    public e(DatabaseManager databaseManager, ExceptionHandler exceptionHandler) {
        this.a = databaseManager;
        this.b = exceptionHandler;
    }

    public final d a(Cursor cursor) {
        Cursor cursor2 = cursor;
        int columnIndex = cursor2.getColumnIndex("session_id");
        int columnIndex2 = cursor2.getColumnIndex(InstabugDbContract.APMSessionEntry.COLUMN_CORE_ID);
        int columnIndex3 = cursor2.getColumnIndex("os");
        int columnIndex4 = cursor2.getColumnIndex("app_version");
        int columnIndex5 = cursor2.getColumnIndex("uuid");
        int columnIndex6 = cursor2.getColumnIndex("duration");
        int columnIndex7 = cursor2.getColumnIndex("started_at");
        int columnIndex8 = cursor2.getColumnIndex(InstabugDbContract.APMSessionEntry.COLUMN_TERMINATION_CODE);
        int columnIndex9 = cursor2.getColumnIndex("sync_status");
        String string = cursor2.getString(columnIndex);
        String string2 = cursor2.getString(columnIndex2);
        String string3 = cursor2.getString(columnIndex3);
        String string4 = cursor2.getString(columnIndex4);
        String string5 = cursor2.getString(columnIndex5);
        long j = cursor2.getLong(columnIndex6);
        long j2 = cursor2.getLong(columnIndex7);
        int i = cursor2.getInt(columnIndex8);
        cursor2.getInt(columnIndex9);
        return new d(string, string2, string3, string4, string5, j, j2, 0, i);
    }
}
