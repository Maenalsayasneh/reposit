package com.clubhouse.backchannel.inbox;

import android.widget.TextView;
import com.clubhouse.backchannel.R;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabLayout;
import i0.e.c.h.k;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: BackchannelInboxFragment.kt */
public final class BackchannelInboxFragment$invalidate$1 extends Lambda implements l<k, i> {
    public final /* synthetic */ BackchannelInboxFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelInboxFragment$invalidate$1(BackchannelInboxFragment backchannelInboxFragment) {
        super(1);
        this.c = backchannelInboxFragment;
    }

    public Object invoke(Object obj) {
        int i;
        BackchannelInboxFragment backchannelInboxFragment;
        BadgeDrawable badgeDrawable;
        k kVar = (k) obj;
        m0.n.b.i.e(kVar, "state");
        BackchannelInboxFragment backchannelInboxFragment2 = this.c;
        m0.r.k<Object>[] kVarArr = BackchannelInboxFragment.Z1;
        backchannelInboxFragment2.O0().e.setRefreshing(kVar.c);
        boolean z = !kVar.c && !kVar.d && ((kVar.g == ChatDestination.CHATS && kVar.a.isEmpty()) || (kVar.g == ChatDestination.REQUESTS && kVar.b.isEmpty()));
        TextView textView = this.c.O0().c;
        m0.n.b.i.d(textView, "binding.emptyView");
        i0.e.b.d3.k.L(textView, Boolean.valueOf(z));
        TextView textView2 = this.c.O0().c;
        if (kVar.g == ChatDestination.CHATS) {
            backchannelInboxFragment = this.c;
            i = R.string.inbox_empty;
        } else {
            backchannelInboxFragment = this.c;
            i = R.string.requests_empty;
        }
        textView2.setText(backchannelInboxFragment.getString(i));
        this.c.O0().d.g();
        TabLayout.g h = this.c.O0().g.h(ChatDestination.REQUESTS.getIndex());
        if (h == null) {
            badgeDrawable = null;
        } else {
            badgeDrawable = h.g.getBadge();
        }
        if (badgeDrawable != null) {
            badgeDrawable.l(kVar.e);
        }
        this.c.O0().g.l(this.c.O0().g.h(kVar.g.getIndex()), true);
        return i.a;
    }
}
