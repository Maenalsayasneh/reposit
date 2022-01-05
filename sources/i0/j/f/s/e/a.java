package i0.j.f.s.e;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.instabug.library.Instabug;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.util.InstabugSDKLogger;

/* compiled from: GestureListener */
public final class a extends GestureDetector.SimpleOnGestureListener {
    public final C0191a a;

    /* renamed from: i0.j.f.s.e.a$a  reason: collision with other inner class name */
    /* compiled from: GestureListener */
    public interface C0191a {
        void a();

        void b();

        void c();

        void d();

        void f();
    }

    public a(C0191a aVar) {
        this.a = aVar;
    }

    public final float a() {
        if (Instabug.getApplicationContext() != null && InstabugDeviceProperties.isTablet(Instabug.getApplicationContext())) {
            return 3000.0f;
        }
        return 6000.0f;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        try {
            float y = motionEvent2.getY() - motionEvent.getY();
            float x = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(x) > Math.abs(y)) {
                if (Math.abs(x) > 300.0f && Math.abs(f) > 800.0f) {
                    if (x > 0.0f) {
                        this.a.d();
                    } else {
                        this.a.f();
                    }
                }
                return false;
            }
            if (Math.abs(y) > 300.0f && Math.abs(f2) > 800.0f) {
                if (y > 0.0f) {
                    if (Math.abs(f2) > a()) {
                        this.a.c();
                    }
                } else if (Math.abs(f2) > a()) {
                    this.a.b();
                }
            }
            return false;
            return true;
        } catch (Exception e) {
            InstabugSDKLogger.e(this, e.getMessage(), e);
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.a.a();
        return super.onSingleTapConfirmed(motionEvent);
    }
}
