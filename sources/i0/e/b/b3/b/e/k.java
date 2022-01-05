package i0.e.b.b3.b.e;

import com.clubhouse.android.data.models.local.payment.RecentPayment;
import i0.d.a.a.a;
import java.util.Map;
import m0.n.b.i;

/* compiled from: PagingItem.kt */
public final class k extends j {
    public final RecentPayment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(RecentPayment recentPayment) {
        super((Map) null, 1);
        i.e(recentPayment, "recentPayment");
        this.b = recentPayment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && i.a(this.b, ((k) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("RecentPaymentItem(recentPayment=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }
}
