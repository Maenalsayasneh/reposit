package i0.e.b.g3.w;

import android.view.View;
import com.clubhouse.android.ui.search.ExploreFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class g implements View.OnFocusChangeListener {
    public final /* synthetic */ ExploreFragment a;

    public /* synthetic */ g(ExploreFragment exploreFragment) {
        this.a = exploreFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        ExploreFragment exploreFragment = this.a;
        k<Object>[] kVarArr = ExploreFragment.Z1;
        i.e(exploreFragment, "this$0");
        if (z) {
            exploreFragment.O0().p(e0.a);
        }
    }
}
