package i0.e.b.g3.s;

import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.ui.payments.SendDirectPaymentArgs;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import i0.b.b.j;
import i0.d.a.a.a;
import i0.e.b.g3.s.k0;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: SendDirectPaymentState.kt */
public final class b1 implements j {
    public final UserProfile a;
    public final String b;
    public final k0 c;
    public final j0 d;
    public final PaymentMethod e;

    public b1(UserProfile userProfile, String str, k0 k0Var, j0 j0Var, PaymentMethod paymentMethod) {
        i.e(userProfile, "recipient");
        i.e(k0Var, "paymentStep");
        this.a = userProfile;
        this.b = str;
        this.c = k0Var;
        this.d = j0Var;
        this.e = paymentMethod;
    }

    public static b1 copy$default(b1 b1Var, UserProfile userProfile, String str, k0 k0Var, j0 j0Var, PaymentMethod paymentMethod, int i, Object obj) {
        if ((i & 1) != 0) {
            userProfile = b1Var.a;
        }
        if ((i & 2) != 0) {
            str = b1Var.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            k0Var = b1Var.c;
        }
        k0 k0Var2 = k0Var;
        if ((i & 8) != 0) {
            j0Var = b1Var.d;
        }
        j0 j0Var2 = j0Var;
        if ((i & 16) != 0) {
            paymentMethod = b1Var.e;
        }
        PaymentMethod paymentMethod2 = paymentMethod;
        Objects.requireNonNull(b1Var);
        i.e(userProfile, "recipient");
        i.e(k0Var2, "paymentStep");
        return new b1(userProfile, str2, k0Var2, j0Var2, paymentMethod2);
    }

    public final g0 a() {
        String str;
        PaymentMethod paymentMethod = this.e;
        String str2 = "";
        if (paymentMethod == null) {
            return new g0(CardBrand.Unknown, str2);
        }
        PaymentMethod.Card card = paymentMethod.card;
        CardBrand cardBrand = card == null ? null : card.brand;
        if (cardBrand == null) {
            cardBrand = CardBrand.Unknown;
        }
        if (!(card == null || (str = card.last4) == null)) {
            str2 = str;
        }
        return new g0(cardBrand, str2);
    }

    public final UserProfile component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final k0 component3() {
        return this.c;
    }

    public final j0 component4() {
        return this.d;
    }

    public final PaymentMethod component5() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return i.a(this.a, b1Var.a) && i.a(this.b, b1Var.b) && i.a(this.c, b1Var.c) && i.a(this.d, b1Var.d) && i.a(this.e, b1Var.e);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i = 0;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        j0 j0Var = this.d;
        int hashCode3 = (hashCode2 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        PaymentMethod paymentMethod = this.e;
        if (paymentMethod != null) {
            i = paymentMethod.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("SendDirectPaymentState(recipient=");
        P0.append(this.a);
        P0.append(", channel=");
        P0.append(this.b);
        P0.append(", paymentStep=");
        P0.append(this.c);
        P0.append(", selectedPaymentAmount=");
        P0.append(this.d);
        P0.append(", paymentMethod=");
        P0.append(this.e);
        P0.append(')');
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(UserProfile userProfile, String str, k0 k0Var, j0 j0Var, PaymentMethod paymentMethod, int i, f fVar) {
        this(userProfile, (i & 2) != 0 ? null : str, (i & 4) != 0 ? k0.d.a : k0Var, (i & 8) != 0 ? null : j0Var, (i & 16) != 0 ? null : paymentMethod);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b1(SendDirectPaymentArgs sendDirectPaymentArgs) {
        this(sendDirectPaymentArgs.c, sendDirectPaymentArgs.d, (k0) null, (j0) null, (PaymentMethod) null, 28, (f) null);
        i.e(sendDirectPaymentArgs, "args");
    }
}
