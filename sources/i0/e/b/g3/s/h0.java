package i0.e.b.g3.s;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: SendDirectPaymentViewModel.kt */
public final class h0 implements c {
    public final j0 a;

    public h0(j0 j0Var) {
        i.e(j0Var, "amount");
        this.a = j0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && i.a(this.a, ((h0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ChoosePaymentAmount(amount=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
