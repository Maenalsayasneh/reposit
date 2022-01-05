package h0.u;

import androidx.paging.LoadType;
import h0.u.j;
import m0.n.b.i;

/* compiled from: MutableLoadStateCollection.kt */
public final class m {
    public j a;
    public j b;
    public j c;
    public k d = k.a;
    public k e;

    public m() {
        j.c cVar = j.c.c;
        this.a = cVar;
        this.b = cVar;
        this.c = cVar;
        k kVar = k.b;
    }

    public final j a(j jVar, j jVar2, j jVar3, j jVar4) {
        if (jVar4 == null) {
            return jVar3;
        }
        return (!(jVar instanceof j.b) || ((jVar2 instanceof j.c) && (jVar4 instanceof j.c)) || (jVar4 instanceof j.a)) ? jVar4 : jVar;
    }

    public final j b(LoadType loadType, boolean z) {
        i.e(loadType, "type");
        k kVar = z ? this.e : this.d;
        if (kVar != null) {
            return kVar.b(loadType);
        }
        return null;
    }

    public final void c(b bVar) {
        i.e(bVar, "combinedLoadStates");
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
    }

    public final boolean d(LoadType loadType, boolean z, j jVar) {
        boolean z2;
        k kVar;
        i.e(loadType, "type");
        i.e(jVar, "state");
        if (z) {
            k kVar2 = this.e;
            if (kVar2 != null) {
                kVar = kVar2;
            } else {
                k kVar3 = k.b;
                kVar = k.a;
            }
            k c2 = kVar.c(loadType, jVar);
            this.e = c2;
            z2 = i.a(c2, kVar2);
        } else {
            k kVar4 = this.d;
            k c3 = kVar4.c(loadType, jVar);
            this.d = c3;
            z2 = i.a(c3, kVar4);
        }
        boolean z3 = !z2;
        f();
        return z3;
    }

    public final b e() {
        return new b(this.a, this.b, this.c, this.d, this.e);
    }

    public final void f() {
        j jVar = this.a;
        j jVar2 = this.d.c;
        k kVar = this.e;
        j jVar3 = null;
        this.a = a(jVar, jVar2, jVar2, kVar != null ? kVar.c : null);
        j jVar4 = this.b;
        k kVar2 = this.d;
        j jVar5 = kVar2.c;
        j jVar6 = kVar2.d;
        k kVar3 = this.e;
        this.b = a(jVar4, jVar5, jVar6, kVar3 != null ? kVar3.d : null);
        j jVar7 = this.c;
        k kVar4 = this.d;
        j jVar8 = kVar4.c;
        j jVar9 = kVar4.e;
        k kVar5 = this.e;
        if (kVar5 != null) {
            jVar3 = kVar5.e;
        }
        this.c = a(jVar7, jVar8, jVar9, jVar3);
    }
}
