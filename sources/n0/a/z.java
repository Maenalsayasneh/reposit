package n0.a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: CompletionState.kt */
public class z {
    public static final /* synthetic */ AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(z.class, "_handled");
    private volatile /* synthetic */ int _handled;
    public final Throwable b;

    public z(Throwable th, boolean z) {
        this.b = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean a() {
        return this._handled;
    }

    public String toString() {
        return getClass().getSimpleName() + '[' + this.b + ']';
    }

    public z(Throwable th, boolean z, int i) {
        z = (i & 2) != 0 ? false : z;
        this.b = th;
        this._handled = z ? 1 : 0;
    }
}
