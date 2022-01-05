package i0.e.e;

import com.clubhouse.wave.data.models.local.SentWave;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import m0.n.b.f;

/* compiled from: WaveBarViewModel.kt */
public final class i implements j {
    public final List<SentWave> a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public i() {
        this((List) null, false, false, 7, (f) null);
    }

    public i(List<SentWave> list, boolean z, boolean z2) {
        m0.n.b.i.e(list, "sentWaves");
        this.a = list;
        this.b = z;
        this.c = z2;
        boolean z3 = true;
        this.d = (!z2 || !(list.isEmpty() ^ true)) ? false : z3;
    }

    public static i copy$default(i iVar, List<SentWave> list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = iVar.a;
        }
        if ((i & 2) != 0) {
            z = iVar.b;
        }
        if ((i & 4) != 0) {
            z2 = iVar.c;
        }
        Objects.requireNonNull(iVar);
        m0.n.b.i.e(list, "sentWaves");
        return new i(list, z, z2);
    }

    public final List<SentWave> component1() {
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
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return m0.n.b.i.a(this.a, iVar.a) && this.b == iVar.b && this.c == iVar.c;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.c;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("WaveBarState(sentWaves=");
        P0.append(this.a);
        P0.append(", expanded=");
        P0.append(this.b);
        P0.append(", enableWaves=");
        return a.C0(P0, this.c, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i(List list, boolean z, boolean z2, int i, f fVar) {
        this((i & 1) != 0 ? EmptyList.c : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
