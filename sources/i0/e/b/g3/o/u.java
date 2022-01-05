package i0.e.b.g3.o;

import android.view.View;
import com.clubhouse.android.ui.events.HalfEventFragment;
import com.clubhouse.android.ui.events.HalfEventFragment$onViewCreated$6$1;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class u implements View.OnClickListener {
    public final /* synthetic */ HalfEventFragment c;

    public /* synthetic */ u(HalfEventFragment halfEventFragment) {
        this.c = halfEventFragment;
    }

    public final void onClick(View view) {
        HalfEventFragment halfEventFragment = this.c;
        HalfEventFragment.b bVar = HalfEventFragment.p2;
        i.e(halfEventFragment, "this$0");
        v.v2(halfEventFragment.V0(), new HalfEventFragment$onViewCreated$6$1(halfEventFragment));
    }
}
