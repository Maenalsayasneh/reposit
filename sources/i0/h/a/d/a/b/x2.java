package i0.h.a.d.a.b;

import i0.h.a.d.a.e.d0;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class x2 implements d0<Executor> {
    public final Object a() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(s2.c);
        Objects.requireNonNull(newSingleThreadExecutor, "Cannot return null from a non-@Nullable @Provides method");
        return newSingleThreadExecutor;
    }
}
