package i0.e.b.g3.r;

import com.clubhouse.android.ui.onboarding.CollectUsernameArgs;
import i0.b.b.b;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;
import m0.i;
import m0.n.b.f;

/* compiled from: CollectUsernameViewModel.kt */
public final class w0 implements j {
    public final String a;
    public final String b;
    public final String c;
    public final List<String> d;
    public final boolean e;
    public final boolean f;
    public final b<i> g;
    public final boolean h;

    public w0() {
        this((String) null, (String) null, (String) null, (List) null, false, false, (b) null, 127, (f) null);
    }

    public w0(String str, String str2, String str3, List<String> list, boolean z, boolean z2, b<i> bVar) {
        m0.n.b.i.e(str, "firstName");
        m0.n.b.i.e(str2, "lastName");
        m0.n.b.i.e(list, "suggestedUsernames");
        m0.n.b.i.e(bVar, "suggestedUsernamesRequest");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = z;
        this.f = z2;
        this.g = bVar;
        this.h = !list.isEmpty();
    }

    public static w0 copy$default(w0 w0Var, String str, String str2, String str3, List<String> list, boolean z, boolean z2, b<i> bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = w0Var.a;
        }
        if ((i & 2) != 0) {
            str2 = w0Var.b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = w0Var.c;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            list = w0Var.d;
        }
        List<String> list2 = list;
        if ((i & 16) != 0) {
            z = w0Var.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = w0Var.f;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            bVar = w0Var.g;
        }
        b<i> bVar2 = bVar;
        Objects.requireNonNull(w0Var);
        m0.n.b.i.e(str, "firstName");
        m0.n.b.i.e(str4, "lastName");
        m0.n.b.i.e(list2, "suggestedUsernames");
        m0.n.b.i.e(bVar2, "suggestedUsernamesRequest");
        return new w0(str, str4, str5, list2, z3, z4, bVar2);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final List<String> component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    public final boolean component6() {
        return this.f;
    }

    public final b<i> component7() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return m0.n.b.i.a(this.a, w0Var.a) && m0.n.b.i.a(this.b, w0Var.b) && m0.n.b.i.a(this.c, w0Var.c) && m0.n.b.i.a(this.d, w0Var.d) && this.e == w0Var.e && this.f == w0Var.f && m0.n.b.i.a(this.g, w0Var.g);
    }

    public int hashCode() {
        int F = a.F(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int H = a.H(this.d, (F + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z = this.e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (H + (z ? 1 : 0)) * 31;
        boolean z3 = this.f;
        if (!z3) {
            z2 = z3;
        }
        return this.g.hashCode() + ((i + (z2 ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("CollectUsernameState(firstName=");
        P0.append(this.a);
        P0.append(", lastName=");
        P0.append(this.b);
        P0.append(", username=");
        P0.append(this.c);
        P0.append(", suggestedUsernames=");
        P0.append(this.d);
        P0.append(", isEditMode=");
        P0.append(this.e);
        P0.append(", isLoading=");
        P0.append(this.f);
        P0.append(", suggestedUsernamesRequest=");
        P0.append(this.g);
        P0.append(')');
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public w0(CollectUsernameArgs collectUsernameArgs) {
        this(collectUsernameArgs.c, collectUsernameArgs.d, (String) null, (List) null, false, false, (b) null, 124, (f) null);
        m0.n.b.i.e(collectUsernameArgs, "args");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w0(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.util.List r9, boolean r10, boolean r11, i0.b.b.b r12, int r13, m0.n.b.f r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            java.lang.String r0 = ""
            if (r14 == 0) goto L_0x0008
            r14 = r0
            goto L_0x0009
        L_0x0008:
            r14 = r6
        L_0x0009:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r0 = r7
        L_0x000f:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x0014
            r8 = 0
        L_0x0014:
            r1 = r8
            r6 = r13 & 8
            if (r6 == 0) goto L_0x001b
            kotlin.collections.EmptyList r9 = kotlin.collections.EmptyList.c
        L_0x001b:
            r2 = r9
            r6 = r13 & 16
            r7 = 0
            if (r6 == 0) goto L_0x0023
            r3 = r7
            goto L_0x0024
        L_0x0023:
            r3 = r10
        L_0x0024:
            r6 = r13 & 32
            if (r6 == 0) goto L_0x002a
            r4 = r7
            goto L_0x002b
        L_0x002a:
            r4 = r11
        L_0x002b:
            r6 = r13 & 64
            if (r6 == 0) goto L_0x0031
            i0.b.b.g0 r12 = i0.b.b.g0.b
        L_0x0031:
            r13 = r12
            r6 = r5
            r7 = r14
            r8 = r0
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.r.w0.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, boolean, i0.b.b.b, int, m0.n.b.f):void");
    }
}
