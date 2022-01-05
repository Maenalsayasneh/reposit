package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.util.AccessPattern;
import i0.f.a.c.l.i;
import java.io.Serializable;

public class NullsConstantProvider implements i, Serializable {
    public static final NullsConstantProvider c = new NullsConstantProvider((Object) null);
    public static final NullsConstantProvider d = new NullsConstantProvider((Object) null);
    public final Object q;

    public NullsConstantProvider(Object obj) {
        this.q = obj;
        if (obj == null) {
            AccessPattern accessPattern = AccessPattern.ALWAYS_NULL;
        } else {
            AccessPattern accessPattern2 = AccessPattern.CONSTANT;
        }
    }

    public static boolean a(i iVar) {
        return iVar == c;
    }

    public Object b(DeserializationContext deserializationContext) {
        return this.q;
    }
}
