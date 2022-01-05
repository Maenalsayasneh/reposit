package h0.u;

import androidx.paging.LoadType;
import androidx.paging.PageEvent;
import h0.u.j;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m0.j.g;
import m0.j.o;
import m0.n.b.i;
import m0.q.d;

/* compiled from: CachedPageEventFlow.kt */
public final class f<T> {
    public int a;
    public int b;
    public final ArrayDeque<f0<T>> c = new ArrayDeque<>();
    public final m d = new m();

    public final void a(PageEvent<T> pageEvent) {
        i.e(pageEvent, "event");
        int i = 0;
        if (pageEvent instanceof PageEvent.Insert) {
            PageEvent.Insert insert = (PageEvent.Insert) pageEvent;
            this.d.c(insert.g);
            int ordinal = insert.c.ordinal();
            if (ordinal == 0) {
                this.c.clear();
                this.b = insert.f;
                this.a = insert.e;
                this.c.addAll(insert.d);
            } else if (ordinal == 1) {
                this.a = insert.e;
                Iterator it = m0.q.i.d(insert.d.size() - 1, 0).iterator();
                while (((d) it).hasNext()) {
                    this.c.addFirst(insert.d.get(((o) it).a()));
                }
            } else if (ordinal == 2) {
                this.b = insert.f;
                this.c.addAll(insert.d);
            }
        } else if (pageEvent instanceof PageEvent.a) {
            PageEvent.a aVar = (PageEvent.a) pageEvent;
            this.d.d(aVar.a, false, j.c.c);
            int ordinal2 = aVar.a.ordinal();
            if (ordinal2 == 1) {
                this.a = aVar.d;
                int c2 = aVar.c();
                while (i < c2) {
                    this.c.removeFirst();
                    i++;
                }
            } else if (ordinal2 == 2) {
                this.b = aVar.d;
                int c3 = aVar.c();
                while (i < c3) {
                    this.c.removeLast();
                    i++;
                }
            } else {
                throw new IllegalArgumentException("Page drop type must be prepend or append");
            }
        } else if (pageEvent instanceof PageEvent.b) {
            PageEvent.b bVar = (PageEvent.b) pageEvent;
            this.d.d(bVar.a, bVar.b, bVar.c);
        }
    }

    public final List<PageEvent<T>> b() {
        ArrayList arrayList = new ArrayList();
        if (!this.c.isEmpty()) {
            arrayList.add(PageEvent.Insert.b.c(g.v0(this.c), this.a, this.b, this.d.e()));
        } else {
            m mVar = this.d;
            k kVar = mVar.d;
            LoadType loadType = LoadType.REFRESH;
            j jVar = kVar.c;
            if (PageEvent.b.c(jVar, false)) {
                arrayList.add(new PageEvent.b(loadType, false, jVar));
            }
            LoadType loadType2 = LoadType.PREPEND;
            j jVar2 = kVar.d;
            if (PageEvent.b.c(jVar2, false)) {
                arrayList.add(new PageEvent.b(loadType2, false, jVar2));
            }
            LoadType loadType3 = LoadType.APPEND;
            j jVar3 = kVar.e;
            if (PageEvent.b.c(jVar3, false)) {
                arrayList.add(new PageEvent.b(loadType3, false, jVar3));
            }
            k kVar2 = mVar.e;
            if (kVar2 != null) {
                j jVar4 = kVar2.c;
                if (PageEvent.b.c(jVar4, true)) {
                    arrayList.add(new PageEvent.b(loadType, true, jVar4));
                }
                j jVar5 = kVar2.d;
                if (PageEvent.b.c(jVar5, true)) {
                    arrayList.add(new PageEvent.b(loadType2, true, jVar5));
                }
                j jVar6 = kVar2.e;
                if (PageEvent.b.c(jVar6, true)) {
                    arrayList.add(new PageEvent.b(loadType3, true, jVar6));
                }
            }
        }
        return arrayList;
    }
}
