package com.clubhouse.android.ui.events;

import android.widget.Button;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.ui.events.HalfEventFragment;
import com.clubhouse.app.R;
import i0.e.b.d3.k;
import i0.e.b.g3.o.l0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfEventFragment.kt */
public final class HalfEventFragment$invalidate$1 extends Lambda implements l<l0, i> {
    public final /* synthetic */ HalfEventFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfEventFragment$invalidate$1(HalfEventFragment halfEventFragment) {
        super(1);
        this.c = halfEventFragment;
    }

    public Object invoke(Object obj) {
        String str;
        l0 l0Var = (l0) obj;
        m0.n.b.i.e(l0Var, "state");
        EventInClub eventInClub = l0Var.c;
        if (eventInClub == null) {
            return null;
        }
        HalfEventFragment halfEventFragment = this.c;
        HalfEventFragment.b bVar = HalfEventFragment.p2;
        halfEventFragment.U0().e.g();
        halfEventFragment.U0().b.g();
        halfEventFragment.U0().c.g();
        Button button = halfEventFragment.U0().d;
        if (l0Var.e) {
            str = halfEventFragment.getString(R.string.join_the_room_in_progress);
        } else {
            str = halfEventFragment.getString(R.string.start_the_room);
        }
        button.setText(str);
        Button button2 = halfEventFragment.U0().d;
        m0.n.b.i.d(button2, "binding.joinCreateRoomButton");
        k.L(button2, Boolean.valueOf(l0Var.e || l0Var.f));
        Button button3 = halfEventFragment.U0().a;
        m0.n.b.i.d(button3, "binding.endedConversation");
        k.L(button3, Boolean.valueOf(eventInClub.g2));
        EpoxyRecyclerView epoxyRecyclerView = halfEventFragment.U0().b;
        m0.n.b.i.d(epoxyRecyclerView, "binding.eventActionsList");
        k.q(epoxyRecyclerView, Boolean.valueOf(l0Var.g));
        EpoxyRecyclerView epoxyRecyclerView2 = halfEventFragment.U0().c;
        m0.n.b.i.d(epoxyRecyclerView2, "binding.eventClubActionsList");
        k.L(epoxyRecyclerView2, Boolean.valueOf(l0Var.g));
        return i.a;
    }
}
