package i0.e.b.g3.w;

import android.view.View;
import com.clubhouse.android.ui.search.ExploreFragment;
import com.clubhouse.android.ui.search.Mode;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ ExploreFragment c;

    public /* synthetic */ a(ExploreFragment exploreFragment) {
        this.c = exploreFragment;
    }

    public final void onClick(View view) {
        ExploreFragment exploreFragment = this.c;
        k<Object>[] kVarArr = ExploreFragment.Z1;
        i.e(exploreFragment, "this$0");
        exploreFragment.N0().i.setText((CharSequence) null);
        v.x0(exploreFragment);
        exploreFragment.N0().a.requestFocus();
        exploreFragment.O0().p(new f0(Mode.SUGGESTED));
    }
}
