package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KMutableProperty1Impl;
import m0.n.a.a;

/* compiled from: KProperty1Impl.kt */
public final class KMutableProperty1Impl$_setter$1 extends Lambda implements a<KMutableProperty1Impl.a<T, V>> {
    public final /* synthetic */ KMutableProperty1Impl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl$_setter$1(KMutableProperty1Impl kMutableProperty1Impl) {
        super(0);
        this.c = kMutableProperty1Impl;
    }

    public Object invoke() {
        return new KMutableProperty1Impl.a(this.c);
    }
}
