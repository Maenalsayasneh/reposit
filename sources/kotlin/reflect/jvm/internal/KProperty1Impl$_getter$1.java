package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KProperty1Impl;
import m0.n.a.a;

/* compiled from: KProperty1Impl.kt */
public final class KProperty1Impl$_getter$1 extends Lambda implements a<KProperty1Impl.a<T, ? extends V>> {
    public final /* synthetic */ KProperty1Impl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty1Impl$_getter$1(KProperty1Impl kProperty1Impl) {
        super(0);
        this.c = kProperty1Impl;
    }

    public Object invoke() {
        return new KProperty1Impl.a(this.c);
    }
}
