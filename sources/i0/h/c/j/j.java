package i0.h.c.j;

import i0.h.c.q.a;
import i0.h.c.q.b;
import java.util.Objects;

/* compiled from: ComponentRuntime */
public final /* synthetic */ class j implements Runnable {
    public final y c;
    public final b d;

    public j(y yVar, b bVar) {
        this.c = yVar;
        this.d = bVar;
    }

    public void run() {
        a<T> aVar;
        y yVar = this.c;
        b<T> bVar = this.d;
        int i = m.a;
        if (yVar.c == x.a) {
            synchronized (yVar) {
                aVar = yVar.b;
                yVar.b = null;
                yVar.c = bVar;
            }
            Objects.requireNonNull((w) aVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
