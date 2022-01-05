package h0.i.i;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import h0.b.a.r;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat */
public final class y {
    public WeakReference<View> a;
    public int b = -1;

    /* compiled from: ViewPropertyAnimatorCompat */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ z a;
        public final /* synthetic */ View b;

        public a(y yVar, z zVar, View view) {
            this.a = zVar;
            this.b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.a.a(this.b);
        }

        public void onAnimationEnd(Animator animator) {
            this.a.b(this.b);
        }

        public void onAnimationStart(Animator animator) {
            this.a.c(this.b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ b0 a;
        public final /* synthetic */ View b;

        public b(y yVar, b0 b0Var, View view) {
            this.a = b0Var;
            this.b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) r.this.f.getParent()).invalidate();
        }
    }

    public y(View view) {
        this.a = new WeakReference<>(view);
    }

    public y a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public y c(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public y d(Interpolator interpolator) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public y e(z zVar) {
        View view = (View) this.a.get();
        if (view != null) {
            f(view, zVar);
        }
        return this;
    }

    public final void f(View view, z zVar) {
        if (zVar != null) {
            view.animate().setListener(new a(this, zVar, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public y g(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public y h(b0 b0Var) {
        View view = (View) this.a.get();
        if (view != null) {
            b bVar = null;
            if (b0Var != null) {
                bVar = new b(this, b0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public void i() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public y j(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
