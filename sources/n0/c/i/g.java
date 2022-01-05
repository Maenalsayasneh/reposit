package n0.c.i;

import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;

/* compiled from: SerialKinds.kt */
public abstract class g {

    /* compiled from: SerialKinds.kt */
    public static final class a extends g {
        public static final a a = new a();

        public a() {
            super((f) null);
        }
    }

    /* compiled from: SerialKinds.kt */
    public static final class b extends g {
        public static final b a = new b();

        public b() {
            super((f) null);
        }
    }

    public g(f fVar) {
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        String e = m.a(getClass()).e();
        i.c(e);
        return e;
    }
}
