package i0.j.e.m0.d;

import com.instabug.library.InstabugState;
import com.instabug.library.InstabugStateProvider;
import com.instabug.library.util.threading.PoolProvider;

/* compiled from: FloatingButtonInvoker */
public class c implements Runnable {
    public final /* synthetic */ b c;

    /* compiled from: FloatingButtonInvoker */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            b bVar = c.this.c;
            int i = b.c;
            bVar.d();
        }
    }

    public c(b bVar) {
        this.c = bVar;
    }

    public void run() {
        if (InstabugStateProvider.getInstance().getState() == InstabugState.ENABLED) {
            this.c.c();
            b bVar = this.c;
            bVar.d = null;
            bVar.a();
            return;
        }
        PoolProvider.postMainThreadTask(new a());
    }
}
