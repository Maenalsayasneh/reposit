package i0.e.b.g3.k.w0.a;

import android.view.View;
import com.clubhouse.android.ui.channels.users.follow.FollowSpeakersFragment;
import i0.e.b.b3.b.e.d;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ FollowSpeakersFragment c;
    public final /* synthetic */ d d;

    public /* synthetic */ b(FollowSpeakersFragment followSpeakersFragment, d dVar) {
        this.c = followSpeakersFragment;
        this.d = dVar;
    }

    public final void onClick(View view) {
        FollowSpeakersFragment.UserController.m21buildItemModel$lambda0(this.c, this.d, view);
    }
}
