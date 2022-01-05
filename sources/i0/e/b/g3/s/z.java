package i0.e.b.g3.s;

import android.view.View;
import com.clubhouse.android.ui.payments.SendDirectPaymentFragment;
import com.clubhouse.android.ui.payments.SendDirectPaymentFragment$onViewCreated$2$1;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class z implements View.OnClickListener {
    public final /* synthetic */ SendDirectPaymentFragment c;

    public /* synthetic */ z(SendDirectPaymentFragment sendDirectPaymentFragment) {
        this.c = sendDirectPaymentFragment;
    }

    public final void onClick(View view) {
        SendDirectPaymentFragment sendDirectPaymentFragment = this.c;
        k<Object>[] kVarArr = SendDirectPaymentFragment.p2;
        i.e(sendDirectPaymentFragment, "this$0");
        v.v2(sendDirectPaymentFragment.V0(), new SendDirectPaymentFragment$onViewCreated$2$1(sendDirectPaymentFragment));
    }
}
