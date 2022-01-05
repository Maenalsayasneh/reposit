package m0.r.t.a.r.e.b;

import i0.j.f.p.h;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import m0.n.b.i;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.j.d;
import m0.r.t.a.r.m.v;

/* compiled from: methodSignatureMapping.kt */
public final class n {
    public static final void a(StringBuilder sb, v vVar) {
        sb.append(d(vVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        if ((r3 instanceof m0.r.t.a.r.c.d0) == false) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(m0.r.t.a.r.c.r r3, boolean r4, boolean r5, int r6) {
        /*
            r0 = r6 & 1
            r1 = 1
            if (r0 == 0) goto L_0x0006
            r4 = r1
        L_0x0006:
            r6 = r6 & 2
            if (r6 == 0) goto L_0x000b
            r5 = r1
        L_0x000b:
            java.lang.String r6 = "<this>"
            m0.n.b.i.e(r3, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r5 == 0) goto L_0x002e
            boolean r5 = r3 instanceof m0.r.t.a.r.c.h
            if (r5 == 0) goto L_0x001e
            java.lang.String r5 = "<init>"
            goto L_0x002b
        L_0x001e:
            m0.r.t.a.r.g.d r5 = r3.getName()
            java.lang.String r5 = r5.b()
            java.lang.String r0 = "name.asString()"
            m0.n.b.i.d(r5, r0)
        L_0x002b:
            r6.append(r5)
        L_0x002e:
            java.lang.String r5 = "("
            r6.append(r5)
            m0.r.t.a.r.c.f0 r5 = r3.l0()
            if (r5 != 0) goto L_0x003a
            goto L_0x0046
        L_0x003a:
            m0.r.t.a.r.m.v r5 = r5.getType()
            java.lang.String r0 = "it.type"
            m0.n.b.i.d(r5, r0)
            a(r6, r5)
        L_0x0046:
            java.util.List r5 = r3.h()
            java.util.Iterator r5 = r5.iterator()
        L_0x004e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0067
            java.lang.Object r0 = r5.next()
            m0.r.t.a.r.c.o0 r0 = (m0.r.t.a.r.c.o0) r0
            m0.r.t.a.r.m.v r0 = r0.getType()
            java.lang.String r2 = "parameter.type"
            m0.n.b.i.d(r0, r2)
            a(r6, r0)
            goto L_0x004e
        L_0x0067:
            java.lang.String r5 = ")"
            r6.append(r5)
            if (r4 == 0) goto L_0x00aa
            java.lang.String r4 = "descriptor"
            m0.n.b.i.e(r3, r4)
            boolean r4 = r3 instanceof m0.r.t.a.r.c.h
            if (r4 == 0) goto L_0x0078
            goto L_0x0098
        L_0x0078:
            m0.r.t.a.r.m.v r4 = r3.getReturnType()
            m0.n.b.i.c(r4)
            boolean r4 = m0.r.t.a.r.b.f.N(r4)
            if (r4 == 0) goto L_0x0097
            m0.r.t.a.r.m.v r4 = r3.getReturnType()
            m0.n.b.i.c(r4)
            boolean r4 = m0.r.t.a.r.m.s0.g(r4)
            if (r4 != 0) goto L_0x0097
            boolean r4 = r3 instanceof m0.r.t.a.r.c.d0
            if (r4 != 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r1 = 0
        L_0x0098:
            if (r1 == 0) goto L_0x00a0
            java.lang.String r3 = "V"
            r6.append(r3)
            goto L_0x00aa
        L_0x00a0:
            m0.r.t.a.r.m.v r3 = r3.getReturnType()
            m0.n.b.i.c(r3)
            a(r6, r3)
        L_0x00aa:
            java.lang.String r3 = r6.toString()
            java.lang.String r4 = "StringBuilder().apply(builderAction).toString()"
            m0.n.b.i.d(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.e.b.n.b(m0.r.t.a.r.c.r, boolean, boolean, int):java.lang.String");
    }

    public static final String c(a aVar) {
        i.e(aVar, "<this>");
        p pVar = p.a;
        if (d.t(aVar)) {
            return null;
        }
        m0.r.t.a.r.c.i b = aVar.b();
        m0.r.t.a.r.c.d dVar = b instanceof m0.r.t.a.r.c.d ? (m0.r.t.a.r.c.d) b : null;
        if (dVar == null || dVar.getName().d) {
            return null;
        }
        a a = aVar.a();
        g0 g0Var = a instanceof g0 ? (g0) a : null;
        if (g0Var == null) {
            return null;
        }
        return h.Q3(pVar, dVar, b(g0Var, false, false, 3));
    }

    public static final f d(v vVar) {
        i.e(vVar, "<this>");
        return (f) h.T2(vVar, h.a, s.c, r.a, FunctionsKt.b);
    }
}
