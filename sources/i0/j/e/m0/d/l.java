package i0.j.e.m0.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import h0.i.i.f;
import i0.j.e.m0.c;
import java.util.Objects;

/* compiled from: TwoFingerSwipeLeftInvoker */
public class l implements a<MotionEvent> {
    public volatile boolean Y1;
    public f c;
    public b d;
    public Context q;
    public boolean x = false;
    public i0.j.e.m0.a y;

    /* compiled from: TwoFingerSwipeLeftInvoker */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            l.this.d = new b();
            l lVar = l.this;
            lVar.c = new f(lVar.q, lVar.d);
            l.this.Y1 = true;
        }
    }

    /* compiled from: TwoFingerSwipeLeftInvoker */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            Objects.requireNonNull(l.this);
            if ((motionEvent != null && motionEvent2 != null && motionEvent.getX() > motionEvent2.getX() && motionEvent.getX() - motionEvent2.getX() >= Math.abs(motionEvent.getY() - motionEvent2.getY())) && l.this.x) {
                InstabugSDKLogger.d("TwoFingerSwipeLeftInvoker", "Two fingers swiped left, invoking SDK");
                InvocationManager.getInstance().setLastUsedInvoker(l.this);
                ((c) l.this.y).c((Uri) null);
            }
            l.this.x = false;
            return false;
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public l(Context context, i0.j.e.m0.a aVar) {
        this.q = context;
        this.y = aVar;
    }

    public synchronized void a() {
        PoolProvider.postMainThreadTask(new a());
    }

    public boolean b() {
        return this.Y1;
    }

    public synchronized void c() {
        this.d = null;
        this.c = null;
        this.Y1 = false;
    }
}
