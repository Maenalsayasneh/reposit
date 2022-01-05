package i0.e.b.g3.w;

import android.view.View;
import com.clubhouse.android.ui.search.ExploreFragment;
import i0.e.b.b3.b.e.j;
import i0.e.b.b3.b.e.m;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ ExploreFragment c;
    public final /* synthetic */ j d;

    public /* synthetic */ f(ExploreFragment exploreFragment, j jVar) {
        this.c = exploreFragment;
        this.d = jVar;
    }

    public final void onClick(View view) {
        ExploreFragment exploreFragment = this.c;
        j jVar = this.d;
        i.e(exploreFragment, "this$0");
        k<Object>[] kVarArr = ExploreFragment.Z1;
        exploreFragment.O0().p(new h0(((m) jVar).g));
    }
}
