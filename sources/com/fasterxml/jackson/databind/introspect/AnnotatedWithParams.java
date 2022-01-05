package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import i0.f.a.c.n.h;
import i0.f.a.c.n.q;

public abstract class AnnotatedWithParams extends AnnotatedMember {
    public final h[] q;

    public AnnotatedWithParams(q qVar, h hVar, h[] hVarArr) {
        super(qVar, hVar);
        this.q = hVarArr;
    }

    public abstract Object p() throws Exception;

    public abstract Object q(Object[] objArr) throws Exception;

    public abstract Object v(Object obj) throws Exception;

    public final AnnotatedParameter w(int i) {
        JavaType y = y(i);
        q qVar = this.c;
        h[] hVarArr = this.q;
        return new AnnotatedParameter(this, y, qVar, (hVarArr == null || i < 0 || i >= hVarArr.length) ? null : hVarArr[i], i);
    }

    public abstract int x();

    public abstract JavaType y(int i);

    public abstract Class<?> z(int i);
}
