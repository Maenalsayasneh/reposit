package i0.e.b.g3.r.b3;

import android.view.View;
import android.widget.TextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.TopicTitleBinding;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.i;

/* compiled from: TopicItem.kt */
public abstract class c extends BaseEpoxyModelWithHolder<a> {
    public String j;
    public boolean k;
    public m0.n.a.a<Boolean> l;
    public m0.n.a.a<i> m;

    /* compiled from: TopicItem.kt */
    public static final class a extends d {
        public TopicTitleBinding b;

        public void a(View view) {
            m0.n.b.i.e(view, "itemView");
            TopicTitleBinding bind = TopicTitleBinding.bind(view);
            m0.n.b.i.d(bind, "bind(itemView)");
            m0.n.b.i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final TopicTitleBinding b() {
            TopicTitleBinding topicTitleBinding = this.b;
            if (topicTitleBinding != null) {
                return topicTitleBinding;
            }
            m0.n.b.i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        m0.n.b.i.e(aVar, "holder");
        aVar.b().a.setText(this.j);
        aVar.b().a.setSelected(this.k);
        TextView textView = aVar.b().a;
        m0.n.b.i.d(textView, "holder.binding.title");
        k.H(textView, aVar.a, new a(aVar, this));
    }
}
