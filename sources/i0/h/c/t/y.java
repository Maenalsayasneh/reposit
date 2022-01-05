package i0.h.c.t;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final /* synthetic */ class y implements Executor {
    public static final Executor c = new y();

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
