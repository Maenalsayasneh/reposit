package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.channels.analytics.LeaveReason;
import com.clubhouse.android.channels.rtc.Sound;
import com.clubhouse.android.data.models.local.channel.AllUserMessage;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.ClipsPermission;
import com.clubhouse.android.data.models.local.channel.HandraisePermission;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.e.b.b3.a.a.c.a;
import i0.e.b.b3.a.a.c.b;
import i0.e.b.b3.a.a.c.d;
import i0.e.b.z2.g.c0;
import i0.e.b.z2.g.k;
import i0.e.b.z2.g.q0;
import i0.e.b.z2.g.s0;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: ChannelControlModel.kt */
public final class ChannelControlModel$handleBatchMessages$1 extends Lambda implements l<k, i> {
    public final /* synthetic */ List<b> c;
    public final /* synthetic */ ChannelControlModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelControlModel$handleBatchMessages$1(List<? extends b> list, ChannelControlModel channelControlModel) {
        super(1);
        this.c = list;
        this.d = channelControlModel;
    }

    public Object invoke(Object obj) {
        a c2;
        T t = (k) obj;
        m0.n.b.i.e(t, "currentState");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.c = t;
        for (b next : this.c) {
            int ordinal = next.b().ordinal();
            if (ordinal == 1) {
                AllUserMessage allUserMessage = (AllUserMessage) next;
                UserInChannel userInChannel = allUserMessage.c;
                if (userInChannel != null) {
                    ChannelControlModel channelControlModel = this.d;
                    k kVar = (k) ref$ObjectRef.c;
                    a aVar = kVar.d;
                    Objects.requireNonNull(aVar);
                    m0.n.b.i.e(userInChannel, "user");
                    if (userInChannel.Z1) {
                        c2 = a.c(aVar, (UserInChannel) null, g.c0(aVar.b, new Pair(userInChannel.getId(), userInChannel)), (Set) null, g.e0(aVar.d, userInChannel.getId()), (Set) null, true, (Integer) null, g.e0(aVar.h, userInChannel.getId()), (Set) null, (Set) null, 853);
                    } else if (userInChannel.Y1) {
                        c2 = a.c(aVar, (UserInChannel) null, g.c0(aVar.b, new Pair(userInChannel.getId(), userInChannel)), (Set) null, (Set) null, (Set) null, true, (Integer) null, g.e0(aVar.h, userInChannel.getId()), (Set) null, (Set) null, 861);
                    } else if (userInChannel.b2) {
                        c2 = a.c(aVar, (UserInChannel) null, g.c0(aVar.b, new Pair(userInChannel.getId(), userInChannel)), (Set) null, (Set) null, (Set) null, true, (Integer) null, (Set) null, g.e0(aVar.i, userInChannel.getId()), (Set) null, 733);
                    } else {
                        c2 = a.c(aVar, (UserInChannel) null, g.c0(aVar.b, new Pair(userInChannel.getId(), userInChannel)), (Set) null, (Set) null, (Set) null, true, (Integer) null, (Set) null, (Set) null, g.e0(aVar.j, userInChannel.getId()), 477);
                    }
                    ref$ObjectRef.c = k.copy$default(kVar, (String) null, (Channel) null, (SourceLocation) null, c2, (d) null, false, false, false, false, (HandraisePermission) null, (ClipsPermission) null, (List) null, false, 0, false, false, false, 131063, (Object) null);
                    Objects.requireNonNull(channelControlModel);
                    UserInChannel userInChannel2 = allUserMessage.c;
                    if (!(userInChannel2 == null || userInChannel2.getId().intValue() == channelControlModel.q.a)) {
                        channelControlModel.n(new ChannelControlModel$handleUserJoinedChannel$1(userInChannel2, channelControlModel, allUserMessage));
                    }
                }
            } else if (ordinal == 2) {
                Integer a = next.a();
                if (a != null) {
                    ChannelControlModel channelControlModel2 = this.d;
                    int intValue = a.intValue();
                    k kVar2 = (k) ref$ObjectRef.c;
                    a aVar2 = kVar2.d;
                    ref$ObjectRef.c = k.copy$default(kVar2, (String) null, (Channel) null, (SourceLocation) null, a.c(aVar2, (UserInChannel) null, g.R(aVar2.b, Integer.valueOf(intValue)), g.T(aVar2.c, Integer.valueOf(intValue)), g.T(aVar2.d, Integer.valueOf(intValue)), aVar2.b(aVar2.b.get(Integer.valueOf(intValue))), false, (Integer) null, g.T(aVar2.h, Integer.valueOf(intValue)), g.T(aVar2.i, Integer.valueOf(intValue)), g.T(aVar2.j, Integer.valueOf(intValue)), 97), ((k) ref$ObjectRef.c).e.b(intValue), false, false, false, false, (HandraisePermission) null, (ClipsPermission) null, (List) null, false, 0, false, false, false, 131047, (Object) null);
                    if (intValue == channelControlModel2.q.a) {
                        channelControlModel2.p(new c0(LeaveReason.PUBNUB_LEAVE));
                    }
                }
            } else if (ordinal == 3) {
                UserInChannel userInChannel3 = ((AllUserMessage) next).c;
                if (userInChannel3 != null) {
                    k kVar3 = (k) ref$ObjectRef.c;
                    a aVar3 = kVar3.d;
                    Objects.requireNonNull(aVar3);
                    m0.n.b.i.e(userInChannel3, "user");
                    ref$ObjectRef.c = k.copy$default(kVar3, (String) null, (Channel) null, (SourceLocation) null, a.c(aVar3, (UserInChannel) null, g.c0(aVar3.b, new Pair(userInChannel3.getId(), userInChannel3)), g.T(aVar3.c, userInChannel3.getId()), (Set) null, g.T(aVar3.e, userInChannel3), false, (Integer) null, g.e0(aVar3.h, userInChannel3.getId()), g.T(aVar3.i, userInChannel3.getId()), g.T(aVar3.j, userInChannel3.getId()), 105), ((k) ref$ObjectRef.c).e.b(userInChannel3.getId().intValue()), false, false, false, false, (HandraisePermission) null, (ClipsPermission) null, (List) null, false, 0, false, false, false, 131047, (Object) null);
                }
            } else if (ordinal == 4) {
                Integer a2 = next.a();
                if (a2 != null) {
                    ChannelControlModel channelControlModel3 = this.d;
                    int intValue2 = a2.intValue();
                    k kVar4 = (k) ref$ObjectRef.c;
                    ref$ObjectRef.c = k.copy$default(kVar4, (String) null, (Channel) null, (SourceLocation) null, kVar4.d.j(intValue2), (d) null, false, false, false, false, (HandraisePermission) null, (ClipsPermission) null, (List) null, false, 0, false, false, false, 131063, (Object) null);
                    if (intValue2 == channelControlModel3.q.a) {
                        channelControlModel3.o(q0.a);
                    }
                }
            } else if (ordinal != 9) {
                v0.a.a.d.w("Message %s not handled as batch, message", next.toString());
            } else {
                Integer num = ((AllUserMessage) next).b;
                if (num != null) {
                    ChannelControlModel channelControlModel4 = this.d;
                    int intValue3 = num.intValue();
                    k kVar5 = (k) ref$ObjectRef.c;
                    ref$ObjectRef.c = k.copy$default(kVar5, (String) null, (Channel) null, (SourceLocation) null, kVar5.d.a(intValue3), (d) null, false, false, false, false, (HandraisePermission) null, (ClipsPermission) null, (List) null, false, 0, false, false, false, 131063, (Object) null);
                    if (intValue3 == channelControlModel4.q.a) {
                        channelControlModel4.s(Sound.CHIME_POP);
                        channelControlModel4.o(new s0(next));
                    }
                }
            }
        }
        this.d.m(new l<k, k>() {
            public Object invoke(Object obj) {
                m0.n.b.i.e((k) obj, "$this$setState");
                return (k) ref$ObjectRef.c;
            }
        });
        return i.a;
    }
}
