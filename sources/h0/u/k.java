package h0.u;

import androidx.paging.LoadType;
import h0.u.j;
import i0.d.a.a.a;
import kotlin.NoWhenBranchMatchedException;
import m0.n.b.i;

/* compiled from: LoadStates.kt */
public final class k {
    public static final k a;
    public static final k b = null;
    public final j c;
    public final j d;
    public final j e;

    static {
        j.c cVar = j.c.c;
        a = new k(cVar, cVar, cVar);
    }

    public k(j jVar, j jVar2, j jVar3) {
        i.e(jVar, "refresh");
        i.e(jVar2, "prepend");
        i.e(jVar3, "append");
        this.c = jVar;
        this.d = jVar2;
        this.e = jVar3;
    }

    public static k a(k kVar, j jVar, j jVar2, j jVar3, int i) {
        if ((i & 1) != 0) {
            jVar = kVar.c;
        }
        if ((i & 2) != 0) {
            jVar2 = kVar.d;
        }
        if ((i & 4) != 0) {
            jVar3 = kVar.e;
        }
        i.e(jVar, "refresh");
        i.e(jVar2, "prepend");
        i.e(jVar3, "append");
        return new k(jVar, jVar2, jVar3);
    }

    public final j b(LoadType loadType) {
        i.e(loadType, "loadType");
        int ordinal = loadType.ordinal();
        if (ordinal == 0) {
            return this.c;
        }
        if (ordinal == 1) {
            return this.d;
        }
        if (ordinal == 2) {
            return this.e;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final k c(LoadType loadType, j jVar) {
        i.e(loadType, "loadType");
        i.e(jVar, "newState");
        int ordinal = loadType.ordinal();
        if (ordinal == 0) {
            return a(this, jVar, (j) null, (j) null, 6);
        }
        if (ordinal == 1) {
            return a(this, (j) null, jVar, (j) null, 5);
        }
        if (ordinal == 2) {
            return a(this, (j) null, (j) null, jVar, 3);
        }
        throw new NoWhenBranchMatchedException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return i.a(this.c, kVar.c) && i.a(this.d, kVar.d) && i.a(this.e, kVar.e);
    }

    public int hashCode() {
        j jVar = this.c;
        int i = 0;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        j jVar2 = this.d;
        int hashCode2 = (hashCode + (jVar2 != null ? jVar2.hashCode() : 0)) * 31;
        j jVar3 = this.e;
        if (jVar3 != null) {
            i = jVar3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("LoadStates(refresh=");
        P0.append(this.c);
        P0.append(", prepend=");
        P0.append(this.d);
        P0.append(", append=");
        P0.append(this.e);
        P0.append(")");
        return P0.toString();
    }
}
