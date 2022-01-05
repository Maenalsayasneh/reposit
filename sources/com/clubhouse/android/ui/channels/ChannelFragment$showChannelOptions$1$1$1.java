package com.clubhouse.android.ui.channels;

import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.ui.actionsheet.ActionSheetBuilder;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$showChannelOptions$1$1$1 extends Lambda implements l<ActionSheetBuilder, i> {
    public final /* synthetic */ i0.e.b.z2.g.l c;
    public final /* synthetic */ Channel d;
    public final /* synthetic */ ChannelFragment q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$showChannelOptions$1$1$1(i0.e.b.z2.g.l lVar, Channel channel, ChannelFragment channelFragment) {
        super(1);
        this.c = lVar;
        this.d = channel;
        this.q = channelFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0059, code lost:
        r0 = r0.b0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            com.clubhouse.android.ui.actionsheet.ActionSheetBuilder r7 = (com.clubhouse.android.ui.actionsheet.ActionSheetBuilder) r7
            java.lang.String r0 = "$this$actionSheet"
            m0.n.b.i.e(r7, r0)
            r r0 = new r
            com.clubhouse.android.ui.channels.ChannelFragment r1 = r6.q
            com.clubhouse.android.data.models.local.channel.Channel r2 = r6.d
            r3 = 0
            r0.<init>(r3, r1, r2)
            r7.a(r0)
            i0.e.b.z2.g.l r0 = r6.c
            boolean r0 = r0.q
            if (r0 == 0) goto L_0x002c
            com.clubhouse.android.data.models.local.channel.Channel r0 = r6.d
            boolean r0 = h0.b0.v.G0(r0)
            if (r0 != 0) goto L_0x002c
            e r0 = new e
            com.clubhouse.android.ui.channels.ChannelFragment r1 = r6.q
            r0.<init>(r3, r1)
            r7.a(r0)
        L_0x002c:
            i0.e.b.z2.g.l r0 = r6.c
            java.util.List<com.clubhouse.android.data.models.local.channel.UserInChannel> r0 = r0.L
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0046
            com.clubhouse.android.ui.channels.ChannelFragment$showChannelOptions$1$1$1$3 r0 = new com.clubhouse.android.ui.channels.ChannelFragment$showChannelOptions$1$1$1$3
            com.clubhouse.android.ui.channels.ChannelFragment r2 = r6.q
            com.clubhouse.android.data.models.local.channel.Channel r4 = r6.d
            i0.e.b.z2.g.l r5 = r6.c
            r0.<init>(r4, r5)
            r7.a(r0)
        L_0x0046:
            e r0 = new e
            com.clubhouse.android.ui.channels.ChannelFragment r2 = r6.q
            r0.<init>(r1, r2)
            r7.a(r0)
            com.clubhouse.android.data.models.local.channel.Channel r0 = r6.d
            com.clubhouse.android.data.models.local.club.Club r0 = r0.i()
            if (r0 != 0) goto L_0x0059
            goto L_0x0069
        L_0x0059:
            java.util.List r0 = r0.b0()
            if (r0 != 0) goto L_0x0060
            goto L_0x0069
        L_0x0060:
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r1
            if (r0 != r1) goto L_0x0069
            r0 = r1
            goto L_0x006a
        L_0x0069:
            r0 = r3
        L_0x006a:
            if (r0 == 0) goto L_0x0078
            r r0 = new r
            com.clubhouse.android.ui.channels.ChannelFragment r2 = r6.q
            com.clubhouse.android.data.models.local.channel.Channel r4 = r6.d
            r0.<init>(r1, r2, r4)
            r7.a(r0)
        L_0x0078:
            i0.e.b.z2.g.l r0 = r6.c
            i0.e.b.z2.g.k r2 = r0.a
            boolean r2 = r2.o
            r4 = 2
            if (r2 == 0) goto L_0x008b
            r r2 = new r
            com.clubhouse.android.ui.channels.ChannelFragment r5 = r6.q
            r2.<init>(r4, r5, r0)
            r7.a(r2)
        L_0x008b:
            i0.e.b.z2.g.l r0 = r6.c
            com.clubhouse.android.data.models.local.channel.Channel r0 = r0.u
            if (r0 != 0) goto L_0x0093
            r0 = 0
            goto L_0x0097
        L_0x0093:
            java.lang.String r0 = r0.u0()
        L_0x0097:
            if (r0 == 0) goto L_0x009f
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00a0
        L_0x009f:
            r3 = r1
        L_0x00a0:
            if (r3 != 0) goto L_0x00af
            r r0 = new r
            com.clubhouse.android.ui.channels.ChannelFragment r1 = r6.q
            i0.e.b.z2.g.l r2 = r6.c
            r3 = 3
            r0.<init>(r3, r1, r2)
            r7.a(r0)
        L_0x00af:
            i0.e.b.z2.g.l r0 = r6.c
            boolean r1 = r0.q
            if (r1 != 0) goto L_0x00b9
            boolean r0 = r0.v
            if (r0 == 0) goto L_0x00c3
        L_0x00b9:
            e r0 = new e
            com.clubhouse.android.ui.channels.ChannelFragment r1 = r6.q
            r0.<init>(r4, r1)
            r7.a(r0)
        L_0x00c3:
            m0.i r7 = m0.i.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.channels.ChannelFragment$showChannelOptions$1$1$1.invoke(java.lang.Object):java.lang.Object");
    }
}
