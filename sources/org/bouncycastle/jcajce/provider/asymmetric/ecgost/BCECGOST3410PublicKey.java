package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

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
import s0.a.a.c3.m0;
import s0.a.a.d3.h;
import s0.a.a.d3.j;
import s0.a.a.e;
import s0.a.a.g2.b;
import s0.a.a.g2.f;
import s0.a.a.n;
import s0.a.a.o;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.x0;
import s0.a.b.k0.c0;
import s0.a.b.k0.w;
import s0.a.b.k0.x;
import s0.a.d.e.c;
import s0.a.d.e.d;
import s0.a.d.e.g;

public class BCECGOST3410PublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey {
    public static final long serialVersionUID = 7026240464295649314L;
    private String algorithm = "ECGOST3410";
    private transient c0 ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private transient e gostParams;
    private boolean withCompression;

    public BCECGOST3410PublicKey(String str, c0 c0Var) {
        this.algorithm = str;
        this.ecPublicKey = c0Var;
        this.ecSpec = null;
    }

    public BCECGOST3410PublicKey(String str, c0 c0Var, ECParameterSpec eCParameterSpec) {
        w wVar = c0Var.d;
        if (wVar instanceof x) {
            x xVar = (x) wVar;
            this.gostParams = new f(xVar.n, xVar.o, xVar.p);
        }
        this.algorithm = str;
        this.ecPublicKey = c0Var;
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(wVar.g, wVar.a()), wVar);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public BCECGOST3410PublicKey(ECPublicKey eCPublicKey) {
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new c0(EC5Util.convertPoint(params, eCPublicKey.getW()), EC5Util.getDomainParameters((ProviderConfiguration) null, eCPublicKey.getParams()));
    }

    public BCECGOST3410PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new c0(EC5Util.convertPoint(params, eCPublicKeySpec.getW()), EC5Util.getDomainParameters((ProviderConfiguration) null, eCPublicKeySpec.getParams()));
    }

    public BCECGOST3410PublicKey(BCECGOST3410PublicKey bCECGOST3410PublicKey) {
        this.ecPublicKey = bCECGOST3410PublicKey.ecPublicKey;
        this.ecSpec = bCECGOST3410PublicKey.ecSpec;
        this.withCompression = bCECGOST3410PublicKey.withCompression;
        this.gostParams = bCECGOST3410PublicKey.gostParams;
    }

    public BCECGOST3410PublicKey(m0 m0Var) {
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

    private void populateFromPubKeyInfo(m0 m0Var) {
        n nVar;
        o0 o0Var = m0Var.d;
        this.algorithm = "ECGOST3410";
        try {
            byte[] bArr = ((o) r.x(o0Var.B())).c;
            byte[] bArr2 = new byte[65];
            bArr2[0] = 4;
            for (int i = 1; i <= 32; i++) {
                bArr2[i] = bArr[32 - i];
                bArr2[i + 32] = bArr[64 - i];
            }
            e eVar = m0Var.c.d;
            if (eVar instanceof n) {
                nVar = n.D(eVar);
                this.gostParams = nVar;
            } else {
                f s = f.s(eVar);
                this.gostParams = s;
                nVar = s.c;
            }
            c U1 = a.U1(b.b(nVar));
            s0.a.e.b.e eVar2 = U1.a;
            EllipticCurve convertCurve = EC5Util.convertCurve(eVar2, U1.b);
            this.ecPublicKey = new c0(eVar2.h(bArr2), ECUtil.getDomainParameters((ProviderConfiguration) null, (s0.a.d.e.e) U1));
            this.ecSpec = new d(b.b(nVar), convertCurve, EC5Util.convertPoint(U1.c), U1.d, U1.e);
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(m0.s(r.x((byte[]) objectInputStream.readObject())));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public c0 engineGetKeyParameters() {
        return this.ecPublicKey;
    }

    public s0.a.d.e.e engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410PublicKey)) {
            return false;
        }
        BCECGOST3410PublicKey bCECGOST3410PublicKey = (BCECGOST3410PublicKey) obj;
        if (!this.ecPublicKey.q.c(bCECGOST3410PublicKey.ecPublicKey.q) || !engineGetSpec().equals(bCECGOST3410PublicKey.engineGetSpec())) {
            return false;
        }
        return true;
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public byte[] getEncoded() {
        e eVar;
        e gostParams2 = getGostParams();
        if (gostParams2 == null) {
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (eCParameterSpec instanceof d) {
                eVar = new f(b.c(((d) eCParameterSpec).a), s0.a.a.g2.a.p);
            } else {
                s0.a.e.b.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                eVar = new s0.a.a.d3.f(new h(convertCurve, new j(EC5Util.convertPoint(convertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf((long) this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
            gostParams2 = eVar;
        }
        BigInteger t = this.ecPublicKey.q.d().t();
        BigInteger t2 = this.ecPublicKey.q.e().t();
        byte[] bArr = new byte[64];
        extractBytes(bArr, 0, t);
        extractBytes(bArr, 32, t2);
        try {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new m0(new s0.a.a.c3.b(s0.a.a.g2.a.m, gostParams2), (e) new x0(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public e getGostParams() {
        if (this.gostParams == null) {
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (eCParameterSpec instanceof d) {
                this.gostParams = new f(b.c(((d) eCParameterSpec).a), s0.a.a.g2.a.p);
            }
        }
        return this.gostParams;
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

    public s0.a.e.b.h getQ() {
        if (this.ecSpec == null) {
            return this.ecPublicKey.q.h();
        }
        return this.ecPublicKey.q;
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

    public BCECGOST3410PublicKey(String str, c0 c0Var, s0.a.d.e.e eVar) {
        ECParameterSpec eCParameterSpec;
        w wVar = c0Var.d;
        this.algorithm = str;
        this.ecPublicKey = c0Var;
        if (eVar == null) {
            eCParameterSpec = createSpec(EC5Util.convertCurve(wVar.g, wVar.a()), wVar);
        } else {
            eCParameterSpec = EC5Util.convertSpec(EC5Util.convertCurve(eVar.a, eVar.b), eVar);
        }
        this.ecSpec = eCParameterSpec;
    }

    public BCECGOST3410PublicKey(g gVar, ProviderConfiguration providerConfiguration) {
        s0.a.d.e.e eVar = gVar.c;
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
