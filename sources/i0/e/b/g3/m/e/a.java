package i0.e.b.g3.m.e;

import android.view.View;
import com.clubhouse.android.core.databinding.DividerBinding;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.core.ui.R;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: Divider.kt */
public abstract class a extends BaseEpoxyModelWithHolder<C0202a> {

    /* renamed from: i0.e.b.g3.m.e.a$a  reason: collision with other inner class name */
    /* compiled from: Divider.kt */
    public static final class C0202a extends d {
        public void a(View view) {
            i.e(view, "itemView");
            DividerBinding bind = DividerBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
        }
    }

    public int o() {
        return R.layout.divider;
    }
}
