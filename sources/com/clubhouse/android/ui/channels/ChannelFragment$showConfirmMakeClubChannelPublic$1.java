package com.clubhouse.android.ui.channels;

import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.data.models.local.club.ClubRule;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.k.c0;
import i0.e.b.g3.k.d0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$showConfirmMakeClubChannelPublic$1 extends Lambda implements l<i0.e.b.z2.g.l, i> {
    public final /* synthetic */ ChannelFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$showConfirmMakeClubChannelPublic$1(ChannelFragment channelFragment) {
        super(1);
        this.c = channelFragment;
    }

    public Object invoke(Object obj) {
        final int i;
        Club i2;
        i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
        m0.n.b.i.e(lVar, "state");
        if (lVar.v || lVar.w) {
            i = R.string.confirm_room_public_club_admin;
        } else {
            Channel channel = lVar.u;
            List<ClubRule> list = null;
            if (!(channel == null || (i2 = channel.i()) == null)) {
                list = i2.b0();
            }
            i = list != null ? R.string.confirm_room_public_club_with_rules : R.string.confirm_room_public_club;
        }
        final ChannelFragment channelFragment = this.c;
        AnonymousClass1 r1 = new l<d.a, i>() {
            public Object invoke(Object obj) {
                d.a aVar = (d.a) obj;
                m0.n.b.i.e(aVar, "$this$alertDialog");
                aVar.e(R.string.confirm_room_public_dialog_title);
                aVar.b(i);
                aVar.c(R.string.never_mind, c0.c);
                aVar.d(R.string.yup, new d0(channelFragment));
                return i.a;
            }
        };
        m0.n.b.i.e(channelFragment, "<this>");
        m0.n.b.i.e(r1, "f");
        d.a aVar = new d.a(channelFragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
        r1.invoke(aVar);
        aVar.g();
        return i.a;
    }
}
