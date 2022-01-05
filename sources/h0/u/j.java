package h0.u;

import m0.n.b.f;
import m0.n.b.i;

/* compiled from: LoadState.kt */
public abstract class j {
    public final boolean a;

    /* compiled from: LoadState.kt */
    public static final class a extends j {
        public final Throwable b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(false, (f) null);
            i.e(th, "error");
            this.b = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.a == aVar.a && i.a(this.b, aVar.b);
            }
        }

        public int hashCode() {
            return this.b.hashCode() + Boolean.hashCode(this.a);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Error(endOfPaginationReached=");
            P0.append(this.a);
            P0.append(", error=");
            P0.append(this.b);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: LoadState.kt */
    public static final class b extends j {
        public static final b b = new b();

        public b() {
            super(false, (f) null);
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public String toString() {
            return i0.d.a.a.a.C0(i0.d.a.a.a.P0("Loading(endOfPaginationReached="), this.a, ')');
        }
    }

    /* compiled from: LoadState.kt */
    public static final class c extends j {
        public static final c b = new c(true);
        public static final c c = new c(false);
        public static final a d = new a((f) null);

        /* compiled from: LoadState.kt */
        public static final class a {
            public a(f fVar) {
            }
        }

        public c(boolean z) {
            super(z, (f) null);
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public String toString() {
            return i0.d.a.a.a.C0(i0.d.a.a.a.P0("NotLoading(endOfPaginationReached="), this.a, ')');
        }
    }

    public j(boolean z, f fVar) {
        this.a = z;
    }
}
