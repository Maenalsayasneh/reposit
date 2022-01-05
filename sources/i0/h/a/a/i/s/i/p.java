package i0.h.a.a.i.s.i;

import android.database.Cursor;
import android.util.Base64;
import i0.h.a.a.b;
import i0.h.a.a.i.b;
import i0.h.a.a.i.h;
import i0.h.a.a.i.s.i.t;
import i0.h.a.a.i.v.a;
import java.util.ArrayList;

/* compiled from: SQLiteEventStore */
public final /* synthetic */ class p implements t.b {
    public static final p a = new p();

    public Object apply(Object obj) {
        byte[] bArr;
        Cursor cursor = (Cursor) obj;
        b bVar = t.c;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            h.a a2 = h.a();
            a2.b(cursor.getString(1));
            a2.c(a.b(cursor.getInt(2)));
            String string = cursor.getString(3);
            if (string == null) {
                bArr = null;
            } else {
                bArr = Base64.decode(string, 0);
            }
            b.C0125b bVar2 = (b.C0125b) a2;
            bVar2.b = bArr;
            arrayList.add(bVar2.a());
        }
        return arrayList;
    }
}
