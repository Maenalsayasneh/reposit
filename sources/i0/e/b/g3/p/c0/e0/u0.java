package i0.e.b.g3.p.c0.e0;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.databinding.FeedTopicSuggestionsBinding;
import com.clubhouse.android.ui.hallway.feed.viewholder.TopicSuggestions$bindTopicSuggestions$1$1;
import com.clubhouse.android.ui.hallway.feed.viewholder.TopicSuggestions$bindTopicSuggestions$1$2;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.f.d;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: TopicSuggestions.kt */
public abstract class u0 extends BaseEpoxyModelWithHolder<a> {
    public String j;
    public List<Topic> k;
    public l<? super Topic, Boolean> l;

    /* compiled from: TopicSuggestions.kt */
    public static final class a extends d {
        public FeedTopicSuggestionsBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            FeedTopicSuggestionsBinding bind = FeedTopicSuggestionsBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final FeedTopicSuggestionsBinding b() {
            FeedTopicSuggestionsBinding feedTopicSuggestionsBinding = this.b;
            if (feedTopicSuggestionsBinding != null) {
                return feedTopicSuggestionsBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        aVar.b().b.setText(this.j);
        aVar.b().a.removeAllViews();
        Context context = aVar.b().b.getContext();
        i.d(context, "");
        List list = this.k;
        if (list == null) {
            list = EmptyList.c;
        }
        EmptySet emptySet = EmptySet.c;
        LinearLayout linearLayout = aVar.b().a;
        i.d(linearLayout, "binding.mainTopicsList");
        v.i(context, list, emptySet, linearLayout, context.getResources().getDimensionPixelSize(R.dimen.feed_suggestion_margin_horizontal), new TopicSuggestions$bindTopicSuggestions$1$1(this), TopicSuggestions$bindTopicSuggestions$1$2.c);
    }
}
