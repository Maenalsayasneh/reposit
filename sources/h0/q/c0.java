package h0.q;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import h0.q.e0;

/* compiled from: ProcessLifecycleOwner */
public class c0 implements p {
    public static final c0 c = new c0();
    public Handler Y1;
    public final r Z1 = new r(this);
    public Runnable a2 = new a();
    public e0.a b2 = new b();
    public int d = 0;
    public int q = 0;
    public boolean x = true;
    public boolean y = true;

    /* compiled from: ProcessLifecycleOwner */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            c0 c0Var = c0.this;
            if (c0Var.q == 0) {
                c0Var.x = true;
                c0Var.Z1.e(Lifecycle.Event.ON_PAUSE);
            }
            c0 c0Var2 = c0.this;
            if (c0Var2.d == 0 && c0Var2.x) {
                c0Var2.Z1.e(Lifecycle.Event.ON_STOP);
                c0Var2.y = true;
            }
        }
    }

    /* compiled from: ProcessLifecycleOwner */
    public class b implements e0.a {
        public b() {
        }
    }

    public void a() {
        int i = this.q + 1;
        this.q = i;
        if (i != 1) {
            return;
        }
        if (this.x) {
            this.Z1.e(Lifecycle.Event.ON_RESUME);
            this.x = false;
            return;
        }
        this.Y1.removeCallbacks(this.a2);
    }

    public void b() {
        int i = this.d + 1;
        this.d = i;
        if (i == 1 && this.y) {
            this.Z1.e(Lifecycle.Event.ON_START);
            this.y = false;
        }
    }

    public Lifecycle getLifecycle() {
        return this.Z1;
    }
}
