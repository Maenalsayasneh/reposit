package com.fasterxml.jackson.databind.introspect;

import i0.f.a.c.n.a;
import i0.f.a.c.n.h;
import i0.f.a.c.n.q;
import i0.f.a.c.t.f;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.HashMap;

public abstract class AnnotatedMember extends a implements Serializable {
    public final transient q c;
    public final transient h d;

    public AnnotatedMember(q qVar, h hVar) {
        this.c = qVar;
        this.d = hVar;
    }

    public final <A extends Annotation> A c(Class<A> cls) {
        HashMap<Class<?>, Annotation> hashMap;
        h hVar = this.d;
        if (hVar == null || (hashMap = hVar.c) == null) {
            return null;
        }
        return (Annotation) hashMap.get(cls);
    }

    public final void g(boolean z) {
        Member k = k();
        if (k != null) {
            f.e(k, z);
        }
    }

    public abstract Class<?> h();

    public String i() {
        return h().getName() + "#" + d();
    }

    public abstract Member k();

    public abstract Object l(Object obj) throws UnsupportedOperationException, IllegalArgumentException;

    public final boolean m(Class<?> cls) {
        HashMap<Class<?>, Annotation> hashMap;
        h hVar = this.d;
        if (hVar == null || (hashMap = hVar.c) == null) {
            return false;
        }
        return hashMap.containsKey(cls);
    }

    public abstract a n(h hVar);
}
