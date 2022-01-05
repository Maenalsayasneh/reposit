package m0.r.t.a.r.b;

import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* compiled from: DefaultBuiltIns.kt */
public final class c extends f {
    public static final c f = new c(false, 1);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(boolean z, int i) {
        super(new LockBasedStorageManager("DefaultBuiltIns"));
        z = (i & 1) != 0 ? true : z;
        if (z) {
            d(false);
        }
    }
}
