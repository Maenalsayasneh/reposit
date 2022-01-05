package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.o;

/* compiled from: KParameterImpl.kt */
public final class KParameterImpl$annotations$2 extends Lambda implements a<List<? extends Annotation>> {
    public final /* synthetic */ KParameterImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KParameterImpl$annotations$2(KParameterImpl kParameterImpl) {
        super(0);
        this.c = kParameterImpl;
    }

    public Object invoke() {
        return o.b(this.c.h());
    }
}
