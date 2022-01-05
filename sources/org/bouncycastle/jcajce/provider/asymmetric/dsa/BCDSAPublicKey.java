package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import s0.a.a.b1;
import s0.a.a.c3.b;
import s0.a.a.c3.m0;
import s0.a.a.c3.q;
import s0.a.a.d3.m;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.n;
import s0.a.a.v0;
import s0.a.b.k0.p;
import s0.a.b.k0.r;
import s0.a.g.j;

public class BCDSAPublicKey implements DSAPublicKey {
    private static BigInteger ZERO = BigInteger.valueOf(0);
    private static final long serialVersionUID = 1752452449903495175L;
    private transient DSAParams dsaSpec;
    private transient r lwKeyParams;
    private BigInteger y;

    public BCDSAPublicKey(DSAPublicKey dSAPublicKey) {
        this.y = dSAPublicKey.getY();
        this.dsaSpec = dSAPublicKey.getParams();
        this.lwKeyParams = new r(this.y, DSAUtil.toDSAParameters(this.dsaSpec));
    }

    public BCDSAPublicKey(DSAPublicKeySpec dSAPublicKeySpec) {
        this.y = dSAPublicKeySpec.getY();
        this.dsaSpec = new DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
        this.lwKeyParams = new r(this.y, DSAUtil.toDSAParameters(this.dsaSpec));
    }

    public BCDSAPublicKey(m0 m0Var) {
        try {
            this.y = ((k) m0Var.t()).E();
            if (isNotNull(m0Var.c.d)) {
                q t = q.t(m0Var.c.d);
                this.dsaSpec = new DSAParameterSpec(t.u(), t.v(), t.s());
            } else {
                this.dsaSpec = null;
            }
            this.lwKeyParams = new r(this.y, DSAUtil.toDSAParameters(this.dsaSpec));
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    private boolean isNotNull(e eVar) {
        return eVar != null && !v0.c.w(eVar.c());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        BigInteger bigInteger = (BigInteger) objectInputStream.readObject();
        if (bigInteger.equals(ZERO)) {
            this.dsaSpec = null;
        } else {
            this.dsaSpec = new DSAParameterSpec(bigInteger, (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        }
        this.lwKeyParams = new r(this.y, DSAUtil.toDSAParameters(this.dsaSpec));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        BigInteger bigInteger;
        objectOutputStream.defaultWriteObject();
        DSAParams dSAParams = this.dsaSpec;
        if (dSAParams == null) {
            bigInteger = ZERO;
        } else {
            objectOutputStream.writeObject(dSAParams.getP());
            objectOutputStream.writeObject(this.dsaSpec.getQ());
            bigInteger = this.dsaSpec.getG();
        }
        objectOutputStream.writeObject(bigInteger);
    }

    public r engineGetKeyParameters() {
        return this.lwKeyParams;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        return this.dsaSpec != null ? getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() != null && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ()) : getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() == null;
    }

    public String getAlgorithm() {
        return "DSA";
    }

    public byte[] getEncoded() {
        DSAParams dSAParams = this.dsaSpec;
        if (dSAParams == null) {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new b(m.N1), (e) new k(this.y));
        }
        n nVar = m.N1;
        BigInteger p = dSAParams.getP();
        BigInteger q = this.dsaSpec.getQ();
        BigInteger g = this.dsaSpec.getG();
        k kVar = new k(p);
        k kVar2 = new k(q);
        k kVar3 = new k(g);
        f fVar = new f(3);
        fVar.a(kVar);
        fVar.a(kVar2);
        fVar.a(kVar3);
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new b(nVar, new b1(fVar)), (e) new k(this.y));
    }

    public String getFormat() {
        return "X.509";
    }

    public DSAParams getParams() {
        return this.dsaSpec;
    }

    public BigInteger getY() {
        return this.y;
    }

    public int hashCode() {
        return this.dsaSpec != null ? ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode() : getY().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = j.a;
        stringBuffer.append("DSA Public Key [");
        stringBuffer.append(DSAUtil.generateKeyFingerprint(this.y, getParams()));
        stringBuffer.append("]");
        stringBuffer.append(str);
        stringBuffer.append("            Y: ");
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public BCDSAPublicKey(r rVar) {
        DSAParameterSpec dSAParameterSpec;
        this.y = rVar.y;
        if (rVar.d != null) {
            p pVar = rVar.d;
            dSAParameterSpec = new DSAParameterSpec(pVar.q, pVar.d, pVar.c);
        } else {
            dSAParameterSpec = null;
        }
        this.dsaSpec = dSAParameterSpec;
        this.lwKeyParams = rVar;
    }
}
