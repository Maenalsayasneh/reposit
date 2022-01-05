package org.bouncycastle.jce.provider;

import i0.d.a.a.a;
import java.util.Collection;
import s0.a.g.c;
import s0.a.g.h;
import s0.a.h.m;
import s0.a.h.n;
import s0.a.h.o;

public class X509StoreCertPairCollection extends o {
    private c _store;

    public Collection engineGetMatches(h hVar) {
        return this._store.getMatches(hVar);
    }

    public void engineInit(n nVar) {
        if (nVar instanceof m) {
            this._store = new c(((m) nVar).a());
        } else {
            throw new IllegalArgumentException(a.Y(m.class, a.P0("Initialization parameters must be an instance of "), "."));
        }
    }
}
