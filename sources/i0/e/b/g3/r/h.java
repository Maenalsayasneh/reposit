package i0.e.b.g3.r;

import android.content.DialogInterface;
import com.clubhouse.android.ui.onboarding.CollectPhoneNumberFragment;
import com.clubhouse.android.ui.onboarding.CollectPhoneNumberViewModel;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {
    public final /* synthetic */ CollectPhoneNumberFragment c;
    public final /* synthetic */ String d;

    public /* synthetic */ h(CollectPhoneNumberFragment collectPhoneNumberFragment, String str) {
        this.c = collectPhoneNumberFragment;
        this.d = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CollectPhoneNumberFragment collectPhoneNumberFragment = this.c;
        String str = this.d;
        i.e(collectPhoneNumberFragment, "this$0");
        k<Object>[] kVarArr = CollectPhoneNumberFragment.Z1;
        CollectPhoneNumberViewModel O0 = collectPhoneNumberFragment.O0();
        i.d(str, "fullNumber");
        O0.p(new d2(str));
    }
}
