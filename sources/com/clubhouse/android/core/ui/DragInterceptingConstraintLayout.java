package com.clubhouse.android.core.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import h0.i.i.f;
import i0.e.b.a3.f.f;
import i0.e.b.a3.f.h;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import m0.n.b.i;
import n0.a.g2.t;
import n0.a.g2.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/clubhouse/android/core/ui/DragInterceptingConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "event", "onTouchEvent", "Lh0/i/i/f;", "p2", "Lh0/i/i/f;", "gestureDetector", "", "n2", "F", "touchStartY", "Ln0/a/g2/t;", "Li0/e/b/a3/f/f;", "o2", "Ln0/a/g2/t;", "getDragFlow", "()Ln0/a/g2/t;", "dragFlow", "core_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: DragInterceptingConstraintLayout.kt */
public class DragInterceptingConstraintLayout extends ConstraintLayout {
    public float n2;
    public final t<f> o2 = u.b(1, 0, BufferOverflow.DROP_OLDEST, 2);
    public final h0.i.i.f p2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragInterceptingConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        i.e(context, "context");
        i.e(context, "context");
        this.p2 = new h0.i.i.f(context, new h(this));
    }

    public final t<f> getDragFlow() {
        return this.o2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            java.lang.String r0 = "ev"
            m0.n.b.i.e(r9, r0)
            int r0 = r9.getActionMasked()
            if (r0 != 0) goto L_0x0011
            float r0 = r9.getRawY()
            r8.n2 = r0
        L_0x0011:
            java.lang.String r0 = "scrolling_view"
            android.view.View r0 = r8.findViewWithTag(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 0
            if (r0 != 0) goto L_0x001e
            r2 = 0
            goto L_0x0022
        L_0x001e:
            android.view.View r2 = r0.getChildAt(r1)
        L_0x0022:
            r3 = 1
            if (r2 != 0) goto L_0x0026
            goto L_0x0040
        L_0x0026:
            android.view.View r2 = r0.getChildAt(r1)
            int r2 = r2.getHeight()
            int r4 = r0.getHeight()
            int r5 = r0.getPaddingTop()
            int r5 = r5 + r2
            int r2 = r0.getPaddingBottom()
            int r2 = r2 + r5
            if (r4 >= r2) goto L_0x0040
            r2 = r3
            goto L_0x0041
        L_0x0040:
            r2 = r1
        L_0x0041:
            r4 = 2
            if (r2 == 0) goto L_0x0083
            if (r0 != 0) goto L_0x0048
        L_0x0046:
            r0 = r1
            goto L_0x0080
        L_0x0048:
            int[] r2 = new int[r4]
            r0.getLocationOnScreen(r2)
            r5 = r2[r1]
            r2 = r2[r3]
            int r6 = r0.getWidth()
            int r6 = r6 + r5
            int r0 = r0.getHeight()
            int r0 = r0 + r2
            float r7 = r9.getRawX()
            float r5 = (float) r5
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0046
            float r5 = r9.getRawX()
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0046
            float r5 = r9.getRawY()
            float r2 = (float) r2
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0046
            float r2 = r9.getRawY()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            r0 = r3
        L_0x0080:
            if (r0 == 0) goto L_0x0083
            return r1
        L_0x0083:
            int r0 = r9.getActionMasked()
            if (r0 == r3) goto L_0x00aa
            if (r0 == r4) goto L_0x008d
            r9 = 3
            goto L_0x00aa
        L_0x008d:
            float r9 = r9.getRawY()
            float r0 = r8.n2
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            android.content.Context r0 = r8.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            float r0 = (float) r0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x00aa
            r1 = r3
        L_0x00aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.core.ui.DragInterceptingConstraintLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return ((f.b) this.p2.a).a.onTouchEvent(motionEvent);
    }
}
