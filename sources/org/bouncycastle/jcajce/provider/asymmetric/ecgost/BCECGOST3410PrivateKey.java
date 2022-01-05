package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

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

public class BCECGOST3410PrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, e {
    public static final long serialVersionUID = 7245981689601667138L;
    private String algorithm = "ECGOST3410";
    private transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient BigInteger d;
    private transient ECParameterSpec ecSpec;
    private transient s0.a.a.e gostParams;
    private transient o0 publicKey;
    private boolean withCompression;

    public BCECGOST3410PrivateKey() {
    }

    public BCECGOST3410PrivateKey(String str, b0 b0Var) {
        this.algorithm = str;
        this.d = b0Var.q;
        this.ecSpec = null;
    }

    public BCECGOST3410PrivateKey(ECPrivateKey eCPrivateKey) {
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public BCECGOST3410PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public BCECGOST3410PrivateKey(BCECGOST3410PrivateKey bCECGOST3410PrivateKey) {
        this.d = bCECGOST3410PrivateKey.d;
        this.ecSpec = bCECGOST3410PrivateKey.ecSpec;
        this.withCompression = bCECGOST3410PrivateKey.withCompression;
        this.attrCarrier = bCECGOST3410PrivateKey.attrCarrier;
        this.publicKey = bCECGOST3410PrivateKey.publicKey;
        this.gostParams = bCECGOST3410PrivateKey.gostParams;
    }

    public BCECGOST3410PrivateKey(p pVar) throws IOException {
        populateFromPrivKeyInfo(pVar);
    }

    private void extractBytes(byte[] bArr, int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i2 = 0; i2 != 32; i2++) {
            bArr[i + i2] = byteArray[(byteArray.length - 1) - i2];
        }
    }

