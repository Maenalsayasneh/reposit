package i0.e.b.g3.l.x2;

import com.clubhouse.android.data.models.remote.response.GetClubNominationsResponse;
import com.clubhouse.android.ui.clubs.invites.GrowClubArgs;
import com.clubhouse.android.ui.clubs.invites.GrowClubSource;
import h0.u.w;
import i0.b.b.b;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import java.util.Set;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: GrowClubViewModel.kt */
public final class t implements j {
    public final int a;
    public final boolean b;
    public final w<i0.e.b.b3.b.e.j> c;
    public final w<i0.e.b.b3.b.e.j> d;
    public final Set<Integer> e;
    public final Set<Integer> f;
    public final String g;
    public final b<GetClubNominationsResponse> h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t(int r13, boolean r14, h0.u.w r15, h0.u.w r16, java.util.Set r17, java.util.Set r18, java.lang.String r19, i0.b.b.b r20, int r21, m0.n.b.f r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000a
        L_0x0009:
            r6 = r15
        L_0x000a:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0010
            r7 = r2
            goto L_0x0012
        L_0x0010:
            r7 = r16
        L_0x0012:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001a
            kotlin.collections.EmptySet r1 = kotlin.collections.EmptySet.c
            r8 = r1
            goto L_0x001c
        L_0x001a:
            r8 = r17
        L_0x001c:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0024
            kotlin.collections.EmptySet r1 = kotlin.collections.EmptySet.c
            r9 = r1
            goto L_0x0026
        L_0x0024:
            r9 = r18
        L_0x0026:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002e
            java.lang.String r1 = ""
            r10 = r1
            goto L_0x0030
        L_0x002e:
            r10 = r19
        L_0x0030:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0038
            i0.b.b.g0 r0 = i0.b.b.g0.b
            r11 = r0
            goto L_0x003a
        L_0x0038:
            r11 = r20
        L_0x003a:
            r3 = r12
            r4 = r13
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.l.x2.t.<init>(int, boolean, h0.u.w, h0.u.w, java.util.Set, java.util.Set, java.lang.String, i0.b.b.b, int, m0.n.b.f):void");
    }

    public static t copy$default(t tVar, int i, boolean z, w wVar, w wVar2, Set set, Set set2, String str, b bVar, int i2, Object obj) {
        t tVar2 = tVar;
        int i3 = i2;
        int i4 = (i3 & 1) != 0 ? tVar2.a : i;
        boolean z2 = (i3 & 2) != 0 ? tVar2.b : z;
        w wVar3 = (i3 & 4) != 0 ? tVar2.c : wVar;
        w wVar4 = (i3 & 8) != 0 ? tVar2.d : wVar2;
        Set set3 = (i3 & 16) != 0 ? tVar2.e : set;
        Set set4 = (i3 & 32) != 0 ? tVar2.f : set2;
        String str2 = (i3 & 64) != 0 ? tVar2.g : str;
        b bVar2 = (i3 & 128) != 0 ? tVar2.h : bVar;
        Objects.requireNonNull(tVar);
        i.e(set3, "loadingUserIds");
        i.e(set4, "addedUserIds");
        i.e(str2, "query");
        i.e(bVar2, "nominations");
        return new t(i4, z2, wVar3, wVar4, set3, set4, str2, bVar2);
    }

    public final int component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    public final w<i0.e.b.b3.b.e.j> component3() {
        return this.c;
    }

    public final w<i0.e.b.b3.b.e.j> component4() {
        return this.d;
    }

    public final Set<Integer> component5() {
        return this.e;
    }

    public final Set<Integer> component6() {
        return this.f;
    }

    public final String component7() {
        return this.g;
    }

    public final b<GetClubNominationsResponse> component8() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a == tVar.a && this.b == tVar.b && i.a(this.c, tVar.c) && i.a(this.d, tVar.d) && i.a(this.e, tVar.e) && i.a(this.f, tVar.f) && i.a(this.g, tVar.g) && i.a(this.h, tVar.h);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        w<i0.e.b.b3.b.e.j> wVar = this.c;
        int i2 = 0;
        int hashCode2 = (i + (wVar == null ? 0 : wVar.hashCode())) * 31;
        w<i0.e.b.b3.b.e.j> wVar2 = this.d;
        if (wVar2 != null) {
            i2 = wVar2.hashCode();
        }
        return this.h.hashCode() + a.F(this.g, a.I(this.f, a.I(this.e, (hashCode2 + i2) * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("GrowClubViewState(clubId=");
        P0.append(this.a);
        P0.append(", showInviteCard=");
        P0.append(this.b);
        P0.append(", data=");
        P0.append(this.c);
        P0.append(", searchData=");
        P0.append(this.d);
        P0.append(", loadingUserIds=");
        P0.append(this.e);
        P0.append(", addedUserIds=");
        P0.append(this.f);
        P0.append(", query=");
        P0.append(this.g);
        P0.append(", nominations=");
        P0.append(this.h);
        P0.append(')');
        return P0.toString();
    }

    public t(int i, boolean z, w<i0.e.b.b3.b.e.j> wVar, w<i0.e.b.b3.b.e.j> wVar2, Set<Integer> set, Set<Integer> set2, String str, b<GetClubNominationsResponse> bVar) {
        i.e(set, "loadingUserIds");
        i.e(set2, "addedUserIds");
        i.e(str, "query");
        i.e(bVar, "nominations");
        this.a = i;
        this.b = z;
        this.c = wVar;
        this.d = wVar2;
        this.e = set;
        this.f = set2;
        this.g = str;
        this.h = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public t(GrowClubArgs growClubArgs) {
        this(growClubArgs.c, growClubArgs.q == GrowClubSource.CLUB, (w) null, (w) null, (Set) null, (Set) null, (String) null, (b) null, 252, (f) null);
        i.e(growClubArgs, "args");
    }
}
