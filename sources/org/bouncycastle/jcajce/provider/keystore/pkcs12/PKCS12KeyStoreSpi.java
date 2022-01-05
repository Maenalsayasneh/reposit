package org.bouncycastle.jcajce.provider.keystore.pkcs12;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jce.provider.JDKPKCS12StoreParameter;
import s0.a.a.b1;
import s0.a.a.c1;
import s0.a.a.c3.b;
import s0.a.a.c3.l0;
import s0.a.a.c3.m0;
import s0.a.a.c3.y0;
import s0.a.a.e;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.n0;
import s0.a.a.o;
import s0.a.a.v0;
import s0.a.a.w2.k;
import s0.a.a.w2.l;
import s0.a.a.w2.m;
import s0.a.a.w2.n;
import s0.a.a.w2.v;
import s0.a.a.x0;
import s0.a.b.j;
import s0.a.c.n.h;
import s0.a.c.o.a;
import s0.a.c.o.c;
import s0.a.e.b.b0.c.h3;
import s0.a.g.g;

public class PKCS12KeyStoreSpi extends KeyStoreSpi implements n, y0 {
    public static final int CERTIFICATE = 1;
    public static final int KEY = 2;
    public static final int KEY_PRIVATE = 0;
    public static final int KEY_PUBLIC = 1;
    public static final int KEY_SECRET = 2;
    private static final int MIN_ITERATIONS = 51200;
    public static final int NULL = 0;
    public static final String PKCS12_MAX_IT_COUNT_PROPERTY = "org.bouncycastle.pkcs12.max_it_count";
    private static final int SALT_SIZE = 20;
    public static final int SEALED = 4;
    public static final int SECRET = 3;
    private static final DefaultSecretKeyProvider keySizeProvider = new DefaultSecretKeyProvider();
    private s0.a.a.n certAlgorithm;
    private CertificateFactory certFact;
    private IgnoresCaseHashtable certs = new IgnoresCaseHashtable();
    private Hashtable chainCerts = new Hashtable();
    private final c helper = new a();
    private int itCount = 102400;
    private s0.a.a.n keyAlgorithm;
    private Hashtable keyCerts = new Hashtable();
    private IgnoresCaseHashtable keys = new IgnoresCaseHashtable();
    private Hashtable localIds = new Hashtable();
    private b macAlgorithm = new b(s0.a.a.v2.b.f, v0.c);
    public SecureRandom random = j.a();
    private int saltLength = 20;

    public static class BCPKCS12KeyStore extends PKCS12KeyStoreSpi {
        public BCPKCS12KeyStore() {
            super(new a(), n.I0, n.L0);
        }
    }

