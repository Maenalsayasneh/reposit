package i0.e.b.b3.a.a.c;

import com.clubhouse.android.data.models.local.channel.UserInChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m0.j.g;
import m0.n.b.i;

/* compiled from: ChannelUsers.kt */
public final class a {
    public final UserInChannel a;
    public final Map<Integer, UserInChannel> b;
    public final Set<Integer> c;
    public final Set<Integer> d;
    public final Set<UserInChannel> e;
    public final boolean f;
    public final Integer g;
    public final Set<Integer> h;
    public final Set<Integer> i;
    public final Set<Integer> j;
    public final List<UserInChannel> k;
    public final List<UserInChannel> l;
    public final List<UserInChannel> m;

    public a() {
        this((UserInChannel) null, (Map) null, (Set) null, (Set) null, (Set) null, false, (Integer) null, (Set) null, (Set) null, (Set) null, 1023);
    }

    public a(UserInChannel userInChannel, Map<Integer, UserInChannel> map, Set<Integer> set, Set<Integer> set2, Set<UserInChannel> set3, boolean z, Integer num, Set<Integer> set4, Set<Integer> set5, Set<Integer> set6) {
        i.e(map, "allUsers");
        i.e(set, "invitedAsSpeaker");
        i.e(set2, "moderators");
        i.e(set3, "recentlyDepartedSpeakers");
        i.e(set4, "speakerIds");
        i.e(set5, "friendIds");
        i.e(set6, "lurkerIds");
        this.a = userInChannel;
        this.b = map;
        this.c = set;
        this.d = set2;
        this.e = set3;
        this.f = z;
        this.g = num;
        this.h = set4;
        this.i = set5;
        this.j = set6;
        ArrayList arrayList = new ArrayList();
        for (Number intValue : set4) {
            UserInChannel userInChannel2 = this.b.get(Integer.valueOf(intValue.intValue()));
            if (userInChannel2 != null) {
                arrayList.add(userInChannel2);
            }
        }
        this.k = arrayList;
        Set<Integer> set7 = this.i;
        ArrayList arrayList2 = new ArrayList();
        for (Number intValue2 : set7) {
            UserInChannel userInChannel3 = this.b.get(Integer.valueOf(intValue2.intValue()));
            if (userInChannel3 != null) {
                arrayList2.add(userInChannel3);
            }
        }
        this.l = arrayList2;
        Set<Integer> set8 = this.j;
        ArrayList arrayList3 = new ArrayList();
        for (Number intValue3 : set8) {
            UserInChannel userInChannel4 = this.b.get(Integer.valueOf(intValue3.intValue()));
            if (userInChannel4 != null) {
                arrayList3.add(userInChannel4);
            }
        }
        this.m = arrayList3;
    }

    public static a c(a aVar, UserInChannel userInChannel, Map map, Set set, Set set2, Set set3, boolean z, Integer num, Set set4, Set set5, Set set6, int i2) {
        a aVar2 = aVar;
        int i3 = i2;
        Integer num2 = null;
        UserInChannel userInChannel2 = (i3 & 1) != 0 ? aVar2.a : null;
        Map map2 = (i3 & 2) != 0 ? aVar2.b : map;
        Set set7 = (i3 & 4) != 0 ? aVar2.c : set;
        Set set8 = (i3 & 8) != 0 ? aVar2.d : set2;
        Set set9 = (i3 & 16) != 0 ? aVar2.e : set3;
        boolean z2 = (i3 & 32) != 0 ? aVar2.f : z;
        if ((i3 & 64) != 0) {
            num2 = aVar2.g;
        }
        Set set10 = (i3 & 128) != 0 ? aVar2.h : set4;
        Set set11 = (i3 & 256) != 0 ? aVar2.i : set5;
        Set set12 = (i3 & 512) != 0 ? aVar2.j : set6;
        i.e(map2, "allUsers");
        i.e(set7, "invitedAsSpeaker");
        i.e(set8, "moderators");
        i.e(set9, "recentlyDepartedSpeakers");
        i.e(set10, "speakerIds");
        i.e(set11, "friendIds");
        i.e(set12, "lurkerIds");
        return new a(userInChannel2, map2, set7, set8, set9, z2, num2, set10, set11, set12);
    }

    public final a a(int i2) {
        return c(this, (UserInChannel) null, (Map) null, (Set) null, g.e0(this.d, Integer.valueOf(i2)), (Set) null, false, (Integer) null, (Set) null, (Set) null, (Set) null, 1015);
    }

    public final Set<UserInChannel> b(UserInChannel userInChannel) {
        if (userInChannel == null) {
            return this.e;
        }
        if (this.h.contains(userInChannel.getId())) {
            return g.e0(this.e, userInChannel);
        }
        return this.e;
    }

    public final int d() {
        return this.j.size() + this.i.size() + this.h.size();
    }

