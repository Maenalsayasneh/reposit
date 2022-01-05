package i0.f.a.c.n;

import i0.f.a.c.t.a;
import java.lang.annotation.Annotation;
import java.util.HashMap;

/* compiled from: AnnotationMap */
public final class h implements a {
    public HashMap<Class<?>, Annotation> c;

    public h() {
    }

    public static h c(h hVar, h hVar2) {
        HashMap<Class<?>, Annotation> hashMap;
        HashMap<Class<?>, Annotation> hashMap2;
        if (hVar == null || (hashMap = hVar.c) == null || hashMap.isEmpty()) {
            return hVar2;
        }
        if (hVar2 == null || (hashMap2 = hVar2.c) == null || hashMap2.isEmpty()) {
            return hVar;
        }
        HashMap hashMap3 = new HashMap();
        for (Annotation next : hVar2.c.values()) {
            hashMap3.put(next.annotationType(), next);
        }
        for (Annotation next2 : hVar.c.values()) {
            hashMap3.put(next2.annotationType(), next2);
        }
        return new h(hashMap3);
    }

    public <A extends Annotation> A a(Class<A> cls) {
        HashMap<Class<?>, Annotation> hashMap = this.c;
        if (hashMap == null) {
            return null;
        }
        return (Annotation) hashMap.get(cls);
    }

    public boolean b(Class<? extends Annotation>[] clsArr) {
        if (this.c != null) {
            for (Class<? extends Annotation> containsKey : clsArr) {
                if (this.c.containsKey(containsKey)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int size() {
        HashMap<Class<?>, Annotation> hashMap = this.c;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.size();
    }

    public String toString() {
        HashMap<Class<?>, Annotation> hashMap = this.c;
        if (hashMap == null) {
            return "[null]";
        }
        return hashMap.toString();
    }

    public h(HashMap<Class<?>, Annotation> hashMap) {
        this.c = hashMap;
    }
}
