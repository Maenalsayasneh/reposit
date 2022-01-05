package com.clubhouse.android.core.storage;

import i0.e.b.a3.e.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.CoroutineStart;
import m0.j.g;
import m0.l.e;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import n0.a.f0;
import n0.a.g2.a0;
import n0.a.g2.d;
import n0.a.g2.o;
import n0.a.g2.q;

/* compiled from: Store.kt */
public final class Store<I, T extends i0.e.b.a3.e.a<I>> {
    public final f0 a;
    public final q<Map<I, b<T>>> b;
    public final q<Map<I, c<I, T>>> c;
    public final d<Map<I, T>> d;

    /* compiled from: Store.kt */
    public static abstract class a<I, T extends i0.e.b.a3.e.a<I>> {
        public final I a;

        /* renamed from: com.clubhouse.android.core.storage.Store$a$a  reason: collision with other inner class name */
        /* compiled from: Store.kt */
        public static final class C0198a<I, T extends i0.e.b.a3.e.a<I>> extends a<I, T> {
            public final I b;

            public C0198a(I i) {
                super(i, (f) null);
                this.b = i;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0198a) && i.a(this.b, ((C0198a) obj).b);
            }

            public int hashCode() {
                I i = this.b;
                if (i == null) {
                    return 0;
                }
                return i.hashCode();
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("Delete(id=");
                P0.append(this.b);
                P0.append(')');
                return P0.toString();
            }
        }

        /* compiled from: Store.kt */
        public static final class b<I, T extends i0.e.b.a3.e.a<I>> extends a<I, T> {
            public final I b;
            public final String c;
            public final l<T, T> d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(I i, l<? super T, ? extends T> lVar) {
                super(i, (f) null);
                i.e(lVar, "transform");
                String uuid = UUID.randomUUID().toString();
                i.d(uuid, "randomUUID().toString()");
                i.e(uuid, "mutationId");
                i.e(lVar, "transform");
                this.b = i;
                this.c = uuid;
                this.d = lVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return i.a(this.b, bVar.b) && i.a(this.c, bVar.c) && i.a(this.d, bVar.d);
            }

            public int hashCode() {
                I i = this.b;
                return this.d.hashCode() + i0.d.a.a.a.F(this.c, (i == null ? 0 : i.hashCode()) * 31, 31);
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("Transform(id=");
                P0.append(this.b);
                P0.append(", mutationId=");
                P0.append(this.c);
                P0.append(", transform=");
                P0.append(this.d);
                P0.append(')');
                return P0.toString();
            }
        }

        /* compiled from: Store.kt */
        public static final class c<I, T extends i0.e.b.a3.e.a<I>> extends a<I, T> {
            public final T b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(T t) {
                super(t.getId(), (f) null);
                i.e(t, "item");
                this.b = t;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && i.a(this.b, ((c) obj).b);
            }

            public int hashCode() {
                return this.b.hashCode();
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("Upsert(item=");
                P0.append(this.b);
                P0.append(')');
                return P0.toString();
            }
        }

