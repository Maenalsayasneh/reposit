package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;

public class CoercionConfig implements Serializable {
    public static final int c = 10;
    public Boolean d = Boolean.FALSE;
    public final CoercionAction[] q = new CoercionAction[c];

    static {
        CoercionInputShape.values();
    }

    public CoercionAction a(CoercionInputShape coercionInputShape) {
        return this.q[coercionInputShape.ordinal()];
    }
}
