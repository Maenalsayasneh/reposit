package n0.a;

import m0.i;
import m0.l.c;

/* compiled from: JobSupport.kt */
public final class s1 extends i1 {
    public final c<i> y;

    public s1(c<? super i> cVar) {
        this.y = cVar;
    }

    public void H(Throwable th) {
        this.y.resumeWith(i.a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        H((Throwable) obj);
        return i.a;
    }
}
