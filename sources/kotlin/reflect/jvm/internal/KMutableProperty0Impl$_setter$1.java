package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KMutableProperty0Impl;
import m0.n.a.a;

/* compiled from: KProperty0Impl.kt */
public final class KMutableProperty0Impl$_setter$1 extends Lambda implements a<KMutableProperty0Impl.a<V>> {
    public final /* synthetic */ KMutableProperty0Impl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl$_setter$1(KMutableProperty0Impl kMutableProperty0Impl) {
        super(0);
        this.c = kMutableProperty0Impl;
    }

    public Object invoke() {
        return new KMutableProperty0Impl.a(this.c);
    }
}
