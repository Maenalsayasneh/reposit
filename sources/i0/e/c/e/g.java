package i0.e.c.e;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: BackchannelCreateChatViewModel.kt */
public final class g implements c {
    public final SourceLocation a;

    public g(SourceLocation sourceLocation) {
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.a = sourceLocation;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.a == ((g) obj).a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("Create(source=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
