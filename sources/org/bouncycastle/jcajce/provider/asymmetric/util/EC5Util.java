package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import s0.a.a.d3.h;
import s0.a.b.c0.a;
import s0.a.b.k0.w;
import s0.a.d.e.d;
import s0.a.e.b.b0.c.h3;
import s0.a.e.b.e;
import s0.a.e.c.c;

public class EC5Util {
    private static Map customCurves = new HashMap();

    static {
        Enumeration elements = a.K.elements();
        while (elements.hasMoreElements()) {
            String str = (String) elements.nextElement();
            h G1 = m0.r.t.a.r.m.a1.a.G1(str);
            if (G1 != null) {
                customCurves.put(G1.q, a.e(str).q);
            }
        }
        e eVar = a.e("Curve25519").q;
        customCurves.put(new e.C0302e(eVar.a.c(), eVar.b.t(), eVar.c.t(), eVar.d, eVar.e), eVar);
    }

    public static EllipticCurve convertCurve(e eVar, byte[] bArr) {
        return new EllipticCurve(convertField(eVar.a), eVar.b.t(), eVar.c.t(), (byte[]) null);
    }

    public static ECField convertField(s0.a.e.c.a aVar) {
        if (aVar.b() == 1) {
            return new ECFieldFp(aVar.c());
        }
        c a = ((s0.a.e.c.e) aVar).a();
        int[] b = a.b();
        int d1 = h3.d1(1, b.length - 1);
        int[] iArr = new int[d1];
        System.arraycopy(b, 1, iArr, 0, Math.min(b.length - 1, d1));
        return new ECFieldF2m(a.a(), h3.K2(iArr));
    }

    public static ECPoint convertPoint(s0.a.e.b.h hVar) {
        s0.a.e.b.h q = hVar.q();
        return new ECPoint(q.d().t(), q.e().t());
    }

    public static s0.a.e.b.h convertPoint(ECParameterSpec eCParameterSpec, ECPoint eCPoint) {
        return convertPoint(convertCurve(eCParameterSpec.getCurve()), eCPoint);
    }

    public static s0.a.e.b.h convertPoint(e eVar, ECPoint eCPoint) {
        return eVar.e(eCPoint.getAffineX(), eCPoint.getAffineY());
    }

