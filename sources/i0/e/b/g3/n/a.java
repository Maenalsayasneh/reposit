package i0.e.b.g3.n;

import android.view.View;
import com.clubhouse.android.ui.creation.ChooseUsersFragment;
import com.clubhouse.android.ui.creation.ChooseUsersFragment$onViewCreated$2$1;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ ChooseUsersFragment c;

    public /* synthetic */ a(ChooseUsersFragment chooseUsersFragment) {
        this.c = chooseUsersFragment;
    }

    public final void onClick(View view) {
        ChooseUsersFragment chooseUsersFragment = this.c;
        k<Object>[] kVarArr = ChooseUsersFragment.r2;
        i.e(chooseUsersFragment, "this$0");
        if (chooseUsersFragment.getParentFragment() instanceof ChooseUsersFragment.a) {
            v.v2(chooseUsersFragment.X0(), new ChooseUsersFragment$onViewCreated$2$1(chooseUsersFragment));
        }
        chooseUsersFragment.dismiss();
    }
}
