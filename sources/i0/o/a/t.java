package i0.o.a;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Request */
public final class t {
    public static final long a = TimeUnit.SECONDS.toNanos(5);
    public int b;
    public long c;
    public final Uri d;
    public final int e;
    public final List<z> f;
    public final int g;
    public final int h;
    public final boolean i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final float m;
    public final float n;
    public final float o;
    public final boolean p;
    public final boolean q;
    public final Bitmap.Config r;
    public final Picasso.Priority s;

    /* compiled from: Request */
    public static final class b {
        public Uri a;
        public int b;
        public int c;
        public int d;
        public List<z> e;
        public Bitmap.Config f;
        public Picasso.Priority g;

        public b(Uri uri, int i, Bitmap.Config config) {
            this.a = uri;
            this.b = i;
            this.f = config;
        }

        public b a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.c = i;
                this.d = i2;
                return this;
            }
        }
    }

    public t(Uri uri, int i2, String str, List list, int i3, int i4, boolean z, boolean z2, int i5, boolean z3, float f2, float f3, float f4, boolean z4, boolean z5, Bitmap.Config config, Picasso.Priority priority, a aVar) {
        this.d = uri;
        this.e = i2;
        if (list == null) {
            this.f = null;
        } else {
            this.f = Collections.unmodifiableList(list);
        }
        this.g = i3;
        this.h = i4;
        this.i = z;
        this.k = z2;
        this.j = i5;
        this.l = z3;
        this.m = f2;
        this.n = f3;
        this.o = f4;
        this.p = z4;
        this.q = z5;
        this.r = config;
        this.s = priority;
    }

    public boolean a() {
        return (this.g == 0 && this.h == 0) ? false : true;
    }

    public String b() {
        long nanoTime = System.nanoTime() - this.c;
        if (nanoTime > a) {
            return d() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return d() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    public boolean c() {
        return a() || this.m != 0.0f;
    }

    public String d() {
        return i0.d.a.a.a.s0(i0.d.a.a.a.P0("[R"), this.b, ']');
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i2 = this.e;
        if (i2 > 0) {
            sb.append(i2);
        } else {
            sb.append(this.d);
        }
        List<z> list = this.f;
        if (list != null && !list.isEmpty()) {
            for (z b2 : this.f) {
                sb.append(' ');
                sb.append(b2.b());
            }
        }
        if (this.g > 0) {
            sb.append(" resize(");
            sb.append(this.g);
            sb.append(',');
            sb.append(this.h);
            sb.append(')');
        }
        if (this.i) {
            sb.append(" centerCrop");
        }
        if (this.k) {
            sb.append(" centerInside");
        }
        if (this.m != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.m);
            if (this.p) {
                sb.append(" @ ");
                sb.append(this.n);
                sb.append(',');
                sb.append(this.o);
            }
            sb.append(')');
        }
        if (this.q) {
            sb.append(" purgeable");
        }
        if (this.r != null) {
            sb.append(' ');
            sb.append(this.r);
        }
        sb.append('}');
        return sb.toString();
    }
}
