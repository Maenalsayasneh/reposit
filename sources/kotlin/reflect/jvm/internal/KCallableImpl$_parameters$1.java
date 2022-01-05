package kotlin.reflect.jvm.internal;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.d;
import m0.r.t.a.o;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.z;
import m0.r.t.a.r.e.a.t.b;

/* compiled from: KCallableImpl.kt */
public final class KCallableImpl$_parameters$1 extends Lambda implements a<ArrayList<KParameter>> {
    public final /* synthetic */ KCallableImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KCallableImpl$_parameters$1(KCallableImpl kCallableImpl) {
        super(0);
        this.c = kCallableImpl;
    }

    public Object invoke() {
        int i;
        final CallableMemberDescriptor p = this.c.p();
        ArrayList arrayList = new ArrayList();
        final int i2 = 0;
        if (!this.c.r()) {
            f0 e = o.e(p);
            if (e != null) {
                arrayList.add(new KParameterImpl(this.c, 0, KParameter.Kind.INSTANCE, new w(0, e)));
                i = 1;
            } else {
                i = 0;
            }
            f0 l02 = p.l0();
            if (l02 != null) {
                arrayList.add(new KParameterImpl(this.c, i, KParameter.Kind.EXTENSION_RECEIVER, new w(1, l02)));
                i++;
            }
        } else {
            i = 0;
        }
        List<o0> h = p.h();
        i.d(h, "descriptor.valueParameters");
        int size = h.size();
        while (i2 < size) {
            arrayList.add(new KParameterImpl(this.c, i, KParameter.Kind.VALUE, new a<z>() {
                public Object invoke() {
                    o0 o0Var = CallableMemberDescriptor.this.h().get(i2);
                    i.d(o0Var, "descriptor.valueParameters[i]");
                    return o0Var;
                }
            }));
            i2++;
            i++;
        }
        if (this.c.q() && (p instanceof b) && arrayList.size() > 1) {
            h.U3(arrayList, new d());
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
