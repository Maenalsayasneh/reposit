package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: KProperty2Impl.kt */
public final class KProperty2Impl$delegateField$1 extends Lambda implements a<Field> {
    public final /* synthetic */ KProperty2Impl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty2Impl$delegateField$1(KProperty2Impl kProperty2Impl) {
        super(0);
        this.c = kProperty2Impl;
    }

    public Object invoke() {
        return this.c.s();
    }
}
