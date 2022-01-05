package i0.h.c.m.h;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import i0.h.c.m.c;
import i0.h.c.m.d;
import i0.h.c.m.e;
import i0.h.c.m.g;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* compiled from: JsonValueObjectEncoderContext */
public final class f implements e, g {
    public boolean a = true;
    public final JsonWriter b;
    public final Map<Class<?>, d<?>> c;
    public final Map<Class<?>, i0.h.c.m.f<?>> d;
    public final d<Object> e;
    public final boolean f;

    public f(Writer writer, Map<Class<?>, d<?>> map, Map<Class<?>, i0.h.c.m.f<?>> map2, d<Object> dVar, boolean z) {
        this.b = new JsonWriter(writer);
        this.c = map;
        this.d = map2;
        this.e = dVar;
        this.f = z;
    }

    public e a(c cVar, long j) throws IOException {
        String str = cVar.a;
        i();
        this.b.name(str);
        i();
        this.b.value(j);
        return this;
    }

    public e b(String str, int i) throws IOException {
        i();
        this.b.name(str);
        i();
        this.b.value((long) i);
        return this;
    }

    public g c(String str) throws IOException {
        i();
        this.b.value(str);
        return this;
    }

    public g d(boolean z) throws IOException {
        i();
        this.b.value(z);
        return this;
    }

    public e f(c cVar, Object obj) throws IOException {
        return e(cVar.a, obj);
    }

    public f g(Object obj, boolean z) throws IOException {
        Class<?> cls;
        int i = 0;
        if (z) {
            if (obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number)) {
                Object[] objArr = new Object[1];
                if (obj == null) {
                    cls = null;
                } else {
                    cls = obj.getClass();
                }
                objArr[0] = cls;
                throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
            }
        }
        if (obj == null) {
            this.b.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.b.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                i();
                this.b.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            this.b.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    this.b.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    long j = jArr[i];
                    i();
                    this.b.value(j);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.b.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.b.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number g : (Number[]) obj) {
                    g(g, false);
                }
            } else {
                for (Object g2 : (Object[]) obj) {
                    g(g2, false);
                }
            }
            this.b.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.b.beginArray();
            for (Object g3 : (Collection) obj) {
                g(g3, false);
            }
            this.b.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.b.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    e((String) key, entry.getValue());
                } catch (ClassCastException e2) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e2);
                }
            }
            this.b.endObject();
            return this;
        } else {
            d dVar = this.c.get(obj.getClass());
            if (dVar != null) {
                if (!z) {
                    this.b.beginObject();
                }
                dVar.a(obj, this);
                if (!z) {
                    this.b.endObject();
                }
                return this;
            }
            i0.h.c.m.f fVar = this.d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                i();
                this.b.value(name);
                return this;
            } else {
                d<Object> dVar2 = this.e;
                if (!z) {
                    this.b.beginObject();
                }
                dVar2.a(obj, this);
                if (!z) {
                    this.b.endObject();
                }
                return this;
            }
        }
    }

    /* renamed from: h */
    public f e(String str, Object obj) throws IOException {
        if (!this.f) {
            i();
            this.b.name(str);
            if (obj != null) {
                return g(obj, false);
            }
            this.b.nullValue();
            return this;
        } else if (obj == null) {
            return this;
        } else {
            i();
            this.b.name(str);
            return g(obj, false);
        }
    }

    public final void i() throws IOException {
        if (!this.a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
