package i0.e.b.g3.p.c0.e0;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.ViewHiddenChannelBinding;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: HiddenChannelView.kt */
public abstract class l0 extends BaseEpoxyModelWithHolder<a> {
    public View.OnClickListener j;

    /* compiled from: HiddenChannelView.kt */
    public static final class a extends d {
        public ViewHiddenChannelBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ViewHiddenChannelBinding bind = ViewHiddenChannelBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        ViewHiddenChannelBinding viewHiddenChannelBinding = aVar.b;
        if (viewHiddenChannelBinding != null) {
            viewHiddenChannelBinding.a.setOnClickListener(this.j);
        } else {
            i.m("binding");
            throw null;
        }
    }
}
