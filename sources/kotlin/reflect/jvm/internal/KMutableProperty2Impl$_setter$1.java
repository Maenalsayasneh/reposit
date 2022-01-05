package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KMutableProperty2Impl;
import m0.n.a.a;

/* compiled from: KProperty2Impl.kt */
public final class KMutableProperty2Impl$_setter$1 extends Lambda implements a<KMutableProperty2Impl.a<D, E, V>> {
    public final /* synthetic */ KMutableProperty2Impl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KMutableProperty2Impl$_setter$1(KMutableProperty2Impl kMutableProperty2Impl) {
        super(0);
        this.c = kMutableProperty2Impl;
    }

    public Object invoke() {
        return new KMutableProperty2Impl.a(this.c);
    }
}