    public final boolean e(int i2) {
        return this.d.contains(Integer.valueOf(i2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.a, aVar.a) && i.a(this.b, aVar.b) && i.a(this.c, aVar.c) && i.a(this.d, aVar.d) && i.a(this.e, aVar.e) && this.f == aVar.f && i.a(this.g, aVar.g) && i.a(this.h, aVar.h) && i.a(this.i, aVar.i) && i.a(this.j, aVar.j);
    }

    public final boolean f() {
        UserInChannel userInChannel = this.a;
        return userInChannel != null && e(userInChannel.getId().intValue());
    }

    public final boolean g() {
        return h() && this.k.size() == 1;
    }

    public final boolean h() {
        UserInChannel userInChannel = this.a;
        return userInChannel != null && i(userInChannel.getId().intValue());
    }

    public int hashCode() {
        UserInChannel userInChannel = this.a;
        int i2 = 0;
        int hashCode = userInChannel == null ? 0 : userInChannel.hashCode();
        int I = i0.d.a.a.a.I(this.e, i0.d.a.a.a.I(this.d, i0.d.a.a.a.I(this.c, (this.b.hashCode() + (hashCode * 31)) * 31, 31), 31), 31);
        boolean z = this.f;
        if (z) {
            z = true;
        }
        int i3 = (I + (z ? 1 : 0)) * 31;
        Integer num = this.g;
        if (num != null) {
            i2 = num.hashCode();
        }
        return this.j.hashCode() + i0.d.a.a.a.I(this.i, i0.d.a.a.a.I(this.h, (i3 + i2) * 31, 31), 31);
    }

    public final boolean i(int i2) {
        return this.h.contains(Integer.valueOf(i2));
    }

    public final a j(int i2) {
        UserInChannel userInChannel = this.b.get(Integer.valueOf(i2));
        if (userInChannel == null) {
            return this;
        }
        if (userInChannel.b2) {
            return c(this, (UserInChannel) null, (Map) null, g.T(this.c, Integer.valueOf(i2)), g.T(this.d, Integer.valueOf(i2)), b(userInChannel), false, (Integer) null, g.T(this.h, Integer.valueOf(i2)), g.e0(this.i, Integer.valueOf(i2)), (Set) null, 611);
        }
        return c(this, (UserInChannel) null, (Map) null, g.T(this.c, Integer.valueOf(i2)), g.T(this.d, Integer.valueOf(i2)), b(userInChannel), false, (Integer) null, g.T(this.h, Integer.valueOf(i2)), (Set) null, g.e0(this.j, Integer.valueOf(i2)), 355);
    }

    public final UserInChannel k(int i2) {
        return this.b.get(Integer.valueOf(i2));
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChannelUsers(selfUser=");
        P0.append(this.a);
        P0.append(", allUsers=");
        P0.append(this.b);
        P0.append(", invitedAsSpeaker=");
        P0.append(this.c);
        P0.append(", moderators=");
        P0.append(this.d);
        P0.append(", recentlyDepartedSpeakers=");
        P0.append(this.e);
        P0.append(", atLeastOneUserWasJoined=");
        P0.append(this.f);
        P0.append(", creatorUserId=");
        P0.append(this.g);
        P0.append(", speakerIds=");
        P0.append(this.h);
        P0.append(", friendIds=");
        P0.append(this.i);
        P0.append(", lurkerIds=");
        P0.append(this.j);
        P0.append(')');
        return P0.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(com.clubhouse.android.data.models.local.channel.UserInChannel r11, java.util.Map r12, java.util.Set r13, java.util.Set r14, java.util.Set r15, boolean r16, java.lang.Integer r17, java.util.Set r18, java.util.Set r19, java.util.Set r20, int r21) {
        /*
            r10 = this;
            r0 = r21
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0013
            java.util.Map r3 = m0.j.g.o()
            goto L_0x0014
        L_0x0013:
            r3 = r12
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001e
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            goto L_0x001f
        L_0x001e:
            r4 = r13
        L_0x001f:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0029
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            goto L_0x002a
        L_0x0029:
            r5 = r14
        L_0x002a:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0034
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            goto L_0x0035
        L_0x0034:
            r6 = r2
        L_0x0035:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x003b
            r7 = 0
            goto L_0x003d
        L_0x003b:
            r7 = r16
        L_0x003d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r2 = r17
        L_0x0044:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x004e
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            goto L_0x0050
        L_0x004e:
            r8 = r18
        L_0x0050:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x005a
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            goto L_0x005c
        L_0x005a:
            r9 = r19
        L_0x005c:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0066
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            goto L_0x0068
        L_0x0066:
            r0 = r20
        L_0x0068:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r2
            r19 = r8
            r20 = r9
            r21 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.b3.a.a.c.a.<init>(com.clubhouse.android.data.models.local.channel.UserInChannel, java.util.Map, java.util.Set, java.util.Set, java.util.Set, boolean, java.lang.Integer, java.util.Set, java.util.Set, java.util.Set, int):void");
    }
}
