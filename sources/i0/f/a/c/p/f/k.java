package i0.f.a.c.p.f;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;
import i0.f.a.c.c;
import i0.f.a.c.n.i;
import i0.f.a.c.s.a;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: TypeNameIdResolver */
public class k extends j {
    public final MapperConfig<?> c;
    public final ConcurrentHashMap<String, String> d;
    public final Map<String, JavaType> e;
    public final boolean f;

    public k(MapperConfig<?> mapperConfig, JavaType javaType, ConcurrentHashMap<String, String> concurrentHashMap, HashMap<String, JavaType> hashMap) {
        super(javaType, mapperConfig.d.d);
        this.c = mapperConfig;
        this.d = concurrentHashMap;
        this.e = hashMap;
        this.f = mapperConfig.q(MapperFeature.ACCEPT_CASE_INSENSITIVE_VALUES);
    }

    public static String g(Class<?> cls) {
        String name = cls.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf < 0 ? name : name.substring(lastIndexOf + 1);
    }

    public String a(Object obj) {
        return h(obj.getClass());
    }

    public String b() {
        TreeSet treeSet = new TreeSet();
        for (Map.Entry next : this.e.entrySet()) {
            if (((JavaType) next.getValue()).F()) {
                treeSet.add(next.getKey());
            }
        }
        return treeSet.toString();
    }

    public JavaType d(c cVar, String str) {
        if (this.f) {
            str = str.toLowerCase();
        }
        return this.e.get(str);
    }

    public String e(Object obj, Class<?> cls) {
        if (obj == null) {
            return h(cls);
        }
        return h(obj.getClass());
    }

    public String h(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        String name = cls.getName();
        String str = this.d.get(name);
        if (str == null) {
            Class<?> cls2 = this.a.b((a) null, cls, TypeFactory.q).c;
            if (this.c.p()) {
                str = this.c.e().k0(((i) this.c.n(cls2)).f);
            }
            if (str == null) {
                str = g(cls2);
            }
            this.d.put(name, str);
        }
        return str;
    }

    public String toString() {
        return String.format("[%s; id-to-type=%s]", new Object[]{k.class.getName(), this.e});
    }
}
