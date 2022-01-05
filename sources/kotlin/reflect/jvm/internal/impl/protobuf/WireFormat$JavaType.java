package kotlin.reflect.jvm.internal.impl.protobuf;

import m0.r.t.a.r.h.c;

public enum WireFormat$JavaType {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(c.c),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object defaultDefault;

    private WireFormat$JavaType(Object obj) {
        this.defaultDefault = obj;
    }
}
