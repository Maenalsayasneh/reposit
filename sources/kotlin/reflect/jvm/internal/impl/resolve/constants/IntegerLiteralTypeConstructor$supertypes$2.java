package kotlin.reflect.jvm.internal.impl.resolve.constants;

import i0.j.f.p.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.j.g;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.o0;
import m0.r.t.a.r.m.v;

/* compiled from: IntegerLiteralTypeConstructor.kt */
public final class IntegerLiteralTypeConstructor$supertypes$2 extends Lambda implements a<List<a0>> {
    public final /* synthetic */ IntegerLiteralTypeConstructor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntegerLiteralTypeConstructor$supertypes$2(IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        super(0);
        this.c = integerLiteralTypeConstructor;
    }

    public Object invoke() {
        boolean z = true;
        a0 q = this.c.m().k("Comparable").q();
        i.d(q, "builtIns.comparable.defaultType");
        List U = g.U(h.v3(q, h.L2(new o0(Variance.IN_VARIANCE, this.c.d)), (f) null, 2));
        IntegerLiteralTypeConstructor integerLiteralTypeConstructor = this.c;
        u uVar = integerLiteralTypeConstructor.b;
        i.e(uVar, "<this>");
        a0[] a0VarArr = new a0[4];
        a0VarArr[0] = uVar.m().n();
        m0.r.t.a.r.b.f m = uVar.m();
        Objects.requireNonNull(m);
        a0 t = m.t(PrimitiveType.LONG);
        if (t != null) {
            a0VarArr[1] = t;
            m0.r.t.a.r.b.f m2 = uVar.m();
            Objects.requireNonNull(m2);
            a0 t2 = m2.t(PrimitiveType.BYTE);
            if (t2 != null) {
                a0VarArr[2] = t2;
                m0.r.t.a.r.b.f m3 = uVar.m();
                Objects.requireNonNull(m3);
                a0 t3 = m3.t(PrimitiveType.SHORT);
                if (t3 != null) {
                    a0VarArr[3] = t3;
                    List K = g.K(a0VarArr);
                    if (!(K instanceof Collection) || !K.isEmpty()) {
                        Iterator it = K.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (!(!integerLiteralTypeConstructor.c.contains((v) it.next()))) {
                                z = false;
                                break;
                            }
                        }
                    }
                    if (!z) {
                        a0 q2 = this.c.m().k("Number").q();
                        if (q2 != null) {
                            U.add(q2);
                        } else {
                            m0.r.t.a.r.b.f.a(54);
                            throw null;
                        }
                    }
                    return U;
                }
                m0.r.t.a.r.b.f.a(56);
                throw null;
            }
            m0.r.t.a.r.b.f.a(55);
            throw null;
        }
        m0.r.t.a.r.b.f.a(58);
        throw null;
    }
}
