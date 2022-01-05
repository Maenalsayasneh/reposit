package i0.e.b.g3.p.b0;

import com.clubhouse.android.data.models.local.club.ClubInStatus;
import com.clubhouse.android.data.models.local.user.UserInStatus;
import com.clubhouse.wave.data.models.local.ReceivedWave;
import com.clubhouse.wave.data.models.local.SentWave;
import i0.b.b.j;
import i0.j.f.p.h;
import j$.time.OffsetDateTime;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: BuddyListViewModel.kt */
public final class q implements j {
    public final List<ClubInStatus> a;
    public final List<UserInStatus> b;
    public final List<ReceivedWave> c;
    public final List<SentWave> d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final List<ClubInStatus> l;
    public final boolean m;
    public final List<UserInStatus> n;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator<T> {
        public final /* synthetic */ q c;

        public a(q qVar) {
            this.c = qVar;
        }

        public final int compare(T t, T t2) {
            OffsetDateTime offsetDateTime;
            T t3;
            OffsetDateTime offsetDateTime2;
            T t4;
            boolean z;
            boolean z2;
            UserInStatus userInStatus = (UserInStatus) t2;
            Iterator<T> it = this.c.d.iterator();
            while (true) {
                offsetDateTime = null;
                if (!it.hasNext()) {
                    t3 = null;
                    break;
                }
                t3 = it.next();
                if (((SentWave) t3).c.getId().intValue() == userInStatus.getId().intValue()) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            SentWave sentWave = (SentWave) t3;
            if (sentWave == null) {
                offsetDateTime2 = null;
            } else {
                offsetDateTime2 = sentWave.x;
            }
            UserInStatus userInStatus2 = (UserInStatus) t;
            Iterator<T> it2 = this.c.d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    t4 = null;
                    break;
                }
                t4 = it2.next();
                if (((SentWave) t4).c.getId().intValue() == userInStatus2.getId().intValue()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            SentWave sentWave2 = (SentWave) t4;
            if (sentWave2 != null) {
                offsetDateTime = sentWave2.x;
            }
            return h.L(offsetDateTime2, offsetDateTime);
        }
    }

    public q() {
        this((List) null, (List) null, (List) null, (List) null, false, false, false, false, false, false, 1023, (f) null);
    }

    public q(List<ClubInStatus> list, List<UserInStatus> list2, List<ReceivedWave> list3, List<SentWave> list4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        i.e(list, "allClubs");
        i.e(list2, "onlineUsers");
        i.e(list3, "receivedWaves");
        i.e(list4, "sentWaves");
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        boolean z7 = true;
        this.k = list.isEmpty() && list2.isEmpty();
        if (!z4 && list.size() > 3) {
            list = list.subList(0, 3);
        }
        this.l = list;
        this.m = (!z6 || !(list3.isEmpty() ^ true)) ? false : z7;
        this.n = g.n0(list2, new a(this));
    }

    public static q copy$default(q qVar, List list, List list2, List list3, List list4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, Object obj) {
        q qVar2 = qVar;
        int i3 = i2;
        List list5 = (i3 & 1) != 0 ? qVar2.a : list;
        List list6 = (i3 & 2) != 0 ? qVar2.b : list2;
        List list7 = (i3 & 4) != 0 ? qVar2.c : list3;
        List list8 = (i3 & 8) != 0 ? qVar2.d : list4;
        boolean z7 = (i3 & 16) != 0 ? qVar2.e : z;
        boolean z8 = (i3 & 32) != 0 ? qVar2.f : z2;
        boolean z9 = (i3 & 64) != 0 ? qVar2.g : z3;
        boolean z10 = (i3 & 128) != 0 ? qVar2.h : z4;
        boolean z11 = (i3 & 256) != 0 ? qVar2.i : z5;
        boolean z12 = (i3 & 512) != 0 ? qVar2.j : z6;
        Objects.requireNonNull(qVar);
        i.e(list5, "allClubs");
        i.e(list6, "onlineUsers");
        i.e(list7, "receivedWaves");
        i.e(list8, "sentWaves");
        return new q(list5, list6, list7, list8, z7, z8, z9, z10, z11, z12);
    }

    public final boolean a(UserInStatus userInStatus) {
        boolean z;
        i.e(userInStatus, "user");
        List<SentWave> list = this.d;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (SentWave sentWave : list) {
                if (sentWave.c.getId().intValue() == userInStatus.getId().intValue()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean component10() {
        return this.j;
    }

    public final List<UserInStatus> component2() {
        return this.b;
    }

    public final List<ReceivedWave> component3() {
        return this.c;
    }

    public final List<SentWave> component4() {
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

    public final boolean component9() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return i.a(this.a, qVar.a) && i.a(this.b, qVar.b) && i.a(this.c, qVar.c) && i.a(this.d, qVar.d) && this.e == qVar.e && this.f == qVar.f && this.g == qVar.g && this.h == qVar.h && this.i == qVar.i && this.j == qVar.j;
    }

    public int hashCode() {
        int H = i0.d.a.a.a.H(this.d, i0.d.a.a.a.H(this.c, i0.d.a.a.a.H(this.b, this.a.hashCode() * 31, 31), 31), 31);
        boolean z = this.e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (H + (z ? 1 : 0)) * 31;
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
        int i5 = (i4 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.i;
        if (z6) {
            z6 = true;
        }
        int i6 = (i5 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.j;
        if (!z7) {
            z2 = z7;
        }
        return i6 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("BuddyListState(allClubs=");
        P0.append(this.a);
        P0.append(", onlineUsers=");
        P0.append(this.b);
        P0.append(", receivedWaves=");
        P0.append(this.c);
        P0.append(", sentWaves=");
        P0.append(this.d);
        P0.append(", waveChannelLoading=");
        P0.append(this.e);
        P0.append(", loading=");
        P0.append(this.f);
        P0.append(", error=");
        P0.append(this.g);
        P0.append(", showAllClubs=");
        P0.append(this.h);
        P0.append(", selfInChannel=");
        P0.append(this.i);
        P0.append(", enableWaves=");
        return i0.d.a.a.a.C0(P0, this.j, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q(java.util.List r12, java.util.List r13, java.util.List r14, java.util.List r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, int r22, m0.n.b.f r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.c
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0011
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.c
            goto L_0x0012
        L_0x0011:
            r2 = r13
        L_0x0012:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0019
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.c
            goto L_0x001a
        L_0x0019:
            r3 = r14
        L_0x001a:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0021
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.c
            goto L_0x0022
        L_0x0021:
            r4 = r15
        L_0x0022:
            r5 = r0 & 16
            r6 = 0
            if (r5 == 0) goto L_0x0029
            r5 = r6
            goto L_0x002b
        L_0x0029:
            r5 = r16
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = 1
            goto L_0x0033
        L_0x0031:
            r7 = r17
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = r6
            goto L_0x003b
        L_0x0039:
            r8 = r18
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            r9 = r6
            goto L_0x0043
        L_0x0041:
            r9 = r19
        L_0x0043:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0049
            r10 = r6
            goto L_0x004b
        L_0x0049:
            r10 = r20
        L_0x004b:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r6 = r21
        L_0x0052:
            r12 = r11
            r13 = r1
            r14 = r2
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.p.b0.q.<init>(java.util.List, java.util.List, java.util.List, java.util.List, boolean, boolean, boolean, boolean, boolean, boolean, int, m0.n.b.f):void");
    }
}
