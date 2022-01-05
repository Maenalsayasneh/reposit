package s0.a.d.e;

import java.math.BigInteger;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

public class d extends ECParameterSpec {
    public String a;

    public d(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        super(ellipticCurve, eCPoint, bigInteger, bigInteger2.intValue());
        this.a = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(java.lang.String r8, s0.a.e.b.e r9, s0.a.e.b.h r10, java.math.BigInteger r11, java.math.BigInteger r12, byte[] r13) {
        /*
            r7 = this;
            s0.a.e.c.a r0 = r9.a
            int r1 = r0.b()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000c
            r1 = r3
            goto L_0x000d
        L_0x000c:
            r1 = r2
        L_0x000d:
            if (r1 == 0) goto L_0x0019
            java.security.spec.ECFieldFp r1 = new java.security.spec.ECFieldFp
            java.math.BigInteger r0 = r0.c()
            r1.<init>(r0)
            goto L_0x0042
        L_0x0019:
            s0.a.e.c.e r0 = (s0.a.e.c.e) r0
            s0.a.e.c.c r0 = r0.a()
            int[] r1 = r0.b()
            int r4 = r1.length
            int r4 = r4 - r3
            int r4 = s0.a.e.b.b0.c.h3.d1(r3, r4)
            int[] r5 = new int[r4]
            int r6 = r1.length
            int r6 = r6 - r3
            int r4 = java.lang.Math.min(r6, r4)
            java.lang.System.arraycopy(r1, r3, r5, r2, r4)
            int[] r1 = s0.a.e.b.b0.c.h3.K2(r5)
            java.security.spec.ECFieldF2m r2 = new java.security.spec.ECFieldF2m
            int r0 = r0.a()
            r2.<init>(r0, r1)
            r1 = r2
        L_0x0042:
            s0.a.e.b.g r0 = r9.b
            java.math.BigInteger r0 = r0.t()
            s0.a.e.b.g r9 = r9.c
            java.math.BigInteger r9 = r9.t()
            java.security.spec.EllipticCurve r2 = new java.security.spec.EllipticCurve
            r2.<init>(r1, r0, r9, r13)
            java.security.spec.ECPoint r9 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r10)
            int r10 = r12.intValue()
            r7.<init>(r2, r9, r11, r10)
            r7.a = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.d.e.d.<init>(java.lang.String, s0.a.e.b.e, s0.a.e.b.h, java.math.BigInteger, java.math.BigInteger, byte[]):void");
    }
}
