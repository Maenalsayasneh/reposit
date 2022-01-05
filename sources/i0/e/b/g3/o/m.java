package i0.e.b.g3.o;

import android.view.View;
import com.clubhouse.android.ui.events.EventActionType;
import com.clubhouse.android.ui.events.HalfEventFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class m implements View.OnClickListener {
    public final /* synthetic */ HalfEventFragment c;
    public final /* synthetic */ EventActionType d;
    public final /* synthetic */ l0 q;

    public /* synthetic */ m(HalfEventFragment halfEventFragment, EventActionType eventActionType, l0 l0Var) {
        this.c = halfEventFragment;
        this.d = eventActionType;
        this.q = l0Var;
    }

    public final void onClick(View view) {
        HalfEventFragment halfEventFragment = this.c;
        EventActionType eventActionType = this.d;
        l0 l0Var = this.q;
        i.e(halfEventFragment, "this$0");
        i.e(eventActionType, "$eventActionType");
        i.e(l0Var, "$state");
        HalfEventFragment.b bVar = HalfEventFragment.p2;
        halfEventFragment.V0().p(new s0(eventActionType, l0Var.c));
    }
}
