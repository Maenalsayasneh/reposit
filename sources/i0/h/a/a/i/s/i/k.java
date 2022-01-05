package i0.h.a.a.i.s.i;

import android.database.Cursor;
import com.google.android.datatransport.runtime.EventInternal;
import i0.h.a.a.b;
import i0.h.a.a.i.a;
import i0.h.a.a.i.e;
import i0.h.a.a.i.h;
import i0.h.a.a.i.s.i.t;
import java.util.List;

/* compiled from: SQLiteEventStore */
public final /* synthetic */ class k implements t.b {
    public final t a;
    public final List b;
    public final h c;

    public k(t tVar, List list, h hVar) {
        this.a = tVar;
        this.b = list;
        this.c = hVar;
    }

    public Object apply(Object obj) {
        b bVar;
        b bVar2;
        t tVar = this.a;
        List list = this.b;
        h hVar = this.c;
        Cursor cursor = (Cursor) obj;
        b bVar3 = t.c;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            EventInternal.a builder = EventInternal.builder();
            builder.f(cursor.getString(1));
            builder.e(cursor.getLong(2));
            builder.g(cursor.getLong(3));
            if (z) {
                String string = cursor.getString(4);
                if (string == null) {
                    bVar2 = t.c;
                } else {
                    bVar2 = new b(string);
                }
                builder.d(new e(bVar2, cursor.getBlob(5)));
            } else {
                String string2 = cursor.getString(4);
                if (string2 == null) {
                    bVar = t.c;
                } else {
                    bVar = new b(string2);
                }
                builder.d(new e(bVar, (byte[]) t.l(tVar.b().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, "sequence_num"), l.a)));
            }
            if (!cursor.isNull(6)) {
                ((a.b) builder).b = Integer.valueOf(cursor.getInt(6));
            }
            list.add(new b(j, hVar, builder.b()));
        }
        return null;
    }
}
