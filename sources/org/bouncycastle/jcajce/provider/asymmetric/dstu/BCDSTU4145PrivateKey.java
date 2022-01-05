package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import s0.a.a.c3.m0;
import s0.a.a.n;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.w2.p;
import s0.a.b.k0.b0;
import s0.a.b.k0.w;
import s0.a.d.d.e;
import s0.a.d.e.f;

public class BCDSTU4145PrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, e {
    public static final long serialVersionUID = 7245981689601667138L;
    private String algorithm = "DSTU4145";
    private transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient BigInteger d;
    private transient ECParameterSpec ecSpec;
    private transient o0 publicKey;
    private boolean withCompression;

    public BCDSTU4145PrivateKey() {
    }

    public BCDSTU4145PrivateKey(String str, b0 b0Var) {
        this.algorithm = str;
        this.d = b0Var.q;
        this.ecSpec = null;
    }

    public BCDSTU4145PrivateKey(ECPrivateKey eCPrivateKey) {
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public BCDSTU4145PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public BCDSTU4145PrivateKey(BCDSTU4145PrivateKey bCDSTU4145PrivateKey) {
        this.d = bCDSTU4145PrivateKey.d;
        this.ecSpec = bCDSTU4145PrivateKey.ecSpec;
        this.withCompression = bCDSTU4145PrivateKey.withCompression;
        this.attrCarrier = bCDSTU4145PrivateKey.attrCarrier;
        this.publicKey = bCDSTU4145PrivateKey.publicKey;
    }

    public BCDSTU4145PrivateKey(p pVar) throws IOException {
        populateFromPrivKeyInfo(pVar);
    }

    private o0 getPublicKeyDetails(BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        try {
            return m0.s(r.x(bCDSTU4145PublicKey.getEncoded())).d;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: s0.a.d.e.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: s0.a.d.e.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: s0.a.d.e.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.security.spec.ECParameterSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: s0.a.d.e.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: s0.a.d.e.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: s0.a.d.e.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: s0.a.d.e.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: s0.a.d.e.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void populateFromPrivKeyInfo(s0.a.a.w2.p r13) throws java.io.IOException {
        /*
            r12 = this;
            s0.a.a.c3.b r0 = r13.d
            s0.a.a.e r0 = r0.d
            s0.a.a.d3.f r0 = s0.a.a.d3.f.s(r0)
            s0.a.a.r r1 = r0.c
            boolean r2 = r1 instanceof s0.a.a.n
            if (r2 == 0) goto L_0x005a
            s0.a.a.n r0 = s0.a.a.n.D(r1)
            s0.a.a.d3.h r1 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByOid(r0)
            if (r1 != 0) goto L_0x0039
            s0.a.b.k0.w r1 = s0.a.a.a3.c.a(r0)
            s0.a.e.b.e r2 = r1.g
            byte[] r3 = r1.a()
            java.security.spec.EllipticCurve r6 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r2, r3)
            s0.a.d.e.d r2 = new s0.a.d.e.d
            java.lang.String r5 = r0.d
            s0.a.e.b.h r0 = r1.i
            java.security.spec.ECPoint r7 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r0)
            java.math.BigInteger r8 = r1.j
            java.math.BigInteger r9 = r1.k
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0095
        L_0x0039:
            s0.a.e.b.e r2 = r1.q
            byte[] r3 = r1.u()
            java.security.spec.EllipticCurve r6 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r2, r3)
            s0.a.d.e.d r2 = new s0.a.d.e.d
            java.lang.String r5 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getCurveName(r0)
            s0.a.e.b.h r0 = r1.s()
            java.security.spec.ECPoint r7 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r0)
            java.math.BigInteger r8 = r1.y
            java.math.BigInteger r9 = r1.Y1
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0095
        L_0x005a:
            boolean r2 = r1 instanceof s0.a.a.l
            if (r2 == 0) goto L_0x0063
            r0 = 0
            r12.ecSpec = r0
            goto L_0x0134
        L_0x0063:
            s0.a.a.s r1 = s0.a.a.s.B(r1)
            r2 = 0
            s0.a.a.e r2 = r1.D(r2)
            boolean r2 = r2 instanceof s0.a.a.k
            if (r2 == 0) goto L_0x0099
            s0.a.a.r r0 = r0.c
            s0.a.a.d3.h r0 = s0.a.a.d3.h.t(r0)
            s0.a.e.b.e r1 = r0.q
            byte[] r2 = r0.u()
            java.security.spec.EllipticCurve r1 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r1, r2)
            java.security.spec.ECParameterSpec r2 = new java.security.spec.ECParameterSpec
            s0.a.e.b.h r3 = r0.s()
            java.security.spec.ECPoint r3 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r3)
            java.math.BigInteger r4 = r0.y
            java.math.BigInteger r0 = r0.Y1
            int r0 = r0.intValue()
            r2.<init>(r1, r3, r4, r0)
        L_0x0095:
            r12.ecSpec = r2
            goto L_0x0134
        L_0x0099:
            s0.a.a.a3.d r0 = s0.a.a.a3.d.t(r1)
            boolean r1 = r0.u()
            if (r1 == 0) goto L_0x00be
            s0.a.a.n r0 = r0.d
            s0.a.b.k0.w r1 = s0.a.a.a3.c.a(r0)
            s0.a.d.e.c r9 = new s0.a.d.e.c
            java.lang.String r3 = r0.d
            s0.a.e.b.e r4 = r1.g
            s0.a.e.b.h r5 = r1.i
            java.math.BigInteger r6 = r1.j
            java.math.BigInteger r7 = r1.k
            byte[] r8 = r1.a()
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x0117
        L_0x00be:
            s0.a.a.a3.b r0 = r0.q
            s0.a.a.o r1 = r0.x
            byte[] r1 = r1.c
            byte[] r1 = s0.a.e.b.b0.c.h3.I(r1)
            s0.a.a.c3.b r2 = r13.d
            s0.a.a.n r2 = r2.c
            s0.a.a.n r3 = s0.a.a.a3.e.b
            boolean r2 = r2.w(r3)
            if (r2 == 0) goto L_0x00d7
            r12.reverseBytes(r1)
        L_0x00d7:
            s0.a.a.a3.a r2 = r0.d
            s0.a.e.b.e$d r11 = new s0.a.e.b.e$d
            int r5 = r2.c
            int r6 = r2.d
            int r7 = r2.q
            int r8 = r2.x
            s0.a.a.k r2 = r0.q
            java.math.BigInteger r9 = r2.E()
            java.math.BigInteger r10 = new java.math.BigInteger
            r2 = 1
            r10.<init>(r2, r1)
            r4 = r11
            r4.<init>((int) r5, (int) r6, (int) r7, (int) r8, (java.math.BigInteger) r9, (java.math.BigInteger) r10)
            s0.a.a.o r1 = r0.Y1
            byte[] r1 = r1.c
            byte[] r1 = s0.a.e.b.b0.c.h3.I(r1)
            s0.a.a.c3.b r2 = r13.d
            s0.a.a.n r2 = r2.c
            boolean r2 = r2.w(r3)
            if (r2 == 0) goto L_0x0108
            r12.reverseBytes(r1)
        L_0x0108:
            s0.a.d.e.e r9 = new s0.a.d.e.e
            s0.a.e.b.h r1 = m0.r.t.a.r.m.a1.a.b1(r11, r1)
            s0.a.a.k r0 = r0.y
            java.math.BigInteger r0 = r0.E()
            r9.<init>(r11, r1, r0)
        L_0x0117:
            s0.a.e.b.e r0 = r9.a
            byte[] r1 = r9.b
            java.security.spec.EllipticCurve r0 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r0, r1)
            java.security.spec.ECParameterSpec r1 = new java.security.spec.ECParameterSpec
            s0.a.e.b.h r2 = r9.c
            java.security.spec.ECPoint r2 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r2)
            java.math.BigInteger r3 = r9.d
            java.math.BigInteger r4 = r9.e
            int r4 = r4.intValue()
            r1.<init>(r0, r2, r3, r4)
            r12.ecSpec = r1
        L_0x0134:
            s0.a.a.e r13 = r13.u()
            boolean r0 = r13 instanceof s0.a.a.k
            if (r0 == 0) goto L_0x0147
            s0.a.a.k r13 = s0.a.a.k.B(r13)
            java.math.BigInteger r13 = r13.E()
            r12.d = r13
            goto L_0x0157
        L_0x0147:
            s0.a.a.y2.a r13 = s0.a.a.y2.a.s(r13)
            java.math.BigInteger r0 = r13.t()
            r12.d = r0
            s0.a.a.o0 r13 = r13.v()
            r12.publicKey = r13
        L_0x0157:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey.populateFromPrivKeyInfo(s0.a.a.w2.p):void");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        populateFromPrivKeyInfo(p.s(r.x((byte[]) objectInputStream.readObject())));
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void reverseBytes(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public s0.a.d.e.e engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCDSTU4145PrivateKey)) {
            return false;
        }
        BCDSTU4145PrivateKey bCDSTU4145PrivateKey = (BCDSTU4145PrivateKey) obj;
        return getD().equals(bCDSTU4145PrivateKey.getD()) && engineGetSpec().equals(bCDSTU4145PrivateKey.engineGetSpec());
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public s0.a.a.e getBagAttribute(n nVar) {
        return this.attrCarrier.getBagAttribute(nVar);
    }

    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    public BigInteger getD() {
        return this.d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a8 A[Catch:{ IOException -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b9 A[Catch:{ IOException -> 0x00d0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
            r9 = this;
            java.security.spec.ECParameterSpec r0 = r9.ecSpec
            boolean r1 = r0 instanceof s0.a.d.e.d
            r2 = 0
            if (r1 == 0) goto L_0x0022
            s0.a.d.e.d r0 = (s0.a.d.e.d) r0
            java.lang.String r0 = r0.a
            s0.a.a.n r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveOid((java.lang.String) r0)
            if (r0 != 0) goto L_0x001c
            s0.a.a.n r0 = new s0.a.a.n
            java.security.spec.ECParameterSpec r1 = r9.ecSpec
            s0.a.d.e.d r1 = (s0.a.d.e.d) r1
            java.lang.String r1 = r1.a
            r0.<init>((java.lang.String) r1)
        L_0x001c:
            s0.a.a.d3.f r1 = new s0.a.a.d3.f
            r1.<init>((s0.a.a.n) r0)
            goto L_0x0075
        L_0x0022:
            if (r0 != 0) goto L_0x0036
            s0.a.a.d3.f r1 = new s0.a.a.d3.f
            s0.a.a.v0 r0 = s0.a.a.v0.c
            r1.<init>((s0.a.a.l) r0)
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION
            java.math.BigInteger r3 = r9.getS()
            int r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(r0, r2, r3)
            goto L_0x0085
        L_0x0036:
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            s0.a.e.b.e r4 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r0)
            s0.a.a.d3.h r0 = new s0.a.a.d3.h
            s0.a.a.d3.j r5 = new s0.a.a.d3.j
            java.security.spec.ECParameterSpec r1 = r9.ecSpec
            java.security.spec.ECPoint r1 = r1.getGenerator()
            s0.a.e.b.h r1 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint((s0.a.e.b.e) r4, (java.security.spec.ECPoint) r1)
            boolean r3 = r9.withCompression
            r5.<init>((s0.a.e.b.h) r1, (boolean) r3)
            java.security.spec.ECParameterSpec r1 = r9.ecSpec
            java.math.BigInteger r6 = r1.getOrder()
            java.security.spec.ECParameterSpec r1 = r9.ecSpec
            int r1 = r1.getCofactor()
            long r7 = (long) r1
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r7)
            java.security.spec.ECParameterSpec r1 = r9.ecSpec
            java.security.spec.EllipticCurve r1 = r1.getCurve()
            byte[] r8 = r1.getSeed()
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            s0.a.a.d3.f r1 = new s0.a.a.d3.f
            r1.<init>((s0.a.a.d3.h) r0)
        L_0x0075:
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            java.math.BigInteger r3 = r3.getOrder()
            java.math.BigInteger r4 = r9.getS()
            int r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(r0, r3, r4)
        L_0x0085:
            s0.a.a.o0 r3 = r9.publicKey
            if (r3 == 0) goto L_0x0095
            s0.a.a.y2.a r3 = new s0.a.a.y2.a
            java.math.BigInteger r4 = r9.getS()
            s0.a.a.o0 r5 = r9.publicKey
            r3.<init>(r0, r4, r5, r1)
            goto L_0x009e
        L_0x0095:
            s0.a.a.y2.a r3 = new s0.a.a.y2.a
            java.math.BigInteger r4 = r9.getS()
            r3.<init>(r0, r4, r2, r1)
        L_0x009e:
            java.lang.String r0 = r9.algorithm     // Catch:{ IOException -> 0x00d0 }
            java.lang.String r4 = "DSTU4145"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x00d0 }
            if (r0 == 0) goto L_0x00b9
            s0.a.a.w2.p r0 = new s0.a.a.w2.p     // Catch:{ IOException -> 0x00d0 }
            s0.a.a.c3.b r4 = new s0.a.a.c3.b     // Catch:{ IOException -> 0x00d0 }
            s0.a.a.n r5 = s0.a.a.a3.e.c     // Catch:{ IOException -> 0x00d0 }
            s0.a.a.r r1 = r1.c     // Catch:{ IOException -> 0x00d0 }
            r4.<init>(r5, r1)     // Catch:{ IOException -> 0x00d0 }
            s0.a.a.s r1 = r3.c     // Catch:{ IOException -> 0x00d0 }
            r0.<init>(r4, r1, r2, r2)     // Catch:{ IOException -> 0x00d0 }
            goto L_0x00c9
        L_0x00b9:
            s0.a.a.w2.p r0 = new s0.a.a.w2.p     // Catch:{ IOException -> 0x00d0 }
            s0.a.a.c3.b r4 = new s0.a.a.c3.b     // Catch:{ IOException -> 0x00d0 }
            s0.a.a.n r5 = s0.a.a.d3.m.h1     // Catch:{ IOException -> 0x00d0 }
            s0.a.a.r r1 = r1.c     // Catch:{ IOException -> 0x00d0 }
            r4.<init>(r5, r1)     // Catch:{ IOException -> 0x00d0 }
            s0.a.a.s r1 = r3.c     // Catch:{ IOException -> 0x00d0 }
            r0.<init>(r4, r1, r2, r2)     // Catch:{ IOException -> 0x00d0 }
        L_0x00c9:
            java.lang.String r1 = "DER"
            byte[] r0 = r0.r(r1)     // Catch:{ IOException -> 0x00d0 }
            return r0
        L_0x00d0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey.getEncoded():byte[]");
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public s0.a.d.e.e getParameters() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    public BigInteger getS() {
        return this.d;
    }

    public int hashCode() {
        return getD().hashCode() ^ engineGetSpec().hashCode();
    }

    public void setBagAttribute(n nVar, s0.a.a.e eVar) {
        this.attrCarrier.setBagAttribute(nVar, eVar);
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.privateKeyToString(this.algorithm, this.d, engineGetSpec());
    }

    public BCDSTU4145PrivateKey(String str, b0 b0Var, BCDSTU4145PublicKey bCDSTU4145PublicKey, ECParameterSpec eCParameterSpec) {
        w wVar = b0Var.d;
        this.algorithm = str;
        this.d = b0Var.q;
        if (eCParameterSpec == null) {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(wVar.g, wVar.a()), EC5Util.convertPoint(wVar.i), wVar.j, wVar.k.intValue());
        } else {
            this.ecSpec = eCParameterSpec;
        }
        this.publicKey = getPublicKeyDetails(bCDSTU4145PublicKey);
    }

    public BCDSTU4145PrivateKey(String str, b0 b0Var, BCDSTU4145PublicKey bCDSTU4145PublicKey, s0.a.d.e.e eVar) {
        ECParameterSpec eCParameterSpec;
        w wVar = b0Var.d;
        this.algorithm = str;
        this.d = b0Var.q;
        if (eVar == null) {
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(wVar.g, wVar.a()), EC5Util.convertPoint(wVar.i), wVar.j, wVar.k.intValue());
        } else {
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(eVar.a, eVar.b), EC5Util.convertPoint(eVar.c), eVar.d, eVar.e.intValue());
        }
        this.ecSpec = eCParameterSpec;
        this.publicKey = getPublicKeyDetails(bCDSTU4145PublicKey);
    }

    public BCDSTU4145PrivateKey(f fVar) {
        this.d = fVar.d;
        s0.a.d.e.e eVar = fVar.c;
        this.ecSpec = eVar != null ? EC5Util.convertSpec(EC5Util.convertCurve(eVar.a, eVar.b), fVar.c) : null;
    }
}
