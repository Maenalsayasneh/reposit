package m0.r.t.a.r.h;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import m0.r.t.a.r.h.c;

/* compiled from: RopeByteString */
public class o extends c {
    public static final int[] d;
    public final int Y1;
    public final int Z1;
    public int a2 = 0;
    public final int q;
    public final c x;
    public final c y;

    /* compiled from: RopeByteString */
    public static class b {
        public final Stack<c> a = new Stack<>();

        public b(a aVar) {
        }

        public final void a(c cVar) {
            if (cVar.r()) {
                int size = cVar.size();
                int[] iArr = o.d;
                int binarySearch = Arrays.binarySearch(iArr, size);
                if (binarySearch < 0) {
                    binarySearch = (-(binarySearch + 1)) - 1;
                }
                int i = iArr[binarySearch + 1];
                if (this.a.isEmpty() || this.a.peek().size() >= i) {
                    this.a.push(cVar);
                    return;
                }
                int i2 = iArr[binarySearch];
                c pop = this.a.pop();
                while (!this.a.isEmpty() && this.a.peek().size() < i2) {
                    pop = new o(this.a.pop(), pop);
                }
                o oVar = new o(pop, cVar);
                while (!this.a.isEmpty()) {
                    int i3 = oVar.q;
                    int[] iArr2 = o.d;
                    int binarySearch2 = Arrays.binarySearch(iArr2, i3);
                    if (binarySearch2 < 0) {
                        binarySearch2 = (-(binarySearch2 + 1)) - 1;
                    }
                    if (this.a.peek().size() >= iArr2[binarySearch2 + 1]) {
                        break;
                    }
                    oVar = new o(this.a.pop(), oVar);
                }
                this.a.push(oVar);
            } else if (cVar instanceof o) {
                o oVar2 = (o) cVar;
                a(oVar2.x);
                a(oVar2.y);
            } else {
                String valueOf = String.valueOf(cVar.getClass());
                throw new IllegalArgumentException(i0.d.a.a.a.y0(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
            }
        }
    }

    /* compiled from: RopeByteString */
    public static class c implements Iterator<k> {
        public final Stack<o> c = new Stack<>();
        public k d;

        public c(c cVar, a aVar) {
            while (cVar instanceof o) {
                o oVar = (o) cVar;
                this.c.push(oVar);
                cVar = oVar.x;
            }
            this.d = (k) cVar;
        }

        /* renamed from: a */
        public k next() {
            k kVar;
            boolean z;
            k kVar2 = this.d;
            if (kVar2 != null) {
                while (true) {
                    if (!this.c.isEmpty()) {
                        c cVar = this.c.pop().y;
                        while (cVar instanceof o) {
                            o oVar = (o) cVar;
                            this.c.push(oVar);
                            cVar = oVar.x;
                        }
                        kVar = (k) cVar;
                        if (kVar.size() == 0) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (!z) {
                            break;
                        }
                    } else {
                        kVar = null;
                        break;
                    }
                }
                this.d = kVar;
                return kVar2;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.d != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: RopeByteString */
    public class d implements c.a {
        public final c c;
        public c.a d;
        public int q;

        public d(o oVar, a aVar) {
            c cVar = new c(oVar, (a) null);
            this.c = cVar;
            this.d = cVar.next().iterator();
            this.q = oVar.q;
        }

        public byte b() {
            if (!this.d.hasNext()) {
                this.d = this.c.next().iterator();
            }
            this.q--;
            return this.d.b();
        }

        public boolean hasNext() {
            return this.q > 0;
        }

        public Object next() {
            return Byte.valueOf(b());
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        d = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = d;
            if (i4 < iArr.length) {
                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                return;
            }
        }
    }

    public o(c cVar, c cVar2) {
        this.x = cVar;
        this.y = cVar2;
        int size = cVar.size();
        this.Y1 = size;
        this.q = cVar2.size() + size;
        this.Z1 = Math.max(cVar.o(), cVar2.o()) + 1;
    }

    public static k B(c cVar, c cVar2) {
        int size = cVar.size();
        int size2 = cVar2.size();
        byte[] bArr = new byte[(size + size2)];
        cVar.j(bArr, 0, 0, size);
        cVar2.j(bArr, 0, size, size2);
        return new k(bArr);
    }

    public void A(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.Y1;
        if (i3 <= i4) {
            this.x.A(outputStream, i, i2);
        } else if (i >= i4) {
            this.y.A(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.x.A(outputStream, i, i5);
            this.y.A(outputStream, 0, i2 - i5);
        }
    }

    public boolean equals(Object obj) {
        int x2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.q != cVar.size()) {
            return false;
        }
        if (this.q == 0) {
            return true;
        }
        if (this.a2 != 0 && (x2 = cVar.x()) != 0 && this.a2 != x2) {
            return false;
        }
        c cVar2 = new c(this, (a) null);
        k kVar = (k) cVar2.next();
        c cVar3 = new c(cVar, (a) null);
        k kVar2 = (k) cVar3.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = kVar.d.length - i;
            int length2 = kVar2.d.length - i2;
            int min = Math.min(length, length2);
            if (!(i == 0 ? kVar.B(kVar2, i2, min) : kVar2.B(kVar, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.q;
            if (i3 < i4) {
                if (min == length) {
                    kVar = (k) cVar2.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == length2) {
                    kVar2 = (k) cVar3.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public int hashCode() {
        int i = this.a2;
        if (i == 0) {
            int i2 = this.q;
            i = v(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.a2 = i;
        }
        return i;
    }

    public Iterator iterator() {
        return new d(this, (a) null);
    }

    public void k(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.Y1;
        if (i4 <= i5) {
            this.x.k(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.y.k(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.x.k(bArr, i, i2, i6);
            this.y.k(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    public int o() {
        return this.Z1;
    }

    public boolean r() {
        return this.q >= d[this.Z1];
    }

    public boolean s() {
        int w = this.x.w(0, 0, this.Y1);
        c cVar = this.y;
        if (cVar.w(w, 0, cVar.size()) == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return this.q;
    }

    public c.a t() {
        return new d(this, (a) null);
    }

    public int v(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.Y1;
        if (i4 <= i5) {
            return this.x.v(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.y.v(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.y.v(this.x.v(i, i2, i6), 0, i3 - i6);
    }

    public int w(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.Y1;
        if (i4 <= i5) {
            return this.x.w(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.y.w(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.y.w(this.x.w(i, i2, i6), 0, i3 - i6);
    }

    public int x() {
        return this.a2;
    }

    public String y(String str) throws UnsupportedEncodingException {
        byte[] bArr;
        int i = this.q;
        if (i == 0) {
            bArr = Internal.EMPTY_BYTE_ARRAY;
        } else {
            byte[] bArr2 = new byte[i];
            k(bArr2, 0, 0, i);
            bArr = bArr2;
        }
        return new String(bArr, str);
    }
}
