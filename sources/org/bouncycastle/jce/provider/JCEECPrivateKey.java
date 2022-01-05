package org.bouncycastle.jce.provider;

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
import s0.a.a.c3.m0;
import s0.a.a.d3.f;
import s0.a.a.d3.h;
import s0.a.a.d3.j;
import s0.a.a.d3.m;
import s0.a.a.g2.a;
import s0.a.a.l;
import s0.a.a.n;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.v;
import s0.a.a.v0;
import s0.a.a.w2.p;
import s0.a.a.y2.b;
import s0.a.b.k0.b0;
import s0.a.b.k0.w;
import s0.a.d.d.e;
import s0.a.d.e.d;

public class JCEECPrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, e {
    private String algorithm = "EC";
    private PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private BigInteger d;
    private ECParameterSpec ecSpec;
    private o0 publicKey;
    private boolean withCompression;

    public JCEECPrivateKey() {
    }

    public JCEECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = str;
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public JCEECPrivateKey(String str, JCEECPrivateKey jCEECPrivateKey) {
        this.algorithm = str;
        this.d = jCEECPrivateKey.d;
        this.ecSpec = jCEECPrivateKey.ecSpec;
        this.withCompression = jCEECPrivateKey.withCompression;
        this.attrCarrier = jCEECPrivateKey.attrCarrier;
        this.publicKey = jCEECPrivateKey.publicKey;
    }

    public JCEECPrivateKey(String str, b0 b0Var) {
        this.algorithm = str;
        this.d = b0Var.q;
        this.ecSpec = null;
    }

