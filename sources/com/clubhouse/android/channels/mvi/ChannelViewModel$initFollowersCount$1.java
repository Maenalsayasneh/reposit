package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.e.b.z2.g.k;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$initFollowersCount$1 extends Lambda implements l<i0.e.b.z2.g.l, i0.e.b.z2.g.l> {
    public final /* synthetic */ ChannelViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$initFollowersCount$1(ChannelViewModel channelViewModel) {
        super(1);
        this.c = channelViewModel;
    }

    public Object invoke(Object obj) {
        i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
        i.e(lVar, "$this$setState");
        return i0.e.b.z2.g.l.copy$default(lVar, (k) null, (SourceLocation) null, false, false, false, (List) null, false, 0, 0, false, false, this.c.t.d.f.getValue().intValue(), (List) null, false, false, 30719, (Object) null);
    }
}
