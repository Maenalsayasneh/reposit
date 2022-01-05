package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.GOST3410PrivateKey;
import s0.a.a.c3.b;
import s0.a.a.g2.a;
import s0.a.a.g2.f;
import s0.a.a.k;
import s0.a.a.o;
import s0.a.a.v;
import s0.a.a.w2.p;
import s0.a.a.x0;
import s0.a.b.k0.r0;
import s0.a.d.d.d;
import s0.a.d.d.e;
import s0.a.d.e.l;
import s0.a.d.e.m;
import s0.a.d.e.n;

public class BCGOST3410PrivateKey implements GOST3410PrivateKey, e {
    public static final long serialVersionUID = 8581661527592305464L;
    private transient e attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient d gost3410Spec;
    private BigInteger x;

    public BCGOST3410PrivateKey() {
    }

    public BCGOST3410PrivateKey(GOST3410PrivateKey gOST3410PrivateKey) {
        this.x = gOST3410PrivateKey.getX();
        this.gost3410Spec = gOST3410PrivateKey.getParameters();
    }

    public BCGOST3410PrivateKey(p pVar) throws IOException {
        BigInteger bigInteger;
        f s = f.s(pVar.d.d);
        s0.a.a.e u = pVar.u();
        if (u instanceof k) {
            bigInteger = k.B(u).D();
        } else {
            byte[] bArr = o.B(pVar.u()).c;
            byte[] bArr2 = new byte[bArr.length];
            for (int i = 0; i != bArr.length; i++) {
                bArr2[i] = bArr[(bArr.length - 1) - i];
            }
            bigInteger = new BigInteger(1, bArr2);
        }
        this.x = bigInteger;
        this.gost3410Spec = l.a(s);
    }

    private boolean compareObj(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.gost3410Spec = new l(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        } else {
            this.gost3410Spec = new l(new n((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
            objectInputStream.readObject();
            objectInputStream.readObject();
        }
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        l lVar;
        objectOutputStream.defaultWriteObject();
        d dVar = this.gost3410Spec;
        if (((l) dVar).b != null) {
            objectOutputStream.writeObject(((l) dVar).b);
            objectOutputStream.writeObject(((l) this.gost3410Spec).c);
            lVar = (l) this.gost3410Spec;
        } else {
            objectOutputStream.writeObject((Object) null);
            objectOutputStream.writeObject(((l) this.gost3410Spec).a.a);
            objectOutputStream.writeObject(((l) this.gost3410Spec).a.b);
            objectOutputStream.writeObject(((l) this.gost3410Spec).a.c);
            objectOutputStream.writeObject(((l) this.gost3410Spec).c);
            lVar = (l) this.gost3410Spec;
        }
        objectOutputStream.writeObject(lVar.d);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410PrivateKey)) {
            return false;
        }
        GOST3410PrivateKey gOST3410PrivateKey = (GOST3410PrivateKey) obj;
        if (!getX().equals(gOST3410PrivateKey.getX()) || !((l) getParameters()).a.equals(((l) gOST3410PrivateKey.getParameters()).a) || !((l) getParameters()).c.equals(((l) gOST3410PrivateKey.getParameters()).c) || !compareObj(((l) getParameters()).d, ((l) gOST3410PrivateKey.getParameters()).d)) {
            return false;
        }
        return true;
    }

    public String getAlgorithm() {
        return "GOST3410";
    }

    public s0.a.a.e getBagAttribute(s0.a.a.n nVar) {
        return this.attrCarrier.getBagAttribute(nVar);
    }

    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    public byte[] getEncoded() {
        p pVar;
        byte[] byteArray = getX().toByteArray();
        byte[] bArr = new byte[(byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length)];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            if (this.gost3410Spec instanceof l) {
                pVar = new p(new b(a.l, new f(new s0.a.a.n(((l) this.gost3410Spec).b), new s0.a.a.n(((l) this.gost3410Spec).c))), new x0(bArr), (v) null, (byte[]) null);
            } else {
                pVar = new p(new b(a.l), new x0(bArr), (v) null, (byte[]) null);
            }
            return pVar.r("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public d getParameters() {
        return this.gost3410Spec;
    }

    public BigInteger getX() {
        return this.x;
    }

    public int hashCode() {
        return getX().hashCode() ^ this.gost3410Spec.hashCode();
    }

    public void setBagAttribute(s0.a.a.n nVar, s0.a.a.e eVar) {
        this.attrCarrier.setBagAttribute(nVar, eVar);
    }

    public String toString() {
        try {
            return GOSTUtil.privateKeyToString("GOST3410", this.x, ((r0) GOST3410Util.generatePrivateKeyParameter(this)).d);
        } catch (InvalidKeyException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    public BCGOST3410PrivateKey(r0 r0Var, l lVar) {
        this.x = r0Var.q;
        this.gost3410Spec = lVar;
        if (lVar == null) {
            throw new IllegalArgumentException("spec is null");
        }
    }

    public BCGOST3410PrivateKey(m mVar) {
        this.x = mVar.c;
        this.gost3410Spec = new l(new n(mVar.d, mVar.q, mVar.x));
    }
}
