package n0.a.h2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeTaskQueue.kt */
public class m<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public m(boolean z) {
        this._cur = new n(8, z);
    }

    public final boolean a(E e) {
        while (true) {
            n nVar = (n) this._cur;
            int a2 = nVar.a(e);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                a.compareAndSet(this, nVar, nVar.e());
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            n nVar = (n) this._cur;
            if (!nVar.b()) {
                a.compareAndSet(this, nVar, nVar.e());
            } else {
                return;
            }
        }
    }

    public final int c() {
        return ((n) this._cur).c();
    }

    public final E d() {
        while (true) {
            n nVar = (n) this._cur;
            E f = nVar.f();
            if (f != n.d) {
                return f;
            }
            a.compareAndSet(this, nVar, nVar.e());
        }
    }
}
