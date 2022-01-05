package i0.e.b.g3.l;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import com.clubhouse.android.data.models.remote.response.GetEventsResponse;
import com.clubhouse.android.ui.clubs.ClubArgs;
import com.clubhouse.android.ui.clubs.invites.GrowClubArgs;
import h0.u.w;
import i0.b.b.b;
import i0.b.b.j;
import i0.e.b.b3.b.e.f;
import i0.e.b.g3.l.y2.a;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import m0.j.g;
import m0.n.b.i;

/* compiled from: ClubViewModel.kt */
public final class v1 implements j {
    public final Integer a;
    public final ClubArgs b;
    public final b<GetClubResponse> c;
    public final b<GetEventsResponse> d;
    public final GetClubResponse e;
    public final w<f> f;
    public final boolean g;
    public final a h;
    public final ClubWithAdmin i;
    public final List<Integer> j;
    public final EventInClub k;
    public final String l;
    public final boolean m;

    public v1() {
        this((Integer) null, (ClubArgs) null, (b) null, (b) null, (GetClubResponse) null, (w) null, false, (a) null, 255, (m0.n.b.f) null);
    }

    public v1(Integer num, ClubArgs clubArgs, b<GetClubResponse> bVar, b<GetEventsResponse> bVar2, GetClubResponse getClubResponse, w<f> wVar, boolean z, a aVar) {
        ClubWithAdmin clubWithAdmin;
        List<Integer> list;
        EventInClub eventInClub;
        String str;
        List<EventInClub> list2;
        i.e(bVar, "clubRequest");
        i.e(bVar2, "events");
        i.e(wVar, "clubMembershipData");
        i.e(aVar, "migrationUpsellType");
        this.a = num;
        this.b = clubArgs;
        this.c = bVar;
        this.d = bVar2;
        this.e = getClubResponse;
        this.f = wVar;
        this.g = z;
        this.h = aVar;
        String str2 = null;
        if (getClubResponse == null) {
            clubWithAdmin = null;
        } else {
            clubWithAdmin = getClubResponse.c;
        }
        this.i = clubWithAdmin;
        if (getClubResponse == null) {
            list = null;
        } else {
            list = getClubResponse.b2;
        }
        this.j = list == null ? EmptyList.c : list;
        GetEventsResponse a2 = bVar2.a();
        if (a2 == null || (list2 = a2.a) == null) {
            eventInClub = null;
        } else {
            eventInClub = (EventInClub) g.w(list2);
        }
        this.k = eventInClub;
        if (eventInClub == null) {
            str = null;
        } else {
            str = eventInClub.y;
        }
        if (str != null) {
            str2 = str;
        } else if (getClubResponse != null) {
            str2 = getClubResponse.c2;
        }
        this.l = str2;
        boolean z2 = false;
        if (getClubResponse != null && getClubResponse.d) {
            z2 = true;
        }
        this.m = z2;
    }

    public static v1 copy$default(v1 v1Var, Integer num, ClubArgs clubArgs, b bVar, b bVar2, GetClubResponse getClubResponse, w wVar, boolean z, a aVar, int i2, Object obj) {
        v1 v1Var2 = v1Var;
        int i3 = i2;
        Integer num2 = (i3 & 1) != 0 ? v1Var2.a : num;
        ClubArgs clubArgs2 = (i3 & 2) != 0 ? v1Var2.b : clubArgs;
        b bVar3 = (i3 & 4) != 0 ? v1Var2.c : bVar;
        b bVar4 = (i3 & 8) != 0 ? v1Var2.d : bVar2;
        GetClubResponse getClubResponse2 = (i3 & 16) != 0 ? v1Var2.e : getClubResponse;
        w wVar2 = (i3 & 32) != 0 ? v1Var2.f : wVar;
        boolean z2 = (i3 & 64) != 0 ? v1Var2.g : z;
        a aVar2 = (i3 & 128) != 0 ? v1Var2.h : aVar;
        Objects.requireNonNull(v1Var);
        i.e(bVar3, "clubRequest");
        i.e(bVar4, "events");
        i.e(wVar2, "clubMembershipData");
        i.e(aVar2, "migrationUpsellType");
        return new v1(num2, clubArgs2, bVar3, bVar4, getClubResponse2, wVar2, z2, aVar2);
    }

    public final Integer component1() {
        return this.a;
    }

