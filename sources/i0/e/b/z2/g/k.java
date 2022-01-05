package i0.e.b.z2.g;

import androidx.recyclerview.widget.RecyclerView;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.ChannelInRoom;
import com.clubhouse.android.data.models.local.channel.ClipsPermission;
import com.clubhouse.android.data.models.local.channel.HandraisePermission;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import h0.b0.v;
import i0.b.b.j;
import i0.e.b.b3.a.a.c.a;
import i0.e.b.b3.a.a.c.d;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ChannelState.kt */
public final class k implements j {
    public final String a;
    public final Channel b;
    public final SourceLocation c;
    public final a d;
    public final d e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final HandraisePermission j;
    public final ClipsPermission k;
    public final List<Integer> l;
    public final boolean m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final long r;
    public final BasicUser s;
    public final boolean t;
    public final boolean u;

    public k() {
        this((String) null, (Channel) null, (SourceLocation) null, (a) null, (d) null, false, false, false, false, (HandraisePermission) null, (ClipsPermission) null, (List) null, false, 0, false, false, false, 131071, (f) null);
    }

    public k(String str, Channel channel, SourceLocation sourceLocation, a aVar, d dVar, boolean z, boolean z2, boolean z3, boolean z4, HandraisePermission handraisePermission, ClipsPermission clipsPermission, List<Integer> list, boolean z5, long j2, boolean z6, boolean z7, boolean z8) {
        long j3;
        TimeUnit timeUnit;
        BasicUser basicUser;
        Channel channel2 = channel;
        SourceLocation sourceLocation2 = sourceLocation;
        d dVar2 = dVar;
        HandraisePermission handraisePermission2 = handraisePermission;
        ClipsPermission clipsPermission2 = clipsPermission;
        List<Integer> list2 = list;
        i.e(str, "channelId");
        i.e(sourceLocation, "sourceLocation");
        i.e(aVar, "users");
        i.e(dVar2, "raisedHands");
        i.e(handraisePermission2, "handraisePermission");
        i.e(clipsPermission2, "clipsPermission");
        i.e(list2, "seenListenerIds");
        this.a = str;
        this.b = channel2;
        this.c = sourceLocation2;
        this.d = aVar;
        this.e = dVar2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = handraisePermission2;
        this.k = clipsPermission2;
        this.l = list2;
        this.m = z5;
        this.n = j2;
        this.o = z6;
        this.p = z7;
        this.q = z8;
        if (aVar.d() > 50) {
            timeUnit = TimeUnit.SECONDS;
            j3 = 4;
        } else {
            timeUnit = TimeUnit.SECONDS;
            j3 = 1;
        }
        this.r = timeUnit.toMillis(j3);
        ChannelInRoom channelInRoom = null;
        if (channel2 == null) {
            basicUser = null;
        } else {
            basicUser = channel.F0();
        }
        this.s = basicUser;
        i.e(sourceLocation, "sourceLocation");
        this.t = sourceLocation2 == SourceLocation.WAVE;
        this.u = v.H0(channel2 instanceof ChannelInRoom ? (ChannelInRoom) channel2 : channelInRoom, sourceLocation, aVar);
    }

