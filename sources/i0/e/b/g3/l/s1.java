package i0.e.b.g3.l;

import com.clubhouse.android.ui.clubs.ClubMemberSearchArgs;
import h0.u.w;
import i0.b.b.j;
import i0.d.a.a.a;
import i0.e.b.b3.b.e.f;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: ClubMemberSearchViewModel.kt */
public final class s1 implements j {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final w<f> d;
    public final String e;
    public final w<f> f;

    public s1() {
        this(0, false, false, (w) null, (String) null, (w) null, 63, (m0.n.b.f) null);
    }

    public s1(int i, boolean z, boolean z2, w<f> wVar, String str, w<f> wVar2) {
        i.e(wVar, "clubMembershipData");
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = wVar;
        this.e = str;
        this.f = wVar2;
    }

    public static s1 copy$default(s1 s1Var, int i, boolean z, boolean z2, w<f> wVar, String str, w<f> wVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = s1Var.a;
        }
        if ((i2 & 2) != 0) {
            z = s1Var.b;
        }
        boolean z3 = z;
        if ((i2 & 4) != 0) {
            z2 = s1Var.c;
        }
        boolean z4 = z2;
        if ((i2 & 8) != 0) {
            wVar = s1Var.d;
        }
        w<f> wVar3 = wVar;
        if ((i2 & 16) != 0) {
            str = s1Var.e;
        }
        String str2 = str;
        if ((i2 & 32) != 0) {
            wVar2 = s1Var.f;
        }
        w<f> wVar4 = wVar2;
        Objects.requireNonNull(s1Var);
        i.e(wVar3, "clubMembershipData");
        return new s1(i, z3, z4, wVar3, str2, wVar4);
    }

    public final int component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public final w<f> component4() {
        return this.d;
    }

    public final String component5() {
        return this.e;
    }

    public final w<f> component6() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return this.a == s1Var.a && this.b == s1Var.b && this.c == s1Var.c && i.a(this.d, s1Var.d) && i.a(this.e, s1Var.e) && i.a(this.f, s1Var.f);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        boolean z = this.b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.c;
        if (!z3) {
            z2 = z3;
        }
        int hashCode2 = (this.d.hashCode() + ((i + (z2 ? 1 : 0)) * 31)) * 31;
        String str = this.e;
        int i2 = 0;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        w<f> wVar = this.f;
        if (wVar != null) {
            i2 = wVar.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ClubMemberSearchViewState(clubId=");
        P0.append(this.a);
        P0.append(", isAdmin=");
        P0.append(this.b);
        P0.append(", isLeader=");
        P0.append(this.c);
        P0.append(", clubMembershipData=");
        P0.append(this.d);
        P0.append(", searchQuery=");
        P0.append(this.e);
        P0.append(", searchResult=");
        P0.append(this.f);
        P0.append(')');
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public s1(ClubMemberSearchArgs clubMemberSearchArgs) {
        this(clubMemberSearchArgs.c, clubMemberSearchArgs.d, clubMemberSearchArgs.q, (w) null, (String) null, (w) null, 56, (m0.n.b.f) null);
        i.e(clubMemberSearchArgs, "args");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ s1(int r5, boolean r6, boolean r7, h0.u.w r8, java.lang.String r9, h0.u.w r10, int r11, m0.n.b.f r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L_0x0007
            r12 = r0
            goto L_0x0008
        L_0x0007:
            r12 = r5
        L_0x0008:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r0 = r7
        L_0x0015:
            r5 = r11 & 8
            if (r5 == 0) goto L_0x001f
            h0.u.w$b r5 = h0.u.w.c
            h0.u.w r8 = r5.a()
        L_0x001f:
            r2 = r8
            r5 = r11 & 16
            r6 = 0
            if (r5 == 0) goto L_0x0027
            r3 = r6
            goto L_0x0028
        L_0x0027:
            r3 = r9
        L_0x0028:
            r5 = r11 & 32
            if (r5 == 0) goto L_0x002e
            r11 = r6
            goto L_0x002f
        L_0x002e:
            r11 = r10
        L_0x002f:
            r5 = r4
            r6 = r12
            r7 = r1
            r8 = r0
            r9 = r2
            r10 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.l.s1.<init>(int, boolean, boolean, h0.u.w, java.lang.String, h0.u.w, int, m0.n.b.f):void");
    }
}
