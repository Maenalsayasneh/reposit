package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.Serializable;
import java.util.Map;

public class CoercionConfigs implements Serializable {
    public CoercionAction c;
    public final MutableCoercionConfig d = new MutableCoercionConfig();
    public MutableCoercionConfig[] q;
    public Map<Class<?>, MutableCoercionConfig> x;

    static {
        LogicalType.values();
    }

    public CoercionConfigs() {
        CoercionAction coercionAction = CoercionAction.TryConvert;
        this.c = coercionAction;
        this.q = null;
        this.x = null;
    }
}
