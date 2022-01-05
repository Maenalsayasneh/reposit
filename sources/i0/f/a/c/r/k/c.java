package i0.f.a.c.r.k;

import com.fasterxml.jackson.databind.JavaType;
import i0.f.a.c.g;
import i0.f.a.c.t.t;
import java.util.Map;

/* compiled from: ReadOnlyClassToSerializerMap */
public final class c {
    public final a[] a;
    public final int b;

    /* compiled from: ReadOnlyClassToSerializerMap */
    public static final class a {
        public final g<Object> a;
        public final a b;
        public final Class<?> c;
        public final JavaType d;
        public final boolean e;

        public a(a aVar, t tVar, g<Object> gVar) {
            this.b = aVar;
            this.a = gVar;
            this.e = tVar.d;
            this.c = tVar.b;
            this.d = tVar.c;
        }
    }

    public c(Map<t, g<Object>> map) {
        int size = map.size();
        int i = 8;
        while (i < (size <= 64 ? size + size : size + (size >> 2))) {
            i += i;
        }
        this.b = i - 1;
        a[] aVarArr = new a[i];
        for (Map.Entry next : map.entrySet()) {
            t tVar = (t) next.getKey();
            int i2 = tVar.a & this.b;
            aVarArr[i2] = new a(aVarArr[i2], tVar, (g) next.getValue());
        }
        this.a = aVarArr;
    }

    public g<Object> a(JavaType javaType) {
        boolean z;
        a aVar = this.a[(javaType.d - 1) & this.b];
        if (aVar == null) {
            return null;
        }
        if (!aVar.e && javaType.equals(aVar.d)) {
            return aVar.a;
        }
        do {
            aVar = aVar.b;
            if (aVar == null) {
                return null;
            }
            if (aVar.e || !javaType.equals(aVar.d)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
        } while (!z);
        return aVar.a;
    }

    public g<Object> b(Class<?> cls) {
        boolean z;
        a aVar = this.a[cls.getName().hashCode() & this.b];
        if (aVar == null) {
            return null;
        }
        if (aVar.c == cls && !aVar.e) {
            return aVar.a;
        }
        do {
            aVar = aVar.b;
            if (aVar == null) {
                return null;
            }
            if (aVar.c != cls || aVar.e) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
        } while (!z);
        return aVar.a;
    }
}
