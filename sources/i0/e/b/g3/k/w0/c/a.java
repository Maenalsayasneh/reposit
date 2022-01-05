package i0.e.b.g3.k.w0.c;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.clubhouse.android.ui.channels.users.recent.RecentlyDepartedSpeakersFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ RecentlyDepartedSpeakersFragment c;

    public /* synthetic */ a(RecentlyDepartedSpeakersFragment recentlyDepartedSpeakersFragment) {
        this.c = recentlyDepartedSpeakersFragment;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.clubhouse.android.ui.channels.users.recent.Hilt_RecentlyDepartedSpeakersFragment, com.clubhouse.android.shared.ui.AbstractUserFragment, java.lang.Object, com.clubhouse.android.ui.channels.users.recent.RecentlyDepartedSpeakersFragment] */
    public final void run() {
        ? r02 = this.c;
        k<Object>[] kVarArr = RecentlyDepartedSpeakersFragment.r2;
        i.e(r02, "this$0");
        r02.S0().j.setLayoutManager(new LinearLayoutManager(r02.getContext(), 1, false));
        r02.S0().j.requestLayout();
    }
}
