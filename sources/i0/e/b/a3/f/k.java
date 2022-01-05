package i0.e.b.a3.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import i0.e.b.g3.k.y0.l;
import i0.e.b.z2.g.i1;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: OnSwipeTouchListener.kt */
public class k implements View.OnTouchListener {
    public final GestureDetector c;

    /* compiled from: OnSwipeTouchListener.kt */
    public final class a extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ k a;

        public a(k kVar) {
            i.e(kVar, "this$0");
            this.a = kVar;
        }

        public boolean onDown(MotionEvent motionEvent) {
            i.e(motionEvent, "e");
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            i.e(motionEvent, "e1");
            i.e(motionEvent2, "e2");
            try {
                float y = motionEvent2.getY() - motionEvent.getY();
                float x = motionEvent2.getX() - motionEvent.getX();
                if (Math.abs(x) > Math.abs(y)) {
                    if (Math.abs(x) <= 100.0f || Math.abs(f) <= 100.0f) {
                        return false;
                    }
                    if (x > 0.0f) {
                        Objects.requireNonNull(this.a);
                        return false;
                    }
                    Objects.requireNonNull(this.a);
                    return false;
                } else if (Math.abs(y) <= 100.0f || Math.abs(f2) <= 100.0f) {
                    return false;
                } else {
                    if (y > 0.0f) {
                        l lVar = (l) this.a;
                        lVar.d.S0().p(i1.a);
                        i0.e.b.d3.k.m(lVar.q);
                        return false;
                    }
                    Objects.requireNonNull(this.a);
                    return false;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    public k(Context context) {
        i.e(context, "c");
        this.c = new GestureDetector(context, new a(this));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        i.e(view, "view");
        i.e(motionEvent, "motionEvent");
        return this.c.onTouchEvent(motionEvent);
    }
}
