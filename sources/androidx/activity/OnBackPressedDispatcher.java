package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycle;
import h0.a.b;
import h0.q.n;
import h0.q.p;
import h0.q.r;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {
    public final Runnable a;
    public final ArrayDeque<b> b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements n, h0.a.a {
        public final Lifecycle c;
        public final b d;
        public h0.a.a q;

        public LifecycleOnBackPressedCancellable(Lifecycle lifecycle, b bVar) {
            this.c = lifecycle;
            this.d = bVar;
            lifecycle.a(this);
        }

        public void a(p pVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                b bVar = this.d;
                onBackPressedDispatcher.b.add(bVar);
                a aVar = new a(bVar);
                bVar.b.add(aVar);
                this.q = aVar;
            } else if (event == Lifecycle.Event.ON_STOP) {
                h0.a.a aVar2 = this.q;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            r rVar = (r) this.c;
            rVar.d("removeObserver");
            rVar.b.k(this);
            this.d.b.remove(this);
            h0.a.a aVar = this.q;
            if (aVar != null) {
                aVar.cancel();
                this.q = null;
            }
        }
    }

    public class a implements h0.a.a {
        public final b c;

        public a(b bVar) {
            this.c = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.b.remove(this.c);
            this.c.b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public void a(p pVar, b bVar) {
        Lifecycle lifecycle = pVar.getLifecycle();
        if (((r) lifecycle).c != Lifecycle.State.DESTROYED) {
            bVar.b.add(new LifecycleOnBackPressedCancellable(lifecycle, bVar));
        }
    }

    public void b() {
        Iterator<b> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
