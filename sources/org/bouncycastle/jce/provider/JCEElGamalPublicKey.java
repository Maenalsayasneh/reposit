package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Objects;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jce.interfaces.ElGamalPublicKey;
import s0.a.a.c3.m0;
import s0.a.a.e;
import s0.a.a.k;
import s0.a.a.n;
import s0.a.a.v2.a;
import s0.a.a.v2.b;
import s0.a.b.k0.l0;
import s0.a.b.k0.n0;
import s0.a.d.e.i;

public class JCEElGamalPublicKey implements ElGamalPublicKey, DHPublicKey {
    public static final long serialVersionUID = 8712728417091216948L;
    private i elSpec;
    private BigInteger y;

    public JCEElGamalPublicKey(BigInteger bigInteger, i iVar) {
        this.y = bigInteger;
        this.elSpec = iVar;
    }

    public JCEElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.y = dHPublicKey.getY();
        this.elSpec = new i(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    public JCEElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.y = dHPublicKeySpec.getY();
        this.elSpec = new i(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    public JCEElGamalPublicKey(ElGamalPublicKey elGamalPublicKey) {
        this.y = elGamalPublicKey.getY();
        this.elSpec = elGamalPublicKey.getParameters();
    }

    public JCEElGamalPublicKey(m0 m0Var) {
        a t = a.t(m0Var.c.d);
        try {
            this.y = ((k) m0Var.t()).E();
            this.elSpec = new i(t.u(), t.s());
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    public JCEElGamalPublicKey(s0.a.d.e.k kVar) {
        Objects.requireNonNull(kVar);
        this.y = null;
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.y = (BigInteger) objectInputStream.readObject();
        this.elSpec = new i((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getY());
        objectOutputStream.writeObject(this.elSpec.a);
        objectOutputStream.writeObject(this.elSpec.b);
    }

    public String getAlgorithm() {
        return "ElGamal";
    }

    public byte[] getEncoded() {
        n nVar = b.i;
        i iVar = this.elSpec;
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new s0.a.a.c3.b(nVar, new a(iVar.a, iVar.b)), (e) new k(this.y));
    }

    public String getFormat() {
        return "X.509";
    }

    public i getParameters() {
        return this.elSpec;
    }

    public DHParameterSpec getParams() {
        i iVar = this.elSpec;
        return new DHParameterSpec(iVar.a, iVar.b);
    }

    public BigInteger getY() {
        return this.y;
    }

    public JCEElGamalPublicKey(n0 n0Var) {
        this.y = n0Var.q;
        l0 l0Var = n0Var.d;
        this.elSpec = new i(l0Var.d, l0Var.c);
    }
}
