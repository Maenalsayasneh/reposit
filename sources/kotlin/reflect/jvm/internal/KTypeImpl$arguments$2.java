package kotlin.reflect.jvm.internal;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KVariance;
import m0.c;
import m0.j.g;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.k;
import m0.r.p;
import m0.r.t.a.r.m.m0;
import m0.r.t.a.r.m.v;

/* compiled from: KTypeImpl.kt */
public final class KTypeImpl$arguments$2 extends Lambda implements a<List<? extends p>> {
    public final /* synthetic */ KTypeImpl c;
    public final /* synthetic */ a d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KTypeImpl$arguments$2(KTypeImpl kTypeImpl, a aVar) {
        super(0);
        this.c = kTypeImpl;
        this.d = aVar;
    }

    public Object invoke() {
        p pVar;
        List<m0> H0 = this.c.y.H0();
        if (H0.isEmpty()) {
            return EmptyList.c;
        }
        c G2 = h.G2(LazyThreadSafetyMode.PUBLICATION, new KTypeImpl$arguments$2$parameterizedTypeArguments$2(this));
        ArrayList arrayList = new ArrayList(h.K(H0, 10));
        int i = 0;
        for (T next : H0) {
            int i2 = i + 1;
            KTypeImpl$arguments$2$$special$$inlined$mapIndexed$lambda$1 kTypeImpl$arguments$2$$special$$inlined$mapIndexed$lambda$1 = null;
            if (i >= 0) {
                m0 m0Var = (m0) next;
                if (m0Var.c()) {
                    p.a aVar = p.b;
                    pVar = p.a;
                } else {
                    v type = m0Var.getType();
                    i.d(type, "typeProjection.type");
                    if (this.d != null) {
                        kTypeImpl$arguments$2$$special$$inlined$mapIndexed$lambda$1 = new KTypeImpl$arguments$2$$special$$inlined$mapIndexed$lambda$1(i, this, G2, (k) null);
                    }
                    KTypeImpl kTypeImpl = new KTypeImpl(type, kTypeImpl$arguments$2$$special$$inlined$mapIndexed$lambda$1);
                    int ordinal = m0Var.b().ordinal();
                    if (ordinal == 0) {
                        pVar = p.b.a(kTypeImpl);
                    } else if (ordinal == 1) {
                        p.a aVar2 = p.b;
                        i.e(kTypeImpl, "type");
                        pVar = new p(KVariance.IN, kTypeImpl);
                    } else if (ordinal == 2) {
                        p.a aVar3 = p.b;
                        i.e(kTypeImpl, "type");
                        pVar = new p(KVariance.OUT, kTypeImpl);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                arrayList.add(pVar);
                i = i2;
            } else {
                g.r0();
                throw null;
            }
        }
        return arrayList;
    }
}
