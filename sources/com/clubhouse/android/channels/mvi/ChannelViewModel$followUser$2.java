package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.channels.R;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.user.model.User;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.a3.b.e;
import i0.e.b.z2.g.l;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$followUser$2 extends Lambda implements p<l, b<? extends EmptySuccessResponse>, l> {
    public final /* synthetic */ ChannelViewModel c;
    public final /* synthetic */ User d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$followUser$2(ChannelViewModel channelViewModel, User user) {
        super(2);
        this.c = channelViewModel;
        this.d = user;
    }

    public Object invoke(Object obj, Object obj2) {
        l lVar = (l) obj;
        b bVar = (b) obj2;
        i.e(lVar, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            ChannelViewModel channelViewModel = this.c;
            String string = channelViewModel.p.getString(R.string.follow_success, new Object[]{this.d.F()});
            i.d(string, "resources.getString(R.string.follow_success, user.firstName())");
            channelViewModel.o(new e(string));
        }
        if (bVar instanceof c) {
            ChannelViewModel channelViewModel2 = this.c;
            channelViewModel2.o(new d(channelViewModel2.p.getString(R.string.follow_error, new Object[]{this.d.F()})));
        }
        return lVar;
    }
}
