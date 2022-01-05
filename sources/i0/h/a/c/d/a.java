package i0.h.a.c.d;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import h0.i.i.g0.d;
import h0.i.i.q;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SwipeDismissBehavior */
public class a implements d {
    public final /* synthetic */ SwipeDismissBehavior a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    public boolean perform(View view, d.a aVar) {
        boolean z = false;
        if (!this.a.B(view)) {
            return false;
        }
        AtomicInteger atomicInteger = q.a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = this.a.d;
        if ((i == 0 && z2) || (i == 1 && !z2)) {
            z = true;
        }
        int width = view.getWidth();
        if (z) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        SwipeDismissBehavior.b bVar = this.a.b;
        if (bVar != null) {
            bVar.a(view);
        }
        return true;
    }
}
