package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: KProperty1Impl.kt */
public final class KProperty1Impl$delegateField$1 extends Lambda implements a<Field> {
    public final /* synthetic */ KProperty1Impl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty1Impl$delegateField$1(KProperty1Impl kProperty1Impl) {
        super(0);
        this.c = kProperty1Impl;
    }

    public Object invoke() {
        return this.c.s();
    }
}
