package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.ClassKey;
import i0.f.a.c.n.i;
import java.io.Serializable;

public class RootNameLookup implements Serializable {
    public transient LRUMap<ClassKey, PropertyName> c = new LRUMap<>(20, 200);

    public PropertyName a(Class<?> cls, MapperConfig<?> mapperConfig) {
        ClassKey classKey = new ClassKey(cls);
        PropertyName propertyName = (PropertyName) this.c.d.get(classKey);
        if (propertyName != null) {
            return propertyName;
        }
        PropertyName b0 = mapperConfig.e().b0(((i) mapperConfig.n(cls)).f);
        if (b0 == null || !b0.c()) {
            b0 = PropertyName.a(cls.getSimpleName());
        }
        this.c.a(classKey, b0);
        return b0;
    }
}
