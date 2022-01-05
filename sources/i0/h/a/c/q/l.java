package i0.h.a.c.q;

import android.view.View;
import h0.i.i.q;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ViewUtils */
public final class l implements View.OnAttachStateChangeListener {
    public void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        AtomicInteger atomicInteger = q.a;
        view.requestApplyInsets();
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
