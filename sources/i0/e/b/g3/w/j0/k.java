package i0.e.b.g3.w.j0;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.RecentSearchesHeaderBinding;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: RecentSearchesHeader.kt */
public abstract class k extends BaseEpoxyModelWithHolder<a> {
    public View.OnClickListener j;

    /* compiled from: RecentSearchesHeader.kt */
    public static final class a extends d {
        public RecentSearchesHeaderBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            RecentSearchesHeaderBinding bind = RecentSearchesHeaderBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        RecentSearchesHeaderBinding recentSearchesHeaderBinding = aVar.b;
        if (recentSearchesHeaderBinding != null) {
            recentSearchesHeaderBinding.a.setOnClickListener(this.j);
        } else {
            i.m("binding");
            throw null;
        }
    }
}
