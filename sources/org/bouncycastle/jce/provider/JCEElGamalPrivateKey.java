package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Objects;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.ElGamalPrivateKey;
import s0.a.a.k;
import s0.a.a.n;
import s0.a.a.v2.a;
import s0.a.a.v2.b;
import s0.a.a.w2.p;
import s0.a.b.k0.l0;
import s0.a.b.k0.m0;
import s0.a.d.d.e;
import s0.a.d.e.i;
import s0.a.d.e.j;

public class JCEElGamalPrivateKey implements ElGamalPrivateKey, DHPrivateKey, e {
    public static final long serialVersionUID = 4819350091141529678L;
    private PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    public i elSpec;
    public BigInteger x;

    public JCEElGamalPrivateKey() {
    }

    public JCEElGamalPrivateKey(DHPrivateKey dHPrivateKey) {
        this.x = dHPrivateKey.getX();
        this.elSpec = new i(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
    }

    public JCEElGamalPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.x = dHPrivateKeySpec.getX();
        this.elSpec = new i(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public JCEElGamalPrivateKey(ElGamalPrivateKey elGamalPrivateKey) {
        this.x = elGamalPrivateKey.getX();
        this.elSpec = elGamalPrivateKey.getParameters();
    }

    public JCEElGamalPrivateKey(p pVar) throws IOException {
        a t = a.t(pVar.d.d);
        this.x = k.B(pVar.u()).E();
        this.elSpec = new i(t.u(), t.s());
    }

    public JCEElGamalPrivateKey(j jVar) {
        Objects.requireNonNull(jVar);
        this.x = null;
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.x = (BigInteger) objectInputStream.readObject();
        this.elSpec = new i((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getX());
        objectOutputStream.writeObject(this.elSpec.a);
        objectOutputStream.writeObject(this.elSpec.b);
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
        n nVar = b.i;
        i iVar = this.elSpec;
        return KeyUtil.getEncodedPrivateKeyInfo(new s0.a.a.c3.b(nVar, new a(iVar.a, iVar.b)), new k(getX()));
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

    public void setBagAttribute(n nVar, s0.a.a.e eVar) {
        this.attrCarrier.setBagAttribute(nVar, eVar);
    }

    public JCEElGamalPrivateKey(m0 m0Var) {
        this.x = m0Var.q;
        l0 l0Var = m0Var.d;
        this.elSpec = new i(l0Var.d, l0Var.c);
    }
}
