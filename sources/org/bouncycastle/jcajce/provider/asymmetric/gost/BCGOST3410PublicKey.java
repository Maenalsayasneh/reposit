package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jce.interfaces.GOST3410PublicKey;
import s0.a.a.c3.b;
import s0.a.a.c3.m0;
import s0.a.a.e;
import s0.a.a.g2.a;
import s0.a.a.g2.f;
import s0.a.a.x0;
import s0.a.b.k0.s0;
import s0.a.d.d.d;
import s0.a.d.e.l;
import s0.a.d.e.n;
import s0.a.d.e.o;

public class BCGOST3410PublicKey implements GOST3410PublicKey {
    public static final long serialVersionUID = -6251023343619275990L;
    private transient d gost3410Spec;
    private BigInteger y;

    public BCGOST3410PublicKey(BigInteger bigInteger, l lVar) {
        this.y = bigInteger;
        this.gost3410Spec = lVar;
    }

    public BCGOST3410PublicKey(GOST3410PublicKey gOST3410PublicKey) {
        this.y = gOST3410PublicKey.getY();
        this.gost3410Spec = gOST3410PublicKey.getParameters();
    }

    public BCGOST3410PublicKey(m0 m0Var) {
        f s = f.s(m0Var.c.d);
        try {
            byte[] bArr = ((x0) m0Var.t()).c;
            byte[] bArr2 = new byte[bArr.length];
            for (int i = 0; i != bArr.length; i++) {
                bArr2[i] = bArr[(bArr.length - 1) - i];
            }
            this.y = new BigInteger(1, bArr2);
            this.gost3410Spec = l.a(s);
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in GOST3410 public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.gost3410Spec = new l(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
            return;
        }
        this.gost3410Spec = new l(new n((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
        objectInputStream.readObject();
        objectInputStream.readObject();
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
        if (!(obj instanceof BCGOST3410PublicKey)) {
            return false;
        }
        BCGOST3410PublicKey bCGOST3410PublicKey = (BCGOST3410PublicKey) obj;
        return this.y.equals(bCGOST3410PublicKey.y) && this.gost3410Spec.equals(bCGOST3410PublicKey.gost3410Spec);
    }

    public String getAlgorithm() {
        return "GOST3410";
    }

    public byte[] getEncoded() {
        m0 m0Var;
        byte[] byteArray = getY().toByteArray();
        byte[] bArr = new byte[(byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length)];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            d dVar = this.gost3410Spec;
            if (dVar instanceof l) {
                m0Var = ((l) dVar).d != null ? new m0(new b(a.l, new f(new s0.a.a.n(((l) this.gost3410Spec).b), new s0.a.a.n(((l) this.gost3410Spec).c), new s0.a.a.n(((l) this.gost3410Spec).d))), (e) new x0(bArr)) : new m0(new b(a.l, new f(new s0.a.a.n(((l) this.gost3410Spec).b), new s0.a.a.n(((l) this.gost3410Spec).c))), (e) new x0(bArr));
            } else {
                m0Var = new m0(new b(a.l), (e) new x0(bArr));
            }
            return KeyUtil.getEncodedSubjectPublicKeyInfo(m0Var);
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public d getParameters() {
        return this.gost3410Spec;
    }

    public BigInteger getY() {
        return this.y;
    }

    public int hashCode() {
        return this.y.hashCode() ^ this.gost3410Spec.hashCode();
    }

    public String toString() {
        try {
            return GOSTUtil.publicKeyToString("GOST3410", this.y, ((s0) GOST3410Util.generatePublicKeyParameter(this)).d);
        } catch (InvalidKeyException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    public BCGOST3410PublicKey(s0 s0Var, l lVar) {
        this.y = s0Var.q;
        this.gost3410Spec = lVar;
    }

    public BCGOST3410PublicKey(o oVar) {
        this.y = oVar.c;
        this.gost3410Spec = new l(new n(oVar.d, oVar.q, oVar.x));
    }
}
