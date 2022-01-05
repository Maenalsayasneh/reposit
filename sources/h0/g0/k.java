package h0.g0;

import android.annotation.SuppressLint;

/* compiled from: Operation */
public interface k {
    @SuppressLint({"SyntheticAccessor"})
    public static final b.c a = new b.c((a) null);
    @SuppressLint({"SyntheticAccessor"})
    public static final b.C0038b b = new b.C0038b((a) null);

    /* compiled from: Operation */
    public static abstract class b {

        /* compiled from: Operation */
        public static final class a extends b {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.a.getMessage()});
            }
        }

        /* renamed from: h0.g0.k$b$b  reason: collision with other inner class name */
        /* compiled from: Operation */
        public static final class C0038b extends b {
            public C0038b(a aVar) {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* compiled from: Operation */
        public static final class c extends b {
            public c() {
            }

            public String toString() {
                return "SUCCESS";
            }

            public c(a aVar) {
            }
        }
    }
}
