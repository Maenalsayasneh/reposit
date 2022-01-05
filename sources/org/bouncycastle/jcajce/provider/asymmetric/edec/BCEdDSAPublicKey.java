package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import org.bouncycastle.jcajce.interfaces.EdDSAPublicKey;
import s0.a.a.c3.m0;
import s0.a.a.i2.a;
import s0.a.b.k0.b;
import s0.a.b.k0.f0;
import s0.a.b.k0.i0;
import s0.a.e.b.b0.c.h3;

public class BCEdDSAPublicKey implements EdDSAPublicKey {
    public static final long serialVersionUID = 1;
    public transient b eddsaPublicKey;

    public BCEdDSAPublicKey(m0 m0Var) {
        populateFromPubKeyInfo(m0Var);
    }

    public BCEdDSAPublicKey(b bVar) {
        this.eddsaPublicKey = bVar;
    }

    public BCEdDSAPublicKey(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException {
        b f0Var;
        int length = bArr.length;
        if (Utils.isValidPrefix(bArr, bArr2)) {
            if (bArr2.length - length == 57) {
                f0Var = new i0(bArr2, length);
            } else if (bArr2.length - length == 32) {
                f0Var = new f0(bArr2, length);
            } else {
                throw new InvalidKeySpecException("raw key data not recognised");
            }
            this.eddsaPublicKey = f0Var;
            return;
        }
        throw new InvalidKeySpecException("raw key data not recognised");
    }

    private void populateFromPubKeyInfo(m0 m0Var) {
        b bVar;
        if (a.e.w(m0Var.c.c)) {
            bVar = new i0(m0Var.d.C(), 0);
        } else {
            bVar = new f0(m0Var.d.C(), 0);
        }
        this.eddsaPublicKey = bVar;
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
        return this.eddsaPublicKey;
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
        return this.eddsaPublicKey instanceof i0 ? "Ed448" : "Ed25519";
    }

    public byte[] getEncoded() {
        if (this.eddsaPublicKey instanceof i0) {
            byte[] bArr = KeyFactorySpi.Ed448Prefix;
            byte[] bArr2 = new byte[(bArr.length + 57)];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            System.arraycopy(((i0) this.eddsaPublicKey).d, 0, bArr2, bArr.length, 57);
            return bArr2;
        }
        byte[] bArr3 = KeyFactorySpi.Ed25519Prefix;
        byte[] bArr4 = new byte[(bArr3.length + 32)];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        System.arraycopy(((f0) this.eddsaPublicKey).d, 0, bArr4, bArr3.length, 32);
        return bArr4;
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return h3.m1(getEncoded());
    }

    public String toString() {
        return Utils.keyToString("Public Key", getAlgorithm(), this.eddsaPublicKey);
    }
}
