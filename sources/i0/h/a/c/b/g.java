package i0.h.a.c.b;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import g0.a.b.b.a;
import h0.i.i.d0;
import h0.i.i.q;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: HeaderScrollingViewBehavior */
public abstract class g extends h<View> {
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public int e = 0;
    public int f;

    public g() {
    }

    public void C(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout F = ((AppBarLayout.ScrollingViewBehavior) this).F(coordinatorLayout.f(view));
        if (F != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.c;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, F.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((F.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            d0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                AtomicInteger atomicInteger = q.a;
                if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rect.left = lastWindowInsets.c() + rect.left;
                    rect.right -= lastWindowInsets.d();
                }
            }
            Rect rect2 = this.d;
            int i2 = fVar.c;
            if (i2 == 0) {
                i2 = 8388659;
            }
            Gravity.apply(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int E = E(F);
            view.layout(rect2.left, rect2.top - E, rect2.right, rect2.bottom - E);
            this.e = rect2.top - F.getBottom();
            return;
        }
        coordinatorLayout.s(view, i);
        this.e = 0;
    }

    public final int E(View view) {
        int i;
        if (this.f == 0) {
            return 0;
        }
        float f2 = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).a;
            int E = cVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) cVar).E() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + E > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f2 = 1.0f + (((float) E) / ((float) i));
            }
        }
        int i2 = this.f;
        return a.o((int) (f2 * ((float) i2)), 0, i2);
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        AppBarLayout F;
        d0 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (F = ((AppBarLayout.ScrollingViewBehavior) this).F(coordinatorLayout.f(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            AtomicInteger atomicInteger = q.a;
            if (F.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.b() + lastWindowInsets.e();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.t(view, i, i2, View.MeasureSpec.makeMeasureSpec((size + F.getTotalScrollRange()) - F.getMeasuredHeight(), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
