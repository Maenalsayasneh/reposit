package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JavaType;
import i0.d.a.a.a;
import i0.f.a.c.f;
import i0.f.a.c.i;
import i0.f.a.c.p.e;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class TypeBase extends JavaType implements f {
    public static final TypeBindings Y1 = TypeBindings.q;
    public final JavaType Z1;
    public final JavaType[] a2;
    public final TypeBindings b2;

    public TypeBase(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, int i, Object obj, Object obj2, boolean z) {
        super(cls, i, obj, obj2, z);
        this.b2 = typeBindings == null ? Y1 : typeBindings;
        this.Z1 = javaType;
        this.a2 = javaTypeArr;
    }

    public static StringBuilder d0(Class<?> cls, StringBuilder sb, boolean z) {
        if (!cls.isPrimitive()) {
            sb.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i = 0; i < length; i++) {
                char charAt = name.charAt(i);
                if (charAt == '.') {
                    charAt = '/';
                }
                sb.append(charAt);
            }
            if (z) {
                sb.append(';');
            }
        } else if (cls == Boolean.TYPE) {
            sb.append('Z');
        } else if (cls == Byte.TYPE) {
            sb.append('B');
        } else if (cls == Short.TYPE) {
            sb.append('S');
        } else if (cls == Character.TYPE) {
            sb.append('C');
        } else if (cls == Integer.TYPE) {
            sb.append('I');
        } else if (cls == Long.TYPE) {
            sb.append('J');
        } else if (cls == Float.TYPE) {
            sb.append('F');
        } else if (cls == Double.TYPE) {
            sb.append('D');
        } else if (cls == Void.TYPE) {
            sb.append('V');
        } else {
            throw new IllegalStateException(a.W(cls, a.P0("Unrecognized primitive type: ")));
        }
        return sb;
    }

    public void b(JsonGenerator jsonGenerator, i iVar) throws IOException, JsonProcessingException {
        jsonGenerator.Q0(f0());
    }

    public void c(JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        WritableTypeId writableTypeId = new WritableTypeId(this, JsonToken.VALUE_STRING);
        eVar.e(jsonGenerator, writableTypeId);
        jsonGenerator.Q0(f0());
        eVar.f(jsonGenerator, writableTypeId);
    }

    public String e() {
        return f0();
    }

    public boolean e0(int i) {
        return this.c.getTypeParameters().length == i;
    }

    public JavaType f(int i) {
        return this.b2.d(i);
    }

    public String f0() {
        return this.c.getName();
    }

    public int g() {
        return this.b2.y.length;
    }

    public final JavaType i(Class<?> cls) {
        JavaType i;
        JavaType[] javaTypeArr;
        if (cls == this.c) {
            return this;
        }
        if (cls.isInterface() && (javaTypeArr = this.a2) != null) {
            int length = javaTypeArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                JavaType i3 = this.a2[i2].i(cls);
                if (i3 != null) {
                    return i3;
                }
            }
        }
        JavaType javaType = this.Z1;
        if (javaType == null || (i = javaType.i(cls)) == null) {
            return null;
        }
        return i;
    }

    public TypeBindings k() {
        return this.b2;
    }

    public List<JavaType> p() {
        JavaType[] javaTypeArr = this.a2;
        if (javaTypeArr == null) {
            return Collections.emptyList();
        }
        int length = javaTypeArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        if (length != 1) {
            return Arrays.asList(javaTypeArr);
        }
        return Collections.singletonList(javaTypeArr[0]);
    }

    public JavaType w() {
        return this.Z1;
    }
}
