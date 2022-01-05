package i0.e.b.g3.r;

import h0.t.l;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: InvitedByViewModel.kt */
public final class k1 implements j {
    public final h1 a;
    public final l b;

    public k1() {
        this((h1) null, (l) null, 3, (f) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k1(com.clubhouse.android.ui.onboarding.InvitedByFragment.BundleInfo r4) {
        /*
            r3 = this;
            java.lang.String r0 = "args"
            m0.n.b.i.e(r4, r0)
            java.lang.String r0 = "<this>"
            m0.n.b.i.e(r4, r0)
            java.lang.String r0 = r4.c
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            goto L_0x001a
        L_0x0011:
            boolean r0 = kotlin.text.StringsKt__IndentKt.o(r0)
            r0 = r0 ^ r2
            if (r0 != r2) goto L_0x001a
            r0 = r2
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r4.q
            if (r0 != 0) goto L_0x0022
            goto L_0x002b
        L_0x0022:
            boolean r0 = kotlin.text.StringsKt__IndentKt.o(r0)
            r0 = r0 ^ r2
            if (r0 != r2) goto L_0x002b
            r0 = r2
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            if (r0 == 0) goto L_0x003a
            i0.e.b.g3.r.h1$b r0 = new i0.e.b.g3.r.h1$b
            java.lang.String r1 = r4.c
            java.lang.String r2 = r4.q
            java.lang.String r4 = r4.x
            r0.<init>(r1, r2, r4)
            goto L_0x0070
        L_0x003a:
            java.lang.String r0 = r4.q
            if (r0 != 0) goto L_0x003f
            goto L_0x0048
        L_0x003f:
            boolean r0 = kotlin.text.StringsKt__IndentKt.o(r0)
            r0 = r0 ^ r2
            if (r0 != r2) goto L_0x0048
            r0 = r2
            goto L_0x0049
        L_0x0048:
            r0 = r1
        L_0x0049:
            if (r0 == 0) goto L_0x0055
            i0.e.b.g3.r.h1$a r0 = new i0.e.b.g3.r.h1$a
            java.lang.String r1 = r4.q
            java.lang.String r4 = r4.x
            r0.<init>(r1, r4)
            goto L_0x0070
        L_0x0055:
            java.lang.String r0 = r4.c
            if (r0 != 0) goto L_0x005a
            goto L_0x0062
        L_0x005a:
            boolean r0 = kotlin.text.StringsKt__IndentKt.o(r0)
            r0 = r0 ^ r2
            if (r0 != r2) goto L_0x0062
            r1 = r2
        L_0x0062:
            if (r1 == 0) goto L_0x006e
            i0.e.b.g3.r.h1$d r0 = new i0.e.b.g3.r.h1$d
            java.lang.String r1 = r4.c
            java.lang.String r4 = r4.d
            r0.<init>(r1, r4)
            goto L_0x0070
        L_0x006e:
            i0.e.b.g3.r.h1$c r0 = i0.e.b.g3.r.h1.c.a
        L_0x0070:
            r4 = 2
            r1 = 0
            r3.<init>(r0, r1, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.r.k1.<init>(com.clubhouse.android.ui.onboarding.InvitedByFragment$BundleInfo):void");
    }

    public static k1 copy$default(k1 k1Var, h1 h1Var, l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            h1Var = k1Var.a;
        }
        if ((i & 2) != 0) {
            lVar = k1Var.b;
        }
        Objects.requireNonNull(k1Var);
        i.e(h1Var, "invitedBy");
        i.e(lVar, "navigateTo");
        return new k1(h1Var, lVar);
    }

    public final h1 component1() {
        return this.a;
    }

    public final l component2() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return i.a(this.a, k1Var.a) && i.a(this.b, k1Var.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("InvitedByState(invitedBy=");
        P0.append(this.a);
        P0.append(", navigateTo=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }

    public k1(h1 h1Var, l lVar) {
        i.e(h1Var, "invitedBy");
        i.e(lVar, "navigateTo");
        this.a = h1Var;
        this.b = lVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k1(i0.e.b.g3.r.h1 r1, h0.t.l r2, int r3, m0.n.b.f r4) {
        /*
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            i0.e.b.g3.r.h1$c r1 = i0.e.b.g3.r.h1.c.a
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x001c
            com.clubhouse.android.ui.onboarding.CollectNameArgs r2 = new com.clubhouse.android.ui.onboarding.CollectNameArgs
            r3 = 0
            r4 = 1
            r2.<init>(r3, r4)
            java.lang.String r3 = "mavericksArg"
            m0.n.b.i.e(r2, r3)
            i0.e.b.g3.r.i1 r3 = new i0.e.b.g3.r.i1
            r3.<init>(r2)
            r2 = r3
        L_0x001c:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.r.k1.<init>(i0.e.b.g3.r.h1, h0.t.l, int, m0.n.b.f):void");
    }
}
