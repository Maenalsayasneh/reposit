package i0.j.e;

import com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributeCacheManager;
import com.instabug.library.util.filters.Filters;
import i0.j.e.d1.d.b;
import i0.j.e.d1.d.f;

/* compiled from: InstabugDelegate */
public class r implements Runnable {
    public void run() {
        Filters.applyOn(UserAttributeCacheManager.retrieveAll()).apply(new b()).thenDo(new f());
    }
}
