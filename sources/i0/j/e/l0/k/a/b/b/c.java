package i0.j.e.l0.k.a.b.b;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: Migration_12_14 */
public class c implements b {
    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE user ADD COLUMN last_seen INTEGER DEFAULT 0");
    }
}
