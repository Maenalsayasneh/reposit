package i0.e.b.g3.s;

import com.stripe.android.model.PaymentMethod;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: SendDirectPaymentViewModel.kt */
public final class c1 implements c {
    public final PaymentMethod a;

    public c1(PaymentMethod paymentMethod) {
        i.e(paymentMethod, "method");
        this.a = paymentMethod;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && i.a(this.a, ((c1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("SetSavedPaymentMethod(method=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
