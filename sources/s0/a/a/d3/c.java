package s0.a.a.d3;

import java.math.BigInteger;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;

public class c extends m {
    public final k c;
    public final k d;
    public final k q;
    public final k x;
    public final d y;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: s0.a.a.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(s0.a.a.s r4) {
        /*
            r3 = this;
            r3.<init>()
            int r0 = r4.size()
            r1 = 3
            if (r0 < r1) goto L_0x007c
            int r0 = r4.size()
            r1 = 5
            if (r0 > r1) goto L_0x007c
            java.util.Enumeration r4 = r4.E()
            java.lang.Object r0 = r4.nextElement()
            s0.a.a.k r0 = s0.a.a.k.B(r0)
            r3.c = r0
            java.lang.Object r0 = r4.nextElement()
            s0.a.a.k r0 = s0.a.a.k.B(r0)
            r3.d = r0
            java.lang.Object r0 = r4.nextElement()
            s0.a.a.k r0 = s0.a.a.k.B(r0)
            r3.q = r0
            boolean r0 = r4.hasMoreElements()
            r1 = 0
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = r4.nextElement()
            s0.a.a.e r0 = (s0.a.a.e) r0
            goto L_0x0042
        L_0x0041:
            r0 = r1
        L_0x0042:
            if (r0 == 0) goto L_0x005e
            boolean r2 = r0 instanceof s0.a.a.k
            if (r2 == 0) goto L_0x005e
            s0.a.a.k r0 = s0.a.a.k.B(r0)
            r3.x = r0
            boolean r0 = r4.hasMoreElements()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r4 = r4.nextElement()
            r0 = r4
            s0.a.a.e r0 = (s0.a.a.e) r0
            goto L_0x0060
        L_0x005c:
            r0 = r1
            goto L_0x0060
        L_0x005e:
            r3.x = r1
        L_0x0060:
            if (r0 == 0) goto L_0x0079
            s0.a.a.r r4 = r0.c()
            boolean r0 = r4 instanceof s0.a.a.d3.d
            if (r0 == 0) goto L_0x006e
            r1 = r4
            s0.a.a.d3.d r1 = (s0.a.a.d3.d) r1
            goto L_0x0079
        L_0x006e:
            if (r4 == 0) goto L_0x0079
            s0.a.a.d3.d r1 = new s0.a.a.d3.d
            s0.a.a.s r4 = s0.a.a.s.B(r4)
            r1.<init>(r4)
        L_0x0079:
            r3.y = r1
            return
        L_0x007c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Bad sequence size: "
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            java.lang.String r4 = i0.d.a.a.a.K0(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.a.d3.c.<init>(s0.a.a.s):void");
    }

    public static c t(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(5);
        fVar.a(this.c);
        fVar.a(this.d);
        fVar.a(this.q);
        k kVar = this.x;
        if (kVar != null) {
            fVar.a(kVar);
        }
        d dVar = this.y;
        if (dVar != null) {
            fVar.a(dVar);
        }
        return new b1(fVar);
    }

    public BigInteger s() {
        return this.d.D();
    }

    public BigInteger u() {
        k kVar = this.x;
        if (kVar == null) {
            return null;
        }
        return kVar.D();
    }

    public BigInteger v() {
        return this.c.D();
    }

    public BigInteger w() {
        return this.q.D();
    }
}
