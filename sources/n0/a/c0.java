package n0.a;

import m0.l.c;
import m0.l.d;
import m0.l.e;
import m0.l.f.a.b;

/* compiled from: CoroutineContext.kt */
public final class c0 {
    public static final boolean a;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r0.equals("on") != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r0.equals("") != false) goto L_0x0053;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = m0.r.t.a.r.m.a1.a.P3(r0)
            if (r0 == 0) goto L_0x0053
            int r1 = r0.hashCode()
            if (r1 == 0) goto L_0x002a
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L_0x0021
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L_0x0033
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            r0 = 0
            goto L_0x0054
        L_0x0021:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            goto L_0x0053
        L_0x002a:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            goto L_0x0053
        L_0x0033:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0053:
            r0 = 1
        L_0x0054:
            a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.c0.<clinit>():void");
    }

    public static final e a(f0 f0Var, e eVar) {
        e plus = f0Var.C().plus(eVar);
        d0 d0Var = m0.a;
        if (plus == d0Var) {
            return plus;
        }
        int i = d.h;
        return plus.get(d.a.c) == null ? plus.plus(d0Var) : plus;
    }

    public static final b2<?> b(c<?> cVar, e eVar, Object obj) {
        b2<?> b2Var = null;
        if (!(cVar instanceof b)) {
            return null;
        }
        if (!(eVar.get(c2.c) != null)) {
            return null;
        }
        b bVar = (b) cVar;
        while (true) {
            if (!(bVar instanceof k0) && (bVar = bVar.getCallerFrame()) != null) {
                if (bVar instanceof b2) {
                    b2Var = (b2) bVar;
                    break;
                }
            } else {
                break;
            }
        }
        if (b2Var != null) {
            b2Var.x = eVar;
            b2Var.y = obj;
        }
        return b2Var;
    }
}
