package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Objects;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.ElGamalPrivateKey;
import s0.a.a.k;
import s0.a.a.n;
import s0.a.a.v;
import s0.a.a.v2.a;
import s0.a.a.v2.b;
import s0.a.a.w2.p;
import s0.a.b.k0.l0;
import s0.a.b.k0.m0;
import s0.a.d.d.e;
import s0.a.d.e.i;
import s0.a.d.e.j;

public class BCElGamalPrivateKey implements ElGamalPrivateKey, DHPrivateKey, e {
    public static final long serialVersionUID = 4819350091141529678L;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient i elSpec;
    private BigInteger x;

    public BCElGamalPrivateKey() {
    }

    public BCElGamalPrivateKey(DHPrivateKey dHPrivateKey) {
        this.x = dHPrivateKey.getX();
        this.elSpec = new i(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
    }

    public BCElGamalPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.x = dHPrivateKeySpec.getX();
        this.elSpec = new i(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public BCElGamalPrivateKey(ElGamalPrivateKey elGamalPrivateKey) {
        this.x = elGamalPrivateKey.getX();
        this.elSpec = elGamalPrivateKey.getParameters();
    }

    public BCElGamalPrivateKey(p pVar) throws IOException {
        a t = a.t(pVar.d.d);
        this.x = k.B(pVar.u()).E();
        this.elSpec = new i(t.u(), t.s());
    }

    public BCElGamalPrivateKey(j jVar) {
        Objects.requireNonNull(jVar);
        this.x = null;
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.elSpec = new i((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.elSpec.a);
        objectOutputStream.writeObject(this.elSpec.b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPrivateKey)) {
            return false;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) obj;
        return getX().equals(dHPrivateKey.getX()) && getParams().getG().equals(dHPrivateKey.getParams().getG()) && getParams().getP().equals(dHPrivateKey.getParams().getP()) && getParams().getL() == dHPrivateKey.getParams().getL();
    }

    public String getAlgorithm() {
        return "ElGamal";
    }

    public s0.a.a.e getBagAttribute(n nVar) {
        return this.attrCarrier.getBagAttribute(nVar);
    }

    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    public byte[] getEncoded() {
        try {
            n nVar = b.i;
            i iVar = this.elSpec;
            return new p(new s0.a.a.c3.b(nVar, new a(iVar.a, iVar.b)), new k(getX()), (v) null, (byte[]) null).r("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public i getParameters() {
        return this.elSpec;
    }

    public DHParameterSpec getParams() {
        i iVar = this.elSpec;
        return new DHParameterSpec(iVar.a, iVar.b);
    }

    public BigInteger getX() {
        return this.x;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public void setBagAttribute(n nVar, s0.a.a.e eVar) {
        this.attrCarrier.setBagAttribute(nVar, eVar);
    }

    public BCElGamalPrivateKey(m0 m0Var) {
        this.x = m0Var.q;
        l0 l0Var = m0Var.d;
        this.elSpec = new i(l0Var.d, l0Var.c);
    }
}
