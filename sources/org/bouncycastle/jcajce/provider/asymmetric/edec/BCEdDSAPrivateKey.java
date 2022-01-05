package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;
import org.bouncycastle.jcajce.interfaces.EdDSAPublicKey;
import s0.a.a.e;
import s0.a.a.i2.a;
import s0.a.a.o;
import s0.a.a.v;
import s0.a.a.w2.p;
import s0.a.b.k0.b;
import s0.a.b.k0.e0;
import s0.a.b.k0.h0;
import s0.a.b.o0.d;
import s0.a.e.b.b0.c.h3;
import s0.a.g.g;

public class BCEdDSAPrivateKey implements Key, PrivateKey {
    public static final long serialVersionUID = 1;
    private final byte[] attributes;
    public transient b eddsaPrivateKey;
    private final boolean hasPublicKey;

    public BCEdDSAPrivateKey(p pVar) throws IOException {
        this.hasPublicKey = pVar.y != null;
        v vVar = pVar.x;
        this.attributes = vVar != null ? vVar.getEncoded() : null;
        populateFromPrivateKeyInfo(pVar);
    }

    public BCEdDSAPrivateKey(b bVar) {
        this.hasPublicKey = true;
        this.attributes = null;
        this.eddsaPrivateKey = bVar;
    }

    private void populateFromPrivateKeyInfo(p pVar) throws IOException {
        b bVar;
        e u = pVar.u();
        if (a.e.w(pVar.d.c)) {
            bVar = new h0(o.B(u).c, 0);
        } else {
            bVar = new e0(o.B(u).c, 0);
        }
        this.eddsaPrivateKey = bVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        populateFromPrivateKeyInfo(p.s((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public b engineGetKeyParameters() {
        return this.eddsaPrivateKey;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrivateKey)) {
            return false;
        }
        return Arrays.equals(((PrivateKey) obj).getEncoded(), getEncoded());
    }

    public String getAlgorithm() {
        return this.eddsaPrivateKey instanceof h0 ? "Ed448" : "Ed25519";
    }

    public byte[] getEncoded() {
        try {
            v C = v.C(this.attributes);
            p a = d.a(this.eddsaPrivateKey, C);
            if (!this.hasPublicKey || g.b("org.bouncycastle.pkcs8.v1_info_only")) {
                return new p(a.d, a.u(), C, (byte[]) null).getEncoded();
            }
            return a.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public EdDSAPublicKey getPublicKey() {
        b bVar = this.eddsaPrivateKey;
        return bVar instanceof h0 ? new BCEdDSAPublicKey((b) ((h0) bVar).a()) : new BCEdDSAPublicKey((b) ((e0) bVar).a());
    }

    public int hashCode() {
        return h3.m1(getEncoded());
    }

    public String toString() {
        b bVar = this.eddsaPrivateKey;
        return Utils.keyToString("Private Key", getAlgorithm(), bVar instanceof h0 ? ((h0) bVar).a() : ((e0) bVar).a());
    }
}
