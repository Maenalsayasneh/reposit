package n0.a;

import kotlinx.coroutines.internal.ThreadContextKt;
import m0.l.c;
import m0.l.e;
import m0.r.t.a.r.m.a1.a;
import n0.a.h2.r;

/* compiled from: CoroutineContext.kt */
public final class b2<T> extends r<T> {
    public e x;
    public Object y;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b2(m0.l.e r3, m0.l.c<? super T> r4) {
        /*
            r2 = this;
            n0.a.c2 r0 = n0.a.c2.c
            m0.l.e$a r1 = r3.get(r0)
            if (r1 != 0) goto L_0x000c
            m0.l.e r3 = r3.plus(r0)
        L_0x000c:
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.b2.<init>(m0.l.e, m0.l.c):void");
    }

    public void t0(Object obj) {
        e eVar = this.x;
        b2<?> b2Var = null;
        if (eVar != null) {
            ThreadContextKt.a(eVar, this.y);
            this.x = b2Var;
            this.y = b2Var;
        }
        Object d3 = a.d3(obj, this.q);
        c<T> cVar = this.q;
        e context = cVar.getContext();
        Object c = ThreadContextKt.c(context, b2Var);
        if (c != ThreadContextKt.a) {
            b2Var = c0.b(cVar, context, c);
        }
        try {
            this.q.resumeWith(d3);
        } finally {
            if (b2Var == null || b2Var.w0()) {
                ThreadContextKt.a(context, c);
            }
        }
    }

    public final boolean w0() {
        if (this.x == null) {
            return false;
        }
        this.x = null;
        this.y = null;
        return true;
    }
}
