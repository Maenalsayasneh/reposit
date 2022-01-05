package i0.e.b.g3.s;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.clubhouse.android.ui.payments.SendDirectPaymentFragment;
import com.clubhouse.android.ui.payments.SendDirectPaymentFragment$onCreateDialog$1$1$1;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class v implements DialogInterface.OnKeyListener {
    public final /* synthetic */ SendDirectPaymentFragment c;

    public /* synthetic */ v(SendDirectPaymentFragment sendDirectPaymentFragment) {
        this.c = sendDirectPaymentFragment;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        SendDirectPaymentFragment sendDirectPaymentFragment = this.c;
        k<Object>[] kVarArr = SendDirectPaymentFragment.p2;
        i.e(sendDirectPaymentFragment, "this$0");
        return ((Boolean) h0.b0.v.v2(sendDirectPaymentFragment.V0(), new SendDirectPaymentFragment$onCreateDialog$1$1$1(i, keyEvent, sendDirectPaymentFragment))).booleanValue();
    }
}
