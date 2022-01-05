package i0.e.b.g3.r.b3;

import android.view.View;
import androidx.emoji.widget.EmojiButton;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.TopicInGridBinding;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.i;

/* compiled from: TopicItemInGrid.kt */
public abstract class e extends BaseEpoxyModelWithHolder<a> {
    public String j;
    public boolean k;
    public m0.n.a.a<Boolean> l;
    public m0.n.a.a<i> m;

    /* compiled from: TopicItemInGrid.kt */
    public static final class a extends d {
        public TopicInGridBinding b;

        public void a(View view) {
            m0.n.b.i.e(view, "itemView");
            TopicInGridBinding bind = TopicInGridBinding.bind(view);
            m0.n.b.i.d(bind, "bind(itemView)");
            m0.n.b.i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final TopicInGridBinding b() {
            TopicInGridBinding topicInGridBinding = this.b;
            if (topicInGridBinding != null) {
                return topicInGridBinding;
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
        EmojiButton emojiButton = aVar.b().a;
        m0.n.b.i.d(emojiButton, "holder.binding.title");
        k.H(emojiButton, aVar.a, new b(aVar, this));
    }
}
