package i0.f.a.c.l.m;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import i0.f.a.c.t.g;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: JavaUtilCollectionsDeserializers */
public abstract class e {
    public static final Class<?> a = Arrays.asList(new Object[]{null, null}).getClass();
    public static final Class<?> b;
    public static final Class<?> c;
    public static final Class<?> d;
    public static final Class<?> e;
    public static final Class<?> f;
    public static final Class<?> g = Collections.unmodifiableList(new LinkedList()).getClass();
    public static final Class<?> h;

    /* compiled from: JavaUtilCollectionsDeserializers */
    public static class a implements g<Object, Object> {
        public final JavaType a;
        public final int b;

        public a(int i, JavaType javaType) {
            this.a = javaType;
            this.b = i;
        }

        public Object a(Object obj) {
            if (obj == null) {
                return null;
            }
            switch (this.b) {
                case 1:
                    Set set = (Set) obj;
                    d(set.size());
                    return Collections.singleton(set.iterator().next());
                case 2:
                    List list = (List) obj;
                    d(list.size());
                    return Collections.singletonList(list.get(0));
                case 3:
                    Map map = (Map) obj;
                    d(map.size());
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    return Collections.singletonMap(entry.getKey(), entry.getValue());
                case 4:
                    return Collections.unmodifiableSet((Set) obj);
                case 5:
                    return Collections.unmodifiableList((List) obj);
                case 6:
                    return Collections.unmodifiableMap((Map) obj);
                case 7:
                    return Collections.synchronizedSet((Set) obj);
                case 8:
                    return Collections.synchronizedCollection((Collection) obj);
                case 9:
                    return Collections.synchronizedList((List) obj);
                case 10:
                    return Collections.synchronizedMap((Map) obj);
                default:
                    return obj;
            }
        }

        public JavaType b(TypeFactory typeFactory) {
            return this.a;
        }

        public JavaType c(TypeFactory typeFactory) {
            return this.a;
        }

        public final void d(int i) {
            if (i != 1) {
                throw new IllegalArgumentException(i0.d.a.a.a.g0("Can not deserialize Singleton container from ", i, " entries"));
            }
        }
    }

    static {
        Boolean bool = Boolean.TRUE;
        Set singleton = Collections.singleton(bool);
        b = singleton.getClass();
        e = Collections.unmodifiableSet(singleton).getClass();
        List singletonList = Collections.singletonList(bool);
        c = singletonList.getClass();
        f = Collections.unmodifiableList(singletonList).getClass();
        Map singletonMap = Collections.singletonMap("a", "b");
        d = singletonMap.getClass();
        h = Collections.unmodifiableMap(singletonMap).getClass();
    }

    public static String a(Class<?> cls) {
        String str;
        String name = cls.getName();
        if (name.startsWith("java.util.Collections$")) {
            str = name.substring(22);
        } else {
            str = "";
        }
        if (str == null || !str.startsWith("Synchronized")) {
            return "";
        }
        return str.substring(12);
    }
}
