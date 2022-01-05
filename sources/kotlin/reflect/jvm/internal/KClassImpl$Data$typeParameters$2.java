package kotlin.reflect.jvm.internal;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.m0;

/* compiled from: KClassImpl.kt */
public final class KClassImpl$Data$typeParameters$2 extends Lambda implements a<List<? extends KTypeParameterImpl>> {
    public final /* synthetic */ KClassImpl.Data c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$typeParameters$2(KClassImpl.Data data) {
        super(0);
        this.c = data;
    }

    public Object invoke() {
        List<m0> t = this.c.a().t();
        i.d(t, "descriptor.declaredTypeParameters");
        ArrayList arrayList = new ArrayList(h.K(t, 10));
        for (m0 m0Var : t) {
            KClassImpl kClassImpl = KClassImpl.this;
            i.d(m0Var, "descriptor");
            arrayList.add(new KTypeParameterImpl(kClassImpl, m0Var));
        }
        return arrayList;
    }
}
