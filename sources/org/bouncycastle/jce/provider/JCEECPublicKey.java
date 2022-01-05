package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import s0.a.a.c3.m0;
import s0.a.a.d3.j;
import s0.a.a.d3.m;
import s0.a.a.g2.a;
import s0.a.a.g2.b;
import s0.a.a.g2.f;
import s0.a.a.l;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.v0;
import s0.a.a.x0;
import s0.a.b.k0.c0;
import s0.a.b.k0.w;
import s0.a.d.e.d;
import s0.a.d.e.e;
import s0.a.d.e.g;
import s0.a.e.b.h;

public class JCEECPublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey {
    private String algorithm = "EC";
    private ECParameterSpec ecSpec;
    private f gostParams;
    private h q;
    private boolean withCompression;

    public JCEECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.q = EC5Util.convertPoint(params, eCPublicKeySpec.getW());
    }

    public JCEECPublicKey(String str, JCEECPublicKey jCEECPublicKey) {
        this.algorithm = str;
        this.q = jCEECPublicKey.q;
        this.ecSpec = jCEECPublicKey.ecSpec;
        this.withCompression = jCEECPublicKey.withCompression;
        this.gostParams = jCEECPublicKey.gostParams;
    }

    public JCEECPublicKey(String str, c0 c0Var) {
        this.algorithm = str;
        this.q = c0Var.q;
        this.ecSpec = null;
    }

    public JCEECPublicKey(ECPublicKey eCPublicKey) {
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.q = EC5Util.convertPoint(params, eCPublicKey.getW());
    }

    public JCEECPublicKey(m0 m0Var) {
        populateFromPubKeyInfo(m0Var);
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, w wVar) {
        return new ECParameterSpec(ellipticCurve, EC5Util.convertPoint(wVar.i), wVar.j, wVar.k.intValue());
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.security.spec.ECParameterSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: s0.a.d.e.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: s0.a.d.e.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: s0.a.d.e.d} */
    /* JADX WARNING: type inference failed for: r14v10, types: [s0.a.a.r] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void populateFromPubKeyInfo(s0.a.a.c3.m0 r14) {
        /*
            r13 = this;
            s0.a.a.c3.b r0 = r14.c
            s0.a.a.n r1 = r0.c
            s0.a.a.n r2 = s0.a.a.g2.a.m
            boolean r1 = r1.w(r2)
            r2 = 4
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0080
            s0.a.a.o0 r14 = r14.d
            java.lang.String r1 = "ECGOST3410"
            r13.algorithm = r1
            byte[] r14 = r14.B()     // Catch:{ IOException -> 0x0078 }
            s0.a.a.r r14 = s0.a.a.r.x(r14)     // Catch:{ IOException -> 0x0078 }
            s0.a.a.o r14 = (s0.a.a.o) r14     // Catch:{ IOException -> 0x0078 }
            byte[] r14 = r14.c
            r1 = 65
            byte[] r1 = new byte[r1]
            r1[r3] = r2
        L_0x0027:
            r2 = 32
            if (r4 > r2) goto L_0x003c
            int r2 = 32 - r4
            byte r2 = r14[r2]
            r1[r4] = r2
            int r2 = r4 + 32
            int r3 = 64 - r4
            byte r3 = r14[r3]
            r1[r2] = r3
            int r4 = r4 + 1
            goto L_0x0027
        L_0x003c:
            s0.a.a.e r14 = r0.d
            s0.a.a.g2.f r14 = s0.a.a.g2.f.s(r14)
            r13.gostParams = r14
            s0.a.a.n r14 = r14.c
            java.lang.String r14 = s0.a.a.g2.b.b(r14)
            s0.a.d.e.c r14 = m0.r.t.a.r.m.a1.a.U1(r14)
            s0.a.e.b.e r0 = r14.a
            byte[] r2 = r14.b
            java.security.spec.EllipticCurve r5 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r0, r2)
            s0.a.e.b.h r0 = r0.h(r1)
            r13.q = r0
            s0.a.d.e.d r0 = new s0.a.d.e.d
            s0.a.a.g2.f r1 = r13.gostParams
            s0.a.a.n r1 = r1.c
            java.lang.String r4 = s0.a.a.g2.b.b(r1)
            s0.a.e.b.h r1 = r14.c
            java.security.spec.ECPoint r6 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r1)
            java.math.BigInteger r7 = r14.d
            java.math.BigInteger r8 = r14.e
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            r13.ecSpec = r0
            goto L_0x013b
        L_0x0078:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "error recovering public key"
            r14.<init>(r0)
            throw r14
        L_0x0080:
            s0.a.a.e r0 = r0.d
            s0.a.a.d3.f r0 = s0.a.a.d3.f.s(r0)
            s0.a.a.r r0 = r0.c
            boolean r1 = r0 instanceof s0.a.a.n
            if (r1 == 0) goto L_0x00b5
            s0.a.a.n r0 = (s0.a.a.n) r0
            s0.a.a.d3.h r1 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByOid(r0)
            s0.a.e.b.e r5 = r1.q
            byte[] r6 = r1.u()
            java.security.spec.EllipticCurve r9 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r5, r6)
            s0.a.d.e.d r6 = new s0.a.d.e.d
            java.lang.String r8 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getCurveName(r0)
            s0.a.e.b.h r0 = r1.s()
            java.security.spec.ECPoint r10 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r0)
            java.math.BigInteger r11 = r1.y
            java.math.BigInteger r12 = r1.Y1
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x00b2:
            r13.ecSpec = r6
            goto L_0x00e9
        L_0x00b5:
            boolean r1 = r0 instanceof s0.a.a.l
            if (r1 == 0) goto L_0x00c5
            r0 = 0
            r13.ecSpec = r0
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION
            s0.a.d.e.e r0 = r0.getEcImplicitlyCa()
            s0.a.e.b.e r5 = r0.a
            goto L_0x00e9
        L_0x00c5:
            s0.a.a.d3.h r0 = s0.a.a.d3.h.t(r0)
            s0.a.e.b.e r5 = r0.q
            byte[] r1 = r0.u()
            java.security.spec.EllipticCurve r1 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r5, r1)
            java.security.spec.ECParameterSpec r6 = new java.security.spec.ECParameterSpec
            s0.a.e.b.h r7 = r0.s()
            java.security.spec.ECPoint r7 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r7)
            java.math.BigInteger r8 = r0.y
            java.math.BigInteger r0 = r0.Y1
            int r0 = r0.intValue()
            r6.<init>(r1, r7, r8, r0)
            goto L_0x00b2
        L_0x00e9:
            s0.a.a.o0 r14 = r14.d
            byte[] r14 = r14.B()
            s0.a.a.x0 r0 = new s0.a.a.x0
            r0.<init>((byte[]) r14)
            byte r1 = r14[r3]
            if (r1 != r2) goto L_0x0124
            byte r1 = r14[r4]
            int r2 = r14.length
            r3 = 2
            int r2 = r2 - r3
            if (r1 != r2) goto L_0x0124
            byte r1 = r14[r3]
            r2 = 3
            if (r1 == r3) goto L_0x0108
            byte r1 = r14[r3]
            if (r1 != r2) goto L_0x0124
        L_0x0108:
            int r1 = r5.l()
            int r1 = r1 + 7
            int r1 = r1 / 8
            int r3 = r14.length
            int r3 = r3 - r2
            if (r1 < r3) goto L_0x0124
            s0.a.a.r r14 = s0.a.a.r.x(r14)     // Catch:{ IOException -> 0x011c }
            r0 = r14
            s0.a.a.o r0 = (s0.a.a.o) r0     // Catch:{ IOException -> 0x011c }
            goto L_0x0124
        L_0x011c:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "error recovering public key"
            r14.<init>(r0)
            throw r14
        L_0x0124:
            byte[] r14 = r0.c
            s0.a.a.x0 r0 = new s0.a.a.x0
            byte[] r14 = s0.a.e.b.b0.c.h3.I(r14)
            r0.<init>((byte[]) r14)
            byte[] r14 = r0.c     // Catch:{ all -> 0x013c }
            s0.a.e.b.h r14 = r5.h(r14)     // Catch:{ all -> 0x013c }
            s0.a.e.b.h r14 = r14.q()     // Catch:{ all -> 0x013c }
            r13.q = r14
        L_0x013b:
            return
        L_0x013c:
            r14 = move-exception
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCEECPublicKey.populateFromPubKeyInfo(s0.a.a.c3.m0):void");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        populateFromPubKeyInfo(m0.s(r.x((byte[]) objectInputStream.readObject())));
        this.algorithm = (String) objectInputStream.readObject();
        this.withCompression = objectInputStream.readBoolean();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.algorithm);
        objectOutputStream.writeBoolean(this.withCompression);
    }

    public h engineGetQ() {
        return this.q;
    }

    public e engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof JCEECPublicKey)) {
            return false;
        }
        JCEECPublicKey jCEECPublicKey = (JCEECPublicKey) obj;
        return engineGetQ().c(jCEECPublicKey.engineGetQ()) && engineGetSpec().equals(jCEECPublicKey.engineGetSpec());
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public byte[] getEncoded() {
        m0 m0Var;
        s0.a.a.d3.f fVar;
        s0.a.a.e eVar;
        if (this.algorithm.equals("ECGOST3410")) {
            s0.a.a.e eVar2 = this.gostParams;
            if (eVar2 == null) {
                ECParameterSpec eCParameterSpec = this.ecSpec;
                if (eCParameterSpec instanceof d) {
                    eVar = new f(b.c(((d) eCParameterSpec).a), a.p);
                } else {
                    s0.a.e.b.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                    eVar = new s0.a.a.d3.f(new s0.a.a.d3.h(convertCurve, new j(EC5Util.convertPoint(convertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf((long) this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
                }
                eVar2 = eVar;
            }
            BigInteger t = this.q.d().t();
            BigInteger t2 = this.q.e().t();
            byte[] bArr = new byte[64];
            extractBytes(bArr, 0, t);
            extractBytes(bArr, 32, t2);
            try {
                m0Var = new m0(new s0.a.a.c3.b(a.m, eVar2), (s0.a.a.e) new x0(bArr));
            } catch (IOException unused) {
                return null;
            }
        } else {
            ECParameterSpec eCParameterSpec2 = this.ecSpec;
            if (eCParameterSpec2 instanceof d) {
                n namedCurveOid = ECUtil.getNamedCurveOid(((d) eCParameterSpec2).a);
                if (namedCurveOid == null) {
                    namedCurveOid = new n(((d) this.ecSpec).a);
                }
                fVar = new s0.a.a.d3.f(namedCurveOid);
            } else if (eCParameterSpec2 == null) {
                fVar = new s0.a.a.d3.f((l) v0.c);
            } else {
                s0.a.e.b.e convertCurve2 = EC5Util.convertCurve(eCParameterSpec2.getCurve());
                fVar = new s0.a.a.d3.f(new s0.a.a.d3.h(convertCurve2, new j(EC5Util.convertPoint(convertCurve2, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf((long) this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
            m0Var = new m0(new s0.a.a.c3.b(m.h1, fVar), getQ().i(this.withCompression));
        }
        return KeyUtil.getEncodedSubjectPublicKeyInfo(m0Var);
    }

    public String getFormat() {
        return "X.509";
    }

    public e getParameters() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    public h getQ() {
        return this.ecSpec == null ? this.q.h() : this.q;
    }

    public ECPoint getW() {
        return EC5Util.convertPoint(this.q);
    }

    public int hashCode() {
        return engineGetQ().hashCode() ^ engineGetSpec().hashCode();
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = s0.a.g.j.a;
        stringBuffer.append("EC Public Key");
        stringBuffer.append(str);
        stringBuffer.append("            X: ");
        stringBuffer.append(this.q.d().t().toString(16));
        stringBuffer.append(str);
        stringBuffer.append("            Y: ");
        stringBuffer.append(this.q.e().t().toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public JCEECPublicKey(String str, c0 c0Var, ECParameterSpec eCParameterSpec) {
        w wVar = c0Var.d;
        this.algorithm = str;
        this.q = c0Var.q;
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(wVar.g, wVar.a()), wVar);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public JCEECPublicKey(String str, c0 c0Var, e eVar) {
        ECParameterSpec eCParameterSpec;
        w wVar = c0Var.d;
        this.algorithm = str;
        this.q = c0Var.q;
        if (eVar == null) {
            eCParameterSpec = createSpec(EC5Util.convertCurve(wVar.g, wVar.a()), wVar);
        } else {
            eCParameterSpec = EC5Util.convertSpec(EC5Util.convertCurve(eVar.a, eVar.b), eVar);
        }
        this.ecSpec = eCParameterSpec;
    }

    public JCEECPublicKey(String str, g gVar) {
        ECParameterSpec eCParameterSpec;
        this.algorithm = str;
        h hVar = gVar.d;
        this.q = hVar;
        e eVar = gVar.c;
        if (eVar != null) {
            eCParameterSpec = EC5Util.convertSpec(EC5Util.convertCurve(eVar.a, eVar.b), gVar.c);
        } else {
            if (hVar.b == null) {
                this.q = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().a.e(this.q.d().t(), this.q.e().t());
            }
            eCParameterSpec = null;
        }
        this.ecSpec = eCParameterSpec;
    }
}
