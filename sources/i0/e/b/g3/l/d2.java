package i0.e.b.g3.l;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ClubViewModel.kt */
public final class d2 implements c {
    public final String a;
    public final SourceLocation b;

    public d2(String str, SourceLocation sourceLocation) {
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.a = str;
        this.b = sourceLocation;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return i.a(this.a, d2Var.a) && this.b == d2Var.b;
    }

    public int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("JoinClub(reason=");
        P0.append(this.a);
        P0.append(", source=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }
}
