package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.m0;
import m0.r.t.a.r.m.q;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.v0;
import m0.r.t.a.r.m.x0.d;
import m0.r.t.a.r.m.x0.e;
import m0.r.t.a.r.m.z;

/* compiled from: RawType.kt */
public final class RawTypeImpl extends q implements z {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(a0 a0Var, a0 a0Var2) {
        super(a0Var, a0Var2);
        i.e(a0Var, "lowerBound");
        i.e(a0Var2, "upperBound");
        d.a.d(a0Var, a0Var2);
    }

    public static final List<String> S0(DescriptorRenderer descriptorRenderer, v vVar) {
        List<m0> H0 = vVar.H0();
        ArrayList arrayList = new ArrayList(h.K(H0, 10));
        for (m0 x : H0) {
            arrayList.add(descriptorRenderer.x(x));
        }
        return arrayList;
    }

    public static final String T0(String str, String str2) {
        if (!StringsKt__IndentKt.c(str, '<', false, 2)) {
            return str;
        }
        return StringsKt__IndentKt.Q(str, '<', (String) null, 2) + '<' + str2 + '>' + StringsKt__IndentKt.P(str, '>', (String) null, 2);
    }

    public v0 M0(boolean z) {
        return new RawTypeImpl(this.d.M0(z), this.q.M0(z));
    }

    public v0 O0(f fVar) {
        i.e(fVar, "newAnnotations");
        return new RawTypeImpl(this.d.Q0(fVar), this.q.Q0(fVar));
    }

    public a0 P0() {
        return this.d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00be A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String Q0(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer r12, m0.r.t.a.r.i.b r13) {
        /*
            r11 = this;
            java.lang.String r0 = "renderer"
            m0.n.b.i.e(r12, r0)
            java.lang.String r0 = "options"
            m0.n.b.i.e(r13, r0)
            m0.r.t.a.r.m.a0 r0 = r11.d
            java.lang.String r0 = r12.w(r0)
            m0.r.t.a.r.m.a0 r1 = r11.q
            java.lang.String r1 = r12.w(r1)
            boolean r13 = r13.o()
            if (r13 == 0) goto L_0x003b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "raw ("
            r12.append(r13)
            r12.append(r0)
            java.lang.String r13 = ".."
            r12.append(r13)
            r12.append(r1)
            r13 = 41
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            return r12
        L_0x003b:
            m0.r.t.a.r.m.a0 r13 = r11.q
            java.util.List r13 = r13.H0()
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x0050
            m0.r.t.a.r.b.f r13 = m0.r.t.a.r.m.a1.a.F1(r11)
            java.lang.String r12 = r12.t(r0, r1, r13)
            return r12
        L_0x0050:
            m0.r.t.a.r.m.a0 r13 = r11.d
            java.util.List r13 = S0(r12, r13)
            m0.r.t.a.r.m.a0 r2 = r11.q
            java.util.List r10 = S0(r12, r2)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl$render$newArgs$1 r8 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl$render$newArgs$1.c
            r9 = 30
            java.lang.String r3 = ", "
            r2 = r13
            java.lang.String r2 = m0.j.g.E(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.List r13 = m0.j.g.F0(r13, r10)
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            boolean r3 = r13.isEmpty()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x007a
            goto L_0x00ad
        L_0x007a:
            java.util.Iterator r13 = r13.iterator()
        L_0x007e:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x00ad
            java.lang.Object r3 = r13.next()
            kotlin.Pair r3 = (kotlin.Pair) r3
            A r6 = r3.c
            java.lang.String r6 = (java.lang.String) r6
            B r3 = r3.d
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r7 = "out "
            java.lang.String r7 = kotlin.text.StringsKt__IndentKt.x(r3, r7)
            boolean r6 = m0.n.b.i.a(r6, r7)
            if (r6 != 0) goto L_0x00a9
            java.lang.String r6 = "*"
            boolean r3 = m0.n.b.i.a(r3, r6)
            if (r3 == 0) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            r3 = r4
            goto L_0x00aa
        L_0x00a9:
            r3 = r5
        L_0x00aa:
            if (r3 != 0) goto L_0x007e
            goto L_0x00ae
        L_0x00ad:
            r4 = r5
        L_0x00ae:
            if (r4 == 0) goto L_0x00b4
            java.lang.String r1 = T0(r1, r2)
        L_0x00b4:
            java.lang.String r13 = T0(r0, r2)
            boolean r0 = m0.n.b.i.a(r13, r1)
            if (r0 == 0) goto L_0x00bf
            return r13
        L_0x00bf:
            m0.r.t.a.r.b.f r0 = m0.r.t.a.r.m.a1.a.F1(r11)
            java.lang.String r12 = r12.t(r13, r1, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl.Q0(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer, m0.r.t.a.r.i.b):java.lang.String");
    }

    /* renamed from: R0 */
    public q N0(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        return new RawTypeImpl((a0) eVar.g(this.d), (a0) eVar.g(this.q), true);
    }

    public MemberScope o() {
        m0.r.t.a.r.c.f c = I0().c();
        m0.r.t.a.r.c.d dVar = c instanceof m0.r.t.a.r.c.d ? (m0.r.t.a.r.c.d) c : null;
        if (dVar != null) {
            MemberScope Z = dVar.Z(RawSubstitution.b);
            i.d(Z, "classDescriptor.getMemberScope(RawSubstitution)");
            return Z;
        }
        throw new IllegalStateException(i.k("Incorrect classifier: ", I0().c()).toString());
    }

    public RawTypeImpl(a0 a0Var, a0 a0Var2, boolean z) {
        super(a0Var, a0Var2);
        if (!z) {
            d.a.d(a0Var, a0Var2);
        }
    }
}
