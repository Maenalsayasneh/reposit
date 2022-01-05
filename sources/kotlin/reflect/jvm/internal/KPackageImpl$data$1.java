package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPackageImpl;
import m0.n.a.a;

/* compiled from: KPackageImpl.kt */
public final class KPackageImpl$data$1 extends Lambda implements a<KPackageImpl.Data> {
    public final /* synthetic */ KPackageImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPackageImpl$data$1(KPackageImpl kPackageImpl) {
        super(0);
        this.c = kPackageImpl;
    }

    public Object invoke() {
        return new KPackageImpl.Data();
    }
}
