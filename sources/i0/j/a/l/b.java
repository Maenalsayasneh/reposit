package i0.j.a.l;

import android.view.Choreographer;
import i0.j.a.h.e.a;
import java.util.concurrent.TimeUnit;

/* compiled from: APMChoreographerMonitorImpl */
public class b implements a, Choreographer.FrameCallback {
    public Choreographer a;
    public long b = -1;
    public a c;
    public float d;

    public b(a aVar, float f) {
        this.c = aVar;
        this.d = f;
        this.a = Choreographer.getInstance();
    }

    public void doFrame(long j) {
        long micros = TimeUnit.NANOSECONDS.toMicros(j - this.b);
        if (this.b > 0 && ((float) micros) > this.d) {
            this.c.a(micros);
        }
        this.b = j;
        this.a.postFrameCallback(this);
    }
}
