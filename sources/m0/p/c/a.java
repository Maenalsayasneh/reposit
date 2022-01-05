package m0.p.c;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import m0.n.b.i;

/* compiled from: PlatformThreadLocalRandom.kt */
public final class a extends m0.p.a {
    public long d(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    public Random e() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        i.d(current, "ThreadLocalRandom.current()");
        return current;
    }
}
