package i0.e.b.g3.n;

import androidx.recyclerview.widget.GridLayoutManager;
import com.clubhouse.android.ui.creation.ChooseUsersFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ ChooseUsersFragment c;

    public /* synthetic */ c(ChooseUsersFragment chooseUsersFragment) {
        this.c = chooseUsersFragment;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.clubhouse.android.ui.creation.Hilt_ChooseUsersFragment, com.clubhouse.android.ui.creation.ChooseUsersFragment, com.clubhouse.android.shared.ui.AbstractUserFragment, java.lang.Object] */
    public final void run() {
        ? r02 = this.c;
        k<Object>[] kVarArr = ChooseUsersFragment.r2;
        i.e(r02, "this$0");
        r02.S0().j.setLayoutManager(new GridLayoutManager(r02.getContext(), 12));
        r02.S0().j.requestLayout();
    }
}
