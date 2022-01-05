package i0.e.b.g3.p.c0.e0;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.ViewExplorePillBinding;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: ExplorePillView.kt */
public abstract class b0 extends BaseEpoxyModelWithHolder<a> {
    public View.OnClickListener j;

    /* compiled from: ExplorePillView.kt */
    public static final class a extends d {
        public ViewExplorePillBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ViewExplorePillBinding bind = ViewExplorePillBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        ViewExplorePillBinding viewExplorePillBinding = aVar.b;
        if (viewExplorePillBinding != null) {
            viewExplorePillBinding.a.setOnClickListener(this.j);
        } else {
            i.m("binding");
            throw null;
        }
    }
}
