package kotlin.reflect.jvm.internal;

import i0.j.f.p.h;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import m0.n.a.a;

/* compiled from: KProperty0Impl.kt */
public final class KProperty0Impl$delegateFieldValue$1 extends Lambda implements a<Object> {
    public final /* synthetic */ KProperty0Impl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty0Impl$delegateFieldValue$1(KProperty0Impl kProperty0Impl) {
        super(0);
        this.c = kProperty0Impl;
    }

    public final Object invoke() {
        KProperty0Impl kProperty0Impl = this.c;
        Field s = kProperty0Impl.s();
        KProperty0Impl kProperty0Impl2 = this.c;
        Object I = h.I(kProperty0Impl2.d2, kProperty0Impl2.p());
        try {
            if (I == KPropertyImpl.y) {
                if (kProperty0Impl.p().l0() == null) {
                    throw new RuntimeException('\'' + kProperty0Impl + "' is not an extension property and thus getExtensionDelegate() " + "is not going to work, use getDelegate() instead");
                }
            }
            if (s != null) {
                return s.get(I);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new IllegalPropertyDelegateAccessException(e);
        }
    }
}
