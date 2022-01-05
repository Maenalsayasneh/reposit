package h0.i.i;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* compiled from: OneShotPreDrawListener */
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View c;
    public ViewTreeObserver d;
    public final Runnable q;

    public p(View view, Runnable runnable) {
        this.c = view;
        this.d = view.getViewTreeObserver();
        this.q = runnable;
    }

    public static p a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        p pVar = new p(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(pVar);
        view.addOnAttachStateChangeListener(pVar);
        return pVar;
    }

    public void b() {
        if (this.d.isAlive()) {
            this.d.removeOnPreDrawListener(this);
        } else {
            this.c.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.c.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.q.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.d = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
