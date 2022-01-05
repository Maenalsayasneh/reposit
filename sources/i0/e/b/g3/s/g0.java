package i0.e.b.g3.s;

import com.stripe.android.model.CardBrand;
import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: SendDirectPaymentState.kt */
public final class g0 {
    public final CardBrand a;
    public final String b;
    public final String c;

    public g0(CardBrand cardBrand, String str) {
        i.e(cardBrand, "cardBrand");
        i.e(str, "last4");
        this.a = cardBrand;
        this.b = str;
        this.c = cardBrand.getDisplayName() + ' ' + str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.a == g0Var.a && i.a(this.b, g0Var.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("CardLabel(cardBrand=");
        P0.append(this.a);
        P0.append(", last4=");
        return a.x0(P0, this.b, ')');
    }
}
