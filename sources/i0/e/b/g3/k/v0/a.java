package i0.e.b.g3.k.v0;

import android.view.View;
import android.widget.Button;
import com.clubhouse.android.ui.channels.raisedhands.RaisedHandsQueueFragment;
import com.clubhouse.android.ui.channels.raisedhands.RaisedHandsQueueFragment$onViewCreated$1$1;
import h0.b.f.m0;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ RaisedHandsQueueFragment c;

    public /* synthetic */ a(RaisedHandsQueueFragment raisedHandsQueueFragment) {
        this.c = raisedHandsQueueFragment;
    }

    public final void onClick(View view) {
        RaisedHandsQueueFragment raisedHandsQueueFragment = this.c;
        k<Object>[] kVarArr = RaisedHandsQueueFragment.l2;
        i.e(raisedHandsQueueFragment, "this$0");
        Button button = raisedHandsQueueFragment.T0().b;
        i.d(button, "binding.editHandraiseSettings");
        RaisedHandsQueueFragment$onViewCreated$1$1 raisedHandsQueueFragment$onViewCreated$1$1 = new RaisedHandsQueueFragment$onViewCreated$1$1(raisedHandsQueueFragment);
        i.e(raisedHandsQueueFragment, "<this>");
        i.e(button, "anchor");
        i.e(raisedHandsQueueFragment$onViewCreated$1$1, "f");
        m0 m0Var = new m0(raisedHandsQueueFragment.requireContext(), button);
        raisedHandsQueueFragment$onViewCreated$1$1.invoke(m0Var);
        if (!m0Var.d.f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }
}
