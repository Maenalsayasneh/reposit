package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KProperty0Impl;
import m0.n.a.a;

/* compiled from: KProperty0Impl.kt */
public final class KProperty0Impl$_getter$1 extends Lambda implements a<KProperty0Impl.a<? extends V>> {
    public final /* synthetic */ KProperty0Impl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty0Impl$_getter$1(KProperty0Impl kProperty0Impl) {
        super(0);
        this.c = kProperty0Impl;
    }

    public Object invoke() {
        return new KProperty0Impl.a(this.c);
    }
}
