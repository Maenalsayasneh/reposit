package n0.a.k2;

import kotlinx.coroutines.sync.MutexImpl;
import n0.a.h2.t;

/* compiled from: Mutex.kt */
public final class d {
    public static final t a = new t("UNLOCK_FAIL");
    public static final t b;
    public static final t c;
    public static final a d;
    public static final a e;

    static {
        t tVar = new t("LOCKED");
        b = tVar;
        t tVar2 = new t("UNLOCKED");
        c = tVar2;
        d = new a(tVar);
        e = new a(tVar2);
    }

    public static b a(boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        return new MutexImpl(z);
    }
}
