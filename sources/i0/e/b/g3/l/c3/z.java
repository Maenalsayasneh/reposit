package i0.e.b.g3.l.c3;

import android.view.View;
import androidx.emoji.widget.EmojiTextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.databinding.ClubTopicsBinding;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: ClubTopics.kt */
public abstract class z extends BaseEpoxyModelWithHolder<a> {
    public List<Topic> j = EmptyList.c;

    /* compiled from: ClubTopics.kt */
    public static final class a extends d {
        public ClubTopicsBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ClubTopicsBinding bind = ClubTopicsBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        List<Topic> list = this.j;
        ArrayList arrayList = new ArrayList(h.K(list, 10));
        for (Topic topic : list) {
            arrayList.add(topic.d);
        }
        ClubTopicsBinding clubTopicsBinding = aVar.b;
        if (clubTopicsBinding != null) {
            clubTopicsBinding.a.setText(g.E(arrayList, " · ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62));
            ClubTopicsBinding clubTopicsBinding2 = aVar.b;
            if (clubTopicsBinding2 != null) {
                EmojiTextView emojiTextView = clubTopicsBinding2.a;
                i.d(emojiTextView, "binding.topics");
                k.L(emojiTextView, Boolean.valueOf(!list.isEmpty()));
                return;
            }
            i.m("binding");
            throw null;
        }
        i.m("binding");
        throw null;
    }
}
