package i0.h.a.a.i;

import java.util.concurrent.Executors;

/* compiled from: ExecutionModule_ExecutorFactory */
public final class f implements l0.a.a {

    /* compiled from: ExecutionModule_ExecutorFactory */
    public static final class a {
        public static final f a = new f();
    }

    public Object get() {
        return new g(Executors.newSingleThreadExecutor());
    }
}
