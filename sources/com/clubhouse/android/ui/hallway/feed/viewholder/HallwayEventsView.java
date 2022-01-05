package com.clubhouse.android.ui.hallway.feed.viewholder;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.databinding.HallwayEventsBinding;
import i0.b.a.o;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import i0.e.b.g3.p.c0.e0.h;
import i0.e.b.g3.p.c0.e0.i0;
import java.util.List;
import kotlin.collections.EmptyList;
import m0.n.b.i;

/* compiled from: HallwayEventsView.kt */
public abstract class HallwayEventsView extends BaseEpoxyModelWithHolder<a> {
    public List<EventInClub> j;
    public List<EventInClub> k;
    public b l;

    /* compiled from: HallwayEventsView.kt */
    public static final class a extends d {
        public HallwayEventsBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            HallwayEventsBinding bind = HallwayEventsBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final HallwayEventsBinding b() {
            HallwayEventsBinding hallwayEventsBinding = this.b;
            if (hallwayEventsBinding != null) {
                return hallwayEventsBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* compiled from: HallwayEventsView.kt */
    public interface b {
        void a(EventInClub eventInClub);
    }

    public HallwayEventsView() {
        EmptyList emptyList = EmptyList.c;
        this.j = emptyList;
        this.k = emptyList;
    }

    public final void K(o oVar, EventInClub eventInClub, boolean z) {
        i0 i0Var = new i0();
        i0Var.a(Integer.valueOf(eventInClub.Y1));
        i0Var.b(eventInClub);
        i0Var.e(z);
        i0Var.d(new h(this, eventInClub));
        oVar.add(i0Var);
    }

    /* renamed from: L */
    public void k(a aVar) {
        i.e(aVar, "holder");
        aVar.b().a.setLayoutManager(new LinearLayoutManager(aVar.b().a.getContext(), 1, false));
        EpoxyRecyclerView epoxyRecyclerView = aVar.b().a;
        i.d(epoxyRecyclerView, "holder.binding.hallwayEventsList");
        k.E(epoxyRecyclerView, new HallwayEventsView$bind$1(this));
    }
}
