package n0.a;

/* compiled from: EventLoop.common.kt */
public final class y1 {
    public static final y1 a = null;
    public static final ThreadLocal<s0> b = new ThreadLocal<>();

    public static final s0 a() {
        ThreadLocal<s0> threadLocal = b;
        s0 s0Var = threadLocal.get();
        if (s0Var != null) {
            return s0Var;
        }
        h hVar = new h(Thread.currentThread());
        threadLocal.set(hVar);
        return hVar;
    }
}
