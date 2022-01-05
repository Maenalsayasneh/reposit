package com.clubhouse.android.ui.hallway.feed;

import android.view.MenuItem;
import com.clubhouse.android.data.models.local.channel.ChannelInFeed;
import com.clubhouse.app.R;
import h0.b.f.m0;
import i0.e.b.d3.k;
import i0.e.b.g3.p.c0.d;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: FeedFragment.kt */
public final class FeedFragment$buildModels$1$1$2$4$3$1 extends Lambda implements l<m0, i> {
    public final /* synthetic */ ChannelInFeed c;
    public final /* synthetic */ FeedFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedFragment$buildModels$1$1$2$4$3$1(ChannelInFeed channelInFeed, FeedFragment feedFragment) {
        super(1);
        this.c = channelInFeed;
        this.d = feedFragment;
    }

    public Object invoke(Object obj) {
        m0 m0Var = (m0) obj;
        m0.n.b.i.e(m0Var, "$this$popUpMenu");
        m0Var.a(R.menu.menu_channel_feed);
        String str = this.c.b2;
        if (str == null || str.length() == 0) {
            MenuItem findItem = m0Var.b.findItem(R.id.report_room_title);
            m0.n.b.i.d(findItem, "menu.findItem(R.id.report_room_title)");
            k.o(findItem);
        }
        m0Var.e = new d(this.d, this.c);
        return i.a;
    }
}
