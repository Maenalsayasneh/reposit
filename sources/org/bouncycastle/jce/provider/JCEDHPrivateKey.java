package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import s0.a.a.c3.b;
import s0.a.a.d3.a;
import s0.a.a.d3.m;
import s0.a.a.k;
import s0.a.a.n;
import s0.a.a.s;
import s0.a.a.v;
import s0.a.a.w2.d;
import s0.a.a.w2.p;
import s0.a.b.k0.h;
import s0.a.b.k0.i;
import s0.a.d.d.e;

public class JCEDHPrivateKey implements DHPrivateKey, e {
    public static final long serialVersionUID = 311058815616901812L;
    private e attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private DHParameterSpec dhSpec;
    private p info;
    public BigInteger x;

    public JCEDHPrivateKey() {
    }

    public JCEDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.x = dHPrivateKey.getX();
        this.dhSpec = dHPrivateKey.getParams();
    }

    public JCEDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.x = dHPrivateKeySpec.getX();
        this.dhSpec = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public JCEDHPrivateKey(p pVar) throws IOException {
        DHParameterSpec dHParameterSpec;
        s B = s.B(pVar.d.d);
        k B2 = k.B(pVar.u());
        n nVar = pVar.d.c;
        this.info = pVar;
        this.x = B2.E();
        if (nVar.w(s0.a.a.w2.n.G)) {
            d t = d.t(B);
            dHParameterSpec = t.u() != null ? new DHParameterSpec(t.v(), t.s(), t.u().intValue()) : new DHParameterSpec(t.v(), t.s());
        } else if (nVar.w(m.U1)) {
            a s = a.s(B);
            dHParameterSpec = new DHParameterSpec(s.c.E(), s.d.E());
        } else {
            throw new IllegalArgumentException("unknown algorithm type: " + nVar);
        }
        this.dhSpec = dHParameterSpec;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.x = (BigInteger) objectInputStream.readObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getX());
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    public String getAlgorithm() {
        return "DH";
    }

    public s0.a.a.e getBagAttribute(n nVar) {
        return this.attrCarrier.getBagAttribute(nVar);
    }

    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    public byte[] getEncoded() {
        try {
            p pVar = this.info;
            if (pVar != null) {
                return pVar.r("DER");
            }
            return new p(new b(s0.a.a.w2.n.G, new d(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL())), new k(getX()), (v) null, (byte[]) null).r("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public DHParameterSpec getParams() {
        return this.dhSpec;
    }

    public BigInteger getX() {
        return this.x;
    }

    public void setBagAttribute(n nVar, s0.a.a.e eVar) {
        this.attrCarrier.setBagAttribute(nVar, eVar);
    }

    public JCEDHPrivateKey(i iVar) {
        this.x = iVar.q;
        h hVar = iVar.d;
        this.dhSpec = new DHParameterSpec(hVar.d, hVar.c, hVar.Y1);
    }
}
