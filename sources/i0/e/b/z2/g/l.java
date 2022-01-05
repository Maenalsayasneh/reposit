package i0.e.b.z2.g;

import androidx.recyclerview.widget.RecyclerView;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.HandraisePermission;
import com.clubhouse.android.data.models.local.channel.PromptField;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.b.b.j;
import i0.e.b.b3.a.a.c.a;
import i0.e.b.b3.a.a.c.d;
import java.util.List;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: ChannelViewState.kt */
public final class l implements j {
    public final boolean A;
    public final BasicUser B;
    public final d C;
    public final boolean D;
    public final HandraisePermission E;
    public final List<UserInChannel> F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final List<Integer> K;
    public final List<UserInChannel> L;
    public final String M;
    public final String N;
    public final String O;
    public final String P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final boolean V;
    public final int W;
    public final k a;
    public final SourceLocation b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List<Integer> f;
    public final boolean g;
    public final long h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final List<PromptField> m;
    public final boolean n;
    public final boolean o;
    public final a p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final String t;
    public final Channel u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    /* JADX WARNING: Code restructure failed: missing block: B:188:0x02fc, code lost:
        if ((r5 != null && r2.e(r5.intValue())) == false) goto L_0x0300;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0298 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0307  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(i0.e.b.z2.g.k r10, com.clubhouse.android.data.models.local.user.SourceLocation r11, boolean r12, boolean r13, boolean r14, java.util.List<java.lang.Integer> r15, boolean r16, long r17, int r19, boolean r20, boolean r21, int r22, java.util.List<? extends com.clubhouse.android.data.models.local.channel.PromptField> r23, boolean r24, boolean r25) {
        /*
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r15
            r4 = r23
            java.lang.String r5 = "channelState"
            m0.n.b.i.e(r10, r5)
            java.lang.String r5 = "sourceLocation"
            m0.n.b.i.e(r11, r5)
            java.lang.String r5 = "blockedUsersInChannel"
            m0.n.b.i.e(r15, r5)
            java.lang.String r5 = "editProfilePrompts"
            m0.n.b.i.e(r4, r5)
            r9.<init>()
            r0.a = r1
            r0.b = r2
            r2 = r12
            r0.c = r2
            r2 = r13
            r0.d = r2
            r2 = r14
            r0.e = r2
            r0.f = r3
            r2 = r16
            r0.g = r2
            r2 = r17
            r0.h = r2
            r2 = r19
            r0.i = r2
            r2 = r20
            r0.j = r2
            r2 = r21
            r0.k = r2
            r2 = r22
            r0.l = r2
            r0.m = r4
            r2 = r24
            r0.n = r2
            r2 = r25
            r0.o = r2
            i0.e.b.b3.a.a.c.a r2 = r1.d
            r0.p = r2
            boolean r3 = r2.f()
            r0.q = r3
            boolean r3 = r2.g()
            r0.r = r3
            int r2 = r2.d()
            int r2 = r2 + -1
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x006a
            r2 = r3
            goto L_0x006b
        L_0x006a:
            r2 = r4
        L_0x006b:
            r0.s = r2
            java.lang.String r2 = r1.a
            r0.t = r2
            com.clubhouse.android.data.models.local.channel.Channel r2 = r1.b
            r0.u = r2
            boolean r5 = r2 instanceof com.clubhouse.android.data.models.local.channel.ChannelInRoom
            if (r5 == 0) goto L_0x0084
            r6 = r2
            com.clubhouse.android.data.models.local.channel.ChannelInRoom r6 = (com.clubhouse.android.data.models.local.channel.ChannelInRoom) r6
            boolean r6 = r6.H()
            if (r6 == 0) goto L_0x0084
            r6 = r3
            goto L_0x0085
        L_0x0084:
            r6 = r4
        L_0x0085:
            r0.v = r6
            if (r5 == 0) goto L_0x0094
            r6 = r2
            com.clubhouse.android.data.models.local.channel.ChannelInRoom r6 = (com.clubhouse.android.data.models.local.channel.ChannelInRoom) r6
            boolean r6 = r6.D0()
            if (r6 == 0) goto L_0x0094
            r6 = r3
            goto L_0x0095
        L_0x0094:
            r6 = r4
        L_0x0095:
            r0.w = r6
            if (r5 == 0) goto L_0x00a4
            r6 = r2
            com.clubhouse.android.data.models.local.channel.ChannelInRoom r6 = (com.clubhouse.android.data.models.local.channel.ChannelInRoom) r6
            boolean r6 = r6.f()
            if (r6 == 0) goto L_0x00a4
            r6 = r3
            goto L_0x00a5
        L_0x00a4:
            r6 = r4
        L_0x00a5:
            r0.x = r6
            if (r5 == 0) goto L_0x00b4
            r5 = r2
            com.clubhouse.android.data.models.local.channel.ChannelInRoom r5 = (com.clubhouse.android.data.models.local.channel.ChannelInRoom) r5
            boolean r5 = r5.A0()
            if (r5 == 0) goto L_0x00b4
            r5 = r3
            goto L_0x00b5
        L_0x00b4:
            r5 = r4
        L_0x00b5:
            r0.y = r5
            if (r2 != 0) goto L_0x00ba
            goto L_0x00c0
        L_0x00ba:
            com.clubhouse.android.data.models.local.club.Club r5 = r2.i()
            if (r5 != 0) goto L_0x00c2
        L_0x00c0:
            r5 = r4
            goto L_0x00c6
        L_0x00c2:
            boolean r5 = r5.O()
        L_0x00c6:
            r0.z = r5
            if (r2 != 0) goto L_0x00cb
            goto L_0x00d1
        L_0x00cb:
            com.clubhouse.android.data.models.local.club.Club r2 = r2.i()
            if (r2 != 0) goto L_0x00d3
        L_0x00d1:
            r2 = r4
            goto L_0x00d7
        L_0x00d3:
            boolean r2 = r2.f0()
        L_0x00d7:
            r0.A = r2
            com.clubhouse.android.data.models.local.user.BasicUser r2 = r1.s
            r0.B = r2
            i0.e.b.b3.a.a.c.d r2 = r1.e
            r0.C = r2
            boolean r5 = r1.i
            r0.D = r5
            com.clubhouse.android.data.models.local.channel.HandraisePermission r1 = r1.j
            r0.E = r1
            java.util.Set<java.lang.Integer> r1 = r2.a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00f4:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0110
            java.lang.Object r5 = r1.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            i0.e.b.b3.a.a.c.a r6 = r0.p
            com.clubhouse.android.data.models.local.channel.UserInChannel r5 = r6.k(r5)
            if (r5 == 0) goto L_0x00f4
            r2.add(r5)
            goto L_0x00f4
        L_0x0110:
            r0.F = r2
            i0.e.b.z2.g.k r1 = r0.a
            boolean r1 = r1.a()
            r0.G = r1
            long r1 = java.lang.System.currentTimeMillis()
            i0.e.b.z2.g.k r5 = r0.a
            long r5 = r5.n
            long r1 = r1 - r5
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r6 = 60
            long r5 = r5.toMillis(r6)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0131
            r1 = r3
            goto L_0x0132
        L_0x0131:
            r1 = r4
        L_0x0132:
            r0.H = r1
            long r1 = java.lang.System.currentTimeMillis()
            long r5 = r0.h
            long r1 = r1 - r5
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MINUTES
            r6 = 2
            long r5 = r5.toMillis(r6)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0149
            r1 = r3
            goto L_0x014a
        L_0x0149:
            r1 = r4
        L_0x014a:
            r0.I = r1
            boolean r1 = r0.j
            if (r1 != 0) goto L_0x0158
            i0.e.b.z2.g.k r1 = r0.a
            boolean r1 = r1.u
            if (r1 == 0) goto L_0x0158
            r1 = r3
            goto L_0x0159
        L_0x0158:
            r1 = r4
        L_0x0159:
            r0.J = r1
            i0.e.b.b3.a.a.c.a r1 = r0.p
            boolean r1 = r1.h()
            if (r1 == 0) goto L_0x0166
            java.util.List<java.lang.Integer> r1 = r0.f
            goto L_0x018f
        L_0x0166:
            java.util.List<java.lang.Integer> r1 = r0.f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0171:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x018e
            java.lang.Object r5 = r1.next()
            r6 = r5
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            i0.e.b.b3.a.a.c.a r7 = r0.p
            boolean r6 = r7.i(r6)
            if (r6 == 0) goto L_0x0171
            r2.add(r5)
            goto L_0x0171
        L_0x018e:
            r1 = r2
        L_0x018f:
            r0.K = r1
            boolean r1 = r0.k
            if (r1 != 0) goto L_0x01bc
            i0.e.b.b3.a.a.c.a r1 = r0.p
            java.util.Set<com.clubhouse.android.data.models.local.channel.UserInChannel> r1 = r1.e
            java.lang.String r2 = "$this$reversed"
            m0.n.b.i.e(r1, r2)
            int r2 = r1.size()
            if (r2 > r3) goto L_0x01a9
            java.util.List r1 = m0.j.g.v0(r1)
            goto L_0x01b5
        L_0x01a9:
            java.util.List r1 = m0.j.g.z0(r1)
            java.lang.String r2 = "$this$reverse"
            m0.n.b.i.e(r1, r2)
            java.util.Collections.reverse(r1)
        L_0x01b5:
            r2 = 10
            java.util.List r1 = m0.j.g.p0(r1, r2)
            goto L_0x01be
        L_0x01bc:
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.c
        L_0x01be:
            r0.L = r1
            i0.e.b.z2.g.k r1 = r0.a
            com.clubhouse.android.data.models.local.channel.Channel r1 = r1.b
            boolean r2 = r1 instanceof com.clubhouse.android.data.models.local.channel.ChannelInRoom
            java.lang.String r5 = ""
            if (r2 == 0) goto L_0x01d1
            com.clubhouse.android.data.models.local.channel.ChannelInRoom r1 = (com.clubhouse.android.data.models.local.channel.ChannelInRoom) r1
            java.lang.String r1 = r1.G()
            goto L_0x01d2
        L_0x01d1:
            r1 = r5
        L_0x01d2:
            r0.M = r1
            i0.e.b.z2.g.k r2 = r0.a
            com.clubhouse.android.data.models.local.channel.Channel r2 = r2.b
            boolean r6 = r2 instanceof com.clubhouse.android.data.models.local.channel.ChannelInRoom
            if (r6 == 0) goto L_0x01e3
            com.clubhouse.android.data.models.local.channel.ChannelInRoom r2 = (com.clubhouse.android.data.models.local.channel.ChannelInRoom) r2
            java.lang.String r2 = r2.Z()
            goto L_0x01e4
        L_0x01e3:
            r2 = r5
        L_0x01e4:
            r0.N = r2
            i0.e.b.z2.g.k r6 = r0.a
            com.clubhouse.android.data.models.local.channel.Channel r6 = r6.b
            boolean r7 = r6 instanceof com.clubhouse.android.data.models.local.channel.ChannelInRoom
            if (r7 == 0) goto L_0x01f5
            com.clubhouse.android.data.models.local.channel.ChannelInRoom r6 = (com.clubhouse.android.data.models.local.channel.ChannelInRoom) r6
            java.lang.String r6 = r6.g0()
            goto L_0x01f6
        L_0x01f5:
            r6 = r5
        L_0x01f6:
            r0.O = r6
            i0.e.b.z2.g.k r7 = r0.a
            com.clubhouse.android.data.models.local.channel.Channel r7 = r7.b
            boolean r8 = r7 instanceof com.clubhouse.android.data.models.local.channel.ChannelInRoom
            if (r8 == 0) goto L_0x0206
            com.clubhouse.android.data.models.local.channel.ChannelInRoom r7 = (com.clubhouse.android.data.models.local.channel.ChannelInRoom) r7
            java.lang.String r5 = r7.w0()
        L_0x0206:
            r0.P = r5
            boolean r7 = r0.r
            if (r7 == 0) goto L_0x023e
            boolean r7 = r0.s
            if (r7 == 0) goto L_0x023e
            int r7 = r0.l
            if (r7 < 0) goto L_0x023e
            i0.e.b.z2.g.k r7 = r0.a
            boolean r7 = r7.t
            if (r7 != 0) goto L_0x023e
            i0.e.b.b3.a.a.c.a r7 = r0.p
            boolean r7 = r7.f
            if (r7 != 0) goto L_0x023e
            if (r1 == 0) goto L_0x022b
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0229
            goto L_0x022b
        L_0x0229:
            r1 = r4
            goto L_0x022c
        L_0x022b:
            r1 = r3
        L_0x022c:
            if (r1 != 0) goto L_0x023e
            if (r2 == 0) goto L_0x0239
            int r1 = r2.length()
            if (r1 != 0) goto L_0x0237
            goto L_0x0239
        L_0x0237:
            r1 = r4
            goto L_0x023a
        L_0x0239:
            r1 = r3
        L_0x023a:
            if (r1 != 0) goto L_0x023e
            r1 = r3
            goto L_0x023f
        L_0x023e:
            r1 = r4
        L_0x023f:
            r0.Q = r1
            if (r6 == 0) goto L_0x024c
            int r1 = r6.length()
            if (r1 != 0) goto L_0x024a
            goto L_0x024c
        L_0x024a:
            r1 = r4
            goto L_0x024d
        L_0x024c:
            r1 = r3
        L_0x024d:
            if (r1 != 0) goto L_0x025f
            if (r5 == 0) goto L_0x025a
            int r1 = r5.length()
            if (r1 != 0) goto L_0x0258
            goto L_0x025a
        L_0x0258:
            r1 = r4
            goto L_0x025b
        L_0x025a:
            r1 = r3
        L_0x025b:
            if (r1 != 0) goto L_0x025f
            r1 = r3
            goto L_0x0260
        L_0x025f:
            r1 = r4
        L_0x0260:
            r0.R = r1
            com.clubhouse.android.data.models.local.channel.Channel r1 = r0.u
            if (r1 == 0) goto L_0x027e
            boolean r1 = r1.T()
            if (r1 != 0) goto L_0x027e
            com.clubhouse.android.data.models.local.channel.Channel r1 = r0.u
            boolean r1 = r1.U()
            if (r1 != 0) goto L_0x027e
            i0.e.b.z2.g.k r1 = r0.a
            com.clubhouse.android.data.models.local.channel.ClipsPermission r1 = r1.k
            com.clubhouse.android.data.models.local.channel.ClipsPermission r2 = com.clubhouse.android.data.models.local.channel.ClipsPermission.ALLOWED_FOR_ALL
            if (r1 != r2) goto L_0x027e
            r1 = r3
            goto L_0x027f
        L_0x027e:
            r1 = r4
        L_0x027f:
            r0.S = r1
            if (r1 == 0) goto L_0x0291
            boolean r1 = r0.q
            if (r1 != 0) goto L_0x028f
            i0.e.b.b3.a.a.c.a r1 = r0.p
            boolean r1 = r1.h()
            if (r1 == 0) goto L_0x0291
        L_0x028f:
            r1 = r3
            goto L_0x0292
        L_0x0291:
            r1 = r4
        L_0x0292:
            r0.T = r1
            boolean r2 = r0.o
            if (r2 == 0) goto L_0x029c
            if (r1 == 0) goto L_0x029c
            r2 = r3
            goto L_0x029d
        L_0x029c:
            r2 = r4
        L_0x029d:
            r0.U = r2
            if (r2 == 0) goto L_0x02ff
            boolean r2 = r0.q
            if (r2 == 0) goto L_0x02ff
            i0.e.b.b3.a.a.c.a r2 = r0.p
            com.clubhouse.android.data.models.local.channel.UserInChannel r5 = r2.a
            if (r5 == 0) goto L_0x02c0
            java.lang.Integer r5 = r5.getId()
            int r5 = r5.intValue()
            java.lang.Integer r2 = r2.g
            if (r2 != 0) goto L_0x02b8
            goto L_0x02c0
        L_0x02b8:
            int r2 = r2.intValue()
            if (r5 != r2) goto L_0x02c0
            r2 = r3
            goto L_0x02c1
        L_0x02c0:
            r2 = r4
        L_0x02c1:
            if (r2 != 0) goto L_0x0300
            i0.e.b.b3.a.a.c.a r2 = r0.p
            java.lang.Integer r5 = r2.g
            if (r5 == 0) goto L_0x02d3
            java.util.Map<java.lang.Integer, com.clubhouse.android.data.models.local.channel.UserInChannel> r2 = r2.b
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L_0x02d3
            r2 = r3
            goto L_0x02d4
        L_0x02d3:
            r2 = r4
        L_0x02d4:
            if (r2 == 0) goto L_0x0300
            i0.e.b.b3.a.a.c.a r2 = r0.p
            java.lang.Integer r5 = r2.g
            if (r5 == 0) goto L_0x02e6
            java.util.Map<java.lang.Integer, com.clubhouse.android.data.models.local.channel.UserInChannel> r2 = r2.b
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L_0x02e6
            r2 = r3
            goto L_0x02e7
        L_0x02e6:
            r2 = r4
        L_0x02e7:
            if (r2 == 0) goto L_0x02ff
            i0.e.b.b3.a.a.c.a r2 = r0.p
            java.lang.Integer r5 = r2.g
            if (r5 == 0) goto L_0x02fb
            int r5 = r5.intValue()
            boolean r2 = r2.e(r5)
            if (r2 == 0) goto L_0x02fb
            r2 = r3
            goto L_0x02fc
        L_0x02fb:
            r2 = r4
        L_0x02fc:
            if (r2 != 0) goto L_0x02ff
            goto L_0x0300
        L_0x02ff:
            r3 = r4
        L_0x0300:
            r0.V = r3
            if (r1 == 0) goto L_0x0307
            int r1 = com.clubhouse.android.channels.R.string.leave_button_label
            goto L_0x0309
        L_0x0307:
            int r1 = com.clubhouse.android.channels.R.string.leave_quietly_button_label
        L_0x0309:
            r0.W = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.z2.g.l.<init>(i0.e.b.z2.g.k, com.clubhouse.android.data.models.local.user.SourceLocation, boolean, boolean, boolean, java.util.List, boolean, long, int, boolean, boolean, int, java.util.List, boolean, boolean):void");
    }

    public static l copy$default(l lVar, k kVar, SourceLocation sourceLocation, boolean z2, boolean z3, boolean z4, List list, boolean z5, long j2, int i2, boolean z6, boolean z7, int i3, List list2, boolean z8, boolean z9, int i4, Object obj) {
        l lVar2 = lVar;
        int i5 = i4;
        k kVar2 = (i5 & 1) != 0 ? lVar2.a : kVar;
        SourceLocation sourceLocation2 = (i5 & 2) != 0 ? lVar2.b : sourceLocation;
        boolean z10 = (i5 & 4) != 0 ? lVar2.c : z2;
        boolean z11 = (i5 & 8) != 0 ? lVar2.d : z3;
        boolean z12 = (i5 & 16) != 0 ? lVar2.e : z4;
        List list3 = (i5 & 32) != 0 ? lVar2.f : list;
        boolean z13 = (i5 & 64) != 0 ? lVar2.g : z5;
        long j3 = (i5 & 128) != 0 ? lVar2.h : j2;
        int i6 = (i5 & 256) != 0 ? lVar2.i : i2;
        boolean z14 = (i5 & 512) != 0 ? lVar2.j : z6;
        boolean z15 = (i5 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? lVar2.k : z7;
        int i7 = (i5 & 2048) != 0 ? lVar2.l : i3;
        List list4 = (i5 & 4096) != 0 ? lVar2.m : list2;
        int i8 = i7;
        boolean z16 = (i5 & 8192) != 0 ? lVar2.n : z8;
        boolean z17 = (i5 & 16384) != 0 ? lVar2.o : z9;
        Objects.requireNonNull(lVar);
        i.e(kVar2, "channelState");
        i.e(sourceLocation2, "sourceLocation");
        i.e(list3, "blockedUsersInChannel");
        i.e(list4, "editProfilePrompts");
        return new l(kVar2, sourceLocation2, z10, z11, z12, list3, z13, j3, i6, z14, z15, i8, list4, z16, z17);
    }

    public final k component1() {
        return this.a;
    }

    public final boolean component10() {
        return this.j;
    }

    public final boolean component11() {
        return this.k;
    }

    public final int component12() {
        return this.l;
    }

    public final List<PromptField> component13() {
        return this.m;
    }

    public final boolean component14() {
        return this.n;
    }

    public final boolean component15() {
        return this.o;
    }

    public final SourceLocation component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public final boolean component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    public final List<Integer> component6() {
        return this.f;
    }

    public final boolean component7() {
        return this.g;
    }

    public final long component8() {
        return this.h;
    }

    public final int component9() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return i.a(this.a, lVar.a) && this.b == lVar.b && this.c == lVar.c && this.d == lVar.d && this.e == lVar.e && i.a(this.f, lVar.f) && this.g == lVar.g && this.h == lVar.h && this.i == lVar.i && this.j == lVar.j && this.k == lVar.k && this.l == lVar.l && i.a(this.m, lVar.m) && this.n == lVar.n && this.o == lVar.o;
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z2 = this.c;
        boolean z3 = true;
        if (z2) {
            z2 = true;
        }
        int i2 = (hashCode + (z2 ? 1 : 0)) * 31;
        boolean z4 = this.d;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.e;
        if (z5) {
            z5 = true;
        }
        int H2 = i0.d.a.a.a.H(this.f, (i3 + (z5 ? 1 : 0)) * 31, 31);
        boolean z6 = this.g;
        if (z6) {
            z6 = true;
        }
        int M2 = i0.d.a.a.a.M(this.i, (Long.hashCode(this.h) + ((H2 + (z6 ? 1 : 0)) * 31)) * 31, 31);
        boolean z7 = this.j;
        if (z7) {
            z7 = true;
        }
        int i4 = (M2 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.k;
        if (z8) {
            z8 = true;
        }
        int H3 = i0.d.a.a.a.H(this.m, i0.d.a.a.a.M(this.l, (i4 + (z8 ? 1 : 0)) * 31, 31), 31);
        boolean z9 = this.n;
        if (z9) {
            z9 = true;
        }
        int i5 = (H3 + (z9 ? 1 : 0)) * 31;
        boolean z10 = this.o;
        if (!z10) {
            z3 = z10;
        }
        return i5 + (z3 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChannelViewState(channelState=");
        P0.append(this.a);
        P0.append(", sourceLocation=");
        P0.append(this.b);
        P0.append(", isLoading=");
        P0.append(this.c);
        P0.append(", isHandRaised=");
        P0.append(this.d);
        P0.append(", hasSeenSocialModeModWarning=");
        P0.append(this.e);
        P0.append(", blockedUsersInChannel=");
        P0.append(this.f);
        P0.append(", allSpeakersWasFollowed=");
        P0.append(this.g);
        P0.append(", timeStartForNextFollowPrompt=");
        P0.append(this.h);
        P0.append(", backchannelUnreadCount=");
        P0.append(this.i);
        P0.append(", hasDismissedWaveSocialUpsell=");
        P0.append(this.j);
        P0.append(", disableReportRecentSpeakers=");
        P0.append(this.k);
        P0.append(", userFollowersCount=");
        P0.append(this.l);
        P0.append(", editProfilePrompts=");
        P0.append(this.m);
        P0.append(", editProfilePromptShown=");
        P0.append(this.n);
        P0.append(", isExpanded=");
        return i0.d.a.a.a.C0(P0, this.o, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(com.clubhouse.android.channels.model.ChannelArgs r24) {
        /*
            r23 = this;
            r0 = r24
            java.lang.String r1 = "channelArgs"
            m0.n.b.i.e(r0, r1)
            i0.e.b.z2.g.k r1 = new i0.e.b.z2.g.k
            java.lang.String r3 = r0.c
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 131070(0x1fffe, float:1.83668E-40)
            r22 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22)
            com.clubhouse.android.data.models.local.user.SourceLocation r4 = r0.d
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 32764(0x7ffc, float:4.5912E-41)
            r20 = 0
            r2 = r23
            r3 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.z2.g.l.<init>(com.clubhouse.android.channels.model.ChannelArgs):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(i0.e.b.z2.g.k r21, com.clubhouse.android.data.models.local.user.SourceLocation r22, boolean r23, boolean r24, boolean r25, java.util.List r26, boolean r27, long r28, int r30, boolean r31, boolean r32, int r33, java.util.List r34, boolean r35, boolean r36, int r37, m0.n.b.f r38) {
        /*
            r20 = this;
            r0 = r37
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r23
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r24
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r8 = r2
            goto L_0x001b
        L_0x0019:
            r8 = r25
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0023
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.c
            r9 = r1
            goto L_0x0025
        L_0x0023:
            r9 = r26
        L_0x0025:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002b
            r10 = r2
            goto L_0x002d
        L_0x002b:
            r10 = r27
        L_0x002d:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0037
            long r3 = java.lang.System.currentTimeMillis()
            r11 = r3
            goto L_0x0039
        L_0x0037:
            r11 = r28
        L_0x0039:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003f
            r13 = r2
            goto L_0x0041
        L_0x003f:
            r13 = r30
        L_0x0041:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0047
            r14 = r2
            goto L_0x0049
        L_0x0047:
            r14 = r31
        L_0x0049:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x004f
            r15 = r2
            goto L_0x0051
        L_0x004f:
            r15 = r32
        L_0x0051:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0059
            r1 = -1
            r16 = r1
            goto L_0x005b
        L_0x0059:
            r16 = r33
        L_0x005b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0064
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.c
            r17 = r1
            goto L_0x0066
        L_0x0064:
            r17 = r34
        L_0x0066:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x006d
            r18 = r2
            goto L_0x006f
        L_0x006d:
            r18 = r35
        L_0x006f:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0077
            r0 = 1
            r19 = r0
            goto L_0x0079
        L_0x0077:
            r19 = r36
        L_0x0079:
            r3 = r20
            r4 = r21
            r5 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.z2.g.l.<init>(i0.e.b.z2.g.k, com.clubhouse.android.data.models.local.user.SourceLocation, boolean, boolean, boolean, java.util.List, boolean, long, int, boolean, boolean, int, java.util.List, boolean, boolean, int, m0.n.b.f):void");
    }
}
