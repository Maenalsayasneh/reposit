package retrofit2;

import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import t0.d;

/* compiled from: KotlinExtensions.kt */
public final class KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1 extends Lambda implements l<Throwable, i> {
    public final /* synthetic */ d c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1(d dVar) {
        super(1);
        this.c = dVar;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.c.cancel();
        return i.a;
    }
}
