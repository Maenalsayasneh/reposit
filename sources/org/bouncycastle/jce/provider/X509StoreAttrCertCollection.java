package org.bouncycastle.jce.provider;

import java.util.Collection;
import s0.a.g.c;
import s0.a.g.h;
import s0.a.h.m;
import s0.a.h.n;
import s0.a.h.o;

public class X509StoreAttrCertCollection extends o {
    private c _store;

    public Collection engineGetMatches(h hVar) {
        return this._store.getMatches(hVar);
    }

    public void engineInit(n nVar) {
        if (nVar instanceof m) {
            this._store = new c(((m) nVar).a());
            return;
        }
        throw new IllegalArgumentException(nVar.toString());
    }
}
