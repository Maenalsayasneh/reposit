package m0.r.t.a.r.b.j;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.j.o;
import m0.n.b.i;
import m0.q.e;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.c;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.k0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t0.g0;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.l.l;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.o0;

/* compiled from: FunctionClassDescriptor.kt */
public final class b extends m0.r.t.a.r.c.t0.b {
    public static final m0.r.t.a.r.g.a Y1 = new m0.r.t.a.r.g.a(g.i, d.g("KFunction"));
    public static final m0.r.t.a.r.g.a y = new m0.r.t.a.r.g.a(g.l, d.g("Function"));
    public final l Z1;
    public final v a2;
    public final FunctionClassKind b2;
    public final int c2;
    public final a d2 = new a(this);
    public final c e2;
    public final List<m0> f2;

    /* compiled from: FunctionClassDescriptor.kt */
    public final class a extends m0.r.t.a.r.m.b {
        public final /* synthetic */ b c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar) {
            super(bVar.Z1);
            i.e(bVar, "this$0");
            this.c = bVar;
        }

        public f c() {
            return this.c;
        }

        public boolean d() {
            return true;
        }

        public Collection<m0.r.t.a.r.m.v> g() {
            List<m0.r.t.a.r.g.a> list;
            List<T> list2;
            int ordinal = this.c.b2.ordinal();
            if (ordinal == 0) {
                list = h.L2(b.y);
            } else if (ordinal == 1) {
                list = h.L2(b.y);
            } else if (ordinal == 2) {
                list = m0.j.g.K(b.Y1, new m0.r.t.a.r.g.a(g.l, FunctionClassKind.Function.numberedClassName(this.c.c2)));
            } else if (ordinal == 3) {
                list = m0.j.g.K(b.Y1, new m0.r.t.a.r.g.a(g.d, FunctionClassKind.SuspendFunction.numberedClassName(this.c.c2)));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            u b = this.c.a2.b();
            ArrayList arrayList = new ArrayList(h.K(list, 10));
            for (m0.r.t.a.r.g.a aVar : list) {
                m0.r.t.a.r.c.d D0 = h.D0(b, aVar);
                if (D0 != null) {
                    List<m0> list3 = this.c.f2;
                    int size = D0.i().getParameters().size();
                    i.e(list3, "$this$takeLast");
                    if (size >= 0) {
                        if (size == 0) {
                            list2 = EmptyList.c;
                        } else {
                            int size2 = list3.size();
                            if (size >= size2) {
                                list2 = m0.j.g.v0(list3);
                            } else if (size == 1) {
                                list2 = h.L2(m0.j.g.G(list3));
                            } else {
                                ArrayList arrayList2 = new ArrayList(size);
                                if (list3 instanceof RandomAccess) {
                                    for (int i = size2 - size; i < size2; i++) {
                                        arrayList2.add(list3.get(i));
                                    }
                                } else {
                                    ListIterator<m0> listIterator = list3.listIterator(size2 - size);
                                    while (listIterator.hasNext()) {
                                        arrayList2.add(listIterator.next());
                                    }
                                }
                                list2 = arrayList2;
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(h.K(list2, 10));
                        for (T q : list2) {
                            arrayList3.add(new o0(q.q()));
                        }
                        KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
                        Objects.requireNonNull(m0.r.t.a.r.c.r0.f.i);
                        arrayList.add(KotlinTypeFactory.e(f.a.b, D0, arrayList3));
                    } else {
                        throw new IllegalArgumentException(i0.d.a.a.a.g0("Requested element count ", size, " is less than zero.").toString());
                    }
                } else {
                    throw new IllegalStateException(("Built-in class " + aVar + " not found").toString());
                }
            }
            return m0.j.g.v0(arrayList);
        }

        public List<m0> getParameters() {
            return this.c.f2;
        }

        public k0 j() {
            return k0.a.a;
        }

        public m0.r.t.a.r.c.d p() {
            return this.c;
        }

        public String toString() {
            return this.c.toString();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(l lVar, v vVar, FunctionClassKind functionClassKind, int i) {
        super(lVar, functionClassKind.numberedClassName(i));
        i.e(lVar, "storageManager");
        i.e(vVar, "containingDeclaration");
        i.e(functionClassKind, "functionKind");
        this.Z1 = lVar;
        this.a2 = vVar;
        this.b2 = functionClassKind;
        this.c2 = i;
        this.e2 = new c(lVar, this);
        ArrayList arrayList = new ArrayList();
        e eVar = new e(1, i);
        ArrayList arrayList2 = new ArrayList(h.K(eVar, 10));
        Iterator it = eVar.iterator();
        while (((m0.q.d) it).d) {
            H0(arrayList, this, Variance.IN_VARIANCE, i.k("P", Integer.valueOf(((o) it).a())));
            arrayList2.add(m0.i.a);
        }
        H0(arrayList, this, Variance.OUT_VARIANCE, "R");
        this.f2 = m0.j.g.v0(arrayList);
    }

    public static final void H0(ArrayList<m0> arrayList, b bVar, Variance variance, String str) {
        Objects.requireNonNull(m0.r.t.a.r.c.r0.f.i);
        arrayList.add(g0.M0(bVar, f.a.b, false, variance, d.g(str), arrayList.size(), bVar.Z1));
    }

    public boolean A0() {
        return false;
    }

    public MemberScope E(m0.r.t.a.r.m.x0.e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        return this.e2;
    }

    public boolean E0() {
        return false;
    }

    public Collection G() {
        return EmptyList.c;
    }

    public boolean H() {
        return false;
    }

    public boolean K() {
        return false;
    }

    public boolean L() {
        return false;
    }

    public /* bridge */ /* synthetic */ c P() {
        return null;
    }

    public MemberScope Q() {
        return MemberScope.a.b;
    }

    public /* bridge */ /* synthetic */ m0.r.t.a.r.c.d S() {
        return null;
    }

    public m0.r.t.a.r.c.i b() {
        return this.a2;
    }

    public ClassKind f() {
        return ClassKind.INTERFACE;
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
        return this.d2;
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public Modality j() {
        return Modality.ABSTRACT;
    }

    public Collection k() {
        return EmptyList.c;
    }

    public h0 r() {
        h0 h0Var = h0.a;
        i.d(h0Var, "NO_SOURCE");
        return h0Var;
    }

    public List<m0> t() {
        return this.f2;
    }

    public String toString() {
        String b = getName().b();
        i.d(b, "name.asString()");
        return b;
    }

    public boolean w() {
        return false;
    }

    public boolean z() {
        return false;
    }
}
