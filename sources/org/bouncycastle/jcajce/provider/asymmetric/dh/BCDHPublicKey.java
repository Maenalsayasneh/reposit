package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import s0.a.a.b1;
import s0.a.a.c3.m0;
import s0.a.a.d3.c;
import s0.a.a.d3.m;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.n;
import s0.a.a.s;
import s0.a.b.k0.h;
import s0.a.b.k0.j;
import s0.a.b.k0.l;
import s0.a.c.n.b;
import s0.a.c.n.d;
import s0.a.e.b.b0.c.h3;

public class BCDHPublicKey implements DHPublicKey {
    public static final long serialVersionUID = -216691575254424324L;
    private transient j dhPublicKey;
    private transient DHParameterSpec dhSpec;
    private transient m0 info;
    private BigInteger y;

    public BCDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.y = bigInteger;
        this.dhSpec = dHParameterSpec;
        this.dhPublicKey = dHParameterSpec instanceof b ? new j(bigInteger, ((b) dHParameterSpec).a()) : new j(bigInteger, new h(dHParameterSpec.getP(), dHParameterSpec.getG()));
    }

    public BCDHPublicKey(DHPublicKey dHPublicKey) {
        this.y = dHPublicKey.getY();
        DHParameterSpec params = dHPublicKey.getParams();
        this.dhSpec = params;
        if (params instanceof b) {
            this.dhPublicKey = new j(this.y, ((b) params).a());
        } else {
            this.dhPublicKey = new j(this.y, new h(this.dhSpec.getP(), this.dhSpec.getG()));
        }
    }

    public BCDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        DHParameterSpec dHParameterSpec;
        this.y = dHPublicKeySpec.getY();
        if (dHPublicKeySpec instanceof d) {
            d dVar = (d) dHPublicKeySpec;
            dHParameterSpec = null;
        } else {
            dHParameterSpec = new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
        }
        this.dhSpec = dHParameterSpec;
        DHParameterSpec dHParameterSpec2 = this.dhSpec;
        if (dHParameterSpec2 instanceof b) {
            this.dhPublicKey = new j(this.y, ((b) dHParameterSpec2).a());
        } else {
            this.dhPublicKey = new j(this.y, new h(dHPublicKeySpec.getP(), dHPublicKeySpec.getG()));
        }
    }

    public BCDHPublicKey(m0 m0Var) {
        j jVar;
        this.info = m0Var;
        try {
            this.y = ((k) m0Var.t()).E();
            s B = s.B(m0Var.c.d);
            n nVar = m0Var.c.c;
            if (nVar.w(s0.a.a.w2.n.G) || isPKCSParam(B)) {
                s0.a.a.w2.d t = s0.a.a.w2.d.t(B);
                if (t.u() != null) {
                    this.dhSpec = new DHParameterSpec(t.v(), t.s(), t.u().intValue());
                    jVar = new j(this.y, new h(this.dhSpec.getP(), this.dhSpec.getG(), (BigInteger) null, this.dhSpec.getL()));
                } else {
                    this.dhSpec = new DHParameterSpec(t.v(), t.s());
                    jVar = new j(this.y, new h(this.dhSpec.getP(), this.dhSpec.getG()));
                }
                this.dhPublicKey = jVar;
            } else if (nVar.w(m.U1)) {
                c t2 = c.t(B);
                s0.a.a.d3.d dVar = t2.y;
                if (dVar != null) {
                    this.dhPublicKey = new j(this.y, new h(t2.v(), t2.s(), t2.w(), 160, 0, t2.u(), new l(dVar.c.B(), dVar.d.D().intValue())));
                } else {
                    this.dhPublicKey = new j(this.y, new h(t2.v(), t2.s(), t2.w(), 160, 0, t2.u(), (l) null));
                }
                this.dhSpec = new b(this.dhPublicKey.d);
            } else {
                throw new IllegalArgumentException("unknown algorithm type: " + nVar);
            }
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
        objectInputStream.defaultReadObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.info = null;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    public j engineGetKeyParameters() {
        return this.dhPublicKey;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) obj;
        return getY().equals(dHPublicKey.getY()) && getParams().getG().equals(dHPublicKey.getParams().getG()) && getParams().getP().equals(dHPublicKey.getParams().getP()) && getParams().getL() == dHPublicKey.getParams().getL();
    }

    public String getAlgorithm() {
        return "DH";
    }

    public byte[] getEncoded() {
        s0.a.a.c3.b bVar;
        k kVar;
        m0 m0Var = this.info;
        if (m0Var != null) {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(m0Var);
        }
        DHParameterSpec dHParameterSpec = this.dhSpec;
        if (dHParameterSpec instanceof b) {
            b bVar2 = (b) dHParameterSpec;
            if (bVar2.a != null) {
                h a = bVar2.a();
                l lVar = a.Z1;
                k kVar2 = null;
                s0.a.a.d3.d dVar = lVar != null ? new s0.a.a.d3.d(h3.I(lVar.a), lVar.b) : null;
                n nVar = m.U1;
                BigInteger bigInteger = a.d;
                BigInteger bigInteger2 = a.c;
                BigInteger bigInteger3 = a.q;
                BigInteger bigInteger4 = a.x;
                if (bigInteger == null) {
                    throw new IllegalArgumentException("'p' cannot be null");
                } else if (bigInteger2 == null) {
                    throw new IllegalArgumentException("'g' cannot be null");
                } else if (bigInteger3 != null) {
                    k kVar3 = new k(bigInteger);
                    k kVar4 = new k(bigInteger2);
                    k kVar5 = new k(bigInteger3);
                    if (bigInteger4 != null) {
                        kVar2 = new k(bigInteger4);
                    }
                    f fVar = new f(5);
                    fVar.a(kVar3);
                    fVar.a(kVar4);
                    fVar.a(kVar5);
                    if (kVar2 != null) {
                        fVar.a(kVar2);
                    }
                    if (dVar != null) {
                        fVar.a(dVar);
                    }
                    bVar = new s0.a.a.c3.b(nVar, new b1(fVar));
                    kVar = new k(this.y);
                    return KeyUtil.getEncodedSubjectPublicKeyInfo(bVar, (e) kVar);
                } else {
                    throw new IllegalArgumentException("'q' cannot be null");
                }
            }
        }
        bVar = new s0.a.a.c3.b(s0.a.a.w2.n.G, new s0.a.a.w2.d(dHParameterSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL()).c());
        kVar = new k(this.y);
        return KeyUtil.getEncodedSubjectPublicKeyInfo(bVar, (e) kVar);
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

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public String toString() {
        return DHUtil.publicKeyToString("DH", this.y, new h(this.dhSpec.getP(), this.dhSpec.getG()));
    }

    public BCDHPublicKey(j jVar) {
        this.y = jVar.y;
        this.dhSpec = new b(jVar.d);
        this.dhPublicKey = jVar;
    }
}
