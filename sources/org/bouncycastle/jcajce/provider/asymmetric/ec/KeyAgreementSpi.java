package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.interfaces.MQVPublicKey;
import s0.a.a.d3.l;
import s0.a.b.a0.c;
import s0.a.b.a0.f;
import s0.a.b.a0.l.a;
import s0.a.b.b0.a0;
import s0.a.b.b0.s;
import s0.a.b.b0.v;
import s0.a.b.b0.x;
import s0.a.b.b0.y;
import s0.a.b.d;
import s0.a.b.f0.r;
import s0.a.b.i;
import s0.a.b.k0.a1;
import s0.a.b.k0.c0;
import s0.a.b.k0.w;
import s0.a.c.n.e;
import s0.a.c.n.k;
import s0.a.e.b.b0.c.h3;

public class KeyAgreementSpi extends BaseAgreementSpi {
    private static final l converter = new l();
    private Object agreement;
    private e dheParameters;
    private String kaAlgorithm;
    private k mqvParameters;
    private w parameters;
    private byte[] result;

    public static class CDHwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA1KDFAndSharedInfo() {
            super("ECCDHwithSHA1KDF", (d) new s0.a.b.a0.d(), (s0.a.b.l) new r(new v()));
        }
    }

    public static class CDHwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA224KDFAndSharedInfo() {
            super("ECCDHwithSHA224KDF", (d) new s0.a.b.a0.d(), (s0.a.b.l) new r(new s0.a.b.b0.w()));
        }
    }

    public static class CDHwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA256KDFAndSharedInfo() {
            super("ECCDHwithSHA256KDF", (d) new s0.a.b.a0.d(), (s0.a.b.l) new r(new x()));
        }
    }

    public static class CDHwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA384KDFAndSharedInfo() {
            super("ECCDHwithSHA384KDF", (d) new s0.a.b.a0.d(), (s0.a.b.l) new r(new y()));
        }
    }

    public static class CDHwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA512KDFAndSharedInfo() {
            super("ECCDHwithSHA512KDF", (d) new s0.a.b.a0.d(), (s0.a.b.l) new r(new a0()));
        }
    }

    public static class DH extends KeyAgreementSpi {
        public DH() {
            super("ECDH", (d) new c(), (s0.a.b.l) null);
        }
    }

    public static class DHC extends KeyAgreementSpi {
        public DHC() {
            super("ECDHC", (d) new s0.a.b.a0.d(), (s0.a.b.l) null);
        }
    }

    public static class DHUC extends KeyAgreementSpi {
        public DHUC() {
            super("ECCDHU", new s0.a.b.a0.e(), (s0.a.b.l) null);
        }
    }

    public static class DHUwithSHA1CKDF extends KeyAgreementSpi {
        public DHUwithSHA1CKDF() {
            super("ECCDHUwithSHA1CKDF", new s0.a.b.a0.e(), (s0.a.b.l) new a(new v()));
        }
    }

    public static class DHUwithSHA1KDF extends KeyAgreementSpi {
        public DHUwithSHA1KDF() {
            super("ECCDHUwithSHA1KDF", new s0.a.b.a0.e(), (s0.a.b.l) new r(new v()));
        }
    }

    public static class DHUwithSHA224CKDF extends KeyAgreementSpi {
        public DHUwithSHA224CKDF() {
            super("ECCDHUwithSHA224CKDF", new s0.a.b.a0.e(), (s0.a.b.l) new a(new s0.a.b.b0.w()));
        }
    }

    public static class DHUwithSHA224KDF extends KeyAgreementSpi {
        public DHUwithSHA224KDF() {
            super("ECCDHUwithSHA224KDF", new s0.a.b.a0.e(), (s0.a.b.l) new r(new s0.a.b.b0.w()));
        }
    }

    public static class DHUwithSHA256CKDF extends KeyAgreementSpi {
        public DHUwithSHA256CKDF() {
            super("ECCDHUwithSHA256CKDF", new s0.a.b.a0.e(), (s0.a.b.l) new a(new x()));
        }
    }

    public static class DHUwithSHA256KDF extends KeyAgreementSpi {
        public DHUwithSHA256KDF() {
            super("ECCDHUwithSHA256KDF", new s0.a.b.a0.e(), (s0.a.b.l) new r(new x()));
        }
    }

    public static class DHUwithSHA384CKDF extends KeyAgreementSpi {
        public DHUwithSHA384CKDF() {
            super("ECCDHUwithSHA384CKDF", new s0.a.b.a0.e(), (s0.a.b.l) new a(new y()));
        }
    }

    public static class DHUwithSHA384KDF extends KeyAgreementSpi {
        public DHUwithSHA384KDF() {
            super("ECCDHUwithSHA384KDF", new s0.a.b.a0.e(), (s0.a.b.l) new r(new y()));
        }
    }

    public static class DHUwithSHA512CKDF extends KeyAgreementSpi {
        public DHUwithSHA512CKDF() {
            super("ECCDHUwithSHA512CKDF", new s0.a.b.a0.e(), (s0.a.b.l) new a(new a0()));
        }
    }

    public static class DHUwithSHA512KDF extends KeyAgreementSpi {
        public DHUwithSHA512KDF() {
            super("ECCDHUwithSHA512KDF", new s0.a.b.a0.e(), (s0.a.b.l) new r(new a0()));
        }
    }

    public static class DHwithSHA1CKDF extends KeyAgreementSpi {
        public DHwithSHA1CKDF() {
            super("ECDHwithSHA1CKDF", (d) new s0.a.b.a0.d(), (s0.a.b.l) new a(new v()));
        }
    }

    public static class DHwithSHA1KDF extends KeyAgreementSpi {
        public DHwithSHA1KDF() {
            super("ECDHwithSHA1KDF", (d) new c(), (s0.a.b.l) new r(new v()));
        }
    }

    public static class DHwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA1KDFAndSharedInfo() {
            super("ECDHwithSHA1KDF", (d) new c(), (s0.a.b.l) new r(new v()));
        }
    }

    public static class DHwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA224KDFAndSharedInfo() {
            super("ECDHwithSHA224KDF", (d) new c(), (s0.a.b.l) new r(new s0.a.b.b0.w()));
        }
    }

    public static class DHwithSHA256CKDF extends KeyAgreementSpi {
        public DHwithSHA256CKDF() {
            super("ECDHwithSHA256CKDF", (d) new s0.a.b.a0.d(), (s0.a.b.l) new a(new x()));
        }
    }

    public static class DHwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA256KDFAndSharedInfo() {
            super("ECDHwithSHA256KDF", (d) new c(), (s0.a.b.l) new r(new x()));
        }
    }

    public static class DHwithSHA384CKDF extends KeyAgreementSpi {
        public DHwithSHA384CKDF() {
            super("ECDHwithSHA384CKDF", (d) new s0.a.b.a0.d(), (s0.a.b.l) new a(new y()));
        }
    }

    public static class DHwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA384KDFAndSharedInfo() {
            super("ECDHwithSHA384KDF", (d) new c(), (s0.a.b.l) new r(new y()));
        }
    }

    public static class DHwithSHA512CKDF extends KeyAgreementSpi {
        public DHwithSHA512CKDF() {
            super("ECDHwithSHA512CKDF", (d) new s0.a.b.a0.d(), (s0.a.b.l) new a(new a0()));
        }
    }

    public static class DHwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA512KDFAndSharedInfo() {
            super("ECDHwithSHA512KDF", (d) new c(), (s0.a.b.l) new r(new a0()));
        }
    }

    public static class ECKAEGwithRIPEMD160KDF extends KeyAgreementSpi {
        public ECKAEGwithRIPEMD160KDF() {
            super("ECKAEGwithRIPEMD160KDF", (d) new c(), (s0.a.b.l) new r(new s()));
        }
    }

    public static class ECKAEGwithSHA1KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA1KDF() {
            super("ECKAEGwithSHA1KDF", (d) new c(), (s0.a.b.l) new r(new v()));
        }
    }

    public static class ECKAEGwithSHA224KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA224KDF() {
            super("ECKAEGwithSHA224KDF", (d) new c(), (s0.a.b.l) new r(new s0.a.b.b0.w()));
        }
    }

    public static class ECKAEGwithSHA256KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA256KDF() {
            super("ECKAEGwithSHA256KDF", (d) new c(), (s0.a.b.l) new r(new x()));
        }
    }

    public static class ECKAEGwithSHA384KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA384KDF() {
            super("ECKAEGwithSHA384KDF", (d) new c(), (s0.a.b.l) new r(new y()));
        }
    }

    public static class ECKAEGwithSHA512KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA512KDF() {
            super("ECKAEGwithSHA512KDF", (d) new c(), (s0.a.b.l) new r(new a0()));
        }
    }

    public static class MQV extends KeyAgreementSpi {
        public MQV() {
            super("ECMQV", (d) new f(), (s0.a.b.l) null);
        }
    }

    public static class MQVwithSHA1CKDF extends KeyAgreementSpi {
        public MQVwithSHA1CKDF() {
            super("ECMQVwithSHA1CKDF", (d) new f(), (s0.a.b.l) new a(new v()));
        }
    }

    public static class MQVwithSHA1KDF extends KeyAgreementSpi {
        public MQVwithSHA1KDF() {
            super("ECMQVwithSHA1KDF", (d) new f(), (s0.a.b.l) new r(new v()));
        }
    }

    public static class MQVwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA1KDFAndSharedInfo() {
            super("ECMQVwithSHA1KDF", (d) new f(), (s0.a.b.l) new r(new v()));
        }
    }

    public static class MQVwithSHA224CKDF extends KeyAgreementSpi {
        public MQVwithSHA224CKDF() {
            super("ECMQVwithSHA224CKDF", (d) new f(), (s0.a.b.l) new a(new s0.a.b.b0.w()));
        }
    }

    public static class MQVwithSHA224KDF extends KeyAgreementSpi {
        public MQVwithSHA224KDF() {
            super("ECMQVwithSHA224KDF", (d) new f(), (s0.a.b.l) new r(new s0.a.b.b0.w()));
        }
    }

    public static class MQVwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA224KDFAndSharedInfo() {
            super("ECMQVwithSHA224KDF", (d) new f(), (s0.a.b.l) new r(new s0.a.b.b0.w()));
        }
    }

    public static class MQVwithSHA256CKDF extends KeyAgreementSpi {
        public MQVwithSHA256CKDF() {
            super("ECMQVwithSHA256CKDF", (d) new f(), (s0.a.b.l) new a(new x()));
        }
    }

    public static class MQVwithSHA256KDF extends KeyAgreementSpi {
        public MQVwithSHA256KDF() {
            super("ECMQVwithSHA256KDF", (d) new f(), (s0.a.b.l) new r(new x()));
        }
    }

    public static class MQVwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA256KDFAndSharedInfo() {
            super("ECMQVwithSHA256KDF", (d) new f(), (s0.a.b.l) new r(new x()));
        }
    }

    public static class MQVwithSHA384CKDF extends KeyAgreementSpi {
        public MQVwithSHA384CKDF() {
            super("ECMQVwithSHA384CKDF", (d) new f(), (s0.a.b.l) new a(new y()));
        }
    }

    public static class MQVwithSHA384KDF extends KeyAgreementSpi {
        public MQVwithSHA384KDF() {
            super("ECMQVwithSHA384KDF", (d) new f(), (s0.a.b.l) new r(new y()));
        }
    }

    public static class MQVwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA384KDFAndSharedInfo() {
            super("ECMQVwithSHA384KDF", (d) new f(), (s0.a.b.l) new r(new y()));
        }
    }

    public static class MQVwithSHA512CKDF extends KeyAgreementSpi {
        public MQVwithSHA512CKDF() {
            super("ECMQVwithSHA512CKDF", (d) new f(), (s0.a.b.l) new a(new a0()));
        }
    }

    public static class MQVwithSHA512KDF extends KeyAgreementSpi {
        public MQVwithSHA512KDF() {
            super("ECMQVwithSHA512KDF", (d) new f(), (s0.a.b.l) new r(new a0()));
        }
    }

    public static class MQVwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA512KDFAndSharedInfo() {
            super("ECMQVwithSHA512KDF", (d) new f(), (s0.a.b.l) new r(new a0()));
        }
    }

    public KeyAgreementSpi(String str, s0.a.b.a0.e eVar, s0.a.b.l lVar) {
        super(str, lVar);
        this.kaAlgorithm = str;
        this.agreement = eVar;
    }

    public KeyAgreementSpi(String str, d dVar, s0.a.b.l lVar) {
        super(str, lVar);
        this.kaAlgorithm = str;
        this.agreement = dVar;
    }

    private static String getSimpleName(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: s0.a.b.k0.c0} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void initFromKey(java.security.Key r6, java.security.spec.AlgorithmParameterSpec r7) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
            r5 = this;
            java.lang.Object r0 = r5.agreement
            boolean r1 = r0 instanceof s0.a.b.a0.f
            java.lang.String r2 = " for initialisation"
            java.lang.String r3 = " key agreement requires "
            r4 = 0
            if (r1 == 0) goto L_0x008d
            r5.mqvParameters = r4
            boolean r0 = r6 instanceof org.bouncycastle.jce.interfaces.MQVPrivateKey
            if (r0 != 0) goto L_0x0033
            boolean r1 = r7 instanceof s0.a.c.n.k
            if (r1 == 0) goto L_0x0016
            goto L_0x0033
        L_0x0016:
            java.security.InvalidAlgorithmParameterException r6 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = r5.kaAlgorithm
            r7.append(r0)
            r7.append(r3)
            java.lang.Class<s0.a.c.n.k> r0 = s0.a.c.n.k.class
            java.lang.String r0 = getSimpleName(r0)
            java.lang.String r7 = i0.d.a.a.a.y0(r7, r0, r2)
            r6.<init>(r7)
            throw r6
        L_0x0033:
            if (r0 == 0) goto L_0x005d
            org.bouncycastle.jce.interfaces.MQVPrivateKey r6 = (org.bouncycastle.jce.interfaces.MQVPrivateKey) r6
            java.security.PrivateKey r7 = r6.s()
            s0.a.b.k0.b r7 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(r7)
            s0.a.b.k0.b0 r7 = (s0.a.b.k0.b0) r7
            java.security.PrivateKey r0 = r6.u()
            s0.a.b.k0.b r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(r0)
            s0.a.b.k0.b0 r0 = (s0.a.b.k0.b0) r0
            java.security.PublicKey r1 = r6.L()
            if (r1 == 0) goto L_0x0079
            java.security.PublicKey r6 = r6.L()
            s0.a.b.k0.b r6 = org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.generatePublicKeyParameter(r6)
            r4 = r6
            s0.a.b.k0.c0 r4 = (s0.a.b.k0.c0) r4
            goto L_0x0079
        L_0x005d:
            s0.a.c.n.k r7 = (s0.a.c.n.k) r7
            java.security.PrivateKey r6 = (java.security.PrivateKey) r6
            s0.a.b.k0.b r6 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(r6)
            s0.a.b.k0.b0 r6 = (s0.a.b.k0.b0) r6
            java.util.Objects.requireNonNull(r7)
            s0.a.b.k0.b r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(r4)
            s0.a.b.k0.b0 r0 = (s0.a.b.k0.b0) r0
            r5.mqvParameters = r7
            byte[] r7 = s0.a.e.b.b0.c.h3.I(r4)
            r5.ukmParameters = r7
            r7 = r6
        L_0x0079:
            s0.a.b.k0.z0 r6 = new s0.a.b.k0.z0
            r6.<init>(r7, r0, r4)
            s0.a.b.k0.w r7 = r7.d
            r5.parameters = r7
            java.lang.Object r7 = r5.agreement
            s0.a.b.a0.f r7 = (s0.a.b.a0.f) r7
            java.util.Objects.requireNonNull(r7)
            r7.a = r6
            goto L_0x0119
        L_0x008d:
            boolean r1 = r7 instanceof s0.a.c.n.e
            if (r1 == 0) goto L_0x00e5
            boolean r0 = r0 instanceof s0.a.b.a0.e
            if (r0 == 0) goto L_0x00c3
            s0.a.c.n.e r7 = (s0.a.c.n.e) r7
            java.security.PrivateKey r6 = (java.security.PrivateKey) r6
            s0.a.b.k0.b r6 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(r6)
            s0.a.b.k0.b0 r6 = (s0.a.b.k0.b0) r6
            java.util.Objects.requireNonNull(r7)
            s0.a.b.k0.b r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(r4)
            s0.a.b.k0.b0 r0 = (s0.a.b.k0.b0) r0
            r5.dheParameters = r7
            byte[] r7 = r7.a()
            r5.ukmParameters = r7
            s0.a.b.k0.u r7 = new s0.a.b.k0.u
            r7.<init>(r6, r0, r4)
            s0.a.b.k0.w r6 = r6.d
            r5.parameters = r6
            java.lang.Object r6 = r5.agreement
            s0.a.b.a0.e r6 = (s0.a.b.a0.e) r6
            java.util.Objects.requireNonNull(r6)
            r6.a = r7
            goto L_0x0119
        L_0x00c3:
            java.security.InvalidAlgorithmParameterException r6 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = r5.kaAlgorithm
            r7.append(r0)
            java.lang.String r0 = " key agreement cannot be used with "
            r7.append(r0)
            java.lang.Class<s0.a.c.n.e> r0 = s0.a.c.n.e.class
            java.lang.String r0 = getSimpleName(r0)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x00e5:
            boolean r0 = r6 instanceof java.security.PrivateKey
            if (r0 == 0) goto L_0x011a
            s0.a.b.l r0 = r5.kdf
            if (r0 != 0) goto L_0x00fa
            boolean r0 = r7 instanceof s0.a.c.n.s
            if (r0 != 0) goto L_0x00f2
            goto L_0x00fa
        L_0x00f2:
            java.security.InvalidAlgorithmParameterException r6 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r7 = "no KDF specified for UserKeyingMaterialSpec"
            r6.<init>(r7)
            throw r6
        L_0x00fa:
            java.security.PrivateKey r6 = (java.security.PrivateKey) r6
            s0.a.b.k0.b r6 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(r6)
            s0.a.b.k0.b0 r6 = (s0.a.b.k0.b0) r6
            s0.a.b.k0.w r0 = r6.d
            r5.parameters = r0
            boolean r0 = r7 instanceof s0.a.c.n.s
            if (r0 == 0) goto L_0x0110
            s0.a.c.n.s r7 = (s0.a.c.n.s) r7
            byte[] r4 = r7.a()
        L_0x0110:
            r5.ukmParameters = r4
            java.lang.Object r7 = r5.agreement
            s0.a.b.d r7 = (s0.a.b.d) r7
            r7.init(r6)
        L_0x0119:
            return
        L_0x011a:
            java.security.InvalidKeyException r6 = new java.security.InvalidKeyException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = r5.kaAlgorithm
            r7.append(r0)
            r7.append(r3)
            java.lang.Class<org.bouncycastle.jce.interfaces.ECPrivateKey> r0 = org.bouncycastle.jce.interfaces.ECPrivateKey.class
            java.lang.String r0 = getSimpleName(r0)
            java.lang.String r7 = i0.d.a.a.a.y0(r7, r0, r2)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi.initFromKey(java.security.Key, java.security.spec.AlgorithmParameterSpec):void");
    }

    public byte[] bigIntToBytes(BigInteger bigInteger) {
        l lVar = converter;
        return lVar.b(bigInteger, lVar.a(this.parameters.g));
    }

    public byte[] calcSecret() {
        return h3.I(this.result);
    }

    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        i iVar;
        if (this.parameters == null) {
            throw new IllegalStateException(i0.d.a.a.a.y0(new StringBuilder(), this.kaAlgorithm, " not initialised."));
        } else if (z) {
            Object obj = this.agreement;
            if (obj instanceof f) {
                if (!(key instanceof MQVPublicKey)) {
                    Objects.requireNonNull(this.mqvParameters);
                    iVar = new a1((c0) ECUtils.generatePublicKeyParameter((PublicKey) key), (c0) ECUtils.generatePublicKeyParameter((PublicKey) null));
                } else {
                    MQVPublicKey mQVPublicKey = (MQVPublicKey) key;
                    iVar = new a1((c0) ECUtils.generatePublicKeyParameter(mQVPublicKey.B()), (c0) ECUtils.generatePublicKeyParameter(mQVPublicKey.P()));
                }
            } else if (obj instanceof s0.a.b.a0.e) {
                Objects.requireNonNull(this.dheParameters);
                iVar = new s0.a.b.k0.v((c0) ECUtils.generatePublicKeyParameter((PublicKey) key), (c0) ECUtils.generatePublicKeyParameter((PublicKey) null));
            } else if (key instanceof PublicKey) {
                iVar = ECUtils.generatePublicKeyParameter((PublicKey) key);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.kaAlgorithm);
                sb.append(" key agreement requires ");
                throw new InvalidKeyException(i0.d.a.a.a.y0(sb, getSimpleName(ECPublicKey.class), " for doPhase"));
            }
            try {
                Object obj2 = this.agreement;
                if (obj2 instanceof d) {
                    this.result = bigIntToBytes(((d) obj2).b(iVar));
                } else {
                    this.result = ((s0.a.b.a0.e) obj2).a(iVar);
                }
                return null;
            } catch (Exception e) {
                throw new InvalidKeyException(i0.d.a.a.a.a0(e, i0.d.a.a.a.P0("calculation failed: "))) {
                    public Throwable getCause() {
                        return e;
                    }
                };
            }
        } else {
            throw new IllegalStateException(i0.d.a.a.a.y0(new StringBuilder(), this.kaAlgorithm, " can only be between two parties."));
        }
    }

    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            initFromKey(key, (AlgorithmParameterSpec) null);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null || (algorithmParameterSpec instanceof k) || (algorithmParameterSpec instanceof s0.a.c.n.s) || (algorithmParameterSpec instanceof e)) {
            initFromKey(key, algorithmParameterSpec);
            return;
        }
        throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
    }
}
