package i0.j.e.l0.k.a.b.b;

import android.database.sqlite.SQLiteDatabase;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;

/* compiled from: Migration_23_24 */
public class l implements b {
    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(InstabugDbContract.ExperimentsEntry.CREATE_TABLE_QUERY);
    }
}
