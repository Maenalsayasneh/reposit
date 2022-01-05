package i0.j.e.d1.h;

import android.os.Process;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;

/* compiled from: PriorityThreadFactory */
public class b implements ThreadFactory {

    /* compiled from: PriorityThreadFactory */
    public class a implements Runnable {
        public final /* synthetic */ Runnable c;

        public a(Runnable runnable) {
            this.c = runnable;
        }

        public void run() {
            try {
                Objects.requireNonNull(b.this);
                Process.setThreadPriority(10);
            } catch (Throwable th) {
                StringBuilder P0 = i0.d.a.a.a.P0("new thread threw an exception");
                P0.append(th.getMessage());
                InstabugSDKLogger.e("PriorityThreadFactory", P0.toString());
            }
            this.c.run();
        }
    }

    public b(int i) {
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(new a(runnable));
    }
}
