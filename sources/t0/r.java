package t0;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import q0.d0;
import q0.v;
import q0.z;
import t0.c;

/* compiled from: ParameterHandler */
public abstract class r<T> {

    /* compiled from: ParameterHandler */
    public static final class a<T> extends r<T> {
        public final Method a;
        public final int b;
        public final h<T, d0> c;

        public a(Method method, int i, h<T, d0> hVar) {
            this.a = method;
            this.b = i;
            this.c = hVar;
        }

        public void a(t tVar, T t) {
            if (t != null) {
                try {
                    tVar.m = this.c.a(t);
                } catch (IOException e) {
                    Method method = this.a;
                    int i = this.b;
                    throw a0.m(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            } else {
                throw a0.l(this.a, this.b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class b<T> extends r<T> {
        public final String a;
        public final h<T, String> b;
        public final boolean c;

        public b(String str, h<T, String> hVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = hVar;
            this.c = z;
        }

        public void a(t tVar, T t) throws IOException {
            String a2;
            if (t != null && (a2 = this.b.a(t)) != null) {
                tVar.a(this.a, a2, this.c);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class c<T> extends r<Map<String, T>> {
        public final Method a;
        public final int b;
        public final boolean c;

        public c(Method method, int i, h<T, String> hVar, boolean z) {
            this.a = method;
            this.b = i;
            this.c = z;
        }

        public void a(t tVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                tVar.a(str, obj2, this.c);
                            } else {
                                Method method = this.a;
                                int i = this.b;
                                throw a0.l(method, i, "Field map value '" + value + "' converted to null by " + c.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw a0.l(this.a, this.b, i0.d.a.a.a.o0("Field map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw a0.l(this.a, this.b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw a0.l(this.a, this.b, "Field map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class d<T> extends r<T> {
        public final String a;
        public final h<T, String> b;

        public d(String str, h<T, String> hVar) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = hVar;
        }

        public void a(t tVar, T t) throws IOException {
            String a2;
            if (t != null && (a2 = this.b.a(t)) != null) {
                tVar.b(this.a, a2);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class e<T> extends r<Map<String, T>> {
        public final Method a;
        public final int b;

        public e(Method method, int i, h<T, String> hVar) {
            this.a = method;
            this.b = i;
        }

        public void a(t tVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            tVar.b(str, value.toString());
                        } else {
                            throw a0.l(this.a, this.b, i0.d.a.a.a.o0("Header map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw a0.l(this.a, this.b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw a0.l(this.a, this.b, "Header map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class f extends r<v> {
        public final Method a;
        public final int b;

        public f(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        public void a(t tVar, Object obj) throws IOException {
            v vVar = (v) obj;
            if (vVar != null) {
                v.a aVar = tVar.h;
                Objects.requireNonNull(aVar);
                m0.n.b.i.e(vVar, InstabugDbContract.NetworkLogEntry.COLUMN_HEADERS);
                int size = vVar.size();
                for (int i = 0; i < size; i++) {
                    aVar.c(vVar.c(i), vVar.k(i));
                }
                return;
            }
            throw a0.l(this.a, this.b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class g<T> extends r<T> {
        public final Method a;
        public final int b;
        public final v c;
        public final h<T, d0> d;

        public g(Method method, int i, v vVar, h<T, d0> hVar) {
            this.a = method;
            this.b = i;
            this.c = vVar;
            this.d = hVar;
        }

        public void a(t tVar, T t) {
            if (t != null) {
                try {
                    d0 a2 = this.d.a(t);
                    v vVar = this.c;
                    z.a aVar = tVar.k;
                    Objects.requireNonNull(aVar);
                    m0.n.b.i.e(a2, "body");
                    aVar.b(z.c.a(vVar, a2));
                } catch (IOException e) {
                    Method method = this.a;
                    int i = this.b;
                    throw a0.l(method, i, "Unable to convert " + t + " to RequestBody", e);
                }
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class h<T> extends r<Map<String, T>> {
        public final Method a;
        public final int b;
        public final h<T, d0> c;
        public final String d;

        public h(Method method, int i, h<T, d0> hVar, String str) {
            this.a = method;
            this.b = i;
            this.c = hVar;
            this.d = str;
        }

        public void a(t tVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            v c2 = v.c.c("Content-Disposition", i0.d.a.a.a.o0("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.d);
                            d0 a2 = this.c.a(value);
                            z.a aVar = tVar.k;
                            Objects.requireNonNull(aVar);
                            m0.n.b.i.e(a2, "body");
                            aVar.b(z.c.a(c2, a2));
                        } else {
                            throw a0.l(this.a, this.b, i0.d.a.a.a.o0("Part map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw a0.l(this.a, this.b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw a0.l(this.a, this.b, "Part map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class i<T> extends r<T> {
        public final Method a;
        public final int b;
        public final String c;
        public final h<T, String> d;
        public final boolean e;

        public i(Method method, int i, String str, h<T, String> hVar, boolean z) {
            this.a = method;
            this.b = i;
            Objects.requireNonNull(str, "name == null");
            this.c = str;
            this.d = hVar;
            this.e = z;
        }

        public void a(t tVar, T t) throws IOException {
            String str;
            int i;
            int i2;
            t tVar2 = tVar;
            T t2 = t;
            if (t2 != null) {
                String str2 = this.c;
                String a2 = this.d.a(t2);
                boolean z = this.e;
                if (tVar2.e != null) {
                    int length = a2.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            str = a2;
                            break;
                        }
                        int codePointAt = a2.codePointAt(i3);
                        i = 47;
                        i2 = -1;
                        if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                            r0.f fVar = new r0.f();
                            fVar.Y(a2, 0, i3);
                            r0.f fVar2 = null;
                        } else {
                            i3 += Character.charCount(codePointAt);
                        }
                    }
                    r0.f fVar3 = new r0.f();
                    fVar3.Y(a2, 0, i3);
                    r0.f fVar22 = null;
                    while (i3 < length) {
                        int codePointAt2 = a2.codePointAt(i3);
                        if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 < 32 || codePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != i2 || (!z && (codePointAt2 == i || codePointAt2 == 37))) {
                                if (fVar22 == null) {
                                    fVar22 = new r0.f();
                                }
                                fVar22.Z(codePointAt2);
                                while (!fVar22.t()) {
                                    byte readByte = fVar22.readByte() & 255;
                                    fVar3.I(37);
                                    char[] cArr = t.a;
                                    fVar3.I(cArr[(readByte >> 4) & 15]);
                                    fVar3.I(cArr[readByte & 15]);
                                }
                            } else {
                                fVar3.Z(codePointAt2);
                            }
                        }
                        i3 += Character.charCount(codePointAt2);
                        i = 47;
                        i2 = -1;
                    }
                    str = fVar3.w();
                    String replace = tVar2.e.replace("{" + str2 + "}", str);
                    if (!t.b.matcher(replace).matches()) {
                        tVar2.e = replace;
                        return;
                    }
                    throw new IllegalArgumentException(i0.d.a.a.a.n0("@Path parameters shouldn't perform path traversal ('.' or '..'): ", a2));
                }
                throw new AssertionError();
            }
            throw a0.l(this.a, this.b, i0.d.a.a.a.y0(i0.d.a.a.a.P0("Path parameter \""), this.c, "\" value must not be null."), new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class j<T> extends r<T> {
        public final String a;
        public final h<T, String> b;
        public final boolean c;

        public j(String str, h<T, String> hVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = hVar;
            this.c = z;
        }

        public void a(t tVar, T t) throws IOException {
            String a2;
            if (t != null && (a2 = this.b.a(t)) != null) {
                tVar.c(this.a, a2, this.c);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class k<T> extends r<Map<String, T>> {
        public final Method a;
        public final int b;
        public final boolean c;

        public k(Method method, int i, h<T, String> hVar, boolean z) {
            this.a = method;
            this.b = i;
            this.c = z;
        }

        public void a(t tVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                tVar.c(str, obj2, this.c);
                            } else {
                                Method method = this.a;
                                int i = this.b;
                                throw a0.l(method, i, "Query map value '" + value + "' converted to null by " + c.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw a0.l(this.a, this.b, i0.d.a.a.a.o0("Query map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw a0.l(this.a, this.b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw a0.l(this.a, this.b, "Query map was null", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class l<T> extends r<T> {
        public final boolean a;

        public l(h<T, String> hVar, boolean z) {
            this.a = z;
        }

        public void a(t tVar, T t) throws IOException {
            if (t != null) {
                tVar.c(t.toString(), (String) null, this.a);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class m extends r<z.c> {
        public static final m a = new m();

        public void a(t tVar, Object obj) throws IOException {
            z.c cVar = (z.c) obj;
            if (cVar != null) {
                tVar.k.b(cVar);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class n extends r<Object> {
        public final Method a;
        public final int b;

        public n(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        public void a(t tVar, Object obj) {
            if (obj != null) {
                Objects.requireNonNull(tVar);
                tVar.e = obj.toString();
                return;
            }
            throw a0.l(this.a, this.b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class o<T> extends r<T> {
        public final Class<T> a;

        public o(Class<T> cls) {
            this.a = cls;
        }

        public void a(t tVar, T t) {
            tVar.g.g(this.a, t);
        }
    }

    public abstract void a(t tVar, T t) throws IOException;
}
