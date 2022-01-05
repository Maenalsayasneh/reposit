package i0.e.b.g3.s;

import android.text.Editable;
import android.view.View;
import com.clubhouse.android.data.models.local.payment.RecentPayment;
import com.clubhouse.android.ui.payments.AcknowledgePaymentFragment;
import h0.b0.v;
import kotlin.Pair;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ AcknowledgePaymentFragment c;
    public final /* synthetic */ RecentPayment d;

    public /* synthetic */ a(AcknowledgePaymentFragment acknowledgePaymentFragment, RecentPayment recentPayment) {
        this.c = acknowledgePaymentFragment;
        this.d = recentPayment;
    }

    public final void onClick(View view) {
        AcknowledgePaymentFragment acknowledgePaymentFragment = this.c;
        RecentPayment recentPayment = this.d;
        k<Object>[] kVarArr = AcknowledgePaymentFragment.p2;
        i.e(acknowledgePaymentFragment, "this$0");
        i.e(recentPayment, "$recentPayment");
        Editable text = acknowledgePaymentFragment.U0().e.getText();
        boolean z = false;
        if (text != null && !StringsKt__IndentKt.o(text)) {
            z = true;
        }
        if (z) {
            v.V1(acknowledgePaymentFragment, "thank_you_message", new Pair(Integer.valueOf(recentPayment.c), String.valueOf(acknowledgePaymentFragment.U0().e.getText())));
            v.c1(acknowledgePaymentFragment);
        }
    }
}
