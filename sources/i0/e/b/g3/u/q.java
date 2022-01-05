package i0.e.b.g3.u;

import android.view.MenuItem;
import com.clubhouse.android.ui.profile.HalfProfileFragment;
import com.clubhouse.android.ui.profile.HalfProfileFragment$menuListener$1$1;
import h0.b.f.m0;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class q implements m0.a {
    public final /* synthetic */ HalfProfileFragment a;

    public /* synthetic */ q(HalfProfileFragment halfProfileFragment) {
        this.a = halfProfileFragment;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        HalfProfileFragment halfProfileFragment = this.a;
        HalfProfileFragment.b bVar = HalfProfileFragment.Z1;
        i.e(halfProfileFragment, "this$0");
        return ((Boolean) v.v2(halfProfileFragment.U0(), new HalfProfileFragment$menuListener$1$1(menuItem, halfProfileFragment))).booleanValue();
    }
}
