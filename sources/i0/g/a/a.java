package i0.g.a;

import android.view.MotionEvent;
import android.view.View;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import i0.g.a.d.c;
import i0.g.a.d.d;

/* compiled from: FastScroller */
public class a implements View.OnTouchListener {
    public final /* synthetic */ FastScroller c;

    public a(FastScroller fastScroller) {
        this.c = fastScroller;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        int i;
        int i2;
        this.c.requestDisallowInterceptTouchEvent(true);
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            if (this.c.h2 != null && motionEvent.getAction() == 0) {
                c cVar = this.c.g2;
                if (cVar.c() != null) {
                    cVar.c().a();
                }
                if (cVar.a() != null) {
                    cVar.a().a();
                }
            }
            FastScroller fastScroller = this.c;
            fastScroller.f2 = true;
            if (fastScroller.c()) {
                float rawY = motionEvent.getRawY();
                View view2 = fastScroller.y;
                int[] iArr = {0, (int) view2.getY()};
                ((View) view2.getParent()).getLocationInWindow(iArr);
                f = rawY - ((float) iArr[1]);
                i2 = fastScroller.getHeight();
                i = fastScroller.y.getHeight();
            } else {
                float rawX = motionEvent.getRawX();
                View view3 = fastScroller.y;
                int[] iArr2 = {(int) view3.getX(), 0};
                ((View) view3.getParent()).getLocationInWindow(iArr2);
                f = rawX - ((float) iArr2[0]);
                i2 = fastScroller.getWidth();
                i = fastScroller.y.getWidth();
            }
            float f2 = f / ((float) (i2 - i));
            this.c.setScrollerPosition(f2);
            this.c.setRecyclerViewPosition(f2);
            return true;
        } else if (motionEvent.getAction() != 1) {
            return false;
        } else {
            FastScroller fastScroller2 = this.c;
            fastScroller2.f2 = false;
            if (fastScroller2.h2 != null) {
                c cVar2 = fastScroller2.g2;
                if (cVar2.c() != null) {
                    d dVar = cVar2.c().a;
                    dVar.a();
                    dVar.b.start();
                }
                if (cVar2.a() != null) {
                    d dVar2 = cVar2.a().a;
                    dVar2.a();
                    dVar2.b.start();
                }
            }
            return true;
        }
    }
}
