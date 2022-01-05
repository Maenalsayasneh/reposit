package i0.e.b.g3.k.w0.a;

import h0.u.w;
import i0.b.b.j;
import i0.d.a.a.a;
import i0.e.b.b3.b.e.d;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: FollowSpeakersViewModel.kt */
public final class e implements j {
    public final w<d> a;

    public e() {
        this((w) null, 1, (f) null);
    }

    public e(w<d> wVar) {
        i.e(wVar, "userData");
        this.a = wVar;
    }

    public static e copy$default(e eVar, w<d> wVar, int i, Object obj) {
        if ((i & 1) != 0) {
            wVar = eVar.a;
        }
        Objects.requireNonNull(eVar);
        i.e(wVar, "userData");
        return new e(wVar);
    }

    public final w<d> component1() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && i.a(this.a, ((e) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("FollowSpeakersViewState(userData=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(w wVar, int i, f fVar) {
        this((i & 1) != 0 ? w.c.a() : wVar);
    }
}
