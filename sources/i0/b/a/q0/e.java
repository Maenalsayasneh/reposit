package i0.b.a.q0;

import android.content.Context;
import i0.b.a.d;
import i0.b.a.t;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m0.i;
import m0.n.a.p;

/* compiled from: PreloadableViewDataProvider.kt */
public final class e {
    public final Map<a, List<f<?>>> a = new LinkedHashMap();
    public final d b;
    public final p<Context, RuntimeException, i> c;

    /* compiled from: PreloadableViewDataProvider.kt */
    public static final class a {
        public final Class<? extends t<?>> a;
        public final int b;
        public final int c;
        public final Object d = null;

        public a(Class<? extends t<?>> cls, int i, int i2, Object obj) {
            m0.n.b.i.e(cls, "epoxyModelClass");
            this.a = cls;
            this.b = i;
            this.c = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m0.n.b.i.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && m0.n.b.i.a(this.d, aVar.d);
        }

        public int hashCode() {
            Class<? extends t<?>> cls = this.a;
            int i = 0;
            int hashCode = (((((cls != null ? cls.hashCode() : 0) * 31) + this.b) * 31) + this.c) * 31;
            Object obj = this.d;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("CacheKey(epoxyModelClass=");
            P0.append(this.a);
            P0.append(", spanSize=");
            P0.append(this.b);
            P0.append(", viewType=");
            P0.append(this.c);
            P0.append(", signature=");
            P0.append(this.d);
            P0.append(")");
            return P0.toString();
        }
    }

    public e(d dVar, p<? super Context, ? super RuntimeException, i> pVar) {
        m0.n.b.i.e(dVar, "adapter");
        m0.n.b.i.e(pVar, "errorHandler");
        this.b = dVar;
        this.c = pVar;
    }

    public final <T extends t<?>> a a(a<T, ?, ?> aVar, T t, int i) {
        d dVar = this.b;
        int i2 = dVar.a;
        int i3 = 1;
        if (i2 > 1) {
            i3 = t.p(i2, i, dVar.getItemCount());
        }
        Class<?> cls = t.getClass();
        m0.n.b.i.e(t, "$this$viewTypeInternal");
        int q = t.q();
        Objects.requireNonNull(aVar);
        m0.n.b.i.e(t, "epoxyModel");
        return new a(cls, i3, q, (Object) null);
    }
}
