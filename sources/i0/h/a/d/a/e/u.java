package i0.h.a.d.a.e;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class u extends WeakReference<Throwable> {
    public final int a;

    public u(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == u.class) {
            if (this == obj) {
                return true;
            }
            u uVar = (u) obj;
            return this.a == uVar.a && get() == uVar.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
