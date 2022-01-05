package i0.e.b.g3.w.j0;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.SearchQueryBinding;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: SearchQueryView.kt */
public abstract class m extends BaseEpoxyModelWithHolder<a> {
    public String j;
    public View.OnClickListener k;

    /* compiled from: SearchQueryView.kt */
    public static final class a extends d {
        public SearchQueryBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            SearchQueryBinding bind = SearchQueryBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        SearchQueryBinding searchQueryBinding = aVar.b;
        if (searchQueryBinding != null) {
            searchQueryBinding.b.setText(this.j);
            SearchQueryBinding searchQueryBinding2 = aVar.b;
            if (searchQueryBinding2 != null) {
                searchQueryBinding2.a.setOnClickListener(this.k);
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
