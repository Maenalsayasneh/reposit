package i0.b.b;

import i0.b.b.j;
import m0.n.b.i;

/* compiled from: MavericksMutabilityHelper.kt */
public final class z<S extends j> {
    public a<S> a;
    public final S b;

    /* compiled from: MavericksMutabilityHelper.kt */
    public static final class a<S extends j> {
        public final int a = hashCode();
        public final S b;

        public a(S s) {
            i.e(s, "state");
            this.b = s;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && i.a(this.b, ((a) obj).b);
            }
            return true;
        }

        public int hashCode() {
            S s = this.b;
            if (s != null) {
                return s.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("StateWrapper(state=");
            P0.append(this.b);
            P0.append(")");
            return P0.toString();
        }
    }

    public z(S s) {
        i.e(s, "initialState");
        this.b = s;
        this.a = new a<>(s);
    }
}
