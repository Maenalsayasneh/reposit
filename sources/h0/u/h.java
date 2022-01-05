package h0.u;

import androidx.paging.LoadType;
import i0.d.a.a.a;
import kotlin.NoWhenBranchMatchedException;
import m0.n.b.i;

/* compiled from: PageFetcherSnapshot.kt */
public final class h {
    public final int a;
    public final h0 b;

    public h(int i, h0 h0Var) {
        i.e(h0Var, "hint");
        this.a = i;
        this.b = h0Var;
    }

    public final int a(LoadType loadType) {
        i.e(loadType, "loadType");
        int ordinal = loadType.ordinal();
        if (ordinal == 0) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        } else if (ordinal == 1) {
            return this.b.a;
        } else {
            if (ordinal == 2) {
                return this.b.b;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && i.a(this.b, hVar.b);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        h0 h0Var = this.b;
        return hashCode + (h0Var != null ? h0Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("GenerationalViewportHint(generationId=");
        P0.append(this.a);
        P0.append(", hint=");
        P0.append(this.b);
        P0.append(")");
        return P0.toString();
    }
}
