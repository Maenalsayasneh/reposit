package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import i0.d.a.a.a;
import i0.f.a.b.f;
import java.io.Serializable;
import java.lang.annotation.Annotation;

public final class EnumValues implements Serializable {
    public final Class<Enum<?>> c;
    public final f[] d;

    public EnumValues(Class<Enum<?>> cls, f[] fVarArr) {
        this.c = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.d = fVarArr;
    }

    public static EnumValues a(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Annotation[] annotationArr = i0.f.a.c.t.f.a;
        Class<? super Enum<?>> superclass = cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
        Enum[] enumArr = (Enum[]) superclass.getEnumConstants();
        if (enumArr != null) {
            String[] m = mapperConfig.e().m(superclass, enumArr, new String[enumArr.length]);
            f[] fVarArr = new f[enumArr.length];
            int length = enumArr.length;
            for (int i = 0; i < length; i++) {
                Enum enumR = enumArr[i];
                String str = m[i];
                if (str == null) {
                    str = enumR.name();
                }
                fVarArr[enumR.ordinal()] = new SerializedString(str);
            }
            return new EnumValues(cls, fVarArr);
        }
        throw new IllegalArgumentException(a.W(cls, a.P0("Cannot determine enum constants for Class ")));
    }
}
