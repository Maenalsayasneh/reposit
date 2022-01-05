package com.clubhouse.android.ui.channels;

import android.os.Bundle;
import com.clubhouse.android.ui.channels.users.search.SearchInRoomFragment;
import h0.o.a.c0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelNavigation.kt */
public final class ChannelNavigation$showRoomSearch$1 extends Lambda implements l<c0, i> {
    public static final ChannelNavigation$showRoomSearch$1 c = new ChannelNavigation$showRoomSearch$1();

    public ChannelNavigation$showRoomSearch$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        c0 c0Var = (c0) obj;
        m0.n.b.i.e(c0Var, "$this$commitSafe");
        c0Var.c(c0Var.k(SearchInRoomFragment.class, (Bundle) null), (String) null);
        return i.a;
    }
}