    public JCEECPrivateKey(ECPrivateKey eCPrivateKey) {
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public JCEECPrivateKey(p pVar) throws IOException {
        populateFromPrivKeyInfo(pVar);
    }

    private o0 getPublicKeyDetails(JCEECPublicKey jCEECPublicKey) {
        try {
            return m0.s(r.x(jCEECPublicKey.getEncoded())).d;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: s0.a.d.e.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.security.spec.ECParameterSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: s0.a.d.e.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: s0.a.d.e.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: s0.a.d.e.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void populateFromPrivKeyInfo(s0.a.a.w2.p r12) throws java.io.IOException {
        /*
            r11 = this;
            s0.a.a.c3.b r0 = r12.d
            s0.a.a.e r0 = r0.d
            s0.a.a.d3.f r0 = s0.a.a.d3.f.s(r0)
            s0.a.a.r r0 = r0.c
            boolean r1 = r0 instanceof s0.a.a.n
            r2 = 0
            if (r1 == 0) goto L_0x0061
            s0.a.a.n r0 = s0.a.a.n.D(r0)
            s0.a.a.d3.h r1 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByOid(r0)
            if (r1 != 0) goto L_0x0040
            java.util.Hashtable r1 = s0.a.a.g2.b.b
            java.lang.Object r1 = r1.get(r0)
            s0.a.b.k0.w r1 = (s0.a.b.k0.w) r1
            s0.a.e.b.e r3 = r1.g
            byte[] r4 = r1.a()
            java.security.spec.EllipticCurve r7 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r3, r4)
            s0.a.d.e.d r3 = new s0.a.d.e.d
            java.lang.String r6 = s0.a.a.g2.b.b(r0)
            s0.a.e.b.h r0 = r1.i
            java.security.spec.ECPoint r8 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r0)
            java.math.BigInteger r9 = r1.j
            java.math.BigInteger r10 = r1.k
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x008b
        L_0x0040:
            s0.a.e.b.e r3 = r1.q
            byte[] r4 = r1.u()
            java.security.spec.EllipticCurve r7 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r3, r4)
            s0.a.d.e.d r3 = new s0.a.d.e.d
            java.lang.String r6 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getCurveName(r0)
            s0.a.e.b.h r0 = r1.s()
            java.security.spec.ECPoint r8 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r0)
            java.math.BigInteger r9 = r1.y
            java.math.BigInteger r10 = r1.Y1
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x008b
        L_0x0061:
            boolean r1 = r0 instanceof s0.a.a.l
            if (r1 == 0) goto L_0x0068
            r11.ecSpec = r2
            goto L_0x008d
        L_0x0068:
            s0.a.a.d3.h r0 = s0.a.a.d3.h.t(r0)
            s0.a.e.b.e r1 = r0.q
            byte[] r3 = r0.u()
            java.security.spec.EllipticCurve r1 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r1, r3)
            java.security.spec.ECParameterSpec r3 = new java.security.spec.ECParameterSpec
            s0.a.e.b.h r4 = r0.s()
            java.security.spec.ECPoint r4 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r4)
            java.math.BigInteger r5 = r0.y
            java.math.BigInteger r0 = r0.Y1
            int r0 = r0.intValue()
            r3.<init>(r1, r4, r5, r0)
        L_0x008b:
            r11.ecSpec = r3
        L_0x008d:
            s0.a.a.e r12 = r12.u()
            boolean r0 = r12 instanceof s0.a.a.k
            if (r0 == 0) goto L_0x00a0
            s0.a.a.k r12 = s0.a.a.k.B(r12)
            java.math.BigInteger r12 = r12.E()
            r11.d = r12
            goto L_0x00d7
        L_0x00a0:
            s0.a.a.s r12 = (s0.a.a.s) r12
            r0 = 1
            s0.a.a.e r1 = r12.D(r0)
            s0.a.a.o r1 = (s0.a.a.o) r1
            java.math.BigInteger r3 = new java.math.BigInteger
            byte[] r1 = r1.c
            r3.<init>(r0, r1)
            r11.d = r3
            java.util.Enumeration r12 = r12.E()
        L_0x00b6:
            boolean r1 = r12.hasMoreElements()
            if (r1 == 0) goto L_0x00d3
            java.lang.Object r1 = r12.nextElement()
            s0.a.a.e r1 = (s0.a.a.e) r1
            boolean r3 = r1 instanceof s0.a.a.z
            if (r3 == 0) goto L_0x00b6
            s0.a.a.z r1 = (s0.a.a.z) r1
            int r3 = r1.c
            if (r3 != r0) goto L_0x00b6
            s0.a.a.r r2 = r1.C()
            java.util.Objects.requireNonNull(r2)
        L_0x00d3:
            s0.a.a.o0 r2 = (s0.a.a.o0) r2
            r11.publicKey = r2
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCEECPrivateKey.populateFromPrivKeyInfo(s0.a.a.w2.p):void");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        populateFromPrivKeyInfo(p.s(r.x((byte[]) objectInputStream.readObject())));
        this.algorithm = (String) objectInputStream.readObject();
        this.withCompression = objectInputStream.readBoolean();
        PKCS12BagAttributeCarrierImpl pKCS12BagAttributeCarrierImpl = new PKCS12BagAttributeCarrierImpl();
        this.attrCarrier = pKCS12BagAttributeCarrierImpl;
        pKCS12BagAttributeCarrierImpl.readObject(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.algorithm);
        objectOutputStream.writeBoolean(this.withCompression);
        this.attrCarrier.writeObject(objectOutputStream);
    }

    public s0.a.d.e.e engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof JCEECPrivateKey)) {
            return false;
        }
        JCEECPrivateKey jCEECPrivateKey = (JCEECPrivateKey) obj;
        return getD().equals(jCEECPrivateKey.getD()) && engineGetSpec().equals(jCEECPrivateKey.engineGetSpec());
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

    public byte[] getEncoded() {
        f fVar;
        b bVar;
        p pVar;
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec instanceof d) {
            n namedCurveOid = ECUtil.getNamedCurveOid(((d) eCParameterSpec).a);
            if (namedCurveOid == null) {
                namedCurveOid = new n(((d) this.ecSpec).a);
            }
            fVar = new f(namedCurveOid);
        } else if (eCParameterSpec == null) {
            fVar = new f((l) v0.c);
        } else {
            s0.a.e.b.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            fVar = new f(new h(convertCurve, new j(EC5Util.convertPoint(convertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf((long) this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
        }
        if (this.publicKey != null) {
            bVar = new b(getS(), this.publicKey, fVar);
        } else {
            bVar = new b(getS(), (o0) null, fVar);
        }
        try {
            if (this.algorithm.equals("ECGOST3410")) {
                pVar = new p(new s0.a.a.c3.b(a.m, fVar.c), bVar.c, (v) null, (byte[]) null);
            } else {
                pVar = new p(new s0.a.a.c3.b(m.h1, fVar.c), bVar.c, (v) null, (byte[]) null);
            }
            return pVar.r("DER");
        } catch (IOException unused) {
            return null;
        }
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
        StringBuffer stringBuffer = new StringBuffer();
        String str = s0.a.g.j.a;
        stringBuffer.append("EC Private Key");
        stringBuffer.append(str);
        stringBuffer.append("             S: ");
        stringBuffer.append(this.d.toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public JCEECPrivateKey(String str, b0 b0Var, JCEECPublicKey jCEECPublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = str;
        this.d = b0Var.q;
        if (eCParameterSpec == null) {
            w wVar = b0Var.d;
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(wVar.g, wVar.a()), EC5Util.convertPoint(wVar.i), wVar.j, wVar.k.intValue());
        }
        this.ecSpec = eCParameterSpec;
        this.publicKey = getPublicKeyDetails(jCEECPublicKey);
    }

    public JCEECPrivateKey(String str, b0 b0Var, JCEECPublicKey jCEECPublicKey, s0.a.d.e.e eVar) {
        this.algorithm = str;
        this.d = b0Var.q;
        if (eVar == null) {
            w wVar = b0Var.d;
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(wVar.g, wVar.a()), EC5Util.convertPoint(wVar.i), wVar.j, wVar.k.intValue());
        } else {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(eVar.a, eVar.b), EC5Util.convertPoint(eVar.c), eVar.d, eVar.e.intValue());
        }
        this.publicKey = getPublicKeyDetails(jCEECPublicKey);
    }

    public JCEECPrivateKey(String str, s0.a.d.e.f fVar) {
        this.algorithm = str;
        this.d = fVar.d;
        s0.a.d.e.e eVar = fVar.c;
        this.ecSpec = eVar != null ? EC5Util.convertSpec(EC5Util.convertCurve(eVar.a, eVar.b), fVar.c) : null;
    }
}
