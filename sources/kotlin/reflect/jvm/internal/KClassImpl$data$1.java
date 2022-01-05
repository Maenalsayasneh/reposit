package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl;
import m0.n.a.a;

/* compiled from: KClassImpl.kt */
public final class KClassImpl$data$1 extends Lambda implements a<KClassImpl<T>.Data> {
    public final /* synthetic */ KClassImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$data$1(KClassImpl kClassImpl) {
        super(0);
        this.c = kClassImpl;
    }

    public Object invoke() {
        return new KClassImpl.Data();
    }
}