    private o0 getPublicKeyDetails(BCECGOST3410PublicKey bCECGOST3410PublicKey) {
        try {
            return m0.s(r.x(bCECGOST3410PublicKey.getEncoded())).d;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void populateFromPrivKeyInfo(s0.a.a.w2.p r11) throws java.io.IOException {
        /*
            r10 = this;
            s0.a.a.c3.b r0 = r11.d
            s0.a.a.e r0 = r0.d
            s0.a.a.r r1 = r0.c()
            boolean r2 = r1 instanceof s0.a.a.s
            if (r2 == 0) goto L_0x0083
            s0.a.a.s r2 = s0.a.a.s.B(r1)
            int r2 = r2.size()
            r3 = 2
            if (r2 == r3) goto L_0x0022
            s0.a.a.s r1 = s0.a.a.s.B(r1)
            int r1 = r1.size()
            r2 = 3
            if (r1 != r2) goto L_0x0083
        L_0x0022:
            s0.a.a.g2.f r0 = s0.a.a.g2.f.s(r0)
            r10.gostParams = r0
            s0.a.a.n r1 = r0.c
            java.lang.String r1 = s0.a.a.g2.b.b(r1)
            s0.a.d.e.c r1 = m0.r.t.a.r.m.a1.a.U1(r1)
            s0.a.e.b.e r2 = r1.a
            byte[] r3 = r1.b
            java.security.spec.EllipticCurve r6 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r2, r3)
            s0.a.d.e.d r2 = new s0.a.d.e.d
            s0.a.a.n r0 = r0.c
            java.lang.String r5 = s0.a.a.g2.b.b(r0)
            s0.a.e.b.h r0 = r1.c
            java.security.spec.ECPoint r7 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r0)
            java.math.BigInteger r8 = r1.d
            java.math.BigInteger r9 = r1.e
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r10.ecSpec = r2
            s0.a.a.e r11 = r11.u()
            boolean r0 = r11 instanceof s0.a.a.k
            if (r0 == 0) goto L_0x0064
            s0.a.a.k r11 = s0.a.a.k.B(r11)
            java.math.BigInteger r11 = r11.D()
            goto L_0x00fb
        L_0x0064:
            s0.a.a.o r11 = s0.a.a.o.B(r11)
            byte[] r11 = r11.c
            int r0 = r11.length
            byte[] r0 = new byte[r0]
            r1 = 0
        L_0x006e:
            int r2 = r11.length
            r3 = 1
            if (r1 == r2) goto L_0x007c
            int r2 = r11.length
            int r2 = r2 - r3
            int r2 = r2 - r1
            byte r2 = r11[r2]
            r0[r1] = r2
            int r1 = r1 + 1
            goto L_0x006e
        L_0x007c:
            java.math.BigInteger r11 = new java.math.BigInteger
            r11.<init>(r3, r0)
            goto L_0x00fb
        L_0x0083:
            s0.a.a.d3.f r0 = s0.a.a.d3.f.s(r0)
            s0.a.a.r r0 = r0.c
            boolean r1 = r0 instanceof s0.a.a.n
            if (r1 == 0) goto L_0x00be
            s0.a.a.n r0 = s0.a.a.n.D(r0)
            s0.a.a.d3.h r1 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByOid(r0)
            if (r1 == 0) goto L_0x00b8
            java.lang.String r3 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getCurveName(r0)
            s0.a.e.b.e r0 = r1.q
            byte[] r2 = r1.u()
            java.security.spec.EllipticCurve r4 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r0, r2)
            s0.a.d.e.d r0 = new s0.a.d.e.d
            s0.a.e.b.h r2 = r1.s()
            java.security.spec.ECPoint r5 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r2)
            java.math.BigInteger r6 = r1.y
            java.math.BigInteger r7 = r1.Y1
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x00c3
        L_0x00b8:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>()
            throw r11
        L_0x00be:
            boolean r1 = r0 instanceof s0.a.a.l
            if (r1 == 0) goto L_0x00c6
            r0 = 0
        L_0x00c3:
            r10.ecSpec = r0
            goto L_0x00eb
        L_0x00c6:
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
            r10.ecSpec = r2
        L_0x00eb:
            s0.a.a.e r11 = r11.u()
            boolean r0 = r11 instanceof s0.a.a.k
            if (r0 == 0) goto L_0x00fe
            s0.a.a.k r11 = s0.a.a.k.B(r11)
            java.math.BigInteger r11 = r11.E()
        L_0x00fb:
            r10.d = r11
            goto L_0x010e
        L_0x00fe:
            s0.a.a.y2.a r11 = s0.a.a.y2.a.s(r11)
            java.math.BigInteger r0 = r11.t()
            r10.d = r0
            s0.a.a.o0 r11 = r11.v()
            r10.publicKey = r11
        L_0x010e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey.populateFromPrivKeyInfo(s0.a.a.w2.p):void");
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
        if (!(obj instanceof BCECGOST3410PrivateKey)) {
            return false;
        }
        BCECGOST3410PrivateKey bCECGOST3410PrivateKey = (BCECGOST3410PrivateKey) obj;
        return getD().equals(bCECGOST3410PrivateKey.getD()) && engineGetSpec().equals(bCECGOST3410PrivateKey.engineGetSpec());
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

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
            r9 = this;
            s0.a.a.e r0 = r9.gostParams
            java.lang.String r1 = "DER"
            r2 = 0
            if (r0 == 0) goto L_0x002c
            r0 = 32
            byte[] r0 = new byte[r0]
            r3 = 0
            java.math.BigInteger r4 = r9.getS()
            r9.extractBytes(r0, r3, r4)
            s0.a.a.w2.p r3 = new s0.a.a.w2.p     // Catch:{ IOException -> 0x002b }
            s0.a.a.c3.b r4 = new s0.a.a.c3.b     // Catch:{ IOException -> 0x002b }
            s0.a.a.n r5 = s0.a.a.g2.a.m     // Catch:{ IOException -> 0x002b }
            s0.a.a.e r6 = r9.gostParams     // Catch:{ IOException -> 0x002b }
            r4.<init>(r5, r6)     // Catch:{ IOException -> 0x002b }
            s0.a.a.x0 r5 = new s0.a.a.x0     // Catch:{ IOException -> 0x002b }
            r5.<init>((byte[]) r0)     // Catch:{ IOException -> 0x002b }
            r3.<init>(r4, r5, r2, r2)     // Catch:{ IOException -> 0x002b }
            byte[] r0 = r3.r(r1)     // Catch:{ IOException -> 0x002b }
            return r0
        L_0x002b:
            return r2
        L_0x002c:
            java.security.spec.ECParameterSpec r0 = r9.ecSpec
            boolean r3 = r0 instanceof s0.a.d.e.d
            if (r3 == 0) goto L_0x004d
            s0.a.d.e.d r0 = (s0.a.d.e.d) r0
            java.lang.String r0 = r0.a
            s0.a.a.n r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveOid((java.lang.String) r0)
            if (r0 != 0) goto L_0x0047
            s0.a.a.n r0 = new s0.a.a.n
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            s0.a.d.e.d r3 = (s0.a.d.e.d) r3
            java.lang.String r3 = r3.a
            r0.<init>((java.lang.String) r3)
        L_0x0047:
            s0.a.a.d3.f r3 = new s0.a.a.d3.f
            r3.<init>((s0.a.a.n) r0)
            goto L_0x00a0
        L_0x004d:
            if (r0 != 0) goto L_0x0061
            s0.a.a.d3.f r3 = new s0.a.a.d3.f
            s0.a.a.v0 r0 = s0.a.a.v0.c
            r3.<init>((s0.a.a.l) r0)
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION
            java.math.BigInteger r4 = r9.getS()
            int r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(r0, r2, r4)
            goto L_0x00b0
        L_0x0061:
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            s0.a.e.b.e r4 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r0)
            s0.a.a.d3.h r0 = new s0.a.a.d3.h
            s0.a.a.d3.j r5 = new s0.a.a.d3.j
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            java.security.spec.ECPoint r3 = r3.getGenerator()
            s0.a.e.b.h r3 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint((s0.a.e.b.e) r4, (java.security.spec.ECPoint) r3)
            boolean r6 = r9.withCompression
            r5.<init>((s0.a.e.b.h) r3, (boolean) r6)
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            java.math.BigInteger r6 = r3.getOrder()
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            int r3 = r3.getCofactor()
            long r7 = (long) r3
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r7)
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            java.security.spec.EllipticCurve r3 = r3.getCurve()
            byte[] r8 = r3.getSeed()
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            s0.a.a.d3.f r3 = new s0.a.a.d3.f
            r3.<init>((s0.a.a.d3.h) r0)
        L_0x00a0:
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION
            java.security.spec.ECParameterSpec r4 = r9.ecSpec
            java.math.BigInteger r4 = r4.getOrder()
            java.math.BigInteger r5 = r9.getS()
            int r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(r0, r4, r5)
        L_0x00b0:
            s0.a.a.o0 r4 = r9.publicKey
            if (r4 == 0) goto L_0x00c0
            s0.a.a.y2.a r4 = new s0.a.a.y2.a
            java.math.BigInteger r5 = r9.getS()
            s0.a.a.o0 r6 = r9.publicKey
            r4.<init>(r0, r5, r6, r3)
            goto L_0x00c9
        L_0x00c0:
            s0.a.a.y2.a r4 = new s0.a.a.y2.a
            java.math.BigInteger r5 = r9.getS()
            r4.<init>(r0, r5, r2, r3)
        L_0x00c9:
            s0.a.a.w2.p r0 = new s0.a.a.w2.p     // Catch:{ IOException -> 0x00de }
            s0.a.a.c3.b r5 = new s0.a.a.c3.b     // Catch:{ IOException -> 0x00de }
            s0.a.a.n r6 = s0.a.a.g2.a.m     // Catch:{ IOException -> 0x00de }
            s0.a.a.r r3 = r3.c     // Catch:{ IOException -> 0x00de }
            r5.<init>(r6, r3)     // Catch:{ IOException -> 0x00de }
            s0.a.a.s r3 = r4.c     // Catch:{ IOException -> 0x00de }
            r0.<init>(r5, r3, r2, r2)     // Catch:{ IOException -> 0x00de }
            byte[] r0 = r0.r(r1)     // Catch:{ IOException -> 0x00de }
            return r0
        L_0x00de:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey.getEncoded():byte[]");
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

    public BCECGOST3410PrivateKey(String str, b0 b0Var, BCECGOST3410PublicKey bCECGOST3410PublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = str;
        this.d = b0Var.q;
        if (eCParameterSpec == null) {
            w wVar = b0Var.d;
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(wVar.g, wVar.a()), EC5Util.convertPoint(wVar.i), wVar.j, wVar.k.intValue());
        }
        this.ecSpec = eCParameterSpec;
        this.gostParams = bCECGOST3410PublicKey.getGostParams();
        this.publicKey = getPublicKeyDetails(bCECGOST3410PublicKey);
    }

    public BCECGOST3410PrivateKey(String str, b0 b0Var, BCECGOST3410PublicKey bCECGOST3410PublicKey, s0.a.d.e.e eVar) {
        this.algorithm = str;
        this.d = b0Var.q;
        if (eVar == null) {
            w wVar = b0Var.d;
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(wVar.g, wVar.a()), EC5Util.convertPoint(wVar.i), wVar.j, wVar.k.intValue());
        } else {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(eVar.a, eVar.b), EC5Util.convertPoint(eVar.c), eVar.d, eVar.e.intValue());
        }
        this.gostParams = bCECGOST3410PublicKey.getGostParams();
        this.publicKey = getPublicKeyDetails(bCECGOST3410PublicKey);
    }

    public BCECGOST3410PrivateKey(f fVar) {
        this.d = fVar.d;
        s0.a.d.e.e eVar = fVar.c;
        this.ecSpec = eVar != null ? EC5Util.convertSpec(EC5Util.convertCurve(eVar.a, eVar.b), fVar.c) : null;
    }
}
