package i0.e.b.g3.o.w0;

import androidx.recyclerview.widget.RecyclerView;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.user.model.UserSelf;
import i0.b.b.j;
import i0.d.a.a.a;
import j$.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: AddEditEventViewModel.kt */
public final class w implements j {
    public final EventInClub a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final OffsetDateTime g;
    public final boolean h;
    public final boolean i;
    public final List<UserInList> j;
    public final boolean k;
    public final UserSelf l;
    public final ClubWithAdmin m;
    public final List<ClubWithAdmin> n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;

    public w() {
        this((EventInClub) null, (String) null, (String) null, (String) null, (String) null, 0, (OffsetDateTime) null, false, false, (List) null, false, (UserSelf) null, (ClubWithAdmin) null, (List) null, false, 32767, (f) null);
    }

    public w(EventInClub eventInClub, String str, String str2, String str3, String str4, int i2, OffsetDateTime offsetDateTime, boolean z, boolean z2, List<UserInList> list, boolean z3, UserSelf userSelf, ClubWithAdmin clubWithAdmin, List<ClubWithAdmin> list2, boolean z4) {
        boolean z5;
        int i3;
        ClubWithAdmin clubWithAdmin2;
        EventInClub eventInClub2 = eventInClub;
        String str5 = str3;
        String str6 = str4;
        int i4 = i2;
        List<UserInList> list3 = list;
        List<ClubWithAdmin> list4 = list2;
        i.e(list3, "coHosts");
        i.e(list4, "hostClubs");
        this.a = eventInClub2;
        this.b = str;
        this.c = str2;
        this.d = str5;
        this.e = str6;
        this.f = i4;
        this.g = offsetDateTime;
        this.h = z;
        this.i = z2;
        this.j = list3;
        this.k = z3;
        this.l = userSelf;
        this.m = clubWithAdmin;
        this.n = list4;
        this.o = z4;
        boolean z6 = false;
        if (eventInClub2 == null || (clubWithAdmin2 = eventInClub2.c) == null) {
            z5 = false;
        } else {
            z5 = clubWithAdmin2.c;
        }
        this.p = z5;
        if (eventInClub2 == null) {
            i3 = 0;
        } else {
            i3 = eventInClub2.Y1;
        }
        this.q = i3 > 0;
        if (!(str5 == null || str3.length() == 0)) {
            if ((str6 == null ? 0 : str4.length()) <= i4) {
                z6 = true;
            }
        }
        this.r = z6;
    }

