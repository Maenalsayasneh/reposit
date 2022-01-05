package i0.e.b.g3.s;

import androidx.recyclerview.widget.RecyclerView;
import m0.n.b.f;

/* compiled from: SendDirectPaymentState.kt */
public abstract class j0 {
    public final int a;

    /* compiled from: SendDirectPaymentState.kt */
    public static final class a extends j0 {
        public static final a b = new a();

        public a() {
            super(500, (f) null);
        }
    }

    /* compiled from: SendDirectPaymentState.kt */
    public static final class b extends j0 {
        public final int b;

        public b(int i) {
            super(i, (f) null);
            this.b = i;
        }

        public int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public int hashCode() {
            return Integer.hashCode(this.b);
        }

        public String toString() {
            return i0.d.a.a.a.s0(i0.d.a.a.a.P0("Other(cents="), this.b, ')');
        }
    }

    /* compiled from: SendDirectPaymentState.kt */
    public static final class c extends j0 {
        public static final c b = new c();

        public c() {
            super(1000, (f) null);
        }
    }

    /* compiled from: SendDirectPaymentState.kt */
    public static final class d extends j0 {
        public static final d b = new d();

        public d() {
            super(RecyclerView.MAX_SCROLL_DURATION, (f) null);
        }
    }

    public j0(int i, f fVar) {
        this.a = i;
    }

    public final int a(double d2, double d3) {
        double b2 = ((d3 * ((double) 100)) + ((double) b())) / (((double) 1) - d2);
        if (!Double.isNaN(b2)) {
            int i = Integer.MAX_VALUE;
            if (b2 <= ((double) Integer.MAX_VALUE)) {
                i = b2 < ((double) Integer.MIN_VALUE) ? Integer.MIN_VALUE : (int) Math.round(b2);
            }
            return i - b();
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public int b() {
        return this.a;
    }
}
