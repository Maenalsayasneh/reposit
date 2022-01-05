package i0.j.a.m.e;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* compiled from: PriorityThreadFactory */
public class a implements ThreadFactory {
    public final int c;
    public i0.j.a.n.a.a d = i0.j.a.g.a.i();

    /* renamed from: i0.j.a.m.e.a$a  reason: collision with other inner class name */
    /* compiled from: PriorityThreadFactory */
    public class C0156a implements Runnable {
        public final /* synthetic */ Runnable c;

        public C0156a(Runnable runnable) {
            this.c = runnable;
        }

        public void run() {
            try {
                Process.setThreadPriority(a.this.c);
            } catch (Throwable th) {
                i0.j.a.n.a.a aVar = a.this.d;
                StringBuilder P0 = i0.d.a.a.a.P0("New thread threw an exception");
                P0.append(th.getMessage());
                aVar.f(P0.toString());
            }
            this.c.run();
        }
    }

    public a(int i) {
        this.c = i;
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(new C0156a(runnable));
    }
}
