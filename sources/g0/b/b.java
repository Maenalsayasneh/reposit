package g0.b;

import android.view.View;
import com.airbnb.paris.R;
import i0.b.c.d;
import i0.b.c.f.e;
import i0.b.c.h.c;

/* compiled from: ViewStyleApplier */
public final class b extends i0.b.c.b<e, View> {

    /* compiled from: ViewStyleApplier */
    public static abstract class a<B extends a<B, A>, A extends i0.b.c.b<?, ?>> extends d<B, A> {
        public a() {
            super((i0.b.c.b) null, (String) null, 3);
        }
    }

    public b(View view) {
        super(new e(view));
    }

    public int[] c() {
        return R.styleable.Paris_View;
    }

    /* JADX WARNING: Removed duplicated region for block: B:158:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x04ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(i0.b.c.g.e r9, i0.b.c.h.c r10) {
        /*
            r8 = this;
            V r9 = r8.c
            android.content.Context r9 = r9.getContext()
            r9.getResources()
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_layout_width
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x001f
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.i(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.d = r9
        L_0x001f:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_layout_height
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x0035
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.i(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.e = r9
        L_0x0035:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_layout_gravity
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x0065
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.h(r9)
            V r1 = r0.a
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x0065
            boolean r2 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r2 == 0) goto L_0x0057
            r2 = r1
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            r2.gravity = r9
            goto L_0x0060
        L_0x0057:
            boolean r2 = r1 instanceof android.widget.LinearLayout.LayoutParams
            if (r2 == 0) goto L_0x0060
            r2 = r1
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r2.gravity = r9
        L_0x0060:
            V r9 = r0.a
            r9.setLayoutParams(r1)
        L_0x0065:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_layout_weight
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x008b
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            float r9 = r10.e(r9)
            V r1 = r0.a
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x008b
            boolean r2 = r1 instanceof android.widget.LinearLayout.LayoutParams
            if (r2 == 0) goto L_0x008b
            r2 = r1
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r2.weight = r9
            V r9 = r0.a
            r9.setLayoutParams(r1)
        L_0x008b:
            int r9 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r9 < r0) goto L_0x00a7
            int r1 = com.airbnb.paris.R.styleable.Paris_View_android_layout_marginHorizontal
            boolean r2 = r10.l(r1)
            if (r2 == 0) goto L_0x00a7
            P r2 = r8.b
            i0.b.c.f.e r2 = (i0.b.c.f.e) r2
            int r1 = r10.c(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.m = r1
        L_0x00a7:
            if (r9 < r0) goto L_0x00bf
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_layout_marginVertical
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x00bf
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.c(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.n = r9
        L_0x00bf:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_layout_marginBottom
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x00d5
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.c(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.g = r9
        L_0x00d5:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_layout_marginLeft
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x00eb
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.c(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.i = r9
        L_0x00eb:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_layout_marginRight
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x0101
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.c(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.j = r9
        L_0x0101:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_layout_marginTop
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x0117
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.c(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.l = r9
        L_0x0117:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_layout_marginEnd
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x012d
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.c(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.h = r9
        L_0x012d:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_layout_marginStart
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x0143
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.c(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.k = r9
        L_0x0143:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_layout_margin
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x0159
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.c(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.f = r9
        L_0x0159:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_alpha
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x016e
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            float r9 = r10.e(r9)
            V r0 = r0.a
            r0.setAlpha(r9)
        L_0x016e:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_background
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x0183
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            android.graphics.drawable.Drawable r9 = r10.d(r9)
            V r0 = r0.a
            r0.setBackground(r9)
        L_0x0183:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_backgroundTint
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x019a
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            android.content.res.ColorStateList r9 = r10.b(r9)
            V r0 = r0.a
            java.util.concurrent.atomic.AtomicInteger r1 = h0.i.i.q.a
            r0.setBackgroundTintList(r9)
        L_0x019a:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_backgroundTintMode
            boolean r0 = r10.l(r9)
            r1 = 9
            r2 = 5
            r3 = 3
            r4 = 0
            if (r0 == 0) goto L_0x01d2
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.h(r9)
            V r0 = r0.a
            if (r9 == r3) goto L_0x01cb
            if (r9 == r2) goto L_0x01c8
            if (r9 == r1) goto L_0x01c5
            switch(r9) {
                case 14: goto L_0x01c2;
                case 15: goto L_0x01bf;
                case 16: goto L_0x01bc;
                default: goto L_0x01ba;
            }
        L_0x01ba:
            r9 = r4
            goto L_0x01cd
        L_0x01bc:
            android.graphics.PorterDuff$Mode r9 = android.graphics.PorterDuff.Mode.ADD
            goto L_0x01cd
        L_0x01bf:
            android.graphics.PorterDuff$Mode r9 = android.graphics.PorterDuff.Mode.SCREEN
            goto L_0x01cd
        L_0x01c2:
            android.graphics.PorterDuff$Mode r9 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x01cd
        L_0x01c5:
            android.graphics.PorterDuff$Mode r9 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L_0x01cd
        L_0x01c8:
            android.graphics.PorterDuff$Mode r9 = android.graphics.PorterDuff.Mode.SRC_IN
            goto L_0x01cd
        L_0x01cb:
            android.graphics.PorterDuff$Mode r9 = android.graphics.PorterDuff.Mode.SRC_OVER
        L_0x01cd:
            java.util.concurrent.atomic.AtomicInteger r5 = h0.i.i.q.a
            r0.setBackgroundTintMode(r9)
        L_0x01d2:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_clickable
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x01e7
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            boolean r9 = r10.a(r9)
            V r0 = r0.a
            r0.setClickable(r9)
        L_0x01e7:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_contentDescription
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x01fc
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            java.lang.CharSequence r9 = r10.k(r9)
            V r0 = r0.a
            r0.setContentDescription(r9)
        L_0x01fc:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_elevation
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x0212
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.c(r9)
            V r0 = r0.a
            float r9 = (float) r9
            r0.setElevation(r9)
        L_0x0212:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_focusable
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x0227
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            boolean r9 = r10.a(r9)
            V r0 = r0.a
            r0.setFocusable(r9)
        L_0x0227:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_foreground
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x023c
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            android.graphics.drawable.Drawable r9 = r10.d(r9)
            V r0 = r0.a
            r0.setForeground(r9)
        L_0x023c:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_minHeight
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x0251
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.c(r9)
            V r0 = r0.a
            r0.setMinimumHeight(r9)
        L_0x0251:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_minWidth
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x0266
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.c(r9)
            V r0 = r0.a
            r0.setMinimumWidth(r9)
        L_0x0266:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_paddingBottom
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x027b
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.c(r9)
            V r0 = r0.a
            h0.b0.v.W1(r0, r9)
        L_0x027b:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_paddingLeft
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x02a1
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.c(r9)
            V r0 = r0.a
            java.lang.String r5 = "$this$setPaddingLeft"
            m0.n.b.i.e(r0, r5)
            int r5 = r0.getPaddingTop()
            int r6 = r0.getPaddingRight()
            int r7 = r0.getPaddingBottom()
            r0.setPadding(r9, r5, r6, r7)
        L_0x02a1:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_paddingRight
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x02c7
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.c(r9)
            V r0 = r0.a
            java.lang.String r5 = "$this$setPaddingRight"
            m0.n.b.i.e(r0, r5)
            int r5 = r0.getPaddingLeft()
            int r6 = r0.getPaddingTop()
            int r7 = r0.getPaddingBottom()
            r0.setPadding(r5, r6, r9, r7)
        L_0x02c7:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_paddingTop
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x02ed
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.c(r9)
            V r0 = r0.a
            java.lang.String r5 = "$this$setPaddingTop"
            m0.n.b.i.e(r0, r5)
            int r5 = r0.getPaddingLeft()
            int r6 = r0.getPaddingRight()
            int r7 = r0.getPaddingBottom()
            r0.setPadding(r5, r9, r6, r7)
        L_0x02ed:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_paddingHorizontal
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x030f
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.c(r9)
            V r0 = r0.a
            java.lang.String r5 = "$this$setPaddingHorizontal"
            m0.n.b.i.e(r0, r5)
            int r5 = r0.getPaddingTop()
            int r6 = r0.getPaddingBottom()
            r0.setPadding(r9, r5, r9, r6)
        L_0x030f:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_paddingVertical
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x0331
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.c(r9)
            V r0 = r0.a
            java.lang.String r5 = "$this$setPaddingVertical"
            m0.n.b.i.e(r0, r5)
            int r5 = r0.getPaddingLeft()
            int r6 = r0.getPaddingRight()
            r0.setPadding(r5, r9, r6, r9)
        L_0x0331:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_padding
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x0346
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.c(r9)
            V r0 = r0.a
            r0.setPadding(r9, r9, r9, r9)
        L_0x0346:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_paddingEnd
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x036c
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.c(r9)
            V r0 = r0.a
            java.lang.String r5 = "$this$setPaddingEnd"
            m0.n.b.i.e(r0, r5)
            int r5 = r0.getPaddingStart()
            int r6 = r0.getPaddingTop()
            int r7 = r0.getPaddingBottom()
            r0.setPaddingRelative(r5, r6, r9, r7)
        L_0x036c:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_paddingStart
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x0392
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.c(r9)
            V r0 = r0.a
            java.lang.String r5 = "$this$setPaddingStart"
            m0.n.b.i.e(r0, r5)
            int r5 = r0.getPaddingTop()
            int r6 = r0.getPaddingEnd()
            int r7 = r0.getPaddingBottom()
            r0.setPaddingRelative(r9, r5, r6, r7)
        L_0x0392:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_stateListAnimator
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x03b5
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.j(r9)
            if (r9 == 0) goto L_0x03af
            V r5 = r0.a
            android.content.Context r5 = r5.getContext()
            android.animation.StateListAnimator r9 = android.animation.AnimatorInflater.loadStateListAnimator(r5, r9)
            goto L_0x03b0
        L_0x03af:
            r9 = r4
        L_0x03b0:
            V r0 = r0.a
            r0.setStateListAnimator(r9)
        L_0x03b5:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_visibility
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x03d0
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.h(r9)
            V r0 = r0.a
            android.util.SparseIntArray r5 = i0.b.c.f.e.b
            int r9 = r5.get(r9)
            r0.setVisibility(r9)
        L_0x03d0:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_ignoreLayoutWidthAndHeight
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x03e2
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            boolean r9 = r10.a(r9)
            r0.c = r9
        L_0x03e2:
            int r9 = com.airbnb.paris.R.styleable.Paris_View_android_importantForAccessibility
            boolean r0 = r10.l(r9)
            if (r0 == 0) goto L_0x03f7
            P r0 = r8.b
            i0.b.c.f.e r0 = (i0.b.c.f.e) r0
            int r9 = r10.h(r9)
            V r10 = r0.a
            r10.setImportantForAccessibility(r9)
        L_0x03f7:
            P r9 = r8.b
            i0.b.c.f.e r9 = (i0.b.c.f.e) r9
            java.lang.Integer[] r10 = new java.lang.Integer[r1]
            java.lang.Integer r0 = r9.f
            r1 = 0
            r10[r1] = r0
            java.lang.Integer r0 = r9.g
            r5 = 1
            r10[r5] = r0
            java.lang.Integer r0 = r9.h
            r6 = 2
            r10[r6] = r0
            java.lang.Integer r0 = r9.i
            r10[r3] = r0
            java.lang.Integer r0 = r9.j
            r3 = 4
            r10[r3] = r0
            java.lang.Integer r0 = r9.k
            r10[r2] = r0
            java.lang.Integer r0 = r9.l
            r2 = 6
            r10[r2] = r0
            java.lang.Integer r0 = r9.m
            r2 = 7
            r10[r2] = r0
            java.lang.Integer r0 = r9.n
            r2 = 8
            r10[r2] = r0
            java.util.List r10 = m0.j.g.K(r10)
            boolean r0 = r10 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0438
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0438
            goto L_0x0451
        L_0x0438:
            java.util.Iterator r10 = r10.iterator()
        L_0x043c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0451
            java.lang.Object r0 = r10.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x044c
            r0 = r5
            goto L_0x044d
        L_0x044c:
            r0 = r1
        L_0x044d:
            if (r0 == 0) goto L_0x043c
            r10 = r5
            goto L_0x0452
        L_0x0451:
            r10 = r1
        L_0x0452:
            boolean r0 = r9.c
            if (r0 != 0) goto L_0x04aa
            java.lang.Integer r0 = r9.d
            if (r0 == 0) goto L_0x045c
            r2 = r5
            goto L_0x045d
        L_0x045c:
            r2 = r1
        L_0x045d:
            java.lang.Integer r3 = r9.e
            if (r3 == 0) goto L_0x0462
            goto L_0x0463
        L_0x0462:
            r5 = r1
        L_0x0463:
            r2 = r2 ^ r5
            if (r2 != 0) goto L_0x04a2
            if (r0 == 0) goto L_0x04aa
            if (r3 == 0) goto L_0x04aa
            V r2 = r9.a
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 != 0) goto L_0x0490
            if (r10 == 0) goto L_0x0482
            android.view.ViewGroup$MarginLayoutParams r2 = new android.view.ViewGroup$MarginLayoutParams
            int r0 = r0.intValue()
            int r3 = r3.intValue()
            r2.<init>(r0, r3)
            goto L_0x049c
        L_0x0482:
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            int r0 = r0.intValue()
            int r3 = r3.intValue()
            r2.<init>(r0, r3)
            goto L_0x049c
        L_0x0490:
            int r0 = r0.intValue()
            r2.width = r0
            int r0 = r3.intValue()
            r2.height = r0
        L_0x049c:
            V r0 = r9.a
            r0.setLayoutParams(r2)
            goto L_0x04aa
        L_0x04a2:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Width and height must either both be set, or not be set at all. It can't be one and not the other."
            r9.<init>(r10)
            throw r9
        L_0x04aa:
            if (r10 == 0) goto L_0x0540
            V r10 = r9.a
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            if (r10 == 0) goto L_0x04c2
            V r10 = r9.a
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            java.util.Objects.requireNonNull(r10, r0)
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            goto L_0x04d1
        L_0x04c2:
            android.view.ViewGroup$MarginLayoutParams r10 = new android.view.ViewGroup$MarginLayoutParams
            r0 = -2
            r10.<init>(r0, r0)
            V r0 = r9.a
            int r0 = r0.getLayoutDirection()
            r10.setLayoutDirection(r0)
        L_0x04d1:
            java.lang.Integer r0 = r9.f
            if (r0 == 0) goto L_0x04e9
            int r2 = r0.intValue()
            int r3 = r0.intValue()
            int r5 = r0.intValue()
            int r0 = r0.intValue()
            r10.setMargins(r2, r3, r5, r0)
            goto L_0x053b
        L_0x04e9:
            java.lang.Integer r0 = r9.m
            if (r0 == 0) goto L_0x04ee
            goto L_0x04f0
        L_0x04ee:
            java.lang.Integer r0 = r9.i
        L_0x04f0:
            if (r0 == 0) goto L_0x04f8
            int r0 = r0.intValue()
            r10.leftMargin = r0
        L_0x04f8:
            java.lang.Integer r0 = r9.m
            if (r0 == 0) goto L_0x04fd
            goto L_0x04ff
        L_0x04fd:
            java.lang.Integer r0 = r9.j
        L_0x04ff:
            if (r0 == 0) goto L_0x0507
            int r0 = r0.intValue()
            r10.rightMargin = r0
        L_0x0507:
            java.lang.Integer r0 = r9.n
            if (r0 == 0) goto L_0x050c
            goto L_0x050e
        L_0x050c:
            java.lang.Integer r0 = r9.g
        L_0x050e:
            if (r0 == 0) goto L_0x0516
            int r0 = r0.intValue()
            r10.bottomMargin = r0
        L_0x0516:
            java.lang.Integer r0 = r9.n
            if (r0 == 0) goto L_0x051b
            goto L_0x051d
        L_0x051b:
            java.lang.Integer r0 = r9.l
        L_0x051d:
            if (r0 == 0) goto L_0x0525
            int r0 = r0.intValue()
            r10.topMargin = r0
        L_0x0525:
            java.lang.Integer r0 = r9.h
            if (r0 == 0) goto L_0x0530
            int r0 = r0.intValue()
            r10.setMarginEnd(r0)
        L_0x0530:
            java.lang.Integer r0 = r9.k
            if (r0 == 0) goto L_0x053b
            int r0 = r0.intValue()
            r10.setMarginStart(r0)
        L_0x053b:
            V r0 = r9.a
            r0.setLayoutParams(r10)
        L_0x0540:
            r9.c = r1
            r9.d = r4
            r9.e = r4
            r9.f = r4
            r9.g = r4
            r9.h = r4
            r9.i = r4
            r9.j = r4
            r9.k = r4
            r9.l = r4
            r9.m = r4
            r9.n = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.b.b.d(i0.b.c.g.e, i0.b.c.h.c):void");
    }

    public void e(i0.b.c.g.e eVar, c cVar) {
        this.c.getContext().getResources();
    }
}
