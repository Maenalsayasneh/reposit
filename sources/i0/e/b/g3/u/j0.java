package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.android.ui.profile.HalfProfileFragment;
import com.clubhouse.android.ui.profile.HalfProfileUtil$handleOnAvatarClick$1;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class j0 implements View.OnClickListener {
    public final /* synthetic */ HalfProfileFragment c;

    public /* synthetic */ j0(HalfProfileFragment halfProfileFragment) {
        this.c = halfProfileFragment;
    }

    public final void onClick(View view) {
        HalfProfileFragment halfProfileFragment = this.c;
        i.e(halfProfileFragment, "$this_setUpViews");
        v.v2(halfProfileFragment.U0(), new HalfProfileUtil$handleOnAvatarClick$1(halfProfileFragment));
    }
}