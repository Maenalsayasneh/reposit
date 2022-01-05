package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KProperty2Impl;
import m0.n.a.a;

/* compiled from: KProperty2Impl.kt */
public final class KProperty2Impl$_getter$1 extends Lambda implements a<KProperty2Impl.a<D, E, ? extends V>> {
    public final /* synthetic */ KProperty2Impl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty2Impl$_getter$1(KProperty2Impl kProperty2Impl) {
        super(0);
        this.c = kProperty2Impl;
    }

    public Object invoke() {
        return new KProperty2Impl.a(this.c);
    }
}
