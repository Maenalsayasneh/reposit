package i0.e.b.g3.k.w0.c;

import android.view.View;
import com.clubhouse.android.ui.channels.users.recent.RecentlyDepartedSpeakersFragment;
import i0.e.b.b3.b.e.d;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ RecentlyDepartedSpeakersFragment c;
    public final /* synthetic */ d d;

    public /* synthetic */ b(RecentlyDepartedSpeakersFragment recentlyDepartedSpeakersFragment, d dVar) {
        this.c = recentlyDepartedSpeakersFragment;
        this.d = dVar;
    }

    public final void onClick(View view) {
        RecentlyDepartedSpeakersFragment.UserController.m24buildItemModel$lambda0(this.c, this.d, view);
    }
}
