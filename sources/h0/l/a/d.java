package h0.l.a;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import h0.l.a.a;
import java.util.Objects;

/* compiled from: SpringAnimation */
public final class d extends b<d> {
    public e r = null;
    public float s = Float.MAX_VALUE;
    public boolean t = false;

    public <K> d(K k, c<K> cVar) {
        super(k, cVar);
    }

    public void f() {
        e eVar = this.r;
        if (eVar != null) {
            double d = (double) ((float) eVar.i);
            if (d > ((double) Float.MAX_VALUE)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (d >= ((double) this.m)) {
                Objects.requireNonNull(eVar);
                double abs = Math.abs((double) (this.o * 0.75f));
                eVar.d = abs;
                eVar.e = abs * 62.5d;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    boolean z = this.l;
                    if (!z && !z) {
                        this.l = true;
                        if (!this.i) {
                            this.h = this.k.a(this.j);
                        }
                        float f = this.h;
                        if (f > Float.MAX_VALUE || f < this.m) {
                            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                        }
                        a a = a.a();
                        if (a.c.size() == 0) {
                            if (a.e == null) {
                                a.e = new a.d(a.d);
                            }
                            a.d dVar = (a.d) a.e;
                            dVar.b.postFrameCallback(dVar.c);
                        }
                        if (!a.c.contains(this)) {
                            a.c.add(this);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new AndroidRuntimeException("Animations may only be started on the main thread");
            } else {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    public <K> d(K k, c<K> cVar, float f) {
        super(k, cVar);
        this.r = new e(f);
    }
}
