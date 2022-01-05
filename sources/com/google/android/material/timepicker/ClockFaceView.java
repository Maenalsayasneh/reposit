package com.google.android.material.timepicker;

import android.content.res.ColorStateList;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.R;
import com.google.android.material.timepicker.ClockHandView;
import h0.i.i.a;
import h0.i.i.g0.b;
import h0.i.i.q;
import i0.h.a.c.b0.e;

public class ClockFaceView extends e implements ClockHandView.d {
    public final ColorStateList A2;
    public final ClockHandView q2;
    public final Rect r2 = new Rect();
    public final RectF s2 = new RectF();
    public final SparseArray<TextView> t2 = new SparseArray<>();
    public final a u2;
    public final int[] v2;
    public final float[] w2 = {0.0f, 0.9f, 1.0f};
    public final int x2;
    public String[] y2;
    public float z2;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ClockFaceView(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r0 = com.google.android.material.R.attr.materialClockStyle
            r7.<init>(r8, r9, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r7.r2 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r7.s2 = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r7.t2 = r1
            r1 = 3
            float[] r2 = new float[r1]
            r2 = {0, 1063675494, 1065353216} // fill-array
            r7.w2 = r2
            int[] r2 = com.google.android.material.R.styleable.ClockFaceView
            int r3 = com.google.android.material.R.style.Widget_MaterialComponents_TimePicker_Clock
            android.content.res.TypedArray r9 = r8.obtainStyledAttributes(r9, r2, r0, r3)
            android.content.res.Resources r0 = r7.getResources()
            int r2 = com.google.android.material.R.styleable.ClockFaceView_clockNumberTextColor
            android.content.res.ColorStateList r2 = i0.h.a.b.c.m.b.M(r8, r9, r2)
            r7.A2 = r2
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r8)
            int r4 = com.google.android.material.R.layout.material_clockface_view
            r5 = 1
            r3.inflate(r4, r7, r5)
            int r3 = com.google.android.material.R.id.material_clock_hand
            android.view.View r3 = r7.findViewById(r3)
            com.google.android.material.timepicker.ClockHandView r3 = (com.google.android.material.timepicker.ClockHandView) r3
            r7.q2 = r3
            int r4 = com.google.android.material.R.dimen.material_clock_hand_padding
            int r0 = r0.getDimensionPixelSize(r4)
            r7.x2 = r0
            int[] r0 = new int[r5]
            r4 = 16842913(0x10100a1, float:2.369401E-38)
            r6 = 0
            r0[r6] = r4
            int r4 = r2.getDefaultColor()
            int r0 = r2.getColorForState(r0, r4)
            int[] r1 = new int[r1]
            r1[r6] = r0
            r1[r5] = r0
            int r0 = r2.getDefaultColor()
            r2 = 2
            r1[r2] = r0
            r7.v2 = r1
            java.util.List<com.google.android.material.timepicker.ClockHandView$d> r0 = r3.a2
            r0.add(r7)
            int r0 = com.google.android.material.R.color.material_timepicker_clockface
            java.lang.ThreadLocal<android.util.TypedValue> r1 = h0.b.b.a.a.a
            android.content.res.ColorStateList r0 = r8.getColorStateList(r0)
            int r0 = r0.getDefaultColor()
            int r1 = com.google.android.material.R.styleable.ClockFaceView_clockFaceBackgroundColor
            android.content.res.ColorStateList r8 = i0.h.a.b.c.m.b.M(r8, r9, r1)
            if (r8 != 0) goto L_0x008b
            goto L_0x008f
        L_0x008b:
            int r0 = r8.getDefaultColor()
        L_0x008f:
            r7.setBackgroundColor(r0)
            android.view.ViewTreeObserver r8 = r7.getViewTreeObserver()
            i0.h.a.c.b0.b r0 = new i0.h.a.c.b0.b
            r0.<init>(r7)
            r8.addOnPreDrawListener(r0)
            r7.setFocusable(r5)
            r9.recycle()
            i0.h.a.c.b0.c r8 = new i0.h.a.c.b0.c
            r8.<init>(r7)
            r7.u2 = r8
            r8 = 12
            java.lang.String[] r8 = new java.lang.String[r8]
            java.lang.String r9 = ""
            java.util.Arrays.fill(r8, r9)
            r7.v(r8, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockFaceView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void b(float f, boolean z) {
        if (Math.abs(this.z2 - f) > 0.001f) {
            this.z2 = f;
            u();
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.C0048b.a(1, this.y2.length, false, 1).a);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        u();
    }

    public final void u() {
        RadialGradient radialGradient;
        RectF rectF = this.q2.e2;
        for (int i = 0; i < this.t2.size(); i++) {
            TextView textView = this.t2.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.r2);
                this.r2.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.r2);
                this.s2.set(this.r2);
                if (!RectF.intersects(rectF, this.s2)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF.centerX() - this.s2.left, rectF.centerY() - this.s2.top, 0.5f * rectF.width(), this.v2, this.w2, Shader.TileMode.CLAMP);
                }
                textView.getPaint().setShader(radialGradient);
                textView.invalidate();
            }
        }
    }

    public void v(String[] strArr, int i) {
        this.y2 = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.t2.size();
        for (int i2 = 0; i2 < Math.max(this.y2.length, size); i2++) {
            TextView textView = this.t2.get(i2);
            if (i2 >= this.y2.length) {
                removeView(textView);
                this.t2.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, this, false);
                    this.t2.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.y2[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                q.p(textView, this.u2);
                textView.setTextColor(this.A2);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, new Object[]{this.y2[i2]}));
                }
            }
        }
    }
}
