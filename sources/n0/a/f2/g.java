package n0.a.f2;

import m0.n.b.f;
import m0.n.b.i;

/* compiled from: Channel.kt */
public final class g<T> {
    public static final b a = new b((f) null);
    public static final c b = new c();
    public final Object c;

    /* compiled from: Channel.kt */
    public static final class a extends c {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && i.a(this.a, ((a) obj).a);
        }

        public int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Closed(");
            P0.append(this.a);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: Channel.kt */
    public static final class b {
        public b(f fVar) {
        }
    }

    /* compiled from: Channel.kt */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ g(Object obj) {
        this.c = obj;
    }

    public static final Throwable a(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar == null) {
            return null;
        }
        return aVar.a;
    }

    public static final T b(Object obj) {
        if (!(obj instanceof c)) {
            return obj;
        }
        return null;
    }

    public boolean equals(Object obj) {
        Object obj2 = this.c;
        if ((obj instanceof g) && i.a(obj2, ((g) obj).c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.c;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        Object obj = this.c;
        if (obj instanceof a) {
            return obj.toString();
        }
        return "Value(" + obj + ')';
    }
}
