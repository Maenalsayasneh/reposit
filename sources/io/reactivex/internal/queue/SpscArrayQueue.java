package io.reactivex.internal.queue;

import i0.j.f.p.h;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import k0.b.z.c.d;

public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements d<E> {
    public static final Integer c = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    public final int Y1;
    public final int d = (length() - 1);
    public final AtomicLong q = new AtomicLong();
    public long x;
    public final AtomicLong y = new AtomicLong();

    public SpscArrayQueue(int i) {
        super(h.G3(i));
        this.Y1 = Math.min(i / 4, c.intValue());
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return this.q.get() == this.y.get();
    }

    public boolean offer(E e) {
        Objects.requireNonNull(e, "Null is not a valid element");
        int i = this.d;
        long j = this.q.get();
        int i2 = ((int) j) & i;
        if (j >= this.x) {
            long j2 = ((long) this.Y1) + j;
            if (get(i & ((int) j2)) == null) {
                this.x = j2;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, e);
        this.q.lazySet(j + 1);
        return true;
    }

    public E poll() {
        long j = this.y.get();
        int i = ((int) j) & this.d;
        E e = get(i);
        if (e == null) {
            return null;
        }
        this.y.lazySet(j + 1);
        lazySet(i, (Object) null);
        return e;
    }
}