    public static w copy$default(w wVar, EventInClub eventInClub, String str, String str2, String str3, String str4, int i2, OffsetDateTime offsetDateTime, boolean z, boolean z2, List list, boolean z3, UserSelf userSelf, ClubWithAdmin clubWithAdmin, List list2, boolean z4, int i3, Object obj) {
        w wVar2 = wVar;
        int i4 = i3;
        EventInClub eventInClub2 = (i4 & 1) != 0 ? wVar2.a : eventInClub;
        String str5 = (i4 & 2) != 0 ? wVar2.b : str;
        String str6 = (i4 & 4) != 0 ? wVar2.c : str2;
        String str7 = (i4 & 8) != 0 ? wVar2.d : str3;
        String str8 = (i4 & 16) != 0 ? wVar2.e : str4;
        int i5 = (i4 & 32) != 0 ? wVar2.f : i2;
        OffsetDateTime offsetDateTime2 = (i4 & 64) != 0 ? wVar2.g : offsetDateTime;
        boolean z5 = (i4 & 128) != 0 ? wVar2.h : z;
        boolean z6 = (i4 & 256) != 0 ? wVar2.i : z2;
        List list3 = (i4 & 512) != 0 ? wVar2.j : list;
        boolean z7 = (i4 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? wVar2.k : z3;
        UserSelf userSelf2 = (i4 & 2048) != 0 ? wVar2.l : userSelf;
        ClubWithAdmin clubWithAdmin2 = (i4 & 4096) != 0 ? wVar2.m : clubWithAdmin;
        List list4 = (i4 & 8192) != 0 ? wVar2.n : list2;
        boolean z8 = (i4 & 16384) != 0 ? wVar2.o : z4;
        Objects.requireNonNull(wVar);
        i.e(list3, "coHosts");
        i.e(list4, "hostClubs");
        return new w(eventInClub2, str5, str6, str7, str8, i5, offsetDateTime2, z5, z6, list3, z7, userSelf2, clubWithAdmin2, list4, z8);
    }

    public final EventInClub component1() {
        return this.a;
    }

    public final List<UserInList> component10() {
        return this.j;
    }

    public final boolean component11() {
        return this.k;
    }

    public final UserSelf component12() {
        return this.l;
    }

    public final ClubWithAdmin component13() {
        return this.m;
    }

    public final List<ClubWithAdmin> component14() {
        return this.n;
    }

    public final boolean component15() {
        return this.o;
    }

    public final String component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final String component4() {
        return this.d;
    }

    public final String component5() {
        return this.e;
    }

    public final int component6() {
        return this.f;
    }

    public final OffsetDateTime component7() {
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
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return i.a(this.a, wVar.a) && i.a(this.b, wVar.b) && i.a(this.c, wVar.c) && i.a(this.d, wVar.d) && i.a(this.e, wVar.e) && this.f == wVar.f && i.a(this.g, wVar.g) && this.h == wVar.h && this.i == wVar.i && i.a(this.j, wVar.j) && this.k == wVar.k && i.a(this.l, wVar.l) && i.a(this.m, wVar.m) && i.a(this.n, wVar.n) && this.o == wVar.o;
    }

    public int hashCode() {
        EventInClub eventInClub = this.a;
        int i2 = 0;
        int hashCode = (eventInClub == null ? 0 : eventInClub.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int M = a.M(this.f, (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        OffsetDateTime offsetDateTime = this.g;
        int hashCode5 = (M + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        boolean z = this.h;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (hashCode5 + (z ? 1 : 0)) * 31;
        boolean z3 = this.i;
        if (z3) {
            z3 = true;
        }
        int H = a.H(this.j, (i3 + (z3 ? 1 : 0)) * 31, 31);
        boolean z4 = this.k;
        if (z4) {
            z4 = true;
        }
        int i4 = (H + (z4 ? 1 : 0)) * 31;
        UserSelf userSelf = this.l;
        int hashCode6 = (i4 + (userSelf == null ? 0 : userSelf.hashCode())) * 31;
        ClubWithAdmin clubWithAdmin = this.m;
        if (clubWithAdmin != null) {
            i2 = clubWithAdmin.hashCode();
        }
        int H2 = a.H(this.n, (hashCode6 + i2) * 31, 31);
        boolean z5 = this.o;
        if (!z5) {
            z2 = z5;
        }
        return H2 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("AddEditEventViewState(eventForEditing=");
        P0.append(this.a);
        P0.append(", title=");
        P0.append(this.b);
        P0.append(", toolbarRightButtonText=");
        P0.append(this.c);
        P0.append(", name=");
        P0.append(this.d);
        P0.append(", description=");
        P0.append(this.e);
        P0.append(", maxDescriptionLength=");
        P0.append(this.f);
        P0.append(", dateTime=");
        P0.append(this.g);
        P0.append(", showDatePicker=");
        P0.append(this.h);
        P0.append(", showTimePicker=");
        P0.append(this.i);
        P0.append(", coHosts=");
        P0.append(this.j);
        P0.append(", isMemberOnly=");
        P0.append(this.k);
        P0.append(", userSelf=");
        P0.append(this.l);
        P0.append(", selectedHostClub=");
        P0.append(this.m);
        P0.append(", hostClubs=");
        P0.append(this.n);
        P0.append(", loading=");
        return a.C0(P0, this.o, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w(com.clubhouse.android.ui.events.creation.AddEditEventArgs r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "args"
            m0.n.b.i.e(r0, r1)
            com.clubhouse.android.data.models.local.EventInClub r3 = r0.c
            r1 = 0
            if (r3 != 0) goto L_0x000e
            r13 = r1
            goto L_0x0011
        L_0x000e:
            boolean r2 = r3.d2
            r13 = r2
        L_0x0011:
            r2 = 0
            if (r3 != 0) goto L_0x0016
            r6 = r2
            goto L_0x0019
        L_0x0016:
            java.lang.String r4 = r3.a2
            r6 = r4
        L_0x0019:
            if (r3 != 0) goto L_0x001d
            r7 = r2
            goto L_0x0020
        L_0x001d:
            java.lang.String r4 = r3.Z1
            r7 = r4
        L_0x0020:
            if (r3 != 0) goto L_0x0024
            r4 = r2
            goto L_0x0026
        L_0x0024:
            j$.time.OffsetDateTime r4 = r3.c2
        L_0x0026:
            if (r4 != 0) goto L_0x005f
            j$.time.OffsetDateTime r4 = j$.time.OffsetDateTime.now()
            int r4 = r4.getHour()
            r5 = 18
            if (r4 >= r5) goto L_0x0046
            j$.time.OffsetDateTime r4 = j$.time.OffsetDateTime.now()
            j$.time.OffsetDateTime r4 = r4.withHour(r5)
            j$.time.OffsetDateTime r1 = r4.withMinute(r1)
            java.lang.String r4 = "{\n        OffsetDateTime.now().withHour(18).withMinute(0)\n    }"
            m0.n.b.i.d(r1, r4)
            goto L_0x005d
        L_0x0046:
            j$.time.OffsetDateTime r4 = j$.time.OffsetDateTime.now()
            r8 = 1
            j$.time.OffsetDateTime r4 = r4.plusDays(r8)
            j$.time.OffsetDateTime r4 = r4.withHour(r5)
            j$.time.OffsetDateTime r1 = r4.withMinute(r1)
            java.lang.String r4 = "{\n        OffsetDateTime.now().plusDays(1).withHour(18).withMinute(0)\n    }"
            m0.n.b.i.d(r1, r4)
        L_0x005d:
            r9 = r1
            goto L_0x0060
        L_0x005f:
            r9 = r4
        L_0x0060:
            com.clubhouse.android.data.models.local.EventInClub r0 = r0.c
            if (r0 != 0) goto L_0x0066
            r1 = r2
            goto L_0x0068
        L_0x0066:
            java.util.List<com.clubhouse.android.data.models.local.user.UserInList> r1 = r0.b2
        L_0x0068:
            if (r1 != 0) goto L_0x006c
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.c
        L_0x006c:
            r12 = r1
            if (r0 != 0) goto L_0x0071
            r15 = r2
            goto L_0x0074
        L_0x0071:
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r0 = r0.c
            r15 = r0
        L_0x0074:
            r4 = 0
            r5 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 27046(0x69a6, float:3.79E-41)
            r19 = 0
            r2 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.o.w0.w.<init>(com.clubhouse.android.ui.events.creation.AddEditEventArgs):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w(com.clubhouse.android.data.models.local.EventInClub r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, j$.time.OffsetDateTime r23, boolean r24, boolean r25, java.util.List r26, boolean r27, com.clubhouse.android.user.model.UserSelf r28, com.clubhouse.android.data.models.local.club.ClubWithAdmin r29, java.util.List r30, boolean r31, int r32, m0.n.b.f r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r17
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r18
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r19
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r2
            goto L_0x0023
        L_0x0021:
            r5 = r20
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = r2
            goto L_0x002b
        L_0x0029:
            r6 = r21
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0032
            r7 = 200(0xc8, float:2.8E-43)
            goto L_0x0034
        L_0x0032:
            r7 = r22
        L_0x0034:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003a
            r8 = r2
            goto L_0x003c
        L_0x003a:
            r8 = r23
        L_0x003c:
            r9 = r0 & 128(0x80, float:1.794E-43)
            r10 = 0
            if (r9 == 0) goto L_0x0043
            r9 = r10
            goto L_0x0045
        L_0x0043:
            r9 = r24
        L_0x0045:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004b
            r11 = r10
            goto L_0x004d
        L_0x004b:
            r11 = r25
        L_0x004d:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0054
            kotlin.collections.EmptyList r12 = kotlin.collections.EmptyList.c
            goto L_0x0056
        L_0x0054:
            r12 = r26
        L_0x0056:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005c
            r13 = r10
            goto L_0x005e
        L_0x005c:
            r13 = r27
        L_0x005e:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0064
            r14 = r2
            goto L_0x0066
        L_0x0064:
            r14 = r28
        L_0x0066:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            r2 = r29
        L_0x006d:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0074
            kotlin.collections.EmptyList r15 = kotlin.collections.EmptyList.c
            goto L_0x0076
        L_0x0074:
            r15 = r30
        L_0x0076:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r10 = r31
        L_0x007d:
            r17 = r16
            r18 = r1
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r11
            r27 = r12
            r28 = r13
            r29 = r14
            r30 = r2
            r31 = r15
            r32 = r10
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.o.w0.w.<init>(com.clubhouse.android.data.models.local.EventInClub, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, j$.time.OffsetDateTime, boolean, boolean, java.util.List, boolean, com.clubhouse.android.user.model.UserSelf, com.clubhouse.android.data.models.local.club.ClubWithAdmin, java.util.List, boolean, int, m0.n.b.f):void");
    }
}
