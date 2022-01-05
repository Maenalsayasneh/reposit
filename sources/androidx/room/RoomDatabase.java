package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import h0.w.e;
import h0.y.a.c;
import h0.y.a.f.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class RoomDatabase {
    @Deprecated
    public volatile h0.y.a.b a;
    public Executor b;
    public h0.y.a.c c;
    public final e d;
    public boolean e;
    public boolean f;
    @Deprecated
    public List<b> g;
    public final ReentrantReadWriteLock h = new ReentrantReadWriteLock();
    public final ThreadLocal<Integer> i = new ThreadLocal<>();

    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean isLowRamDevice(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        @SuppressLint({"NewApi"})
        public JournalMode resolve(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || isLowRamDevice(activityManager)) {
                return TRUNCATE;
            }
            return WRITE_AHEAD_LOGGING;
        }
    }

    public static class a<T extends RoomDatabase> {
        public final Class<T> a;
        public final String b;
        public final Context c;
        public ArrayList<b> d;
        public Executor e;
        public Executor f;
        public c.C0076c g;
        public boolean h;
        public JournalMode i = JournalMode.AUTOMATIC;
        public boolean j = true;
        public boolean k;
        public final c l = new c();
        public Set<Integer> m;

        public a(Context context, Class<T> cls, String str) {
            this.c = context;
            this.a = cls;
            this.b = str;
        }

        public a<T> a(h0.w.j.a... aVarArr) {
            if (this.m == null) {
                this.m = new HashSet();
            }
            for (h0.w.j.a aVar : aVarArr) {
                this.m.add(Integer.valueOf(aVar.a));
                this.m.add(Integer.valueOf(aVar.b));
            }
            c cVar = this.l;
            Objects.requireNonNull(cVar);
            for (h0.w.j.a aVar2 : aVarArr) {
                int i2 = aVar2.a;
                int i3 = aVar2.b;
                TreeMap treeMap = cVar.a.get(Integer.valueOf(i2));
                if (treeMap == null) {
                    treeMap = new TreeMap();
                    cVar.a.put(Integer.valueOf(i2), treeMap);
                }
                h0.w.j.a aVar3 = (h0.w.j.a) treeMap.get(Integer.valueOf(i3));
                if (aVar3 != null) {
                    Log.w("ROOM", "Overriding migration " + aVar3 + " with " + aVar2);
                }
                treeMap.put(Integer.valueOf(i3), aVar2);
            }
            return this;
        }
    }

    public static abstract class b {
        public void a(h0.y.a.b bVar) {
        }
    }

    public static class c {
        public HashMap<Integer, TreeMap<Integer, h0.w.j.a>> a = new HashMap<>();
    }

    public RoomDatabase() {
        new ConcurrentHashMap();
        this.d = e();
    }

    public void a() {
        if (!this.e) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
            }
        }
    }

    public void b() {
        if (!h() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        h0.y.a.b L = this.c.L();
        this.d.d(L);
        ((h0.y.a.f.a) L).d.beginTransaction();
    }

    public f d(String str) {
        a();
        b();
        return new f(((h0.y.a.f.a) this.c.L()).d.compileStatement(str));
    }

    public abstract e e();

    public abstract h0.y.a.c f(h0.w.a aVar);

    @Deprecated
    public void g() {
        ((h0.y.a.f.a) this.c.L()).d.endTransaction();
        if (!h()) {
            e eVar = this.d;
            if (eVar.f.compareAndSet(false, true)) {
                eVar.e.b.execute(eVar.k);
            }
        }
    }

    public boolean h() {
        return ((h0.y.a.f.a) this.c.L()).d.inTransaction();
    }

    public boolean i() {
        h0.y.a.b bVar = this.a;
        return bVar != null && ((h0.y.a.f.a) bVar).d.isOpen();
    }

    public Cursor j(h0.y.a.e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        if (cancellationSignal == null) {
            return ((h0.y.a.f.a) this.c.L()).b(eVar);
        }
        h0.y.a.f.a aVar = (h0.y.a.f.a) this.c.L();
        return aVar.d.rawQueryWithFactory(new h0.y.a.f.b(aVar, eVar), eVar.a(), h0.y.a.f.a.c, (String) null, cancellationSignal);
    }

    @Deprecated
    public void k() {
        ((h0.y.a.f.a) this.c.L()).d.setTransactionSuccessful();
    }
}
