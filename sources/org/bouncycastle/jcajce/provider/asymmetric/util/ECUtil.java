package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.math.BigInteger;
import java.security.AccessController;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Enumeration;
import java.util.Vector;
import m0.r.t.a.r.m.a1.a;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import s0.a.a.c3.m0;
import s0.a.a.d3.i;
import s0.a.a.n;
import s0.a.a.w2.p;
import s0.a.b.k0.a0;
import s0.a.b.k0.b;
import s0.a.b.k0.b0;
import s0.a.b.k0.c0;
import s0.a.b.k0.w;
import s0.a.d.e.c;
import s0.a.d.e.e;
import s0.a.e.b.b0.c.h3;
import s0.a.e.b.h;
import s0.a.g.j;

public class ECUtil {
    public static int[] convertMidTerms(int[] iArr) {
        int[] iArr2 = new int[3];
        if (iArr.length == 1) {
            iArr2[0] = iArr[0];
        } else if (iArr.length != 3) {
            throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
        } else if (iArr[0] < iArr[1] && iArr[0] < iArr[2]) {
            iArr2[0] = iArr[0];
            if (iArr[1] < iArr[2]) {
                iArr2[1] = iArr[1];
                iArr2[2] = iArr[2];
            } else {
                iArr2[1] = iArr[2];
                iArr2[2] = iArr[1];
            }
        } else if (iArr[1] < iArr[2]) {
            iArr2[0] = iArr[1];
            if (iArr[0] < iArr[2]) {
                iArr2[1] = iArr[0];
                iArr2[2] = iArr[2];
            } else {
                iArr2[1] = iArr[2];
                iArr2[2] = iArr[0];
            }
        } else {
            iArr2[0] = iArr[2];
            if (iArr[0] < iArr[1]) {
                iArr2[1] = iArr[0];
                iArr2[2] = iArr[1];
            } else {
                iArr2[1] = iArr[1];
                iArr2[2] = iArr[0];
            }
        }
        return iArr2;
    }

    public static String generateKeyFingerprint(h hVar, e eVar) {
        s0.a.e.b.e eVar2 = eVar.a;
        h hVar2 = eVar.c;
        if (eVar2 != null) {
            return new s0.a.g.e(h3.T(hVar.i(false), eVar2.b.e(), eVar2.c.e(), hVar2.i(false)), 160).toString();
        }
        return new s0.a.g.e(hVar.i(false), 160).toString();
    }

