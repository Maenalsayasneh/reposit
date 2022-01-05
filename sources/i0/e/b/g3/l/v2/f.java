package i0.e.b.g3.l.v2;

import android.content.res.Resources;
import android.view.View;
import android.widget.ScrollView;
import com.clubhouse.android.ui.clubs.create.CreateClubFragment;
import h0.b0.v;
import i0.e.b.d3.e;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class f implements View.OnFocusChangeListener {
    public final /* synthetic */ CreateClubFragment a;

    public /* synthetic */ f(CreateClubFragment createClubFragment) {
        this.a = createClubFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        CreateClubFragment createClubFragment = this.a;
        k<Object>[] kVarArr = CreateClubFragment.e2;
        i.e(createClubFragment, "this$0");
        if (z) {
            ScrollView scrollView = createClubFragment.R0().n;
            i.d(scrollView, "binding.scroll");
            i.e(scrollView, "<this>");
            e eVar = new e(scrollView);
            Resources resources = scrollView.getResources();
            i.d(resources, "resources");
            scrollView.postDelayed(eVar, v.Y1(resources));
        }
    }
}
