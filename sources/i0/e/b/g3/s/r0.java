package i0.e.b.g3.s;

import com.clubhouse.android.data.models.remote.response.GetPaymentRegistrationResponse;
import com.clubhouse.android.ui.payments.RegistrationStatus;
import i0.b.b.b;
import i0.b.b.j;
import i0.d.a.a.a;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: PaymentsRegistrationViewModel.kt */
public final class r0 implements j {
    public final RegistrationStatus a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final b<GetPaymentRegistrationResponse> e;

    public r0() {
        this((RegistrationStatus) null, false, false, (String) null, (b) null, 31, (f) null);
    }

    public r0(RegistrationStatus registrationStatus, boolean z, boolean z2, String str, b<GetPaymentRegistrationResponse> bVar) {
        i.e(registrationStatus, "registrationStatus");
        i.e(bVar, "registrationRequest");
        this.a = registrationStatus;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = bVar;
    }

    public static /* synthetic */ r0 copy$default(r0 r0Var, RegistrationStatus registrationStatus, boolean z, boolean z2, String str, b<GetPaymentRegistrationResponse> bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            registrationStatus = r0Var.a;
        }
        if ((i & 2) != 0) {
            z = r0Var.b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = r0Var.c;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            str = r0Var.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            bVar = r0Var.e;
        }
        return r0Var.a(registrationStatus, z3, z4, str2, bVar);
    }

    public final r0 a(RegistrationStatus registrationStatus, boolean z, boolean z2, String str, b<GetPaymentRegistrationResponse> bVar) {
        i.e(registrationStatus, "registrationStatus");
        i.e(bVar, "registrationRequest");
        return new r0(registrationStatus, z, z2, str, bVar);
    }

    public final RegistrationStatus component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public final String component4() {
        return this.d;
    }

    public final b<GetPaymentRegistrationResponse> component5() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.a == r0Var.a && this.b == r0Var.b && this.c == r0Var.c && i.a(this.d, r0Var.d) && i.a(this.e, r0Var.e);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
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
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        String str = this.d;
        return this.e.hashCode() + ((i2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("PaymentsRegistrationState(registrationStatus=");
        P0.append(this.a);
        P0.append(", isRegistered=");
        P0.append(this.b);
        P0.append(", paymentsEnabled=");
        P0.append(this.c);
        P0.append(", stripeUrl=");
        P0.append(this.d);
        P0.append(", registrationRequest=");
        P0.append(this.e);
        P0.append(')');
        return P0.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ r0(com.clubhouse.android.ui.payments.RegistrationStatus r4, boolean r5, boolean r6, java.lang.String r7, i0.b.b.b r8, int r9, m0.n.b.f r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            com.clubhouse.android.ui.payments.RegistrationStatus r4 = com.clubhouse.android.ui.payments.RegistrationStatus.NotStarted
        L_0x0006:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto L_0x000d
            r10 = r0
            goto L_0x000e
        L_0x000d:
            r10 = r5
        L_0x000e:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r0 = r6
        L_0x0014:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0019
            r7 = 0
        L_0x0019:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0020
            i0.b.b.g0 r8 = i0.b.b.g0.b
        L_0x0020:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.s.r0.<init>(com.clubhouse.android.ui.payments.RegistrationStatus, boolean, boolean, java.lang.String, i0.b.b.b, int, m0.n.b.f):void");
    }
}
