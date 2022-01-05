package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

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
import s0.a.a.g2.f;
import s0.a.a.n;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.w2.p;
import s0.a.b.k0.b0;
import s0.a.b.k0.w;
import s0.a.d.d.e;

public class BCECGOST3410_2012PrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, e {
    public static final long serialVersionUID = 7245981689601667138L;
    private String algorithm = "ECGOST3410-2012";
    private transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient BigInteger d;
    private transient ECParameterSpec ecSpec;
    private transient f gostParams;
    private transient o0 publicKey;
    private boolean withCompression;

    public BCECGOST3410_2012PrivateKey() {
    }

    public BCECGOST3410_2012PrivateKey(String str, b0 b0Var) {
        this.algorithm = str;
        this.d = b0Var.q;
        this.ecSpec = null;
    }

    public BCECGOST3410_2012PrivateKey(ECPrivateKey eCPrivateKey) {
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public BCECGOST3410_2012PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public BCECGOST3410_2012PrivateKey(BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey) {
        this.d = bCECGOST3410_2012PrivateKey.d;
        this.ecSpec = bCECGOST3410_2012PrivateKey.ecSpec;
        this.withCompression = bCECGOST3410_2012PrivateKey.withCompression;
        this.attrCarrier = bCECGOST3410_2012PrivateKey.attrCarrier;
        this.publicKey = bCECGOST3410_2012PrivateKey.publicKey;
        this.gostParams = bCECGOST3410_2012PrivateKey.gostParams;
    }

    public BCECGOST3410_2012PrivateKey(p pVar) throws IOException {
        populateFromPrivKeyInfo(pVar);
    }

    private void extractBytes(byte[] bArr, int i, int i2, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i3 = 0; i3 != i; i3++) {
            bArr[i2 + i3] = byteArray[(byteArray.length - 1) - i3];
        }
    }

