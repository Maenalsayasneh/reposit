package i0.h.c.p;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public final /* synthetic */ class d implements Executor {
    public static final Executor c = new d();

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
