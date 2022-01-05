package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.j.o;
import m0.n.b.i;
import m0.q.e;
import m0.r.t.a.r.c.c;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t0.g0;
import m0.r.t.a.r.c.t0.h;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.l.f;
import m0.r.t.a.r.l.l;
import m0.r.t.a.r.m.g;
import m0.r.t.a.r.m.j0;

/* compiled from: NotFoundClasses.kt */
public final class NotFoundClasses {
    public final l a;
    public final u b;
    public final f<m0.r.t.a.r.g.b, v> c;
    public final f<a, d> d;

    /* compiled from: NotFoundClasses.kt */
    public static final class a {
        public final m0.r.t.a.r.g.a a;
        public final List<Integer> b;

        public a(m0.r.t.a.r.g.a aVar, List<Integer> list) {
            i.e(aVar, "classId");
            i.e(list, "typeParametersCount");
            this.a = aVar;
            this.b = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.a, aVar.a) && i.a(this.b, aVar.b);
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ClassRequest(classId=");
            P0.append(this.a);
            P0.append(", typeParametersCount=");
            return i0.d.a.a.a.A0(P0, this.b, ')');
        }
    }

    /* compiled from: NotFoundClasses.kt */
    public static final class b extends h {
        public final boolean a2;
        public final List<m0> b2;
        public final g c2;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(l lVar, m0.r.t.a.r.c.i iVar, m0.r.t.a.r.g.d dVar, boolean z, int i) {
            super(lVar, iVar, dVar, h0.a, false);
            i.e(lVar, "storageManager");
            i.e(iVar, "container");
            i.e(dVar, "name");
            this.a2 = z;
            e f = m0.q.i.f(0, i);
            ArrayList arrayList = new ArrayList(i0.j.f.p.h.K(f, 10));
            Iterator it = f.iterator();
            while (((m0.q.d) it).d) {
                int a = ((o) it).a();
                Objects.requireNonNull(m0.r.t.a.r.c.r0.f.i);
                arrayList.add(g0.M0(this, f.a.b, false, Variance.INVARIANT, m0.r.t.a.r.g.d.g(i.k("T", Integer.valueOf(a))), a, lVar));
            }
            this.b2 = arrayList;
            this.c2 = new g(this, i0.j.f.p.h.O(this), i0.j.f.p.h.N3(DescriptorUtilsKt.k(this).m().f()), lVar);
        }

        public boolean A0() {
            return false;
        }

        public MemberScope E(m0.r.t.a.r.m.x0.e eVar) {
            i.e(eVar, "kotlinTypeRefiner");
            return MemberScope.a.b;
        }

        public boolean E0() {
            return false;
        }

        public Collection<d> G() {
            return EmptyList.c;
        }

        public boolean H() {
            return false;
        }

        public boolean K() {
            return false;
        }

        public boolean L() {
            return this.a2;
        }

        public c P() {
            return null;
        }

        public MemberScope Q() {
            return MemberScope.a.b;
        }

        public d S() {
            return null;
        }

        public ClassKind f() {
            return ClassKind.CLASS;
        }

        public m0.r.t.a.r.c.r0.f getAnnotations() {
            Objects.requireNonNull(m0.r.t.a.r.c.r0.f.i);
            return f.a.b;
        }

        public p getVisibility() {
            p pVar = m0.r.t.a.r.c.o.e;
            i.d(pVar, "PUBLIC");
            return pVar;
        }

        public j0 i() {
            return this.c2;
        }

        public boolean isExternal() {
            return false;
        }

        public boolean isInline() {
            return false;
        }

        public Modality j() {
            return Modality.FINAL;
        }

        public Collection<c> k() {
            return EmptySet.c;
        }

        public List<m0> t() {
            return this.b2;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("class ");
            P0.append(getName());
            P0.append(" (not found)");
            return P0.toString();
        }

        public boolean w() {
            return false;
        }

        public boolean z() {
            return false;
        }
    }

    public NotFoundClasses(l lVar, u uVar) {
        i.e(lVar, "storageManager");
        i.e(uVar, "module");
        this.a = lVar;
        this.b = uVar;
        this.c = lVar.g(new NotFoundClasses$packageFragments$1(this));
        this.d = lVar.g(new NotFoundClasses$classes$1(this));
    }

    public final d a(m0.r.t.a.r.g.a aVar, List<Integer> list) {
        i.e(aVar, "classId");
        i.e(list, "typeParametersCount");
        return (d) ((LockBasedStorageManager.m) this.d).invoke(new a(aVar, list));
    }
}