    public static class BCPKCS12KeyStore3DES extends PKCS12KeyStoreSpi {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public BCPKCS12KeyStore3DES() {
            /*
                r2 = this;
                s0.a.c.o.a r0 = new s0.a.c.o.a
                r0.<init>()
                s0.a.a.n r1 = s0.a.a.w2.n.I0
                r2.<init>(r0, r1, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.BCPKCS12KeyStore3DES.<init>():void");
        }
    }

    public class CertId {
        public byte[] id;

        public CertId(PublicKey publicKey) {
            this.id = PKCS12KeyStoreSpi.this.createSubjectKeyId(publicKey).s();
        }

        public CertId(byte[] bArr) {
            this.id = bArr;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CertId)) {
                return false;
            }
            return Arrays.equals(this.id, ((CertId) obj).id);
        }

        public int hashCode() {
            return h3.m1(this.id);
        }
    }

    public static class DefPKCS12KeyStore extends PKCS12KeyStoreSpi {
        public DefPKCS12KeyStore() {
            super(new s0.a.c.o.b(), n.I0, n.L0);
        }
    }

    public static class DefPKCS12KeyStore3DES extends PKCS12KeyStoreSpi {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DefPKCS12KeyStore3DES() {
            /*
                r2 = this;
                s0.a.c.o.b r0 = new s0.a.c.o.b
                r0.<init>()
                s0.a.a.n r1 = s0.a.a.w2.n.I0
                r2.<init>(r0, r1, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.DefPKCS12KeyStore3DES.<init>():void");
        }
    }

    public static class DefaultSecretKeyProvider {
        private final Map KEY_SIZES;

        public DefaultSecretKeyProvider() {
            HashMap hashMap = new HashMap();
            hashMap.put(new s0.a.a.n("1.2.840.113533.7.66.10"), 128);
            hashMap.put(n.R, 192);
            hashMap.put(s0.a.a.r2.b.u, 128);
            hashMap.put(s0.a.a.r2.b.C, 192);
            hashMap.put(s0.a.a.r2.b.K, 256);
            hashMap.put(s0.a.a.t2.a.a, 128);
            hashMap.put(s0.a.a.t2.a.b, 192);
            hashMap.put(s0.a.a.t2.a.c, 256);
            hashMap.put(s0.a.a.g2.a.f, 256);
            this.KEY_SIZES = Collections.unmodifiableMap(hashMap);
        }

        public int getKeySize(b bVar) {
            Integer num = (Integer) this.KEY_SIZES.get(bVar.c);
            if (num != null) {
                return num.intValue();
            }
            return -1;
        }
    }

    public static class IgnoresCaseHashtable {
        private Hashtable keys;
        private Hashtable orig;

        private IgnoresCaseHashtable() {
            this.orig = new Hashtable();
            this.keys = new Hashtable();
        }

        public Enumeration elements() {
            return this.orig.elements();
        }

        public Object get(String str) {
            String str2 = (String) this.keys.get(str == null ? null : s0.a.g.j.d(str));
            if (str2 == null) {
                return null;
            }
            return this.orig.get(str2);
        }

        public Enumeration keys() {
            return this.orig.keys();
        }

        public void put(String str, Object obj) {
            String d = str == null ? null : s0.a.g.j.d(str);
            String str2 = (String) this.keys.get(d);
            if (str2 != null) {
                this.orig.remove(str2);
            }
            this.keys.put(d, str);
            this.orig.put(str, obj);
        }

        public Object remove(String str) {
            String str2 = (String) this.keys.remove(str == null ? null : s0.a.g.j.d(str));
            if (str2 == null) {
                return null;
            }
            return this.orig.remove(str2);
        }

        public int size() {
            return this.orig.size();
        }
    }

    public PKCS12KeyStoreSpi(c cVar, s0.a.a.n nVar, s0.a.a.n nVar2) {
        this.keyAlgorithm = nVar;
        this.certAlgorithm = nVar2;
        try {
            this.certFact = cVar.e("X.509");
        } catch (Exception e) {
            throw new IllegalArgumentException(i0.d.a.a.a.b0(e, i0.d.a.a.a.P0("can't create cert factory - ")));
        }
    }

    private byte[] calculatePbeMac(s0.a.a.n nVar, byte[] bArr, int i, char[] cArr, boolean z, byte[] bArr2) throws Exception {
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i);
        Mac d = this.helper.d(nVar.d);
        d.init(new PKCS12Key(cArr, z), pBEParameterSpec);
        d.update(bArr2);
        return d.doFinal();
    }

    private Cipher createCipher(int i, char[] cArr, b bVar) throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, NoSuchProviderException {
        SecretKey secretKey;
        AlgorithmParameterSpec algorithmParameterSpec;
        k s = k.s(bVar.d);
        l s2 = l.s(s.c.c.d);
        b s3 = b.s(s.d);
        SecretKeyFactory g = this.helper.g(s.c.c.c.d);
        b bVar2 = s2.y;
        if (bVar2 == null || bVar2.equals(l.c)) {
            secretKey = g.generateSecret(new PBEKeySpec(cArr, s2.d.c, validateIterationCount(s2.t()), keySizeProvider.getKeySize(s3)));
        } else {
            secretKey = g.generateSecret(new s0.a.c.n.n(cArr, s2.d.c, validateIterationCount(s2.t()), keySizeProvider.getKeySize(s3), s2.v()));
        }
        Cipher instance = Cipher.getInstance(s.d.c.c.d);
        e eVar = s.d.c.d;
        if (eVar instanceof o) {
            algorithmParameterSpec = new IvParameterSpec(o.B(eVar).c);
        } else {
            s0.a.a.g2.c s4 = s0.a.a.g2.c.s(eVar);
            algorithmParameterSpec = new h(s4.d, h3.I(s4.c.c));
        }
        instance.init(i, secretKey, algorithmParameterSpec);
        return instance;
    }

    private v createSafeBag(String str, Certificate certificate) throws CertificateEncodingException {
        boolean z;
        s0.a.a.n nVar = n.f62o0;
        x0 x0Var = new x0(certificate.getEncoded());
        f fVar = new f(10);
        if (certificate instanceof s0.a.d.d.e) {
            s0.a.d.d.e eVar = (s0.a.d.d.e) certificate;
            s0.a.a.n nVar2 = n.f59l0;
            n0 n0Var = (n0) eVar.getBagAttribute(nVar2);
            if ((n0Var == null || !n0Var.e().equals(str)) && str != null) {
                eVar.setBagAttribute(nVar2, new n0(str));
            }
            Enumeration bagAttributeKeys = eVar.getBagAttributeKeys();
            z = false;
            while (bagAttributeKeys.hasMoreElements()) {
                s0.a.a.n nVar3 = (s0.a.a.n) bagAttributeKeys.nextElement();
                if (!nVar3.w(n.f60m0)) {
                    f fVar2 = new f(10);
                    fVar2.a(nVar3);
                    fVar2.a(new c1(eVar.getBagAttribute(nVar3)));
                    fVar.a(new b1(fVar2));
                    z = true;
                }
            }
        } else {
            z = false;
        }
        if (!z) {
            f fVar3 = new f(10);
            fVar3.a(n.f59l0);
            fVar3.a(new c1((e) new n0(str)));
            fVar.a(new b1(fVar3));
        }
        s0.a.a.n nVar4 = n.E0;
        f fVar4 = new f(2);
        fVar4.a(nVar);
        fVar4.a(new e1(0, x0Var));
        return new v(nVar4, new b1(fVar4), new c1(fVar));
    }

    /* access modifiers changed from: private */
    public l0 createSubjectKeyId(PublicKey publicKey) {
        try {
            return new l0(getDigest(m0.s(publicKey.getEncoded())));
        } catch (Exception unused) {
            throw new RuntimeException("error creating key");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0278 A[Catch:{ CertificateEncodingException -> 0x0337 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x028e A[Catch:{ CertificateEncodingException -> 0x0337 }, LOOP:4: B:55:0x0288->B:57:0x028e, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void doStore(java.io.OutputStream r20, char[] r21, boolean r22) throws java.io.IOException {
        /*
            r19 = this;
            r8 = r19
            r0 = r20
            r7 = r21
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r1 = r8.keys
            int r1 = r1.size()
            r2 = 10
            java.lang.String r9 = "BER"
            java.lang.String r3 = "Error encoding certificate: "
            java.lang.String r10 = "DER"
            if (r1 != 0) goto L_0x00b6
            if (r7 != 0) goto L_0x00bb
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r1 = r8.certs
            java.util.Enumeration r1 = r1.keys()
            s0.a.a.f r4 = new s0.a.a.f
            r4.<init>(r2)
        L_0x0023:
            boolean r2 = r1.hasMoreElements()
            if (r2 == 0) goto L_0x0055
            java.lang.Object r2 = r1.nextElement()     // Catch:{ CertificateEncodingException -> 0x003f }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ CertificateEncodingException -> 0x003f }
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r5 = r8.certs     // Catch:{ CertificateEncodingException -> 0x003f }
            java.lang.Object r5 = r5.get(r2)     // Catch:{ CertificateEncodingException -> 0x003f }
            java.security.cert.Certificate r5 = (java.security.cert.Certificate) r5     // Catch:{ CertificateEncodingException -> 0x003f }
            s0.a.a.w2.v r2 = r8.createSafeBag(r2, r5)     // Catch:{ CertificateEncodingException -> 0x003f }
            r4.a(r2)     // Catch:{ CertificateEncodingException -> 0x003f }
            goto L_0x0023
        L_0x003f:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0055:
            r1 = 0
            s0.a.a.w2.c r2 = new s0.a.a.w2.c
            s0.a.a.n r3 = s0.a.a.w2.n.d0
            if (r22 == 0) goto L_0x0089
            s0.a.a.x0 r5 = new s0.a.a.x0
            s0.a.a.b1 r6 = new s0.a.a.b1
            r6.<init>((s0.a.a.f) r4)
            byte[] r4 = r6.getEncoded()
            r5.<init>((byte[]) r4)
            r2.<init>(r3, r5)
            s0.a.a.w2.o r4 = new s0.a.a.w2.o
            s0.a.a.w2.c r5 = new s0.a.a.w2.c
            s0.a.a.x0 r6 = new s0.a.a.x0
            s0.a.a.b1 r7 = new s0.a.a.b1
            r7.<init>((s0.a.a.e) r2)
            byte[] r2 = r7.getEncoded()
            r6.<init>((byte[]) r2)
            r5.<init>(r3, r6)
            r4.<init>(r5, r1)
            r4.o(r0, r10)
            goto L_0x00b5
        L_0x0089:
            s0.a.a.e0 r5 = new s0.a.a.e0
            s0.a.a.g0 r6 = new s0.a.a.g0
            r6.<init>((s0.a.a.f) r4)
            byte[] r4 = r6.getEncoded()
            r5.<init>((byte[]) r4)
            r2.<init>(r3, r5)
            s0.a.a.w2.o r4 = new s0.a.a.w2.o
            s0.a.a.w2.c r5 = new s0.a.a.w2.c
            s0.a.a.e0 r6 = new s0.a.a.e0
            s0.a.a.g0 r7 = new s0.a.a.g0
            r7.<init>((s0.a.a.e) r2)
            byte[] r2 = r7.getEncoded()
            r6.<init>((byte[]) r2)
            r5.<init>(r3, r6)
            r4.<init>(r5, r1)
            r4.o(r0, r9)
        L_0x00b5:
            return
        L_0x00b6:
            java.lang.String r1 = "no password supplied for PKCS#12 KeyStore"
            java.util.Objects.requireNonNull(r7, r1)
        L_0x00bb:
            s0.a.a.f r1 = new s0.a.a.f
            r1.<init>(r2)
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r4 = r8.keys
            java.util.Enumeration r4 = r4.keys()
        L_0x00c6:
            boolean r5 = r4.hasMoreElements()
            r6 = 51200(0xc800, float:7.1746E-41)
            r11 = 20
            if (r5 == 0) goto L_0x01ed
            byte[] r5 = new byte[r11]
            java.security.SecureRandom r11 = r8.random
            r11.nextBytes(r5)
            java.lang.Object r11 = r4.nextElement()
            java.lang.String r11 = (java.lang.String) r11
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r12 = r8.keys
            java.lang.Object r12 = r12.get(r11)
            java.security.PrivateKey r12 = (java.security.PrivateKey) r12
            s0.a.a.w2.m r13 = new s0.a.a.w2.m
            r13.<init>(r5, r6)
            s0.a.a.n r5 = r8.keyAlgorithm
            java.lang.String r5 = r5.d
            byte[] r5 = r8.wrapKey(r5, r12, r13, r7)
            s0.a.a.c3.b r6 = new s0.a.a.c3.b
            s0.a.a.n r14 = r8.keyAlgorithm
            s0.a.a.r r13 = r13.c()
            r6.<init>(r14, r13)
            s0.a.a.x0 r13 = new s0.a.a.x0
            r13.<init>((byte[]) r5)
            s0.a.a.f r5 = new s0.a.a.f
            r5.<init>(r2)
            boolean r14 = r12 instanceof s0.a.d.d.e
            if (r14 == 0) goto L_0x0179
            s0.a.d.d.e r12 = (s0.a.d.d.e) r12
            s0.a.a.n r14 = s0.a.a.w2.n.f59l0
            s0.a.a.e r15 = r12.getBagAttribute(r14)
            s0.a.a.n0 r15 = (s0.a.a.n0) r15
            if (r15 == 0) goto L_0x0122
            java.lang.String r15 = r15.e()
            boolean r15 = r15.equals(r11)
            if (r15 != 0) goto L_0x012a
        L_0x0122:
            s0.a.a.n0 r15 = new s0.a.a.n0
            r15.<init>((java.lang.String) r11)
            r12.setBagAttribute(r14, r15)
        L_0x012a:
            s0.a.a.n r14 = s0.a.a.w2.n.f60m0
            s0.a.a.e r15 = r12.getBagAttribute(r14)
            if (r15 != 0) goto L_0x0141
            java.security.cert.Certificate r15 = r8.engineGetCertificate(r11)
            java.security.PublicKey r15 = r15.getPublicKey()
            s0.a.a.c3.l0 r15 = r8.createSubjectKeyId(r15)
            r12.setBagAttribute(r14, r15)
        L_0x0141:
            java.util.Enumeration r14 = r12.getBagAttributeKeys()
            r15 = 0
        L_0x0146:
            boolean r16 = r14.hasMoreElements()
            if (r16 == 0) goto L_0x0176
            java.lang.Object r15 = r14.nextElement()
            s0.a.a.n r15 = (s0.a.a.n) r15
            r16 = r4
            s0.a.a.f r4 = new s0.a.a.f
            r4.<init>(r2)
            r4.a(r15)
            s0.a.a.c1 r2 = new s0.a.a.c1
            s0.a.a.e r15 = r12.getBagAttribute(r15)
            r2.<init>((s0.a.a.e) r15)
            r4.a(r2)
            s0.a.a.b1 r2 = new s0.a.a.b1
            r2.<init>((s0.a.a.f) r4)
            r5.a(r2)
            r2 = 10
            r15 = 1
            r4 = r16
            goto L_0x0146
        L_0x0176:
            r16 = r4
            goto L_0x017c
        L_0x0179:
            r16 = r4
            r15 = 0
        L_0x017c:
            if (r15 != 0) goto L_0x01c7
            s0.a.a.f r2 = new s0.a.a.f
            r4 = 10
            r2.<init>(r4)
            java.security.cert.Certificate r4 = r8.engineGetCertificate(r11)
            s0.a.a.n r12 = s0.a.a.w2.n.f60m0
            r2.a(r12)
            s0.a.a.c1 r12 = new s0.a.a.c1
            java.security.PublicKey r4 = r4.getPublicKey()
            s0.a.a.c3.l0 r4 = r8.createSubjectKeyId(r4)
            r12.<init>((s0.a.a.e) r4)
            r2.a(r12)
            s0.a.a.b1 r4 = new s0.a.a.b1
            r4.<init>((s0.a.a.f) r2)
            r5.a(r4)
            s0.a.a.f r2 = new s0.a.a.f
            r4 = 10
            r2.<init>(r4)
            s0.a.a.n r4 = s0.a.a.w2.n.f59l0
            r2.a(r4)
            s0.a.a.c1 r4 = new s0.a.a.c1
            s0.a.a.n0 r12 = new s0.a.a.n0
            r12.<init>((java.lang.String) r11)
            r4.<init>((s0.a.a.e) r12)
            r2.a(r4)
            s0.a.a.b1 r4 = new s0.a.a.b1
            r4.<init>((s0.a.a.f) r2)
            r5.a(r4)
        L_0x01c7:
            s0.a.a.w2.v r2 = new s0.a.a.w2.v
            s0.a.a.n r4 = s0.a.a.w2.n.D0
            s0.a.a.f r11 = new s0.a.a.f
            r12 = 2
            r11.<init>(r12)
            r11.a(r6)
            r11.a(r13)
            s0.a.a.b1 r6 = new s0.a.a.b1
            r6.<init>((s0.a.a.f) r11)
            s0.a.a.c1 r11 = new s0.a.a.c1
            r11.<init>((s0.a.a.f) r5)
            r2.<init>(r4, r6, r11)
            r1.a(r2)
            r2 = 10
            r4 = r16
            goto L_0x00c6
        L_0x01ed:
            s0.a.a.b1 r2 = new s0.a.a.b1
            r2.<init>((s0.a.a.f) r1)
            byte[] r1 = r2.r(r10)
            s0.a.a.e0 r12 = new s0.a.a.e0
            r12.<init>((byte[]) r1)
            byte[] r1 = new byte[r11]
            java.security.SecureRandom r2 = r8.random
            r2.nextBytes(r1)
            s0.a.a.f r2 = new s0.a.a.f
            r4 = 10
            r2.<init>(r4)
            s0.a.a.w2.m r4 = new s0.a.a.w2.m
            r4.<init>(r1, r6)
            s0.a.a.c3.b r11 = new s0.a.a.c3.b
            s0.a.a.n r1 = r8.certAlgorithm
            s0.a.a.r r4 = r4.c()
            r11.<init>(r1, r4)
            java.util.Hashtable r1 = new java.util.Hashtable
            r1.<init>()
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r4 = r8.keys
            java.util.Enumeration r4 = r4.keys()
        L_0x0224:
            boolean r5 = r4.hasMoreElements()
            if (r5 == 0) goto L_0x034d
            java.lang.Object r5 = r4.nextElement()     // Catch:{ CertificateEncodingException -> 0x0337 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ CertificateEncodingException -> 0x0337 }
            java.security.cert.Certificate r6 = r8.engineGetCertificate(r5)     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.n r13 = s0.a.a.w2.n.f62o0     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.x0 r14 = new s0.a.a.x0     // Catch:{ CertificateEncodingException -> 0x0337 }
            byte[] r15 = r6.getEncoded()     // Catch:{ CertificateEncodingException -> 0x0337 }
            r14.<init>((byte[]) r15)     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.f r15 = new s0.a.a.f     // Catch:{ CertificateEncodingException -> 0x0337 }
            r16 = r4
            r4 = 10
            r15.<init>(r4)     // Catch:{ CertificateEncodingException -> 0x0337 }
            boolean r4 = r6 instanceof s0.a.d.d.e     // Catch:{ CertificateEncodingException -> 0x0337 }
            if (r4 == 0) goto L_0x02ba
            r4 = r6
            s0.a.d.d.e r4 = (s0.a.d.d.e) r4     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.n r7 = s0.a.a.w2.n.f59l0     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.e r17 = r4.getBagAttribute(r7)     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.n0 r17 = (s0.a.a.n0) r17     // Catch:{ CertificateEncodingException -> 0x0337 }
            if (r17 == 0) goto L_0x0266
            r18 = r9
            java.lang.String r9 = r17.e()     // Catch:{ CertificateEncodingException -> 0x0337 }
            boolean r9 = r9.equals(r5)     // Catch:{ CertificateEncodingException -> 0x0337 }
            if (r9 != 0) goto L_0x0270
            goto L_0x0268
        L_0x0266:
            r18 = r9
        L_0x0268:
            s0.a.a.n0 r9 = new s0.a.a.n0     // Catch:{ CertificateEncodingException -> 0x0337 }
            r9.<init>((java.lang.String) r5)     // Catch:{ CertificateEncodingException -> 0x0337 }
            r4.setBagAttribute(r7, r9)     // Catch:{ CertificateEncodingException -> 0x0337 }
        L_0x0270:
            s0.a.a.n r7 = s0.a.a.w2.n.f60m0     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.e r9 = r4.getBagAttribute(r7)     // Catch:{ CertificateEncodingException -> 0x0337 }
            if (r9 != 0) goto L_0x0283
            java.security.PublicKey r9 = r6.getPublicKey()     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.c3.l0 r9 = r8.createSubjectKeyId(r9)     // Catch:{ CertificateEncodingException -> 0x0337 }
            r4.setBagAttribute(r7, r9)     // Catch:{ CertificateEncodingException -> 0x0337 }
        L_0x0283:
            java.util.Enumeration r7 = r4.getBagAttributeKeys()     // Catch:{ CertificateEncodingException -> 0x0337 }
            r9 = 0
        L_0x0288:
            boolean r17 = r7.hasMoreElements()     // Catch:{ CertificateEncodingException -> 0x0337 }
            if (r17 == 0) goto L_0x02bd
            java.lang.Object r9 = r7.nextElement()     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.n r9 = (s0.a.a.n) r9     // Catch:{ CertificateEncodingException -> 0x0337 }
            r17 = r7
            s0.a.a.f r7 = new s0.a.a.f     // Catch:{ CertificateEncodingException -> 0x0337 }
            r0 = 10
            r7.<init>(r0)     // Catch:{ CertificateEncodingException -> 0x0337 }
            r7.a(r9)     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.c1 r0 = new s0.a.a.c1     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.e r9 = r4.getBagAttribute(r9)     // Catch:{ CertificateEncodingException -> 0x0337 }
            r0.<init>((s0.a.a.e) r9)     // Catch:{ CertificateEncodingException -> 0x0337 }
            r7.a(r0)     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.b1 r0 = new s0.a.a.b1     // Catch:{ CertificateEncodingException -> 0x0337 }
            r0.<init>((s0.a.a.f) r7)     // Catch:{ CertificateEncodingException -> 0x0337 }
            r15.a(r0)     // Catch:{ CertificateEncodingException -> 0x0337 }
            r9 = 1
            r0 = r20
            r7 = r17
            goto L_0x0288
        L_0x02ba:
            r18 = r9
            r9 = 0
        L_0x02bd:
            if (r9 != 0) goto L_0x0304
            s0.a.a.f r0 = new s0.a.a.f     // Catch:{ CertificateEncodingException -> 0x0337 }
            r4 = 10
            r0.<init>(r4)     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.n r4 = s0.a.a.w2.n.f60m0     // Catch:{ CertificateEncodingException -> 0x0337 }
            r0.a(r4)     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.c1 r4 = new s0.a.a.c1     // Catch:{ CertificateEncodingException -> 0x0337 }
            java.security.PublicKey r7 = r6.getPublicKey()     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.c3.l0 r7 = r8.createSubjectKeyId(r7)     // Catch:{ CertificateEncodingException -> 0x0337 }
            r4.<init>((s0.a.a.e) r7)     // Catch:{ CertificateEncodingException -> 0x0337 }
            r0.a(r4)     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.b1 r4 = new s0.a.a.b1     // Catch:{ CertificateEncodingException -> 0x0337 }
            r4.<init>((s0.a.a.f) r0)     // Catch:{ CertificateEncodingException -> 0x0337 }
            r15.a(r4)     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.f r0 = new s0.a.a.f     // Catch:{ CertificateEncodingException -> 0x0337 }
            r4 = 10
            r0.<init>(r4)     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.n r4 = s0.a.a.w2.n.f59l0     // Catch:{ CertificateEncodingException -> 0x0337 }
            r0.a(r4)     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.c1 r4 = new s0.a.a.c1     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.n0 r7 = new s0.a.a.n0     // Catch:{ CertificateEncodingException -> 0x0337 }
            r7.<init>((java.lang.String) r5)     // Catch:{ CertificateEncodingException -> 0x0337 }
            r4.<init>((s0.a.a.e) r7)     // Catch:{ CertificateEncodingException -> 0x0337 }
            r0.a(r4)     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.b1 r4 = new s0.a.a.b1     // Catch:{ CertificateEncodingException -> 0x0337 }
            r4.<init>((s0.a.a.f) r0)     // Catch:{ CertificateEncodingException -> 0x0337 }
            r15.a(r4)     // Catch:{ CertificateEncodingException -> 0x0337 }
        L_0x0304:
            s0.a.a.w2.v r0 = new s0.a.a.w2.v     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.n r4 = s0.a.a.w2.n.E0     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.f r5 = new s0.a.a.f     // Catch:{ CertificateEncodingException -> 0x0337 }
            r7 = 2
            r5.<init>(r7)     // Catch:{ CertificateEncodingException -> 0x0337 }
            r5.a(r13)     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.e1 r7 = new s0.a.a.e1     // Catch:{ CertificateEncodingException -> 0x0337 }
            r9 = 0
            r7.<init>(r9, r14)     // Catch:{ CertificateEncodingException -> 0x0337 }
            r5.a(r7)     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.b1 r7 = new s0.a.a.b1     // Catch:{ CertificateEncodingException -> 0x0337 }
            r7.<init>((s0.a.a.f) r5)     // Catch:{ CertificateEncodingException -> 0x0337 }
            s0.a.a.c1 r5 = new s0.a.a.c1     // Catch:{ CertificateEncodingException -> 0x0337 }
            r5.<init>((s0.a.a.f) r15)     // Catch:{ CertificateEncodingException -> 0x0337 }
            r0.<init>(r4, r7, r5)     // Catch:{ CertificateEncodingException -> 0x0337 }
            r2.a(r0)     // Catch:{ CertificateEncodingException -> 0x0337 }
            r1.put(r6, r6)     // Catch:{ CertificateEncodingException -> 0x0337 }
            r0 = r20
            r7 = r21
            r4 = r16
            r9 = r18
            goto L_0x0224
        L_0x0337:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x034d:
            r18 = r9
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r0 = r8.certs
            java.util.Enumeration r0 = r0.keys()
        L_0x0355:
            boolean r4 = r0.hasMoreElements()
            if (r4 == 0) goto L_0x0393
            java.lang.Object r4 = r0.nextElement()     // Catch:{ CertificateEncodingException -> 0x037d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ CertificateEncodingException -> 0x037d }
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r5 = r8.certs     // Catch:{ CertificateEncodingException -> 0x037d }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ CertificateEncodingException -> 0x037d }
            java.security.cert.Certificate r5 = (java.security.cert.Certificate) r5     // Catch:{ CertificateEncodingException -> 0x037d }
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r6 = r8.keys     // Catch:{ CertificateEncodingException -> 0x037d }
            java.lang.Object r6 = r6.get(r4)     // Catch:{ CertificateEncodingException -> 0x037d }
            if (r6 == 0) goto L_0x0372
            goto L_0x0355
        L_0x0372:
            s0.a.a.w2.v r4 = r8.createSafeBag(r4, r5)     // Catch:{ CertificateEncodingException -> 0x037d }
            r2.a(r4)     // Catch:{ CertificateEncodingException -> 0x037d }
            r1.put(r5, r5)     // Catch:{ CertificateEncodingException -> 0x037d }
            goto L_0x0355
        L_0x037d:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0393:
            java.util.Set r0 = r19.getUsedCertificateSet()
            java.util.Hashtable r4 = r8.chainCerts
            java.util.Enumeration r4 = r4.keys()
        L_0x039d:
            boolean r5 = r4.hasMoreElements()
            if (r5 == 0) goto L_0x0455
            java.lang.Object r5 = r4.nextElement()     // Catch:{ CertificateEncodingException -> 0x043f }
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$CertId r5 = (org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.CertId) r5     // Catch:{ CertificateEncodingException -> 0x043f }
            java.util.Hashtable r6 = r8.chainCerts     // Catch:{ CertificateEncodingException -> 0x043f }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ CertificateEncodingException -> 0x043f }
            java.security.cert.Certificate r5 = (java.security.cert.Certificate) r5     // Catch:{ CertificateEncodingException -> 0x043f }
            boolean r6 = r0.contains(r5)     // Catch:{ CertificateEncodingException -> 0x043f }
            if (r6 != 0) goto L_0x03b8
            goto L_0x039d
        L_0x03b8:
            java.lang.Object r6 = r1.get(r5)     // Catch:{ CertificateEncodingException -> 0x043f }
            if (r6 == 0) goto L_0x03bf
            goto L_0x039d
        L_0x03bf:
            s0.a.a.n r6 = s0.a.a.w2.n.f62o0     // Catch:{ CertificateEncodingException -> 0x043f }
            s0.a.a.x0 r7 = new s0.a.a.x0     // Catch:{ CertificateEncodingException -> 0x043f }
            byte[] r9 = r5.getEncoded()     // Catch:{ CertificateEncodingException -> 0x043f }
            r7.<init>((byte[]) r9)     // Catch:{ CertificateEncodingException -> 0x043f }
            s0.a.a.f r9 = new s0.a.a.f     // Catch:{ CertificateEncodingException -> 0x043f }
            r13 = 10
            r9.<init>(r13)     // Catch:{ CertificateEncodingException -> 0x043f }
            boolean r13 = r5 instanceof s0.a.d.d.e     // Catch:{ CertificateEncodingException -> 0x043f }
            if (r13 == 0) goto L_0x0413
            s0.a.d.d.e r5 = (s0.a.d.d.e) r5     // Catch:{ CertificateEncodingException -> 0x043f }
            java.util.Enumeration r13 = r5.getBagAttributeKeys()     // Catch:{ CertificateEncodingException -> 0x043f }
        L_0x03db:
            boolean r14 = r13.hasMoreElements()     // Catch:{ CertificateEncodingException -> 0x043f }
            if (r14 == 0) goto L_0x0413
            java.lang.Object r14 = r13.nextElement()     // Catch:{ CertificateEncodingException -> 0x043f }
            s0.a.a.n r14 = (s0.a.a.n) r14     // Catch:{ CertificateEncodingException -> 0x043f }
            s0.a.a.n r15 = s0.a.a.w2.n.f60m0     // Catch:{ CertificateEncodingException -> 0x043f }
            boolean r15 = r14.w(r15)     // Catch:{ CertificateEncodingException -> 0x043f }
            if (r15 == 0) goto L_0x03f0
            goto L_0x03db
        L_0x03f0:
            s0.a.a.f r15 = new s0.a.a.f     // Catch:{ CertificateEncodingException -> 0x043f }
            r16 = r0
            r0 = 10
            r15.<init>(r0)     // Catch:{ CertificateEncodingException -> 0x043f }
            r15.a(r14)     // Catch:{ CertificateEncodingException -> 0x043f }
            s0.a.a.c1 r0 = new s0.a.a.c1     // Catch:{ CertificateEncodingException -> 0x043f }
            s0.a.a.e r14 = r5.getBagAttribute(r14)     // Catch:{ CertificateEncodingException -> 0x043f }
            r0.<init>((s0.a.a.e) r14)     // Catch:{ CertificateEncodingException -> 0x043f }
            r15.a(r0)     // Catch:{ CertificateEncodingException -> 0x043f }
            s0.a.a.b1 r0 = new s0.a.a.b1     // Catch:{ CertificateEncodingException -> 0x043f }
            r0.<init>((s0.a.a.f) r15)     // Catch:{ CertificateEncodingException -> 0x043f }
            r9.a(r0)     // Catch:{ CertificateEncodingException -> 0x043f }
            r0 = r16
            goto L_0x03db
        L_0x0413:
            r16 = r0
            s0.a.a.w2.v r0 = new s0.a.a.w2.v     // Catch:{ CertificateEncodingException -> 0x043f }
            s0.a.a.n r5 = s0.a.a.w2.n.E0     // Catch:{ CertificateEncodingException -> 0x043f }
            s0.a.a.f r13 = new s0.a.a.f     // Catch:{ CertificateEncodingException -> 0x043f }
            r14 = 2
            r13.<init>(r14)     // Catch:{ CertificateEncodingException -> 0x043f }
            r13.a(r6)     // Catch:{ CertificateEncodingException -> 0x043f }
            s0.a.a.e1 r6 = new s0.a.a.e1     // Catch:{ CertificateEncodingException -> 0x043f }
            r14 = 0
            r6.<init>(r14, r7)     // Catch:{ CertificateEncodingException -> 0x043f }
            r13.a(r6)     // Catch:{ CertificateEncodingException -> 0x043f }
            s0.a.a.b1 r6 = new s0.a.a.b1     // Catch:{ CertificateEncodingException -> 0x043f }
            r6.<init>((s0.a.a.f) r13)     // Catch:{ CertificateEncodingException -> 0x043f }
            s0.a.a.c1 r7 = new s0.a.a.c1     // Catch:{ CertificateEncodingException -> 0x043f }
            r7.<init>((s0.a.a.f) r9)     // Catch:{ CertificateEncodingException -> 0x043f }
            r0.<init>(r5, r6, r7)     // Catch:{ CertificateEncodingException -> 0x043f }
            r2.a(r0)     // Catch:{ CertificateEncodingException -> 0x043f }
            r0 = r16
            goto L_0x039d
        L_0x043f:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0455:
            s0.a.a.b1 r0 = new s0.a.a.b1
            r0.<init>((s0.a.a.f) r2)
            byte[] r6 = r0.r(r10)
            r2 = 1
            r5 = 0
            r1 = r19
            r3 = r11
            r4 = r21
            byte[] r0 = r1.cryptData(r2, r3, r4, r5, r6)
            s0.a.a.n r1 = s0.a.a.w2.n.d0
            s0.a.a.e0 r2 = new s0.a.a.e0
            r2.<init>((byte[]) r0)
            s0.a.a.f r0 = new s0.a.a.f
            r3 = 3
            r0.<init>(r3)
            r0.a(r1)
            s0.a.a.r r3 = r11.c()
            r0.a(r3)
            s0.a.a.k0 r3 = new s0.a.a.k0
            r4 = 0
            r3.<init>(r4, r4, r2)
            r0.a(r3)
            s0.a.a.g0 r2 = new s0.a.a.g0
            r2.<init>((s0.a.a.f) r0)
            r0 = 2
            s0.a.a.w2.c[] r3 = new s0.a.a.w2.c[r0]
            s0.a.a.w2.c r5 = new s0.a.a.w2.c
            r5.<init>(r1, r12)
            r3[r4] = r5
            s0.a.a.w2.c r4 = new s0.a.a.w2.c
            s0.a.a.n r5 = s0.a.a.w2.n.f0
            s0.a.a.f r6 = new s0.a.a.f
            r6.<init>(r0)
            s0.a.a.k r0 = new s0.a.a.k
            r11 = 0
            r0.<init>((long) r11)
            r6.a(r0)
            r6.a(r2)
            s0.a.a.g0 r0 = new s0.a.a.g0
            r0.<init>((s0.a.a.f) r6)
            r4.<init>(r5, r0)
            r0 = 1
            r3[r0] = r4
            s0.a.a.w2.a r0 = new s0.a.a.w2.a
            r0.<init>((s0.a.a.w2.c[]) r3)
            if (r22 == 0) goto L_0x04c2
            r2 = r10
            goto L_0x04c4
        L_0x04c2:
            r2 = r18
        L_0x04c4:
            byte[] r0 = r0.r(r2)
            s0.a.a.w2.c r9 = new s0.a.a.w2.c
            s0.a.a.e0 r2 = new s0.a.a.e0
            r2.<init>((byte[]) r0)
            r9.<init>(r1, r2)
            int r0 = r8.saltLength
            byte[] r0 = new byte[r0]
            java.security.SecureRandom r1 = r8.random
            r1.nextBytes(r0)
            s0.a.a.e r1 = r9.d
            s0.a.a.o r1 = (s0.a.a.o) r1
            byte[] r7 = r1.c
            s0.a.a.c3.b r1 = r8.macAlgorithm     // Catch:{ Exception -> 0x0510 }
            s0.a.a.n r2 = r1.c     // Catch:{ Exception -> 0x0510 }
            int r4 = r8.itCount     // Catch:{ Exception -> 0x0510 }
            r6 = 0
            r1 = r19
            r3 = r0
            r5 = r21
            byte[] r1 = r1.calculatePbeMac(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0510 }
            s0.a.a.c3.r r2 = new s0.a.a.c3.r     // Catch:{ Exception -> 0x0510 }
            s0.a.a.c3.b r3 = r8.macAlgorithm     // Catch:{ Exception -> 0x0510 }
            r2.<init>(r3, r1)     // Catch:{ Exception -> 0x0510 }
            s0.a.a.w2.i r1 = new s0.a.a.w2.i     // Catch:{ Exception -> 0x0510 }
            int r3 = r8.itCount     // Catch:{ Exception -> 0x0510 }
            r1.<init>(r2, r0, r3)     // Catch:{ Exception -> 0x0510 }
            s0.a.a.w2.o r0 = new s0.a.a.w2.o
            r0.<init>(r9, r1)
            r1 = r20
            if (r22 == 0) goto L_0x050a
            r9 = r10
            goto L_0x050c
        L_0x050a:
            r9 = r18
        L_0x050c:
            r0.o(r1, r9)
            return
        L_0x0510:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "error constructing MAC: "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            java.lang.String r0 = i0.d.a.a.a.b0(r0, r2)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.doStore(java.io.OutputStream, char[], boolean):void");
    }

    private static byte[] getDigest(m0 m0Var) {
        s0.a.b.b0.v vVar = new s0.a.b.b0.v();
        byte[] bArr = new byte[20];
        byte[] B = m0Var.d.B();
        vVar.update(B, 0, B.length);
        vVar.doFinal(bArr, 0);
        return bArr;
    }

    private Set getUsedCertificateSet() {
        HashSet hashSet = new HashSet();
        Enumeration keys2 = this.keys.keys();
        while (keys2.hasMoreElements()) {
            Certificate[] engineGetCertificateChain = engineGetCertificateChain((String) keys2.nextElement());
            for (int i = 0; i != engineGetCertificateChain.length; i++) {
                hashSet.add(engineGetCertificateChain[i]);
            }
        }
        Enumeration keys3 = this.certs.keys();
        while (keys3.hasMoreElements()) {
            hashSet.add(engineGetCertificate((String) keys3.nextElement()));
        }
        return hashSet;
    }

    private int validateIterationCount(BigInteger bigInteger) {
        int intValue = bigInteger.intValue();
        if (intValue >= 0) {
            String a = g.a(PKCS12_MAX_IT_COUNT_PROPERTY);
            BigInteger bigInteger2 = a != null ? new BigInteger(a) : null;
            if (bigInteger2 == null || bigInteger2.intValue() >= intValue) {
                return intValue;
            }
            StringBuilder Q0 = i0.d.a.a.a.Q0("iteration count ", intValue, " greater than ");
            Q0.append(bigInteger2.intValue());
            throw new IllegalStateException(Q0.toString());
        }
        throw new IllegalStateException("negative iteration count found");
    }

    public byte[] cryptData(boolean z, b bVar, char[] cArr, boolean z2, byte[] bArr) throws IOException {
        s0.a.a.n nVar = bVar.c;
        int i = z ? 1 : 2;
        if (nVar.G(n.F0)) {
            m s = m.s(bVar.d);
            try {
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(s.d.c, s.t().intValue());
                PKCS12Key pKCS12Key = new PKCS12Key(cArr, z2);
                Cipher c = this.helper.c(nVar.d);
                c.init(i, pKCS12Key, pBEParameterSpec);
                return c.doFinal(bArr);
            } catch (Exception e) {
                throw new IOException(i0.d.a.a.a.b0(e, i0.d.a.a.a.P0("exception decrypting data - ")));
            }
        } else if (nVar.w(n.O)) {
            try {
                return createCipher(i, cArr, bVar).doFinal(bArr);
            } catch (Exception e2) {
                throw new IOException(i0.d.a.a.a.b0(e2, i0.d.a.a.a.P0("exception decrypting data - ")));
            }
        } else {
            throw new IOException("unknown PBE algorithm: " + nVar);
        }
    }

    public Enumeration engineAliases() {
        Hashtable hashtable = new Hashtable();
        Enumeration keys2 = this.certs.keys();
        while (keys2.hasMoreElements()) {
            hashtable.put(keys2.nextElement(), "cert");
        }
        Enumeration keys3 = this.keys.keys();
        while (keys3.hasMoreElements()) {
            String str = (String) keys3.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
            }
        }
        return hashtable.keys();
    }

    public boolean engineContainsAlias(String str) {
        return (this.certs.get(str) == null && this.keys.get(str) == null) ? false : true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.security.cert.Certificate} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineDeleteEntry(java.lang.String r6) throws java.security.KeyStoreException {
        /*
            r5 = this;
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r0 = r5.keys
            java.lang.Object r0 = r0.remove(r6)
            java.security.Key r0 = (java.security.Key) r0
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r1 = r5.certs
            java.lang.Object r1 = r1.remove(r6)
            java.security.cert.Certificate r1 = (java.security.cert.Certificate) r1
            if (r1 == 0) goto L_0x0020
            java.util.Hashtable r2 = r5.chainCerts
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$CertId r3 = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$CertId
            java.security.PublicKey r4 = r1.getPublicKey()
            r3.<init>((java.security.PublicKey) r4)
            r2.remove(r3)
        L_0x0020:
            if (r0 == 0) goto L_0x0045
            java.util.Hashtable r0 = r5.localIds
            java.lang.Object r6 = r0.remove(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0035
            java.util.Hashtable r0 = r5.keyCerts
            java.lang.Object r6 = r0.remove(r6)
            r1 = r6
            java.security.cert.Certificate r1 = (java.security.cert.Certificate) r1
        L_0x0035:
            if (r1 == 0) goto L_0x0045
            java.util.Hashtable r6 = r5.chainCerts
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$CertId r0 = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$CertId
            java.security.PublicKey r1 = r1.getPublicKey()
            r0.<init>((java.security.PublicKey) r1)
            r6.remove(r0)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.engineDeleteEntry(java.lang.String):void");
    }

    public Certificate engineGetCertificate(String str) {
        if (str != null) {
            Certificate certificate = (Certificate) this.certs.get(str);
            if (certificate != null) {
                return certificate;
            }
            String str2 = (String) this.localIds.get(str);
            return (Certificate) (str2 != null ? this.keyCerts.get(str2) : this.keyCerts.get(str));
        }
        throw new IllegalArgumentException("null alias passed to getCertificate.");
    }

    public String engineGetCertificateAlias(Certificate certificate) {
        Enumeration elements = this.certs.elements();
        Enumeration keys2 = this.certs.keys();
        while (elements.hasMoreElements()) {
            String str = (String) keys2.nextElement();
            if (((Certificate) elements.nextElement()).equals(certificate)) {
                return str;
            }
        }
        Enumeration elements2 = this.keyCerts.elements();
        Enumeration keys3 = this.keyCerts.keys();
        while (elements2.hasMoreElements()) {
            String str2 = (String) keys3.nextElement();
            if (((Certificate) elements2.nextElement()).equals(certificate)) {
                return str2;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x00a6
            boolean r0 = r8.engineIsKeyEntry(r9)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            java.security.cert.Certificate r9 = r8.engineGetCertificate(r9)
            if (r9 == 0) goto L_0x00a5
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
        L_0x0015:
            if (r9 == 0) goto L_0x0091
            r2 = r9
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            s0.a.a.n r3 = s0.a.a.c3.u.g2
            java.lang.String r3 = r3.d
            byte[] r3 = r2.getExtensionValue(r3)
            if (r3 == 0) goto L_0x0046
            s0.a.a.o r3 = s0.a.a.o.B(r3)
            byte[] r3 = r3.c
            s0.a.a.c3.i r3 = s0.a.a.c3.i.s(r3)
            s0.a.a.o r3 = r3.c
            if (r3 == 0) goto L_0x0035
            byte[] r3 = r3.c
            goto L_0x0036
        L_0x0035:
            r3 = r1
        L_0x0036:
            if (r3 == 0) goto L_0x0046
            java.util.Hashtable r4 = r8.chainCerts
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$CertId r5 = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$CertId
            r5.<init>((byte[]) r3)
            java.lang.Object r3 = r4.get(r5)
            java.security.cert.Certificate r3 = (java.security.cert.Certificate) r3
            goto L_0x0047
        L_0x0046:
            r3 = r1
        L_0x0047:
            if (r3 != 0) goto L_0x0081
            java.security.Principal r4 = r2.getIssuerDN()
            java.security.Principal r5 = r2.getSubjectDN()
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0081
            java.util.Hashtable r5 = r8.chainCerts
            java.util.Enumeration r5 = r5.keys()
        L_0x005d:
            boolean r6 = r5.hasMoreElements()
            if (r6 == 0) goto L_0x0081
            java.util.Hashtable r6 = r8.chainCerts
            java.lang.Object r7 = r5.nextElement()
            java.lang.Object r6 = r6.get(r7)
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.security.Principal r7 = r6.getSubjectDN()
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x005d
            java.security.PublicKey r7 = r6.getPublicKey()     // Catch:{ Exception -> 0x005d }
            r2.verify(r7)     // Catch:{ Exception -> 0x005d }
            r3 = r6
        L_0x0081:
            boolean r2 = r0.contains(r9)
            if (r2 == 0) goto L_0x0088
            goto L_0x008f
        L_0x0088:
            r0.addElement(r9)
            if (r3 == r9) goto L_0x008f
            r9 = r3
            goto L_0x0015
        L_0x008f:
            r9 = r1
            goto L_0x0015
        L_0x0091:
            int r9 = r0.size()
            java.security.cert.Certificate[] r1 = new java.security.cert.Certificate[r9]
            r2 = 0
        L_0x0098:
            if (r2 == r9) goto L_0x00a5
            java.lang.Object r3 = r0.elementAt(r2)
            java.security.cert.Certificate r3 = (java.security.cert.Certificate) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L_0x0098
        L_0x00a5:
            return r1
        L_0x00a6:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "null alias passed to getCertificateChain."
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.engineGetCertificateChain(java.lang.String):java.security.cert.Certificate[]");
    }

    public Date engineGetCreationDate(String str) {
        Objects.requireNonNull(str, "alias == null");
        if (this.keys.get(str) == null && this.certs.get(str) == null) {
            return null;
        }
        return new Date();
    }

    public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        if (str != null) {
            return (Key) this.keys.get(str);
        }
        throw new IllegalArgumentException("null alias passed to getKey.");
    }

    public boolean engineIsCertificateEntry(String str) {
        return this.certs.get(str) != null && this.keys.get(str) == null;
    }

    public boolean engineIsKeyEntry(String str) {
        return this.keys.get(str) != null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: s0.a.a.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: s0.a.a.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: s0.a.a.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: s0.a.a.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: s0.a.a.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: s0.a.a.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: s0.a.a.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: s0.a.a.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: s0.a.a.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: s0.a.a.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: s0.a.a.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: s0.a.a.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v61, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: s0.a.a.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineLoad(java.io.InputStream r20, char[] r21) throws java.io.IOException {
        /*
            r19 = this;
            r8 = r19
            r0 = r20
            r9 = r21
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r1.<init>(r0)
            r0 = 10
            r1.mark(r0)
            int r0 = r1.read()
            r2 = 48
            if (r0 != r2) goto L_0x05cf
            r1.reset()
            s0.a.a.j r0 = new s0.a.a.j
            r0.<init>((java.io.InputStream) r1)
            s0.a.a.r r0 = r0.i()     // Catch:{ Exception -> 0x05c4 }
            boolean r1 = r0 instanceof s0.a.a.w2.o     // Catch:{ Exception -> 0x05c4 }
            r10 = 0
            if (r1 == 0) goto L_0x002f
            s0.a.a.w2.o r0 = (s0.a.a.w2.o) r0     // Catch:{ Exception -> 0x05c4 }
            goto L_0x003d
        L_0x002f:
            if (r0 == 0) goto L_0x003c
            s0.a.a.w2.o r1 = new s0.a.a.w2.o     // Catch:{ Exception -> 0x05c4 }
            s0.a.a.s r0 = s0.a.a.s.B(r0)     // Catch:{ Exception -> 0x05c4 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x05c4 }
            r0 = r1
            goto L_0x003d
        L_0x003c:
            r0 = r10
        L_0x003d:
            s0.a.a.w2.c r11 = r0.c
            java.util.Vector r12 = new java.util.Vector
            r12.<init>()
            s0.a.a.w2.i r0 = r0.d
            r13 = 0
            if (r0 == 0) goto L_0x00c5
            java.lang.String r1 = "no password supplied when one expected"
            java.util.Objects.requireNonNull(r9, r1)
            s0.a.a.c3.r r14 = r0.d
            s0.a.a.c3.b r1 = r14.d
            r8.macAlgorithm = r1
            byte[] r1 = r0.q
            byte[] r15 = s0.a.e.b.b0.c.h3.I(r1)
            java.math.BigInteger r0 = r0.x
            int r4 = r8.validateIterationCount(r0)
            r8.itCount = r4
            int r0 = r15.length
            r8.saltLength = r0
            s0.a.a.e r0 = r11.d
            s0.a.a.o r0 = (s0.a.a.o) r0
            byte[] r0 = r0.c
            s0.a.a.c3.b r1 = r8.macAlgorithm     // Catch:{ IOException -> 0x00c3, Exception -> 0x00b2 }
            s0.a.a.n r2 = r1.c     // Catch:{ IOException -> 0x00c3, Exception -> 0x00b2 }
            r6 = 0
            r1 = r19
            r3 = r15
            r5 = r21
            r7 = r0
            byte[] r1 = r1.calculatePbeMac(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x00c3, Exception -> 0x00b2 }
            byte[] r2 = r14.c     // Catch:{ IOException -> 0x00c3, Exception -> 0x00b2 }
            byte[] r14 = s0.a.e.b.b0.c.h3.I(r2)     // Catch:{ IOException -> 0x00c3, Exception -> 0x00b2 }
            boolean r1 = s0.a.e.b.b0.c.h3.U(r1, r14)     // Catch:{ IOException -> 0x00c3, Exception -> 0x00b2 }
            if (r1 != 0) goto L_0x00d8
            int r1 = r9.length     // Catch:{ IOException -> 0x00c3, Exception -> 0x00b2 }
            java.lang.String r7 = "PKCS12 key store mac invalid - wrong password or corrupted file."
            if (r1 > 0) goto L_0x00ab
            s0.a.a.c3.b r1 = r8.macAlgorithm     // Catch:{ IOException -> 0x00c3, Exception -> 0x00b2 }
            s0.a.a.n r2 = r1.c     // Catch:{ IOException -> 0x00c3, Exception -> 0x00b2 }
            int r4 = r8.itCount     // Catch:{ IOException -> 0x00c3, Exception -> 0x00b2 }
            r6 = 1
            r1 = r19
            r3 = r15
            r5 = r21
            r15 = r7
            r7 = r0
            byte[] r0 = r1.calculatePbeMac(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x00c3, Exception -> 0x00b2 }
            boolean r0 = s0.a.e.b.b0.c.h3.U(r0, r14)     // Catch:{ IOException -> 0x00c3, Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x00a5
            r0 = 1
            goto L_0x00d9
        L_0x00a5:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x00c3, Exception -> 0x00b2 }
            r0.<init>(r15)     // Catch:{ IOException -> 0x00c3, Exception -> 0x00b2 }
            throw r0     // Catch:{ IOException -> 0x00c3, Exception -> 0x00b2 }
        L_0x00ab:
            r15 = r7
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x00c3, Exception -> 0x00b2 }
            r0.<init>(r15)     // Catch:{ IOException -> 0x00c3, Exception -> 0x00b2 }
            throw r0     // Catch:{ IOException -> 0x00c3, Exception -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "error constructing MAC: "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            java.lang.String r0 = i0.d.a.a.a.b0(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x00c3:
            r0 = move-exception
            throw r0
        L_0x00c5:
            if (r9 == 0) goto L_0x00d8
            java.lang.String r0 = "org.bouncycastle.pkcs12.ignore_useless_passwd"
            boolean r0 = s0.a.g.g.b(r0)
            if (r0 == 0) goto L_0x00d0
            goto L_0x00d8
        L_0x00d0:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "password supplied for keystore that does not require one"
            r0.<init>(r1)
            throw r0
        L_0x00d8:
            r0 = r13
        L_0x00d9:
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r1 = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable
            r1.<init>()
            r8.keys = r1
            java.util.Hashtable r1 = new java.util.Hashtable
            r1.<init>()
            r8.localIds = r1
            s0.a.a.n r1 = r11.c
            s0.a.a.n r2 = s0.a.a.w2.n.d0
            boolean r1 = r1.w(r2)
            java.lang.String r7 = "unmarked"
            java.lang.String r14 = "attempt to add existing attribute with different value"
            if (r1 == 0) goto L_0x0481
            s0.a.a.e r1 = r11.d
            s0.a.a.o r1 = s0.a.a.o.B(r1)
            byte[] r1 = r1.c
            boolean r2 = r1 instanceof s0.a.a.w2.a
            if (r2 == 0) goto L_0x0104
            s0.a.a.w2.a r1 = (s0.a.a.w2.a) r1
            goto L_0x0112
        L_0x0104:
            if (r1 == 0) goto L_0x0111
            s0.a.a.w2.a r2 = new s0.a.a.w2.a
            s0.a.a.s r1 = s0.a.a.s.B(r1)
            r2.<init>((s0.a.a.s) r1)
            r1 = r2
            goto L_0x0112
        L_0x0111:
            r1 = r10
        L_0x0112:
            s0.a.a.w2.c[] r1 = r1.c
            int r11 = r1.length
            s0.a.a.w2.c[] r15 = new s0.a.a.w2.c[r11]
            java.lang.System.arraycopy(r1, r13, r15, r13, r11)
            r1 = r13
            r16 = r1
        L_0x011d:
            if (r13 == r11) goto L_0x0483
            r2 = r15[r13]
            s0.a.a.n r2 = r2.c
            s0.a.a.n r3 = s0.a.a.w2.n.d0
            boolean r2 = r2.w(r3)
            if (r2 == 0) goto L_0x0245
            r2 = r15[r13]
            s0.a.a.e r2 = r2.d
            s0.a.a.o r2 = s0.a.a.o.B(r2)
            byte[] r2 = r2.c
            s0.a.a.s r2 = s0.a.a.s.B(r2)
            r3 = r1
        L_0x013a:
            int r4 = r2.size()
            if (r1 == r4) goto L_0x0241
            s0.a.a.e r4 = r2.D(r1)
            s0.a.a.w2.v r4 = s0.a.a.w2.v.s(r4)
            s0.a.a.n r5 = r4.c
            s0.a.a.n r6 = s0.a.a.w2.n.D0
            boolean r5 = r5.w(r6)
            if (r5 == 0) goto L_0x020c
            s0.a.a.e r5 = r4.d
            s0.a.a.w2.f r5 = s0.a.a.w2.f.s(r5)
            s0.a.a.c3.b r6 = r5.c
            s0.a.a.o r5 = r5.d
            byte[] r5 = r5.c
            java.security.PrivateKey r5 = r8.unwrapKey(r6, r5, r9, r0)
            s0.a.a.v r4 = r4.q
            if (r4 == 0) goto L_0x01e4
            s0.a.a.u r6 = new s0.a.a.u
            r6.<init>(r4)
            r4 = r10
        L_0x016c:
            boolean r17 = r6.hasMoreElements()
            if (r17 == 0) goto L_0x01df
            java.lang.Object r17 = r6.nextElement()
            r20 = r2
            r2 = r17
            s0.a.a.s r2 = (s0.a.a.s) r2
            s0.a.a.e r3 = r2.D(r3)
            s0.a.a.n r3 = (s0.a.a.n) r3
            r17 = r4
            r4 = 1
            s0.a.a.e r2 = r2.D(r4)
            s0.a.a.v r2 = (s0.a.a.v) r2
            s0.a.a.e[] r2 = r2.c
            int r4 = r2.length
            if (r4 <= 0) goto L_0x01b7
            r4 = 0
            r2 = r2[r4]
            s0.a.a.r r2 = (s0.a.a.r) r2
            boolean r4 = r5 instanceof s0.a.d.d.e
            if (r4 == 0) goto L_0x01b8
            r4 = r5
            s0.a.d.d.e r4 = (s0.a.d.d.e) r4
            s0.a.a.e r18 = r4.getBagAttribute(r3)
            if (r18 == 0) goto L_0x01b3
            s0.a.a.r r4 = r18.c()
            boolean r4 = r4.w(r2)
            if (r4 == 0) goto L_0x01ad
            goto L_0x01b8
        L_0x01ad:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r14)
            throw r0
        L_0x01b3:
            r4.setBagAttribute(r3, r2)
            goto L_0x01b8
        L_0x01b7:
            r2 = 0
        L_0x01b8:
            s0.a.a.n r4 = s0.a.a.w2.n.f59l0
            boolean r4 = r3.w(r4)
            if (r4 == 0) goto L_0x01cd
            s0.a.a.n0 r2 = (s0.a.a.n0) r2
            java.lang.String r2 = r2.e()
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r3 = r8.keys
            r3.put(r2, r5)
            r10 = r2
            goto L_0x01d9
        L_0x01cd:
            s0.a.a.n r4 = s0.a.a.w2.n.f60m0
            boolean r3 = r3.w(r4)
            if (r3 == 0) goto L_0x01d9
            s0.a.a.o r2 = (s0.a.a.o) r2
            r4 = r2
            goto L_0x01db
        L_0x01d9:
            r4 = r17
        L_0x01db:
            r3 = 0
            r2 = r20
            goto L_0x016c
        L_0x01df:
            r20 = r2
            r17 = r4
            goto L_0x01e8
        L_0x01e4:
            r20 = r2
            r10 = 0
            r4 = 0
        L_0x01e8:
            if (r4 == 0) goto L_0x0203
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r4.c
            byte[] r3 = s0.a.g.k.d.d(r3)
            r2.<init>(r3)
            if (r10 != 0) goto L_0x01fd
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r3 = r8.keys
            r3.put(r2, r5)
            goto L_0x0239
        L_0x01fd:
            java.util.Hashtable r3 = r8.localIds
            r3.put(r10, r2)
            goto L_0x0239
        L_0x0203:
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r2 = r8.keys
            r2.put(r7, r5)
            r2 = 1
            r16 = r2
            goto L_0x0239
        L_0x020c:
            r20 = r2
            s0.a.a.n r2 = r4.c
            s0.a.a.n r3 = s0.a.a.w2.n.E0
            boolean r2 = r2.w(r3)
            if (r2 == 0) goto L_0x021c
            r12.addElement(r4)
            goto L_0x0239
        L_0x021c:
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r3 = "extra in data "
            java.lang.StringBuilder r3 = i0.d.a.a.a.P0(r3)
            s0.a.a.n r5 = r4.c
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.println(r3)
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r3 = m0.r.t.a.r.m.a1.a.j1(r4)
            r2.println(r3)
        L_0x0239:
            int r1 = r1 + 1
            r10 = 0
            r3 = 0
            r2 = r20
            goto L_0x013a
        L_0x0241:
            r18 = r0
            goto L_0x0479
        L_0x0245:
            r1 = r15[r13]
            s0.a.a.n r1 = r1.c
            s0.a.a.n r2 = s0.a.a.w2.n.f0
            boolean r1 = r1.w(r2)
            if (r1 == 0) goto L_0x0447
            r1 = r15[r13]
            s0.a.a.e r1 = r1.d
            boolean r2 = r1 instanceof s0.a.a.w2.e
            if (r2 == 0) goto L_0x025c
            s0.a.a.w2.e r1 = (s0.a.a.w2.e) r1
            goto L_0x026a
        L_0x025c:
            if (r1 == 0) goto L_0x0269
            s0.a.a.w2.e r2 = new s0.a.a.w2.e
            s0.a.a.s r1 = s0.a.a.s.B(r1)
            r2.<init>(r1)
            r1 = r2
            goto L_0x026a
        L_0x0269:
            r1 = 0
        L_0x026a:
            r2 = 0
            s0.a.a.s r3 = r1.c
            r4 = 1
            s0.a.a.e r3 = r3.D(r4)
            s0.a.a.c3.b r3 = s0.a.a.c3.b.s(r3)
            s0.a.a.s r4 = r1.c
            int r4 = r4.size()
            r5 = 3
            if (r4 != r5) goto L_0x0290
            s0.a.a.s r1 = r1.c
            r4 = 2
            s0.a.a.e r1 = r1.D(r4)
            s0.a.a.z r1 = s0.a.a.z.B(r1)
            r4 = 0
            s0.a.a.o r1 = s0.a.a.o.C(r1, r4)
            goto L_0x0291
        L_0x0290:
            r1 = 0
        L_0x0291:
            byte[] r6 = r1.c
            r1 = r19
            r4 = r21
            r5 = r0
            byte[] r1 = r1.cryptData(r2, r3, r4, r5, r6)
            s0.a.a.s r1 = s0.a.a.s.B(r1)
            r2 = 0
        L_0x02a1:
            int r3 = r1.size()
            if (r2 == r3) goto L_0x0241
            s0.a.a.e r3 = r1.D(r2)
            s0.a.a.w2.v r3 = s0.a.a.w2.v.s(r3)
            s0.a.a.n r4 = r3.c
            s0.a.a.n r5 = s0.a.a.w2.n.E0
            boolean r4 = r4.w(r5)
            if (r4 == 0) goto L_0x02c2
            r12.addElement(r3)
            r18 = r0
            r20 = r1
            goto L_0x043f
        L_0x02c2:
            s0.a.a.n r4 = r3.c
            s0.a.a.n r5 = s0.a.a.w2.n.D0
            boolean r4 = r4.w(r5)
            if (r4 == 0) goto L_0x0379
            s0.a.a.e r4 = r3.d
            s0.a.a.w2.f r4 = s0.a.a.w2.f.s(r4)
            s0.a.a.c3.b r5 = r4.c
            s0.a.a.o r4 = r4.d
            byte[] r4 = r4.c
            java.security.PrivateKey r4 = r8.unwrapKey(r5, r4, r9, r0)
            r5 = r4
            s0.a.d.d.e r5 = (s0.a.d.d.e) r5
            s0.a.a.v r3 = r3.q
            java.util.Objects.requireNonNull(r3)
            s0.a.a.u r6 = new s0.a.a.u
            r6.<init>(r3)
            r3 = 0
            r10 = 0
        L_0x02eb:
            boolean r17 = r6.hasMoreElements()
            if (r17 == 0) goto L_0x035a
            java.lang.Object r17 = r6.nextElement()
            r18 = r0
            r0 = r17
            s0.a.a.s r0 = (s0.a.a.s) r0
            r20 = r1
            r1 = 0
            s0.a.a.e r1 = r0.D(r1)
            s0.a.a.n r1 = (s0.a.a.n) r1
            r17 = r6
            r6 = 1
            s0.a.a.e r0 = r0.D(r6)
            s0.a.a.v r0 = (s0.a.a.v) r0
            s0.a.a.e[] r0 = r0.c
            int r6 = r0.length
            if (r6 <= 0) goto L_0x0332
            r6 = 0
            r0 = r0[r6]
            s0.a.a.r r0 = (s0.a.a.r) r0
            s0.a.a.e r6 = r5.getBagAttribute(r1)
            if (r6 == 0) goto L_0x032e
            s0.a.a.r r6 = r6.c()
            boolean r6 = r6.w(r0)
            if (r6 == 0) goto L_0x0328
            goto L_0x0333
        L_0x0328:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r14)
            throw r0
        L_0x032e:
            r5.setBagAttribute(r1, r0)
            goto L_0x0333
        L_0x0332:
            r0 = 0
        L_0x0333:
            s0.a.a.n r6 = s0.a.a.w2.n.f59l0
            boolean r6 = r1.w(r6)
            if (r6 == 0) goto L_0x0348
            s0.a.a.n0 r0 = (s0.a.a.n0) r0
            java.lang.String r0 = r0.e()
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r1 = r8.keys
            r1.put(r0, r4)
            r10 = r0
            goto L_0x0353
        L_0x0348:
            s0.a.a.n r6 = s0.a.a.w2.n.f60m0
            boolean r1 = r1.w(r6)
            if (r1 == 0) goto L_0x0353
            s0.a.a.o r0 = (s0.a.a.o) r0
            r3 = r0
        L_0x0353:
            r1 = r20
            r6 = r17
            r0 = r18
            goto L_0x02eb
        L_0x035a:
            r18 = r0
            r20 = r1
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r3.c
            byte[] r1 = s0.a.g.k.d.d(r1)
            r0.<init>(r1)
            if (r10 != 0) goto L_0x0372
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r1 = r8.keys
            r1.put(r0, r4)
            goto L_0x043f
        L_0x0372:
            java.util.Hashtable r1 = r8.localIds
            r1.put(r10, r0)
            goto L_0x043f
        L_0x0379:
            r18 = r0
            r20 = r1
            s0.a.a.n r0 = r3.c
            s0.a.a.n r1 = s0.a.a.w2.n.C0
            boolean r0 = r0.w(r1)
            if (r0 == 0) goto L_0x0422
            s0.a.a.e r0 = r3.d
            s0.a.a.w2.p r0 = s0.a.a.w2.p.s(r0)
            java.security.PrivateKey r0 = org.bouncycastle.jce.provider.BouncyCastleProvider.getPrivateKey(r0)
            r1 = r0
            s0.a.d.d.e r1 = (s0.a.d.d.e) r1
            s0.a.a.v r3 = r3.q
            java.util.Objects.requireNonNull(r3)
            s0.a.a.u r4 = new s0.a.a.u
            r4.<init>(r3)
            r3 = 0
            r5 = 0
        L_0x03a0:
            boolean r6 = r4.hasMoreElements()
            if (r6 == 0) goto L_0x0409
            java.lang.Object r6 = r4.nextElement()
            s0.a.a.s r6 = s0.a.a.s.B(r6)
            r10 = 0
            s0.a.a.e r10 = r6.D(r10)
            s0.a.a.n r10 = s0.a.a.n.D(r10)
            r17 = r4
            r4 = 1
            s0.a.a.e r4 = r6.D(r4)
            s0.a.a.v r4 = s0.a.a.v.C(r4)
            s0.a.a.e[] r4 = r4.c
            int r6 = r4.length
            if (r6 <= 0) goto L_0x0406
            r6 = 0
            r4 = r4[r6]
            s0.a.a.r r4 = (s0.a.a.r) r4
            s0.a.a.e r6 = r1.getBagAttribute(r10)
            if (r6 == 0) goto L_0x03e3
            s0.a.a.r r6 = r6.c()
            boolean r6 = r6.w(r4)
            if (r6 == 0) goto L_0x03dd
            goto L_0x03e6
        L_0x03dd:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r14)
            throw r0
        L_0x03e3:
            r1.setBagAttribute(r10, r4)
        L_0x03e6:
            s0.a.a.n r6 = s0.a.a.w2.n.f59l0
            boolean r6 = r10.w(r6)
            if (r6 == 0) goto L_0x03fb
            s0.a.a.n0 r4 = (s0.a.a.n0) r4
            java.lang.String r4 = r4.e()
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r5 = r8.keys
            r5.put(r4, r0)
            r5 = r4
            goto L_0x0406
        L_0x03fb:
            s0.a.a.n r6 = s0.a.a.w2.n.f60m0
            boolean r6 = r10.w(r6)
            if (r6 == 0) goto L_0x0406
            s0.a.a.o r4 = (s0.a.a.o) r4
            r3 = r4
        L_0x0406:
            r4 = r17
            goto L_0x03a0
        L_0x0409:
            java.lang.String r1 = new java.lang.String
            byte[] r3 = r3.c
            byte[] r3 = s0.a.g.k.d.d(r3)
            r1.<init>(r3)
            if (r5 != 0) goto L_0x041c
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r3 = r8.keys
            r3.put(r1, r0)
            goto L_0x043f
        L_0x041c:
            java.util.Hashtable r0 = r8.localIds
            r0.put(r5, r1)
            goto L_0x043f
        L_0x0422:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "extra in encryptedData "
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            s0.a.a.n r4 = r3.c
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = m0.r.t.a.r.m.a1.a.j1(r3)
            r0.println(r1)
        L_0x043f:
            int r2 = r2 + 1
            r1 = r20
            r0 = r18
            goto L_0x02a1
        L_0x0447:
            r18 = r0
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "extra "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r1)
            r3 = r15[r13]
            s0.a.a.n r3 = r3.c
            java.lang.String r3 = r3.d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.println(r2)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            r2 = r15[r13]
            s0.a.a.e r2 = r2.d
            java.lang.String r2 = m0.r.t.a.r.m.a1.a.j1(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L_0x0479:
            int r13 = r13 + 1
            r10 = 0
            r1 = 0
            r0 = r18
            goto L_0x011d
        L_0x0481:
            r16 = 0
        L_0x0483:
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r0 = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable
            r1 = 0
            r0.<init>()
            r8.certs = r0
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r8.chainCerts = r0
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r8.keyCerts = r0
            r0 = 0
        L_0x049a:
            int r2 = r12.size()
            if (r0 == r2) goto L_0x05c3
            java.lang.Object r2 = r12.elementAt(r0)
            s0.a.a.w2.v r2 = (s0.a.a.w2.v) r2
            s0.a.a.e r3 = r2.d
            boolean r4 = r3 instanceof s0.a.a.w2.b
            if (r4 == 0) goto L_0x04af
            s0.a.a.w2.b r3 = (s0.a.a.w2.b) r3
            goto L_0x04bd
        L_0x04af:
            if (r3 == 0) goto L_0x04bc
            s0.a.a.w2.b r4 = new s0.a.a.w2.b
            s0.a.a.s r3 = s0.a.a.s.B(r3)
            r4.<init>(r3)
            r3 = r4
            goto L_0x04bd
        L_0x04bc:
            r3 = r1
        L_0x04bd:
            s0.a.a.n r4 = r3.c
            s0.a.a.n r5 = s0.a.a.w2.n.f62o0
            boolean r4 = r4.w(r5)
            if (r4 == 0) goto L_0x05ae
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x05a3 }
            s0.a.a.e r3 = r3.d     // Catch:{ Exception -> 0x05a3 }
            s0.a.a.o r3 = (s0.a.a.o) r3     // Catch:{ Exception -> 0x05a3 }
            byte[] r3 = r3.c     // Catch:{ Exception -> 0x05a3 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x05a3 }
            java.security.cert.CertificateFactory r3 = r8.certFact     // Catch:{ Exception -> 0x05a3 }
            java.security.cert.Certificate r3 = r3.generateCertificate(r4)     // Catch:{ Exception -> 0x05a3 }
            s0.a.a.v r2 = r2.q
            if (r2 == 0) goto L_0x0548
            s0.a.a.u r4 = new s0.a.a.u
            r4.<init>(r2)
            r2 = r1
            r5 = r2
        L_0x04e3:
            boolean r6 = r4.hasMoreElements()
            if (r6 == 0) goto L_0x054a
            java.lang.Object r6 = r4.nextElement()
            s0.a.a.s r6 = s0.a.a.s.B(r6)
            r9 = 0
            s0.a.a.e r10 = r6.D(r9)
            s0.a.a.n r10 = s0.a.a.n.D(r10)
            r11 = 1
            s0.a.a.e r6 = r6.D(r11)
            s0.a.a.v r6 = s0.a.a.v.C(r6)
            s0.a.a.e[] r6 = r6.c
            int r11 = r6.length
            if (r11 <= 0) goto L_0x04e3
            r6 = r6[r9]
            s0.a.a.r r6 = (s0.a.a.r) r6
            boolean r9 = r3 instanceof s0.a.d.d.e
            if (r9 == 0) goto L_0x052d
            r9 = r3
            s0.a.d.d.e r9 = (s0.a.d.d.e) r9
            s0.a.a.e r11 = r9.getBagAttribute(r10)
            if (r11 == 0) goto L_0x052a
            s0.a.a.r r9 = r11.c()
            boolean r9 = r9.w(r6)
            if (r9 == 0) goto L_0x0524
            goto L_0x052d
        L_0x0524:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r14)
            throw r0
        L_0x052a:
            r9.setBagAttribute(r10, r6)
        L_0x052d:
            s0.a.a.n r9 = s0.a.a.w2.n.f59l0
            boolean r9 = r10.w(r9)
            if (r9 == 0) goto L_0x053c
            s0.a.a.n0 r6 = (s0.a.a.n0) r6
            java.lang.String r5 = r6.e()
            goto L_0x04e3
        L_0x053c:
            s0.a.a.n r9 = s0.a.a.w2.n.f60m0
            boolean r9 = r10.w(r9)
            if (r9 == 0) goto L_0x04e3
            r2 = r6
            s0.a.a.o r2 = (s0.a.a.o) r2
            goto L_0x04e3
        L_0x0548:
            r2 = r1
            r5 = r2
        L_0x054a:
            java.util.Hashtable r4 = r8.chainCerts
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$CertId r6 = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$CertId
            java.security.PublicKey r9 = r3.getPublicKey()
            r6.<init>((java.security.PublicKey) r9)
            r4.put(r6, r3)
            if (r16 == 0) goto L_0x0586
            java.util.Hashtable r2 = r8.keyCerts
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x059f
            java.lang.String r2 = new java.lang.String
            java.security.PublicKey r4 = r3.getPublicKey()
            s0.a.a.c3.l0 r4 = r8.createSubjectKeyId(r4)
            byte[] r4 = r4.s()
            byte[] r4 = s0.a.g.k.d.d(r4)
            r2.<init>(r4)
            java.util.Hashtable r4 = r8.keyCerts
            r4.put(r2, r3)
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r3 = r8.keys
            java.lang.Object r4 = r3.remove(r7)
            r3.put(r2, r4)
            goto L_0x059f
        L_0x0586:
            if (r2 == 0) goto L_0x0598
            java.lang.String r4 = new java.lang.String
            byte[] r2 = r2.c
            byte[] r2 = s0.a.g.k.d.d(r2)
            r4.<init>(r2)
            java.util.Hashtable r2 = r8.keyCerts
            r2.put(r4, r3)
        L_0x0598:
            if (r5 == 0) goto L_0x059f
            org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable r2 = r8.certs
            r2.put(r5, r3)
        L_0x059f:
            int r0 = r0 + 1
            goto L_0x049a
        L_0x05a3:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x05ae:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unsupported certificate type: "
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            s0.a.a.n r2 = r3.c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x05c3:
            return
        L_0x05c4:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
        L_0x05cf:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "stream does not represent a PKCS12 key store"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.engineLoad(java.io.InputStream, char[]):void");
    }

    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        if (this.keys.get(str) == null) {
            this.certs.put(str, certificate);
            this.chainCerts.put(new CertId(certificate.getPublicKey()), certificate);
            return;
        }
        throw new KeyStoreException(i0.d.a.a.a.o0("There is a key entry with the name ", str, "."));
    }

    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        boolean z = key instanceof PrivateKey;
        if (!z) {
            throw new KeyStoreException("PKCS12 does not support non-PrivateKeys");
        } else if (!z || certificateArr != null) {
            if (this.keys.get(str) != null) {
                engineDeleteEntry(str);
            }
            this.keys.put(str, key);
            if (certificateArr != null) {
                this.certs.put(str, certificateArr[0]);
                for (int i = 0; i != certificateArr.length; i++) {
                    this.chainCerts.put(new CertId(certificateArr[i].getPublicKey()), certificateArr[i]);
                }
            }
        } else {
            throw new KeyStoreException("no certificate chain for private key");
        }
    }

    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        throw new RuntimeException("operation not supported");
    }

    public int engineSize() {
        Hashtable hashtable = new Hashtable();
        Enumeration keys2 = this.certs.keys();
        while (keys2.hasMoreElements()) {
            hashtable.put(keys2.nextElement(), "cert");
        }
        Enumeration keys3 = this.keys.keys();
        while (keys3.hasMoreElements()) {
            String str = (String) keys3.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
            }
        }
        return hashtable.size();
    }

    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
        doStore(outputStream, cArr, false);
    }

    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException, NoSuchAlgorithmException, CertificateException {
        s0.a.c.c cVar;
        char[] cArr;
        if (loadStoreParameter != null) {
            boolean z = loadStoreParameter instanceof s0.a.c.c;
            if (z || (loadStoreParameter instanceof JDKPKCS12StoreParameter)) {
                if (z) {
                    cVar = (s0.a.c.c) loadStoreParameter;
                } else {
                    JDKPKCS12StoreParameter jDKPKCS12StoreParameter = (JDKPKCS12StoreParameter) loadStoreParameter;
                    cVar = new s0.a.c.c(jDKPKCS12StoreParameter.getOutputStream(), loadStoreParameter.getProtectionParameter(), jDKPKCS12StoreParameter.isUseDEREncoding());
                }
                KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
                if (protectionParameter == null) {
                    cArr = null;
                } else if (protectionParameter instanceof KeyStore.PasswordProtection) {
                    cArr = ((KeyStore.PasswordProtection) protectionParameter).getPassword();
                } else {
                    StringBuilder P0 = i0.d.a.a.a.P0("No support for protection parameter of type ");
                    P0.append(protectionParameter.getClass().getName());
                    throw new IllegalArgumentException(P0.toString());
                }
                doStore(cVar.getOutputStream(), cArr, cVar.isForDEREncoding());
                return;
            }
            StringBuilder P02 = i0.d.a.a.a.P0("No support for 'param' of type ");
            P02.append(loadStoreParameter.getClass().getName());
            throw new IllegalArgumentException(P02.toString());
        }
        throw new IllegalArgumentException("'param' arg cannot be null");
    }

    public void setRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    public PrivateKey unwrapKey(b bVar, byte[] bArr, char[] cArr, boolean z) throws IOException {
        s0.a.a.n nVar = bVar.c;
        try {
            if (nVar.G(n.F0)) {
                m s = m.s(bVar.d);
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(s.d.c, validateIterationCount(s.t()));
                Cipher c = this.helper.c(nVar.d);
                c.init(4, new PKCS12Key(cArr, z), pBEParameterSpec);
                return (PrivateKey) c.unwrap(bArr, "", 2);
            } else if (nVar.w(n.O)) {
                return (PrivateKey) createCipher(4, cArr, bVar).unwrap(bArr, "", 2);
            } else {
                throw new IOException("exception unwrapping private key - cannot recognise: " + nVar);
            }
        } catch (Exception e) {
            throw new IOException(i0.d.a.a.a.b0(e, i0.d.a.a.a.P0("exception unwrapping private key - ")));
        }
    }

    public byte[] wrapKey(String str, Key key, m mVar, char[] cArr) throws IOException {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
        try {
            SecretKeyFactory g = this.helper.g(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(mVar.d.c, mVar.t().intValue());
            Cipher c = this.helper.c(str);
            c.init(3, g.generateSecret(pBEKeySpec), pBEParameterSpec);
            return c.wrap(key);
        } catch (Exception e) {
            throw new IOException(i0.d.a.a.a.b0(e, i0.d.a.a.a.P0("exception encrypting data - ")));
        }
    }
}
