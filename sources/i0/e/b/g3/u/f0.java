package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.android.ui.profile.HalfProfileFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class f0 implements View.OnClickListener {
    public final /* synthetic */ HalfProfileFragment c;

    public /* synthetic */ f0(HalfProfileFragment halfProfileFragment) {
        this.c = halfProfileFragment;
    }

    public final void onClick(View view) {
        HalfProfileFragment halfProfileFragment = this.c;
        i.e(halfProfileFragment, "$this_setUpViews");
        halfProfileFragment.dismiss();
    }
}
