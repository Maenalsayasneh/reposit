package s0.a.a.d3;

import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;

public class a extends m {
    public k c;
    public k d;
    public k q;
    public k x;
    public b y;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: s0.a.a.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(s0.a.a.s r4) {
        /*
            r3 = this;
            r3.<init>()
            int r0 = r4.size()
            r1 = 3
            if (r0 < r1) goto L_0x0079
            int r0 = r4.size()
            r1 = 5
            if (r0 > r1) goto L_0x0079
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
            if (r0 == 0) goto L_0x005d
            boolean r2 = r0 instanceof s0.a.a.k
            if (r2 == 0) goto L_0x005d
            s0.a.a.k r0 = s0.a.a.k.B(r0)
            r3.x = r0
            boolean r0 = r4.hasMoreElements()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r4 = r4.nextElement()
            r0 = r4
            s0.a.a.e r0 = (s0.a.a.e) r0
            goto L_0x005d
        L_0x005c:
            r0 = r1
        L_0x005d:
            if (r0 == 0) goto L_0x0078
            s0.a.a.r r4 = r0.c()
            boolean r0 = r4 instanceof s0.a.a.d3.b
            if (r0 == 0) goto L_0x006b
            r1 = r4
            s0.a.a.d3.b r1 = (s0.a.a.d3.b) r1
            goto L_0x0076
        L_0x006b:
            if (r4 == 0) goto L_0x0076
            s0.a.a.d3.b r1 = new s0.a.a.d3.b
            s0.a.a.s r4 = s0.a.a.s.B(r4)
            r1.<init>(r4)
        L_0x0076:
            r3.y = r1
        L_0x0078:
            return
        L_0x0079:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Bad sequence size: "
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            java.lang.String r4 = i0.d.a.a.a.K0(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.a.d3.a.<init>(s0.a.a.s):void");
    }

    public static a s(Object obj) {
        if (obj == null || (obj instanceof a)) {
            return (a) obj;
        }
        if (obj instanceof s) {
            return new a((s) obj);
        }
        throw new IllegalArgumentException(i0.d.a.a.a.c0(obj, i0.d.a.a.a.P0("Invalid DHDomainParameters: ")));
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
        b bVar = this.y;
        if (bVar != null) {
            fVar.a(bVar);
        }
        return new b1(fVar);
    }
}
