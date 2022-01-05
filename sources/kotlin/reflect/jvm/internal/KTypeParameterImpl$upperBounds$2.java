package kotlin.reflect.jvm.internal;

import i0.j.f.p.h;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.m.v;

/* compiled from: KTypeParameterImpl.kt */
public final class KTypeParameterImpl$upperBounds$2 extends Lambda implements a<List<? extends KTypeImpl>> {
    public final /* synthetic */ KTypeParameterImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KTypeParameterImpl$upperBounds$2(KTypeParameterImpl kTypeParameterImpl) {
        super(0);
        this.c = kTypeParameterImpl;
    }

    public Object invoke() {
        List<v> upperBounds = this.c.x.getUpperBounds();
        i.d(upperBounds, "descriptor.upperBounds");
        ArrayList arrayList = new ArrayList(h.K(upperBounds, 10));
        for (v kTypeImpl : upperBounds) {
            arrayList.add(new KTypeImpl(kTypeImpl, (a<? extends Type>) null));
        }
        return arrayList;
    }
}
