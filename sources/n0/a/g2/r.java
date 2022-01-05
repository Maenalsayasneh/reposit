package n0.a.g2;

import kotlinx.coroutines.channels.BufferOverflow;
import m0.i;
import m0.l.c;
import m0.l.e;
import n0.a.f1;
import n0.a.g2.d0.k;

/* compiled from: Share.kt */
public final class r<T> implements t<T>, k<T>, k {
    public final f1 c;
    public final /* synthetic */ t<T> d;

    public r(t<? extends T> tVar, f1 f1Var) {
        this.c = f1Var;
        this.d = tVar;
    }

    public d<T> c(e eVar, int i, BufferOverflow bufferOverflow) {
        return u.c(this, eVar, i, bufferOverflow);
    }

    public Object collect(e<? super T> eVar, c<? super i> cVar) {
        return this.d.collect(eVar, cVar);
    }
}
