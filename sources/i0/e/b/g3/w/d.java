package i0.e.b.g3.w;

import android.view.View;
import com.clubhouse.android.ui.search.ExploreFragment;
import i0.e.b.b3.b.e.j;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ ExploreFragment c;
    public final /* synthetic */ j d;

    public /* synthetic */ d(ExploreFragment exploreFragment, j jVar) {
        this.c = exploreFragment;
        this.d = jVar;
    }

    public final void onClick(View view) {
        ExploreFragment.PagingController.m39buildItemModel$lambda0(this.c, this.d, view);
    }
}
