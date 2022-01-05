package i0.e.b.g3.u;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: HalfProfileViewModel.kt */
public final class o5 implements c {
    public final int a;
    public final SourceLocation b;

    public o5(int i, SourceLocation sourceLocation) {
        i.e(sourceLocation, "sourceLocation");
        this.a = i;
        this.b = sourceLocation;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5)) {
            return false;
        }
        o5 o5Var = (o5) obj;
        return this.a == o5Var.a && this.b == o5Var.b;
    }

    public int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("StartClosedChannel(userId=");
        P0.append(this.a);
        P0.append(", sourceLocation=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }
}
