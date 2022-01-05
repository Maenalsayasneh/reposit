package io.reactivex.internal.operators.observable;

import io.reactivex.internal.observers.BasicIntQueueDisposable;
import k0.b.l;
import k0.b.p;

public final class ObservableRange extends l<Integer> {
    public final int c;
    public final long d;

    public static final class RangeDisposable extends BasicIntQueueDisposable<Integer> {
        public final p<? super Integer> c;
        public final long d;
        public long q;
        public boolean x;

        public RangeDisposable(p<? super Integer> pVar, long j, long j2) {
            this.c = pVar;
            this.q = j;
            this.d = j2;
        }

        public void clear() {
            this.q = this.d;
            lazySet(1);
        }

        public void dispose() {
            set(1);
        }

        public boolean isDisposed() {
            return get() != 0;
        }

        public boolean isEmpty() {
            return this.q == this.d;
        }

        public Object poll() throws Exception {
            long j = this.q;
            if (j != this.d) {
                this.q = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }

        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.x = true;
            return 1;
        }
    }

    public ObservableRange(int i, int i2) {
        this.c = i;
        this.d = ((long) i) + ((long) i2);
    }

    public void u(p<? super Integer> pVar) {
        RangeDisposable rangeDisposable = new RangeDisposable(pVar, (long) this.c, this.d);
        pVar.a(rangeDisposable);
        if (!rangeDisposable.x) {
            p<? super Integer> pVar2 = rangeDisposable.c;
            long j = rangeDisposable.d;
            for (long j2 = rangeDisposable.q; j2 != j && rangeDisposable.get() == 0; j2++) {
                pVar2.b(Integer.valueOf((int) j2));
            }
            if (rangeDisposable.get() == 0) {
                rangeDisposable.lazySet(1);
                pVar2.onComplete();
            }
        }
    }
}
