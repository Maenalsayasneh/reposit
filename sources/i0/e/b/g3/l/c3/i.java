package i0.e.b.g3.l.c3;

import android.view.View;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.databinding.ClubEventBinding;
import com.clubhouse.android.ui.clubs.viewholder.ClubEvent$bindEvents$1$1;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;

/* compiled from: ClubEvent.kt */
public abstract class i extends BaseEpoxyModelWithHolder<a> {
    public EventInClub j;
    public View.OnClickListener k;
    public View.OnClickListener l;

    /* compiled from: ClubEvent.kt */
    public static final class a extends d {
        public ClubEventBinding b;

        public void a(View view) {
            m0.n.b.i.e(view, "itemView");
            ClubEventBinding bind = ClubEventBinding.bind(view);
            m0.n.b.i.d(bind, "bind(itemView)");
            m0.n.b.i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        m0.n.b.i.e(aVar, "holder");
        EventInClub eventInClub = this.j;
        if (eventInClub != null) {
            ClubEventBinding clubEventBinding = aVar.b;
            if (clubEventBinding != null) {
                EpoxyRecyclerView epoxyRecyclerView = clubEventBinding.a;
                m0.n.b.i.d(epoxyRecyclerView, "binding.clubEvent");
                k.E(epoxyRecyclerView, new ClubEvent$bindEvents$1$1(eventInClub, this, aVar));
                return;
            }
            m0.n.b.i.m("binding");
            throw null;
        }
    }
}
