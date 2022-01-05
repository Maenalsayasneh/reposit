package m0.j.s;

import i0.j.f.p.h;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import m0.n.b.i;

/* compiled from: MapBuilder.kt */
public final class a<K, V> implements Map<K, V>, m0.n.b.s.a {
    public static final C0241a c = new C0241a((m0.n.b.f) null);
    public b<K, V> Y1;
    public boolean Z1;
    public K[] a2;
    public V[] b2 = null;
    public int[] c2 = new int[8];
    public int d;
    public int[] d2;
    public int e2;
    public int f2;
    public int q;
    public c<K> x;
    public d<V> y;

    /* renamed from: m0.j.s.a$a  reason: collision with other inner class name */
    /* compiled from: MapBuilder.kt */
    public static final class C0241a {
        public C0241a(m0.n.b.f fVar) {
        }
    }

    /* compiled from: MapBuilder.kt */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, m0.n.b.s.a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a<K, V> aVar) {
            super(aVar);
            i.e(aVar, "map");
        }

        public Object next() {
            int i = this.c;
            a<K, V> aVar = this.q;
            if (i < aVar.f2) {
                this.c = i + 1;
                this.d = i;
                c cVar = new c(aVar, i);
                a();
                return cVar;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    public static final class c<K, V> implements Map.Entry<K, V>, m0.n.b.s.a {
        public final a<K, V> c;
        public final int d;

        public c(a<K, V> aVar, int i) {
            i.e(aVar, "map");
            this.c = aVar;
            this.d = i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return i.a(entry.getKey(), getKey()) && i.a(entry.getValue(), getValue());
            }
        }

        public K getKey() {
            return this.c.a2[this.d];
        }

        public V getValue() {
            V[] vArr = this.c.b2;
            i.c(vArr);
            return vArr[this.d];
        }

        public int hashCode() {
            Object key = getKey();
            int i = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            this.c.c();
            V[] b = this.c.b();
            int i = this.d;
            V v2 = b[i];
            b[i] = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    public static class d<K, V> {
        public int c;
        public int d = -1;
        public final a<K, V> q;

        public d(a<K, V> aVar) {
            i.e(aVar, "map");
            this.q = aVar;
            a();
        }

        public final void a() {
            while (true) {
                int i = this.c;
                a<K, V> aVar = this.q;
                if (i < aVar.f2 && aVar.c2[i] < 0) {
                    this.c = i + 1;
                } else {
                    return;
                }
            }
        }

        public final boolean hasNext() {
            return this.c < this.q.f2;
        }

        public final void remove() {
            this.q.c();
            this.q.m(this.d);
            this.d = -1;
        }
    }

    /* compiled from: MapBuilder.kt */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, m0.n.b.s.a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(a<K, V> aVar) {
            super(aVar);
            i.e(aVar, "map");
        }

        public K next() {
            int i = this.c;
            a<K, V> aVar = this.q;
            if (i < aVar.f2) {
                this.c = i + 1;
                this.d = i;
                K k = aVar.a2[i];
                a();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, m0.n.b.s.a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(a<K, V> aVar) {
            super(aVar);
            i.e(aVar, "map");
        }

        public V next() {
            int i = this.c;
            a<K, V> aVar = this.q;
            if (i < aVar.f2) {
                this.c = i + 1;
                this.d = i;
                V[] vArr = aVar.b2;
                i.c(vArr);
                V v = vArr[this.d];
                a();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    public a() {
        K[] q2 = h.q(8);
        int highestOneBit = Integer.highestOneBit(24);
        this.a2 = q2;
        this.d2 = new int[highestOneBit];
        this.e2 = 2;
        this.f2 = 0;
        this.d = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int a(K k) {
        c();
        while (true) {
            int k2 = k(k);
            int i = this.e2 * 2;
            int length = this.d2.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.d2;
                int i3 = iArr[k2];
                if (i3 <= 0) {
                    int i4 = this.f2;
                    K[] kArr = this.a2;
                    if (i4 >= kArr.length) {
                        h(1);
                    } else {
                        int i5 = i4 + 1;
                        this.f2 = i5;
                        kArr[i4] = k;
                        this.c2[i4] = k2;
                        iArr[k2] = i5;
                        this.q++;
                        if (i2 > this.e2) {
                            this.e2 = i2;
                        }
                        return i4;
                    }
                } else if (i.a(this.a2[i3 - 1], k)) {
                    return -i3;
                } else {
                    i2++;
                    if (i2 > i) {
                        l(this.d2.length * 2);
                        break;
                    }
                    k2 = k2 == 0 ? this.d2.length - 1 : k2 - 1;
                }
            }
        }
    }

    public final V[] b() {
        V[] vArr = this.b2;
        if (vArr != null) {
            return vArr;
        }
        V[] q2 = h.q(this.a2.length);
        this.b2 = q2;
        return q2;
    }

    public final void c() {
        if (this.Z1) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        c();
        int i = this.f2 - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.c2;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.d2[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        h.y3(this.a2, 0, this.f2);
        V[] vArr = this.b2;
        if (vArr != null) {
            h.y3(vArr, 0, this.f2);
        }
        this.q = 0;
        this.f2 = 0;
    }

    public boolean containsKey(Object obj) {
        return i(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return j(obj) >= 0;
    }

    public final boolean d(Collection<?> collection) {
        i.e(collection, "m");
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!g((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [m0.j.s.b<K, V>, java.util.Set<java.util.Map$Entry<K, V>>] */
    /* JADX WARNING: type inference failed for: r0v1, types: [m0.j.s.b<K, V>, m0.j.s.b, java.util.Set<java.util.Map$Entry<K, V>>] */
    public final Set<Map.Entry<K, V>> entrySet() {
        ? r02 = this.Y1;
        if (r02 != 0) {
            return r02;
        }
        ? bVar = new b(this);
        this.Y1 = bVar;
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof Map)) {
                return false;
            }
            Map map = (Map) obj;
            if (!(this.q == map.size() && d(map.entrySet()))) {
                return false;
            }
        }
        return true;
    }

    public final boolean g(Map.Entry<? extends K, ? extends V> entry) {
        i.e(entry, "entry");
        int i = i(entry.getKey());
        if (i < 0) {
            return false;
        }
        V[] vArr = this.b2;
        i.c(vArr);
        return i.a(vArr[i], entry.getValue());
    }

    public V get(Object obj) {
        int i = i(obj);
        if (i < 0) {
            return null;
        }
        V[] vArr = this.b2;
        i.c(vArr);
        return vArr[i];
    }

    public final void h(int i) {
        V[] vArr;
        int i2 = this.f2;
        int i3 = i + i2;
        K[] kArr = this.a2;
        if (i3 > kArr.length) {
            int length = (kArr.length * 3) / 2;
            if (i3 <= length) {
                i3 = length;
            }
            i.e(kArr, "$this$copyOfUninitializedElements");
            K[] copyOf = Arrays.copyOf(kArr, i3);
            i.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.a2 = copyOf;
            V[] vArr2 = this.b2;
            if (vArr2 != null) {
                i.e(vArr2, "$this$copyOfUninitializedElements");
                vArr = Arrays.copyOf(vArr2, i3);
                i.d(vArr, "java.util.Arrays.copyOf(this, newSize)");
            } else {
                vArr = null;
            }
            this.b2 = vArr;
            int[] copyOf2 = Arrays.copyOf(this.c2, i3);
            i.d(copyOf2, "java.util.Arrays.copyOf(this, newSize)");
            this.c2 = copyOf2;
            if (i3 < 1) {
                i3 = 1;
            }
            int highestOneBit = Integer.highestOneBit(i3 * 3);
            if (highestOneBit > this.d2.length) {
                l(highestOneBit);
            }
        } else if ((i2 + i3) - this.q > kArr.length) {
            l(this.d2.length);
        }
    }

    public int hashCode() {
        b bVar = new b(this);
        int i = 0;
        while (bVar.hasNext()) {
            int i2 = bVar.c;
            a<K, V> aVar = bVar.q;
            if (i2 < aVar.f2) {
                bVar.c = i2 + 1;
                bVar.d = i2;
                K k = aVar.a2[i2];
                int hashCode = k != null ? k.hashCode() : 0;
                V[] vArr = bVar.q.b2;
                i.c(vArr);
                V v = vArr[bVar.d];
                int hashCode2 = v != null ? v.hashCode() : 0;
                bVar.a();
                i += hashCode ^ hashCode2;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i;
    }

    public final int i(K k) {
        int k2 = k(k);
        int i = this.e2;
        while (true) {
            int i2 = this.d2[k2];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (i.a(this.a2[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            k2 = k2 == 0 ? this.d2.length - 1 : k2 - 1;
        }
    }

    public boolean isEmpty() {
        return this.q == 0;
    }

    public final int j(V v) {
        int i = this.f2;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.c2[i] >= 0) {
                V[] vArr = this.b2;
                i.c(vArr);
                if (i.a(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    public final int k(K k) {
        return ((k != null ? k.hashCode() : 0) * -1640531527) >>> this.d;
    }

    public final Set<K> keySet() {
        c<K> cVar = this.x;
        if (cVar != null) {
            return cVar;
        }
        c<K> cVar2 = new c<>(this);
        this.x = cVar2;
        return cVar2;
    }

    public final void l(int i) {
        boolean z;
        int i2;
        if (this.f2 > this.q) {
            V[] vArr = this.b2;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i2 = this.f2;
                if (i3 >= i2) {
                    break;
                }
                if (this.c2[i3] >= 0) {
                    K[] kArr = this.a2;
                    kArr[i4] = kArr[i3];
                    if (vArr != null) {
                        vArr[i4] = vArr[i3];
                    }
                    i4++;
                }
                i3++;
            }
            h.y3(this.a2, i4, i2);
            if (vArr != null) {
                h.y3(vArr, i4, this.f2);
            }
            this.f2 = i4;
        }
        int[] iArr = this.d2;
        if (i != iArr.length) {
            this.d2 = new int[i];
            this.d = Integer.numberOfLeadingZeros(i) + 1;
        } else {
            int length = iArr.length;
            i.e(iArr, "$this$fill");
            Arrays.fill(iArr, 0, length, 0);
        }
        int i5 = 0;
        while (i5 < this.f2) {
            int i6 = i5 + 1;
            int k = k(this.a2[i5]);
            int i7 = this.e2;
            while (true) {
                int[] iArr2 = this.d2;
                if (iArr2[k] == 0) {
                    iArr2[k] = i6;
                    this.c2[i5] = k;
                    z = true;
                    break;
                }
                i7--;
                if (i7 < 0) {
                    z = false;
                    break;
                }
                k = k == 0 ? iArr2.length - 1 : k - 1;
            }
            if (z) {
                i5 = i6;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(int r12) {
        /*
            r11 = this;
            K[] r0 = r11.a2
            i0.j.f.p.h.x3(r0, r12)
            int[] r0 = r11.c2
            r0 = r0[r12]
            int r1 = r11.e2
            int r1 = r1 * 2
            int[] r2 = r11.d2
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L_0x0015
            r1 = r2
        L_0x0015:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L_0x0019:
            int r5 = r0 + -1
            r6 = -1
            if (r0 != 0) goto L_0x0023
            int[] r0 = r11.d2
            int r0 = r0.length
            int r0 = r0 + r6
            goto L_0x0024
        L_0x0023:
            r0 = r5
        L_0x0024:
            int r4 = r4 + 1
            int r5 = r11.e2
            if (r4 <= r5) goto L_0x002f
            int[] r0 = r11.d2
            r0[r1] = r2
            goto L_0x005e
        L_0x002f:
            int[] r5 = r11.d2
            r7 = r5[r0]
            if (r7 != 0) goto L_0x0038
            r5[r1] = r2
            goto L_0x005e
        L_0x0038:
            if (r7 >= 0) goto L_0x003d
            r5[r1] = r6
            goto L_0x0055
        L_0x003d:
            K[] r5 = r11.a2
            int r8 = r7 + -1
            r5 = r5[r8]
            int r5 = r11.k(r5)
            int r5 = r5 - r0
            int[] r9 = r11.d2
            int r10 = r9.length
            int r10 = r10 + r6
            r5 = r5 & r10
            if (r5 < r4) goto L_0x0057
            r9[r1] = r7
            int[] r4 = r11.c2
            r4[r8] = r1
        L_0x0055:
            r1 = r0
            r4 = r2
        L_0x0057:
            int r3 = r3 + r6
            if (r3 >= 0) goto L_0x0019
            int[] r0 = r11.d2
            r0[r1] = r6
        L_0x005e:
            int[] r0 = r11.c2
            r0[r12] = r6
            int r12 = r11.q
            int r12 = r12 + r6
            r11.q = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.j.s.a.m(int):void");
    }

    public V put(K k, V v) {
        c();
        int a = a(k);
        V[] b3 = b();
        if (a < 0) {
            int i = (-a) - 1;
            V v2 = b3[i];
            b3[i] = v;
            return v2;
        }
        b3[a] = v;
        return null;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        i.e(map, "from");
        c();
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            h(entrySet.size());
            for (Map.Entry next : entrySet) {
                int a = a(next.getKey());
                Object[] b3 = b();
                if (a >= 0) {
                    b3[a] = next.getValue();
                } else {
                    int i = (-a) - 1;
                    if (!i.a(next.getValue(), b3[i])) {
                        b3[i] = next.getValue();
                    }
                }
            }
        }
    }

    public V remove(Object obj) {
        c();
        int i = i(obj);
        if (i < 0) {
            i = -1;
        } else {
            m(i);
        }
        if (i < 0) {
            return null;
        }
        V[] vArr = this.b2;
        i.c(vArr);
        V v = vArr[i];
        h.x3(vArr, i);
        return v;
    }

    public final int size() {
        return this.q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.q * 3) + 2);
        sb.append("{");
        int i = 0;
        b bVar = new b(this);
        while (bVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            i.e(sb, "sb");
            int i2 = bVar.c;
            a<K, V> aVar = bVar.q;
            if (i2 < aVar.f2) {
                bVar.c = i2 + 1;
                bVar.d = i2;
                K k = aVar.a2[i2];
                if (i.a(k, aVar)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(k);
                }
                sb.append('=');
                V[] vArr = bVar.q.b2;
                i.c(vArr);
                V v = vArr[bVar.d];
                if (i.a(v, bVar.q)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(v);
                }
                bVar.a();
                i++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb.append("}");
        String sb2 = sb.toString();
        i.d(sb2, "sb.toString()");
        return sb2;
    }

    public final Collection<V> values() {
        d<V> dVar = this.y;
        if (dVar != null) {
            return dVar;
        }
        d<V> dVar2 = new d<>(this);
        this.y = dVar2;
        return dVar2;
    }
}
