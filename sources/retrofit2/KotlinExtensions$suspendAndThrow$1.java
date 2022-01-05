package retrofit2;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;
import s0.a.e.b.b0.c.h3;

@c(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
/* compiled from: KotlinExtensions.kt */
public final class KotlinExtensions$suspendAndThrow$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public int d;
    public Object q;

    public KotlinExtensions$suspendAndThrow$1(m0.l.c cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return h3.k3((Exception) null, this);
    }
}
