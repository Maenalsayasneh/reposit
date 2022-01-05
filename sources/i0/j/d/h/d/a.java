package i0.j.d.h.d;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.instabug.featuresrequest.ui.custom.IbFrRippleView;

/* compiled from: IbFrRippleView */
public class a extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ IbFrRippleView a;

    public a(IbFrRippleView ibFrRippleView) {
        this.a = ibFrRippleView;
    }

    public void onLongPress(MotionEvent motionEvent) {
        super.onLongPress(motionEvent);
        this.a.a(motionEvent);
        this.a.b(Boolean.TRUE);
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }
}
