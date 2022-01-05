package i0.e.b.g3.o;

import android.view.View;
import com.clubhouse.android.ui.events.EventActionType;
import com.clubhouse.android.ui.events.HalfEventFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ HalfEventFragment c;
    public final /* synthetic */ l0 d;

    public /* synthetic */ n(HalfEventFragment halfEventFragment, l0 l0Var) {
        this.c = halfEventFragment;
        this.d = l0Var;
    }

    public final void onClick(View view) {
        HalfEventFragment halfEventFragment = this.c;
        l0 l0Var = this.d;
        i.e(halfEventFragment, "this$0");
        i.e(l0Var, "$state");
        HalfEventFragment.b bVar = HalfEventFragment.p2;
        halfEventFragment.V0().p(new s0(EventActionType.CopyLink, l0Var.c));
    }
}
