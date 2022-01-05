package kotlinx.coroutines.internal;

import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.e;
import m0.n.a.l;
import m0.r.t.a.r.m.a1.a;

/* compiled from: OnUndeliveredElement.kt */
public final class OnUndeliveredElementKt$bindCancellationFun$1 extends Lambda implements l<Throwable, i> {
    public final /* synthetic */ l<E, i> c;
    public final /* synthetic */ E d;
    public final /* synthetic */ e q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnUndeliveredElementKt$bindCancellationFun$1(l<? super E, i> lVar, E e, e eVar) {
        super(1);
        this.c = lVar;
        this.d = e;
        this.q = eVar;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        l<E, i> lVar = this.c;
        E e = this.d;
        e eVar = this.q;
        UndeliveredElementException i02 = a.i0(lVar, e, (UndeliveredElementException) null);
        if (i02 != null) {
            a.b2(eVar, i02);
        }
        return i.a;
    }
}
