package i0.h.a.a.i.s.i;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.EventInternal;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.b0.v;
import i0.h.a.a.i.h;
import i0.h.a.a.i.t.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: SQLiteEventStore */
public class t implements c, i0.h.a.a.i.t.a {
    public static final i0.h.a.a.b c = new i0.h.a.a.b("proto");
    public final z d;
    public final i0.h.a.a.i.u.a q;
    public final i0.h.a.a.i.u.a x;
    public final d y;

    /* compiled from: SQLiteEventStore */
    public interface b<T, U> {
        U apply(T t);
    }

    /* compiled from: SQLiteEventStore */
    public static class c {
        public final String a;
        public final String b;

        public c(String str, String str2, a aVar) {
            this.a = str;
            this.b = str2;
        }
    }

    /* compiled from: SQLiteEventStore */
    public interface d<T> {
        T a();
    }

    public t(i0.h.a.a.i.u.a aVar, i0.h.a.a.i.u.a aVar2, d dVar, z zVar) {
        this.d = zVar;
        this.q = aVar;
        this.x = aVar2;
        this.y = dVar;
    }

    public static String k(Iterable<h> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<h> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> T l(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public <T> T a(a.C0128a<T> aVar) {
        SQLiteDatabase b2 = b();
        i(new m(b2), n.a);
        try {
            T execute = aVar.execute();
            b2.setTransactionSuccessful();
            return execute;
        } finally {
            b2.endTransaction();
        }
    }

    public SQLiteDatabase b() {
        z zVar = this.d;
        zVar.getClass();
        return (SQLiteDatabase) i(new o(zVar), r.a);
    }

    public void close() {
        this.d.close();
    }

    public final Long e(SQLiteDatabase sQLiteDatabase, h hVar) {
        Long l;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{hVar.b(), String.valueOf(i0.h.a.a.i.v.a.a(hVar.d()))}));
        if (hVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(hVar.c(), 0));
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{InstabugDbContract.FeatureRequestEntry.COLUMN_ID}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null);
        try {
            if (!query.moveToNext()) {
                l = null;
            } else {
                l = Long.valueOf(query.getLong(0));
            }
            return l;
        } finally {
            query.close();
        }
    }

    public final <T> T f(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase b2 = b();
        b2.beginTransaction();
        try {
            T apply = bVar.apply(b2);
            b2.setTransactionSuccessful();
            return apply;
        } finally {
            b2.endTransaction();
        }
    }

    /* JADX INFO: finally extract failed */
    public int g() {
        long a2 = this.q.a() - this.y.b();
        SQLiteDatabase b2 = b();
        b2.beginTransaction();
        try {
            Integer valueOf = Integer.valueOf(b2.delete("events", "timestamp_ms < ?", new String[]{String.valueOf(a2)}));
            b2.setTransactionSuccessful();
            b2.endTransaction();
            return valueOf.intValue();
        } catch (Throwable th) {
            b2.endTransaction();
            throw th;
        }
    }

    public void h(Iterable<h> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder P0 = i0.d.a.a.a.P0("DELETE FROM events WHERE _id in ");
            P0.append(k(iterable));
            b().compileStatement(P0.toString()).execute();
        }
    }

    public final <T> T i(d<T> dVar, b<Throwable, T> bVar) {
        long a2 = this.x.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.x.a() >= ((long) this.y.a()) + a2) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    public h j0(h hVar, EventInternal eventInternal) {
        v.T("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", hVar.d(), eventInternal.getTransportName(), hVar.b());
        long longValue = ((Long) f(new s(this, hVar, eventInternal))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new b(longValue, hVar, eventInternal);
    }

    /* JADX INFO: finally extract failed */
    public long o0(h hVar) {
        Long l;
        Cursor rawQuery = b().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{hVar.b(), String.valueOf(i0.h.a.a.i.v.a.a(hVar.d()))});
        try {
            if (rawQuery.moveToNext()) {
                l = Long.valueOf(rawQuery.getLong(0));
            } else {
                l = 0L;
            }
            rawQuery.close();
            return l.longValue();
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public Iterable<h> p(h hVar) {
        return (Iterable) f(new j(this, hVar));
    }

    public void s(h hVar, long j) {
        f(new i(j, hVar));
    }

    /* JADX INFO: finally extract failed */
    public boolean t0(h hVar) {
        Boolean bool;
        SQLiteDatabase b2 = b();
        b2.beginTransaction();
        try {
            Long e = e(b2, hVar);
            if (e == null) {
                bool = Boolean.FALSE;
            } else {
                bool = (Boolean) l(b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{e.toString()}), q.a);
            }
            b2.setTransactionSuccessful();
            b2.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th) {
            b2.endTransaction();
            throw th;
        }
    }

    public Iterable<h> x() {
        SQLiteDatabase b2 = b();
        b2.beginTransaction();
        try {
            List list = (List) l(b2.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), p.a);
            b2.setTransactionSuccessful();
            return list;
        } finally {
            b2.endTransaction();
        }
    }

    public void x0(Iterable<h> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder P0 = i0.d.a.a.a.P0("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            P0.append(k(iterable));
            String sb = P0.toString();
            SQLiteDatabase b2 = b();
            b2.beginTransaction();
            try {
                b2.compileStatement(sb).execute();
                b2.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                b2.setTransactionSuccessful();
            } finally {
                b2.endTransaction();
            }
        }
    }
}
