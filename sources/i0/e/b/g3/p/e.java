package i0.e.b.g3.p;

import android.view.View;
import com.clubhouse.android.ui.hallway.HallwayFragment;
import com.clubhouse.android.ui.hallway.HallwayFragment$invalidate$1$1$2$1;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class e implements View.OnLongClickListener {
    public final /* synthetic */ HallwayFragment c;

    public /* synthetic */ e(HallwayFragment hallwayFragment) {
        this.c = hallwayFragment;
    }

    public final boolean onLongClick(View view) {
        HallwayFragment hallwayFragment = this.c;
        i.e(hallwayFragment, "this$0");
        if (!v.J0()) {
            return true;
        }
        v.e(hallwayFragment, new HallwayFragment$invalidate$1$1$2$1(hallwayFragment));
        return true;
    }
}
