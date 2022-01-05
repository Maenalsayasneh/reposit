package i0.e.b.g3.k.w0.b;

import android.widget.LinearLayout;
import com.clubhouse.android.ui.channels.users.ping.PingUserFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ PingUserFragment c;

    public /* synthetic */ c(PingUserFragment pingUserFragment) {
        this.c = pingUserFragment;
    }

    public final void run() {
        PingUserFragment pingUserFragment = this.c;
        i.e(pingUserFragment, "this$0");
        k<Object>[] kVarArr = PingUserFragment.r2;
        LinearLayout linearLayout = pingUserFragment.S0().g;
        i.d(linearLayout, "binding.root");
        PingUserFragment.X0(pingUserFragment, linearLayout);
    }
}
