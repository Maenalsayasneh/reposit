package i0.f.a.c.t;

import i0.d.a.a.a;
import java.lang.reflect.Array;
import java.util.List;

/* compiled from: ObjectBuffer */
public final class n {
    public h<Object[]> a;
    public h<Object[]> b;
    public int c;
    public Object[] d;

    public final void a(Object obj, int i, Object[] objArr, int i2) {
        int i3 = 0;
        for (h hVar = this.a; hVar != null; hVar = hVar.b) {
            Object[] objArr2 = (Object[]) hVar.a;
            int length = objArr2.length;
            System.arraycopy(objArr2, 0, obj, i3, length);
            i3 += length;
        }
        System.arraycopy(objArr, 0, obj, i3, i2);
        int i4 = i3 + i2;
        if (i4 != i) {
            throw new IllegalStateException(a.h0("Should have gotten ", i, " entries, got ", i4));
        }
    }

    public void b() {
        h<Object[]> hVar = this.b;
        if (hVar != null) {
            this.d = (Object[]) hVar.a;
        }
        this.b = null;
        this.a = null;
        this.c = 0;
    }

    public Object[] c(Object[] objArr) {
        h<T> hVar = new h<>(objArr, (h) null);
        if (this.a == null) {
            this.b = hVar;
            this.a = hVar;
        } else {
            h<Object[]> hVar2 = this.b;
            if (hVar2.b == null) {
                hVar2.b = hVar;
                this.b = hVar;
            } else {
                throw new IllegalStateException();
            }
        }
        int length = objArr.length;
        this.c += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public void d(Object[] objArr, int i, List<Object> list) {
        int i2;
        h hVar = this.a;
        while (true) {
            i2 = 0;
            if (hVar == null) {
                break;
            }
            Object[] objArr2 = (Object[]) hVar.a;
            int length = objArr2.length;
            while (i2 < length) {
                list.add(objArr2[i2]);
                i2++;
            }
            hVar = hVar.b;
        }
        while (i2 < i) {
            list.add(objArr[i2]);
            i2++;
        }
        b();
    }

    public Object[] e(Object[] objArr, int i) {
        int i2 = this.c + i;
        Object[] objArr2 = new Object[i2];
        a(objArr2, i2, objArr, i);
        b();
        return objArr2;
    }

    public <T> T[] f(Object[] objArr, int i, Class<T> cls) {
        int i2 = this.c + i;
        T[] tArr = (Object[]) Array.newInstance(cls, i2);
        a(tArr, i2, objArr, i);
        b();
        return tArr;
    }

    public Object[] g() {
        b();
        Object[] objArr = this.d;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[12];
        this.d = objArr2;
        return objArr2;
    }

    public Object[] h(Object[] objArr, int i) {
        b();
        Object[] objArr2 = this.d;
        if (objArr2 == null || objArr2.length < i) {
            this.d = new Object[Math.max(12, i)];
        }
        System.arraycopy(objArr, 0, this.d, 0, i);
        return this.d;
    }
}
