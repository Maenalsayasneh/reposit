package i0.e.b.g3.k.w0.a;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.clubhouse.android.ui.channels.users.follow.FollowSpeakersFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ FollowSpeakersFragment c;

    public /* synthetic */ c(FollowSpeakersFragment followSpeakersFragment) {
        this.c = followSpeakersFragment;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.clubhouse.android.ui.channels.users.follow.FollowSpeakersFragment, com.clubhouse.android.shared.ui.AbstractUserFragment, java.lang.Object, com.clubhouse.android.ui.channels.users.follow.Hilt_FollowSpeakersFragment] */
    public final void run() {
        ? r02 = this.c;
        k<Object>[] kVarArr = FollowSpeakersFragment.r2;
        i.e(r02, "this$0");
        r02.S0().j.setLayoutManager(new LinearLayoutManager(r02.getContext(), 1, false));
        r02.S0().j.requestLayout();
    }
}
