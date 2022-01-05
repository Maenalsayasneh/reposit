package i0.o.a;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* compiled from: DeferredRequestCreator */
public class h implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final u c;
    public final WeakReference<ImageView> d;
    public e q;

    public h(u uVar, ImageView imageView, e eVar) {
        this.c = uVar;
        this.d = new WeakReference<>(imageView);
        this.q = eVar;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    public boolean onPreDraw() {
        ImageView imageView = (ImageView) this.d.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            this.d.clear();
            u uVar = this.c;
            uVar.d = false;
            uVar.c.a(width, height);
            uVar.b(imageView, this.q);
        }
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
