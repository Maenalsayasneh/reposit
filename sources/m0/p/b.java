package m0.p;

import java.util.Random;
import m0.n.b.i;

/* compiled from: PlatformRandom.kt */
public final class b extends a {
    public final a q = new a();

    /* compiled from: PlatformRandom.kt */
    public static final class a extends ThreadLocal<Random> {
        public Object initialValue() {
            return new Random();
        }
    }

    public Random e() {
        Object obj = this.q.get();
        i.d(obj, "implStorage.get()");
        return (Random) obj;
    }
}
