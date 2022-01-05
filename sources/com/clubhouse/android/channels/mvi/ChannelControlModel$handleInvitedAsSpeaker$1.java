package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.channels.rtc.Sound;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.ChannelUserMessage;
import com.clubhouse.android.data.models.local.channel.ClipsPermission;
import com.clubhouse.android.data.models.local.channel.HandraisePermission;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.e.b.b3.a.a.c.a;
import i0.e.b.b3.a.a.c.d;
import i0.e.b.z2.g.g1;
import i0.e.b.z2.g.k;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: ChannelControlModel.kt */
public final class ChannelControlModel$handleInvitedAsSpeaker$1 extends Lambda implements l<k, i> {
    public final /* synthetic */ ChannelControlModel c;
    public final /* synthetic */ ChannelUserMessage d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelControlModel$handleInvitedAsSpeaker$1(ChannelControlModel channelControlModel, ChannelUserMessage channelUserMessage) {
        super(1);
        this.c = channelControlModel;
        this.d = channelUserMessage;
    }

    public Object invoke(Object obj) {
        k kVar = (k) obj;
        m0.n.b.i.e(kVar, "it");
        if (!kVar.d.i(this.c.q.a)) {
            final ChannelControlModel channelControlModel = this.c;
            channelControlModel.m(new l<k, k>() {
                public Object invoke(Object obj) {
                    k kVar = (k) obj;
                    m0.n.b.i.e(kVar, "$this$setState");
                    a aVar = kVar.d;
                    return k.copy$default(kVar, (String) null, (Channel) null, (SourceLocation) null, a.c(aVar, (UserInChannel) null, (Map) null, g.e0(aVar.c, Integer.valueOf(ChannelControlModel.this.q.a)), (Set) null, (Set) null, false, (Integer) null, (Set) null, (Set) null, (Set) null, 1019), (d) null, false, false, false, false, (HandraisePermission) null, (ClipsPermission) null, (List) null, false, 0, false, false, false, 131063, (Object) null);
                }
            });
            a aVar = kVar.d;
            Integer num = this.d.b;
            m0.n.b.i.c(num);
            UserInChannel k = aVar.k(num.intValue());
            if (k != null) {
                ChannelControlModel channelControlModel2 = this.c;
                channelControlModel2.s(Sound.CHIME_POP);
                channelControlModel2.o(new g1(k));
            }
        }
        return i.a;
    }
}
