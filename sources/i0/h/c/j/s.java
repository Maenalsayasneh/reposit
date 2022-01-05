package i0.h.c.j;

import i0.h.c.n.a;
import i0.h.c.n.b;
import java.util.Map;

/* compiled from: EventBus */
public final /* synthetic */ class s implements Runnable {
    public final Map.Entry c;
    public final a d;

    public s(Map.Entry entry, a aVar) {
        this.c = entry;
        this.d = aVar;
    }

    public void run() {
        Map.Entry entry = this.c;
        ((b) entry.getKey()).a(this.d);
    }
}
