package i0.e.b.g3.o.x0;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.EventActionDividerBinding;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: EventDivider.kt */
public abstract class r extends BaseEpoxyModelWithHolder<a> {

    /* compiled from: EventDivider.kt */
    public static final class a extends d {
        public void a(View view) {
            i.e(view, "itemView");
            EventActionDividerBinding bind = EventActionDividerBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
        }
    }

    public int p(int i, int i2, int i3) {
        return 1;
    }
}
