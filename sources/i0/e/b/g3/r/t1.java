package i0.e.b.g3.r;

import com.clubhouse.android.ui.onboarding.ValidateNumberArgs;
import i0.b.b.b;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ValidateNumberViewModel.kt */
public final class t1 implements j {
    public final String a;
    public final b<p2> b;
    public final b<Boolean> c;
    public final b<Boolean> d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public t1(String str, b<p2> bVar, b<Boolean> bVar2, b<Boolean> bVar3, boolean z, boolean z2, boolean z3) {
        i.e(str, "phoneNumber");
        i.e(bVar, "verificationStatus");
        i.e(bVar2, "codeResent");
        i.e(bVar3, "phoneCallScheduled");
        this.a = str;
        this.b = bVar;
        this.c = bVar2;
        this.d = bVar3;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public static t1 copy$default(t1 t1Var, String str, b<p2> bVar, b<Boolean> bVar2, b<Boolean> bVar3, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = t1Var.a;
        }
        if ((i & 2) != 0) {
            bVar = t1Var.b;
        }
        b<p2> bVar4 = bVar;
        if ((i & 4) != 0) {
            bVar2 = t1Var.c;
        }
        b<Boolean> bVar5 = bVar2;
        if ((i & 8) != 0) {
            bVar3 = t1Var.d;
        }
        b<Boolean> bVar6 = bVar3;
        if ((i & 16) != 0) {
            z = t1Var.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z2 = t1Var.f;
        }
        boolean z5 = z2;
        if ((i & 64) != 0) {
            z3 = t1Var.g;
        }
        boolean z6 = z3;
        Objects.requireNonNull(t1Var);
        i.e(str, "phoneNumber");
        i.e(bVar4, "verificationStatus");
        i.e(bVar5, "codeResent");
        i.e(bVar6, "phoneCallScheduled");
        return new t1(str, bVar4, bVar5, bVar6, z4, z5, z6);
    }

    public final String component1() {
        return this.a;
    }

    public final b<p2> component2() {
        return this.b;
    }

    public final b<Boolean> component3() {
        return this.c;
    }

    public final b<Boolean> component4() {
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return i.a(this.a, t1Var.a) && i.a(this.b, t1Var.b) && i.a(this.c, t1Var.c) && i.a(this.d, t1Var.d) && this.e == t1Var.e && this.f == t1Var.f && this.g == t1Var.g;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        boolean z = this.e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.g;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("OnboardingState(phoneNumber=");
        P0.append(this.a);
        P0.append(", verificationStatus=");
        P0.append(this.b);
        P0.append(", codeResent=");
        P0.append(this.c);
        P0.append(", phoneCallScheduled=");
        P0.append(this.d);
        P0.append(", codeResendWait=");
        P0.append(this.e);
        P0.append(", codeResendBlocked=");
        P0.append(this.f);
        P0.append(", showPhoneCallCta=");
        return a.C0(P0, this.g, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ t1(java.lang.String r8, i0.b.b.b r9, i0.b.b.b r10, i0.b.b.b r11, boolean r12, boolean r13, boolean r14, int r15, m0.n.b.f r16) {
        /*
            r7 = this;
            r0 = r15 & 2
            if (r0 == 0) goto L_0x0007
            i0.b.b.g0 r0 = i0.b.b.g0.b
            goto L_0x0008
        L_0x0007:
            r0 = r9
        L_0x0008:
            r1 = r15 & 4
            if (r1 == 0) goto L_0x000f
            i0.b.b.g0 r1 = i0.b.b.g0.b
            goto L_0x0010
        L_0x000f:
            r1 = r10
        L_0x0010:
            r2 = r15 & 8
            if (r2 == 0) goto L_0x0017
            i0.b.b.g0 r2 = i0.b.b.g0.b
            goto L_0x0018
        L_0x0017:
            r2 = r11
        L_0x0018:
            r3 = r15 & 16
            if (r3 == 0) goto L_0x001e
            r3 = 1
            goto L_0x001f
        L_0x001e:
            r3 = r12
        L_0x001f:
            r4 = r15 & 32
            r5 = 0
            if (r4 == 0) goto L_0x0026
            r4 = r5
            goto L_0x0027
        L_0x0026:
            r4 = r13
        L_0x0027:
            r6 = r15 & 64
            if (r6 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r5 = r14
        L_0x002d:
            r9 = r7
            r10 = r8
            r11 = r0
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.r.t1.<init>(java.lang.String, i0.b.b.b, i0.b.b.b, i0.b.b.b, boolean, boolean, boolean, int, m0.n.b.f):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public t1(ValidateNumberArgs validateNumberArgs) {
        this(validateNumberArgs.c, (b) null, (b) null, (b) null, false, false, false, 126, (f) null);
        i.e(validateNumberArgs, "args");
    }
}
