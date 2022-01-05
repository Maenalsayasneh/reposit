package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: KTypeImpl.kt */
public final class KTypeImpl$arguments$2$parameterizedTypeArguments$2 extends Lambda implements a<List<? extends Type>> {
    public final /* synthetic */ KTypeImpl$arguments$2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KTypeImpl$arguments$2$parameterizedTypeArguments$2(KTypeImpl$arguments$2 kTypeImpl$arguments$2) {
        super(0);
        this.c = kTypeImpl$arguments$2;
    }

    public Object invoke() {
        Type i = this.c.c.i();
        i.c(i);
        return ReflectClassUtilKt.d(i);
    }
}
