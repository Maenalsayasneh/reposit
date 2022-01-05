package androidx.paging;

import h0.u.j;
import h0.u.s;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.q;

/* compiled from: PagePresenter.kt */
public final class PagePresenter$insertPage$1 extends Lambda implements q<LoadType, Boolean, j, i> {
    public final /* synthetic */ s.b c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagePresenter$insertPage$1(s.b bVar) {
        super(3);
        this.c = bVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        LoadType loadType = (LoadType) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        j jVar = (j) obj3;
        m0.n.b.i.e(loadType, "type");
        m0.n.b.i.e(jVar, "state");
        this.c.a(loadType, booleanValue, jVar);
        return i.a;
    }
}
