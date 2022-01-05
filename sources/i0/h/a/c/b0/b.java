package i0.h.a.c.b0;

import android.view.ViewTreeObserver;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.android.material.timepicker.ClockHandView;

/* compiled from: ClockFaceView */
public class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView c;

    public b(ClockFaceView clockFaceView) {
        this.c = clockFaceView;
    }

    public boolean onPreDraw() {
        if (!this.c.isShown()) {
            return true;
        }
        this.c.getViewTreeObserver().removeOnPreDrawListener(this);
        ClockFaceView clockFaceView = this.c;
        int height = ((this.c.getHeight() / 2) - clockFaceView.q2.b2) - clockFaceView.x2;
        if (height != clockFaceView.o2) {
            clockFaceView.o2 = height;
            clockFaceView.t();
            ClockHandView clockHandView = clockFaceView.q2;
            clockHandView.k2 = clockFaceView.o2;
            clockHandView.invalidate();
        }
        return true;
    }
}
