package i0.e.b.g3.s;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: PaymentsRegistrationViewModel.kt */
public final class f1 implements c {
    public final boolean a;

    public f1(boolean z) {
        this.a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && this.a == ((f1) obj).a;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return a.C0(a.P0("ToggleReceivingPayments(enabled="), this.a, ')');
    }
}
