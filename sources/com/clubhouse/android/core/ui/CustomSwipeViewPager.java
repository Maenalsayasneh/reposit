package com.clubhouse.android.core.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import h0.f0.a.a;
import i0.e.b.a3.f.l;
import i0.e.b.a3.f.m;
import i0.e.b.a3.f.n;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import m0.n.b.i;
import n0.a.g2.p;
import n0.a.g2.t;
import n0.a.g2.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\"\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Lcom/clubhouse/android/core/ui/CustomSwipeViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ln0/a/g2/t;", "Li0/e/b/a3/f/n;", "c", "Ln0/a/g2/t;", "getSwipeFlow", "()Ln0/a/g2/t;", "swipeFlow", "", "q", "F", "touchStartX", "x", "touchStartY", "d", "Z", "getSwipeDetected", "()Z", "setSwipeDetected", "(Z)V", "swipeDetected", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: CustomSwipeViewPager.kt */
public class CustomSwipeViewPager extends ViewPager {
    public final t<n> c = u.b(1, 0, BufferOverflow.DROP_OLDEST, 2);
    public boolean d;
    public float q;
    public float x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomSwipeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "context");
    }

    public final boolean getSwipeDetected() {
        return this.d;
    }

    public final t<n> getSwipeFlow() {
        return this.c;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        i.e(motionEvent, "ev");
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 0) {
            this.d = false;
            this.q = rawX;
            this.x = rawY;
        } else if (action == 2 && !this.d && onInterceptTouchEvent) {
            float f = this.q;
            boolean z2 = f < rawX;
            if (f > rawX) {
                z = true;
            }
            if (z2 && getCurrentItem() == 0 && Math.abs(rawY - this.x) < 5.0f) {
                this.d = true;
                ((p) this.c).d(m.a);
            } else if (z) {
                int currentItem = getCurrentItem();
                a adapter = getAdapter();
                i.c(adapter);
                if (currentItem == adapter.getCount() - 1 && Math.abs(rawY - this.x) < 5.0f) {
                    this.d = true;
                    ((p) this.c).d(l.a);
                }
            }
        }
        return onInterceptTouchEvent;
    }

    public final void setSwipeDetected(boolean z) {
        this.d = z;
    }
}