    public static k copy$default(k kVar, String str, Channel channel, SourceLocation sourceLocation, a aVar, d dVar, boolean z, boolean z2, boolean z3, boolean z4, HandraisePermission handraisePermission, ClipsPermission clipsPermission, List list, boolean z5, long j2, boolean z6, boolean z7, boolean z8, int i2, Object obj) {
        k kVar2 = kVar;
        int i3 = i2;
        String str2 = (i3 & 1) != 0 ? kVar2.a : str;
        Channel channel2 = (i3 & 2) != 0 ? kVar2.b : channel;
        SourceLocation sourceLocation2 = (i3 & 4) != 0 ? kVar2.c : sourceLocation;
        a aVar2 = (i3 & 8) != 0 ? kVar2.d : aVar;
        d dVar2 = (i3 & 16) != 0 ? kVar2.e : dVar;
        boolean z9 = (i3 & 32) != 0 ? kVar2.f : z;
        boolean z10 = (i3 & 64) != 0 ? kVar2.g : z2;
        boolean z11 = (i3 & 128) != 0 ? kVar2.h : z3;
        boolean z12 = (i3 & 256) != 0 ? kVar2.i : z4;
        HandraisePermission handraisePermission2 = (i3 & 512) != 0 ? kVar2.j : handraisePermission;
        ClipsPermission clipsPermission2 = (i3 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? kVar2.k : clipsPermission;
        List list2 = (i3 & 2048) != 0 ? kVar2.l : list;
        boolean z13 = (i3 & 4096) != 0 ? kVar2.m : z5;
        long j3 = (i3 & 8192) != 0 ? kVar2.n : j2;
        boolean z14 = (i3 & 16384) != 0 ? kVar2.o : z6;
        boolean z15 = (32768 & i3) != 0 ? kVar2.p : z7;
        boolean z16 = (i3 & 65536) != 0 ? kVar2.q : z8;
        Objects.requireNonNull(kVar);
        i.e(str2, "channelId");
        i.e(sourceLocation2, "sourceLocation");
        i.e(aVar2, "users");
        i.e(dVar2, "raisedHands");
        i.e(handraisePermission2, "handraisePermission");
        i.e(clipsPermission2, "clipsPermission");
        i.e(list2, "seenListenerIds");
        return new k(str2, channel2, sourceLocation2, aVar2, dVar2, z9, z10, z11, z12, handraisePermission2, clipsPermission2, list2, z13, j3, z14, z15, z16);
    }

    public final boolean a() {
        boolean z;
        if (!this.i) {
            return false;
        }
        Channel channel = this.b;
        if (!(channel instanceof ChannelInRoom)) {
            return true;
        }
        HandraisePermission handraisePermission = this.j;
        if (handraisePermission != HandraisePermission.ALL && (handraisePermission != HandraisePermission.CLUB_MEMBERS || !((ChannelInRoom) channel).A0())) {
            if (this.j != HandraisePermission.FOLLOWED_BY_SPEAKERS) {
                return false;
            }
            UserInChannel userInChannel = this.d.a;
            if (userInChannel != null && userInChannel.b2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final Boolean b() {
        UserInChannel userInChannel = this.d.a;
        if (userInChannel == null) {
            return null;
        }
        BasicUser c2 = c();
        boolean z = false;
        if (c2 != null && c2.getId().intValue() == userInChannel.getId().intValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final BasicUser c() {
        Channel channel = this.b;
        if (channel instanceof ChannelInRoom) {
            return channel.p0();
        }
        return null;
    }

    public final String component1() {
        return this.a;
    }

    public final HandraisePermission component10() {
        return this.j;
    }

    public final ClipsPermission component11() {
        return this.k;
    }

    public final List<Integer> component12() {
        return this.l;
    }

    public final boolean component13() {
        return this.m;
    }

    public final long component14() {
        return this.n;
    }

    public final boolean component15() {
        return this.o;
    }

    public final boolean component16() {
        return this.p;
    }

    public final boolean component17() {
        return this.q;
    }

    public final Channel component2() {
        return this.b;
    }

    public final SourceLocation component3() {
        return this.c;
    }

    public final a component4() {
        return this.d;
    }

    public final d component5() {
        return this.e;
    }

    public final boolean component6() {
        return this.f;
    }

    public final boolean component7() {
        return this.g;
    }

    public final boolean component8() {
        return this.h;
    }

    public final boolean component9() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return i.a(this.a, kVar.a) && i.a(this.b, kVar.b) && this.c == kVar.c && i.a(this.d, kVar.d) && i.a(this.e, kVar.e) && this.f == kVar.f && this.g == kVar.g && this.h == kVar.h && this.i == kVar.i && this.j == kVar.j && this.k == kVar.k && i.a(this.l, kVar.l) && this.m == kVar.m && this.n == kVar.n && this.o == kVar.o && this.p == kVar.p && this.q == kVar.q;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Channel channel = this.b;
        int hashCode2 = channel == null ? 0 : channel.hashCode();
        int hashCode3 = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + hashCode2) * 31)) * 31)) * 31)) * 31;
        boolean z = this.f;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        boolean z3 = this.g;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.h;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.i;
        if (z5) {
            z5 = true;
        }
        int H = i0.d.a.a.a.H(this.l, (this.k.hashCode() + ((this.j.hashCode() + ((i4 + (z5 ? 1 : 0)) * 31)) * 31)) * 31, 31);
        boolean z6 = this.m;
        if (z6) {
            z6 = true;
        }
        int hashCode4 = (Long.hashCode(this.n) + ((H + (z6 ? 1 : 0)) * 31)) * 31;
        boolean z7 = this.o;
        if (z7) {
            z7 = true;
        }
        int i5 = (hashCode4 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.p;
        if (z8) {
            z8 = true;
        }
        int i6 = (i5 + (z8 ? 1 : 0)) * 31;
        boolean z9 = this.q;
        if (!z9) {
            z2 = z9;
        }
        return i6 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChannelState(channelId=");
        P0.append(this.a);
        P0.append(", channel=");
        P0.append(this.b);
        P0.append(", sourceLocation=");
        P0.append(this.c);
        P0.append(", users=");
        P0.append(this.d);
        P0.append(", raisedHands=");
        P0.append(this.e);
        P0.append(", networkQualityGood=");
        P0.append(this.f);
        P0.append(", receivedLeaveSignal=");
        P0.append(this.g);
        P0.append(", channelRefreshInProgress=");
        P0.append(this.h);
        P0.append(", isHandraiseEnabled=");
        P0.append(this.i);
        P0.append(", handraisePermission=");
        P0.append(this.j);
        P0.append(", clipsPermission=");
        P0.append(this.k);
        P0.append(", seenListenerIds=");
        P0.append(this.l);
        P0.append(", joined=");
        P0.append(this.m);
        P0.append(", sessionJoinTime=");
        P0.append(this.n);
        P0.append(", debugLogging=");
        P0.append(this.o);
        P0.append(", audioSpatialization=");
        P0.append(this.p);
        P0.append(", isFirstTimeInAudience=");
        return i0.d.a.a.a.C0(P0, this.q, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k(java.lang.String r20, com.clubhouse.android.data.models.local.channel.Channel r21, com.clubhouse.android.data.models.local.user.SourceLocation r22, i0.e.b.b3.a.a.c.a r23, i0.e.b.b3.a.a.c.d r24, boolean r25, boolean r26, boolean r27, boolean r28, com.clubhouse.android.data.models.local.channel.HandraisePermission r29, com.clubhouse.android.data.models.local.channel.ClipsPermission r30, java.util.List r31, boolean r32, long r33, boolean r35, boolean r36, boolean r37, int r38, m0.n.b.f r39) {
        /*
            r19 = this;
            r0 = r38
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            java.lang.String r1 = ""
            goto L_0x000b
        L_0x0009:
            r1 = r20
        L_0x000b:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0012
            r2 = r3
            goto L_0x0014
        L_0x0012:
            r2 = r21
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001b
            com.clubhouse.android.data.models.local.user.SourceLocation r4 = com.clubhouse.android.data.models.local.user.SourceLocation.UNKNOWN
            goto L_0x001d
        L_0x001b:
            r4 = r22
        L_0x001d:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0035
            i0.e.b.b3.a.a.c.a r5 = new i0.e.b.b3.a.a.c.a
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
            r17 = 1023(0x3ff, float:1.434E-42)
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0037
        L_0x0035:
            r5 = r23
        L_0x0037:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0042
            i0.e.b.b3.a.a.c.d r6 = new i0.e.b.b3.a.a.c.d
            r7 = 7
            r6.<init>(r3, r3, r3, r7)
            goto L_0x0044
        L_0x0042:
            r6 = r24
        L_0x0044:
            r3 = r0 & 32
            r7 = 1
            if (r3 == 0) goto L_0x004b
            r3 = r7
            goto L_0x004d
        L_0x004b:
            r3 = r25
        L_0x004d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0053
            r8 = 0
            goto L_0x0055
        L_0x0053:
            r8 = r26
        L_0x0055:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x005b
            r10 = 0
            goto L_0x005d
        L_0x005b:
            r10 = r27
        L_0x005d:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r7 = r28
        L_0x0064:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x006b
            com.clubhouse.android.data.models.local.channel.HandraisePermission r11 = com.clubhouse.android.data.models.local.channel.HandraisePermission.ALL
            goto L_0x006d
        L_0x006b:
            r11 = r29
        L_0x006d:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0074
            com.clubhouse.android.data.models.local.channel.ClipsPermission r12 = com.clubhouse.android.data.models.local.channel.ClipsPermission.NOT_ALLOWED
            goto L_0x0076
        L_0x0074:
            r12 = r30
        L_0x0076:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x007d
            kotlin.collections.EmptyList r13 = kotlin.collections.EmptyList.c
            goto L_0x007f
        L_0x007d:
            r13 = r31
        L_0x007f:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0085
            r14 = 0
            goto L_0x0087
        L_0x0085:
            r14 = r32
        L_0x0087:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0090
            long r15 = java.lang.System.currentTimeMillis()
            goto L_0x0092
        L_0x0090:
            r15 = r33
        L_0x0092:
            r9 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x0098
            r9 = 0
            goto L_0x009a
        L_0x0098:
            r9 = r35
        L_0x009a:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x00a4
            r17 = 0
            goto L_0x00a6
        L_0x00a4:
            r17 = r36
        L_0x00a6:
            r18 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r18
            if (r0 == 0) goto L_0x00ae
            r0 = 0
            goto L_0x00b0
        L_0x00ae:
            r0 = r37
        L_0x00b0:
            r20 = r19
            r21 = r1
            r22 = r2
            r23 = r4
            r24 = r5
            r25 = r6
            r26 = r3
            r27 = r8
            r28 = r10
            r29 = r7
            r30 = r11
            r31 = r12
            r32 = r13
            r33 = r14
            r34 = r15
            r36 = r9
            r37 = r17
            r38 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r37, r38)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.z2.g.k.<init>(java.lang.String, com.clubhouse.android.data.models.local.channel.Channel, com.clubhouse.android.data.models.local.user.SourceLocation, i0.e.b.b3.a.a.c.a, i0.e.b.b3.a.a.c.d, boolean, boolean, boolean, boolean, com.clubhouse.android.data.models.local.channel.HandraisePermission, com.clubhouse.android.data.models.local.channel.ClipsPermission, java.util.List, boolean, long, boolean, boolean, boolean, int, m0.n.b.f):void");
    }
}
