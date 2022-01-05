package h0.u;

import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: CombinedLoadStates.kt */
public final class b {
    public final j a;
    public final j b;
    public final j c;
    public final k d;
    public final k e;

    static {
        k kVar = k.b;
        i.e(k.a, Stripe3ds2AuthParams.FIELD_SOURCE);
    }

    public b(j jVar, j jVar2, j jVar3, k kVar, k kVar2) {
        i.e(jVar, "refresh");
        i.e(jVar2, "prepend");
        i.e(jVar3, "append");
        i.e(kVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.a = jVar;
        this.b = jVar2;
        this.c = jVar3;
        this.d = kVar;
        this.e = kVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.a(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.paging.CombinedLoadStates");
        b bVar = (b) obj;
        return !(i.a(this.a, bVar.a) ^ true) && !(i.a(this.b, bVar.b) ^ true) && !(i.a(this.c, bVar.c) ^ true) && !(i.a(this.d, bVar.d) ^ true) && !(i.a(this.e, bVar.e) ^ true);
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        k kVar = this.e;
        return hashCode2 + (kVar != null ? kVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("CombinedLoadStates(refresh=");
        P0.append(this.a);
        P0.append(", prepend=");
        P0.append(this.b);
        P0.append(", append=");
        P0.append(this.c);
        P0.append(", ");
        P0.append("source=");
        P0.append(this.d);
        P0.append(", mediator=");
        P0.append(this.e);
        P0.append(')');
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(j jVar, j jVar2, j jVar3, k kVar, k kVar2, int i) {
        this(jVar, jVar2, jVar3, kVar, (k) null);
        int i2 = i & 16;
    }
}
