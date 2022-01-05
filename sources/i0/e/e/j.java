package i0.e.e;

import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;

/* compiled from: WaveCoordinatorViewModel.kt */
public final class j implements i0.b.b.j {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public j() {
        this(false, false, false, 7, (f) null);
    }

    public j(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static j copy$default(j jVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = jVar.a;
        }
        if ((i & 2) != 0) {
            z2 = jVar.b;
        }
        if ((i & 4) != 0) {
            z3 = jVar.c;
        }
        Objects.requireNonNull(jVar);
        return new j(z, z2, z3);
    }

    public final boolean component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.b == jVar.b && this.c == jVar.c;
    }

    public int hashCode() {
        boolean z = this.a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.c;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("WaveCoordinatorState(waveEnabled=");
        P0.append(this.a);
        P0.append(", wavesSuspended=");
        P0.append(this.b);
        P0.append(", waveChannelLoading=");
        return a.C0(P0, this.c, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(boolean z, boolean z2, boolean z3, int i, f fVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
