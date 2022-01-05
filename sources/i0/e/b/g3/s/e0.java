package i0.e.b.g3.s;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import kotlin.Pair;
import m0.n.b.i;

/* compiled from: RecentPaymentsViewModel.kt */
public final class e0 implements c {
    public final Pair<Integer, String> a;

    public e0(Pair<Integer, String> pair) {
        i.e(pair, MessageExtension.FIELD_DATA);
        this.a = pair;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && i.a(this.a, ((e0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("AcknowledgePayment(data=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
