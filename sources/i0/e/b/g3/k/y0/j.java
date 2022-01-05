package i0.e.b.g3.k.y0;

import android.view.View;
import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.ui.channels.views.RaiseHandFragment;
import i0.e.b.z2.g.j1;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class j implements View.OnClickListener {
    public final /* synthetic */ RaiseHandFragment c;

    public /* synthetic */ j(RaiseHandFragment raiseHandFragment) {
        this.c = raiseHandFragment;
    }

    public final void onClick(View view) {
        RaiseHandFragment raiseHandFragment = this.c;
        k<Object>[] kVarArr = RaiseHandFragment.l2;
        i.e(raiseHandFragment, "this$0");
        ((ChannelViewModel) raiseHandFragment.n2.getValue()).p(j1.a);
        raiseHandFragment.dismiss();
    }
}
