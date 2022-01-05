package i0.l.a.f;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.util.Base64URL;
import com.pubnub.api.builder.PubNubErrorBuilder;
import i0.j.f.p.h;
import i0.l.a.e;
import i0.l.a.f.h.a;
import i0.l.a.f.h.d;
import i0.l.a.f.h.g;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPublicKey;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: ECDSAVerifier */
public class c extends d implements e {
    public static final Set<JWSAlgorithm> c;
    public final g d;
    public final ECPublicKey e;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWSAlgorithm.b2);
        linkedHashSet.add(JWSAlgorithm.c2);
        linkedHashSet.add(JWSAlgorithm.d2);
        linkedHashSet.add(JWSAlgorithm.e2);
        c = Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(java.security.interfaces.ECPublicKey r7) throws com.nimbusds.jose.JOSEException {
        /*
            r6 = this;
            java.security.spec.ECParameterSpec r0 = r7.getParams()
            com.nimbusds.jose.jwk.Curve r1 = com.nimbusds.jose.jwk.Curve.c
            java.security.spec.ECParameterSpec r1 = i0.l.a.h.a.a
            r1 = 0
            if (r0 != 0) goto L_0x000d
            goto L_0x018b
        L_0x000d:
            int r2 = i0.d.a.a.a.G(r0)
            java.security.spec.ECParameterSpec r3 = i0.l.a.h.a.a
            int r4 = i0.d.a.a.a.G(r3)
            if (r2 != r4) goto L_0x006d
            java.security.spec.EllipticCurve r2 = r0.getCurve()
            java.math.BigInteger r2 = r2.getA()
            boolean r2 = i0.d.a.a.a.A(r3, r2)
            if (r2 == 0) goto L_0x006d
            java.security.spec.EllipticCurve r2 = r0.getCurve()
            java.math.BigInteger r2 = r2.getB()
            boolean r2 = i0.d.a.a.a.B(r3, r2)
            if (r2 == 0) goto L_0x006d
            java.security.spec.ECPoint r2 = r0.getGenerator()
            java.math.BigInteger r2 = r2.getAffineX()
            boolean r2 = i0.d.a.a.a.C(r3, r2)
            if (r2 == 0) goto L_0x006d
            java.security.spec.ECPoint r2 = r0.getGenerator()
            java.math.BigInteger r2 = r2.getAffineY()
            boolean r2 = i0.d.a.a.a.D(r3, r2)
            if (r2 == 0) goto L_0x006d
            java.math.BigInteger r2 = r0.getOrder()
            java.math.BigInteger r4 = r3.getOrder()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x006d
            int r2 = r0.getCofactor()
            int r3 = r3.getCofactor()
            if (r2 != r3) goto L_0x006d
            com.nimbusds.jose.jwk.Curve r0 = com.nimbusds.jose.jwk.Curve.c
            goto L_0x018c
        L_0x006d:
            int r2 = i0.d.a.a.a.G(r0)
            java.security.spec.ECParameterSpec r3 = i0.l.a.h.a.b
            int r4 = i0.d.a.a.a.G(r3)
            if (r2 != r4) goto L_0x00cd
            java.security.spec.EllipticCurve r2 = r0.getCurve()
            java.math.BigInteger r2 = r2.getA()
            boolean r2 = i0.d.a.a.a.A(r3, r2)
            if (r2 == 0) goto L_0x00cd
            java.security.spec.EllipticCurve r2 = r0.getCurve()
            java.math.BigInteger r2 = r2.getB()
            boolean r2 = i0.d.a.a.a.B(r3, r2)
            if (r2 == 0) goto L_0x00cd
            java.security.spec.ECPoint r2 = r0.getGenerator()
            java.math.BigInteger r2 = r2.getAffineX()
            boolean r2 = i0.d.a.a.a.C(r3, r2)
            if (r2 == 0) goto L_0x00cd
            java.security.spec.ECPoint r2 = r0.getGenerator()
            java.math.BigInteger r2 = r2.getAffineY()
            boolean r2 = i0.d.a.a.a.D(r3, r2)
            if (r2 == 0) goto L_0x00cd
            java.math.BigInteger r2 = r0.getOrder()
            java.math.BigInteger r4 = r3.getOrder()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00cd
            int r2 = r0.getCofactor()
            int r3 = r3.getCofactor()
            if (r2 != r3) goto L_0x00cd
            com.nimbusds.jose.jwk.Curve r0 = com.nimbusds.jose.jwk.Curve.d
            goto L_0x018c
        L_0x00cd:
            int r2 = i0.d.a.a.a.G(r0)
            java.security.spec.ECParameterSpec r3 = i0.l.a.h.a.c
            int r4 = i0.d.a.a.a.G(r3)
            if (r2 != r4) goto L_0x012c
            java.security.spec.EllipticCurve r2 = r0.getCurve()
            java.math.BigInteger r2 = r2.getA()
            boolean r2 = i0.d.a.a.a.A(r3, r2)
            if (r2 == 0) goto L_0x012c
            java.security.spec.EllipticCurve r2 = r0.getCurve()
            java.math.BigInteger r2 = r2.getB()
            boolean r2 = i0.d.a.a.a.B(r3, r2)
            if (r2 == 0) goto L_0x012c
            java.security.spec.ECPoint r2 = r0.getGenerator()
            java.math.BigInteger r2 = r2.getAffineX()
            boolean r2 = i0.d.a.a.a.C(r3, r2)
            if (r2 == 0) goto L_0x012c
            java.security.spec.ECPoint r2 = r0.getGenerator()
            java.math.BigInteger r2 = r2.getAffineY()
            boolean r2 = i0.d.a.a.a.D(r3, r2)
            if (r2 == 0) goto L_0x012c
            java.math.BigInteger r2 = r0.getOrder()
            java.math.BigInteger r4 = r3.getOrder()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x012c
            int r2 = r0.getCofactor()
            int r3 = r3.getCofactor()
            if (r2 != r3) goto L_0x012c
            com.nimbusds.jose.jwk.Curve r0 = com.nimbusds.jose.jwk.Curve.x
            goto L_0x018c
        L_0x012c:
            int r2 = i0.d.a.a.a.G(r0)
            java.security.spec.ECParameterSpec r3 = i0.l.a.h.a.d
            int r4 = i0.d.a.a.a.G(r3)
            if (r2 != r4) goto L_0x018b
            java.security.spec.EllipticCurve r2 = r0.getCurve()
            java.math.BigInteger r2 = r2.getA()
            boolean r2 = i0.d.a.a.a.A(r3, r2)
            if (r2 == 0) goto L_0x018b
            java.security.spec.EllipticCurve r2 = r0.getCurve()
            java.math.BigInteger r2 = r2.getB()
            boolean r2 = i0.d.a.a.a.B(r3, r2)
            if (r2 == 0) goto L_0x018b
            java.security.spec.ECPoint r2 = r0.getGenerator()
            java.math.BigInteger r2 = r2.getAffineX()
            boolean r2 = i0.d.a.a.a.C(r3, r2)
            if (r2 == 0) goto L_0x018b
            java.security.spec.ECPoint r2 = r0.getGenerator()
            java.math.BigInteger r2 = r2.getAffineY()
            boolean r2 = i0.d.a.a.a.D(r3, r2)
            if (r2 == 0) goto L_0x018b
            java.math.BigInteger r2 = r0.getOrder()
            java.math.BigInteger r4 = r3.getOrder()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x018b
            int r0 = r0.getCofactor()
            int r2 = r3.getCofactor()
            if (r0 != r2) goto L_0x018b
            com.nimbusds.jose.jwk.Curve r0 = com.nimbusds.jose.jwk.Curve.y
            goto L_0x018c
        L_0x018b:
            r0 = r1
        L_0x018c:
            if (r0 == 0) goto L_0x029a
            com.nimbusds.jose.jwk.Curve r2 = com.nimbusds.jose.jwk.Curve.c
            boolean r3 = r2.equals(r0)
            if (r3 == 0) goto L_0x0199
            com.nimbusds.jose.JWSAlgorithm r0 = com.nimbusds.jose.JWSAlgorithm.b2
            goto L_0x01b9
        L_0x0199:
            com.nimbusds.jose.jwk.Curve r3 = com.nimbusds.jose.jwk.Curve.d
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x01a4
            com.nimbusds.jose.JWSAlgorithm r0 = com.nimbusds.jose.JWSAlgorithm.c2
            goto L_0x01b9
        L_0x01a4:
            com.nimbusds.jose.jwk.Curve r3 = com.nimbusds.jose.jwk.Curve.x
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x01af
            com.nimbusds.jose.JWSAlgorithm r0 = com.nimbusds.jose.JWSAlgorithm.d2
            goto L_0x01b9
        L_0x01af:
            com.nimbusds.jose.jwk.Curve r3 = com.nimbusds.jose.jwk.Curve.y
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0283
            com.nimbusds.jose.JWSAlgorithm r0 = com.nimbusds.jose.JWSAlgorithm.e2
        L_0x01b9:
            java.util.HashSet r3 = new java.util.HashSet
            java.util.List r4 = java.util.Collections.singletonList(r0)
            r3.<init>(r4)
            r6.<init>(r3)
            java.util.Set<com.nimbusds.jose.JWSAlgorithm> r3 = c
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L_0x026c
            i0.l.a.f.h.g r0 = new i0.l.a.f.h.g
            r0.<init>()
            r6.d = r0
            r6.e = r7
            java.util.Set<com.nimbusds.jose.JWSAlgorithm> r3 = r6.a
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r3 = r3.next()
            com.nimbusds.jose.JWSAlgorithm r3 = (com.nimbusds.jose.JWSAlgorithm) r3
            com.nimbusds.jose.JWSAlgorithm r4 = com.nimbusds.jose.JWSAlgorithm.b2
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x01ef
            java.util.Set r2 = java.util.Collections.singleton(r2)
            goto L_0x0240
        L_0x01ef:
            com.nimbusds.jose.JWSAlgorithm r2 = com.nimbusds.jose.JWSAlgorithm.c2
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01fe
            com.nimbusds.jose.jwk.Curve r2 = com.nimbusds.jose.jwk.Curve.d
            java.util.Set r2 = java.util.Collections.singleton(r2)
            goto L_0x0240
        L_0x01fe:
            com.nimbusds.jose.JWSAlgorithm r2 = com.nimbusds.jose.JWSAlgorithm.d2
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x020d
            com.nimbusds.jose.jwk.Curve r2 = com.nimbusds.jose.jwk.Curve.x
            java.util.Set r2 = java.util.Collections.singleton(r2)
            goto L_0x0240
        L_0x020d:
            com.nimbusds.jose.JWSAlgorithm r2 = com.nimbusds.jose.JWSAlgorithm.e2
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x021c
            com.nimbusds.jose.jwk.Curve r2 = com.nimbusds.jose.jwk.Curve.y
            java.util.Set r2 = java.util.Collections.singleton(r2)
            goto L_0x0240
        L_0x021c:
            com.nimbusds.jose.JWSAlgorithm r2 = com.nimbusds.jose.JWSAlgorithm.i2
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x023f
            java.util.HashSet r2 = new java.util.HashSet
            r3 = 2
            com.nimbusds.jose.jwk.Curve[] r3 = new com.nimbusds.jose.jwk.Curve[r3]
            r4 = 0
            com.nimbusds.jose.jwk.Curve r5 = com.nimbusds.jose.jwk.Curve.Y1
            r3[r4] = r5
            r4 = 1
            com.nimbusds.jose.jwk.Curve r5 = com.nimbusds.jose.jwk.Curve.Z1
            r3[r4] = r5
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.<init>(r3)
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r2)
            goto L_0x0240
        L_0x023f:
            r2 = r1
        L_0x0240:
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r2.next()
            com.nimbusds.jose.jwk.Curve r2 = (com.nimbusds.jose.jwk.Curve) r2
            java.security.spec.ECParameterSpec r2 = r2.b()
            java.security.spec.ECPoint r7 = r7.getW()
            java.math.BigInteger r3 = r7.getAffineX()
            java.math.BigInteger r7 = r7.getAffineY()
            boolean r7 = i0.j.f.p.h.u2(r3, r7, r2)
            if (r7 == 0) goto L_0x0264
            r0.b(r1)
            return
        L_0x0264:
            com.nimbusds.jose.JOSEException r7 = new com.nimbusds.jose.JOSEException
            java.lang.String r0 = "Curve / public key parameters mismatch"
            r7.<init>(r0)
            throw r7
        L_0x026c:
            com.nimbusds.jose.JOSEException r7 = new com.nimbusds.jose.JOSEException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported EC DSA algorithm: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        L_0x0283:
            com.nimbusds.jose.JOSEException r7 = new com.nimbusds.jose.JOSEException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected curve: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        L_0x029a:
            com.nimbusds.jose.JOSEException r7 = new com.nimbusds.jose.JOSEException
            java.lang.String r0 = "The EC key curve is not supported, must be P-256, P-384 or P-521"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.l.a.f.c.<init>(java.security.interfaces.ECPublicKey):void");
    }

    public boolean a(JWSHeader jWSHeader, byte[] bArr, Base64URL base64URL) throws JOSEException {
        String str;
        Signature signature;
        JWSAlgorithm jWSAlgorithm = (JWSAlgorithm) jWSHeader.d;
        if (!this.a.contains(jWSAlgorithm)) {
            throw new JOSEException(h.y4(jWSAlgorithm, this.a));
        } else if (!this.d.a(jWSHeader)) {
            return false;
        } else {
            byte[] a = base64URL.a();
            JWSAlgorithm jWSAlgorithm2 = (JWSAlgorithm) jWSHeader.d;
            JWSAlgorithm jWSAlgorithm3 = JWSAlgorithm.b2;
            int i = 64;
            if (!jWSAlgorithm2.equals(jWSAlgorithm3) && !jWSAlgorithm2.equals(JWSAlgorithm.c2)) {
                if (jWSAlgorithm2.equals(JWSAlgorithm.d2)) {
                    i = 96;
                } else if (jWSAlgorithm2.equals(JWSAlgorithm.e2)) {
                    i = PubNubErrorBuilder.PNERR_CHANNEL_MISSING;
                } else {
                    throw new JOSEException(h.y4(jWSAlgorithm2, c));
                }
            }
            if (i != a.length) {
                return false;
            }
            try {
                byte[] e2 = a.e(a);
                Provider provider = this.b.a;
                if (jWSAlgorithm.equals(jWSAlgorithm3) || jWSAlgorithm.equals(JWSAlgorithm.c2)) {
                    str = "SHA256withECDSA";
                } else if (jWSAlgorithm.equals(JWSAlgorithm.d2)) {
                    str = "SHA384withECDSA";
                } else if (jWSAlgorithm.equals(JWSAlgorithm.e2)) {
                    str = "SHA512withECDSA";
                } else {
                    throw new JOSEException(h.y4(jWSAlgorithm, c));
                }
                if (provider != null) {
                    try {
                        signature = Signature.getInstance(str, provider);
                    } catch (NoSuchAlgorithmException e3) {
                        StringBuilder P0 = i0.d.a.a.a.P0("Unsupported ECDSA algorithm: ");
                        P0.append(e3.getMessage());
                        throw new JOSEException(P0.toString(), e3);
                    }
                } else {
                    signature = Signature.getInstance(str);
                }
                try {
                    signature.initVerify(this.e);
                    signature.update(bArr);
                    return signature.verify(e2);
                } catch (InvalidKeyException e4) {
                    StringBuilder P02 = i0.d.a.a.a.P0("Invalid EC public key: ");
                    P02.append(e4.getMessage());
                    throw new JOSEException(P02.toString(), e4);
                } catch (SignatureException unused) {
                    return false;
                }
            } catch (JOSEException unused2) {
                return false;
            }
        }
    }
}
