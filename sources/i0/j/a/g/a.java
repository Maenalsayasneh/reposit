package i0.j.a.g;

import android.annotation.SuppressLint;
import android.content.Context;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.utils.stability.handler.exception.ExceptionHandler;
import i0.j.a.d.a.d.e;
import i0.j.a.d.a.d.f;
import i0.j.a.d.a.d.g;
import i0.j.a.d.a.e.b;
import i0.j.a.e.c;
import i0.j.a.h.d.d;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ServiceLocator */
public class a {
    public static Context a;
    public static c b;
    public static i0.j.a.e.a c;
    public static i0.j.a.k.a d;
    public static Map<String, ThreadPoolExecutor> e;
    public static i0.j.a.h.b.a f;
    public static i0.j.a.d.a.b.c g;
    public static i0.j.a.d.a.b.a h;
    public static i0.j.a.h.a.a i;
    public static i0.j.a.d.a.a.a j;
    public static i0.j.a.h.d.c k;
    public static WeakReference<f> l;
    public static WeakReference<i0.j.a.j.a.a> m;
    public static WeakReference<i0.j.a.j.b.d.a> n;
    public static WeakReference<i0.j.a.j.b.e.a> o;
    public static i0.j.a.d.a.e.a p;
    public static i0.j.a.h.e.c q;
    public static WeakReference<DatabaseManager> r;
    public static i0.j.a.h.d.f s;
    public static i0.j.a.h.e.e.a t;
    public static i0.j.a.h.e.d.a u;

    public static synchronized i0.j.a.h.d.c a() {
        i0.j.a.h.d.c cVar;
        synchronized (a.class) {
            if (k == null) {
                DatabaseManager instance = DatabaseManager.getInstance();
                ExceptionHandler withPenalty = new ExceptionHandler().withPenalty(new i0.j.a.m.c.a(i()));
                i0.j.a.n.a.a i2 = i();
                k = new d(g(), new e(instance, withPenalty), withPenalty, i2);
            }
            cVar = k;
        }
        return cVar;
    }

    public static synchronized f b() {
        f fVar;
        synchronized (a.class) {
            WeakReference<f> weakReference = l;
            if (weakReference == null || weakReference.get() == null) {
                l = new WeakReference<>(new g());
            }
            fVar = (f) l.get();
        }
        return fVar;
    }

    public static synchronized i0.j.a.h.d.f c() {
        i0.j.a.h.d.f fVar;
        synchronized (a.class) {
            if (s == null) {
                s = new i0.j.a.h.d.f();
            }
            fVar = s;
        }
        return fVar;
    }

    public static synchronized i0.j.a.d.a.e.a d() {
        i0.j.a.d.a.e.a aVar;
        synchronized (a.class) {
            if (p == null) {
                p = new b();
            }
            aVar = p;
        }
        return aVar;
    }

    public static synchronized i0.j.a.h.e.c e() {
        i0.j.a.h.e.c cVar;
        synchronized (a.class) {
            if (q == null) {
                q = new i0.j.a.h.e.c();
            }
            cVar = q;
        }
        return cVar;
    }

    public static synchronized Executor f(String str) {
        synchronized (a.class) {
            if (e == null) {
                e = new ConcurrentHashMap();
            }
            ThreadPoolExecutor threadPoolExecutor = e.get(str);
            if (threadPoolExecutor != null) {
                return threadPoolExecutor;
            }
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 30, TimeUnit.MINUTES, new LinkedBlockingQueue(), new i0.j.a.m.e.a(10));
            e.put(str, threadPoolExecutor2);
            return threadPoolExecutor2;
        }
    }

    public static synchronized i0.j.a.e.b g() {
        c cVar;
        synchronized (a.class) {
            if (b == null) {
                b = new c();
            }
            cVar = b;
        }
        return cVar;
    }

    public static i0.j.a.c h() {
        return new i0.j.a.c(i());
    }

    public static i0.j.a.n.a.a i() {
        return new i0.j.a.n.a.a(g());
    }

    public static synchronized i0.j.a.k.a j() {
        i0.j.a.k.a aVar;
        synchronized (a.class) {
            if (d == null) {
                d = new i0.j.a.k.b();
            }
            aVar = d;
        }
        return aVar;
    }

    public static synchronized i0.j.a.h.a.a k() {
        i0.j.a.h.a.a aVar;
        synchronized (a.class) {
            if (i == null) {
                i = new i0.j.a.h.a.a();
            }
            aVar = i;
        }
        return aVar;
    }

    public static synchronized i0.j.a.h.e.d.a l() {
        i0.j.a.h.e.d.a aVar;
        synchronized (a.class) {
            if (u == null) {
                u = new i0.j.a.h.e.d.a(e());
            }
            aVar = u;
        }
        return aVar;
    }

    public static synchronized Context m() {
        synchronized (a.class) {
            Context context = a;
            if (context != null) {
                return context;
            }
            if (!Instabug.isBuilt()) {
                return null;
            }
            Context applicationContext = Instabug.getApplicationContext();
            return applicationContext;
        }
    }

    public static synchronized i0.j.a.h.e.e.a n() {
        i0.j.a.h.e.e.a aVar;
        synchronized (a.class) {
            if (t == null) {
                t = new i0.j.a.h.e.e.b(new i0.j.a.m.b.b(), g(), i());
            }
            aVar = t;
        }
        return aVar;
    }

    public static synchronized i0.j.a.d.a.b.a o() {
        i0.j.a.d.a.b.a aVar;
        synchronized (a.class) {
            if (h == null) {
                h = new i0.j.a.d.a.b.b(p(), i());
            }
            aVar = h;
        }
        return aVar;
    }

    @SuppressLint({"RESOURCE_LEAK"})
    public static synchronized DatabaseManager p() {
        synchronized (a.class) {
            WeakReference<DatabaseManager> weakReference = r;
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    DatabaseManager databaseManager = (DatabaseManager) r.get();
                    return databaseManager;
                }
            }
            if (m() == null) {
                return null;
            }
            DatabaseManager.init(InstabugCore.getInstabugDbHelper(m()));
            WeakReference<DatabaseManager> weakReference2 = new WeakReference<>(DatabaseManager.getInstance());
            r = weakReference2;
            DatabaseManager databaseManager2 = (DatabaseManager) weakReference2.get();
            return databaseManager2;
        }
    }

    public static synchronized i0.j.a.d.a.b.c q() {
        i0.j.a.d.a.b.c cVar;
        synchronized (a.class) {
            if (g == null) {
                g = new i0.j.a.d.a.b.d();
            }
            cVar = g;
        }
        return cVar;
    }

    public static synchronized i0.j.a.h.b.a r() {
        i0.j.a.h.b.a aVar;
        synchronized (a.class) {
            if (f == null) {
                f = new i0.j.a.h.b.c();
            }
            aVar = f;
        }
        return aVar;
    }
}
