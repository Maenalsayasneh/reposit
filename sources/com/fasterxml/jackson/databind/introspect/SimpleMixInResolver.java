package com.fasterxml.jackson.databind.introspect;

import i0.f.a.c.n.k;
import java.io.Serializable;

public class SimpleMixInResolver implements k.a, Serializable {
    public final k.a c = null;

    public SimpleMixInResolver(k.a aVar) {
    }

    public Class<?> a(Class<?> cls) {
        k.a aVar = this.c;
        if (aVar == null) {
            return null;
        }
        return aVar.a(cls);
    }

    public boolean b() {
        k.a aVar = this.c;
        if (aVar == null) {
            return false;
        }
        if (aVar instanceof SimpleMixInResolver) {
            return ((SimpleMixInResolver) aVar).b();
        }
        return true;
    }
}
