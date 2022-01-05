package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import org.bouncycastle.jcajce.interfaces.XDHPublicKey;
import s0.a.a.c3.m0;
import s0.a.a.i2.a;
import s0.a.b.k0.b;
import s0.a.b.k0.q1;
import s0.a.b.k0.t1;
import s0.a.e.b.b0.c.h3;

public class BCXDHPublicKey implements XDHPublicKey {
    public static final long serialVersionUID = 1;
    public transient b xdhPublicKey;

    public BCXDHPublicKey(m0 m0Var) {
        populateFromPubKeyInfo(m0Var);
    }

    public BCXDHPublicKey(b bVar) {
        this.xdhPublicKey = bVar;
    }

    public BCXDHPublicKey(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException {
        b q1Var;
        int length = bArr.length;
        if (Utils.isValidPrefix(bArr, bArr2)) {
            if (bArr2.length - length == 56) {
                q1Var = new t1(bArr2, length);
            } else if (bArr2.length - length == 32) {
                q1Var = new q1(bArr2, length);
            } else {
                throw new InvalidKeySpecException("raw key data not recognised");
            }
            this.xdhPublicKey = q1Var;
            return;
        }
        throw new InvalidKeySpecException("raw key data not recognised");
    }

    private void populateFromPubKeyInfo(m0 m0Var) {
        b bVar;
        if (a.c.w(m0Var.c.c)) {
            bVar = new t1(m0Var.d.C(), 0);
        } else {
            bVar = new q1(m0Var.d.C(), 0);
        }
        this.xdhPublicKey = bVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(m0.s((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public b engineGetKeyParameters() {
        return this.xdhPublicKey;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PublicKey)) {
            return false;
        }
        return Arrays.equals(((PublicKey) obj).getEncoded(), getEncoded());
    }

    public String getAlgorithm() {
        return this.xdhPublicKey instanceof t1 ? "X448" : "X25519";
    }

    public byte[] getEncoded() {
        if (this.xdhPublicKey instanceof t1) {
            byte[] bArr = KeyFactorySpi.x448Prefix;
            byte[] bArr2 = new byte[(bArr.length + 56)];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            System.arraycopy(((t1) this.xdhPublicKey).d, 0, bArr2, bArr.length, 56);
            return bArr2;
        }
        byte[] bArr3 = KeyFactorySpi.x25519Prefix;
        byte[] bArr4 = new byte[(bArr3.length + 32)];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        System.arraycopy(((q1) this.xdhPublicKey).d, 0, bArr4, bArr3.length, 32);
        return bArr4;
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return h3.m1(getEncoded());
    }

    public String toString() {
        return Utils.keyToString("Public Key", getAlgorithm(), this.xdhPublicKey);
    }
}
