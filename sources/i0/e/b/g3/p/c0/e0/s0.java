package i0.e.b.g3.p.c0.e0;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.ViewToggleBlockedPillBinding;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: ToggleBlockedPillView.kt */
public abstract class s0 extends BaseEpoxyModelWithHolder<a> {
    public String j;
    public View.OnClickListener k;

    /* compiled from: ToggleBlockedPillView.kt */
    public static final class a extends d {
        public ViewToggleBlockedPillBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ViewToggleBlockedPillBinding bind = ViewToggleBlockedPillBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        ViewToggleBlockedPillBinding viewToggleBlockedPillBinding = aVar.b;
        if (viewToggleBlockedPillBinding != null) {
            viewToggleBlockedPillBinding.a.setText(this.j);
            ViewToggleBlockedPillBinding viewToggleBlockedPillBinding2 = aVar.b;
            if (viewToggleBlockedPillBinding2 != null) {
                viewToggleBlockedPillBinding2.b.setOnClickListener(this.k);
            } else {
                i.m("binding");
                throw null;
            }
        } else {
            i.m("binding");
            throw null;
        }
    }
}
