package i0.h.a.a.i.s.i;

import android.database.Cursor;
import i0.h.a.a.i.s.i.t;

/* compiled from: SQLiteEventStore */
public final /* synthetic */ class q implements t.b {
    public static final q a = new q();

    public Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
