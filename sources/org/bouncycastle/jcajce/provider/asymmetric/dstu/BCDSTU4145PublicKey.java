package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import m0.r.t.a.r.m.a1.a;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import s0.a.a.a3.d;
import s0.a.a.c3.b;
import s0.a.a.c3.m0;
import s0.a.a.d3.f;
import s0.a.a.d3.h;
import s0.a.a.d3.j;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.x0;
import s0.a.b.k0.c0;
import s0.a.b.k0.w;
import s0.a.d.e.e;
import s0.a.e.b.b0.c.h3;
import s0.a.e.b.g;

public class BCDSTU4145PublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey {
    public static final long serialVersionUID = 7026240464295649314L;
    private String algorithm = "DSTU4145";
    private transient d dstuParams;
    private transient c0 ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private boolean withCompression;

    public BCDSTU4145PublicKey(String str, c0 c0Var) {
        this.algorithm = str;
        this.ecPublicKey = c0Var;
        this.ecSpec = null;
    }

    public BCDSTU4145PublicKey(String str, c0 c0Var, ECParameterSpec eCParameterSpec) {
        w wVar = c0Var.d;
        this.algorithm = str;
        this.ecPublicKey = c0Var;
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(wVar.g, wVar.a()), wVar);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public BCDSTU4145PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new c0(EC5Util.convertPoint(params, eCPublicKeySpec.getW()), EC5Util.getDomainParameters((ProviderConfiguration) null, this.ecSpec));
    }

    public BCDSTU4145PublicKey(BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        this.ecPublicKey = bCDSTU4145PublicKey.ecPublicKey;
        this.ecSpec = bCDSTU4145PublicKey.ecSpec;
        this.withCompression = bCDSTU4145PublicKey.withCompression;
        this.dstuParams = bCDSTU4145PublicKey.dstuParams;
    }

    public BCDSTU4145PublicKey(m0 m0Var) {
        populateFromPubKeyInfo(m0Var);
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, w wVar) {
        return new ECParameterSpec(ellipticCurve, EC5Util.convertPoint(wVar.i), wVar.j, wVar.k.intValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: s0.a.d.e.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: java.security.spec.ECParameterSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: java.security.spec.ECParameterSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v21, resolved type: s0.a.d.e.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v22, resolved type: s0.a.d.e.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: s0.a.d.e.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void populateFromPubKeyInfo(s0.a.a.c3.m0 r15) {
        /*
            r14 = this;
            s0.a.a.o0 r0 = r15.d
            java.lang.String r1 = "DSTU4145"
            r14.algorithm = r1
            byte[] r0 = r0.B()     // Catch:{ IOException -> 0x0123 }
            s0.a.a.r r0 = s0.a.a.r.x(r0)     // Catch:{ IOException -> 0x0123 }
            s0.a.a.o r0 = (s0.a.a.o) r0     // Catch:{ IOException -> 0x0123 }
            byte[] r0 = r0.c
            s0.a.a.c3.b r1 = r15.c
            s0.a.a.n r1 = r1.c
            s0.a.a.n r2 = s0.a.a.a3.e.b
            boolean r1 = r1.w(r2)
            if (r1 == 0) goto L_0x0021
            r14.reverseBytes(r0)
        L_0x0021:
            s0.a.a.c3.b r1 = r15.c
            s0.a.a.e r1 = r1.d
            s0.a.a.s r1 = s0.a.a.s.B(r1)
            r3 = 0
            s0.a.a.e r3 = r1.D(r3)
            boolean r3 = r3 instanceof s0.a.a.k
            r4 = 0
            if (r3 == 0) goto L_0x004d
            s0.a.a.d3.h r15 = s0.a.a.d3.h.t(r1)
            s0.a.d.e.e r1 = new s0.a.d.e.e
            s0.a.e.b.e r6 = r15.q
            s0.a.e.b.h r7 = r15.s()
            java.math.BigInteger r8 = r15.y
            java.math.BigInteger r9 = r15.Y1
            byte[] r10 = r15.u()
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x00d2
        L_0x004d:
            s0.a.a.a3.d r1 = s0.a.a.a3.d.t(r1)
            r14.dstuParams = r1
            boolean r1 = r1.u()
            if (r1 == 0) goto L_0x0077
            s0.a.a.a3.d r15 = r14.dstuParams
            s0.a.a.n r15 = r15.d
            s0.a.b.k0.w r1 = s0.a.a.a3.c.a(r15)
            s0.a.d.e.c r2 = new s0.a.d.e.c
            java.lang.String r6 = r15.d
            s0.a.e.b.e r7 = r1.g
            s0.a.e.b.h r8 = r1.i
            java.math.BigInteger r9 = r1.j
            java.math.BigInteger r10 = r1.k
            byte[] r11 = r1.a()
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1 = r2
            goto L_0x00d1
        L_0x0077:
            s0.a.a.a3.d r1 = r14.dstuParams
            s0.a.a.a3.b r1 = r1.q
            s0.a.a.o r3 = r1.x
            byte[] r3 = r3.c
            byte[] r3 = s0.a.e.b.b0.c.h3.I(r3)
            s0.a.a.c3.b r5 = r15.c
            s0.a.a.n r5 = r5.c
            boolean r5 = r5.w(r2)
            if (r5 == 0) goto L_0x0090
            r14.reverseBytes(r3)
        L_0x0090:
            s0.a.a.a3.a r5 = r1.d
            s0.a.e.b.e$d r13 = new s0.a.e.b.e$d
            int r7 = r5.c
            int r8 = r5.d
            int r9 = r5.q
            int r10 = r5.x
            s0.a.a.k r5 = r1.q
            java.math.BigInteger r11 = r5.E()
            java.math.BigInteger r12 = new java.math.BigInteger
            r5 = 1
            r12.<init>(r5, r3)
            r6 = r13
            r6.<init>((int) r7, (int) r8, (int) r9, (int) r10, (java.math.BigInteger) r11, (java.math.BigInteger) r12)
            s0.a.a.o r3 = r1.Y1
            byte[] r3 = r3.c
            byte[] r3 = s0.a.e.b.b0.c.h3.I(r3)
            s0.a.a.c3.b r15 = r15.c
            s0.a.a.n r15 = r15.c
            boolean r15 = r15.w(r2)
            if (r15 == 0) goto L_0x00c1
            r14.reverseBytes(r3)
        L_0x00c1:
            s0.a.d.e.e r15 = new s0.a.d.e.e
            s0.a.e.b.h r2 = m0.r.t.a.r.m.a1.a.b1(r13, r3)
            s0.a.a.k r1 = r1.y
            java.math.BigInteger r1 = r1.E()
            r15.<init>(r13, r2, r1)
            r1 = r15
        L_0x00d1:
            r15 = r4
        L_0x00d2:
            s0.a.e.b.e r2 = r1.a
            byte[] r3 = r1.b
            java.security.spec.EllipticCurve r7 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r2, r3)
            s0.a.a.a3.d r3 = r14.dstuParams
            if (r3 == 0) goto L_0x010b
            s0.a.e.b.h r15 = r1.c
            java.security.spec.ECPoint r8 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r15)
            s0.a.a.a3.d r15 = r14.dstuParams
            boolean r15 = r15.u()
            if (r15 == 0) goto L_0x00fd
            s0.a.a.a3.d r15 = r14.dstuParams
            s0.a.a.n r15 = r15.d
            java.lang.String r6 = r15.d
            s0.a.d.e.d r15 = new s0.a.d.e.d
            java.math.BigInteger r9 = r1.d
            java.math.BigInteger r10 = r1.e
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x010f
        L_0x00fd:
            java.security.spec.ECParameterSpec r15 = new java.security.spec.ECParameterSpec
            java.math.BigInteger r3 = r1.d
            java.math.BigInteger r1 = r1.e
            int r1 = r1.intValue()
            r15.<init>(r7, r8, r3, r1)
            goto L_0x010f
        L_0x010b:
            java.security.spec.ECParameterSpec r15 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertToSpec((s0.a.a.d3.h) r15)
        L_0x010f:
            r14.ecSpec = r15
            s0.a.b.k0.c0 r15 = new s0.a.b.k0.c0
            s0.a.e.b.h r0 = m0.r.t.a.r.m.a1.a.b1(r2, r0)
            java.security.spec.ECParameterSpec r1 = r14.ecSpec
            s0.a.b.k0.w r1 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getDomainParameters(r4, r1)
            r15.<init>(r0, r1)
            r14.ecPublicKey = r15
            return
        L_0x0123:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "error recovering public key"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey.populateFromPubKeyInfo(s0.a.a.c3.m0):void");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(m0.s(r.x((byte[]) objectInputStream.readObject())));
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

    public c0 engineGetKeyParameters() {
        return this.ecPublicKey;
    }

    public e engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCDSTU4145PublicKey)) {
            return false;
        }
        BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) obj;
        if (!this.ecPublicKey.q.c(bCDSTU4145PublicKey.ecPublicKey.q) || !engineGetSpec().equals(bCDSTU4145PublicKey.engineGetSpec())) {
            return false;
        }
        return true;
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public byte[] getEncoded() {
        s0.a.a.e eVar = this.dstuParams;
        if (eVar == null) {
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (eCParameterSpec instanceof s0.a.d.e.d) {
                eVar = new d(new n(((s0.a.d.e.d) this.ecSpec).a));
            } else {
                s0.a.e.b.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                eVar = new f(new h(convertCurve, new j(EC5Util.convertPoint(convertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf((long) this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
        }
        s0.a.e.b.h q = this.ecPublicKey.q.q();
        g d = q.d();
        byte[] e = d.e();
        if (!d.i()) {
            if (a.g4(q.e().d(d)).h()) {
                int length = e.length - 1;
                e[length] = (byte) (e[length] | 1);
            } else {
                int length2 = e.length - 1;
                e[length2] = (byte) (e[length2] & 254);
            }
        }
        try {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new m0(new b(s0.a.a.a3.e.c, eVar), (s0.a.a.e) new x0(e)));
        } catch (IOException unused) {
            return null;
        }
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

    public s0.a.e.b.h getQ() {
        s0.a.e.b.h hVar = this.ecPublicKey.q;
        return this.ecSpec == null ? hVar.h() : hVar;
    }

    public byte[] getSbox() {
        d dVar = this.dstuParams;
        if (dVar != null) {
            return h3.I(dVar.x);
        }
        return d.s();
    }

    public ECPoint getW() {
        return EC5Util.convertPoint(this.ecPublicKey.q);
    }

    public int hashCode() {
        return this.ecPublicKey.q.hashCode() ^ engineGetSpec().hashCode();
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.publicKeyToString(this.algorithm, this.ecPublicKey.q, engineGetSpec());
    }

    public BCDSTU4145PublicKey(String str, c0 c0Var, e eVar) {
        ECParameterSpec eCParameterSpec;
        w wVar = c0Var.d;
        this.algorithm = str;
        if (eVar == null) {
            eCParameterSpec = createSpec(EC5Util.convertCurve(wVar.g, wVar.a()), wVar);
        } else {
            eCParameterSpec = EC5Util.convertSpec(EC5Util.convertCurve(eVar.a, eVar.b), eVar);
        }
        this.ecSpec = eCParameterSpec;
        this.ecPublicKey = c0Var;
    }

    public BCDSTU4145PublicKey(s0.a.d.e.g gVar, ProviderConfiguration providerConfiguration) {
        e eVar = gVar.c;
        if (eVar != null) {
            EllipticCurve convertCurve = EC5Util.convertCurve(eVar.a, eVar.b);
            this.ecPublicKey = new c0(gVar.d, ECUtil.getDomainParameters(providerConfiguration, gVar.c));
            this.ecSpec = EC5Util.convertSpec(convertCurve, gVar.c);
            return;
        }
        this.ecPublicKey = new c0(providerConfiguration.getEcImplicitlyCa().a.e(gVar.d.d().t(), gVar.d.e().t()), EC5Util.getDomainParameters(providerConfiguration, (ECParameterSpec) null));
        this.ecSpec = null;
    }
}
