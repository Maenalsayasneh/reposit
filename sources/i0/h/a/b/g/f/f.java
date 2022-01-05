package i0.h.a.b.g.f;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final class f extends WeakReference<Throwable> {
    public final int a;

    public f(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == f.class) {
            if (this == obj) {
                return true;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && get() == fVar.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
