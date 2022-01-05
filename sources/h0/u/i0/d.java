package h0.u.i0;

import androidx.paging.multicast.ChannelManager;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m0.n.b.i;

/* compiled from: ChannelManager.kt */
public final class d<T> implements a<T> {
    public void a(ChannelManager.b.C0004b.c<T> cVar) {
        i.e(cVar, "item");
    }

    public Collection<ChannelManager.b.C0004b.c<T>> b() {
        List emptyList = Collections.emptyList();
        i.d(emptyList, "Collections.emptyList()");
        return emptyList;
    }

    public boolean isEmpty() {
        return b().isEmpty();
    }
}
