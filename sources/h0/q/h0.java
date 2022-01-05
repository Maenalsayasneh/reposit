package h0.q;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;

/* compiled from: ServiceLifecycleDispatcher */
public class h0 {
    public final r a;
    public final Handler b = new Handler();
    public a c;

    /* compiled from: ServiceLifecycleDispatcher */
    public static class a implements Runnable {
        public final r c;
        public final Lifecycle.Event d;
        public boolean q = false;

        public a(r rVar, Lifecycle.Event event) {
            this.c = rVar;
            this.d = event;
        }

        public void run() {
            if (!this.q) {
                this.c.e(this.d);
                this.q = true;
            }
        }
    }

    public h0(p pVar) {
        this.a = new r(pVar);
    }

    public final void a(Lifecycle.Event event) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.a, event);
        this.c = aVar2;
        this.b.postAtFrontOfQueue(aVar2);
    }
}
