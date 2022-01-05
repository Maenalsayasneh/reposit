package i0.a.a.e;

import com.afollestad.assent.AssentResult;
import com.afollestad.assent.Permission;
import h0.b0.v;
import java.util.List;
import java.util.Set;
import m0.i;
import m0.n.a.l;

/* compiled from: PendingRequest.kt */
public final class a {
    public final Set<Permission> a;
    public int b;
    public final List<l<AssentResult, i>> c;

    public a(Set<? extends Permission> set, int i, List<l<AssentResult, i>> list) {
        m0.n.b.i.f(set, "permissions");
        m0.n.b.i.f(list, "callbacks");
        this.a = set;
        this.b = i;
        this.c = list;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof a) && v.d0(this.a, ((a) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("PendingRequest(permissions=");
        P0.append(this.a);
        P0.append(", requestCode=");
        P0.append(this.b);
        P0.append(", callbacks=");
        P0.append(this.c);
        P0.append(")");
        return P0.toString();
    }
}
