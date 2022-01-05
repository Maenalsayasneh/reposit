package m0.r.t.a.r.o;

import i0.j.f.p.h;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.r;

/* compiled from: SmartSet.kt */
public final class j<T> extends AbstractSet<T> {
    public Object c;
    public int d;

    /* compiled from: SmartSet.kt */
    public static final class a<T> implements Iterator<T>, m0.n.b.s.a {
        public final Iterator<T> c;

        public a(T[] tArr) {
            i.e(tArr, "array");
            this.c = h.C2(tArr);
        }

        public boolean hasNext() {
            return this.c.hasNext();
        }

        public T next() {
            return this.c.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: SmartSet.kt */
    public static final class b {
        public static final <T> j<T> a() {
            return new j<>((f) null);
        }
    }

    /* compiled from: SmartSet.kt */
    public static final class c<T> implements Iterator<T>, m0.n.b.s.a {
        public final T c;
        public boolean d = true;

        public c(T t) {
            this.c = t;
        }

        public boolean hasNext() {
            return this.d;
        }

        public T next() {
            if (this.d) {
                this.d = false;
                return this.c;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public j() {
    }

    public static final <T> j<T> b() {
        return b.a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.util.LinkedHashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean add(T r6) {
        /*
            r5 = this;
            int r0 = r5.d
            r1 = 1
            if (r0 != 0) goto L_0x0008
            r5.c = r6
            goto L_0x006a
        L_0x0008:
            r2 = 0
            if (r0 != r1) goto L_0x0020
            java.lang.Object r0 = r5.c
            boolean r0 = m0.n.b.i.a(r0, r6)
            if (r0 == 0) goto L_0x0014
            return r2
        L_0x0014:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r3 = r5.c
            r0[r2] = r3
            r0[r1] = r6
            r5.c = r0
            goto L_0x006a
        L_0x0020:
            r3 = 5
            if (r0 >= r3) goto L_0x0058
            java.lang.Object r0 = r5.c
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"
            java.util.Objects.requireNonNull(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r3 = i0.j.f.p.h.U(r0, r6)
            if (r3 == 0) goto L_0x0033
            return r2
        L_0x0033:
            int r3 = r5.d
            r4 = 4
            if (r3 != r4) goto L_0x0047
            int r3 = r0.length
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r0.length
            java.lang.System.arraycopy(r0, r2, r3, r2, r4)
            java.util.LinkedHashSet r0 = m0.j.g.J(r3)
            r0.add(r6)
            goto L_0x0055
        L_0x0047:
            int r3 = r3 + r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r2 = "java.util.Arrays.copyOf(this, newSize)"
            m0.n.b.i.d(r0, r2)
            int r2 = r0.length
            int r2 = r2 - r1
            r0[r2] = r6
        L_0x0055:
            r5.c = r0
            goto L_0x006a
        L_0x0058:
            java.lang.Object r0 = r5.c
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"
            java.util.Objects.requireNonNull(r0, r3)
            java.util.Set r0 = m0.n.b.r.b(r0)
            boolean r6 = r0.add(r6)
            if (r6 != 0) goto L_0x006a
            return r2
        L_0x006a:
            int r6 = r5.d
            int r6 = r6 + r1
            r5.d = r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.o.j.add(java.lang.Object):boolean");
    }

    public void clear() {
        this.c = null;
        this.d = 0;
    }

    public boolean contains(Object obj) {
        int i = this.d;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return i.a(this.c, obj);
        }
        if (i < 5) {
            Object obj2 = this.c;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return h.U((Object[]) obj2, obj);
        }
        Object obj3 = this.c;
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    public Iterator<T> iterator() {
        int i = this.d;
        if (i == 0) {
            return Collections.emptySet().iterator();
        }
        if (i == 1) {
            return new c(this.c);
        }
        if (i < 5) {
            Object obj = this.c;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.c;
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return r.b(obj2).iterator();
    }

    public final int size() {
        return this.d;
    }

    public j(f fVar) {
    }
}
