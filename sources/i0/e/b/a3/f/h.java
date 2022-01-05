package i0.e.b.a3.f;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.clubhouse.android.core.ui.DragInterceptingConstraintLayout;
import m0.n.b.i;
import n0.a.g2.p;

/* compiled from: DragInterceptingConstraintLayout.kt */
public final class h extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ DragInterceptingConstraintLayout a;

    public h(DragInterceptingConstraintLayout dragInterceptingConstraintLayout) {
        this.a = dragInterceptingConstraintLayout;
    }

    public boolean onDown(MotionEvent motionEvent) {
        i.e(motionEvent, "event");
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        i.e(motionEvent2, "e2");
        float rawY = motionEvent2.getRawY() - this.a.n2;
        if (Math.abs(rawY) <= 200.0f) {
            return true;
        }
        if (rawY > 0.0f) {
            ((p) this.a.getDragFlow()).d(g.a);
            return true;
        }
        ((p) this.a.getDragFlow()).d(i.a);
        return true;
    }
}
