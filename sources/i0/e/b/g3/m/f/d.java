package i0.e.b.g3.m.f;

import m0.n.b.f;
import m0.n.b.i;

/* compiled from: PagingDataEpoxyControllerExtensions.kt */
public abstract class d {

    /* compiled from: PagingDataEpoxyControllerExtensions.kt */
    public static final class a extends d {
        public static final a a = new a();

        public a() {
            super((f) null);
        }
    }

    /* compiled from: PagingDataEpoxyControllerExtensions.kt */
    public static final class b extends d {
        public final Throwable a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super((f) null);
            i.e(th, "error");
            this.a = th;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && i.a(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("LoadError(error=");
            P0.append(this.a);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: PagingDataEpoxyControllerExtensions.kt */
    public static final class c extends d {
        public static final c a = new c();

        public c() {
            super((f) null);
        }
    }

    /* renamed from: i0.e.b.g3.m.f.d$d  reason: collision with other inner class name */
    /* compiled from: PagingDataEpoxyControllerExtensions.kt */
    public static final class C0203d extends d {
        public static final C0203d a = new C0203d();

        public C0203d() {
            super((f) null);
        }
    }

    /* compiled from: PagingDataEpoxyControllerExtensions.kt */
    public static final class e extends d {
        public static final e a = new e();

        public e() {
            super((f) null);
        }
    }

    public d() {
    }

    public d(f fVar) {
    }
}
