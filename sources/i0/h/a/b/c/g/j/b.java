package i0.h.a.b.c.g.j;

import h0.b0.v;
import i0.h.a.b.c.g.a;
import i0.h.a.b.c.g.a.d;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class b<O extends a.d> {
    public final int a;
    public final a<O> b;
    public final O c;
    public final String d;

    public b(a<O> aVar, O o, String str) {
        this.b = aVar;
        this.c = o;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{aVar, o, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return v.c0(this.b, bVar.b) && v.c0(this.c, bVar.c) && v.c0(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