    public final ClubArgs component2() {
        return this.b;
    }

    public final b<GetClubResponse> component3() {
        return this.c;
    }

    public final b<GetEventsResponse> component4() {
        return this.d;
    }

    public final GetClubResponse component5() {
        return this.e;
    }

    public final w<f> component6() {
        return this.f;
    }

    public final boolean component7() {
        return this.g;
    }

    public final a component8() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return i.a(this.a, v1Var.a) && i.a(this.b, v1Var.b) && i.a(this.c, v1Var.c) && i.a(this.d, v1Var.d) && i.a(this.e, v1Var.e) && i.a(this.f, v1Var.f) && this.g == v1Var.g && i.a(this.h, v1Var.h);
    }

    public int hashCode() {
        Integer num = this.a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        ClubArgs clubArgs = this.b;
        int hashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (clubArgs == null ? 0 : clubArgs.hashCode())) * 31)) * 31)) * 31;
        GetClubResponse getClubResponse = this.e;
        if (getClubResponse != null) {
            i2 = getClubResponse.hashCode();
        }
        int hashCode3 = (this.f.hashCode() + ((hashCode2 + i2) * 31)) * 31;
        boolean z = this.g;
        if (z) {
            z = true;
        }
        return this.h.hashCode() + ((hashCode3 + (z ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClubViewState(clubId=");
        P0.append(this.a);
        P0.append(", args=");
        P0.append(this.b);
        P0.append(", clubRequest=");
        P0.append(this.c);
        P0.append(", events=");
        P0.append(this.d);
        P0.append(", clubInfo=");
        P0.append(this.e);
        P0.append(", clubMembershipData=");
        P0.append(this.f);
        P0.append(", justCreated=");
        P0.append(this.g);
        P0.append(", migrationUpsellType=");
        P0.append(this.h);
        P0.append(')');
        return P0.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ v1(java.lang.Integer r11, com.clubhouse.android.ui.clubs.ClubArgs r12, i0.b.b.b r13, i0.b.b.b r14, com.clubhouse.android.data.models.remote.response.GetClubResponse r15, h0.u.w r16, boolean r17, i0.e.b.g3.l.y2.a r18, int r19, m0.n.b.f r20) {
        /*
            r10 = this;
            r0 = r19
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            i0.b.b.g0 r4 = i0.b.b.g0.b
            goto L_0x0019
        L_0x0018:
            r4 = r13
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            i0.b.b.g0 r5 = i0.b.b.g0.b
            goto L_0x0021
        L_0x0020:
            r5 = r14
        L_0x0021:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r2 = r15
        L_0x0027:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0032
            h0.u.w$b r6 = h0.u.w.c
            h0.u.w r6 = r6.a()
            goto L_0x0034
        L_0x0032:
            r6 = r16
        L_0x0034:
            r7 = r0 & 64
            r8 = 0
            if (r7 == 0) goto L_0x003b
            r7 = r8
            goto L_0x003d
        L_0x003b:
            r7 = r17
        L_0x003d:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0048
            i0.e.b.g3.l.y2.a$a r0 = new i0.e.b.g3.l.y2.a$a
            r9 = 1
            r0.<init>(r8, r9)
            goto L_0x004a
        L_0x0048:
            r0 = r18
        L_0x004a:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r2
            r17 = r6
            r18 = r7
            r19 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.l.v1.<init>(java.lang.Integer, com.clubhouse.android.ui.clubs.ClubArgs, i0.b.b.b, i0.b.b.b, com.clubhouse.android.data.models.remote.response.GetClubResponse, h0.u.w, boolean, i0.e.b.g3.l.y2.a, int, m0.n.b.f):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public v1(GrowClubArgs growClubArgs) {
        this(Integer.valueOf(growClubArgs.c), (ClubArgs) null, (b) null, (b) null, (GetClubResponse) null, (w) null, false, (a) null, 254, (m0.n.b.f) null);
        i.e(growClubArgs, "args");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public v1(ClubArgs clubArgs) {
        this(clubArgs.c, clubArgs, (b) null, (b) null, (GetClubResponse) null, (w) null, clubArgs.x, clubArgs.y ? new a.b(false, 1) : new a.C0201a(false, 1), 60, (m0.n.b.f) null);
        i.e(clubArgs, "args");
    }
}
