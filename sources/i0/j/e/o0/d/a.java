package i0.j.e.o0.d;

import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.util.threading.PoolProvider;
import i0.j.e.o0.c.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: ServiceLocator */
public class a {
    public static final Map<String, WeakReference<Object>> a = new HashMap();

    public static synchronized DatabaseManager a() {
        DatabaseManager instance;
        synchronized (a.class) {
            instance = DatabaseManager.getInstance();
        }
        return instance;
    }

    public static Object b(String str) {
        Map<String, WeakReference<Object>> map = a;
        if (map.containsKey(str)) {
            return map.get(str).get();
        }
        return null;
    }

    public static synchronized i0.j.e.o0.c.a c() {
        i0.j.e.o0.c.a aVar;
        synchronized (a.class) {
            String name = i0.j.e.o0.c.a.class.getName();
            Object b = b(name);
            if (b == null) {
                b = new b();
                a.put(name, new WeakReference(b));
            }
            aVar = (i0.j.e.o0.c.a) b;
        }
        return aVar;
    }

    public static synchronized i0.j.e.o0.a d() {
        i0.j.e.o0.a aVar;
        synchronized (a.class) {
            String name = i0.j.e.o0.a.class.getName();
            Object b = b(name);
            if (b == null) {
                b = new i0.j.e.o0.b();
                a.put(name, new WeakReference(b));
            }
            aVar = (i0.j.e.o0.a) b;
        }
        return aVar;
    }

    public static synchronized Executor e() {
        ThreadPoolExecutor backgroundExecutor;
        synchronized (a.class) {
            backgroundExecutor = PoolProvider.getInstance().getBackgroundExecutor();
        }
        return backgroundExecutor;
    }
}
