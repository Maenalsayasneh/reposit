package i0.h.a.a.i.s.i;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.EventInternal;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.PaymentMethodOptionsParams;
import i0.h.a.a.b;
import i0.h.a.a.i.h;
import i0.h.a.a.i.s.i.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: SQLiteEventStore */
public final /* synthetic */ class j implements t.b {
    public final t a;
    public final h b;

    public j(t tVar, h hVar) {
        this.a = tVar;
        this.b = hVar;
    }

    /* JADX INFO: finally extract failed */
    public Object apply(Object obj) {
        t tVar = this.a;
        h hVar = this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        b bVar = t.c;
        Objects.requireNonNull(tVar);
        ArrayList arrayList = new ArrayList();
        Long e = tVar.e(sQLiteDatabase, hVar);
        if (e != null) {
            t.l(sQLiteDatabase.query("events", new String[]{InstabugDbContract.FeatureRequestEntry.COLUMN_ID, "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", PaymentMethodOptionsParams.Blik.PARAM_CODE, "inline"}, "context_id = ?", new String[]{e.toString()}, (String) null, (String) null, (String) null, String.valueOf(tVar.y.c())), new k(tVar, arrayList, hVar));
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(((h) arrayList.get(i)).b());
            if (i < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", InstabugDbContract.UserAttributesEntry.COLUMN_VALUE}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new t.c(query.getString(1), query.getString(2), (t.a) null));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            h hVar2 = (h) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(hVar2.b()))) {
                EventInternal.a builder = hVar2.a().toBuilder();
                for (t.c cVar : (Set) hashMap.get(Long.valueOf(hVar2.b()))) {
                    builder.a(cVar.a, cVar.b);
                }
                listIterator.set(new b(hVar2.b(), hVar2.c(), builder.b()));
            }
        }
        return arrayList;
    }
}
