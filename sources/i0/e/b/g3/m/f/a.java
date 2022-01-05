package i0.e.b.g3.m.f;

import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import i0.b.a.i0;
import i0.e.b.g3.m.f.d;
import n0.a.f2.l;

/* compiled from: lambda */
public final /* synthetic */ class a implements i0 {
    public final /* synthetic */ l a;
    public final /* synthetic */ PagingDataEpoxyController b;

    public /* synthetic */ a(l lVar, PagingDataEpoxyController pagingDataEpoxyController) {
        this.a = lVar;
        this.b = pagingDataEpoxyController;
    }

    public final void a(i0.b.a.l lVar) {
        this.a.offer(this.b.getAdapter().c().isEmpty() ? d.a.a : d.c.a);
    }
}
