package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.data.models.local.channel.AllUserMessage;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import i0.e.b.z2.g.k;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelControlModel.kt */
public final class ChannelControlModel$handleUserJoinedChannel$1 extends Lambda implements l<k, i> {
    public final /* synthetic */ UserInChannel c;
    public final /* synthetic */ ChannelControlModel d;
    public final /* synthetic */ AllUserMessage q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelControlModel$handleUserJoinedChannel$1(UserInChannel userInChannel, ChannelControlModel channelControlModel, AllUserMessage allUserMessage) {
        super(1);
        this.c = userInChannel;
        this.d = channelControlModel;
        this.q = allUserMessage;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004f, code lost:
        if (r7.d.c.contains(java.lang.Integer.valueOf(r6.c.getId().intValue())) == false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            i0.e.b.z2.g.k r7 = (i0.e.b.z2.g.k) r7
            java.lang.String r0 = "state"
            m0.n.b.i.e(r7, r0)
            com.clubhouse.android.data.models.local.user.BasicUser r0 = r7.c()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0010
            goto L_0x0026
        L_0x0010:
            java.lang.Integer r0 = r0.getId()
            int r0 = r0.intValue()
            com.clubhouse.android.data.models.local.channel.UserInChannel r3 = r6.c
            java.lang.Integer r3 = r3.getId()
            int r3 = r3.intValue()
            if (r0 != r3) goto L_0x0026
            r0 = r1
            goto L_0x0027
        L_0x0026:
            r0 = r2
        L_0x0027:
            i0.e.b.b3.a.a.c.a r3 = r7.d
            com.clubhouse.android.data.models.local.channel.UserInChannel r4 = r6.c
            java.lang.Integer r4 = r4.getId()
            int r4 = r4.intValue()
            boolean r3 = r3.i(r4)
            if (r3 != 0) goto L_0x0052
            i0.e.b.b3.a.a.c.a r4 = r7.d
            com.clubhouse.android.data.models.local.channel.UserInChannel r5 = r6.c
            java.lang.Integer r5 = r5.getId()
            int r5 = r5.intValue()
            java.util.Set<java.lang.Integer> r4 = r4.c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r1 = r2
        L_0x0053:
            i0.e.b.b3.a.a.c.a r2 = r7.d
            boolean r2 = r2.f()
            if (r2 == 0) goto L_0x0073
            if (r0 == 0) goto L_0x0073
            if (r1 == 0) goto L_0x0073
            com.clubhouse.android.channels.mvi.ChannelControlModel r7 = r6.d
            com.clubhouse.android.channels.rtc.Sound r0 = com.clubhouse.android.channels.rtc.Sound.CHIME_ENTER
            r7.s(r0)
            com.clubhouse.android.channels.mvi.ChannelControlModel r7 = r6.d
            i0.e.b.z2.g.m1 r0 = new i0.e.b.z2.g.m1
            com.clubhouse.android.data.models.local.channel.UserInChannel r1 = r6.c
            r0.<init>(r1)
            r7.o(r0)
            goto L_0x00d0
        L_0x0073:
            i0.e.b.b3.a.a.c.a r0 = r7.d
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x00d0
            com.clubhouse.android.channels.mvi.ChannelControlModel r0 = r6.d
            com.clubhouse.android.data.repos.UserRepo r0 = r0.n
            com.clubhouse.android.data.models.local.channel.UserInChannel r1 = r6.c
            java.lang.Integer r1 = r1.getId()
            int r1 = r1.intValue()
            boolean r0 = r0.t(r1)
            if (r0 == 0) goto L_0x00d0
            if (r3 != 0) goto L_0x00d0
            java.util.List<java.lang.Integer> r0 = r7.l
            com.clubhouse.android.data.models.local.channel.UserInChannel r1 = r6.c
            java.lang.Integer r1 = r1.getId()
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x00d0
            com.clubhouse.android.channels.mvi.ChannelControlModel r0 = r6.d
            i0.e.b.z2.g.s0 r1 = new i0.e.b.z2.g.s0
            com.clubhouse.android.data.models.local.channel.AllUserMessage r2 = r6.q
            r1.<init>(r2)
            r0.o(r1)
            com.clubhouse.android.channels.mvi.ChannelControlModel r0 = r6.d
            com.clubhouse.android.channels.mvi.ChannelControlModel$handleUserJoinedChannel$1$1 r1 = new com.clubhouse.android.channels.mvi.ChannelControlModel$handleUserJoinedChannel$1$1
            com.clubhouse.android.data.models.local.channel.UserInChannel r2 = r6.c
            r1.<init>()
            r0.m(r1)
            i0.e.b.b3.a.a.c.a r0 = r7.d
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x00d0
            i0.e.b.b3.a.a.c.a r7 = r7.d
            int r7 = r7.d()
            r0 = 10
            if (r7 >= r0) goto L_0x00d0
            com.clubhouse.android.channels.mvi.ChannelControlModel r7 = r6.d
            com.clubhouse.android.channels.rtc.Sound r0 = com.clubhouse.android.channels.rtc.Sound.CHIME_POP
            r7.s(r0)
        L_0x00d0:
            m0.i r7 = m0.i.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.channels.mvi.ChannelControlModel$handleUserJoinedChannel$1.invoke(java.lang.Object):java.lang.Object");
    }
}
