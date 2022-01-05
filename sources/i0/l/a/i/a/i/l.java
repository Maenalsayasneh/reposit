package i0.l.a.i.a.i;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: JsonWriter */
public class l {
    public static final n<i0.l.a.i.a.d> a = new a();
    public static final n<i0.l.a.i.a.d> b = new b();
    public static final n<i0.l.a.i.a.b> c = new c();
    public static final n<i0.l.a.i.a.a> d = new d();
    public static final n<Iterable<? extends Object>> e = new e();
    public static final n<Enum<?>> f = new f();
    public static final n<Map<String, ? extends Object>> g = new g();
    public static final n<Object> h = new b();
    public static final n<Object> i = new a();
    public static final n<Object> j = new h();
    public ConcurrentHashMap<Class<?>, n<?>> k = new ConcurrentHashMap<>();
    public LinkedList<i> l = new LinkedList<>();

    /* compiled from: JsonWriter */
    public class a implements n<i0.l.a.i.a.d> {
        public void a(Object obj, Appendable appendable, i0.l.a.i.a.e eVar) throws IOException {
            ((i0.l.a.i.a.d) obj).b(appendable);
        }
    }

    /* compiled from: JsonWriter */
    public class b implements n<i0.l.a.i.a.d> {
        public void a(Object obj, Appendable appendable, i0.l.a.i.a.e eVar) throws IOException {
            ((i0.l.a.i.a.d) obj).v(appendable, eVar);
        }
    }

    /* compiled from: JsonWriter */
    public class c implements n<i0.l.a.i.a.b> {
        public void a(Object obj, Appendable appendable, i0.l.a.i.a.e eVar) throws IOException {
            appendable.append(((i0.l.a.i.a.b) obj).c(eVar));
        }
    }

    /* compiled from: JsonWriter */
    public class d implements n<i0.l.a.i.a.a> {
        public void a(Object obj, Appendable appendable, i0.l.a.i.a.e eVar) throws IOException {
            appendable.append(((i0.l.a.i.a.a) obj).toJSONString());
        }
    }

    /* compiled from: JsonWriter */
    public class e implements n<Iterable<? extends Object>> {
        public void a(Object obj, Appendable appendable, i0.l.a.i.a.e eVar) throws IOException {
            Objects.requireNonNull(eVar);
            appendable.append('[');
            boolean z = true;
            for (Object next : (Iterable) obj) {
                if (z) {
                    z = false;
                } else {
                    appendable.append(',');
                }
                if (next == null) {
                    appendable.append("null");
                } else {
                    i0.l.a.i.a.f.b(next, appendable, eVar);
                }
            }
            appendable.append(']');
        }
    }

    /* compiled from: JsonWriter */
    public class f implements n<Enum<?>> {
        public void a(Object obj, Appendable appendable, i0.l.a.i.a.e eVar) throws IOException {
            eVar.a(appendable, ((Enum) obj).name());
        }
    }

    /* compiled from: JsonWriter */
    public class g implements n<Map<String, ? extends Object>> {
        public void a(Object obj, Appendable appendable, i0.l.a.i.a.e eVar) throws IOException {
            Objects.requireNonNull(eVar);
            appendable.append('{');
            boolean z = true;
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object value = entry.getValue();
                if (value != null || !eVar.e) {
                    if (z) {
                        z = false;
                    } else {
                        appendable.append(',');
                    }
                    l.b(entry.getKey().toString(), value, appendable, eVar);
                }
            }
            appendable.append('}');
        }
    }

    /* compiled from: JsonWriter */
    public class h implements n<Object> {
        public void a(Object obj, Appendable appendable, i0.l.a.i.a.e eVar) throws IOException {
            appendable.append(obj.toString());
        }
    }

    /* compiled from: JsonWriter */
    public static class i {
        public Class<?> a;
        public n<?> b;

        public i(Class<?> cls, n<?> nVar) {
            this.a = cls;
            this.b = nVar;
        }
    }

    public l() {
        a(new m(this), String.class);
        a(new c(this), Double.class);
        a(new d(this), Date.class);
        a(new e(this), Float.class);
        n<Object> nVar = j;
        a(nVar, Integer.class, Long.class, Byte.class, Short.class, BigInteger.class, BigDecimal.class);
        a(nVar, Boolean.class);
        a(new f(this), int[].class);
        a(new g(this), short[].class);
        a(new h(this), long[].class);
        a(new i(this), float[].class);
        a(new j(this), double[].class);
        a(new k(this), boolean[].class);
        this.l.addLast(new i(i0.l.a.i.a.d.class, b));
        this.l.addLast(new i(i0.l.a.i.a.c.class, a));
        this.l.addLast(new i(i0.l.a.i.a.b.class, c));
        this.l.addLast(new i(i0.l.a.i.a.a.class, d));
        this.l.addLast(new i(Map.class, g));
        this.l.addLast(new i(Iterable.class, e));
        this.l.addLast(new i(Enum.class, f));
        this.l.addLast(new i(Number.class, nVar));
    }

    public static void b(String str, Object obj, Appendable appendable, i0.l.a.i.a.e eVar) throws IOException {
        if (str == null) {
            appendable.append("null");
        } else if (!eVar.f.a(str)) {
            appendable.append(str);
        } else {
            appendable.append('\"');
            i0.l.a.i.a.f.a(str, appendable, eVar);
            appendable.append('\"');
        }
        appendable.append(':');
        if (obj instanceof String) {
            eVar.a(appendable, (String) obj);
        } else {
            i0.l.a.i.a.f.b(obj, appendable, eVar);
        }
    }

    public <T> void a(n<T> nVar, Class<?>... clsArr) {
        for (Class<?> put : clsArr) {
            this.k.put(put, nVar);
        }
    }
}