        public a(Object obj, f fVar) {
            this.a = obj;
        }
    }

    /* compiled from: Store.kt */
    public static final class b<T> {
        public final T a;
        public final long b;

        public b(T t, long j) {
            this.a = t;
            this.b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return i.a(this.a, bVar.a) && this.b == bVar.b;
        }

        public int hashCode() {
            T t = this.a;
            return Long.hashCode(this.b) + ((t == null ? 0 : t.hashCode()) * 31);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Entry(element=");
            P0.append(this.a);
            P0.append(", cachedTime=");
            P0.append(this.b);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: Store.kt */
    public static final class c<I, T extends i0.e.b.a3.e.a<I>> {
        public final I a;
        public final Integer b;
        public final a<I, T> c;

        public c(I i, Integer num, a<I, T> aVar) {
            i.e(aVar, "mutation");
            this.a = i;
            this.b = num;
            this.c = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return i.a(this.a, cVar.a) && i.a(this.b, cVar.b) && i.a(this.c, cVar.c);
        }

        public int hashCode() {
            I i = this.a;
            int i2 = 0;
            int hashCode = (i == null ? 0 : i.hashCode()) * 31;
            Integer num = this.b;
            if (num != null) {
                i2 = num.hashCode();
            }
            return this.c.hashCode() + ((hashCode + i2) * 31);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("OptimisticMutationApplication(id=");
            P0.append(this.a);
            P0.append(", appliedToHashValue=");
            P0.append(this.b);
            P0.append(", mutation=");
            P0.append(this.c);
            P0.append(')');
            return P0.toString();
        }
    }

    public Store(f0 f0Var) {
        i.e(f0Var, "coroutineScope");
        this.a = f0Var;
        q<Map<I, b<T>>> a2 = a0.a(g.o());
        this.b = a2;
        q<Map<I, c<I, T>>> a3 = a0.a(g.o());
        this.c = a3;
        this.d = m0.r.t.a.r.m.a1.a.f1(new o(a2, a3, new Store$state$1(this, (m0.l.c<? super Store$state$1>) null)));
    }

    public static void c(Store store, List list, l lVar, List list2, int i) {
        if ((i & 1) != 0) {
            list = EmptyList.c;
        }
        store.b(list, lVar, (i & 4) != 0 ? EmptyList.c : null);
    }

    public final void a(List<? extends a<I, T>> list) {
        i0.e.b.a3.e.a aVar;
        Map B0 = g.B0(this.b.getValue());
        for (a aVar2 : list) {
            if (aVar2 instanceof a.C0198a) {
                B0.remove(aVar2.a);
            } else if (aVar2 instanceof a.c) {
                B0.put(aVar2.a, new b(((a.c) aVar2).b, System.currentTimeMillis()));
            } else if (aVar2 instanceof a.b) {
                a.b bVar = (a.b) aVar2;
                b bVar2 = (b) ((LinkedHashMap) B0).get(bVar.b);
                l<T, T> lVar = bVar.d;
                m0.i iVar = null;
                if (bVar2 == null) {
                    aVar = null;
                } else {
                    aVar = (i0.e.b.a3.e.a) bVar2.a;
                }
                i0.e.b.a3.e.a aVar3 = (i0.e.b.a3.e.a) lVar.invoke(aVar);
                if (aVar3 != null) {
                    B0.put(aVar2.a, new b(aVar3, System.currentTimeMillis()));
                    iVar = m0.i.a;
                }
                if (iVar == null) {
                    b bVar3 = (b) B0.remove(aVar2.a);
                }
            }
        }
        this.b.setValue(B0);
    }

    public final void b(List<? extends a<I, T>> list, l<? super m0.l.c<? super List<? extends a<I, T>>>, ? extends Object> lVar, List<? extends a<I, T>> list2) {
        i.e(list, "optimistic");
        i.e(lVar, "commit");
        i.e(list2, "rollback");
        List<c<I, T>> g = g(list, EmptyList.c);
        m0.r.t.a.r.m.a1.a.E2(this.a, (e) null, (CoroutineStart) null, new Store$applyMutation$1(lVar, this, g, list2, (m0.l.c<? super Store$applyMutation$1>) null), 3, (Object) null);
    }

    public final d<T> d(I i) {
        return m0.r.t.a.r.m.a1.a.f1(new Store$stateForId$$inlined$map$1(this.d, i));
    }

    public final void e(l<? super T, ? extends T> lVar) {
        i.e(lVar, "transform");
        Set<Object> keySet = this.b.getValue().keySet();
        ArrayList arrayList = new ArrayList(h.K(keySet, 10));
        for (Object bVar : keySet) {
            List L2 = h.L2(new a.b(bVar, lVar));
            i.e(L2, "mutations");
            a(L2);
            arrayList.add(m0.i.a);
        }
    }

    public final void f(a<I, T> aVar) {
        i.e(aVar, "mutation");
        List<T> L2 = h.L2(aVar);
        i.e(L2, "mutations");
        a(L2);
    }

    public final List<c<I, T>> g(List<? extends a<I, T>> list, List<c<I, T>> list2) {
        Integer num;
        Map B0 = g.B0(this.c.getValue());
        for (c cVar : list2) {
            B0.remove(cVar.a);
        }
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            I i = aVar.a;
            b bVar = (b) this.b.getValue().get(aVar.a);
            if (bVar == null) {
                num = null;
            } else {
                num = Integer.valueOf(((i0.e.b.a3.e.a) bVar.a).hashCode());
            }
            c cVar2 = new c(i, num, aVar);
            B0.put(aVar.a, cVar2);
            arrayList.add(cVar2);
        }
        this.c.setValue(B0);
        return arrayList;
    }
}
