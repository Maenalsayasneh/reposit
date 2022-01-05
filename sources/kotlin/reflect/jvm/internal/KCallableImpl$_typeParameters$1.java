package kotlin.reflect.jvm.internal;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.m0;

/* compiled from: KCallableImpl.kt */
public final class KCallableImpl$_typeParameters$1 extends Lambda implements a<List<? extends KTypeParameterImpl>> {
    public final /* synthetic */ KCallableImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KCallableImpl$_typeParameters$1(KCallableImpl kCallableImpl) {
        super(0);
        this.c = kCallableImpl;
    }

    public Object invoke() {
        List<m0> typeParameters = this.c.p().getTypeParameters();
        i.d(typeParameters, "descriptor.typeParameters");
        ArrayList arrayList = new ArrayList(h.K(typeParameters, 10));
        for (m0 m0Var : typeParameters) {
            KCallableImpl kCallableImpl = this.c;
            i.d(m0Var, "descriptor");
            arrayList.add(new KTypeParameterImpl(kCallableImpl, m0Var));
        }
        return arrayList;
    }
}
