package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.channels.rtc.Sound;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.ClipsPermission;
import com.clubhouse.android.data.models.local.channel.HandraisePermission;
import com.clubhouse.android.data.models.local.channel.SpeakerMessage;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.e.b.b3.a.a.c.a;
import i0.e.b.b3.a.a.c.d;
import i0.e.b.z2.g.f1;
import i0.e.b.z2.g.k;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: ChannelControlModel.kt */
public final class ChannelControlModel$handleHandRaised$1 extends Lambda implements l<k, i> {
    public final /* synthetic */ ChannelControlModel c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ SpeakerMessage q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelControlModel$handleHandRaised$1(ChannelControlModel channelControlModel, Integer num, SpeakerMessage speakerMessage) {
        super(1);
        this.c = channelControlModel;
        this.d = num;
        this.q = speakerMessage;
    }

    public Object invoke(Object obj) {
        k kVar = (k) obj;
        m0.n.b.i.e(kVar, "state");
        ChannelControlModel channelControlModel = this.c;
        final Integer num = this.d;
        channelControlModel.m(new l<k, k>() {
            public Object invoke(Object obj) {
                k kVar = (k) obj;
                m0.n.b.i.e(kVar, "$this$setState");
                d dVar = kVar.e;
                int intValue = num.intValue();
                return k.copy$default(kVar, (String) null, (Channel) null, (SourceLocation) null, (a) null, d.a(dVar, g.e0(dVar.a, Integer.valueOf(intValue)), g.e0(dVar.b, Integer.valueOf(intValue)), (Set) null, 4), false, false, false, false, (HandraisePermission) null, (ClipsPermission) null, (List) null, false, 0, false, false, false, 131055, (Object) null);
            }
        });
        if (kVar.d.f()) {
            if ((!kVar.e.b.contains(Integer.valueOf(this.d.intValue())) || this.c.n.t(this.d.intValue())) && (kVar.e.c() <= 3 || this.c.n.t(this.d.intValue()))) {
                UserInChannel userInChannel = this.q.b;
                if (userInChannel != null) {
                    this.c.o(new f1(userInChannel));
                }
                if (this.c.n.t(this.d.intValue())) {
                    this.c.s(Sound.CHIME_POP);
                }
            }
        }
        return i.a;
    }
}
