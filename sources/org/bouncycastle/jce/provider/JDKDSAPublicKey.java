package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;
import s0.a.a.c3.b;
import s0.a.a.c3.m0;
import s0.a.a.c3.q;
import s0.a.a.d3.m;
import s0.a.a.e;
import s0.a.a.k;
import s0.a.a.v0;
import s0.a.b.k0.p;
import s0.a.b.k0.r;
import s0.a.g.j;

public class JDKDSAPublicKey implements DSAPublicKey {
    private static final long serialVersionUID = 1752452449903495175L;
    private DSAParams dsaSpec;
    private BigInteger y;

    public JDKDSAPublicKey(BigInteger bigInteger, DSAParameterSpec dSAParameterSpec) {
        this.y = bigInteger;
        this.dsaSpec = dSAParameterSpec;
    }

    public JDKDSAPublicKey(DSAPublicKey dSAPublicKey) {
        this.y = dSAPublicKey.getY();
        this.dsaSpec = dSAPublicKey.getParams();
    }

    public JDKDSAPublicKey(DSAPublicKeySpec dSAPublicKeySpec) {
        this.y = dSAPublicKeySpec.getY();
        this.dsaSpec = new DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
    }

    public JDKDSAPublicKey(m0 m0Var) {
        try {
            this.y = ((k) m0Var.t()).E();
            if (isNotNull(m0Var.c.d)) {
                q t = q.t(m0Var.c.d);
                this.dsaSpec = new DSAParameterSpec(t.u(), t.v(), t.s());
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    private boolean isNotNull(e eVar) {
        return eVar != null && !v0.c.v(eVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.y = (BigInteger) objectInputStream.readObject();
        this.dsaSpec = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.y);
        objectOutputStream.writeObject(this.dsaSpec.getP());
        objectOutputStream.writeObject(this.dsaSpec.getQ());
        objectOutputStream.writeObject(this.dsaSpec.getG());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        return getY().equals(dSAPublicKey.getY()) && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ());
    }

    public String getAlgorithm() {
        return "DSA";
    }

    public byte[] getEncoded() {
        try {
            DSAParams dSAParams = this.dsaSpec;
            return dSAParams == null ? new m0(new b(m.N1), (e) new k(this.y)).r("DER") : new m0(new b(m.N1, new q(dSAParams.getP(), this.dsaSpec.getQ(), this.dsaSpec.getG())), (e) new k(this.y)).r("DER");
        } catch (IOException unused) {
            return null;
        }
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
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = j.a;
        stringBuffer.append("DSA Public Key");
        stringBuffer.append(str);
        stringBuffer.append("            y: ");
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public JDKDSAPublicKey(r rVar) {
        this.y = rVar.y;
        p pVar = rVar.d;
        this.dsaSpec = new DSAParameterSpec(pVar.q, pVar.d, pVar.c);
    }
}
