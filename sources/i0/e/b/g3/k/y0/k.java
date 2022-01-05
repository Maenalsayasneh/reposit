package i0.e.b.g3.k.y0;

import android.view.View;
import com.clubhouse.android.ui.channels.views.RaiseHandFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ RaiseHandFragment c;

    public /* synthetic */ k(RaiseHandFragment raiseHandFragment) {
        this.c = raiseHandFragment;
    }

    public final void onClick(View view) {
        RaiseHandFragment raiseHandFragment = this.c;
        m0.r.k<Object>[] kVarArr = RaiseHandFragment.l2;
        i.e(raiseHandFragment, "this$0");
        raiseHandFragment.dismiss();
    }
}
