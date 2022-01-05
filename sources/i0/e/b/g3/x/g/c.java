package i0.e.b.g3.x.g;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.core.ui.R;
import com.clubhouse.core.ui.databinding.SelectionDividerBinding;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: SelectionItemDivider.kt */
public abstract class c extends BaseEpoxyModelWithHolder<a> {

    /* compiled from: SelectionItemDivider.kt */
    public static final class a extends d {
        public void a(View view) {
            i.e(view, "itemView");
            SelectionDividerBinding bind = SelectionDividerBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
        }
    }

    public int o() {
        return R.layout.selection_divider;
    }
}