    public static ECParameterSpec convertSpec(EllipticCurve ellipticCurve, s0.a.d.e.e eVar) {
        ECPoint convertPoint = convertPoint(eVar.c);
        if (!(eVar instanceof s0.a.d.e.c)) {
            return new ECParameterSpec(ellipticCurve, convertPoint, eVar.d, eVar.e.intValue());
        }
        return new d(((s0.a.d.e.c) eVar).f, ellipticCurve, convertPoint, eVar.d, eVar.e);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [java.security.spec.ECParameterSpec] */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.security.spec.ECParameterSpec] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.security.spec.ECParameterSpec convertToSpec(s0.a.a.d3.f r8, s0.a.e.b.e r9) {
        /*
            s0.a.a.r r8 = r8.c
            boolean r0 = r8 instanceof s0.a.a.n
            if (r0 == 0) goto L_0x0040
            s0.a.a.n r8 = (s0.a.a.n) r8
            s0.a.a.d3.h r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByOid(r8)
            if (r0 != 0) goto L_0x0020
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r1 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION
            java.util.Map r1 = r1.getAdditionalECParameters()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0020
            java.lang.Object r0 = r1.get(r8)
            s0.a.a.d3.h r0 = (s0.a.a.d3.h) r0
        L_0x0020:
            byte[] r1 = r0.u()
            java.security.spec.EllipticCurve r4 = convertCurve(r9, r1)
            s0.a.d.e.d r9 = new s0.a.d.e.d
            java.lang.String r3 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getCurveName(r8)
            s0.a.e.b.h r8 = r0.s()
            java.security.spec.ECPoint r5 = convertPoint(r8)
            java.math.BigInteger r6 = r0.y
            java.math.BigInteger r7 = r0.Y1
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x00b5
        L_0x0040:
            boolean r0 = r8 instanceof s0.a.a.l
            if (r0 == 0) goto L_0x0046
            r9 = 0
            goto L_0x00b5
        L_0x0046:
            s0.a.a.s r8 = s0.a.a.s.B(r8)
            int r0 = r8.size()
            r1 = 3
            if (r0 <= r1) goto L_0x0088
            s0.a.a.d3.h r8 = s0.a.a.d3.h.t(r8)
            byte[] r0 = r8.u()
            java.security.spec.EllipticCurve r9 = convertCurve(r9, r0)
            java.math.BigInteger r0 = r8.Y1
            if (r0 == 0) goto L_0x0077
            java.security.spec.ECParameterSpec r0 = new java.security.spec.ECParameterSpec
            s0.a.e.b.h r1 = r8.s()
            java.security.spec.ECPoint r1 = convertPoint(r1)
            java.math.BigInteger r2 = r8.y
            java.math.BigInteger r8 = r8.Y1
            int r8 = r8.intValue()
            r0.<init>(r9, r1, r2, r8)
            goto L_0x00b4
        L_0x0077:
            java.security.spec.ECParameterSpec r0 = new java.security.spec.ECParameterSpec
            s0.a.e.b.h r1 = r8.s()
            java.security.spec.ECPoint r1 = convertPoint(r1)
            java.math.BigInteger r8 = r8.y
            r2 = 1
            r0.<init>(r9, r1, r8, r2)
            goto L_0x00b4
        L_0x0088:
            s0.a.a.g2.f r8 = s0.a.a.g2.f.s(r8)
            s0.a.a.n r9 = r8.c
            java.lang.String r9 = s0.a.a.g2.b.b(r9)
            s0.a.d.e.c r9 = m0.r.t.a.r.m.a1.a.U1(r9)
            s0.a.e.b.e r0 = r9.a
            byte[] r1 = r9.b
            java.security.spec.EllipticCurve r4 = convertCurve(r0, r1)
            s0.a.d.e.d r0 = new s0.a.d.e.d
            s0.a.a.n r8 = r8.c
            java.lang.String r3 = s0.a.a.g2.b.b(r8)
            s0.a.e.b.h r8 = r9.c
            java.security.spec.ECPoint r5 = convertPoint(r8)
            java.math.BigInteger r6 = r9.d
            java.math.BigInteger r7 = r9.e
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x00b4:
            r9 = r0
        L_0x00b5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertToSpec(s0.a.a.d3.f, s0.a.e.b.e):java.security.spec.ECParameterSpec");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: s0.a.a.d3.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static s0.a.e.b.e getCurve(org.bouncycastle.jcajce.provider.config.ProviderConfiguration r2, s0.a.a.d3.f r3) {
        /*
            java.util.Set r0 = r2.getAcceptableNamedCurves()
            s0.a.a.r r3 = r3.c
            boolean r1 = r3 instanceof s0.a.a.n
            if (r1 == 0) goto L_0x0037
            s0.a.a.n r3 = s0.a.a.n.D(r3)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0023
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0023
        L_0x001b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "named curve not acceptable"
            r2.<init>(r3)
            throw r2
        L_0x0023:
            s0.a.a.d3.h r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByOid(r3)
            if (r0 != 0) goto L_0x0034
            java.util.Map r2 = r2.getAdditionalECParameters()
            java.lang.Object r2 = r2.get(r3)
            r0 = r2
            s0.a.a.d3.h r0 = (s0.a.a.d3.h) r0
        L_0x0034:
            s0.a.e.b.e r2 = r0.q
            goto L_0x0068
        L_0x0037:
            boolean r1 = r3 instanceof s0.a.a.l
            if (r1 == 0) goto L_0x0042
            s0.a.d.e.e r2 = r2.getEcImplicitlyCa()
            s0.a.e.b.e r2 = r2.a
            goto L_0x0068
        L_0x0042:
            s0.a.a.s r2 = s0.a.a.s.B(r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0069
            int r3 = r2.size()
            r0 = 3
            if (r3 <= r0) goto L_0x005a
            s0.a.a.d3.h r2 = s0.a.a.d3.h.t(r2)
        L_0x0057:
            s0.a.e.b.e r2 = r2.q
            goto L_0x0068
        L_0x005a:
            r3 = 0
            s0.a.a.e r2 = r2.D(r3)
            s0.a.a.n r2 = s0.a.a.n.D(r2)
            s0.a.a.d3.h r2 = s0.a.a.g2.b.a(r2)
            goto L_0x0057
        L_0x0068:
            return r2
        L_0x0069:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "encoded parameters not acceptable"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getCurve(org.bouncycastle.jcajce.provider.config.ProviderConfiguration, s0.a.a.d3.f):s0.a.e.b.e");
    }

    public static w getDomainParameters(ProviderConfiguration providerConfiguration, ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec != null) {
            return ECUtil.getDomainParameters(providerConfiguration, convertSpec(eCParameterSpec));
        }
        s0.a.d.e.e ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
        return new w(ecImplicitlyCa.a, ecImplicitlyCa.c, ecImplicitlyCa.d, ecImplicitlyCa.e, ecImplicitlyCa.b);
    }

    public static e convertCurve(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        BigInteger a = ellipticCurve.getA();
        BigInteger b = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            e.C0302e eVar = new e.C0302e(((ECFieldFp) field).getP(), a, b, (BigInteger) null, (BigInteger) null);
            return customCurves.containsKey(eVar) ? (e) customCurves.get(eVar) : eVar;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m = eCFieldF2m.getM();
        int[] convertMidTerms = ECUtil.convertMidTerms(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new e.d(m, convertMidTerms[0], convertMidTerms[1], convertMidTerms[2], a, b);
    }

    public static s0.a.d.e.e convertSpec(ECParameterSpec eCParameterSpec) {
        e convertCurve = convertCurve(eCParameterSpec.getCurve());
        s0.a.e.b.h convertPoint = convertPoint(convertCurve, eCParameterSpec.getGenerator());
        BigInteger order = eCParameterSpec.getOrder();
        BigInteger valueOf = BigInteger.valueOf((long) eCParameterSpec.getCofactor());
        byte[] seed = eCParameterSpec.getCurve().getSeed();
        return eCParameterSpec instanceof d ? new s0.a.d.e.c(((d) eCParameterSpec).a, convertCurve, convertPoint, order, valueOf, seed) : new s0.a.d.e.e(convertCurve, convertPoint, order, valueOf, seed);
    }

    public static ECParameterSpec convertToSpec(h hVar) {
        return new ECParameterSpec(convertCurve(hVar.q, (byte[]) null), convertPoint(hVar.s()), hVar.y, hVar.Y1.intValue());
    }

    public static ECParameterSpec convertToSpec(w wVar) {
        return new ECParameterSpec(convertCurve(wVar.g, (byte[]) null), convertPoint(wVar.i), wVar.j, wVar.k.intValue());
    }
}
