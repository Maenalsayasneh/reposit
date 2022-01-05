package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl;
import m0.n.a.a;
import m0.r.t.a.o;

/* compiled from: KClassImpl.kt */
public final class KClassImpl$Data$annotations$2 extends Lambda implements a<List<? extends Annotation>> {
    public final /* synthetic */ KClassImpl.Data c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$annotations$2(KClassImpl.Data data) {
        super(0);
        this.c = data;
    }

    public Object invoke() {
        return o.b(this.c.a());
    }
}
