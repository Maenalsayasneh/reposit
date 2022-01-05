package i0.e.b.g3.u.z5;

import com.clubhouse.app.R;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: AccountViewModel.kt */
public final class n0 implements j {
    public final boolean a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final int f;

    public n0() {
        this(false, (String) null, false, (String) null, false, 31, (f) null);
    }

    public n0(boolean z, String str, boolean z2, String str2, boolean z3) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = str2;
        this.e = z3;
        this.f = (z || z2) ? R.string.next_button : R.string.do_this_later;
    }

    public static n0 copy$default(n0 n0Var, boolean z, String str, boolean z2, String str2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = n0Var.a;
        }
        if ((i & 2) != 0) {
            str = n0Var.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            z2 = n0Var.c;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            str2 = n0Var.d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            z3 = n0Var.e;
        }
        boolean z5 = z3;
        Objects.requireNonNull(n0Var);
        return new n0(z, str3, z4, str4, z5);
    }

    public final boolean component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public final String component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.a == n0Var.a && i.a(this.b, n0Var.b) && this.c == n0Var.c && i.a(this.d, n0Var.d) && this.e == n0Var.e;
    }

    public int hashCode() {
        boolean z = this.a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        boolean z3 = this.c;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode + (z3 ? 1 : 0)) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i4 = (i3 + i2) * 31;
        boolean z4 = this.e;
        if (!z4) {
            z2 = z4;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("AccountState(isTwitterConnected=");
        P0.append(this.a);
        P0.append(", twitterUsername=");
        P0.append(this.b);
        P0.append(", isInstagramConnected=");
        P0.append(this.c);
        P0.append(", instagramUsername=");
        P0.append(this.d);
        P0.append(", loading=");
        return a.C0(P0, this.e, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ n0(boolean r5, java.lang.String r6, boolean r7, java.lang.String r8, boolean r9, int r10, m0.n.b.f r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            r1 = 0
            if (r5 == 0) goto L_0x000f
            r2 = r1
            goto L_0x0010
        L_0x000f:
            r2 = r6
        L_0x0010:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0016
            r3 = r0
            goto L_0x0017
        L_0x0016:
            r3 = r7
        L_0x0017:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r1 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r2
            r8 = r3
            r9 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.u.z5.n0.<init>(boolean, java.lang.String, boolean, java.lang.String, boolean, int, m0.n.b.f):void");
    }
}
