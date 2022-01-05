package i0.e.c.b;

import i0.b.b.j;
import i0.e.c.f.b.a.a;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import m0.n.b.i;

/* compiled from: BackchannelArchiveViewModel.kt */
public final class f implements j {
    public final List<a> a;
    public final boolean b;

    public f() {
        this((List) null, false, 3, (m0.n.b.f) null);
    }

    public f(List<a> list, boolean z) {
        i.e(list, "archivedChats");
        this.a = list;
        this.b = z;
    }

    public static f copy$default(f fVar, List<a> list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fVar.a;
        }
        if ((i & 2) != 0) {
            z = fVar.b;
        }
        Objects.requireNonNull(fVar);
        i.e(list, "archivedChats");
        return new f(list, z);
    }

    public final List<a> component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return i.a(this.a, fVar.a) && this.b == fVar.b;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("BackchannelArchiveState(archivedChats=");
        P0.append(this.a);
        P0.append(", loading=");
        return i0.d.a.a.a.C0(P0, this.b, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f(List list, boolean z, int i, m0.n.b.f fVar) {
        this((i & 1) != 0 ? EmptyList.c : list, (i & 2) != 0 ? false : z);
    }
}
