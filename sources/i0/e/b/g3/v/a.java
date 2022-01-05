package i0.e.b.g3.v;

import android.view.View;
import com.clubhouse.android.ui.recentSpeakers.RecentSpeakersFragment;
import i0.e.b.b3.b.e.m;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ RecentSpeakersFragment c;
    public final /* synthetic */ m d;

    public /* synthetic */ a(RecentSpeakersFragment recentSpeakersFragment, m mVar) {
        this.c = recentSpeakersFragment;
        this.d = mVar;
    }

    public final void onClick(View view) {
        RecentSpeakersFragment.PagingController.m37buildItemModel$lambda0(this.c, this.d, view);
    }
}
