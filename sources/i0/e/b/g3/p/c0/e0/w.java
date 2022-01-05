package i0.e.b.g3.p.c0.e0;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.databinding.FeedSuggestionsBinding;
import com.clubhouse.android.shared.ui.ImpressionTrackingEpoxyRecyclerView;
import com.clubhouse.android.ui.hallway.feed.viewholder.EventSuggestions$bindEventSuggestions$1;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import java.util.List;
import m0.i;
import m0.n.a.l;

/* compiled from: EventSuggestions.kt */
public abstract class w extends BaseEpoxyModelWithHolder<a> {
    public String j;
    public List<EventInClub> k;
    public Integer l;
    public l<? super EventInClub, i> m;
    public l<? super EventInClub, i> n;
    public l<? super EventInClub, i> o;
    public l<? super EventInClub, i> p;

    /* compiled from: EventSuggestions.kt */
    public static final class a extends d {
        public FeedSuggestionsBinding b;

        public void a(View view) {
            m0.n.b.i.e(view, "itemView");
            FeedSuggestionsBinding bind = FeedSuggestionsBinding.bind(view);
            m0.n.b.i.d(bind, "bind(itemView)");
            m0.n.b.i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final FeedSuggestionsBinding b() {
            FeedSuggestionsBinding feedSuggestionsBinding = this.b;
            if (feedSuggestionsBinding != null) {
                return feedSuggestionsBinding;
            }
            m0.n.b.i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        m0.n.b.i.e(aVar, "holder");
        aVar.b().b.setText(this.j);
        aVar.b().a.setNestedScrollingEnabled(true);
        ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView = aVar.b().a;
        m0.n.b.i.d(impressionTrackingEpoxyRecyclerView, "binding.suggestionList");
        k.E(impressionTrackingEpoxyRecyclerView, new EventSuggestions$bindEventSuggestions$1(this, aVar));
        k.i(aVar.b().a);
    }

    public int q() {
        return 0;
    }
}
