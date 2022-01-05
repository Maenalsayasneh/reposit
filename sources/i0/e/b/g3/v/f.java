package i0.e.b.g3.v;

import h0.u.w;
import i0.b.b.j;
import i0.d.a.a.a;
import i0.e.b.b3.b.e.m;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: RecentSpeakersViewModel.kt */
public final class f implements j {
    public final w<m> a;

    public f() {
        this((w) null, 1, (m0.n.b.f) null);
    }

    public f(w<m> wVar) {
        i.e(wVar, "recentSpeakersData");
        this.a = wVar;
    }

    public static f copy$default(f fVar, w<m> wVar, int i, Object obj) {
        if ((i & 1) != 0) {
            wVar = fVar.a;
        }
        Objects.requireNonNull(fVar);
        i.e(wVar, "recentSpeakersData");
        return new f(wVar);
    }

    public final w<m> component1() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && i.a(this.a, ((f) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("RecentSpeakersViewState(recentSpeakersData=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(w wVar, int i, m0.n.b.f fVar) {
        this((i & 1) != 0 ? w.c.a() : wVar);
    }
}
