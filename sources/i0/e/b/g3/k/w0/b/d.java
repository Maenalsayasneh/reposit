package i0.e.b.g3.k.w0.b;

import androidx.recyclerview.widget.GridLayoutManager;
import com.clubhouse.android.ui.channels.users.ping.PingUserFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ PingUserFragment c;

    public /* synthetic */ d(PingUserFragment pingUserFragment) {
        this.c = pingUserFragment;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.clubhouse.android.ui.channels.users.ping.PingUserFragment, com.clubhouse.android.shared.ui.AbstractUserFragment, com.clubhouse.android.ui.channels.users.ping.Hilt_PingUserFragment, java.lang.Object] */
    public final void run() {
        ? r02 = this.c;
        k<Object>[] kVarArr = PingUserFragment.r2;
        i.e(r02, "this$0");
        r02.S0().j.setLayoutManager(new GridLayoutManager(r02.getContext(), 12));
        r02.S0().j.requestLayout();
    }
}
