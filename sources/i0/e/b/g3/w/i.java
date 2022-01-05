package i0.e.b.g3.w;

import android.view.View;
import com.clubhouse.android.ui.search.ExploreV2Fragment;
import i0.e.b.b3.b.e.j;

/* compiled from: lambda */
public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ ExploreV2Fragment c;
    public final /* synthetic */ j d;

    public /* synthetic */ i(ExploreV2Fragment exploreV2Fragment, j jVar) {
        this.c = exploreV2Fragment;
        this.d = jVar;
    }

    public final void onClick(View view) {
        ExploreV2Fragment.PagingController.m43buildItemModel$lambda3(this.c, this.d, view);
    }
}
