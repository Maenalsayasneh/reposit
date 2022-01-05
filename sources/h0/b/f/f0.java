package h0.b.f;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.appcompat.R;
import h0.i.i.q;

/* compiled from: LinearLayoutCompat */
public class f0 extends ViewGroup {
    public int Y1;
    public float Z1;
    public boolean a2;
    public int[] b2;
    public boolean c;
    public int[] c2;
    public int d;
    public Drawable d2;
    public int e2;
    public int f2;
    public int g2;
    public int h2;
    public int q;
    public int x;
    public int y;

    /* compiled from: LinearLayoutCompat */
    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i, int i2) {
            super(i, i2);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public f0(Context context) {
        this(context, (AttributeSet) null);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void f(Canvas canvas, int i) {
        this.d2.setBounds(getPaddingLeft() + this.h2, i, (getWidth() - getPaddingRight()) - this.h2, this.f2 + i);
        this.d2.draw(canvas);
    }

    public void g(Canvas canvas, int i) {
        this.d2.setBounds(i, getPaddingTop() + this.h2, this.e2 + i, (getHeight() - getPaddingBottom()) - this.h2);
        this.d2.draw(canvas);
    }

    public int getBaseline() {
        int i;
        if (this.d < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.d;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.q;
                if (this.x == 1 && (i = this.y & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.Y1) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.Y1;
                    }
                }
                return i3 + ((a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.d == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.d;
    }

    public Drawable getDividerDrawable() {
        return this.d2;
    }

    public int getDividerPadding() {
        return this.h2;
    }

    public int getDividerWidth() {
        return this.e2;
    }

    public int getGravity() {
        return this.y;
    }

    public int getOrientation() {
        return this.x;
    }

    public int getShowDividers() {
        return this.g2;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.Z1;
    }

    /* renamed from: h */
    public a generateDefaultLayoutParams() {
        int i = this.x;
        if (i == 0) {
            return new a(-2, -2);
        }
        if (i == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    /* renamed from: i */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* renamed from: j */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int k() {
        return 0;
    }

    public int l() {
        return 0;
    }

    public int m() {
        return 0;
    }

    public boolean n(int i) {
        if (i == 0) {
            return (this.g2 & 1) != 0;
        }
        if (i == getChildCount()) {
            if ((this.g2 & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.g2 & 2) == 0) {
            return false;
        } else {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    public void o(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.d2 != null) {
            int i6 = 0;
            if (this.x == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i6 < virtualChildCount) {
                    View childAt = getChildAt(i6);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !n(i6))) {
                        f(canvas, (childAt.getTop() - ((a) childAt.getLayoutParams()).topMargin) - this.f2);
                    }
                    i6++;
                }
                if (n(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        i5 = (getHeight() - getPaddingBottom()) - this.f2;
                    } else {
                        i5 = childAt2.getBottom() + ((a) childAt2.getLayoutParams()).bottomMargin;
                    }
                    f(canvas, i5);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean b = c1.b(this);
            while (i6 < virtualChildCount2) {
                View childAt3 = getChildAt(i6);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !n(i6))) {
                    a aVar = (a) childAt3.getLayoutParams();
                    if (b) {
                        i4 = childAt3.getRight() + aVar.rightMargin;
                    } else {
                        i4 = (childAt3.getLeft() - aVar.leftMargin) - this.e2;
                    }
                    g(canvas, i4);
                }
                i6++;
            }
            if (n(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    a aVar2 = (a) childAt4.getLayoutParams();
                    if (b) {
                        i3 = childAt4.getLeft() - aVar2.leftMargin;
                        i2 = this.e2;
                    } else {
                        i = childAt4.getRight() + aVar2.rightMargin;
                        g(canvas, i);
                    }
                } else if (b) {
                    i = getPaddingLeft();
                    g(canvas, i);
                } else {
                    i3 = getWidth() - getPaddingRight();
                    i2 = this.e2;
                }
                i = i3 - i2;
                g(canvas, i);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.x
            r2 = 80
            r3 = 16
            r4 = 8
            r6 = 5
            r7 = 8388615(0x800007, float:1.1754953E-38)
            r8 = 2
            r9 = 1
            if (r1 != r9) goto L_0x00c6
            int r1 = r23.getPaddingLeft()
            int r10 = r27 - r25
            int r11 = r23.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r23.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r23.getVirtualChildCount()
            int r13 = r0.y
            r14 = r13 & 112(0x70, float:1.57E-43)
            r7 = r7 & r13
            if (r14 == r3) goto L_0x0042
            if (r14 == r2) goto L_0x0036
            int r2 = r23.getPaddingTop()
            goto L_0x004d
        L_0x0036:
            int r2 = r23.getPaddingTop()
            int r2 = r2 + r28
            int r2 = r2 - r26
            int r3 = r0.Y1
            int r2 = r2 - r3
            goto L_0x004d
        L_0x0042:
            int r2 = r23.getPaddingTop()
            int r3 = r28 - r26
            int r13 = r0.Y1
            int r3 = r3 - r13
            int r3 = r3 / r8
            int r2 = r2 + r3
        L_0x004d:
            r5 = 0
        L_0x004e:
            if (r5 >= r12) goto L_0x01ed
            android.view.View r3 = r0.getChildAt(r5)
            if (r3 != 0) goto L_0x005c
            int r3 = r23.p()
            int r3 = r3 + r2
            goto L_0x00bf
        L_0x005c:
            int r13 = r3.getVisibility()
            if (r13 == r4) goto L_0x00c0
            int r13 = r3.getMeasuredWidth()
            int r14 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r15 = r3.getLayoutParams()
            h0.b.f.f0$a r15 = (h0.b.f.f0.a) r15
            int r4 = r15.gravity
            if (r4 >= 0) goto L_0x0075
            r4 = r7
        L_0x0075:
            java.util.concurrent.atomic.AtomicInteger r16 = h0.i.i.q.a
            int r8 = r23.getLayoutDirection()
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r8)
            r4 = r4 & 7
            if (r4 == r9) goto L_0x008e
            if (r4 == r6) goto L_0x0089
            int r4 = r15.leftMargin
            int r4 = r4 + r1
            goto L_0x0099
        L_0x0089:
            int r4 = r11 - r13
            int r8 = r15.rightMargin
            goto L_0x0098
        L_0x008e:
            int r4 = r10 - r13
            r8 = 2
            int r4 = r4 / r8
            int r4 = r4 + r1
            int r8 = r15.leftMargin
            int r4 = r4 + r8
            int r8 = r15.rightMargin
        L_0x0098:
            int r4 = r4 - r8
        L_0x0099:
            boolean r8 = r0.n(r5)
            if (r8 == 0) goto L_0x00a2
            int r8 = r0.f2
            int r2 = r2 + r8
        L_0x00a2:
            int r8 = r15.topMargin
            int r2 = r2 + r8
            int r8 = r23.l()
            int r8 = r8 + r2
            int r13 = r13 + r4
            int r6 = r14 + r8
            r3.layout(r4, r8, r13, r6)
            int r3 = r15.bottomMargin
            int r14 = r14 + r3
            int r3 = r23.m()
            int r3 = r3 + r14
            int r3 = r3 + r2
            int r2 = r23.k()
            int r2 = r2 + r5
            r5 = r2
        L_0x00bf:
            r2 = r3
        L_0x00c0:
            int r5 = r5 + r9
            r4 = 8
            r6 = 5
            r8 = 2
            goto L_0x004e
        L_0x00c6:
            boolean r1 = h0.b.f.c1.b(r23)
            int r4 = r23.getPaddingTop()
            int r6 = r28 - r26
            int r8 = r23.getPaddingBottom()
            int r8 = r6 - r8
            int r6 = r6 - r4
            int r10 = r23.getPaddingBottom()
            int r6 = r6 - r10
            int r10 = r23.getVirtualChildCount()
            int r11 = r0.y
            r7 = r7 & r11
            r11 = r11 & 112(0x70, float:1.57E-43)
            boolean r12 = r0.c
            int[] r13 = r0.b2
            int[] r14 = r0.c2
            java.util.concurrent.atomic.AtomicInteger r15 = h0.i.i.q.a
            int r15 = r23.getLayoutDirection()
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r15)
            if (r7 == r9) goto L_0x010b
            r15 = 5
            if (r7 == r15) goto L_0x00ff
            int r7 = r23.getPaddingLeft()
            goto L_0x0117
        L_0x00ff:
            int r7 = r23.getPaddingLeft()
            int r7 = r7 + r27
            int r7 = r7 - r25
            int r15 = r0.Y1
            int r7 = r7 - r15
            goto L_0x0117
        L_0x010b:
            int r7 = r23.getPaddingLeft()
            int r15 = r27 - r25
            int r5 = r0.Y1
            int r15 = r15 - r5
            r5 = 2
            int r15 = r15 / r5
            int r7 = r7 + r15
        L_0x0117:
            if (r1 == 0) goto L_0x0120
            int r1 = r10 + -1
            r16 = r1
            r1 = 0
            r15 = -1
            goto L_0x0124
        L_0x0120:
            r15 = r9
            r1 = 0
            r16 = 0
        L_0x0124:
            if (r1 >= r10) goto L_0x01ed
            int r17 = r15 * r1
            int r9 = r17 + r16
            android.view.View r2 = r0.getChildAt(r9)
            if (r2 != 0) goto L_0x013f
            int r2 = r23.p()
            int r2 = r2 + r7
            r7 = r2
        L_0x0136:
            r26 = r10
            r28 = r11
            r20 = r12
        L_0x013c:
            r2 = 1
            goto L_0x01df
        L_0x013f:
            int r3 = r2.getVisibility()
            r5 = 8
            if (r3 == r5) goto L_0x0136
            int r3 = r2.getMeasuredWidth()
            int r19 = r2.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r20 = r2.getLayoutParams()
            r5 = r20
            h0.b.f.f0$a r5 = (h0.b.f.f0.a) r5
            if (r12 == 0) goto L_0x0167
            r26 = r10
            int r10 = r5.height
            r28 = r11
            r11 = -1
            if (r10 == r11) goto L_0x016b
            int r11 = r2.getBaseline()
            goto L_0x016c
        L_0x0167:
            r26 = r10
            r28 = r11
        L_0x016b:
            r11 = -1
        L_0x016c:
            int r10 = r5.gravity
            if (r10 >= 0) goto L_0x0172
            r10 = r28
        L_0x0172:
            r10 = r10 & 112(0x70, float:1.57E-43)
            r20 = r12
            r12 = 16
            if (r10 == r12) goto L_0x01aa
            r12 = 48
            if (r10 == r12) goto L_0x019b
            r12 = 80
            if (r10 == r12) goto L_0x0185
            r10 = r4
            r12 = -1
            goto L_0x01b6
        L_0x0185:
            int r10 = r8 - r19
            int r12 = r5.bottomMargin
            int r10 = r10 - r12
            r12 = -1
            if (r11 == r12) goto L_0x01b6
            int r21 = r2.getMeasuredHeight()
            int r21 = r21 - r11
            r11 = 2
            r22 = r14[r11]
            int r22 = r22 - r21
            int r10 = r10 - r22
            goto L_0x01b6
        L_0x019b:
            r12 = -1
            int r10 = r5.topMargin
            int r10 = r10 + r4
            if (r11 == r12) goto L_0x01b6
            r18 = 1
            r21 = r13[r18]
            int r21 = r21 - r11
            int r10 = r21 + r10
            goto L_0x01b6
        L_0x01aa:
            r12 = -1
            int r10 = r6 - r19
            r11 = 2
            int r10 = r10 / r11
            int r10 = r10 + r4
            int r11 = r5.topMargin
            int r10 = r10 + r11
            int r11 = r5.bottomMargin
            int r10 = r10 - r11
        L_0x01b6:
            boolean r9 = r0.n(r9)
            if (r9 == 0) goto L_0x01bf
            int r9 = r0.e2
            int r7 = r7 + r9
        L_0x01bf:
            int r9 = r5.leftMargin
            int r7 = r7 + r9
            int r9 = r23.l()
            int r9 = r9 + r7
            int r11 = r3 + r9
            int r12 = r19 + r10
            r2.layout(r9, r10, r11, r12)
            int r2 = r5.rightMargin
            int r3 = r3 + r2
            int r2 = r23.m()
            int r2 = r2 + r3
            int r7 = r7 + r2
            int r2 = r23.k()
            int r2 = r2 + r1
            r1 = r2
            goto L_0x013c
        L_0x01df:
            int r1 = r1 + r2
            r10 = r26
            r11 = r28
            r9 = r2
            r12 = r20
            r2 = 80
            r3 = 16
            goto L_0x0124
        L_0x01ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.f.f0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:142:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04be  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x04f8  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0534  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0550  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0577  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0587  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x059a  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0635  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x06ff  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x071c  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x080d  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0831  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0870  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0879  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x08d2  */
    /* JADX WARNING: Removed duplicated region for block: B:428:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r39, int r40) {
        /*
            r38 = this;
            r6 = r38
            r7 = r39
            r8 = r40
            int r0 = r6.x
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r13 = 0
            r15 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            r4 = 0
            if (r0 != r5) goto L_0x03b3
            r6.Y1 = r4
            int r3 = r38.getVirtualChildCount()
            int r2 = android.view.View.MeasureSpec.getMode(r39)
            int r1 = android.view.View.MeasureSpec.getMode(r40)
            int r0 = r6.d
            boolean r9 = r6.a2
            r14 = r4
            r17 = r14
            r18 = r17
            r19 = r18
            r20 = r19
            r22 = r20
            r23 = r22
            r25 = r23
            r24 = r5
            r21 = r13
        L_0x0039:
            if (r14 >= r3) goto L_0x018b
            android.view.View r26 = r6.getChildAt(r14)
            if (r26 != 0) goto L_0x004c
            int r4 = r6.Y1
            int r26 = r38.p()
            int r4 = r26 + r4
            r6.Y1 = r4
            goto L_0x0057
        L_0x004c:
            int r4 = r26.getVisibility()
            if (r4 != r12) goto L_0x0063
            int r4 = r38.k()
            int r14 = r14 + r4
        L_0x0057:
            r10 = r0
            r29 = r1
            r0 = r2
            r31 = r3
            r27 = r5
            r4 = r20
            goto L_0x0174
        L_0x0063:
            boolean r4 = r6.n(r14)
            if (r4 == 0) goto L_0x0070
            int r4 = r6.Y1
            int r5 = r6.f2
            int r4 = r4 + r5
            r6.Y1 = r4
        L_0x0070:
            android.view.ViewGroup$LayoutParams r4 = r26.getLayoutParams()
            r5 = r4
            h0.b.f.f0$a r5 = (h0.b.f.f0.a) r5
            float r4 = r5.weight
            float r21 = r21 + r4
            if (r1 != r15) goto L_0x009f
            int r12 = r5.height
            if (r12 != 0) goto L_0x009f
            int r12 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x009f
            int r4 = r6.Y1
            int r12 = r5.topMargin
            int r12 = r12 + r4
            int r15 = r5.bottomMargin
            int r12 = r12 + r15
            int r4 = java.lang.Math.max(r4, r12)
            r6.Y1 = r4
            r10 = r0
            r29 = r1
            r30 = r2
            r31 = r3
            r13 = r5
            r5 = 1
            r27 = 1
            goto L_0x00f7
        L_0x009f:
            int r12 = r5.height
            if (r12 != 0) goto L_0x00ab
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ab
            r5.height = r10
            r12 = 0
            goto L_0x00ac
        L_0x00ab:
            r12 = r11
        L_0x00ac:
            r4 = 0
            int r15 = (r21 > r13 ? 1 : (r21 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x00b5
            int r15 = r6.Y1
            r10 = r0
            goto L_0x00b7
        L_0x00b5:
            r10 = r0
            r15 = 0
        L_0x00b7:
            r0 = r38
            r29 = r1
            r1 = r26
            r30 = r2
            r2 = r39
            r31 = r3
            r3 = r4
            r4 = r40
            r13 = r5
            r27 = 1
            r5 = r15
            r0.o(r1, r2, r3, r4, r5)
            if (r12 == r11) goto L_0x00d1
            r13.height = r12
        L_0x00d1:
            int r0 = r26.getMeasuredHeight()
            int r1 = r6.Y1
            int r2 = r1 + r0
            int r3 = r13.topMargin
            int r2 = r2 + r3
            int r3 = r13.bottomMargin
            int r2 = r2 + r3
            int r3 = r38.m()
            int r3 = r3 + r2
            int r1 = java.lang.Math.max(r1, r3)
            r6.Y1 = r1
            if (r9 == 0) goto L_0x00f3
            r4 = r18
            int r18 = java.lang.Math.max(r0, r4)
            goto L_0x00f5
        L_0x00f3:
            r4 = r18
        L_0x00f5:
            r5 = r22
        L_0x00f7:
            if (r10 < 0) goto L_0x0101
            int r0 = r14 + 1
            if (r10 != r0) goto L_0x0101
            int r0 = r6.Y1
            r6.q = r0
        L_0x0101:
            if (r14 >= r10) goto L_0x0113
            float r0 = r13.weight
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x010b
            goto L_0x0113
        L_0x010b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0113:
            r0 = r30
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x0123
            int r1 = r13.width
            r2 = -1
            if (r1 != r2) goto L_0x0123
            r1 = r27
            r25 = r1
            goto L_0x0124
        L_0x0123:
            r1 = 0
        L_0x0124:
            int r2 = r13.leftMargin
            int r3 = r13.rightMargin
            int r2 = r2 + r3
            int r3 = r26.getMeasuredWidth()
            int r3 = r3 + r2
            r12 = r20
            int r4 = java.lang.Math.max(r12, r3)
            int r12 = r26.getMeasuredState()
            r15 = r23
            int r12 = android.view.View.combineMeasuredStates(r15, r12)
            if (r24 == 0) goto L_0x0148
            int r15 = r13.width
            r11 = -1
            if (r15 != r11) goto L_0x0148
            r11 = r27
            goto L_0x0149
        L_0x0148:
            r11 = 0
        L_0x0149:
            float r13 = r13.weight
            r15 = 0
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 <= 0) goto L_0x015b
            if (r1 == 0) goto L_0x0153
            goto L_0x0154
        L_0x0153:
            r2 = r3
        L_0x0154:
            r13 = r17
            int r17 = java.lang.Math.max(r13, r2)
            goto L_0x0169
        L_0x015b:
            r13 = r17
            if (r1 == 0) goto L_0x0160
            goto L_0x0161
        L_0x0160:
            r2 = r3
        L_0x0161:
            r1 = r19
            int r19 = java.lang.Math.max(r1, r2)
            r17 = r13
        L_0x0169:
            int r1 = r38.k()
            int r14 = r14 + r1
            r22 = r5
            r24 = r11
            r23 = r12
        L_0x0174:
            int r14 = r14 + 1
            r2 = r0
            r20 = r4
            r0 = r10
            r5 = r27
            r1 = r29
            r3 = r31
            r4 = 0
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r13 = 0
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x0039
        L_0x018b:
            r29 = r1
            r0 = r2
            r31 = r3
            r27 = r5
            r13 = r17
            r4 = r18
            r1 = r19
            r12 = r20
            r15 = r23
            int r2 = r6.Y1
            r10 = r31
            if (r2 <= 0) goto L_0x01af
            boolean r2 = r6.n(r10)
            if (r2 == 0) goto L_0x01af
            int r2 = r6.Y1
            int r3 = r6.f2
            int r2 = r2 + r3
            r6.Y1 = r2
        L_0x01af:
            r2 = r29
            if (r9 == 0) goto L_0x01ff
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L_0x01b9
            if (r2 != 0) goto L_0x01ff
        L_0x01b9:
            r11 = 0
            r6.Y1 = r11
            r3 = r11
        L_0x01bd:
            if (r3 >= r10) goto L_0x01ff
            android.view.View r5 = r6.getChildAt(r3)
            if (r5 != 0) goto L_0x01cf
            int r5 = r6.Y1
            int r14 = r38.p()
            int r14 = r14 + r5
            r6.Y1 = r14
            goto L_0x01fb
        L_0x01cf:
            int r14 = r5.getVisibility()
            r11 = 8
            if (r14 != r11) goto L_0x01dd
            int r5 = r38.k()
            int r3 = r3 + r5
            goto L_0x01fb
        L_0x01dd:
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            h0.b.f.f0$a r5 = (h0.b.f.f0.a) r5
            int r11 = r6.Y1
            int r18 = r11 + r4
            int r14 = r5.topMargin
            int r18 = r18 + r14
            int r5 = r5.bottomMargin
            int r18 = r18 + r5
            int r5 = r38.m()
            int r5 = r5 + r18
            int r5 = java.lang.Math.max(r11, r5)
            r6.Y1 = r5
        L_0x01fb:
            int r3 = r3 + 1
            r11 = 0
            goto L_0x01bd
        L_0x01ff:
            int r3 = r6.Y1
            int r5 = r38.getPaddingTop()
            int r11 = r38.getPaddingBottom()
            int r11 = r11 + r5
            int r11 = r11 + r3
            r6.Y1 = r11
            int r3 = r38.getSuggestedMinimumHeight()
            int r3 = java.lang.Math.max(r11, r3)
            r5 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r8, r5)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r3
            int r11 = r6.Y1
            int r5 = r5 - r11
            if (r22 != 0) goto L_0x026c
            if (r5 == 0) goto L_0x022b
            r11 = 0
            int r14 = (r21 > r11 ? 1 : (r21 == r11 ? 0 : -1))
            if (r14 <= 0) goto L_0x022b
            goto L_0x026c
        L_0x022b:
            int r1 = java.lang.Math.max(r1, r13)
            if (r9 == 0) goto L_0x0268
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 == r5) goto L_0x0268
            r2 = 0
        L_0x0236:
            if (r2 >= r10) goto L_0x0268
            android.view.View r5 = r6.getChildAt(r2)
            if (r5 == 0) goto L_0x0265
            int r9 = r5.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x0247
            goto L_0x0265
        L_0x0247:
            android.view.ViewGroup$LayoutParams r9 = r5.getLayoutParams()
            h0.b.f.f0$a r9 = (h0.b.f.f0.a) r9
            float r9 = r9.weight
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x0265
            int r9 = r5.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r11)
            r5.measure(r9, r13)
        L_0x0265:
            int r2 = r2 + 1
            goto L_0x0236
        L_0x0268:
            r20 = r12
            goto L_0x0353
        L_0x026c:
            float r4 = r6.Z1
            r9 = 0
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0275
            r21 = r4
        L_0x0275:
            r4 = 0
            r6.Y1 = r4
            r4 = 0
        L_0x0279:
            if (r4 >= r10) goto L_0x0343
            android.view.View r9 = r6.getChildAt(r4)
            int r11 = r9.getVisibility()
            r13 = 8
            if (r11 != r13) goto L_0x028b
            r29 = r2
            goto L_0x033d
        L_0x028b:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            h0.b.f.f0$a r11 = (h0.b.f.f0.a) r11
            float r13 = r11.weight
            r14 = 0
            int r16 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x02ed
            float r14 = (float) r5
            float r14 = r14 * r13
            float r14 = r14 / r21
            int r14 = (int) r14
            float r21 = r21 - r13
            int r5 = r5 - r14
            int r13 = r38.getPaddingLeft()
            int r16 = r38.getPaddingRight()
            int r16 = r16 + r13
            int r13 = r11.leftMargin
            int r16 = r16 + r13
            int r13 = r11.rightMargin
            int r13 = r16 + r13
            r16 = r5
            int r5 = r11.width
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r7, r13, r5)
            int r13 = r11.height
            if (r13 != 0) goto L_0x02cf
            r13 = 1073741824(0x40000000, float:2.0)
            if (r2 == r13) goto L_0x02c3
            goto L_0x02d1
        L_0x02c3:
            if (r14 <= 0) goto L_0x02c6
            goto L_0x02c7
        L_0x02c6:
            r14 = 0
        L_0x02c7:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r9.measure(r5, r14)
            goto L_0x02e1
        L_0x02cf:
            r13 = 1073741824(0x40000000, float:2.0)
        L_0x02d1:
            int r17 = r9.getMeasuredHeight()
            int r14 = r17 + r14
            if (r14 >= 0) goto L_0x02da
            r14 = 0
        L_0x02da:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r9.measure(r5, r14)
        L_0x02e1:
            int r5 = r9.getMeasuredState()
            r5 = r5 & -256(0xffffffffffffff00, float:NaN)
            int r15 = android.view.View.combineMeasuredStates(r15, r5)
            r5 = r16
        L_0x02ed:
            int r13 = r11.leftMargin
            int r14 = r11.rightMargin
            int r13 = r13 + r14
            int r14 = r9.getMeasuredWidth()
            int r14 = r14 + r13
            int r12 = java.lang.Math.max(r12, r14)
            r29 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L_0x030b
            int r2 = r11.width
            r16 = r5
            r5 = -1
            if (r2 != r5) goto L_0x030e
            r2 = r27
            goto L_0x030f
        L_0x030b:
            r16 = r5
            r5 = -1
        L_0x030e:
            r2 = 0
        L_0x030f:
            if (r2 == 0) goto L_0x0312
            goto L_0x0313
        L_0x0312:
            r13 = r14
        L_0x0313:
            int r1 = java.lang.Math.max(r1, r13)
            if (r24 == 0) goto L_0x0320
            int r2 = r11.width
            if (r2 != r5) goto L_0x0320
            r5 = r27
            goto L_0x0321
        L_0x0320:
            r5 = 0
        L_0x0321:
            int r2 = r6.Y1
            int r9 = r9.getMeasuredHeight()
            int r9 = r9 + r2
            int r13 = r11.topMargin
            int r9 = r9 + r13
            int r11 = r11.bottomMargin
            int r9 = r9 + r11
            int r11 = r38.m()
            int r11 = r11 + r9
            int r2 = java.lang.Math.max(r2, r11)
            r6.Y1 = r2
            r24 = r5
            r5 = r16
        L_0x033d:
            int r4 = r4 + 1
            r2 = r29
            goto L_0x0279
        L_0x0343:
            int r2 = r6.Y1
            int r4 = r38.getPaddingTop()
            int r5 = r38.getPaddingBottom()
            int r5 = r5 + r4
            int r5 = r5 + r2
            r6.Y1 = r5
            goto L_0x0268
        L_0x0353:
            if (r24 != 0) goto L_0x035a
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L_0x035a
            goto L_0x035c
        L_0x035a:
            r1 = r20
        L_0x035c:
            int r0 = r38.getPaddingLeft()
            int r2 = r38.getPaddingRight()
            int r2 = r2 + r0
            int r2 = r2 + r1
            int r0 = r38.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r2, r0)
            int r0 = android.view.View.resolveSizeAndState(r0, r7, r15)
            r6.setMeasuredDimension(r0, r3)
            if (r25 == 0) goto L_0x0912
            int r0 = r38.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = 0
        L_0x0382:
            if (r9 >= r10) goto L_0x0912
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x03b0
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            h0.b.f.f0$a r11 = (h0.b.f.f0.a) r11
            int r0 = r11.width
            r2 = -1
            if (r0 != r2) goto L_0x03b0
            int r12 = r11.height
            int r0 = r1.getMeasuredHeight()
            r11.height = r0
            r3 = 0
            r5 = 0
            r0 = r38
            r2 = r7
            r4 = r40
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.height = r12
        L_0x03b0:
            int r9 = r9 + 1
            goto L_0x0382
        L_0x03b3:
            r27 = r5
            r0 = r4
            r6.Y1 = r0
            int r9 = r38.getVirtualChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r39)
            int r11 = android.view.View.MeasureSpec.getMode(r40)
            int[] r0 = r6.b2
            r12 = 4
            if (r0 == 0) goto L_0x03cd
            int[] r0 = r6.c2
            if (r0 != 0) goto L_0x03d5
        L_0x03cd:
            int[] r0 = new int[r12]
            r6.b2 = r0
            int[] r0 = new int[r12]
            r6.c2 = r0
        L_0x03d5:
            int[] r13 = r6.b2
            int[] r14 = r6.c2
            r15 = 3
            r0 = -1
            r13[r15] = r0
            r17 = 2
            r13[r17] = r0
            r13[r27] = r0
            r1 = 0
            r13[r1] = r0
            r14[r15] = r0
            r14[r17] = r0
            r14[r27] = r0
            r14[r1] = r0
            boolean r5 = r6.c
            boolean r4 = r6.a2
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x03f9
            r18 = r27
            goto L_0x03fb
        L_0x03f9:
            r18 = 0
        L_0x03fb:
            r23 = r27
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r8 = 0
            r12 = 0
            r15 = 0
            r22 = 0
            r24 = 0
        L_0x0408:
            if (r3 >= r9) goto L_0x05c3
            android.view.View r7 = r6.getChildAt(r3)
            if (r7 != 0) goto L_0x0420
            int r7 = r6.Y1
            int r25 = r38.p()
            int r7 = r25 + r7
            r6.Y1 = r7
            r26 = r4
            r30 = r5
            goto L_0x05b9
        L_0x0420:
            r25 = r0
            int r0 = r7.getVisibility()
            r26 = r2
            r2 = 8
            if (r0 != r2) goto L_0x043b
            int r0 = r38.k()
            int r3 = r3 + r0
            r30 = r5
            r0 = r25
            r2 = r26
            r26 = r4
            goto L_0x05b9
        L_0x043b:
            boolean r0 = r6.n(r3)
            if (r0 == 0) goto L_0x0448
            int r0 = r6.Y1
            int r2 = r6.e2
            int r0 = r0 + r2
            r6.Y1 = r0
        L_0x0448:
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            r2 = r0
            h0.b.f.f0$a r2 = (h0.b.f.f0.a) r2
            float r0 = r2.weight
            float r29 = r1 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L_0x04a7
            int r1 = r2.width
            if (r1 != 0) goto L_0x04a7
            r1 = 0
            int r30 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r30 <= 0) goto L_0x04a7
            if (r18 == 0) goto L_0x046f
            int r0 = r6.Y1
            int r1 = r2.leftMargin
            r30 = r3
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r1 = r1 + r0
            r6.Y1 = r1
            goto L_0x047f
        L_0x046f:
            r30 = r3
            int r0 = r6.Y1
            int r1 = r2.leftMargin
            int r1 = r1 + r0
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = java.lang.Math.max(r0, r1)
            r6.Y1 = r0
        L_0x047f:
            if (r5 == 0) goto L_0x0496
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r7.measure(r1, r1)
            r1 = r2
            r33 = r25
            r34 = r26
            r25 = r30
            r26 = r4
            r30 = r5
            goto L_0x0524
        L_0x0496:
            r1 = r2
            r33 = r25
            r34 = r26
            r25 = r30
            r0 = 1073741824(0x40000000, float:2.0)
            r26 = r4
            r30 = r5
            r5 = r27
            goto L_0x0528
        L_0x04a7:
            r30 = r3
            int r1 = r2.width
            if (r1 != 0) goto L_0x04b7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x04b8
            r0 = -2
            r2.width = r0
            r3 = 0
            goto L_0x04ba
        L_0x04b7:
            r1 = 0
        L_0x04b8:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x04ba:
            int r0 = (r29 > r1 ? 1 : (r29 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x04c3
            int r0 = r6.Y1
            r31 = r0
            goto L_0x04c5
        L_0x04c3:
            r31 = 0
        L_0x04c5:
            r32 = 0
            r1 = r25
            r0 = r38
            r33 = r1
            r1 = r7
            r35 = r2
            r34 = r26
            r2 = r39
            r36 = r3
            r25 = r30
            r3 = r31
            r26 = r4
            r4 = r40
            r30 = r5
            r5 = r32
            r0.o(r1, r2, r3, r4, r5)
            r0 = r36
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x04f0
            r1 = r35
            r1.width = r0
            goto L_0x04f2
        L_0x04f0:
            r1 = r35
        L_0x04f2:
            int r0 = r7.getMeasuredWidth()
            if (r18 == 0) goto L_0x0509
            int r2 = r6.Y1
            int r3 = r1.leftMargin
            int r3 = r3 + r0
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            int r4 = r38.m()
            int r4 = r4 + r3
            int r4 = r4 + r2
            r6.Y1 = r4
            goto L_0x051e
        L_0x0509:
            int r2 = r6.Y1
            int r3 = r2 + r0
            int r4 = r1.leftMargin
            int r3 = r3 + r4
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            int r4 = r38.m()
            int r4 = r4 + r3
            int r2 = java.lang.Math.max(r2, r4)
            r6.Y1 = r2
        L_0x051e:
            if (r26 == 0) goto L_0x0524
            int r8 = java.lang.Math.max(r0, r8)
        L_0x0524:
            r5 = r22
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x0528:
            if (r11 == r0) goto L_0x0534
            int r0 = r1.height
            r2 = -1
            if (r0 != r2) goto L_0x0534
            r0 = r27
            r24 = r0
            goto L_0x0535
        L_0x0534:
            r0 = 0
        L_0x0535:
            int r2 = r1.topMargin
            int r3 = r1.bottomMargin
            int r2 = r2 + r3
            int r3 = r7.getMeasuredHeight()
            int r3 = r3 + r2
            int r4 = r7.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r12, r4)
            if (r30 == 0) goto L_0x0577
            int r7 = r7.getBaseline()
            r12 = -1
            if (r7 == r12) goto L_0x0577
            int r12 = r1.gravity
            if (r12 >= 0) goto L_0x0556
            int r12 = r6.y
        L_0x0556:
            r12 = r12 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r12 = r12 >> 4
            r22 = -2
            r12 = r12 & -2
            int r12 = r12 >> 1
            r22 = r2
            r2 = r13[r12]
            int r2 = java.lang.Math.max(r2, r7)
            r13[r12] = r2
            r2 = r14[r12]
            int r7 = r3 - r7
            int r2 = java.lang.Math.max(r2, r7)
            r14[r12] = r2
            goto L_0x0579
        L_0x0577:
            r22 = r2
        L_0x0579:
            int r2 = java.lang.Math.max(r15, r3)
            if (r23 == 0) goto L_0x0587
            int r7 = r1.height
            r12 = -1
            if (r7 != r12) goto L_0x0587
            r7 = r27
            goto L_0x0588
        L_0x0587:
            r7 = 0
        L_0x0588:
            float r1 = r1.weight
            r12 = 0
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x059a
            if (r0 == 0) goto L_0x0593
            r3 = r22
        L_0x0593:
            r1 = r33
            int r0 = java.lang.Math.max(r1, r3)
            goto L_0x05a9
        L_0x059a:
            r1 = r33
            if (r0 == 0) goto L_0x05a0
            r3 = r22
        L_0x05a0:
            r0 = r34
            int r0 = java.lang.Math.max(r0, r3)
            r34 = r0
            r0 = r1
        L_0x05a9:
            int r1 = r38.k()
            int r3 = r1 + r25
            r15 = r2
            r12 = r4
            r22 = r5
            r23 = r7
            r1 = r29
            r2 = r34
        L_0x05b9:
            int r3 = r3 + 1
            r7 = r39
            r4 = r26
            r5 = r30
            goto L_0x0408
        L_0x05c3:
            r26 = r4
            r30 = r5
            r37 = r2
            r2 = r0
            r0 = r37
            int r3 = r6.Y1
            if (r3 <= 0) goto L_0x05dd
            boolean r3 = r6.n(r9)
            if (r3 == 0) goto L_0x05dd
            int r3 = r6.Y1
            int r4 = r6.e2
            int r3 = r3 + r4
            r6.Y1 = r3
        L_0x05dd:
            r3 = r13[r27]
            r4 = -1
            if (r3 != r4) goto L_0x05f4
            r3 = 0
            r5 = r13[r3]
            if (r5 != r4) goto L_0x05f4
            r3 = r13[r17]
            if (r3 != r4) goto L_0x05f4
            r3 = 3
            r5 = r13[r3]
            if (r5 == r4) goto L_0x05f1
            goto L_0x05f5
        L_0x05f1:
            r25 = r12
            goto L_0x0627
        L_0x05f4:
            r3 = 3
        L_0x05f5:
            r4 = r13[r3]
            r5 = 0
            r7 = r13[r5]
            r5 = r13[r27]
            r3 = r13[r17]
            int r3 = java.lang.Math.max(r5, r3)
            int r3 = java.lang.Math.max(r7, r3)
            int r3 = java.lang.Math.max(r4, r3)
            r4 = 3
            r5 = r14[r4]
            r4 = 0
            r7 = r14[r4]
            r4 = r14[r27]
            r25 = r12
            r12 = r14[r17]
            int r4 = java.lang.Math.max(r4, r12)
            int r4 = java.lang.Math.max(r7, r4)
            int r4 = java.lang.Math.max(r5, r4)
            int r4 = r4 + r3
            int r15 = java.lang.Math.max(r15, r4)
        L_0x0627:
            if (r26 == 0) goto L_0x0684
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r3) goto L_0x062f
            if (r10 != 0) goto L_0x0684
        L_0x062f:
            r3 = 0
            r6.Y1 = r3
            r4 = 0
        L_0x0633:
            if (r4 >= r9) goto L_0x0684
            android.view.View r3 = r6.getChildAt(r4)
            if (r3 != 0) goto L_0x0645
            int r3 = r6.Y1
            int r5 = r38.p()
            int r5 = r5 + r3
            r6.Y1 = r5
            goto L_0x0681
        L_0x0645:
            int r5 = r3.getVisibility()
            r7 = 8
            if (r5 != r7) goto L_0x0653
            int r3 = r38.k()
            int r4 = r4 + r3
            goto L_0x0681
        L_0x0653:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            h0.b.f.f0$a r3 = (h0.b.f.f0.a) r3
            if (r18 == 0) goto L_0x066c
            int r5 = r6.Y1
            int r7 = r3.leftMargin
            int r7 = r7 + r8
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            int r3 = r38.m()
            int r3 = r3 + r7
            int r3 = r3 + r5
            r6.Y1 = r3
            goto L_0x0681
        L_0x066c:
            int r5 = r6.Y1
            int r7 = r5 + r8
            int r12 = r3.leftMargin
            int r7 = r7 + r12
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            int r3 = r38.m()
            int r3 = r3 + r7
            int r3 = java.lang.Math.max(r5, r3)
            r6.Y1 = r3
        L_0x0681:
            int r4 = r4 + 1
            goto L_0x0633
        L_0x0684:
            int r3 = r6.Y1
            int r4 = r38.getPaddingLeft()
            int r5 = r38.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r3
            r6.Y1 = r5
            int r3 = r38.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r5, r3)
            r7 = r39
            r4 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r7, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            int r5 = r6.Y1
            int r4 = r4 - r5
            if (r22 != 0) goto L_0x06f8
            if (r4 == 0) goto L_0x06b2
            r12 = 0
            int r16 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r16 <= 0) goto L_0x06b2
            goto L_0x06f8
        L_0x06b2:
            int r0 = java.lang.Math.max(r0, r2)
            if (r26 == 0) goto L_0x06ef
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 == r1) goto L_0x06ef
            r4 = 0
        L_0x06bd:
            if (r4 >= r9) goto L_0x06ef
            android.view.View r1 = r6.getChildAt(r4)
            if (r1 == 0) goto L_0x06ec
            int r2 = r1.getVisibility()
            r10 = 8
            if (r2 != r10) goto L_0x06ce
            goto L_0x06ec
        L_0x06ce:
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            h0.b.f.f0$a r2 = (h0.b.f.f0.a) r2
            float r2 = r2.weight
            r10 = 0
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x06ec
            r2 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2)
            int r12 = r1.getMeasuredHeight()
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r2)
            r1.measure(r10, r12)
        L_0x06ec:
            int r4 = r4 + 1
            goto L_0x06bd
        L_0x06ef:
            r8 = r40
            r22 = r9
            r12 = r25
        L_0x06f5:
            r5 = 0
            goto L_0x08a9
        L_0x06f8:
            float r2 = r6.Z1
            r8 = 0
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x0700
            r1 = r2
        L_0x0700:
            r2 = 3
            r8 = -1
            r13[r2] = r8
            r13[r17] = r8
            r13[r27] = r8
            r12 = 0
            r13[r12] = r8
            r14[r2] = r8
            r14[r17] = r8
            r14[r27] = r8
            r14[r12] = r8
            r6.Y1 = r12
            r8 = r4
            r12 = r25
            r2 = -1
            r4 = 0
        L_0x071a:
            if (r4 >= r9) goto L_0x0850
            android.view.View r15 = r6.getChildAt(r4)
            if (r15 == 0) goto L_0x083c
            int r5 = r15.getVisibility()
            r7 = 8
            if (r5 != r7) goto L_0x072c
            goto L_0x083c
        L_0x072c:
            android.view.ViewGroup$LayoutParams r5 = r15.getLayoutParams()
            h0.b.f.f0$a r5 = (h0.b.f.f0.a) r5
            float r7 = r5.weight
            r20 = 0
            int r22 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r22 <= 0) goto L_0x0797
            r22 = r9
            float r9 = (float) r8
            float r9 = r9 * r7
            float r9 = r9 / r1
            int r9 = (int) r9
            float r1 = r1 - r7
            int r8 = r8 - r9
            int r7 = r38.getPaddingTop()
            int r25 = r38.getPaddingBottom()
            int r25 = r25 + r7
            int r7 = r5.topMargin
            int r25 = r25 + r7
            int r7 = r5.bottomMargin
            int r7 = r25 + r7
            r25 = r1
            int r1 = r5.height
            r26 = r8
            r8 = r40
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r8, r7, r1)
            int r7 = r5.width
            if (r7 != 0) goto L_0x0775
            r7 = 1073741824(0x40000000, float:2.0)
            if (r10 == r7) goto L_0x0769
            goto L_0x0777
        L_0x0769:
            if (r9 <= 0) goto L_0x076c
            goto L_0x076d
        L_0x076c:
            r9 = 0
        L_0x076d:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
            r15.measure(r9, r1)
            goto L_0x0787
        L_0x0775:
            r7 = 1073741824(0x40000000, float:2.0)
        L_0x0777:
            int r28 = r15.getMeasuredWidth()
            int r9 = r28 + r9
            if (r9 >= 0) goto L_0x0780
            r9 = 0
        L_0x0780:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
            r15.measure(r9, r1)
        L_0x0787:
            int r1 = r15.getMeasuredState()
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r7
            int r12 = android.view.View.combineMeasuredStates(r12, r1)
            r1 = r25
            r7 = r26
            goto L_0x079c
        L_0x0797:
            r7 = r8
            r22 = r9
            r8 = r40
        L_0x079c:
            if (r18 == 0) goto L_0x07ba
            int r9 = r6.Y1
            int r25 = r15.getMeasuredWidth()
            r26 = r1
            int r1 = r5.leftMargin
            int r25 = r25 + r1
            int r1 = r5.rightMargin
            int r25 = r25 + r1
            int r1 = r38.m()
            int r1 = r1 + r25
            int r1 = r1 + r9
            r6.Y1 = r1
            r25 = r7
            goto L_0x07d6
        L_0x07ba:
            r26 = r1
            int r1 = r6.Y1
            int r9 = r15.getMeasuredWidth()
            int r9 = r9 + r1
            r25 = r7
            int r7 = r5.leftMargin
            int r9 = r9 + r7
            int r7 = r5.rightMargin
            int r9 = r9 + r7
            int r7 = r38.m()
            int r7 = r7 + r9
            int r1 = java.lang.Math.max(r1, r7)
            r6.Y1 = r1
        L_0x07d6:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x07e2
            int r1 = r5.height
            r7 = -1
            if (r1 != r7) goto L_0x07e2
            r1 = r27
            goto L_0x07e3
        L_0x07e2:
            r1 = 0
        L_0x07e3:
            int r7 = r5.topMargin
            int r9 = r5.bottomMargin
            int r7 = r7 + r9
            int r9 = r15.getMeasuredHeight()
            int r9 = r9 + r7
            int r2 = java.lang.Math.max(r2, r9)
            if (r1 == 0) goto L_0x07f4
            goto L_0x07f5
        L_0x07f4:
            r7 = r9
        L_0x07f5:
            int r0 = java.lang.Math.max(r0, r7)
            if (r23 == 0) goto L_0x0803
            int r1 = r5.height
            r7 = -1
            if (r1 != r7) goto L_0x0804
            r1 = r27
            goto L_0x0805
        L_0x0803:
            r7 = -1
        L_0x0804:
            r1 = 0
        L_0x0805:
            if (r30 == 0) goto L_0x0831
            int r15 = r15.getBaseline()
            if (r15 == r7) goto L_0x0831
            int r5 = r5.gravity
            if (r5 >= 0) goto L_0x0813
            int r5 = r6.y
        L_0x0813:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r5 = r5 >> 4
            r28 = -2
            r5 = r5 & -2
            int r5 = r5 >> 1
            r7 = r13[r5]
            int r7 = java.lang.Math.max(r7, r15)
            r13[r5] = r7
            r7 = r14[r5]
            int r9 = r9 - r15
            int r7 = java.lang.Math.max(r7, r9)
            r14[r5] = r7
            goto L_0x0835
        L_0x0831:
            r21 = 4
            r28 = -2
        L_0x0835:
            r23 = r1
            r7 = r25
            r1 = r26
            goto L_0x0847
        L_0x083c:
            r7 = r8
            r22 = r9
            r20 = 0
            r21 = 4
            r28 = -2
            r8 = r40
        L_0x0847:
            int r4 = r4 + 1
            r8 = r7
            r9 = r22
            r7 = r39
            goto L_0x071a
        L_0x0850:
            r8 = r40
            r22 = r9
            int r1 = r6.Y1
            int r4 = r38.getPaddingLeft()
            int r5 = r38.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r1
            r6.Y1 = r5
            r1 = r13[r27]
            r4 = -1
            if (r1 != r4) goto L_0x0879
            r1 = 0
            r5 = r13[r1]
            if (r5 != r4) goto L_0x0879
            r1 = r13[r17]
            if (r1 != r4) goto L_0x0879
            r1 = 3
            r5 = r13[r1]
            if (r5 == r4) goto L_0x0876
            goto L_0x087a
        L_0x0876:
            r15 = r2
            goto L_0x06f5
        L_0x0879:
            r1 = 3
        L_0x087a:
            r4 = r13[r1]
            r5 = 0
            r7 = r13[r5]
            r9 = r13[r27]
            r10 = r13[r17]
            int r9 = java.lang.Math.max(r9, r10)
            int r7 = java.lang.Math.max(r7, r9)
            int r4 = java.lang.Math.max(r4, r7)
            r1 = r14[r1]
            r7 = r14[r5]
            r9 = r14[r27]
            r10 = r14[r17]
            int r9 = java.lang.Math.max(r9, r10)
            int r7 = java.lang.Math.max(r7, r9)
            int r1 = java.lang.Math.max(r1, r7)
            int r1 = r1 + r4
            int r1 = java.lang.Math.max(r2, r1)
            r15 = r1
        L_0x08a9:
            if (r23 != 0) goto L_0x08b0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x08b0
            goto L_0x08b1
        L_0x08b0:
            r0 = r15
        L_0x08b1:
            int r1 = r38.getPaddingTop()
            int r2 = r38.getPaddingBottom()
            int r2 = r2 + r1
            int r2 = r2 + r0
            int r0 = r38.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r2, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r12
            r1 = r1 | r3
            int r2 = r12 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r8, r2)
            r6.setMeasuredDimension(r1, r0)
            if (r24 == 0) goto L_0x0912
            int r0 = r38.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r8 = r5
            r9 = r22
        L_0x08df:
            if (r8 >= r9) goto L_0x0912
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r10 = 8
            if (r0 == r10) goto L_0x090e
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            h0.b.f.f0$a r11 = (h0.b.f.f0.a) r11
            int r0 = r11.height
            r12 = -1
            if (r0 != r12) goto L_0x090f
            int r13 = r11.width
            int r0 = r1.getMeasuredWidth()
            r11.width = r0
            r3 = 0
            r5 = 0
            r0 = r38
            r2 = r39
            r4 = r7
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.width = r13
            goto L_0x090f
        L_0x090e:
            r12 = -1
        L_0x090f:
            int r8 = r8 + 1
            goto L_0x08df
        L_0x0912:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.f.f0.onMeasure(int, int):void");
    }

    public int p() {
        return 0;
    }

    public void setBaselineAligned(boolean z) {
        this.c = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder P0 = i0.d.a.a.a.P0("base aligned child index out of range (0, ");
            P0.append(getChildCount());
            P0.append(")");
            throw new IllegalArgumentException(P0.toString());
        }
        this.d = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.d2) {
            this.d2 = drawable;
            boolean z = false;
            if (drawable != null) {
                this.e2 = drawable.getIntrinsicWidth();
                this.f2 = drawable.getIntrinsicHeight();
            } else {
                this.e2 = 0;
                this.f2 = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.h2 = i;
    }

    public void setGravity(int i) {
        if (this.y != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.y = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.y;
        if ((8388615 & i3) != i2) {
            this.y = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.a2 = z;
    }

    public void setOrientation(int i) {
        if (this.x != i) {
            this.x = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.g2) {
            requestLayout();
        }
        this.g2 = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.y;
        if ((i3 & 112) != i2) {
            this.y = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.Z1 = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public f0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        int resourceId;
        this.c = true;
        this.d = -1;
        this.q = 0;
        this.y = 8388659;
        int[] iArr = R.styleable.LinearLayoutCompat;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        q.o(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.Z1 = obtainStyledAttributes.getFloat(R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.d = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.a2 = obtainStyledAttributes.getBoolean(R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        int i4 = R.styleable.LinearLayoutCompat_divider;
        if (!obtainStyledAttributes.hasValue(i4) || (resourceId = obtainStyledAttributes.getResourceId(i4, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(i4);
        } else {
            drawable = h0.b.b.a.a.a(context, resourceId);
        }
        setDividerDrawable(drawable);
        this.g2 = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_showDividers, 0);
        this.h2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }
}
