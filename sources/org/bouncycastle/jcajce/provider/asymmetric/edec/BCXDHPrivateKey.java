package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;
import org.bouncycastle.jcajce.interfaces.XDHPublicKey;
import s0.a.a.i2.a;
import s0.a.a.o;
import s0.a.a.v;
import s0.a.a.w2.p;
import s0.a.b.k0.b;
import s0.a.b.k0.p1;
import s0.a.b.k0.s1;
import s0.a.b.o0.d;
import s0.a.e.b.b0.c.h3;
import s0.a.g.g;

public class BCXDHPrivateKey implements Key, PrivateKey {
    public static final long serialVersionUID = 1;
    private final byte[] attributes;
    private final boolean hasPublicKey;
    public transient b xdhPrivateKey;

    public BCXDHPrivateKey(p pVar) throws IOException {
        this.hasPublicKey = pVar.y != null;
        v vVar = pVar.x;
        this.attributes = vVar != null ? vVar.getEncoded() : null;
        populateFromPrivateKeyInfo(pVar);
    }

    public BCXDHPrivateKey(b bVar) {
        this.hasPublicKey = true;
        this.attributes = null;
        this.xdhPrivateKey = bVar;
    }

    private void populateFromPrivateKeyInfo(p pVar) throws IOException {
        b bVar;
        o t = pVar.t();
        byte[] bArr = t.c;
        if (!(bArr.length == 32 || bArr.length == 56)) {
            t = o.B(pVar.u());
        }
        if (a.c.w(pVar.d.c)) {
            bVar = new s1(o.B(t).c, 0);
        } else {
            bVar = new p1(o.B(t).c, 0);
        }
        this.xdhPrivateKey = bVar;
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
        return this.xdhPrivateKey;
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
        return this.xdhPrivateKey instanceof s1 ? "X448" : "X25519";
    }

    public byte[] getEncoded() {
        try {
            v C = v.C(this.attributes);
            p a = d.a(this.xdhPrivateKey, C);
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

    public XDHPublicKey getPublicKey() {
        b bVar = this.xdhPrivateKey;
        return bVar instanceof s1 ? new BCXDHPublicKey((b) ((s1) bVar).a()) : new BCXDHPublicKey((b) ((p1) bVar).a());
    }

    public int hashCode() {
        return h3.m1(getEncoded());
    }

    public String toString() {
        b bVar = this.xdhPrivateKey;
        return Utils.keyToString("Private Key", getAlgorithm(), bVar instanceof s1 ? ((s1) bVar).a() : ((p1) bVar).a());
    }
}
