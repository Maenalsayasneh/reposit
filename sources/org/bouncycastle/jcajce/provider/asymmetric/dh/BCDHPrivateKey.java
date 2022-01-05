package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import s0.a.a.b1;
import s0.a.a.d3.m;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.n;
import s0.a.a.s;
import s0.a.a.v;
import s0.a.a.w2.d;
import s0.a.a.w2.p;
import s0.a.b.k0.h;
import s0.a.b.k0.i;
import s0.a.b.k0.l;
import s0.a.c.n.b;
import s0.a.c.n.c;
import s0.a.d.d.e;
import s0.a.e.b.b0.c.h3;

public class BCDHPrivateKey implements DHPrivateKey, e {
    public static final long serialVersionUID = 311058815616901812L;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient i dhPrivateKey;
    private transient DHParameterSpec dhSpec;
    private transient p info;
    private BigInteger x;

    public BCDHPrivateKey() {
    }

    public BCDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.x = dHPrivateKey.getX();
        this.dhSpec = dHPrivateKey.getParams();
    }

    public BCDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.x = dHPrivateKeySpec.getX();
        if (dHPrivateKeySpec instanceof c) {
            c cVar = (c) dHPrivateKeySpec;
            this.dhSpec = null;
            return;
        }
        this.dhSpec = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public BCDHPrivateKey(p pVar) throws IOException {
        i iVar;
        s B = s.B(pVar.d.d);
        n nVar = pVar.d.c;
        this.info = pVar;
        this.x = ((k) pVar.u()).E();
        if (nVar.w(s0.a.a.w2.n.G)) {
            d t = d.t(B);
            if (t.u() != null) {
                this.dhSpec = new DHParameterSpec(t.v(), t.s(), t.u().intValue());
                iVar = new i(this.x, new h(t.v(), t.s(), (BigInteger) null, t.u().intValue()));
            } else {
                this.dhSpec = new DHParameterSpec(t.v(), t.s());
                iVar = new i(this.x, new h(t.v(), t.s(), (BigInteger) null, 0));
            }
        } else if (nVar.w(m.U1)) {
            s0.a.a.d3.c t2 = s0.a.a.d3.c.t(B);
            this.dhSpec = new b(t2.v(), t2.w(), t2.s(), t2.u(), 0);
            iVar = new i(this.x, new h(t2.v(), t2.s(), t2.w(), 160, 0, t2.u(), (l) null));
        } else {
            throw new IllegalArgumentException("unknown algorithm type: " + nVar);
        }
        this.dhPrivateKey = iVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.info = null;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    public i engineGetKeyParameters() {
        i iVar = this.dhPrivateKey;
        if (iVar != null) {
            return iVar;
        }
        DHParameterSpec dHParameterSpec = this.dhSpec;
        return dHParameterSpec instanceof b ? new i(this.x, ((b) dHParameterSpec).a()) : new i(this.x, new h(dHParameterSpec.getP(), this.dhSpec.getG(), (BigInteger) null, this.dhSpec.getL()));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPrivateKey)) {
            return false;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) obj;
        return getX().equals(dHPrivateKey.getX()) && getParams().getG().equals(dHPrivateKey.getParams().getG()) && getParams().getP().equals(dHPrivateKey.getParams().getP()) && getParams().getL() == dHPrivateKey.getParams().getL();
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
        p pVar;
        try {
            p pVar2 = this.info;
            if (pVar2 != null) {
                return pVar2.r("DER");
            }
            DHParameterSpec dHParameterSpec = this.dhSpec;
            if (!(dHParameterSpec instanceof b) || ((b) dHParameterSpec).a == null) {
                pVar = new p(new s0.a.a.c3.b(s0.a.a.w2.n.G, new d(dHParameterSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL()).c()), new k(getX()), (v) null, (byte[]) null);
            } else {
                h a = ((b) dHParameterSpec).a();
                l lVar = a.Z1;
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
                    k kVar = new k(bigInteger);
                    k kVar2 = new k(bigInteger2);
                    k kVar3 = new k(bigInteger3);
                    k kVar4 = bigInteger4 != null ? new k(bigInteger4) : null;
                    f fVar = new f(5);
                    fVar.a(kVar);
                    fVar.a(kVar2);
                    fVar.a(kVar3);
                    if (kVar4 != null) {
                        fVar.a(kVar4);
                    }
                    if (dVar != null) {
                        fVar.a(dVar);
                    }
                    pVar = new p(new s0.a.a.c3.b(nVar, new b1(fVar)), new k(getX()), (v) null, (byte[]) null);
                } else {
                    throw new IllegalArgumentException("'q' cannot be null");
                }
            }
            return pVar.r("DER");
        } catch (Exception unused) {
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

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public void setBagAttribute(n nVar, s0.a.a.e eVar) {
        this.attrCarrier.setBagAttribute(nVar, eVar);
    }

    public String toString() {
        return DHUtil.privateKeyToString("DH", this.x, new h(this.dhSpec.getP(), this.dhSpec.getG()));
    }

    public BCDHPrivateKey(i iVar) {
        this.x = iVar.q;
        this.dhSpec = new b(iVar.d);
    }
}
