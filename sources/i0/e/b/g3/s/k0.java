package i0.e.b.g3.s;

import m0.n.b.f;
import m0.n.b.i;

/* compiled from: SendDirectPaymentState.kt */
public abstract class k0 {

    /* compiled from: SendDirectPaymentState.kt */
    public static final class a extends k0 {
        public final j0 a;
        public final String b;
        public final g0 c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var, String str, g0 g0Var) {
            super((f) null);
            i.e(j0Var, "amount");
            i.e(str, "paymentId");
            i.e(g0Var, "paymentLabel");
            this.a = j0Var;
            this.b = str;
            this.c = g0Var;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.a, aVar.a) && i.a(this.b, aVar.b) && i.a(this.c, aVar.c);
        }

        public int hashCode() {
            return this.c.hashCode() + i0.d.a.a.a.F(this.b, this.a.hashCode() * 31, 31);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Confirm(amount=");
            P0.append(this.a);
            P0.append(", paymentId=");
            P0.append(this.b);
            P0.append(", paymentLabel=");
            P0.append(this.c);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: SendDirectPaymentState.kt */
    public static final class b extends k0 {
        public static final b a = new b();

        public b() {
            super((f) null);
        }
    }

    /* compiled from: SendDirectPaymentState.kt */
    public static final class c extends k0 {
        public static final c a = new c();

        public c() {
            super((f) null);
        }
    }

    /* compiled from: SendDirectPaymentState.kt */
    public static final class d extends k0 {
        public static final d a = new d();

        public d() {
            super((f) null);
        }
    }

    public k0(f fVar) {
    }
}
