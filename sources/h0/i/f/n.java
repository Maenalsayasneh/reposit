package h0.i.f;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* compiled from: RequestExecutor */
public class n implements ThreadFactory {
    public String c;
    public int d;

    /* compiled from: RequestExecutor */
    public static class a extends Thread {
        public final int c;

        public a(Runnable runnable, String str, int i) {
            super(runnable, str);
            this.c = i;
        }

        public void run() {
            Process.setThreadPriority(this.c);
            super.run();
        }
    }

    public n(String str, int i) {
        this.c = str;
        this.d = i;
    }

    public Thread newThread(Runnable runnable) {
        return new a(runnable, this.c, this.d);
    }
}
