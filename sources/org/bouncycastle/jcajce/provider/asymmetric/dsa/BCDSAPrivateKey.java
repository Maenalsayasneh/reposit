package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import s0.a.a.b1;
import s0.a.a.c3.b;
import s0.a.a.c3.q;
import s0.a.a.d3.m;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.n;
import s0.a.a.w2.p;
import s0.a.d.d.e;
import s0.a.g.j;

public class BCDSAPrivateKey implements DSAPrivateKey, e {
    private static final long serialVersionUID = -4677259546958385734L;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient DSAParams dsaSpec;
    private BigInteger x;

    public BCDSAPrivateKey() {
    }

    public BCDSAPrivateKey(DSAPrivateKey dSAPrivateKey) {
        this.x = dSAPrivateKey.getX();
        this.dsaSpec = dSAPrivateKey.getParams();
    }

    public BCDSAPrivateKey(DSAPrivateKeySpec dSAPrivateKeySpec) {
        this.x = dSAPrivateKeySpec.getX();
        this.dsaSpec = new DSAParameterSpec(dSAPrivateKeySpec.getP(), dSAPrivateKeySpec.getQ(), dSAPrivateKeySpec.getG());
    }

    public BCDSAPrivateKey(p pVar) throws IOException {
        q t = q.t(pVar.d.d);
        this.x = ((k) pVar.u()).E();
        this.dsaSpec = new DSAParameterSpec(t.u(), t.v(), t.s());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.dsaSpec = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.dsaSpec.getP());
        objectOutputStream.writeObject(this.dsaSpec.getQ());
        objectOutputStream.writeObject(this.dsaSpec.getG());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPrivateKey)) {
            return false;
        }
        DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) obj;
        return getX().equals(dSAPrivateKey.getX()) && getParams().getG().equals(dSAPrivateKey.getParams().getG()) && getParams().getP().equals(dSAPrivateKey.getParams().getP()) && getParams().getQ().equals(dSAPrivateKey.getParams().getQ());
    }

    public String getAlgorithm() {
        return "DSA";
    }

    public s0.a.a.e getBagAttribute(n nVar) {
        return this.attrCarrier.getBagAttribute(nVar);
    }

    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    public byte[] getEncoded() {
        n nVar = m.N1;
        BigInteger p = this.dsaSpec.getP();
        BigInteger q = this.dsaSpec.getQ();
        BigInteger g = this.dsaSpec.getG();
        k kVar = new k(p);
        k kVar2 = new k(q);
        k kVar3 = new k(g);
        f fVar = new f(3);
        fVar.a(kVar);
        fVar.a(kVar2);
        fVar.a(kVar3);
        return KeyUtil.getEncodedPrivateKeyInfo(new b(nVar, new b1(fVar)), new k(getX()));
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public DSAParams getParams() {
        return this.dsaSpec;
    }

    public BigInteger getX() {
        return this.x;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }

    public void setBagAttribute(n nVar, s0.a.a.e eVar) {
        this.attrCarrier.setBagAttribute(nVar, eVar);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = j.a;
        BigInteger modPow = getParams().getG().modPow(this.x, getParams().getP());
        stringBuffer.append("DSA Private Key [");
        stringBuffer.append(DSAUtil.generateKeyFingerprint(modPow, getParams()));
        stringBuffer.append("]");
        stringBuffer.append(str);
        stringBuffer.append("            Y: ");
        stringBuffer.append(modPow.toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public BCDSAPrivateKey(s0.a.b.k0.q qVar) {
        this.x = qVar.q;
        s0.a.b.k0.p pVar = qVar.d;
        this.dsaSpec = new DSAParameterSpec(pVar.q, pVar.d, pVar.c);
    }
}
