package k0.b.z.f;

import i0.j.f.p.h;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import k0.b.z.c.d;

/* compiled from: SpscLinkedArrayQueue */
public final class a<T> implements d<T> {
    public static final int c = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object d = new Object();
    public final int Y1;
    public AtomicReferenceArray<Object> Z1;
    public final int a2;
    public AtomicReferenceArray<Object> b2;
    public final AtomicLong c2 = new AtomicLong();
    public final AtomicLong q;
    public int x;
    public long y;

    public a(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.q = atomicLong;
        int G3 = h.G3(Math.max(8, i));
        int i2 = G3 - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(G3 + 1);
        this.Z1 = atomicReferenceArray;
        this.Y1 = i2;
        this.x = Math.min(G3 / 4, c);
        this.b2 = atomicReferenceArray;
        this.a2 = i2;
        this.y = (long) (i2 - 1);
        atomicLong.lazySet(0);
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return this.q.get() == this.c2.get();
    }

    public boolean offer(T t) {
        Objects.requireNonNull(t, "Null is not a valid element");
        AtomicReferenceArray<Object> atomicReferenceArray = this.Z1;
        long j = this.q.get();
        int i = this.Y1;
        int i2 = ((int) j) & i;
        if (j < this.y) {
            atomicReferenceArray.lazySet(i2, t);
            this.q.lazySet(j + 1);
            return true;
        }
        long j2 = ((long) this.x) + j;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            this.y = j2 - 1;
            atomicReferenceArray.lazySet(i2, t);
            this.q.lazySet(j + 1);
            return true;
        }
        long j3 = j + 1;
        if (atomicReferenceArray.get(((int) j3) & i) == null) {
            atomicReferenceArray.lazySet(i2, t);
            this.q.lazySet(j3);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.Z1 = atomicReferenceArray2;
        this.y = (((long) i) + j) - 1;
        atomicReferenceArray2.lazySet(i2, t);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i2, d);
        this.q.lazySet(j3);
        return true;
    }

    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.b2;
        long j = this.c2.get();
        int i = this.a2;
        int i2 = ((int) j) & i;
        T t = atomicReferenceArray.get(i2);
        boolean z = t == d;
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i2, (Object) null);
            this.c2.lazySet(j + 1);
            return t;
        } else if (!z) {
            return null;
        } else {
            int i3 = i + 1;
            AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
            atomicReferenceArray.lazySet(i3, (Object) null);
            this.b2 = atomicReferenceArray2;
            T t2 = atomicReferenceArray2.get(i2);
            if (t2 != null) {
                atomicReferenceArray2.lazySet(i2, (Object) null);
                this.c2.lazySet(j + 1);
            }
            return t2;
        }
    }
}
