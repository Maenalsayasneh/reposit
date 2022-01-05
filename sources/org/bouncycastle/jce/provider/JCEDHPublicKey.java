package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import s0.a.a.c3.b;
import s0.a.a.c3.m0;
import s0.a.a.d3.a;
import s0.a.a.d3.m;
import s0.a.a.e;
import s0.a.a.k;
import s0.a.a.n;
import s0.a.a.s;
import s0.a.a.w2.d;
import s0.a.b.k0.h;
import s0.a.b.k0.j;

public class JCEDHPublicKey implements DHPublicKey {
    public static final long serialVersionUID = -216691575254424324L;
    private DHParameterSpec dhSpec;
    private m0 info;
    private BigInteger y;

    public JCEDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.y = bigInteger;
        this.dhSpec = dHParameterSpec;
    }

    public JCEDHPublicKey(DHPublicKey dHPublicKey) {
        this.y = dHPublicKey.getY();
        this.dhSpec = dHPublicKey.getParams();
    }

    public JCEDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.y = dHPublicKeySpec.getY();
        this.dhSpec = new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    public JCEDHPublicKey(m0 m0Var) {
        DHParameterSpec dHParameterSpec;
        this.info = m0Var;
        try {
            this.y = ((k) m0Var.t()).E();
            s B = s.B(m0Var.c.d);
            n nVar = m0Var.c.c;
            if (nVar.w(s0.a.a.w2.n.G) || isPKCSParam(B)) {
                d t = d.t(B);
                dHParameterSpec = t.u() != null ? new DHParameterSpec(t.v(), t.s(), t.u().intValue()) : new DHParameterSpec(t.v(), t.s());
            } else if (nVar.w(m.U1)) {
                a s = a.s(B);
                dHParameterSpec = new DHParameterSpec(s.c.E(), s.d.E());
            } else {
                throw new IllegalArgumentException("unknown algorithm type: " + nVar);
            }
            this.dhSpec = dHParameterSpec;
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DH public key");
        }
    }

    private boolean isPKCSParam(s sVar) {
        if (sVar.size() == 2) {
            return true;
        }
        if (sVar.size() > 3) {
            return false;
        }
        return k.B(sVar.D(2)).E().compareTo(BigInteger.valueOf((long) k.B(sVar.D(0)).E().bitLength())) <= 0;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.y = (BigInteger) objectInputStream.readObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getY());
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    public String getAlgorithm() {
        return "DH";
    }

    public byte[] getEncoded() {
        m0 m0Var = this.info;
        return m0Var != null ? KeyUtil.getEncodedSubjectPublicKeyInfo(m0Var) : KeyUtil.getEncodedSubjectPublicKeyInfo(new b(s0.a.a.w2.n.G, new d(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL())), (e) new k(this.y));
    }

    public String getFormat() {
        return "X.509";
    }

    public DHParameterSpec getParams() {
        return this.dhSpec;
    }

    public BigInteger getY() {
        return this.y;
    }

    public JCEDHPublicKey(j jVar) {
        this.y = jVar.y;
        h hVar = jVar.d;
        this.dhSpec = new DHParameterSpec(hVar.d, hVar.c, hVar.Y1);
    }
}
