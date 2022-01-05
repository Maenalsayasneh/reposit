package i0.h.a.a.i.s.i;

import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import i0.h.a.a.b;
import i0.h.a.a.i.s.i.t;

/* compiled from: SQLiteEventStore */
public final /* synthetic */ class n implements t.b {
    public static final n a = new n();

    public Object apply(Object obj) {
        b bVar = t.c;
        throw new SynchronizationException("Timed out while trying to acquire the lock.", (Throwable) obj);
    }
}