    private o0 getPublicKeyDetails(BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey) {
        return m0.s(bCECGOST3410_2012PublicKey.getEncoded()).d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: s0.a.d.e.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.security.spec.ECParameterSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: s0.a.d.e.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: s0.a.d.e.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: s0.a.d.e.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void populateFromPrivKeyInfo(s0.a.a.w2.p r11) throws java.io.IOException {
        /*
            r10 = this;
            s0.a.a.c3.b r0 = r11.d
            s0.a.a.e r0 = r0.d
            s0.a.a.r r0 = r0.c()
            boolean r1 = r0 instanceof s0.a.a.s
            if (r1 == 0) goto L_0x009c
            s0.a.a.s r1 = s0.a.a.s.B(r0)
            int r1 = r1.size()
            r2 = 2
            if (r1 == r2) goto L_0x0022
            s0.a.a.s r0 = s0.a.a.s.B(r0)
            int r0 = r0.size()
            r1 = 3
            if (r0 != r1) goto L_0x009c
        L_0x0022:
            s0.a.a.c3.b r0 = r11.d
            s0.a.a.e r0 = r0.d
            s0.a.a.g2.f r0 = s0.a.a.g2.f.s(r0)
            r10.gostParams = r0
            s0.a.a.n r0 = r0.c
            java.lang.String r0 = s0.a.a.g2.b.b(r0)
            s0.a.d.e.c r0 = m0.r.t.a.r.m.a1.a.U1(r0)
            s0.a.e.b.e r1 = r0.a
            byte[] r2 = r0.b
            java.security.spec.EllipticCurve r5 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r1, r2)
            s0.a.d.e.d r1 = new s0.a.d.e.d
            s0.a.a.g2.f r2 = r10.gostParams
            s0.a.a.n r2 = r2.c
            java.lang.String r4 = s0.a.a.g2.b.b(r2)
            s0.a.e.b.h r2 = r0.c
            java.security.spec.ECPoint r6 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r2)
            java.math.BigInteger r7 = r0.d
            java.math.BigInteger r8 = r0.e
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            r10.ecSpec = r1
            s0.a.a.o r0 = r11.t()
            byte[] r1 = r0.c
            int r2 = r1.length
            r3 = 32
            r4 = 1
            if (r2 == r3) goto L_0x008f
            int r1 = r1.length
            r2 = 64
            if (r1 != r2) goto L_0x006a
            goto L_0x008f
        L_0x006a:
            s0.a.a.e r11 = r11.u()
            boolean r0 = r11 instanceof s0.a.a.k
            if (r0 == 0) goto L_0x007c
            s0.a.a.k r11 = s0.a.a.k.B(r11)
            java.math.BigInteger r11 = r11.D()
            goto L_0x0137
        L_0x007c:
            s0.a.a.o r11 = s0.a.a.o.B(r11)
            byte[] r11 = r11.c
            java.math.BigInteger r0 = new java.math.BigInteger
            byte[] r11 = s0.a.e.b.b0.c.h3.J2(r11)
            r0.<init>(r4, r11)
            r10.d = r0
            goto L_0x014a
        L_0x008f:
            java.math.BigInteger r11 = new java.math.BigInteger
            byte[] r0 = r0.c
            byte[] r0 = s0.a.e.b.b0.c.h3.J2(r0)
            r11.<init>(r4, r0)
            goto L_0x0137
        L_0x009c:
            s0.a.a.c3.b r0 = r11.d
            s0.a.a.e r0 = r0.d
            s0.a.a.d3.f r0 = s0.a.a.d3.f.s(r0)
            s0.a.a.r r0 = r0.c
            boolean r1 = r0 instanceof s0.a.a.n
            if (r1 == 0) goto L_0x00fa
            s0.a.a.n r0 = s0.a.a.n.D(r0)
            s0.a.a.d3.h r1 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByOid(r0)
            if (r1 != 0) goto L_0x00d9
            s0.a.a.d3.h r1 = s0.a.a.g2.b.a(r0)
            s0.a.e.b.e r2 = r1.q
            byte[] r3 = r1.u()
            java.security.spec.EllipticCurve r6 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r2, r3)
            s0.a.d.e.d r2 = new s0.a.d.e.d
            java.lang.String r5 = s0.a.a.g2.b.b(r0)
            s0.a.e.b.h r0 = r1.s()
            java.security.spec.ECPoint r7 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r0)
            java.math.BigInteger r8 = r1.y
            java.math.BigInteger r9 = r1.Y1
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0125
        L_0x00d9:
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
            goto L_0x0125
        L_0x00fa:
            boolean r1 = r0 instanceof s0.a.a.l
            if (r1 == 0) goto L_0x0102
            r0 = 0
            r10.ecSpec = r0
            goto L_0x0127
        L_0x0102:
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
        L_0x0125:
            r10.ecSpec = r2
        L_0x0127:
            s0.a.a.e r11 = r11.u()
            boolean r0 = r11 instanceof s0.a.a.k
            if (r0 == 0) goto L_0x013a
            s0.a.a.k r11 = s0.a.a.k.B(r11)
            java.math.BigInteger r11 = r11.E()
        L_0x0137:
            r10.d = r11
            goto L_0x014a
        L_0x013a:
            s0.a.a.y2.a r11 = s0.a.a.y2.a.s(r11)
            java.math.BigInteger r0 = r11.t()
            r10.d = r0
            s0.a.a.o0 r11 = r11.v()
            r10.publicKey = r11
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PrivateKey.populateFromPrivKeyInfo(s0.a.a.w2.p):void");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        populateFromPrivKeyInfo(p.s(r.x((byte[]) objectInputStream.readObject())));
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
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
        if (!(obj instanceof BCECGOST3410_2012PrivateKey)) {
            return false;
        }
        BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey = (BCECGOST3410_2012PrivateKey) obj;
        return getD().equals(bCECGOST3410_2012PrivateKey.getD()) && engineGetSpec().equals(bCECGOST3410_2012PrivateKey.engineGetSpec());
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

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
            r12 = this;
            java.math.BigInteger r0 = r12.d
            int r0 = r0.bitLength()
            r1 = 0
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            if (r0 == 0) goto L_0x0013
            s0.a.a.n r2 = s0.a.a.x2.a.h
            goto L_0x0015
        L_0x0013:
            s0.a.a.n r2 = s0.a.a.x2.a.g
        L_0x0015:
            if (r0 == 0) goto L_0x001a
            r0 = 64
            goto L_0x001c
        L_0x001a:
            r0 = 32
        L_0x001c:
            s0.a.a.g2.f r3 = r12.gostParams
            java.lang.String r4 = "DER"
            r5 = 0
            if (r3 == 0) goto L_0x0043
            byte[] r3 = new byte[r0]
            java.math.BigInteger r6 = r12.getS()
            r12.extractBytes(r3, r0, r1, r6)
            s0.a.a.w2.p r0 = new s0.a.a.w2.p     // Catch:{ IOException -> 0x0042 }
            s0.a.a.c3.b r1 = new s0.a.a.c3.b     // Catch:{ IOException -> 0x0042 }
            s0.a.a.g2.f r6 = r12.gostParams     // Catch:{ IOException -> 0x0042 }
            r1.<init>(r2, r6)     // Catch:{ IOException -> 0x0042 }
            s0.a.a.x0 r2 = new s0.a.a.x0     // Catch:{ IOException -> 0x0042 }
            r2.<init>((byte[]) r3)     // Catch:{ IOException -> 0x0042 }
            r0.<init>(r1, r2, r5, r5)     // Catch:{ IOException -> 0x0042 }
            byte[] r0 = r0.r(r4)     // Catch:{ IOException -> 0x0042 }
            return r0
        L_0x0042:
            return r5
        L_0x0043:
            java.security.spec.ECParameterSpec r0 = r12.ecSpec
            boolean r1 = r0 instanceof s0.a.d.e.d
            if (r1 == 0) goto L_0x0064
            s0.a.d.e.d r0 = (s0.a.d.e.d) r0
            java.lang.String r0 = r0.a
            s0.a.a.n r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveOid((java.lang.String) r0)
            if (r0 != 0) goto L_0x005e
            s0.a.a.n r0 = new s0.a.a.n
            java.security.spec.ECParameterSpec r1 = r12.ecSpec
            s0.a.d.e.d r1 = (s0.a.d.e.d) r1
            java.lang.String r1 = r1.a
            r0.<init>((java.lang.String) r1)
        L_0x005e:
            s0.a.a.d3.f r1 = new s0.a.a.d3.f
            r1.<init>((s0.a.a.n) r0)
            goto L_0x00b7
        L_0x0064:
            if (r0 != 0) goto L_0x0078
            s0.a.a.d3.f r1 = new s0.a.a.d3.f
            s0.a.a.v0 r0 = s0.a.a.v0.c
            r1.<init>((s0.a.a.l) r0)
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION
            java.math.BigInteger r3 = r12.getS()
            int r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(r0, r5, r3)
            goto L_0x00c7
        L_0x0078:
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            s0.a.e.b.e r7 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r0)
            s0.a.a.d3.h r0 = new s0.a.a.d3.h
            s0.a.a.d3.j r8 = new s0.a.a.d3.j
            java.security.spec.ECParameterSpec r1 = r12.ecSpec
            java.security.spec.ECPoint r1 = r1.getGenerator()
            s0.a.e.b.h r1 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint((s0.a.e.b.e) r7, (java.security.spec.ECPoint) r1)
            boolean r3 = r12.withCompression
            r8.<init>((s0.a.e.b.h) r1, (boolean) r3)
            java.security.spec.ECParameterSpec r1 = r12.ecSpec
            java.math.BigInteger r9 = r1.getOrder()
            java.security.spec.ECParameterSpec r1 = r12.ecSpec
            int r1 = r1.getCofactor()
            long r10 = (long) r1
            java.math.BigInteger r10 = java.math.BigInteger.valueOf(r10)
            java.security.spec.ECParameterSpec r1 = r12.ecSpec
            java.security.spec.EllipticCurve r1 = r1.getCurve()
            byte[] r11 = r1.getSeed()
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            s0.a.a.d3.f r1 = new s0.a.a.d3.f
            r1.<init>((s0.a.a.d3.h) r0)
        L_0x00b7:
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION
            java.security.spec.ECParameterSpec r3 = r12.ecSpec
            java.math.BigInteger r3 = r3.getOrder()
            java.math.BigInteger r6 = r12.getS()
            int r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(r0, r3, r6)
        L_0x00c7:
            s0.a.a.o0 r3 = r12.publicKey
            if (r3 == 0) goto L_0x00d7
            s0.a.a.y2.a r3 = new s0.a.a.y2.a
            java.math.BigInteger r6 = r12.getS()
            s0.a.a.o0 r7 = r12.publicKey
            r3.<init>(r0, r6, r7, r1)
            goto L_0x00e0
        L_0x00d7:
            s0.a.a.y2.a r3 = new s0.a.a.y2.a
            java.math.BigInteger r6 = r12.getS()
            r3.<init>(r0, r6, r5, r1)
        L_0x00e0:
            s0.a.a.w2.p r0 = new s0.a.a.w2.p     // Catch:{ IOException -> 0x00f3 }
            s0.a.a.c3.b r6 = new s0.a.a.c3.b     // Catch:{ IOException -> 0x00f3 }
            s0.a.a.r r1 = r1.c     // Catch:{ IOException -> 0x00f3 }
            r6.<init>(r2, r1)     // Catch:{ IOException -> 0x00f3 }
            s0.a.a.s r1 = r3.c     // Catch:{ IOException -> 0x00f3 }
            r0.<init>(r6, r1, r5, r5)     // Catch:{ IOException -> 0x00f3 }
            byte[] r0 = r0.r(r4)     // Catch:{ IOException -> 0x00f3 }
            return r0
        L_0x00f3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PrivateKey.getEncoded():byte[]");
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

    public BCECGOST3410_2012PrivateKey(String str, b0 b0Var, BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey, ECParameterSpec eCParameterSpec) {
        w wVar = b0Var.d;
        this.algorithm = str;
        this.d = b0Var.q;
        if (eCParameterSpec == null) {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(wVar.g, wVar.a()), EC5Util.convertPoint(wVar.i), wVar.j, wVar.k.intValue());
        } else {
            this.ecSpec = eCParameterSpec;
        }
        this.gostParams = bCECGOST3410_2012PublicKey.getGostParams();
        this.publicKey = getPublicKeyDetails(bCECGOST3410_2012PublicKey);
    }

    public BCECGOST3410_2012PrivateKey(String str, b0 b0Var, BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey, s0.a.d.e.e eVar) {
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
        this.gostParams = bCECGOST3410_2012PublicKey.getGostParams();
        this.publicKey = getPublicKeyDetails(bCECGOST3410_2012PublicKey);
    }

    public BCECGOST3410_2012PrivateKey(s0.a.d.e.f fVar) {
        this.d = fVar.d;
        s0.a.d.e.e eVar = fVar.c;
        this.ecSpec = eVar != null ? EC5Util.convertSpec(EC5Util.convertCurve(eVar.a, eVar.b), fVar.c) : null;
    }
}
