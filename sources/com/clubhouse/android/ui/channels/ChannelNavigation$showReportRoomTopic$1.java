package com.clubhouse.android.ui.channels;

import android.net.Uri;
import android.os.Bundle;
import com.clubhouse.android.data.models.local.ReportTarget;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryArgs;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryContainerFragment;
import com.clubhouse.android.user.model.User;
import h0.o.a.c0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelNavigation.kt */
public final class ChannelNavigation$showReportRoomTopic$1 extends Lambda implements l<c0, i> {
    public final /* synthetic */ Channel c;
    public final /* synthetic */ Uri d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelNavigation$showReportRoomTopic$1(Channel channel, Uri uri) {
        super(1);
        this.c = channel;
        this.d = uri;
    }

    public Object invoke(Object obj) {
        c0 c0Var = (c0) obj;
        m0.n.b.i.e(c0Var, "$this$commitSafe");
        ReportIncidentSelectCategoryArgs reportIncidentSelectCategoryArgs = new ReportIncidentSelectCategoryArgs((User) null, this.c.e(), this.c, (String) null, (Integer) null, this.d, ReportTarget.CHANNEL_TOPIC, 25);
        m0.n.b.i.e(reportIncidentSelectCategoryArgs, "arg");
        Bundle bundle = new Bundle();
        bundle.putParcelable("mavericks:arg", reportIncidentSelectCategoryArgs);
        c0Var.c(c0Var.k(ReportIncidentSelectCategoryContainerFragment.class, bundle), (String) null);
        return i.a;
    }
}
