package i0.e.b.g3.r;

import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: CollectPhoneNumberViewModel.kt */
public final class p0 implements j {
    public final boolean a;
    public final String b;
    public final Integer c;

    public p0() {
        this(false, (String) null, (Integer) null, 7, (f) null);
    }

    public p0(boolean z, String str, Integer num) {
        i.e(str, "phoneNumber");
        this.a = z;
        this.b = str;
        this.c = num;
    }

    public static p0 copy$default(p0 p0Var, boolean z, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = p0Var.a;
        }
        if ((i & 2) != 0) {
            str = p0Var.b;
        }
        if ((i & 4) != 0) {
            num = p0Var.c;
        }
        Objects.requireNonNull(p0Var);
        i.e(str, "phoneNumber");
        return new p0(z, str, num);
    }

    public final boolean component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final Integer component3() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.a == p0Var.a && i.a(this.b, p0Var.b) && i.a(this.c, p0Var.c);
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        int F = a.F(this.b, (z ? 1 : 0) * true, 31);
        Integer num = this.c;
        return F + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        StringBuilder P0 = a.P0("CollectNumberState(isLoading=");
        P0.append(this.a);
        P0.append(", phoneNumber=");
        P0.append(this.b);
        P0.append(", numDigitsForValidation=");
        return a.v0(P0, this.c, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(boolean z, String str, Integer num, int i, f fVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : num);
    }
}
