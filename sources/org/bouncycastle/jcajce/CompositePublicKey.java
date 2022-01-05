package org.bouncycastle.jcajce;

import i0.d.a.a.a;
import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s0.a.a.b1;
import s0.a.a.c3.b;
import s0.a.a.c3.m0;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.q2.c;

public class CompositePublicKey implements PublicKey {
    public final List<PublicKey> c;

    public CompositePublicKey(PublicKey... publicKeyArr) {
        if (publicKeyArr.length != 0) {
            ArrayList arrayList = new ArrayList(publicKeyArr.length);
            for (int i = 0; i != publicKeyArr.length; i++) {
                arrayList.add(publicKeyArr[i]);
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
        if (obj instanceof CompositePublicKey) {
            return this.c.equals(((CompositePublicKey) obj).c);
        }
        return false;
    }

    public String getAlgorithm() {
        return "Composite";
    }

    public byte[] getEncoded() {
        f fVar = new f(10);
        for (int i = 0; i != this.c.size(); i++) {
            fVar.a(m0.s(this.c.get(i).getEncoded()));
        }
        try {
            return new m0(new b(c.z), (e) new b1(fVar)).r("DER");
        } catch (IOException e) {
            throw new IllegalStateException(a.V(e, a.P0("unable to encode composite key: ")));
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.c.hashCode();
    }
}
