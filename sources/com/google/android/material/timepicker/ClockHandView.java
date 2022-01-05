package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class ClockHandView extends View {
    public static final /* synthetic */ int c = 0;
    public boolean Y1;
    public int Z1;
    public final List<d> a2 = new ArrayList();
    public final int b2;
    public final float c2;
    public ValueAnimator d;
    public final Paint d2;
    public final RectF e2;
    public final int f2;
    public float g2;
    public boolean h2;
    public c i2;
    public double j2;
    public int k2;
    public boolean q;
    public float x;
    public float y;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ClockHandView clockHandView = ClockHandView.this;
            int i = ClockHandView.c;
            clockHandView.c(floatValue, true);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b(ClockHandView clockHandView) {
        }

        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface c {
    }

    public interface d {
        void b(float f, boolean z);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ClockHandView(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            int r0 = com.google.android.material.R.attr.materialClockStyle
            r4.<init>(r5, r6, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.a2 = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r4.d2 = r1
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r4.e2 = r2
            int[] r2 = com.google.android.material.R.styleable.ClockHandView
            int r3 = com.google.android.material.R.style.Widget_MaterialComponents_TimePicker_Clock
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r2, r0, r3)
            int r0 = com.google.android.material.R.styleable.ClockHandView_materialCircleRadius
            r2 = 0
            int r0 = r6.getDimensionPixelSize(r0, r2)
            r4.k2 = r0
            int r0 = com.google.android.material.R.styleable.ClockHandView_selectorSize
            int r0 = r6.getDimensionPixelSize(r0, r2)
            r4.b2 = r0
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.google.android.material.R.dimen.material_clock_hand_stroke_width
            int r3 = r0.getDimensionPixelSize(r3)
            r4.f2 = r3
            int r3 = com.google.android.material.R.dimen.material_clock_hand_center_dot_radius
            int r0 = r0.getDimensionPixelSize(r3)
            float r0 = (float) r0
            r4.c2 = r0
            int r0 = com.google.android.material.R.styleable.ClockHandView_clockHandColor
            int r0 = r6.getColor(r0, r2)
            r3 = 1
            r1.setAntiAlias(r3)
            r1.setColor(r0)
            r0 = 0
            r4.b(r0, r2)
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            int r5 = r5.getScaledTouchSlop()
            r4.Z1 = r5
            r5 = 2
            java.util.concurrent.atomic.AtomicInteger r0 = h0.i.i.q.a
            r4.setImportantForAccessibility(r5)
            r6.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockHandView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(float f, float f3) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f3 - ((float) (getHeight() / 2))), (double) (f - ((float) (getWidth() / 2)))))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    public void b(float f, boolean z) {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            c(f, false);
            return;
        }
        float f3 = this.g2;
        if (Math.abs(f3 - f) > 180.0f) {
            if (f3 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f3 < 180.0f && f > 180.0f) {
                f3 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f3), Float.valueOf(f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((Float) pair.first).floatValue(), ((Float) pair.second).floatValue()});
        this.d = ofFloat;
        ofFloat.setDuration(200);
        this.d.addUpdateListener(new a());
        this.d.addListener(new b(this));
        this.d.start();
    }

    public final void c(float f, boolean z) {
        float f3 = f % 360.0f;
        this.g2 = f3;
        this.j2 = Math.toRadians((double) (f3 - 90.0f));
        float cos = (((float) this.k2) * ((float) Math.cos(this.j2))) + ((float) (getWidth() / 2));
        float sin = (((float) this.k2) * ((float) Math.sin(this.j2))) + ((float) (getHeight() / 2));
        RectF rectF = this.e2;
        int i = this.b2;
        rectF.set(cos - ((float) i), sin - ((float) i), cos + ((float) i), sin + ((float) i));
        for (d b3 : this.a2) {
            b3.b(f3, z);
        }
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = (float) width;
        float f3 = (float) height;
        this.d2.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) this.k2) * ((float) Math.cos(this.j2))) + f, (((float) this.k2) * ((float) Math.sin(this.j2))) + f3, (float) this.b2, this.d2);
        double sin = Math.sin(this.j2);
        double cos = Math.cos(this.j2);
        double d3 = (double) ((float) (this.k2 - this.b2));
        float f4 = (float) (width + ((int) (cos * d3)));
        float f5 = (float) (height + ((int) (d3 * sin)));
        this.d2.setStrokeWidth((float) this.f2);
        canvas.drawLine(f, f3, f4, f5, this.d2);
        canvas.drawCircle(f, f3, this.c2, this.d2);
    }

    public void onLayout(boolean z, int i, int i3, int i4, int i5) {
        super.onLayout(z, i, i3, i4, i5);
        b(this.g2, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b2  */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r0 = r10.getActionMasked()
            float r1 = r10.getX()
            float r10 = r10.getY()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0038
            if (r0 == r3) goto L_0x0019
            r4 = 2
            if (r0 == r4) goto L_0x0019
            r0 = r2
            r4 = r0
            r5 = r4
            goto L_0x0043
        L_0x0019:
            float r4 = r9.x
            float r4 = r1 - r4
            int r4 = (int) r4
            float r5 = r9.y
            float r5 = r10 - r5
            int r5 = (int) r5
            int r4 = r4 * r4
            int r5 = r5 * r5
            int r5 = r5 + r4
            int r4 = r9.Z1
            if (r5 <= r4) goto L_0x002c
            r4 = r3
            goto L_0x002d
        L_0x002c:
            r4 = r2
        L_0x002d:
            r9.Y1 = r4
            boolean r4 = r9.h2
            if (r0 != r3) goto L_0x0035
            r0 = r3
            goto L_0x0036
        L_0x0035:
            r0 = r2
        L_0x0036:
            r5 = r2
            goto L_0x0043
        L_0x0038:
            r9.x = r1
            r9.y = r10
            r9.Y1 = r3
            r9.h2 = r2
            r0 = r2
            r4 = r0
            r5 = r3
        L_0x0043:
            boolean r6 = r9.h2
            int r7 = r9.a(r1, r10)
            float r8 = r9.g2
            float r7 = (float) r7
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x0052
            r8 = r3
            goto L_0x0053
        L_0x0052:
            r8 = r2
        L_0x0053:
            if (r5 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0059
        L_0x0057:
            r4 = r3
            goto L_0x006d
        L_0x0059:
            if (r8 != 0) goto L_0x0060
            if (r4 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r4 = r2
            goto L_0x006d
        L_0x0060:
            if (r0 == 0) goto L_0x0068
            boolean r4 = r9.q
            if (r4 == 0) goto L_0x0068
            r4 = r3
            goto L_0x0069
        L_0x0068:
            r4 = r2
        L_0x0069:
            r9.b(r7, r4)
            goto L_0x0057
        L_0x006d:
            r4 = r4 | r6
            r9.h2 = r4
            if (r4 == 0) goto L_0x00ee
            if (r0 == 0) goto L_0x00ee
            com.google.android.material.timepicker.ClockHandView$c r0 = r9.i2
            if (r0 == 0) goto L_0x00ee
            int r10 = r9.a(r1, r10)
            float r10 = (float) r10
            boolean r1 = r9.Y1
            i0.h.a.c.b0.f r0 = (i0.h.a.c.b0.f) r0
            r0.a2 = r3
            com.google.android.material.timepicker.TimeModel r4 = r0.y
            int r5 = r4.y
            int r6 = r4.x
            int r4 = r4.Y1
            r7 = 10
            if (r4 != r7) goto L_0x00b2
            com.google.android.material.timepicker.TimePickerView r10 = r0.x
            float r1 = r0.Z1
            com.google.android.material.timepicker.ClockHandView r10 = r10.p2
            r10.b(r1, r2)
            com.google.android.material.timepicker.TimePickerView r10 = r0.x
            android.content.Context r10 = r10.getContext()
            java.lang.Class<android.view.accessibility.AccessibilityManager> r1 = android.view.accessibility.AccessibilityManager.class
            java.lang.Object r10 = h0.i.b.a.getSystemService(r10, r1)
            android.view.accessibility.AccessibilityManager r10 = (android.view.accessibility.AccessibilityManager) r10
            boolean r10 = r10.isTouchExplorationEnabled()
            if (r10 != 0) goto L_0x00d9
            r10 = 12
            r0.f(r10, r3)
            goto L_0x00d9
        L_0x00b2:
            int r10 = java.lang.Math.round(r10)
            if (r1 != 0) goto L_0x00d0
            int r10 = r10 + 15
            int r10 = r10 / 30
            com.google.android.material.timepicker.TimeModel r4 = r0.y
            int r10 = r10 * 5
            java.util.Objects.requireNonNull(r4)
            int r10 = r10 % 60
            r4.y = r10
            com.google.android.material.timepicker.TimeModel r10 = r0.y
            int r10 = r10.y
            int r10 = r10 * 6
            float r10 = (float) r10
            r0.Y1 = r10
        L_0x00d0:
            com.google.android.material.timepicker.TimePickerView r10 = r0.x
            float r4 = r0.Y1
            com.google.android.material.timepicker.ClockHandView r10 = r10.p2
            r10.b(r4, r1)
        L_0x00d9:
            r0.a2 = r2
            r0.g()
            com.google.android.material.timepicker.TimeModel r10 = r0.y
            int r1 = r10.y
            if (r1 != r5) goto L_0x00e8
            int r10 = r10.x
            if (r10 == r6) goto L_0x00ee
        L_0x00e8:
            r10 = 4
            com.google.android.material.timepicker.TimePickerView r0 = r0.x
            r0.performHapticFeedback(r10)
        L_0x00ee:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockHandView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
