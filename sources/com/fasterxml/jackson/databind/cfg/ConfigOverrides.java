package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import i0.f.a.c.k.b;
import java.io.Serializable;
import java.util.Map;

public class ConfigOverrides implements Serializable {
    public Boolean Y1;
    public Map<Class<?>, MutableConfigOverride> c = null;
    public JsonInclude.Value d;
    public JsonSetter.Value q;
    public VisibilityChecker<?> x;
    public Boolean y;

    public ConfigOverrides() {
        JsonInclude.Value value = JsonInclude.Value.c;
        JsonSetter.Value value2 = JsonSetter.Value.c;
        VisibilityChecker.Std std = VisibilityChecker.Std.c;
        this.d = value;
        this.q = value2;
        this.x = std;
        this.y = null;
        this.Y1 = null;
    }

    public b a(Class<?> cls) {
        Map<Class<?>, MutableConfigOverride> map = this.c;
        if (map == null) {
            return null;
        }
        return map.get(cls);
    }
}
