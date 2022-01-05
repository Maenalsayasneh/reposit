package i0.e.b.g3.s;

import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: SendDirectPaymentViewModel.kt */
public final class t0 implements b {
    public final String a;
    public final String b;

    public t0(String str, String str2) {
        i.e(str, "clientSecret");
        this.a = str;
        this.b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return i.a(this.a, t0Var.a) && i.a(this.b, t0Var.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder P0 = a.P0("PresentStripeNextAction(clientSecret=");
        P0.append(this.a);
        P0.append(", connectAccountId=");
        return a.w0(P0, this.b, ')');
    }
}
