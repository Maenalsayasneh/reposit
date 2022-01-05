package i0.h.a.b.c.g.j;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.Feature;
import h0.b0.v;
import i0.h.a.b.c.g.a;
import i0.h.a.b.c.g.a.b;
import i0.h.a.b.m.h;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public abstract class n<A extends a.b, ResultT> {
    public final Feature[] a;
    public final boolean b;
    public final int c;

    /* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
    public static class a<A extends a.b, ResultT> {
        public l<A, h<ResultT>> a;
        public boolean b = true;
        public Feature[] c;
        public int d = 0;

        public a(h0 h0Var) {
        }

        @RecentlyNonNull
        public n<A, ResultT> a() {
            v.u(this.a != null, "execute parameter required");
            return new i0(this, this.c, this.b, this.d);
        }
    }

    public n(@RecentlyNonNull Feature[] featureArr, boolean z, int i) {
        this.a = featureArr;
        this.b = featureArr != null && z;
        this.c = i;
    }

    @RecentlyNonNull
    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>((h0) null);
    }
}
