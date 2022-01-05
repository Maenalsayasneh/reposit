package i0.e.b.g3.p.c0;

import androidx.recyclerview.widget.RecyclerView;
import com.clubhouse.android.data.models.local.channel.ChannelInFeed;
import com.clubhouse.android.user.model.UserSelf;
import com.clubhouse.wave.data.models.local.ReceivedWave;
import i0.b.b.b;
import i0.b.b.j;
import i0.d.a.a.a;
import i0.e.b.b3.a.a.d.a.e;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: FeedViewModel.kt */
public final class v implements j {
    public final b<List<e>> a;
    public final Set<ChannelInFeed> b;
    public final List<ReceivedWave> c;
    public final b<UserSelf> d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final long j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public v() {
        this((b) null, (Set) null, (List) null, (b) null, false, false, false, false, 0, 0, false, false, 4095, (f) null);
    }

    public v(b<? extends List<? extends e>> bVar, Set<ChannelInFeed> set, List<ReceivedWave> list, b<UserSelf> bVar2, boolean z, boolean z2, boolean z3, boolean z4, int i2, long j2, boolean z5, boolean z6) {
        i.e(bVar, "feedRequest");
        i.e(set, "hiddenChannels");
        i.e(list, "receivedWaves");
        i.e(bVar2, "userState");
        this.a = bVar;
        this.b = set;
        this.c = list;
        this.d = bVar2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = i2;
        this.j = j2;
        this.k = z5;
        this.l = z6;
        boolean z7 = true;
        this.m = (!z4 || !(list.isEmpty() ^ true)) ? false : z7;
    }

    public static v copy$default(v vVar, b bVar, Set set, List list, b bVar2, boolean z, boolean z2, boolean z3, boolean z4, int i2, long j2, boolean z5, boolean z6, int i3, Object obj) {
        v vVar2 = vVar;
        int i4 = i3;
        b bVar3 = (i4 & 1) != 0 ? vVar2.a : bVar;
        Set set2 = (i4 & 2) != 0 ? vVar2.b : set;
        List list2 = (i4 & 4) != 0 ? vVar2.c : list;
        b bVar4 = (i4 & 8) != 0 ? vVar2.d : bVar2;
        boolean z7 = (i4 & 16) != 0 ? vVar2.e : z;
        boolean z8 = (i4 & 32) != 0 ? vVar2.f : z2;
        boolean z9 = (i4 & 64) != 0 ? vVar2.g : z3;
        boolean z10 = (i4 & 128) != 0 ? vVar2.h : z4;
        int i5 = (i4 & 256) != 0 ? vVar2.i : i2;
        long j3 = (i4 & 512) != 0 ? vVar2.j : j2;
        boolean z11 = (i4 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? vVar2.k : z5;
        boolean z12 = (i4 & 2048) != 0 ? vVar2.l : z6;
        Objects.requireNonNull(vVar);
        i.e(bVar3, "feedRequest");
        i.e(set2, "hiddenChannels");
        i.e(list2, "receivedWaves");
        i.e(bVar4, "userState");
        return new v(bVar3, set2, list2, bVar4, z7, z8, z9, z10, i5, j3, z11, z12);
    }

    public final b<List<e>> component1() {
        return this.a;
    }

    public final long component10() {
        return this.j;
    }

    public final boolean component11() {
        return this.k;
    }

    public final boolean component12() {
        return this.l;
    }

    public final Set<ChannelInFeed> component2() {
        return this.b;
    }

    public final List<ReceivedWave> component3() {
        return this.c;
    }

    public final b<UserSelf> component4() {
        return this.d;
    }

    public final boolean component5() {
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

    public final int component9() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return i.a(this.a, vVar.a) && i.a(this.b, vVar.b) && i.a(this.c, vVar.c) && i.a(this.d, vVar.d) && this.e == vVar.e && this.f == vVar.f && this.g == vVar.g && this.h == vVar.h && this.i == vVar.i && this.j == vVar.j && this.k == vVar.k && this.l == vVar.l;
    }

    public int hashCode() {
        int hashCode = (this.d.hashCode() + a.H(this.c, a.I(this.b, this.a.hashCode() * 31, 31), 31)) * 31;
        boolean z = this.e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.g;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.h;
        if (z5) {
            z5 = true;
        }
        int hashCode2 = (Long.hashCode(this.j) + a.M(this.i, (i4 + (z5 ? 1 : 0)) * 31, 31)) * 31;
        boolean z6 = this.k;
        if (z6) {
            z6 = true;
        }
        int i5 = (hashCode2 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.l;
        if (!z7) {
            z2 = z7;
        }
        return i5 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("FeedState(feedRequest=");
        P0.append(this.a);
        P0.append(", hiddenChannels=");
        P0.append(this.b);
        P0.append(", receivedWaves=");
        P0.append(this.c);
        P0.append(", userState=");
        P0.append(this.d);
        P0.append(", showExploreButton=");
        P0.append(this.e);
        P0.append(", showBlockedButton=");
        P0.append(this.f);
        P0.append(", showBlocked=");
        P0.append(this.g);
        P0.append(", enableWaves=");
        P0.append(this.h);
        P0.append(", blockedCount=");
        P0.append(this.i);
        P0.append(", lastChannelLoadTime=");
        P0.append(this.j);
        P0.append(", hasOnlineBuddies=");
        P0.append(this.k);
        P0.append(", isReportRoomEnabled=");
        return a.C0(P0, this.l, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v(i0.b.b.b r15, java.util.Set r16, java.util.List r17, i0.b.b.b r18, boolean r19, boolean r20, boolean r21, boolean r22, int r23, long r24, boolean r26, boolean r27, int r28, m0.n.b.f r29) {
        /*
            r14 = this;
            r0 = r28
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            i0.b.b.g0 r1 = i0.b.b.g0.b
            goto L_0x000a
        L_0x0009:
            r1 = r15
        L_0x000a:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0014
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            goto L_0x0016
        L_0x0014:
            r2 = r16
        L_0x0016:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x001d
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.c
            goto L_0x001f
        L_0x001d:
            r3 = r17
        L_0x001f:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0026
            i0.b.b.g0 r4 = i0.b.b.g0.b
            goto L_0x0028
        L_0x0026:
            r4 = r18
        L_0x0028:
            r5 = r0 & 16
            r6 = 0
            if (r5 == 0) goto L_0x002f
            r5 = r6
            goto L_0x0031
        L_0x002f:
            r5 = r19
        L_0x0031:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0037
            r7 = r6
            goto L_0x0039
        L_0x0037:
            r7 = r20
        L_0x0039:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003f
            r8 = r6
            goto L_0x0041
        L_0x003f:
            r8 = r21
        L_0x0041:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0047
            r9 = r6
            goto L_0x0049
        L_0x0047:
            r9 = r22
        L_0x0049:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x004f
            r10 = r6
            goto L_0x0051
        L_0x004f:
            r10 = r23
        L_0x0051:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0058
            r11 = 0
            goto L_0x005a
        L_0x0058:
            r11 = r24
        L_0x005a:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0060
            r13 = r6
            goto L_0x0062
        L_0x0060:
            r13 = r26
        L_0x0062:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r6 = r27
        L_0x0069:
            r15 = r14
            r16 = r1
            r17 = r2
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r27 = r13
            r28 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.p.c0.v.<init>(i0.b.b.b, java.util.Set, java.util.List, i0.b.b.b, boolean, boolean, boolean, boolean, int, long, boolean, boolean, int, m0.n.b.f):void");
    }
}
