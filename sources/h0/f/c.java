package h0.f;

import h0.f.g;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: ArraySet */
public final class c<E> implements Collection<E>, Set<E> {
    public static int Y1;
    public static final int[] c = new int[0];
    public static final Object[] d = new Object[0];
    public static Object[] q;
    public static int x;
    public static Object[] y;
    public int[] Z1;
    public Object[] a2;
    public int b2;
    public g<E, E> c2;

    public c() {
        this(0);
    }

    public static void c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (Y1 < 10) {
                    objArr[0] = y;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    y = objArr;
                    Y1++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (c.class) {
                if (x < 10) {
                    objArr[0] = q;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    q = objArr;
                    x++;
                }
            }
        }
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = j();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = e(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.b2;
        int[] iArr = this.Z1;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.a2;
            b(i5);
            int[] iArr2 = this.Z1;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.a2, 0, objArr.length);
            }
            c(iArr, objArr, this.b2);
        }
        int i6 = this.b2;
        if (i3 < i6) {
            int[] iArr3 = this.Z1;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.a2;
            System.arraycopy(objArr2, i3, objArr2, i7, this.b2 - i3);
        }
        this.Z1[i3] = i;
        this.a2[i3] = e;
        this.b2++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.b2;
        int[] iArr = this.Z1;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.a2;
            b(size);
            int i = this.b2;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.Z1, 0, i);
                System.arraycopy(objArr, 0, this.a2, 0, this.b2);
            }
            c(iArr, objArr, this.b2);
        }
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public final void b(int i) {
        if (i == 8) {
            synchronized (c.class) {
                Object[] objArr = y;
                if (objArr != null) {
                    this.a2 = objArr;
                    y = (Object[]) objArr[0];
                    this.Z1 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    Y1--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (c.class) {
                Object[] objArr2 = q;
                if (objArr2 != null) {
                    this.a2 = objArr2;
                    q = (Object[]) objArr2[0];
                    this.Z1 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    x--;
                    return;
                }
            }
        }
        this.Z1 = new int[i];
        this.a2 = new Object[i];
    }

    public void clear() {
        int i = this.b2;
        if (i != 0) {
            c(this.Z1, this.a2, i);
            this.Z1 = c;
            this.a2 = d;
            this.b2 = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final int e(Object obj, int i) {
        int i2 = this.b2;
        if (i2 == 0) {
            return -1;
        }
        int a = d.a(this.Z1, i2, i);
        if (a < 0 || obj.equals(this.a2[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.Z1[i3] == i) {
            if (obj.equals(this.a2[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.Z1[i4] == i) {
            if (obj.equals(this.a2[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.b2 != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.b2) {
                try {
                    if (!set.contains(this.a2[i])) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.Z1;
        int i = this.b2;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? j() : e(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.b2 <= 0;
    }

    public Iterator<E> iterator() {
        if (this.c2 == null) {
            this.c2 = new b(this);
        }
        g<E, E> gVar = this.c2;
        if (gVar.b == null) {
            gVar.b = new g.c();
        }
        return gVar.b.iterator();
    }

    public final int j() {
        int i = this.b2;
        if (i == 0) {
            return -1;
        }
        int a = d.a(this.Z1, i, 0);
        if (a < 0 || this.a2[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.Z1[i2] == 0) {
            if (this.a2[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.Z1[i3] == 0) {
            if (this.a2[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public E k(int i) {
        E[] eArr = this.a2;
        E e = eArr[i];
        int i2 = this.b2;
        if (i2 <= 1) {
            c(this.Z1, eArr, i2);
            this.Z1 = c;
            this.a2 = d;
            this.b2 = 0;
        } else {
            int[] iArr = this.Z1;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = i2 - 1;
                this.b2 = i4;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, iArr, i, i4 - i);
                    Object[] objArr = this.a2;
                    System.arraycopy(objArr, i5, objArr, i, this.b2 - i);
                }
                this.a2[this.b2] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                b(i3);
                this.b2--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.Z1, 0, i);
                    System.arraycopy(eArr, 0, this.a2, 0, i);
                }
                int i6 = this.b2;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, this.Z1, i, i6 - i);
                    System.arraycopy(eArr, i7, this.a2, i, this.b2 - i);
                }
            }
        }
        return e;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        k(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.b2 - 1; i >= 0; i--) {
            if (!collection.contains(this.a2[i])) {
                k(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.b2;
    }

    public Object[] toArray() {
        int i = this.b2;
        Object[] objArr = new Object[i];
        System.arraycopy(this.a2, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.b2 * 14);
        sb.append('{');
        for (int i = 0; i < this.b2; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.a2[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public c(int i) {
        if (i == 0) {
            this.Z1 = c;
            this.a2 = d;
        } else {
            b(i);
        }
        this.b2 = 0;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.b2) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.b2);
        }
        System.arraycopy(this.a2, 0, tArr, 0, this.b2);
        int length = tArr.length;
        int i = this.b2;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
