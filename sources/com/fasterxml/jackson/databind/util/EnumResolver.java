package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.MapperFeature;
import i0.d.a.a.a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EnumResolver implements Serializable {
    public final Class<Enum<?>> c;
    public final Enum<?>[] d;
    public final HashMap<String, Enum<?>> q;
    public final Enum<?> x;
    public final boolean y;

    public EnumResolver(Class<Enum<?>> cls, Enum<?>[] enumArr, HashMap<String, Enum<?>> hashMap, Enum<?> enumR, boolean z) {
        this.c = cls;
        this.d = enumArr;
        this.q = hashMap;
        this.x = enumR;
        this.y = z;
    }

    public static Enum<?>[] a(Class<?> cls) {
        Enum<?>[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr != null) {
            return enumArr;
        }
        throw new IllegalArgumentException(a.W(cls, a.P0("No enum constants for class ")));
    }

    public static Enum<?> b(AnnotationIntrospector annotationIntrospector, Class<?> cls) {
        if (annotationIntrospector != null) {
            return annotationIntrospector.g(cls);
        }
        return null;
    }

    public static EnumResolver d(DeserializationConfig deserializationConfig, Class<?> cls) {
        AnnotationIntrospector e = deserializationConfig.e();
        boolean q2 = deserializationConfig.q(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Enum[] a = a(cls);
        HashMap hashMap = new HashMap();
        String[][] strArr = new String[a.length][];
        e.l(cls, a, strArr);
        int length = a.length;
        while (true) {
            length--;
            if (length >= 0) {
                Enum enumR = a[length];
                hashMap.put(enumR.toString(), enumR);
                String[] strArr2 = strArr[length];
                if (strArr2 != null) {
                    for (String str : strArr2) {
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, enumR);
                        }
                    }
                }
            } else {
                return new EnumResolver(cls, a, hashMap, b(e, cls), q2);
            }
        }
    }

    public CompactStringObjectMap c() {
        int i;
        HashMap<String, Enum<?>> hashMap = this.q;
        if (hashMap.isEmpty()) {
            return CompactStringObjectMap.c;
        }
        int size = hashMap.size();
        if (size <= 5) {
            i = 8;
        } else if (size <= 12) {
            i = 16;
        } else {
            int i2 = 32;
            while (i2 < size + (size >> 2)) {
                i2 += i2;
            }
            i = i2;
        }
        int i3 = i - 1;
        int i4 = (i >> 1) + i;
        Object[] objArr = new Object[(i4 * 2)];
        int i5 = 0;
        for (Map.Entry next : hashMap.entrySet()) {
            String str = (String) next.getKey();
            if (str != null) {
                int hashCode = str.hashCode() & i3;
                int i6 = hashCode + hashCode;
                if (objArr[i6] != null) {
                    i6 = ((hashCode >> 1) + i) << 1;
                    if (objArr[i6] != null) {
                        i6 = (i4 << 1) + i5;
                        i5 += 2;
                        if (i6 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i6] = str;
                objArr[i6 + 1] = next.getValue();
            }
        }
        return new CompactStringObjectMap(i3, i5, objArr);
    }
}
