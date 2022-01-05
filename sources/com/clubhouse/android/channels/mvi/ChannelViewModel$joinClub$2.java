package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.channels.R;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.data.models.remote.response.JoinClubResponse;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.a3.b.e;
import i0.e.b.z2.g.j0;
import i0.e.b.z2.g.l;
import i0.e.b.z2.g.n;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$joinClub$2 extends Lambda implements p<l, b<? extends JoinClubResponse>, l> {
    public final /* synthetic */ ChannelViewModel c;
    public final /* synthetic */ Club d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$joinClub$2(ChannelViewModel channelViewModel, Club club) {
        super(2);
        this.c = channelViewModel;
        this.d = club;
    }

    public Object invoke(Object obj, Object obj2) {
        l lVar = (l) obj;
        b bVar = (b) obj2;
        i.e(lVar, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            ChannelViewModel channelViewModel = this.c;
            String string = channelViewModel.p.getString(R.string.join_club_success_full, new Object[]{this.d.getName()});
            i.d(string, "resources.getString(R.string.join_club_success_full, club.name)");
            channelViewModel.o(new e(string));
            this.c.r.p(n.a);
            this.c.p(j0.a);
        }
        if (bVar instanceof c) {
            ChannelViewModel channelViewModel2 = this.c;
            channelViewModel2.o(new d(channelViewModel2.p.getString(R.string.join_club_error, new Object[]{this.d.getName()})));
        }
        return lVar;
    }
}
