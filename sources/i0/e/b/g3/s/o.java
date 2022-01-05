package i0.e.b.g3.s;

import android.view.View;
import com.clubhouse.android.data.models.local.payment.RecentPayment;
import com.clubhouse.android.ui.payments.RecentPaymentsFragment;

/* compiled from: lambda */
public final /* synthetic */ class o implements View.OnClickListener {
    public final /* synthetic */ RecentPaymentsFragment c;
    public final /* synthetic */ RecentPayment d;

    public /* synthetic */ o(RecentPaymentsFragment recentPaymentsFragment, RecentPayment recentPayment) {
        this.c = recentPaymentsFragment;
        this.d = recentPayment;
    }

    public final void onClick(View view) {
        RecentPaymentsFragment.RecentPaymentItemContoller.m32buildItemModel$lambda1(this.c, this.d, view);
    }
}
