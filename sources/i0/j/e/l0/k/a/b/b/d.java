package i0.j.e.l0.k.a.b.b;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: Migration_14_15 */
public class d implements b {
    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE user_attributes_table ADD COLUMN type INTEGER DEFAULT 0");
    }
}
