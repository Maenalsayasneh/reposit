package i0.b.c;

import android.content.Context;
import android.view.View;
import i0.b.c.g.e;
import i0.b.c.h.c;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: StyleApplier.kt */
public abstract class b<P, V extends View> {
    public a a;
    public final P b;
    public final V c;

    /* compiled from: StyleApplier.kt */
    public interface a {
        void a(View view, e eVar, int[] iArr, int[] iArr2, c cVar);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [P, V, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(V r2) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            m0.n.b.i.e(r2, r0)
            r1.<init>()
            r1.b = r2
            r1.c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.b.c.b.<init>(android.view.View):void");
    }

    public void a(e eVar) {
        i.e(eVar, "style");
        if (eVar.b()) {
            b(eVar);
        }
        int[] c2 = c();
        if (c2 != null) {
            Context context = this.c.getContext();
            i.d(context, "view.context");
            c a2 = eVar.a(context, c2);
            e(eVar, a2);
            a aVar = this.a;
            if (aVar != null) {
                i.c(aVar);
                aVar.a(this.c, eVar, c2, (int[]) null, a2);
            } else {
                d(eVar, a2);
            }
            a2.n();
        }
    }

    public void b(e eVar) {
        i.e(eVar, "style");
    }

    public int[] c() {
        return null;
    }

    public void d(e eVar, c cVar) {
        i.e(eVar, "style");
        i.e(cVar, "a");
    }

    public void e(e eVar, c cVar) {
        i.e(eVar, "style");
        i.e(cVar, "a");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.airbnb.paris.StyleApplier<*, *>");
        b bVar = (b) obj;
        return !(i.a(this.b, bVar.b) ^ true) && !(i.a(this.c, bVar.c) ^ true);
    }

    public int hashCode() {
        P p = this.b;
        return this.c.hashCode() + ((p != null ? p.hashCode() : 0) * 31);
    }

    public b(i0.b.c.f.c<? extends P, ? extends V> cVar) {
        i.e(cVar, "proxy");
        P p = (i0.b.c.f.a) cVar;
        V v = p.a;
        this.b = p;
        this.c = v;
    }
}
