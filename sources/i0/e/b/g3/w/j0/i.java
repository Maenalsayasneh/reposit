package i0.e.b.g3.w.j0;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.ExploreHeaderBinding;
import i0.e.b.a3.f.d;

/* compiled from: ExploreHeader.kt */
public abstract class i extends BaseEpoxyModelWithHolder<a> {
    public String j;

    /* compiled from: ExploreHeader.kt */
    public static final class a extends d {
        public ExploreHeaderBinding b;

        public void a(View view) {
            m0.n.b.i.e(view, "itemView");
            ExploreHeaderBinding bind = ExploreHeaderBinding.bind(view);
            m0.n.b.i.d(bind, "bind(itemView)");
            m0.n.b.i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        m0.n.b.i.e(aVar, "holder");
        ExploreHeaderBinding exploreHeaderBinding = aVar.b;
        if (exploreHeaderBinding != null) {
            exploreHeaderBinding.a.setText(this.j);
        } else {
            m0.n.b.i.m("binding");
            throw null;
        }
    }
}
