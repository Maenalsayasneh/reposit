package m0.p;

import kotlin.random.Random;

/* compiled from: PlatformRandom.kt */
public abstract class a extends Random {
    public int a(int i) {
        return ((-i) >> 31) & (e().nextInt() >>> (32 - i));
    }

    public int b() {
        return e().nextInt();
    }

    public long c() {
        return e().nextLong();
    }

    public abstract java.util.Random e();
}
