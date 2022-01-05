package i0.j.d.h.d;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.instabug.featuresrequest.ui.custom.SnackbarLayout;
import i0.j.d.h.d.j;

/* compiled from: SnackbarLayout */
public final class b extends SwipeDismissBehavior<SnackbarLayout> {
    public j.b i;

    public b(j.b bVar) {
        this.i = bVar;
    }

    public boolean B(View view) {
        return view instanceof SnackbarLayout;
    }

    public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        SnackbarLayout snackbarLayout = (SnackbarLayout) view;
        if (coordinatorLayout.q(snackbarLayout, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                j.a().b(this.i);
            } else if (actionMasked == 1 || actionMasked == 3) {
                j.a().g(this.i);
            }
        }
        return super.j(coordinatorLayout, snackbarLayout, motionEvent);
    }
}
