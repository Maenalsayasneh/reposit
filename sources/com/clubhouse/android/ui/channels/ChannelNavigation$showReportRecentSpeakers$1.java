package com.clubhouse.android.ui.channels;

import android.net.Uri;
import android.os.Bundle;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.ui.channels.users.recent.RecentlyDepartedSpeakersArgs;
import com.clubhouse.android.ui.channels.users.recent.RecentlyDepartedSpeakersFragment;
import h0.o.a.c0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelNavigation.kt */
public final class ChannelNavigation$showReportRecentSpeakers$1 extends Lambda implements l<c0, i> {
    public final /* synthetic */ List<UserInChannel> c;
    public final /* synthetic */ Channel d;
    public final /* synthetic */ Uri q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelNavigation$showReportRecentSpeakers$1(List<UserInChannel> list, Channel channel, Uri uri) {
        super(1);
        this.c = list;
        this.d = channel;
        this.q = uri;
    }

    public Object invoke(Object obj) {
        c0 c0Var = (c0) obj;
        m0.n.b.i.e(c0Var, "$this$commitSafe");
        RecentlyDepartedSpeakersArgs recentlyDepartedSpeakersArgs = new RecentlyDepartedSpeakersArgs(this.c, this.d, this.q);
        m0.n.b.i.e(recentlyDepartedSpeakersArgs, "arg");
        Bundle bundle = new Bundle();
        bundle.putParcelable("mavericks:arg", recentlyDepartedSpeakersArgs);
        c0Var.c(c0Var.k(RecentlyDepartedSpeakersFragment.class, bundle), (String) null);
        return i.a;
    }
}
