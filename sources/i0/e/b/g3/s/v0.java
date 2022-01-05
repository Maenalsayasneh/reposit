package i0.e.b.g3.s;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.payments.AcknowledgePaymentArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: RecentPaymentsFragmentDirections.kt */
public final class v0 implements l {
    public final AcknowledgePaymentArgs a;

    public v0(AcknowledgePaymentArgs acknowledgePaymentArgs) {
        i.e(acknowledgePaymentArgs, "mavericksArg");
        this.a = acknowledgePaymentArgs;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(AcknowledgePaymentArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(AcknowledgePaymentArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(AcknowledgePaymentArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_recentPaymentsFragment_to_sayThanksDialog;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && i.a(this.a, ((v0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionRecentPaymentsFragmentToSayThanksDialog(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
