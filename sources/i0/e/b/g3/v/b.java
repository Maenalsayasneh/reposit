package i0.e.b.g3.v;

import android.view.View;
import com.clubhouse.android.ui.recentSpeakers.RecentSpeakersFragment;
import i0.e.b.b3.b.e.m;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ RecentSpeakersFragment c;
    public final /* synthetic */ m d;

    public /* synthetic */ b(RecentSpeakersFragment recentSpeakersFragment, m mVar) {
        this.c = recentSpeakersFragment;
        this.d = mVar;
    }

    public final void onClick(View view) {
        RecentSpeakersFragment.PagingController.m38buildItemModel$lambda1(this.c, this.d, view);
    }
}
