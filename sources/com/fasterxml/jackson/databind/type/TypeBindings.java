package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import i0.f.a.c.t.f;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TypeBindings implements Serializable {
    public static final String[] c;
    public static final JavaType[] d;
    public static final TypeBindings q;
    public final String[] Y1;
    public final int Z1;
    public final String[] x;
    public final JavaType[] y;

    public static final class a {
        public final Class<?> a;
        public final JavaType[] b;
        public final int c;

        public a(Class<?> cls, JavaType[] javaTypeArr, int i) {
            this.a = cls;
            this.b = javaTypeArr;
            this.c = i;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            if (this.c == aVar.c && this.a == aVar.a) {
                JavaType[] javaTypeArr = aVar.b;
                int length = this.b.length;
                if (length == javaTypeArr.length) {
                    for (int i = 0; i < length; i++) {
                        if (!this.b[i].equals(javaTypeArr[i])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.c;
        }

        public String toString() {
            return i0.d.a.a.a.Y(this.a, new StringBuilder(), "<>");
        }
    }

    public static class b {
        public static final TypeVariable<?>[] a = AbstractList.class.getTypeParameters();
        public static final TypeVariable<?>[] b = Collection.class.getTypeParameters();
        public static final TypeVariable<?>[] c = Iterable.class.getTypeParameters();
        public static final TypeVariable<?>[] d = List.class.getTypeParameters();
        public static final TypeVariable<?>[] e = ArrayList.class.getTypeParameters();
        public static final TypeVariable<?>[] f = Map.class.getTypeParameters();
        public static final TypeVariable<?>[] g = HashMap.class.getTypeParameters();
        public static final TypeVariable<?>[] h = LinkedHashMap.class.getTypeParameters();
    }

    static {
        String[] strArr = new String[0];
        c = strArr;
        JavaType[] javaTypeArr = new JavaType[0];
        d = javaTypeArr;
        q = new TypeBindings(strArr, javaTypeArr, (String[]) null);
    }

    public TypeBindings(String[] strArr, JavaType[] javaTypeArr, String[] strArr2) {
        strArr = strArr == null ? c : strArr;
        this.x = strArr;
        javaTypeArr = javaTypeArr == null ? d : javaTypeArr;
        this.y = javaTypeArr;
        if (strArr.length == javaTypeArr.length) {
            int length = javaTypeArr.length;
            int i = 1;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.y[i2].d;
            }
            this.Y1 = strArr2;
            this.Z1 = i;
            return;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Mismatching names (");
        P0.append(strArr.length);
        P0.append("), types (");
        throw new IllegalArgumentException(i0.d.a.a.a.u0(P0, javaTypeArr.length, ")"));
    }

    public static TypeBindings a(Class<?> cls, JavaType javaType) {
        TypeVariable<?>[] typeVariableArr;
        int i;
        TypeVariable<?>[] typeVariableArr2 = b.a;
        if (cls == Collection.class) {
            typeVariableArr = b.b;
        } else if (cls == List.class) {
            typeVariableArr = b.d;
        } else if (cls == ArrayList.class) {
            typeVariableArr = b.e;
        } else if (cls == AbstractList.class) {
            typeVariableArr = b.a;
        } else if (cls == Iterable.class) {
            typeVariableArr = b.c;
        } else {
            typeVariableArr = cls.getTypeParameters();
        }
        if (typeVariableArr == null) {
            i = 0;
        } else {
            i = typeVariableArr.length;
        }
        if (i == 1) {
            return new TypeBindings(new String[]{typeVariableArr[0].getName()}, new JavaType[]{javaType}, (String[]) null);
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Cannot create TypeBindings for class ");
        P0.append(cls.getName());
        P0.append(" with 1 type parameter: class expects ");
        P0.append(i);
        throw new IllegalArgumentException(P0.toString());
    }

    public static TypeBindings b(Class<?> cls, JavaType javaType, JavaType javaType2) {
        TypeVariable<?>[] typeVariableArr;
        int i;
        TypeVariable<?>[] typeVariableArr2 = b.a;
        if (cls == Map.class) {
            typeVariableArr = b.f;
        } else if (cls == HashMap.class) {
            typeVariableArr = b.g;
        } else if (cls == LinkedHashMap.class) {
            typeVariableArr = b.h;
        } else {
            typeVariableArr = cls.getTypeParameters();
        }
        if (typeVariableArr == null) {
            i = 0;
        } else {
            i = typeVariableArr.length;
        }
        if (i == 2) {
            return new TypeBindings(new String[]{typeVariableArr[0].getName(), typeVariableArr[1].getName()}, new JavaType[]{javaType, javaType2}, (String[]) null);
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Cannot create TypeBindings for class ");
        P0.append(cls.getName());
        P0.append(" with 2 type parameters: class expects ");
        P0.append(i);
        throw new IllegalArgumentException(P0.toString());
    }

    public static TypeBindings c(Class<?> cls, JavaType[] javaTypeArr) {
        String[] strArr;
        if (javaTypeArr == null) {
            javaTypeArr = d;
        } else {
            int length = javaTypeArr.length;
            if (length == 1) {
                return a(cls, javaTypeArr[0]);
            }
            if (length == 2) {
                return b(cls, javaTypeArr[0], javaTypeArr[1]);
            }
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            strArr = c;
        } else {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i = 0; i < length2; i++) {
                strArr[i] = typeParameters[i].getName();
            }
        }
        if (strArr.length == javaTypeArr.length) {
            return new TypeBindings(strArr, javaTypeArr, (String[]) null);
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Cannot create TypeBindings for class ");
        i0.d.a.a.a.p(cls, P0, " with ");
        P0.append(javaTypeArr.length);
        P0.append(" type parameter");
        P0.append(javaTypeArr.length == 1 ? "" : "s");
        P0.append(": class expects ");
        P0.append(strArr.length);
        throw new IllegalArgumentException(P0.toString());
    }

    public JavaType d(int i) {
        if (i < 0) {
            return null;
        }
        JavaType[] javaTypeArr = this.y;
        if (i >= javaTypeArr.length) {
            return null;
        }
        return javaTypeArr[i];
    }

    public List<JavaType> e() {
        JavaType[] javaTypeArr = this.y;
        if (javaTypeArr.length == 0) {
            return Collections.emptyList();
        }
        return Arrays.asList(javaTypeArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!f.u(obj, TypeBindings.class)) {
            return false;
        }
        int length = this.y.length;
        JavaType[] javaTypeArr = ((TypeBindings) obj).y;
        if (length != javaTypeArr.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!javaTypeArr[i].equals(this.y[i])) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return this.y.length == 0;
    }

    public int hashCode() {
        return this.Z1;
    }

    public String toString() {
        if (this.y.length == 0) {
            return "<>";
        }
        StringBuilder N0 = i0.d.a.a.a.N0('<');
        int length = this.y.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                N0.append(',');
            }
            JavaType javaType = this.y[i];
            StringBuilder sb = new StringBuilder(40);
            javaType.n(sb);
            N0.append(sb.toString());
        }
        N0.append('>');
        return N0.toString();
    }
}
