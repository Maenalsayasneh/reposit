package h0.i.i;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

/* compiled from: GestureDetectorCompat */
public final class f {
    public final a a;

    /* compiled from: GestureDetectorCompat */
    public interface a {
    }

    /* compiled from: GestureDetectorCompat */
    public static class b implements a {
        public final GestureDetector a;

        public b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.a = new GestureDetector(context, onGestureListener, handler);
        }
    }

    public f(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = new b(context, onGestureListener, (Handler) null);
    }
}
