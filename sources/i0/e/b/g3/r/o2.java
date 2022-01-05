package i0.e.b.g3.r;

import com.clubhouse.android.ui.onboarding.ValidateNumberArgs;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ValidateNumberWithCallViewModel.kt */
public final class o2 implements j {
    public final String a;
    public final String b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public o2(ValidateNumberArgs validateNumberArgs) {
        this(validateNumberArgs.c, (String) null, 2, (f) null);
        i.e(validateNumberArgs, "args");
    }

    public static o2 copy$default(o2 o2Var, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = o2Var.a;
        }
        if ((i & 2) != 0) {
            str2 = o2Var.b;
        }
        Objects.requireNonNull(o2Var);
        i.e(str, "phoneNumber");
        i.e(str2, "verificationUUID");
        return new o2(str, str2);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return i.a(this.a, o2Var.a) && i.a(this.b, o2Var.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("ValidateNumberWithCallState(phoneNumber=");
        P0.append(this.a);
        P0.append(", verificationUUID=");
        return a.x0(P0, this.b, ')');
    }

    public o2(String str, String str2) {
        i.e(str, "phoneNumber");
        i.e(str2, "verificationUUID");
        this.a = str;
        this.b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(String str, String str2, int i, f fVar) {
        this(str, (i & 2) != 0 ? "" : str2);
    }
}
