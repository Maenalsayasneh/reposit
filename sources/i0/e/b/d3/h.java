package i0.e.b.d3;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: lambda */
public final /* synthetic */ class h implements View.OnTouchListener {
    public static final /* synthetic */ h c = new h();

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        if ((motionEvent.getAction() & 255) == 1) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }
}
