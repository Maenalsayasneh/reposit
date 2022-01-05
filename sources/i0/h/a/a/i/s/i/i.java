package i0.h.a.a.i.s.i;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import i0.h.a.a.b;
import i0.h.a.a.i.h;
import i0.h.a.a.i.s.i.t;
import i0.h.a.a.i.v.a;

/* compiled from: SQLiteEventStore */
public final /* synthetic */ class i implements t.b {
    public final long a;
    public final h b;

    public i(long j, h hVar) {
        this.a = j;
        this.b = hVar;
    }

    public Object apply(Object obj) {
        long j = this.a;
        h hVar = this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        b bVar = t.c;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{hVar.b(), String.valueOf(a.a(hVar.d()))}) < 1) {
            contentValues.put("backend_name", hVar.b());
            contentValues.put("priority", Integer.valueOf(a.a(hVar.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }
}
