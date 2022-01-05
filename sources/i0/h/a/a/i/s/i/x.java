package i0.h.a.a.i.s.i;

import android.database.sqlite.SQLiteDatabase;
import i0.h.a.a.i.s.i.z;
import java.util.List;

/* compiled from: SchemaManager */
public final /* synthetic */ class x implements z.a {
    public static final x a = new x();

    public void a(SQLiteDatabase sQLiteDatabase) {
        List<z.a> list = z.c;
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
