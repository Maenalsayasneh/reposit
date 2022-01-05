package i0.j.e.a.d;

import com.instabug.library.core.eventbus.EventBus;

/* compiled from: AnalyticsStateDispatcher */
public class b extends EventBus<Boolean> {
    public static b a;

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (a == null) {
                a = new b();
            }
            bVar = a;
        }
        return bVar;
    }
}
