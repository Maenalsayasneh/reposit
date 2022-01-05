package org.bouncycastle.jce.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import org.bouncycastle.util.StoreException;
import s0.a.d.b;
import s0.a.g.h;
import s0.a.h.g;
import s0.a.h.n;
import s0.a.h.o;
import s0.a.h.r.a;

public class X509StoreLDAPAttrCerts extends o {
    private a helper;

    public Collection engineGetMatches(h hVar) throws StoreException {
        if (!(hVar instanceof g)) {
            return Collections.EMPTY_SET;
        }
        g gVar = (g) hVar;
        new HashSet();
        a aVar = this.helper;
        Objects.requireNonNull(aVar.a);
        aVar.a((String) null);
        throw null;
    }

    public void engineInit(n nVar) {
        if (nVar instanceof b) {
            this.helper = new a((b) nVar);
        } else {
            throw new IllegalArgumentException(i0.d.a.a.a.Y(b.class, i0.d.a.a.a.P0("Initialization parameters must be an instance of "), "."));
        }
    }
}
