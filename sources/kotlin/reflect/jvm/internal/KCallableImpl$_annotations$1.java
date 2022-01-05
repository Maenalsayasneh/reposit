package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.o;

/* compiled from: KCallableImpl.kt */
public final class KCallableImpl$_annotations$1 extends Lambda implements a<List<? extends Annotation>> {
    public final /* synthetic */ KCallableImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KCallableImpl$_annotations$1(KCallableImpl kCallableImpl) {
        super(0);
        this.c = kCallableImpl;
    }

    public Object invoke() {
        return o.b(this.c.p());
    }
}