    public static b generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) privateKey;
            e parameters = eCPrivateKey.getParameters();
            if (parameters == null) {
                parameters = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            }
            if (!(eCPrivateKey.getParameters() instanceof c)) {
                return new b0(eCPrivateKey.getD(), new w(parameters.a, parameters.c, parameters.d, parameters.e, parameters.b));
            }
            return new b0(eCPrivateKey.getD(), new a0(a.S1(((c) eCPrivateKey.getParameters()).f), parameters.a, parameters.c, parameters.d, parameters.e, parameters.b));
        } else if (privateKey instanceof java.security.interfaces.ECPrivateKey) {
            java.security.interfaces.ECPrivateKey eCPrivateKey2 = (java.security.interfaces.ECPrivateKey) privateKey;
            e convertSpec = EC5Util.convertSpec(eCPrivateKey2.getParams());
            return new b0(eCPrivateKey2.getS(), new w(convertSpec.a, convertSpec.c, convertSpec.d, convertSpec.e, convertSpec.b));
        } else {
            try {
                byte[] encoded = privateKey.getEncoded();
                if (encoded != null) {
                    PrivateKey privateKey2 = BouncyCastleProvider.getPrivateKey(p.s(encoded));
                    if (privateKey2 instanceof java.security.interfaces.ECPrivateKey) {
                        return generatePrivateKeyParameter(privateKey2);
                    }
                    throw new InvalidKeyException("can't identify EC private key.");
                }
                throw new InvalidKeyException("no encoding for EC private key");
            } catch (Exception e) {
                throw new InvalidKeyException(i0.d.a.a.a.b0(e, i0.d.a.a.a.P0("cannot identify EC private key: ")));
            }
        }
    }

    public static b generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            e parameters = eCPublicKey.getParameters();
            return new c0(eCPublicKey.getQ(), new w(parameters.a, parameters.c, parameters.d, parameters.e, parameters.b));
        } else if (publicKey instanceof java.security.interfaces.ECPublicKey) {
            java.security.interfaces.ECPublicKey eCPublicKey2 = (java.security.interfaces.ECPublicKey) publicKey;
            e convertSpec = EC5Util.convertSpec(eCPublicKey2.getParams());
            return new c0(EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), new w(convertSpec.a, convertSpec.c, convertSpec.d, convertSpec.e, convertSpec.b));
        } else {
            try {
                byte[] encoded = publicKey.getEncoded();
                if (encoded != null) {
                    PublicKey publicKey2 = BouncyCastleProvider.getPublicKey(m0.s(encoded));
                    if (publicKey2 instanceof java.security.interfaces.ECPublicKey) {
                        return generatePublicKeyParameter(publicKey2);
                    }
                    throw new InvalidKeyException("cannot identify EC public key.");
                }
                throw new InvalidKeyException("no encoding for EC public key");
            } catch (Exception e) {
                throw new InvalidKeyException(i0.d.a.a.a.b0(e, i0.d.a.a.a.P0("cannot identify EC public key: ")));
            }
        }
    }

    public static String getCurveName(n nVar) {
        return a.Q1(nVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: s0.a.a.d3.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static s0.a.b.k0.w getDomainParameters(org.bouncycastle.jcajce.provider.config.ProviderConfiguration r6, s0.a.a.d3.f r7) {
        /*
            s0.a.a.r r7 = r7.c
            boolean r0 = r7 instanceof s0.a.a.n
            if (r0 == 0) goto L_0x0021
            s0.a.a.n r7 = s0.a.a.n.D(r7)
            s0.a.a.d3.h r0 = getNamedCurveByOid(r7)
            if (r0 != 0) goto L_0x001b
            java.util.Map r6 = r6.getAdditionalECParameters()
            java.lang.Object r6 = r6.get(r7)
            r0 = r6
            s0.a.a.d3.h r0 = (s0.a.a.d3.h) r0
        L_0x001b:
            s0.a.b.k0.a0 r6 = new s0.a.b.k0.a0
            r6.<init>((s0.a.a.n) r7, (s0.a.a.d3.h) r0)
            goto L_0x0053
        L_0x0021:
            boolean r0 = r7 instanceof s0.a.a.l
            if (r0 == 0) goto L_0x003a
            s0.a.d.e.e r6 = r6.getEcImplicitlyCa()
            s0.a.b.k0.w r7 = new s0.a.b.k0.w
            s0.a.e.b.e r1 = r6.a
            s0.a.e.b.h r2 = r6.c
            java.math.BigInteger r3 = r6.d
            java.math.BigInteger r4 = r6.e
            byte[] r5 = r6.b
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0052
        L_0x003a:
            s0.a.a.d3.h r6 = s0.a.a.d3.h.t(r7)
            s0.a.b.k0.w r7 = new s0.a.b.k0.w
            s0.a.e.b.e r1 = r6.q
            s0.a.e.b.h r2 = r6.s()
            java.math.BigInteger r3 = r6.y
            java.math.BigInteger r4 = r6.Y1
            byte[] r5 = r6.u()
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0052:
            r6 = r7
        L_0x0053:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getDomainParameters(org.bouncycastle.jcajce.provider.config.ProviderConfiguration, s0.a.a.d3.f):s0.a.b.k0.w");
    }

    public static String getNameFrom(final AlgorithmParameterSpec algorithmParameterSpec) {
        return (String) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                try {
                    return algorithmParameterSpec.getClass().getMethod("getName", new Class[0]).invoke(algorithmParameterSpec, new Object[0]);
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    public static s0.a.a.d3.h getNamedCurveByName(String str) {
        s0.a.a.d3.h e = s0.a.b.c0.a.e(str);
        return e == null ? a.G1(str) : e;
    }

    public static s0.a.a.d3.h getNamedCurveByOid(n nVar) {
        i iVar = (i) s0.a.b.c0.a.I.get(nVar);
        s0.a.a.d3.h b = iVar == null ? null : iVar.b();
        return b == null ? a.H1(nVar) : b;
    }

    public static n getNamedCurveOid(String str) {
        int indexOf = str.indexOf(32);
        if (indexOf > 0) {
            str = str.substring(indexOf + 1);
        }
        try {
            if (str.charAt(0) >= '0' && str.charAt(0) <= '2') {
                return new n(str);
            }
        } catch (IllegalArgumentException unused) {
        }
        return a.S1(str);
    }

    public static n getNamedCurveOid(e eVar) {
        Vector vector = new Vector();
        a.L(vector, s0.a.a.d3.e.x.keys());
        a.L(vector, s0.a.a.y2.c.J.elements());
        a.L(vector, s0.a.a.r2.a.a.keys());
        a.L(vector, s0.a.a.z2.a.q.elements());
        a.L(vector, s0.a.a.b2.a.d.elements());
        a.L(vector, s0.a.a.g2.b.c.elements());
        a.L(vector, s0.a.a.j2.a.e.elements());
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            String str = (String) elements.nextElement();
            s0.a.a.d3.h G1 = a.G1(str);
            if (G1.y.equals(eVar.d) && G1.Y1.equals(eVar.e) && G1.q.j(eVar.a) && G1.s().c(eVar.c)) {
                return a.S1(str);
            }
        }
        return null;
    }

    public static int getOrderBitLength(ProviderConfiguration providerConfiguration, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger != null) {
            return bigInteger.bitLength();
        }
        e ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
        if (ecImplicitlyCa == null) {
            return bigInteger2.bitLength();
        }
        return ecImplicitlyCa.d.bitLength();
    }

    public static String privateKeyToString(String str, BigInteger bigInteger, e eVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = j.a;
        h q = new s0.a.e.b.i().a(eVar.c, bigInteger).q();
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [");
        stringBuffer.append(generateKeyFingerprint(q, eVar));
        stringBuffer.append("]");
        stringBuffer.append(str2);
        stringBuffer.append("            X: ");
        stringBuffer.append(q.d().t().toString(16));
        stringBuffer.append(str2);
        stringBuffer.append("            Y: ");
        stringBuffer.append(q.e().t().toString(16));
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    public static String publicKeyToString(String str, h hVar, e eVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = j.a;
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [");
        stringBuffer.append(generateKeyFingerprint(hVar, eVar));
        stringBuffer.append("]");
        stringBuffer.append(str2);
        stringBuffer.append("            X: ");
        stringBuffer.append(hVar.d().t().toString(16));
        stringBuffer.append(str2);
        stringBuffer.append("            Y: ");
        stringBuffer.append(hVar.e().t().toString(16));
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    public static w getDomainParameters(ProviderConfiguration providerConfiguration, e eVar) {
        if (eVar instanceof c) {
            c cVar = (c) eVar;
            return new a0(getNamedCurveOid(cVar.f), cVar.a, cVar.c, cVar.d, cVar.e, cVar.b);
        } else if (eVar != null) {
            return new w(eVar.a, eVar.c, eVar.d, eVar.e, eVar.b);
        } else {
            e ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
            return new w(ecImplicitlyCa.a, ecImplicitlyCa.c, ecImplicitlyCa.d, ecImplicitlyCa.e, ecImplicitlyCa.b);
        }
    }
}
