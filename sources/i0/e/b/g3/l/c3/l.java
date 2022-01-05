package i0.e.b.g3.l.c3;

import android.view.View;
import android.widget.TextView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.databinding.ClubEventsBinding;
import com.clubhouse.android.ui.clubs.viewholder.ClubEvents$bindEvents$1;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import java.util.List;
import m0.i;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;
import u0.a.a.c;

/* compiled from: ClubEvents.kt */
public abstract class l extends BaseEpoxyModelWithHolder<a> {
    public List<EventInClub> j;
    public boolean k;
    public m0.n.a.l<? super EventInClub, i> l;
    public m0.n.a.l<? super EventInClub, i> m;

    /* compiled from: ClubEvents.kt */
    public static final class a extends d {
        public ClubEventsBinding b;

        public void a(View view) {
            m0.n.b.i.e(view, "itemView");
            ClubEventsBinding bind = ClubEventsBinding.bind(view);
            m0.n.b.i.d(bind, "bind(itemView)");
            m0.n.b.i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final ClubEventsBinding b() {
            ClubEventsBinding clubEventsBinding = this.b;
            if (clubEventsBinding != null) {
                return clubEventsBinding;
            }
            m0.n.b.i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        m0.n.b.i.e(aVar, "holder");
        TextView textView = aVar.b().e;
        m0.n.b.i.d(textView, "binding.upNextSubtitle");
        k.p(textView);
        View view = aVar.b().b;
        m0.n.b.i.d(view, "binding.upNextDivider");
        k.p(view);
        EpoxyRecyclerView epoxyRecyclerView = aVar.b().d;
        m0.n.b.i.d(epoxyRecyclerView, "binding.upNextEventsList");
        k.p(epoxyRecyclerView);
        ScrollingPagerIndicator scrollingPagerIndicator = aVar.b().c;
        m0.n.b.i.d(scrollingPagerIndicator, "binding.upNextEventsIndicator");
        k.p(scrollingPagerIndicator);
        TextView textView2 = aVar.b().a;
        m0.n.b.i.d(textView2, "binding.noScheduledRooms");
        k.p(textView2);
        List<EventInClub> list = this.j;
        if (list != null) {
            m0.n.b.i.c(list);
            if (!list.isEmpty()) {
                TextView textView3 = aVar.b().e;
                m0.n.b.i.d(textView3, "binding.upNextSubtitle");
                k.K(textView3);
                View view2 = aVar.b().b;
                m0.n.b.i.d(view2, "binding.upNextDivider");
                k.K(view2);
                EpoxyRecyclerView epoxyRecyclerView2 = aVar.b().d;
                m0.n.b.i.d(epoxyRecyclerView2, "binding.upNextEventsList");
                k.K(epoxyRecyclerView2);
                aVar.b().d.setControllerAndBuildModels(new ClubEvents$bindEvents$1(this));
                aVar.b().c.b(aVar.b().d, new c());
                ScrollingPagerIndicator scrollingPagerIndicator2 = aVar.b().c;
                m0.n.b.i.d(scrollingPagerIndicator2, "binding.upNextEventsIndicator");
                k.K(scrollingPagerIndicator2);
                k.i(aVar.b().d);
            } else if (this.k) {
                TextView textView4 = aVar.b().e;
                m0.n.b.i.d(textView4, "binding.upNextSubtitle");
                k.K(textView4);
                TextView textView5 = aVar.b().a;
                m0.n.b.i.d(textView5, "binding.noScheduledRooms");
                k.K(textView5);
            }
        }
    }
}
