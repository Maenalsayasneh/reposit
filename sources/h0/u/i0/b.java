package h0.u.i0;

import androidx.paging.multicast.ChannelManager;
import java.util.ArrayDeque;
import java.util.Collection;
import m0.n.b.i;

/* compiled from: ChannelManager.kt */
public final class b<T> implements a<T> {
    public final ArrayDeque<ChannelManager.b.C0004b.c<T>> a;
    public final int b;

    public b(int i) {
        this.b = i;
        this.a = new ArrayDeque<>(i > 10 ? 10 : i);
    }

    public void a(ChannelManager.b.C0004b.c<T> cVar) {
        i.e(cVar, "item");
        while (this.a.size() >= this.b) {
            this.a.pollFirst();
        }
        this.a.offerLast(cVar);
    }

    public Collection b() {
        return this.a;
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }
}
