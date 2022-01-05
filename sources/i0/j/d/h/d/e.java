package i0.j.d.h.d;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: InstaToast */
public class e implements View.OnTouchListener {
    public final /* synthetic */ d c;

    public e(d dVar) {
        this.c = dVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        this.c.b(3);
        return false;
    }
}
