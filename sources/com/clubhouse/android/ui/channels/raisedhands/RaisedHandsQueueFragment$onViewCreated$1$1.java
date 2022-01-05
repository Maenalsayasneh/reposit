package com.clubhouse.android.ui.channels.raisedhands;

import android.view.MenuItem;
import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.app.R;
import h0.b.f.m0;
import h0.b0.v;
import i0.e.b.d3.k;
import i0.e.b.g3.k.v0.d;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: RaisedHandsQueueFragment.kt */
public final class RaisedHandsQueueFragment$onViewCreated$1$1 extends Lambda implements l<m0, i> {
    public final /* synthetic */ RaisedHandsQueueFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RaisedHandsQueueFragment$onViewCreated$1$1(RaisedHandsQueueFragment raisedHandsQueueFragment) {
        super(1);
        this.c = raisedHandsQueueFragment;
    }

    public Object invoke(Object obj) {
        final m0 m0Var = (m0) obj;
        m0.n.b.i.e(m0Var, "$this$popUpMenu");
        ChannelViewModel S0 = RaisedHandsQueueFragment.S0(this.c);
        final RaisedHandsQueueFragment raisedHandsQueueFragment = this.c;
        v.v2(S0, new l<i0.e.b.z2.g.l, i>() {
            public Object invoke(Object obj) {
                Boolean bool;
                i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
                m0.n.b.i.e(lVar, "state");
                m0 m0Var = m0.this;
                m0Var.e = new d(raisedHandsQueueFragment, lVar);
                m0Var.a(R.menu.menu_edit_handraise_settings);
                MenuItem findItem = m0.this.b.findItem(R.id.handraise_menu_club);
                m0.n.b.i.d(findItem, "menu.findItem(R.id.handraise_menu_club)");
                Channel channel = lVar.u;
                if (channel == null) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(v.I0(channel));
                }
                m0.n.b.i.e(findItem, "<this>");
                if (m0.n.b.i.a(bool, Boolean.TRUE)) {
                    k.J(findItem);
                } else {
                    k.o(findItem);
                }
                if (lVar.D) {
                    MenuItem findItem2 = m0.this.b.findItem(lVar.E.getMenuID());
                    if (findItem2 != null) {
                        findItem2.setChecked(true);
                    }
                } else {
                    MenuItem findItem3 = m0.this.b.findItem(R.id.handraise_menu_off);
                    if (findItem3 != null) {
                        findItem3.setChecked(true);
                    }
                }
                return i.a;
            }
        });
        return i.a;
    }
}
