package org.bouncycastle.jcajce;

import i0.d.a.a.a;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s0.a.a.b1;
import s0.a.a.c3.b;
import s0.a.a.f;
import s0.a.a.q2.c;
import s0.a.a.v;
import s0.a.a.w2.p;

public class CompositePrivateKey implements PrivateKey {
    public final List<PrivateKey> c;

    public CompositePrivateKey(PrivateKey... privateKeyArr) {
        if (privateKeyArr.length != 0) {
            ArrayList arrayList = new ArrayList(privateKeyArr.length);
            for (int i = 0; i != privateKeyArr.length; i++) {
                arrayList.add(privateKeyArr[i]);
            }
            this.c = Collections.unmodifiableList(arrayList);
            return;
        }
        throw new IllegalArgumentException("at least one public key must be provided");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompositePrivateKey) {
            return this.c.equals(((CompositePrivateKey) obj).c);
        }
        return false;
    }

    public String getAlgorithm() {
        return "Composite";
    }

    public byte[] getEncoded() {
        f fVar = new f(10);
        for (int i = 0; i != this.c.size(); i++) {
            fVar.a(p.s(this.c.get(i).getEncoded()));
        }
        try {
            return new p(new b(c.z), new b1(fVar), (v) null, (byte[]) null).r("DER");
        } catch (IOException e) {
            throw new IllegalStateException(a.V(e, a.P0("unable to encode composite key: ")));
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.c.hashCode();
    }
}
