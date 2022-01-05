package h0.f;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap */
public class h<K, V> {
    public static Object[] c;
    public static int d;
    public static Object[] q;
    public static int x;
    public Object[] Y1;
    public int Z1;
    public int[] y;

    public h() {
        this.y = d.a;
        this.Y1 = d.c;
        this.Z1 = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i) {
        Class<h> cls = h.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (x < 10) {
                    objArr[0] = q;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    q = objArr;
                    x++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (d < 10) {
                    objArr[0] = c;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    c = objArr;
                    d++;
                }
            }
        }
    }

    public final void a(int i) {
        Class<h> cls = h.class;
        if (i == 8) {
            synchronized (cls) {
                Object[] objArr = q;
                if (objArr != null) {
                    this.Y1 = objArr;
                    q = (Object[]) objArr[0];
                    this.y = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    x--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                Object[] objArr2 = c;
                if (objArr2 != null) {
                    this.Y1 = objArr2;
                    c = (Object[]) objArr2[0];
                    this.y = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    d--;
                    return;
                }
            }
        }
        this.y = new int[i];
        this.Y1 = new Object[(i << 1)];
    }

    public void b(int i) {
        int i2 = this.Z1;
        int[] iArr = this.y;
        if (iArr.length < i) {
            Object[] objArr = this.Y1;
            a(i);
            if (this.Z1 > 0) {
                System.arraycopy(iArr, 0, this.y, 0, i2);
                System.arraycopy(objArr, 0, this.Y1, 0, i2 << 1);
            }
            c(iArr, objArr, i2);
        }
        if (this.Z1 != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.Z1;
        if (i > 0) {
            int[] iArr = this.y;
            Object[] objArr = this.Y1;
            this.y = d.a;
            this.Y1 = d.c;
            this.Z1 = 0;
            c(iArr, objArr, i);
        }
        if (this.Z1 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public int d(Object obj, int i) {
        int i2 = this.Z1;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a = d.a(this.y, i2, i);
            if (a < 0 || obj.equals(this.Y1[a << 1])) {
                return a;
            }
            int i3 = a + 1;
            while (i3 < i2 && this.y[i3] == i) {
                if (obj.equals(this.Y1[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            int i4 = a - 1;
            while (i4 >= 0 && this.y[i4] == i) {
                if (obj.equals(this.Y1[i4 << 1])) {
                    return i4;
                }
                i4--;
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.Z1 != hVar.Z1) {
                return false;
            }
            int i = 0;
            while (i < this.Z1) {
                try {
                    Object i2 = i(i);
                    Object l = l(i);
                    Object obj2 = hVar.get(i2);
                    if (l == null) {
                        if (obj2 != null || !hVar.containsKey(i2)) {
                            return false;
                        }
                    } else if (!l.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.Z1 != map.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.Z1) {
                try {
                    Object i4 = i(i3);
                    Object l2 = l(i3);
                    Object obj3 = map.get(i4);
                    if (l2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!l2.equals(obj3)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : d(obj, obj.hashCode());
    }

    public int g() {
        int i = this.Z1;
        if (i == 0) {
            return -1;
        }
        try {
            int a = d.a(this.y, i, 0);
            if (a < 0 || this.Y1[a << 1] == null) {
                return a;
            }
            int i2 = a + 1;
            while (i2 < i && this.y[i2] == 0) {
                if (this.Y1[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            int i3 = a - 1;
            while (i3 >= 0 && this.y[i3] == 0) {
                if (this.Y1[i3 << 1] == null) {
                    return i3;
                }
                i3--;
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int f = f(obj);
        return f >= 0 ? this.Y1[(f << 1) + 1] : v;
    }

    public int h(Object obj) {
        int i = this.Z1 * 2;
        Object[] objArr = this.Y1;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.y;
        Object[] objArr = this.Y1;
        int i = this.Z1;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public K i(int i) {
        return this.Y1[i << 1];
    }

    public boolean isEmpty() {
        return this.Z1 <= 0;
    }

    public V j(int i) {
        V[] vArr = this.Y1;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.Z1;
        int i4 = 0;
        if (i3 <= 1) {
            c(this.y, vArr, i3);
            this.y = d.a;
            this.Y1 = d.c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.y;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr = this.Y1;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.Y1;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                a(i6);
                if (i3 == this.Z1) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.y, 0, i);
                        System.arraycopy(vArr, 0, this.Y1, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.y, i, i11);
                        System.arraycopy(vArr, i10 << 1, this.Y1, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.Z1) {
            this.Z1 = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public V k(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.Y1;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    public V l(int i) {
        return this.Y1[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.Z1;
        if (k == null) {
            i2 = g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = d(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.Y1;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        int[] iArr = this.y;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.Y1;
            a(i6);
            if (i3 == this.Z1) {
                int[] iArr2 = this.y;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.Y1, 0, objArr.length);
                }
                c(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.y;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.Y1;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.Z1 - i5) << 1);
        }
        int i8 = this.Z1;
        if (i3 == i8) {
            int[] iArr4 = this.y;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.Y1;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.Z1 = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, (Object) null);
        return orDefault == null ? put(k, v) : orDefault;
    }

    public V remove(Object obj) {
        int f = f(obj);
        if (f >= 0) {
            return j(f);
        }
        return null;
    }

    public V replace(K k, V v) {
        int f = f(k);
        if (f >= 0) {
            return k(f, v);
        }
        return null;
    }

    public int size() {
        return this.Z1;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.Z1 * 28);
        sb.append('{');
        for (int i = 0; i < this.Z1; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object i2 = i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object l = l(i);
            if (l != this) {
                sb.append(l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int f = f(obj);
        if (f < 0) {
            return false;
        }
        Object l = l(f);
        if (obj2 != l && (obj2 == null || !obj2.equals(l))) {
            return false;
        }
        j(f);
        return true;
    }

    public boolean replace(K k, V v, V v2) {
        int f = f(k);
        if (f < 0) {
            return false;
        }
        V l = l(f);
        if (l != v && (v == null || !v.equals(l))) {
            return false;
        }
        k(f, v2);
        return true;
    }

    public h(int i) {
        if (i == 0) {
            this.y = d.a;
            this.Y1 = d.c;
        } else {
            a(i);
        }
        this.Z1 = 0;
    }
}
