package i0.e.b.g3.u.z5;

import android.view.View;
import com.clubhouse.android.ui.profile.settings.AccountFragment;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.t.a;
import h0.t.q;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ AccountFragment c;

    public /* synthetic */ b(AccountFragment accountFragment) {
        this.c = accountFragment;
    }

    public final void onClick(View view) {
        AccountFragment accountFragment = this.c;
        k<Object>[] kVarArr = AccountFragment.Z1;
        i.e(accountFragment, "this$0");
        v.a1(accountFragment, new a(R.id.action_accountFragment_to_deactivateFragment), (q) null, 2);
    }
}
