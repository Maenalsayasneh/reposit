package j0.a.a.c.c;

import android.os.Looper;
import androidx.activity.ComponentActivity;
import h0.q.k0;
import h0.q.m0;
import i0.j.f.p.h;
import j0.a.a.a;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: ActivityRetainedComponentManager */
public final class c implements j0.a.b.b<j0.a.a.b.a> {
    public final m0 c;
    public volatile j0.a.a.b.a d;
    public final Object q = new Object();

    /* compiled from: ActivityRetainedComponentManager */
    public interface a {
        j0.a.a.c.a.b i();
    }

    /* compiled from: ActivityRetainedComponentManager */
    public static final class b extends k0 {
        public final j0.a.a.b.a a;

        public b(j0.a.a.b.a aVar) {
            this.a = aVar;
        }

        public void onCleared() {
            super.onCleared();
            d dVar = (d) ((C0225c) h.L0(this.a, C0225c.class)).a();
            Objects.requireNonNull(dVar);
            if (h.b == null) {
                h.b = Looper.getMainLooper().getThread();
            }
            if (Thread.currentThread() == h.b) {
                for (a.C0223a a2 : dVar.a) {
                    a2.a();
                }
                return;
            }
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    /* renamed from: j0.a.a.c.c.c$c  reason: collision with other inner class name */
    /* compiled from: ActivityRetainedComponentManager */
    public interface C0225c {
        j0.a.a.a a();
    }

    /* compiled from: ActivityRetainedComponentManager */
    public static final class d implements j0.a.a.a {
        public final Set<a.C0223a> a = new HashSet();
    }

    public c(ComponentActivity componentActivity) {
        this.c = new m0(componentActivity.getViewModelStore(), new b(this, componentActivity));
    }

    public Object U() {
        if (this.d == null) {
            synchronized (this.q) {
                if (this.d == null) {
                    this.d = ((b) this.c.a(b.class)).a;
                }
            }
        }
        return this.d;
    }
}
