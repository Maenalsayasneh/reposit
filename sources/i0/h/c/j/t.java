package i0.h.c.j;

import i0.h.c.n.a;
import i0.h.c.n.b;
import i0.h.c.n.c;
import i0.h.c.n.d;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: EventBus */
public class t implements d, c {
    public final Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> a = new HashMap();
    public Queue<a<?>> b = new ArrayDeque();
    public final Executor c;

    public t(Executor executor) {
        this.c = executor;
    }

    public <T> void a(Class<T> cls, b<? super T> bVar) {
        Executor executor = this.c;
        synchronized (this) {
            Objects.requireNonNull(executor);
            if (!this.a.containsKey(cls)) {
                this.a.put(cls, new ConcurrentHashMap());
            }
            this.a.get(cls).put(bVar, executor);
        }
    }
}
