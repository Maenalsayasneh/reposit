package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.g.a.h.e;
import h0.g.a.h.j;
import h0.g.a.h.k.b;
import h0.g.c.c;
import h0.g.c.d;
import h0.g.c.f;
import h0.g.c.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class ConstraintLayout extends ViewGroup {
    public static g c;
    public int Y1 = 0;
    public int Z1 = Integer.MAX_VALUE;
    public int a2 = Integer.MAX_VALUE;
    public boolean b2 = true;
    public int c2 = 257;
    public SparseArray<View> d = new SparseArray<>();
    public c d2 = null;
    public h0.g.c.b e2 = null;
    public int f2 = -1;
    public HashMap<String, Integer> g2 = new HashMap<>();
    public int h2 = -1;
    public int i2 = -1;
    public SparseArray<ConstraintWidget> j2 = new SparseArray<>();
    public b k2 = new b(this);
    public int l2 = 0;
    public int m2 = 0;
    public ArrayList<h0.g.c.a> q = new ArrayList<>(4);
    public h0.g.a.h.c x = new h0.g.a.h.c();
    public int y = 0;

    public class b implements b.C0030b {
        public ConstraintLayout a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public b(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        public final boolean a(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                return false;
            }
            if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:114:0x019e  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x01a0  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x01a3  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x01b8  */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x01ba  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x01bd  */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x01bf  */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x01c9  */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x01cb  */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x01d3  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x01d5  */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x01df  */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x01e1  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x01ea  */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x01ec  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x01ef A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:150:0x01f0  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(androidx.constraintlayout.core.widgets.ConstraintWidget r18, h0.g.a.h.k.b.a r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r1.f8o0
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x001b
                boolean r3 = r1.G
                if (r3 != 0) goto L_0x001b
                r2.e = r5
                r2.f = r5
                r2.g = r5
                return
            L_0x001b:
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r1.W
                if (r3 != 0) goto L_0x0020
                return
            L_0x0020:
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r2.a
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r2.b
                int r6 = r2.c
                int r7 = r2.d
                int r8 = r0.b
                int r9 = r0.c
                int r8 = r8 + r9
                int r9 = r0.d
                java.lang.Object r10 = r1.f6m0
                android.view.View r10 = (android.view.View) r10
                int r11 = r3.ordinal()
                r12 = 3
                r13 = 2
                r14 = -1
                r15 = 1
                if (r11 == 0) goto L_0x00b1
                if (r11 == r15) goto L_0x00a7
                if (r11 == r13) goto L_0x005d
                if (r11 == r12) goto L_0x0045
                goto L_0x00b7
            L_0x0045:
                int r6 = r0.f
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r1.K
                if (r11 == 0) goto L_0x004f
                int r11 = r11.g
                int r11 = r11 + r5
                goto L_0x0050
            L_0x004f:
                r11 = r5
            L_0x0050:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r1.M
                if (r5 == 0) goto L_0x0057
                int r5 = r5.g
                int r11 = r11 + r5
            L_0x0057:
                int r9 = r9 + r11
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r14)
                goto L_0x00b7
            L_0x005d:
                int r5 = r0.f
                r6 = -2
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r9, r6)
                int r6 = r1.q
                if (r6 != r15) goto L_0x006a
                r6 = r15
                goto L_0x006b
            L_0x006a:
                r6 = 0
            L_0x006b:
                int r9 = r2.j
                if (r9 == r15) goto L_0x0075
                if (r9 != r13) goto L_0x0072
                goto L_0x0075
            L_0x0072:
                r11 = 1073741824(0x40000000, float:2.0)
                goto L_0x00b7
            L_0x0075:
                int r9 = r10.getMeasuredHeight()
                int r11 = r18.q()
                if (r9 != r11) goto L_0x0081
                r9 = r15
                goto L_0x0082
            L_0x0081:
                r9 = 0
            L_0x0082:
                int r11 = r2.j
                if (r11 == r13) goto L_0x0099
                if (r6 == 0) goto L_0x0099
                if (r6 == 0) goto L_0x008c
                if (r9 != 0) goto L_0x0099
            L_0x008c:
                boolean r6 = r10 instanceof h0.g.c.f
                if (r6 != 0) goto L_0x0099
                boolean r6 = r18.G()
                if (r6 == 0) goto L_0x0097
                goto L_0x0099
            L_0x0097:
                r6 = 0
                goto L_0x009a
            L_0x0099:
                r6 = r15
            L_0x009a:
                if (r6 == 0) goto L_0x0072
                int r5 = r18.w()
                r11 = 1073741824(0x40000000, float:2.0)
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
                goto L_0x00b7
            L_0x00a7:
                r11 = 1073741824(0x40000000, float:2.0)
                int r5 = r0.f
                r6 = -2
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r9, r6)
                goto L_0x00b7
            L_0x00b1:
                r11 = 1073741824(0x40000000, float:2.0)
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
            L_0x00b7:
                int r6 = r4.ordinal()
                if (r6 == 0) goto L_0x0137
                if (r6 == r15) goto L_0x012d
                if (r6 == r13) goto L_0x00e3
                if (r6 == r12) goto L_0x00c6
                r9 = 0
                goto L_0x013e
            L_0x00c6:
                int r6 = r0.g
                androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r1.K
                if (r7 == 0) goto L_0x00d3
                androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r1.L
                int r7 = r7.g
                r9 = 0
                int r7 = r7 + r9
                goto L_0x00d4
            L_0x00d3:
                r7 = 0
            L_0x00d4:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r1.M
                if (r9 == 0) goto L_0x00dd
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r1.N
                int r9 = r9.g
                int r7 = r7 + r9
            L_0x00dd:
                int r8 = r8 + r7
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r8, r14)
                goto L_0x013d
            L_0x00e3:
                int r6 = r0.g
                r7 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r8, r7)
                int r7 = r1.r
                if (r7 != r15) goto L_0x00f0
                r7 = r15
                goto L_0x00f1
            L_0x00f0:
                r7 = 0
            L_0x00f1:
                int r8 = r2.j
                if (r8 == r15) goto L_0x00fb
                if (r8 != r13) goto L_0x00f8
                goto L_0x00fb
            L_0x00f8:
                r9 = 1073741824(0x40000000, float:2.0)
                goto L_0x013d
            L_0x00fb:
                int r8 = r10.getMeasuredWidth()
                int r9 = r18.w()
                if (r8 != r9) goto L_0x0107
                r8 = r15
                goto L_0x0108
            L_0x0107:
                r8 = 0
            L_0x0108:
                int r9 = r2.j
                if (r9 == r13) goto L_0x011f
                if (r7 == 0) goto L_0x011f
                if (r7 == 0) goto L_0x0112
                if (r8 != 0) goto L_0x011f
            L_0x0112:
                boolean r7 = r10 instanceof h0.g.c.f
                if (r7 != 0) goto L_0x011f
                boolean r7 = r18.H()
                if (r7 == 0) goto L_0x011d
                goto L_0x011f
            L_0x011d:
                r7 = 0
                goto L_0x0120
            L_0x011f:
                r7 = r15
            L_0x0120:
                if (r7 == 0) goto L_0x00f8
                int r6 = r18.q()
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
                goto L_0x013d
            L_0x012d:
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = r0.g
                r7 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r8, r7)
                goto L_0x013d
            L_0x0137:
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            L_0x013d:
                r9 = r6
            L_0x013e:
                androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r1.W
                h0.g.a.h.c r6 = (h0.g.a.h.c) r6
                if (r6 == 0) goto L_0x01b4
                androidx.constraintlayout.widget.ConstraintLayout r7 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r7 = r7.c2
                r8 = 256(0x100, float:3.59E-43)
                boolean r7 = h0.g.a.h.h.b(r7, r8)
                if (r7 == 0) goto L_0x01b4
                int r7 = r10.getMeasuredWidth()
                int r8 = r18.w()
                if (r7 != r8) goto L_0x01b4
                int r7 = r10.getMeasuredWidth()
                int r8 = r6.w()
                if (r7 >= r8) goto L_0x01b4
                int r7 = r10.getMeasuredHeight()
                int r8 = r18.q()
                if (r7 != r8) goto L_0x01b4
                int r7 = r10.getMeasuredHeight()
                int r6 = r6.q()
                if (r7 >= r6) goto L_0x01b4
                int r6 = r10.getBaseline()
                int r7 = r1.f1h0
                if (r6 != r7) goto L_0x01b4
                boolean r6 = r18.F()
                if (r6 != 0) goto L_0x01b4
                int r6 = r1.I
                int r7 = r18.w()
                boolean r6 = r0.a(r6, r5, r7)
                if (r6 == 0) goto L_0x01a0
                int r6 = r1.J
                int r7 = r18.q()
                boolean r6 = r0.a(r6, r9, r7)
                if (r6 == 0) goto L_0x01a0
                r6 = r15
                goto L_0x01a1
            L_0x01a0:
                r6 = 0
            L_0x01a1:
                if (r6 == 0) goto L_0x01b4
                int r3 = r18.w()
                r2.e = r3
                int r3 = r18.q()
                r2.f = r3
                int r1 = r1.f1h0
                r2.g = r1
                return
            L_0x01b4:
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r3 != r6) goto L_0x01ba
                r7 = r15
                goto L_0x01bb
            L_0x01ba:
                r7 = 0
            L_0x01bb:
                if (r4 != r6) goto L_0x01bf
                r6 = r15
                goto L_0x01c0
            L_0x01bf:
                r6 = 0
            L_0x01c0:
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
                if (r4 == r8) goto L_0x01cb
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                if (r4 != r11) goto L_0x01c9
                goto L_0x01cb
            L_0x01c9:
                r4 = 0
                goto L_0x01cc
            L_0x01cb:
                r4 = r15
            L_0x01cc:
                if (r3 == r8) goto L_0x01d5
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                if (r3 != r8) goto L_0x01d3
                goto L_0x01d5
            L_0x01d3:
                r3 = 0
                goto L_0x01d6
            L_0x01d5:
                r3 = r15
            L_0x01d6:
                r8 = 0
                if (r7 == 0) goto L_0x01e1
                float r11 = r1.Z
                int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r11 <= 0) goto L_0x01e1
                r11 = r15
                goto L_0x01e2
            L_0x01e1:
                r11 = 0
            L_0x01e2:
                if (r6 == 0) goto L_0x01ec
                float r12 = r1.Z
                int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                if (r8 <= 0) goto L_0x01ec
                r8 = r15
                goto L_0x01ed
            L_0x01ec:
                r8 = 0
            L_0x01ed:
                if (r10 != 0) goto L_0x01f0
                return
            L_0x01f0:
                android.view.ViewGroup$LayoutParams r12 = r10.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$a r12 = (androidx.constraintlayout.widget.ConstraintLayout.a) r12
                int r14 = r2.j
                if (r14 == r15) goto L_0x0210
                if (r14 == r13) goto L_0x0210
                if (r7 == 0) goto L_0x0210
                int r7 = r1.q
                if (r7 != 0) goto L_0x0210
                if (r6 == 0) goto L_0x0210
                int r6 = r1.r
                if (r6 == 0) goto L_0x0209
                goto L_0x0210
            L_0x0209:
                r0 = -1
                r9 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                goto L_0x02b9
            L_0x0210:
                boolean r6 = r10 instanceof h0.g.c.i
                if (r6 == 0) goto L_0x0222
                boolean r6 = r1 instanceof h0.g.a.h.i
                if (r6 == 0) goto L_0x0222
                r6 = r1
                h0.g.a.h.i r6 = (h0.g.a.h.i) r6
                r7 = r10
                h0.g.c.i r7 = (h0.g.c.i) r7
                r7.t(r6, r5, r9)
                goto L_0x0225
            L_0x0222:
                r10.measure(r5, r9)
            L_0x0225:
                r1.I = r5
                r1.J = r9
                r6 = 0
                r1.g = r6
                int r6 = r10.getMeasuredWidth()
                int r7 = r10.getMeasuredHeight()
                int r13 = r10.getBaseline()
                int r14 = r1.t
                if (r14 <= 0) goto L_0x0241
                int r14 = java.lang.Math.max(r14, r6)
                goto L_0x0242
            L_0x0241:
                r14 = r6
            L_0x0242:
                int r15 = r1.u
                if (r15 <= 0) goto L_0x024a
                int r14 = java.lang.Math.min(r15, r14)
            L_0x024a:
                int r15 = r1.w
                if (r15 <= 0) goto L_0x0255
                int r15 = java.lang.Math.max(r15, r7)
                r16 = r5
                goto L_0x0258
            L_0x0255:
                r16 = r5
                r15 = r7
            L_0x0258:
                int r5 = r1.x
                if (r5 <= 0) goto L_0x0260
                int r15 = java.lang.Math.min(r5, r15)
            L_0x0260:
                androidx.constraintlayout.widget.ConstraintLayout r5 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r5 = r5.c2
                r0 = 1
                boolean r5 = h0.g.a.h.h.b(r5, r0)
                if (r5 != 0) goto L_0x0284
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r11 == 0) goto L_0x0279
                if (r4 == 0) goto L_0x0279
                float r3 = r1.Z
                float r4 = (float) r15
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r14 = r0
                goto L_0x0284
            L_0x0279:
                if (r8 == 0) goto L_0x0284
                if (r3 == 0) goto L_0x0284
                float r3 = r1.Z
                float r4 = (float) r14
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r15 = r0
            L_0x0284:
                if (r6 != r14) goto L_0x028c
                if (r7 == r15) goto L_0x0289
                goto L_0x028c
            L_0x0289:
                r0 = -1
                r9 = 0
                goto L_0x02b9
            L_0x028c:
                if (r6 == r14) goto L_0x0295
                r0 = 1073741824(0x40000000, float:2.0)
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r0)
                goto L_0x0299
            L_0x0295:
                r0 = 1073741824(0x40000000, float:2.0)
                r5 = r16
            L_0x0299:
                if (r7 == r15) goto L_0x029f
                int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
            L_0x029f:
                r10.measure(r5, r9)
                r1.I = r5
                r1.J = r9
                r9 = 0
                r1.g = r9
                int r0 = r10.getMeasuredWidth()
                int r3 = r10.getMeasuredHeight()
                int r4 = r10.getBaseline()
                r14 = r0
                r15 = r3
                r13 = r4
                r0 = -1
            L_0x02b9:
                if (r13 == r0) goto L_0x02bd
                r0 = 1
                goto L_0x02be
            L_0x02bd:
                r0 = r9
            L_0x02be:
                int r3 = r2.c
                if (r14 != r3) goto L_0x02c9
                int r3 = r2.d
                if (r15 == r3) goto L_0x02c7
                goto L_0x02c9
            L_0x02c7:
                r5 = r9
                goto L_0x02ca
            L_0x02c9:
                r5 = 1
            L_0x02ca:
                r2.i = r5
                boolean r3 = r12.b0
                if (r3 == 0) goto L_0x02d1
                r0 = 1
            L_0x02d1:
                if (r0 == 0) goto L_0x02dd
                r3 = -1
                if (r13 == r3) goto L_0x02dd
                int r1 = r1.f1h0
                if (r1 == r13) goto L_0x02dd
                r1 = 1
                r2.i = r1
            L_0x02dd:
                r2.e = r14
                r2.f = r15
                r2.h = r0
                r2.g = r13
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.b(androidx.constraintlayout.core.widgets.ConstraintWidget, h0.g.a.h.k.b$a):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h(attributeSet, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static g getSharedValues() {
        if (c == null) {
            c = new g();
        }
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:153:0x02d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r18, android.view.View r19, androidx.constraintlayout.core.widgets.ConstraintWidget r20, androidx.constraintlayout.widget.ConstraintLayout.a r21, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r22) {
        /*
            r17 = this;
            r0 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r21.a()
            int r1 = r19.getVisibility()
            r6.f8o0 = r1
            boolean r1 = r7.e0
            r9 = 1
            if (r1 == 0) goto L_0x001c
            r6.G = r9
            r1 = 8
            r6.f8o0 = r1
        L_0x001c:
            r6.f6m0 = r0
            boolean r1 = r0 instanceof h0.g.c.a
            if (r1 == 0) goto L_0x002e
            h0.g.c.a r0 = (h0.g.c.a) r0
            r10 = r17
            h0.g.a.h.c r1 = r10.x
            boolean r1 = r1.R0
            r0.n(r6, r1)
            goto L_0x0030
        L_0x002e:
            r10 = r17
        L_0x0030:
            boolean r0 = r7.c0
            r11 = -1
            if (r0 == 0) goto L_0x0066
            r0 = r6
            h0.g.a.h.e r0 = (h0.g.a.h.e) r0
            int r1 = r7.f22m0
            int r2 = r7.f23n0
            float r3 = r7.f24o0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x004e
            if (r5 <= 0) goto L_0x033d
            r0.M0 = r3
            r0.N0 = r11
            r0.O0 = r11
            goto L_0x033d
        L_0x004e:
            if (r1 == r11) goto L_0x005a
            if (r1 <= r11) goto L_0x033d
            r0.M0 = r4
            r0.N0 = r1
            r0.O0 = r11
            goto L_0x033d
        L_0x005a:
            if (r2 == r11) goto L_0x033d
            if (r2 <= r11) goto L_0x033d
            r0.M0 = r4
            r0.N0 = r11
            r0.O0 = r2
            goto L_0x033d
        L_0x0066:
            int r0 = r7.f0
            int r1 = r7.f16g0
            int r12 = r7.f17h0
            int r13 = r7.f18i0
            int r5 = r7.f19j0
            int r14 = r7.f20k0
            float r15 = r7.f21l0
            int r2 = r7.o
            r4 = 0
            if (r2 == r11) goto L_0x0099
            java.lang.Object r0 = r8.get(r2)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x0095
            float r8 = r7.q
            int r5 = r7.p
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            r12 = 0
            r0 = r20
            r1 = r3
            r13 = r4
            r4 = r5
            r5 = r12
            r0.B(r1, r2, r3, r4, r5)
            r6.E = r8
            goto L_0x0096
        L_0x0095:
            r13 = r4
        L_0x0096:
            r9 = r13
            goto L_0x01a6
        L_0x0099:
            if (r0 == r11) goto L_0x00b6
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x00b4
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            int r1 = r7.leftMargin
            r0 = r20
            r16 = r1
            r1 = r3
            r9 = r4
            r4 = r16
            r0.B(r1, r2, r3, r4, r5)
            goto L_0x00cd
        L_0x00b4:
            r9 = r4
            goto L_0x00cd
        L_0x00b6:
            r9 = r4
            if (r1 == r11) goto L_0x00cd
            java.lang.Object r0 = r8.get(r1)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x00cd
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            int r4 = r7.leftMargin
            r0 = r20
            r0.B(r1, r2, r3, r4, r5)
        L_0x00cd:
            if (r12 == r11) goto L_0x00e5
            java.lang.Object r0 = r8.get(r12)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x00fb
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            int r4 = r7.rightMargin
            r0 = r20
            r5 = r14
            r0.B(r1, r2, r3, r4, r5)
            goto L_0x00fb
        L_0x00e5:
            if (r13 == r11) goto L_0x00fb
            java.lang.Object r0 = r8.get(r13)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x00fb
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            int r4 = r7.rightMargin
            r0 = r20
            r1 = r3
            r5 = r14
            r0.B(r1, r2, r3, r4, r5)
        L_0x00fb:
            int r0 = r7.h
            if (r0 == r11) goto L_0x0115
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x012f
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            int r4 = r7.topMargin
            int r5 = r7.w
            r0 = r20
            r1 = r3
            r0.B(r1, r2, r3, r4, r5)
            goto L_0x012f
        L_0x0115:
            int r0 = r7.i
            if (r0 == r11) goto L_0x012f
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x012f
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            int r4 = r7.topMargin
            int r5 = r7.w
            r0 = r20
            r0.B(r1, r2, r3, r4, r5)
        L_0x012f:
            int r0 = r7.j
            if (r0 == r11) goto L_0x014a
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x0163
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            int r4 = r7.bottomMargin
            int r5 = r7.y
            r0 = r20
            r0.B(r1, r2, r3, r4, r5)
            goto L_0x0163
        L_0x014a:
            int r0 = r7.k
            if (r0 == r11) goto L_0x0163
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x0163
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            int r4 = r7.bottomMargin
            int r5 = r7.y
            r0 = r20
            r1 = r3
            r0.B(r1, r2, r3, r4, r5)
        L_0x0163:
            int r4 = r7.l
            if (r4 == r11) goto L_0x0175
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = r22
            r0.s(r1, r2, r3, r4, r5)
            goto L_0x0198
        L_0x0175:
            int r4 = r7.m
            if (r4 == r11) goto L_0x0187
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = r22
            r0.s(r1, r2, r3, r4, r5)
            goto L_0x0198
        L_0x0187:
            int r4 = r7.n
            if (r4 == r11) goto L_0x0198
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = r22
            r0.s(r1, r2, r3, r4, r5)
        L_0x0198:
            int r0 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x019e
            r6.f4k0 = r15
        L_0x019e:
            float r0 = r7.E
            int r1 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r1 < 0) goto L_0x01a6
            r6.f5l0 = r0
        L_0x01a6:
            if (r18 == 0) goto L_0x01b6
            int r0 = r7.S
            if (r0 != r11) goto L_0x01b0
            int r1 = r7.T
            if (r1 == r11) goto L_0x01b6
        L_0x01b0:
            int r1 = r7.T
            r6.b0 = r0
            r6.c0 = r1
        L_0x01b6:
            boolean r0 = r7.Z
            r1 = -2
            r2 = 0
            if (r0 != 0) goto L_0x01ed
            int r0 = r7.width
            if (r0 != r11) goto L_0x01e4
            boolean r0 = r7.V
            if (r0 == 0) goto L_0x01ca
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r6.Q(r0)
            goto L_0x01cf
        L_0x01ca:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            r6.Q(r0)
        L_0x01cf:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.n(r0)
            int r3 = r7.leftMargin
            r0.g = r3
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.n(r0)
            int r3 = r7.rightMargin
            r0.g = r3
            goto L_0x0200
        L_0x01e4:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r6.Q(r0)
            r6.U(r2)
            goto L_0x0200
        L_0x01ed:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6.Q(r0)
            int r0 = r7.width
            r6.U(r0)
            int r0 = r7.width
            if (r0 != r1) goto L_0x0200
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r6.Q(r0)
        L_0x0200:
            boolean r0 = r7.a0
            if (r0 != 0) goto L_0x0235
            int r0 = r7.height
            if (r0 != r11) goto L_0x022c
            boolean r0 = r7.W
            if (r0 == 0) goto L_0x0212
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r6.T(r0)
            goto L_0x0217
        L_0x0212:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            r6.T(r0)
        L_0x0217:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.n(r0)
            int r1 = r7.topMargin
            r0.g = r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.n(r0)
            int r1 = r7.bottomMargin
            r0.g = r1
            goto L_0x0248
        L_0x022c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r6.T(r0)
            r6.P(r2)
            goto L_0x0248
        L_0x0235:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6.T(r0)
            int r0 = r7.height
            r6.P(r0)
            int r0 = r7.height
            if (r0 != r1) goto L_0x0248
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r6.T(r0)
        L_0x0248:
            java.lang.String r0 = r7.F
            if (r0 == 0) goto L_0x02da
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0254
            goto L_0x02da
        L_0x0254:
            int r1 = r0.length()
            r3 = 44
            int r3 = r0.indexOf(r3)
            if (r3 <= 0) goto L_0x0280
            int r4 = r1 + -1
            if (r3 >= r4) goto L_0x0280
            java.lang.String r4 = r0.substring(r2, r3)
            java.lang.String r5 = "W"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0272
            r11 = r2
            goto L_0x027d
        L_0x0272:
            java.lang.String r5 = "H"
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L_0x027d
            r4 = 1
            r11 = 1
            goto L_0x027e
        L_0x027d:
            r4 = 1
        L_0x027e:
            int r3 = r3 + r4
            goto L_0x0282
        L_0x0280:
            r4 = 1
            r3 = r2
        L_0x0282:
            r5 = 58
            int r5 = r0.indexOf(r5)
            if (r5 < 0) goto L_0x02c1
            int r1 = r1 - r4
            if (r5 >= r1) goto L_0x02c1
            java.lang.String r1 = r0.substring(r3, r5)
            int r5 = r5 + r4
            java.lang.String r0 = r0.substring(r5)
            int r3 = r1.length()
            if (r3 <= 0) goto L_0x02d0
            int r3 = r0.length()
            if (r3 <= 0) goto L_0x02d0
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x02d0 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x02d0 }
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x02d0
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x02d0
            r3 = 1
            if (r11 != r3) goto L_0x02bb
            float r0 = r0 / r1
            float r4 = java.lang.Math.abs(r0)     // Catch:{ NumberFormatException -> 0x02d0 }
            goto L_0x02d1
        L_0x02bb:
            float r1 = r1 / r0
            float r4 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x02d0 }
            goto L_0x02d1
        L_0x02c1:
            java.lang.String r0 = r0.substring(r3)
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x02d0
            float r4 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x02d0 }
            goto L_0x02d1
        L_0x02d0:
            r4 = r9
        L_0x02d1:
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x02dc
            r6.Z = r4
            r6.a0 = r11
            goto L_0x02dc
        L_0x02da:
            r6.Z = r9
        L_0x02dc:
            float r0 = r7.G
            float[] r1 = r6.F0
            r1[r2] = r0
            float r0 = r7.H
            r3 = 1
            r1[r3] = r0
            int r0 = r7.I
            r6.B0 = r0
            int r0 = r7.J
            r6.C0 = r0
            int r0 = r7.Y
            if (r0 < 0) goto L_0x02f8
            r1 = 3
            if (r0 > r1) goto L_0x02f8
            r6.p = r0
        L_0x02f8:
            int r0 = r7.K
            int r1 = r7.M
            int r3 = r7.O
            float r4 = r7.Q
            r6.q = r0
            r6.t = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r1) goto L_0x030a
            r3 = r2
        L_0x030a:
            r6.u = r3
            r6.v = r4
            int r3 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            r5 = 2
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r3 <= 0) goto L_0x031d
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x031d
            if (r0 != 0) goto L_0x031d
            r6.q = r5
        L_0x031d:
            int r0 = r7.L
            int r3 = r7.N
            int r4 = r7.P
            float r7 = r7.R
            r6.r = r0
            r6.w = r3
            if (r4 != r1) goto L_0x032c
            goto L_0x032d
        L_0x032c:
            r2 = r4
        L_0x032d:
            r6.x = r2
            r6.y = r7
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x033d
            int r1 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x033d
            if (r0 != 0) goto L_0x033d
            r6.r = r5
        L_0x033d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a(boolean, android.view.View, androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.widget.ConstraintLayout$a, android.util.SparseArray):void");
    }

    /* renamed from: c */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public Object d(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.g2;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.g2.get(str);
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<h0.g.c.a> arrayList = this.q;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.q.get(i).q();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(InstabugDbContract.COMMA_SEP);
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i4 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i5 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i4;
                        float f3 = (float) (i4 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f4 = (float) i5;
                        float f5 = f;
                        float f6 = f;
                        float f7 = f4;
                        Paint paint2 = paint;
                        float f8 = f3;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f5, f7, f8, f4, paint3);
                        float parseInt4 = (float) (i5 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f9 = f3;
                        float f10 = parseInt4;
                        canvas2.drawLine(f9, f7, f8, f10, paint3);
                        float f11 = parseInt4;
                        float f12 = f6;
                        canvas2.drawLine(f9, f11, f12, f10, paint3);
                        float f13 = f6;
                        canvas2.drawLine(f13, f11, f12, f4, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f14 = f3;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f13, f4, f14, parseInt4, paint6);
                        canvas2.drawLine(f13, parseInt4, f14, f4, paint6);
                    }
                }
            }
        }
    }

    public View f(int i) {
        return this.d.get(i);
    }

    public void forceLayout() {
        this.b2 = true;
        this.h2 = -1;
        this.i2 = -1;
        super.forceLayout();
    }

    public final ConstraintWidget g(View view) {
        if (view == this) {
            return this.x;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).f25p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).f25p0;
        }
        return null;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.a2;
    }

    public int getMaxWidth() {
        return this.Z1;
    }

    public int getMinHeight() {
        return this.Y1;
    }

    public int getMinWidth() {
        return this.y;
    }

    public int getOptimizationLevel() {
        return this.x.Z0;
    }

    public final void h(AttributeSet attributeSet, int i, int i3) {
        h0.g.a.h.c cVar = this.x;
        cVar.f6m0 = this;
        cVar.i0(this.k2);
        this.d.put(getId(), this);
        this.d2 = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout, i, i3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.y = obtainStyledAttributes.getDimensionPixelOffset(index, this.y);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.Y1 = obtainStyledAttributes.getDimensionPixelOffset(index, this.Y1);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.Z1 = obtainStyledAttributes.getDimensionPixelOffset(index, this.Z1);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.a2 = obtainStyledAttributes.getDimensionPixelOffset(index, this.a2);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.c2 = obtainStyledAttributes.getInt(index, this.c2);
                } else if (index == R.styleable.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.e2 = null;
                        }
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        c cVar2 = new c();
                        this.d2 = cVar2;
                        cVar2.j(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.d2 = null;
                    }
                    this.f2 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.x.j0(this.c2);
    }

    public boolean i() {
        if (!((getContext().getApplicationInfo().flags & 4194304) != 0) || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    public void j(int i) {
        this.e2 = new h0.g.c.b(getContext(), this, i);
    }

    public void onLayout(boolean z, int i, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            a aVar = (a) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = aVar.f25p0;
            if ((childAt.getVisibility() != 8 || aVar.c0 || aVar.d0 || isInEditMode) && !aVar.e0) {
                int x2 = constraintWidget.x();
                int y2 = constraintWidget.y();
                int w = constraintWidget.w() + x2;
                int q2 = constraintWidget.q() + y2;
                childAt.layout(x2, y2, w, q2);
                if ((childAt instanceof f) && (content = ((f) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(x2, y2, w, q2);
                }
            }
        }
        int size = this.q.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.q.get(i7).o();
            }
        }
    }

    public void onMeasure(int i, int i3) {
        boolean z;
        String str;
        int j;
        ConstraintWidget constraintWidget;
        int i4 = i;
        int i5 = i3;
        if (this.l2 == i4) {
            int i6 = this.m2;
        }
        int i7 = 0;
        if (!this.b2) {
            int childCount = getChildCount();
            int i8 = 0;
            while (true) {
                if (i8 >= childCount) {
                    break;
                } else if (getChildAt(i8).isLayoutRequested()) {
                    this.b2 = true;
                    break;
                } else {
                    i8++;
                }
            }
        }
        boolean z2 = this.b2;
        this.l2 = i4;
        this.m2 = i5;
        this.x.R0 = i();
        if (this.b2) {
            this.b2 = false;
            int childCount2 = getChildCount();
            int i9 = 0;
            while (true) {
                if (i9 >= childCount2) {
                    z = false;
                    break;
                } else if (getChildAt(i9).isLayoutRequested()) {
                    z = true;
                    break;
                } else {
                    i9++;
                }
            }
            if (z) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i10 = 0; i10 < childCount3; i10++) {
                    ConstraintWidget g = g(getChildAt(i10));
                    if (g != null) {
                        g.I();
                    }
                }
                if (isInEditMode) {
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        View childAt = getChildAt(i11);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            r(0, resourceName, Integer.valueOf(childAt.getId()));
                            int indexOf = resourceName.indexOf(47);
                            if (indexOf != -1) {
                                resourceName = resourceName.substring(indexOf + 1);
                            }
                            int id = childAt.getId();
                            if (id == 0) {
                                constraintWidget = this.x;
                            } else {
                                View view = this.d.get(id);
                                if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
                                    onViewAdded(view);
                                }
                                constraintWidget = view == this ? this.x : view == null ? null : ((a) view.getLayoutParams()).f25p0;
                            }
                            constraintWidget.f9p0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.f2 != -1) {
                    for (int i12 = 0; i12 < childCount3; i12++) {
                        View childAt2 = getChildAt(i12);
                        if (childAt2.getId() == this.f2 && (childAt2 instanceof d)) {
                            this.d2 = ((d) childAt2).getConstraintSet();
                        }
                    }
                }
                c cVar = this.d2;
                if (cVar != null) {
                    cVar.c(this, true);
                }
                this.x.M0.clear();
                int size = this.q.size();
                if (size > 0) {
                    int i13 = 0;
                    while (i13 < size) {
                        h0.g.c.a aVar = this.q.get(i13);
                        if (aVar.isInEditMode()) {
                            aVar.setIds(aVar.y);
                        }
                        h0.g.a.h.f fVar = aVar.x;
                        if (fVar != null) {
                            fVar.a();
                            for (int i14 = i7; i14 < aVar.d; i14++) {
                                int i15 = aVar.c[i14];
                                View f = f(i15);
                                if (f == null && (j = aVar.j(this, str)) != 0) {
                                    aVar.c[i14] = j;
                                    aVar.a2.put(Integer.valueOf(j), (str = aVar.a2.get(Integer.valueOf(i15))));
                                    f = f(j);
                                }
                                if (f != null) {
                                    aVar.x.b(g(f));
                                }
                            }
                            aVar.x.c(this.x);
                        }
                        i13++;
                        i7 = 0;
                    }
                }
                for (int i16 = 0; i16 < childCount3; i16++) {
                    View childAt3 = getChildAt(i16);
                    if (childAt3 instanceof f) {
                        f fVar2 = (f) childAt3;
                        if (fVar2.c == -1 && !fVar2.isInEditMode()) {
                            fVar2.setVisibility(fVar2.q);
                        }
                        View findViewById = findViewById(fVar2.c);
                        fVar2.d = findViewById;
                        if (findViewById != null) {
                            ((a) findViewById.getLayoutParams()).e0 = true;
                            fVar2.d.setVisibility(0);
                            fVar2.setVisibility(0);
                        }
                    }
                }
                this.j2.clear();
                this.j2.put(0, this.x);
                this.j2.put(getId(), this.x);
                for (int i17 = 0; i17 < childCount3; i17++) {
                    View childAt4 = getChildAt(i17);
                    this.j2.put(childAt4.getId(), g(childAt4));
                }
                for (int i18 = 0; i18 < childCount3; i18++) {
                    View childAt5 = getChildAt(i18);
                    ConstraintWidget g3 = g(childAt5);
                    if (g3 != null) {
                        a aVar2 = (a) childAt5.getLayoutParams();
                        h0.g.a.h.c cVar2 = this.x;
                        cVar2.M0.add(g3);
                        ConstraintWidget constraintWidget2 = g3.W;
                        if (constraintWidget2 != null) {
                            ((j) constraintWidget2).M0.remove(g3);
                            g3.I();
                        }
                        g3.W = cVar2;
                        a(isInEditMode, childAt5, g3, aVar2, this.j2);
                    }
                }
            }
            if (z) {
                h0.g.a.h.c cVar3 = this.x;
                cVar3.N0.c(cVar3);
            }
        }
        q(this.x, this.c2, i4, i5);
        int w = this.x.w();
        int q2 = this.x.q();
        h0.g.a.h.c cVar4 = this.x;
        p(i, i3, w, q2, cVar4.a1, cVar4.b1);
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget g = g(view);
        if ((view instanceof Guideline) && !(g instanceof e)) {
            a aVar = (a) view.getLayoutParams();
            e eVar = new e();
            aVar.f25p0 = eVar;
            aVar.c0 = true;
            eVar.Y(aVar.U);
        }
        if (view instanceof h0.g.c.a) {
            h0.g.c.a aVar2 = (h0.g.c.a) view;
            aVar2.s();
            ((a) view.getLayoutParams()).d0 = true;
            if (!this.q.contains(aVar2)) {
                this.q.add(aVar2);
            }
        }
        this.d.put(view.getId(), view);
        this.b2 = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.d.remove(view.getId());
        ConstraintWidget g = g(view);
        this.x.M0.remove(g);
        g.I();
        this.q.remove(view);
        this.b2 = true;
    }

    public void p(int i, int i3, int i4, int i5, boolean z, boolean z2) {
        b bVar = this.k2;
        int i6 = bVar.e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i4 + bVar.d, i, 0);
        int min = Math.min(this.Z1, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.a2, ViewGroup.resolveSizeAndState(i5 + i6, i3, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.h2 = min;
        this.i2 = min2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:193:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0512  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x0516 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:403:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ad A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(h0.g.a.h.c r24, int r25, int r26, int r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = android.view.View.MeasureSpec.getMode(r26)
            int r4 = android.view.View.MeasureSpec.getSize(r26)
            int r5 = android.view.View.MeasureSpec.getMode(r27)
            int r6 = android.view.View.MeasureSpec.getSize(r27)
            int r7 = r23.getPaddingTop()
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)
            int r9 = r23.getPaddingBottom()
            int r9 = java.lang.Math.max(r8, r9)
            int r10 = r7 + r9
            int r11 = r23.getPaddingWidth()
            androidx.constraintlayout.widget.ConstraintLayout$b r12 = r0.k2
            r12.b = r7
            r12.c = r9
            r12.d = r11
            r12.e = r10
            r9 = r26
            r12.f = r9
            r9 = r27
            r12.g = r9
            int r9 = r23.getPaddingStart()
            int r9 = java.lang.Math.max(r8, r9)
            int r12 = r23.getPaddingEnd()
            int r12 = java.lang.Math.max(r8, r12)
            if (r9 > 0) goto L_0x005d
            if (r12 <= 0) goto L_0x0054
            goto L_0x005d
        L_0x0054:
            int r9 = r23.getPaddingLeft()
            int r9 = java.lang.Math.max(r8, r9)
            goto L_0x0064
        L_0x005d:
            boolean r13 = r23.i()
            if (r13 == 0) goto L_0x0064
            r9 = r12
        L_0x0064:
            int r4 = r4 - r11
            int r6 = r6 - r10
            androidx.constraintlayout.widget.ConstraintLayout$b r10 = r0.k2
            int r11 = r10.e
            int r10 = r10.d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            int r13 = r23.getChildCount()
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r3 == r14) goto L_0x0098
            if (r3 == 0) goto L_0x0088
            if (r3 == r15) goto L_0x007e
            r15 = r12
            goto L_0x0093
        L_0x007e:
            int r15 = r0.Z1
            int r15 = r15 - r10
            int r15 = java.lang.Math.min(r15, r4)
            r8 = r14
            r14 = r12
            goto L_0x00ae
        L_0x0088:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r13 != 0) goto L_0x0093
            int r14 = r0.y
            int r14 = java.lang.Math.max(r8, r14)
            goto L_0x00a2
        L_0x0093:
            r14 = r15
            r15 = r8
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x00ae
        L_0x0098:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r13 != 0) goto L_0x00aa
            int r14 = r0.y
            int r14 = java.lang.Math.max(r8, r14)
        L_0x00a2:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r22 = r15
            r15 = r14
            r14 = r22
            goto L_0x00ae
        L_0x00aa:
            r14 = r15
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = r4
        L_0x00ae:
            if (r5 == r8) goto L_0x00d0
            if (r5 == 0) goto L_0x00c0
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r8) goto L_0x00b7
            goto L_0x00ce
        L_0x00b7:
            int r8 = r0.a2
            int r8 = r8 - r11
            int r8 = java.lang.Math.min(r8, r6)
            r13 = r8
            goto L_0x00dd
        L_0x00c0:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r13 != 0) goto L_0x00ce
            int r8 = r0.Y1
            r13 = 0
            int r16 = java.lang.Math.max(r13, r8)
            r13 = r16
            goto L_0x00dd
        L_0x00ce:
            r13 = 0
            goto L_0x00dd
        L_0x00d0:
            r8 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r13 != 0) goto L_0x00dc
            int r13 = r0.Y1
            int r13 = java.lang.Math.max(r8, r13)
            goto L_0x00dd
        L_0x00dc:
            r13 = r6
        L_0x00dd:
            int r8 = r24.w()
            r27 = r6
            r6 = 1
            if (r15 != r8) goto L_0x00ec
            int r8 = r24.q()
            if (r13 == r8) goto L_0x00f0
        L_0x00ec:
            h0.g.a.h.k.e r8 = r1.O0
            r8.c = r6
        L_0x00f0:
            r8 = 0
            r1.b0 = r8
            r1.c0 = r8
            int r6 = r0.Z1
            int r6 = r6 - r10
            r18 = r4
            int[] r4 = r1.D
            r4[r8] = r6
            int r6 = r0.a2
            int r6 = r6 - r11
            r16 = 1
            r4[r16] = r6
            r1.S(r8)
            r1.R(r8)
            r1.Q(r14)
            r1.U(r15)
            r1.T(r12)
            r1.P(r13)
            int r4 = r0.y
            int r4 = r4 - r10
            r1.S(r4)
            int r4 = r0.Y1
            int r4 = r4 - r11
            r1.R(r4)
            r1.T0 = r9
            r1.U0 = r7
            h0.g.a.h.k.b r4 = r1.N0
            java.util.Objects.requireNonNull(r4)
            h0.g.a.h.k.b$b r6 = r1.Q0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r7 = r1.M0
            int r7 = r7.size()
            int r8 = r24.w()
            int r9 = r24.q()
            r10 = 128(0x80, float:1.794E-43)
            boolean r10 = h0.g.a.h.h.b(r2, r10)
            r11 = 64
            if (r10 != 0) goto L_0x014f
            boolean r2 = h0.g.a.h.h.b(r2, r11)
            if (r2 == 0) goto L_0x014d
            goto L_0x014f
        L_0x014d:
            r2 = 0
            goto L_0x0150
        L_0x014f:
            r2 = 1
        L_0x0150:
            if (r2 == 0) goto L_0x01a9
            r13 = 0
        L_0x0153:
            if (r13 >= r7) goto L_0x01a9
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r14 = r1.M0
            java.lang.Object r14 = r14.get(r13)
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r14
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = r14.r()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r15 != r11) goto L_0x0167
            r15 = 1
            goto L_0x0168
        L_0x0167:
            r15 = 0
        L_0x0168:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r14.v()
            if (r12 != r11) goto L_0x0170
            r11 = 1
            goto L_0x0171
        L_0x0170:
            r11 = 0
        L_0x0171:
            if (r15 == 0) goto L_0x017e
            if (r11 == 0) goto L_0x017e
            float r11 = r14.Z
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x017e
            r11 = 1
            goto L_0x017f
        L_0x017e:
            r11 = 0
        L_0x017f:
            boolean r12 = r14.D()
            if (r12 == 0) goto L_0x0188
            if (r11 == 0) goto L_0x0188
            goto L_0x01a8
        L_0x0188:
            boolean r12 = r14.E()
            if (r12 == 0) goto L_0x0191
            if (r11 == 0) goto L_0x0191
            goto L_0x01a8
        L_0x0191:
            boolean r11 = r14 instanceof h0.g.a.h.i
            if (r11 == 0) goto L_0x0196
            goto L_0x01a8
        L_0x0196:
            boolean r11 = r14.D()
            if (r11 != 0) goto L_0x01a8
            boolean r11 = r14.E()
            if (r11 == 0) goto L_0x01a3
            goto L_0x01a8
        L_0x01a3:
            int r13 = r13 + 1
            r11 = 64
            goto L_0x0153
        L_0x01a8:
            r2 = 0
        L_0x01a9:
            r11 = 1073741824(0x40000000, float:2.0)
            if (r3 != r11) goto L_0x01af
            if (r5 == r11) goto L_0x01b1
        L_0x01af:
            if (r10 == 0) goto L_0x01b3
        L_0x01b1:
            r11 = 1
            goto L_0x01b4
        L_0x01b3:
            r11 = 0
        L_0x01b4:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x0469
            int[] r12 = r1.D
            r13 = 0
            r12 = r12[r13]
            r13 = r18
            int r12 = java.lang.Math.min(r12, r13)
            int[] r13 = r1.D
            r14 = 1
            r13 = r13[r14]
            r14 = r27
            int r13 = java.lang.Math.min(r13, r14)
            r14 = 1073741824(0x40000000, float:2.0)
            if (r3 != r14) goto L_0x01dd
            int r15 = r24.w()
            if (r15 == r12) goto L_0x01dd
            r1.U(r12)
            r24.f0()
        L_0x01dd:
            if (r5 != r14) goto L_0x01eb
            int r12 = r24.q()
            if (r12 == r13) goto L_0x01eb
            r1.P(r13)
            r24.f0()
        L_0x01eb:
            if (r3 != r14) goto L_0x03bc
            if (r5 != r14) goto L_0x03bc
            h0.g.a.h.k.e r12 = r1.O0
            r13 = 1
            r10 = r10 & r13
            boolean r13 = r12.b
            if (r13 != 0) goto L_0x01fe
            boolean r13 = r12.c
            if (r13 == 0) goto L_0x01fc
            goto L_0x01fe
        L_0x01fc:
            r15 = 0
            goto L_0x023b
        L_0x01fe:
            h0.g.a.h.c r13 = r12.a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r13 = r13.M0
            java.util.Iterator r13 = r13.iterator()
        L_0x0206:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0223
            java.lang.Object r14 = r13.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r14
            r14.m()
            r15 = 0
            r14.a = r15
            h0.g.a.h.k.j r11 = r14.d
            r11.n()
            h0.g.a.h.k.l r11 = r14.e
            r11.m()
            goto L_0x0206
        L_0x0223:
            r15 = 0
            h0.g.a.h.c r11 = r12.a
            r11.m()
            h0.g.a.h.c r11 = r12.a
            r11.a = r15
            h0.g.a.h.k.j r11 = r11.d
            r11.n()
            h0.g.a.h.c r11 = r12.a
            h0.g.a.h.k.l r11 = r11.e
            r11.m()
            r12.c = r15
        L_0x023b:
            h0.g.a.h.c r11 = r12.d
            r12.b(r11)
            h0.g.a.h.c r11 = r12.a
            r11.b0 = r15
            r11.c0 = r15
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r11.p(r15)
            h0.g.a.h.c r13 = r12.a
            r14 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = r13.p(r14)
            boolean r14 = r12.b
            if (r14 == 0) goto L_0x0258
            r12.c()
        L_0x0258:
            h0.g.a.h.c r14 = r12.a
            int r14 = r14.x()
            h0.g.a.h.c r15 = r12.a
            int r15 = r15.y()
            h0.g.a.h.c r0 = r12.a
            h0.g.a.h.k.j r0 = r0.d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.h
            r0.c(r14)
            h0.g.a.h.c r0 = r12.a
            h0.g.a.h.k.l r0 = r0.e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.h
            r0.c(r15)
            r12.g()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r11 == r0) goto L_0x0285
            if (r13 != r0) goto L_0x0280
            goto L_0x0285
        L_0x0280:
            r18 = r2
            r20 = r6
            goto L_0x02f1
        L_0x0285:
            if (r10 == 0) goto L_0x02a0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r12.e
            java.util.Iterator r0 = r0.iterator()
        L_0x028d:
            boolean r18 = r0.hasNext()
            if (r18 == 0) goto L_0x02a0
            java.lang.Object r18 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r18 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r18
            boolean r18 = r18.k()
            if (r18 != 0) goto L_0x028d
            r10 = 0
        L_0x02a0:
            if (r10 == 0) goto L_0x02c9
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r11 != r0) goto L_0x02c9
            h0.g.a.h.c r0 = r12.a
            r18 = r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0.Q(r2)
            h0.g.a.h.c r0 = r12.a
            r20 = r6
            r2 = 0
            int r6 = r12.d(r0, r2)
            r0.U(r6)
            h0.g.a.h.c r0 = r12.a
            h0.g.a.h.k.j r2 = r0.d
            h0.g.a.h.k.f r2 = r2.e
            int r0 = r0.w()
            r2.c(r0)
            goto L_0x02cd
        L_0x02c9:
            r18 = r2
            r20 = r6
        L_0x02cd:
            if (r10 == 0) goto L_0x02f1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r13 != r0) goto L_0x02f1
            h0.g.a.h.c r0 = r12.a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0.T(r2)
            h0.g.a.h.c r0 = r12.a
            r2 = 1
            int r6 = r12.d(r0, r2)
            r0.P(r6)
            h0.g.a.h.c r0 = r12.a
            h0.g.a.h.k.l r2 = r0.e
            h0.g.a.h.k.f r2 = r2.e
            int r0 = r0.q()
            r2.c(r0)
        L_0x02f1:
            h0.g.a.h.c r0 = r12.a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r0.V
            r6 = 0
            r10 = r2[r6]
            r21 = r8
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r10 == r8) goto L_0x0307
            r2 = r2[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r2 != r6) goto L_0x0305
            goto L_0x0307
        L_0x0305:
            r0 = 0
            goto L_0x034d
        L_0x0307:
            int r0 = r0.w()
            int r0 = r0 + r14
            h0.g.a.h.c r2 = r12.a
            h0.g.a.h.k.j r2 = r2.d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.i
            r2.c(r0)
            h0.g.a.h.c r2 = r12.a
            h0.g.a.h.k.j r2 = r2.d
            h0.g.a.h.k.f r2 = r2.e
            int r0 = r0 - r14
            r2.c(r0)
            r12.g()
            h0.g.a.h.c r0 = r12.a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r0.V
            r6 = 1
            r10 = r2[r6]
            if (r10 == r8) goto L_0x0331
            r2 = r2[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r2 != r6) goto L_0x0349
        L_0x0331:
            int r0 = r0.q()
            int r0 = r0 + r15
            h0.g.a.h.c r2 = r12.a
            h0.g.a.h.k.l r2 = r2.e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.i
            r2.c(r0)
            h0.g.a.h.c r2 = r12.a
            h0.g.a.h.k.l r2 = r2.e
            h0.g.a.h.k.f r2 = r2.e
            int r0 = r0 - r15
            r2.c(r0)
        L_0x0349:
            r12.g()
            r0 = 1
        L_0x034d:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r2 = r12.e
            java.util.Iterator r2 = r2.iterator()
        L_0x0353:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x036e
            java.lang.Object r6 = r2.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r6 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r6
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r6.b
            h0.g.a.h.c r10 = r12.a
            if (r8 != r10) goto L_0x036a
            boolean r8 = r6.g
            if (r8 != 0) goto L_0x036a
            goto L_0x0353
        L_0x036a:
            r6.e()
            goto L_0x0353
        L_0x036e:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r2 = r12.e
            java.util.Iterator r2 = r2.iterator()
        L_0x0374:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x03ab
            java.lang.Object r6 = r2.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r6 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r6
            if (r0 != 0) goto L_0x0389
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r6.b
            h0.g.a.h.c r10 = r12.a
            if (r8 != r10) goto L_0x0389
            goto L_0x0374
        L_0x0389:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r8 = r6.h
            boolean r8 = r8.j
            if (r8 != 0) goto L_0x0390
            goto L_0x03a9
        L_0x0390:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r8 = r6.i
            boolean r8 = r8.j
            if (r8 != 0) goto L_0x039b
            boolean r8 = r6 instanceof h0.g.a.h.k.h
            if (r8 != 0) goto L_0x039b
            goto L_0x03a9
        L_0x039b:
            h0.g.a.h.k.f r8 = r6.e
            boolean r8 = r8.j
            if (r8 != 0) goto L_0x0374
            boolean r8 = r6 instanceof h0.g.a.h.k.c
            if (r8 != 0) goto L_0x0374
            boolean r6 = r6 instanceof h0.g.a.h.k.h
            if (r6 != 0) goto L_0x0374
        L_0x03a9:
            r0 = 0
            goto L_0x03ac
        L_0x03ab:
            r0 = 1
        L_0x03ac:
            h0.g.a.h.c r2 = r12.a
            r2.Q(r11)
            h0.g.a.h.c r2 = r12.a
            r2.T(r13)
            r6 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            r2 = 2
            goto L_0x0459
        L_0x03bc:
            r18 = r2
            r20 = r6
            r21 = r8
            h0.g.a.h.k.e r0 = r1.O0
            boolean r2 = r0.b
            if (r2 == 0) goto L_0x041f
            h0.g.a.h.c r2 = r0.a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r2 = r2.M0
            java.util.Iterator r2 = r2.iterator()
        L_0x03d0:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x03f9
            java.lang.Object r6 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r6
            r6.m()
            r8 = 0
            r6.a = r8
            h0.g.a.h.k.j r11 = r6.d
            h0.g.a.h.k.f r12 = r11.e
            r12.j = r8
            r11.g = r8
            r11.n()
            h0.g.a.h.k.l r6 = r6.e
            h0.g.a.h.k.f r11 = r6.e
            r11.j = r8
            r6.g = r8
            r6.m()
            goto L_0x03d0
        L_0x03f9:
            r8 = 0
            h0.g.a.h.c r2 = r0.a
            r2.m()
            h0.g.a.h.c r2 = r0.a
            r2.a = r8
            h0.g.a.h.k.j r2 = r2.d
            h0.g.a.h.k.f r6 = r2.e
            r6.j = r8
            r2.g = r8
            r2.n()
            h0.g.a.h.c r2 = r0.a
            h0.g.a.h.k.l r2 = r2.e
            h0.g.a.h.k.f r6 = r2.e
            r6.j = r8
            r2.g = r8
            r2.m()
            r0.c()
            goto L_0x0420
        L_0x041f:
            r8 = 0
        L_0x0420:
            h0.g.a.h.c r2 = r0.d
            r0.b(r2)
            h0.g.a.h.c r2 = r0.a
            r2.b0 = r8
            r2.c0 = r8
            h0.g.a.h.k.j r2 = r2.d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.h
            r2.c(r8)
            h0.g.a.h.c r0 = r0.a
            h0.g.a.h.k.l r0 = r0.e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.h
            r0.c(r8)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r3 != r0) goto L_0x044a
            boolean r2 = r1.e0(r10, r8)
            r6 = 1
            r17 = r2 & 1
            r2 = r6
            r8 = r17
            goto L_0x044d
        L_0x044a:
            r6 = 1
            r8 = r6
            r2 = 0
        L_0x044d:
            if (r5 != r0) goto L_0x0458
            boolean r10 = r1.e0(r10, r6)
            r6 = r8 & r10
            int r2 = r2 + 1
            goto L_0x0459
        L_0x0458:
            r6 = r8
        L_0x0459:
            if (r6 == 0) goto L_0x0471
            if (r3 != r0) goto L_0x045f
            r3 = 1
            goto L_0x0460
        L_0x045f:
            r3 = 0
        L_0x0460:
            if (r5 != r0) goto L_0x0464
            r0 = 1
            goto L_0x0465
        L_0x0464:
            r0 = 0
        L_0x0465:
            r1.V(r3, r0)
            goto L_0x0471
        L_0x0469:
            r18 = r2
            r20 = r6
            r21 = r8
            r2 = 0
            r6 = 0
        L_0x0471:
            if (r6 == 0) goto L_0x0476
            r0 = 2
            if (r2 == r0) goto L_0x0738
        L_0x0476:
            int r0 = r1.Z0
            r2 = 8
            if (r7 <= 0) goto L_0x0595
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r3 = r1.M0
            int r3 = r3.size()
            r5 = 64
            boolean r5 = r1.h0(r5)
            h0.g.a.h.k.b$b r6 = r1.Q0
            r8 = 0
        L_0x048b:
            if (r8 >= r3) goto L_0x051a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r10 = r1.M0
            java.lang.Object r10 = r10.get(r8)
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r10
            boolean r11 = r10 instanceof h0.g.a.h.e
            if (r11 == 0) goto L_0x049a
            goto L_0x04ba
        L_0x049a:
            boolean r11 = r10 instanceof h0.g.a.h.a
            if (r11 == 0) goto L_0x049f
            goto L_0x04ba
        L_0x049f:
            boolean r11 = r10.H
            if (r11 == 0) goto L_0x04a4
            goto L_0x04ba
        L_0x04a4:
            if (r5 == 0) goto L_0x04bc
            h0.g.a.h.k.j r11 = r10.d
            if (r11 == 0) goto L_0x04bc
            h0.g.a.h.k.l r12 = r10.e
            if (r12 == 0) goto L_0x04bc
            h0.g.a.h.k.f r11 = r11.e
            boolean r11 = r11.j
            if (r11 == 0) goto L_0x04bc
            h0.g.a.h.k.f r11 = r12.e
            boolean r11 = r11.j
            if (r11 == 0) goto L_0x04bc
        L_0x04ba:
            r12 = 0
            goto L_0x0516
        L_0x04bc:
            r11 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r10.p(r11)
            r11 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = r10.p(r11)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r12 != r14) goto L_0x04d6
            int r15 = r10.q
            if (r15 == r11) goto L_0x04d6
            if (r13 != r14) goto L_0x04d6
            int r15 = r10.r
            if (r15 == r11) goto L_0x04d6
            r15 = r11
            goto L_0x04d7
        L_0x04d6:
            r15 = 0
        L_0x04d7:
            if (r15 != 0) goto L_0x050e
            boolean r19 = r1.h0(r11)
            if (r19 == 0) goto L_0x050e
            boolean r11 = r10 instanceof h0.g.a.h.i
            if (r11 != 0) goto L_0x050e
            if (r12 != r14) goto L_0x04f2
            int r11 = r10.q
            if (r11 != 0) goto L_0x04f2
            if (r13 == r14) goto L_0x04f2
            boolean r11 = r10.D()
            if (r11 != 0) goto L_0x04f2
            r15 = 1
        L_0x04f2:
            if (r13 != r14) goto L_0x0501
            int r11 = r10.r
            if (r11 != 0) goto L_0x0501
            if (r12 == r14) goto L_0x0501
            boolean r11 = r10.D()
            if (r11 != 0) goto L_0x0501
            r15 = 1
        L_0x0501:
            if (r12 == r14) goto L_0x0505
            if (r13 != r14) goto L_0x050e
        L_0x0505:
            float r11 = r10.Z
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x050f
            r15 = 1
            goto L_0x050f
        L_0x050e:
            r12 = 0
        L_0x050f:
            if (r15 == 0) goto L_0x0512
            goto L_0x0516
        L_0x0512:
            r11 = 0
            r4.a(r6, r10, r11)
        L_0x0516:
            int r8 = r8 + 1
            goto L_0x048b
        L_0x051a:
            androidx.constraintlayout.widget.ConstraintLayout$b r6 = (androidx.constraintlayout.widget.ConstraintLayout.b) r6
            androidx.constraintlayout.widget.ConstraintLayout r3 = r6.a
            int r3 = r3.getChildCount()
            r13 = 0
        L_0x0523:
            if (r13 >= r3) goto L_0x0578
            androidx.constraintlayout.widget.ConstraintLayout r5 = r6.a
            android.view.View r5 = r5.getChildAt(r13)
            boolean r8 = r5 instanceof h0.g.c.f
            if (r8 == 0) goto L_0x0575
            h0.g.c.f r5 = (h0.g.c.f) r5
            android.view.View r8 = r5.d
            if (r8 != 0) goto L_0x0536
            goto L_0x0575
        L_0x0536:
            android.view.ViewGroup$LayoutParams r8 = r5.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8
            android.view.View r5 = r5.d
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r5 = (androidx.constraintlayout.widget.ConstraintLayout.a) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r5.f25p0
            r11 = 0
            r10.f8o0 = r11
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r8.f25p0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = r10.r()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r10 == r11) goto L_0x055e
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r8.f25p0
            androidx.constraintlayout.core.widgets.ConstraintWidget r12 = r5.f25p0
            int r12 = r12.w()
            r10.U(r12)
        L_0x055e:
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r8.f25p0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = r10.v()
            if (r10 == r11) goto L_0x0571
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r8.f25p0
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r5.f25p0
            int r10 = r10.q()
            r8.P(r10)
        L_0x0571:
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f25p0
            r5.f8o0 = r2
        L_0x0575:
            int r13 = r13 + 1
            goto L_0x0523
        L_0x0578:
            androidx.constraintlayout.widget.ConstraintLayout r3 = r6.a
            java.util.ArrayList<h0.g.c.a> r3 = r3.q
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0595
            r13 = 0
        L_0x0583:
            if (r13 >= r3) goto L_0x0595
            androidx.constraintlayout.widget.ConstraintLayout r5 = r6.a
            java.util.ArrayList<h0.g.c.a> r5 = r5.q
            java.lang.Object r5 = r5.get(r13)
            h0.g.c.a r5 = (h0.g.c.a) r5
            r5.p()
            int r13 = r13 + 1
            goto L_0x0583
        L_0x0595:
            r4.c(r1)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r3 = r4.a
            int r3 = r3.size()
            r5 = r21
            r13 = 0
            if (r7 <= 0) goto L_0x05a6
            r4.b(r1, r13, r5, r9)
        L_0x05a6:
            if (r3 <= 0) goto L_0x0730
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r24.r()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r6 != r7) goto L_0x05b2
            r6 = 1
            goto L_0x05b3
        L_0x05b2:
            r6 = r13
        L_0x05b3:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r24.v()
            if (r8 != r7) goto L_0x05bb
            r7 = 1
            goto L_0x05bc
        L_0x05bb:
            r7 = r13
        L_0x05bc:
            int r8 = r24.w()
            h0.g.a.h.c r10 = r4.c
            int r10 = r10.f2i0
            int r8 = java.lang.Math.max(r8, r10)
            int r10 = r24.q()
            h0.g.a.h.c r11 = r4.c
            int r11 = r11.f3j0
            int r10 = java.lang.Math.max(r10, r11)
            r11 = r13
            r12 = r11
        L_0x05d6:
            if (r11 >= r3) goto L_0x065d
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r14 = r4.a
            java.lang.Object r14 = r14.get(r11)
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r14
            boolean r15 = r14 instanceof h0.g.a.h.i
            if (r15 != 0) goto L_0x05e9
            r19 = r0
            r2 = r20
            goto L_0x0652
        L_0x05e9:
            int r15 = r14.w()
            int r13 = r14.q()
            r19 = r0
            r2 = r20
            r0 = 1
            boolean r20 = r4.a(r2, r14, r0)
            r0 = r12 | r20
            int r12 = r14.w()
            r26 = r0
            int r0 = r14.q()
            if (r12 == r15) goto L_0x0628
            r14.U(r12)
            if (r6 == 0) goto L_0x0626
            int r12 = r14.u()
            if (r12 <= r8) goto L_0x0626
            int r12 = r14.u()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r15 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r14.n(r15)
            int r15 = r15.e()
            int r15 = r15 + r12
            int r8 = java.lang.Math.max(r8, r15)
        L_0x0626:
            r12 = 1
            goto L_0x062a
        L_0x0628:
            r12 = r26
        L_0x062a:
            if (r0 == r13) goto L_0x064c
            r14.P(r0)
            if (r7 == 0) goto L_0x064b
            int r0 = r14.o()
            if (r0 <= r10) goto L_0x064b
            int r0 = r14.o()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r14.n(r12)
            int r12 = r12.e()
            int r12 = r12 + r0
            int r0 = java.lang.Math.max(r10, r12)
            r10 = r0
        L_0x064b:
            r12 = 1
        L_0x064c:
            h0.g.a.h.i r14 = (h0.g.a.h.i) r14
            boolean r0 = r14.U0
            r0 = r0 | r12
            r12 = r0
        L_0x0652:
            int r11 = r11 + 1
            r20 = r2
            r0 = r19
            r2 = 8
            r13 = 0
            goto L_0x05d6
        L_0x065d:
            r19 = r0
            r2 = r20
            r0 = 2
            r13 = 0
        L_0x0663:
            if (r13 >= r0) goto L_0x0732
            r11 = 0
        L_0x0666:
            if (r11 >= r3) goto L_0x071a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r14 = r4.a
            java.lang.Object r14 = r14.get(r11)
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r14
            boolean r15 = r14 instanceof h0.g.a.h.f
            if (r15 == 0) goto L_0x0678
            boolean r15 = r14 instanceof h0.g.a.h.i
            if (r15 == 0) goto L_0x067c
        L_0x0678:
            boolean r15 = r14 instanceof h0.g.a.h.e
            if (r15 == 0) goto L_0x067f
        L_0x067c:
            r0 = 8
            goto L_0x069d
        L_0x067f:
            int r15 = r14.f8o0
            r0 = 8
            if (r15 != r0) goto L_0x0686
            goto L_0x069d
        L_0x0686:
            if (r18 == 0) goto L_0x0699
            h0.g.a.h.k.j r15 = r14.d
            h0.g.a.h.k.f r15 = r15.e
            boolean r15 = r15.j
            if (r15 == 0) goto L_0x0699
            h0.g.a.h.k.l r15 = r14.e
            h0.g.a.h.k.f r15 = r15.e
            boolean r15 = r15.j
            if (r15 == 0) goto L_0x0699
            goto L_0x069d
        L_0x0699:
            boolean r15 = r14 instanceof h0.g.a.h.i
            if (r15 == 0) goto L_0x06a1
        L_0x069d:
            r26 = r3
            goto L_0x0711
        L_0x06a1:
            int r15 = r14.w()
            int r0 = r14.q()
            r26 = r3
            int r3 = r14.f1h0
            r1 = 1
            if (r13 != r1) goto L_0x06b1
            r1 = 2
        L_0x06b1:
            boolean r1 = r4.a(r2, r14, r1)
            r1 = r1 | r12
            int r12 = r14.w()
            r20 = r1
            int r1 = r14.q()
            if (r12 == r15) goto L_0x06e2
            r14.U(r12)
            if (r6 == 0) goto L_0x06e0
            int r12 = r14.u()
            if (r12 <= r8) goto L_0x06e0
            int r12 = r14.u()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r15 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r14.n(r15)
            int r15 = r15.e()
            int r15 = r15 + r12
            int r8 = java.lang.Math.max(r8, r15)
        L_0x06e0:
            r20 = 1
        L_0x06e2:
            if (r1 == r0) goto L_0x0705
            r14.P(r1)
            if (r7 == 0) goto L_0x0703
            int r0 = r14.o()
            if (r0 <= r10) goto L_0x0703
            int r0 = r14.o()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r14.n(r1)
            int r1 = r1.e()
            int r1 = r1 + r0
            int r0 = java.lang.Math.max(r10, r1)
            r10 = r0
        L_0x0703:
            r20 = 1
        L_0x0705:
            boolean r0 = r14.F
            if (r0 == 0) goto L_0x070f
            int r0 = r14.f1h0
            if (r3 == r0) goto L_0x070f
            r12 = 1
            goto L_0x0711
        L_0x070f:
            r12 = r20
        L_0x0711:
            int r11 = r11 + 1
            r1 = r24
            r3 = r26
            r0 = 2
            goto L_0x0666
        L_0x071a:
            r26 = r3
            if (r12 == 0) goto L_0x072d
            int r13 = r13 + 1
            r0 = r24
            r1 = 1
            r4.b(r0, r13, r5, r9)
            r3 = r26
            r1 = r0
            r0 = 2
            r12 = 0
            goto L_0x0663
        L_0x072d:
            r0 = r24
            goto L_0x0733
        L_0x0730:
            r19 = r0
        L_0x0732:
            r0 = r1
        L_0x0733:
            r1 = r19
            r0.j0(r1)
        L_0x0738:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.q(h0.g.a.h.c, int, int, int):void");
    }

    public void r(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.g2 == null) {
                this.g2 = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.g2.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void requestLayout() {
        this.b2 = true;
        this.h2 = -1;
        this.i2 = -1;
        super.requestLayout();
    }

    public final void s(ConstraintWidget constraintWidget, a aVar, SparseArray<ConstraintWidget> sparseArray, int i, ConstraintAnchor.Type type) {
        View view = this.d.get(i);
        ConstraintWidget constraintWidget2 = sparseArray.get(i);
        if (constraintWidget2 != null && view != null && (view.getLayoutParams() instanceof a)) {
            aVar.b0 = true;
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
            if (type == type2) {
                a aVar2 = (a) view.getLayoutParams();
                aVar2.b0 = true;
                aVar2.f25p0.F = true;
            }
            constraintWidget.n(type2).b(constraintWidget2.n(type), aVar.C, aVar.B, true);
            constraintWidget.F = true;
            constraintWidget.n(ConstraintAnchor.Type.TOP).k();
            constraintWidget.n(ConstraintAnchor.Type.BOTTOM).k();
        }
    }

    public void setConstraintSet(c cVar) {
        this.d2 = cVar;
    }

    public void setId(int i) {
        this.d.remove(getId());
        super.setId(i);
        this.d.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.a2) {
            this.a2 = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.Z1) {
            this.Z1 = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.Y1) {
            this.Y1 = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.y) {
            this.y = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(h0.g.c.e eVar) {
        h0.g.c.b bVar = this.e2;
        if (bVar != null) {
            Objects.requireNonNull(bVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.c2 = i;
        h0.g.a.h.c cVar = this.x;
        cVar.Z0 = i;
        h0.g.a.d.a = cVar.h0(512);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h(attributeSet, i, 0);
    }

    public static class a extends ViewGroup.MarginLayoutParams {
        public int A = Integer.MIN_VALUE;
        public int B = Integer.MIN_VALUE;
        public int C = 0;
        public float D = 0.5f;
        public float E = 0.5f;
        public String F = null;
        public float G = -1.0f;
        public float H = -1.0f;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = 0;
        public int P = 0;
        public float Q = 1.0f;
        public float R = 1.0f;
        public int S = -1;
        public int T = -1;
        public int U = -1;
        public boolean V = false;
        public boolean W = false;
        public String X = null;
        public int Y = 0;
        public boolean Z = true;
        public int a = -1;
        public boolean a0 = true;
        public int b = -1;
        public boolean b0 = false;
        public float c = -1.0f;
        public boolean c0 = false;
        public int d = -1;
        public boolean d0 = false;
        public int e = -1;
        public boolean e0 = false;
        public int f = -1;
        public int f0 = -1;
        public int g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public int f16g0 = -1;
        public int h = -1;

        /* renamed from: h0  reason: collision with root package name */
        public int f17h0 = -1;
        public int i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public int f18i0 = -1;
        public int j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public int f19j0 = Integer.MIN_VALUE;
        public int k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public int f20k0 = Integer.MIN_VALUE;
        public int l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public float f21l0 = 0.5f;
        public int m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public int f22m0;
        public int n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public int f23n0;
        public int o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public float f24o0;
        public int p = 0;

        /* renamed from: p0  reason: collision with root package name */
        public ConstraintWidget f25p0 = new ConstraintWidget();
        public float q = 0.0f;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = Integer.MIN_VALUE;
        public int w = Integer.MIN_VALUE;
        public int x = Integer.MIN_VALUE;
        public int y = Integer.MIN_VALUE;
        public int z = Integer.MIN_VALUE;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a  reason: collision with other inner class name */
        public static class C0001a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                SparseIntArray sparseIntArray2 = a;
                sparseIntArray2.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray2.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray2.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray2.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray2.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray2.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray2.append(R.styleable.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray2.append(R.styleable.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C0001a.a.get(index);
                switch (i3) {
                    case 1:
                        this.U = obtainStyledAttributes.getInt(index, this.U);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.o);
                        this.o = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.o = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.p = obtainStyledAttributes.getDimensionPixelSize(index, this.p);
                        break;
                    case 4:
                        float f2 = obtainStyledAttributes.getFloat(index, this.q) % 360.0f;
                        this.q = f2;
                        if (f2 >= 0.0f) {
                            break;
                        } else {
                            this.q = (360.0f - f2) % 360.0f;
                            break;
                        }
                    case 5:
                        this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.d);
                        this.d = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.r);
                        this.r = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        break;
                    case 22:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 23:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 24:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 25:
                        this.z = obtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case 26:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 27:
                        this.V = obtainStyledAttributes.getBoolean(index, this.V);
                        break;
                    case 28:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 29:
                        this.D = obtainStyledAttributes.getFloat(index, this.D);
                        break;
                    case 30:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 31:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.K = i4;
                        if (i4 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.L = i5;
                        if (i5 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.M) != -2) {
                                break;
                            } else {
                                this.M = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.O) != -2) {
                                break;
                            } else {
                                this.O = -2;
                                break;
                            }
                        }
                    case 35:
                        this.Q = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.Q));
                        this.K = 2;
                        break;
                    case 36:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.N) != -2) {
                                break;
                            } else {
                                this.N = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.P) != -2) {
                                break;
                            } else {
                                this.P = -2;
                                break;
                            }
                        }
                    case 38:
                        this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                c.m(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.G = obtainStyledAttributes.getFloat(index, this.G);
                                break;
                            case 46:
                                this.H = obtainStyledAttributes.getFloat(index, this.H);
                                break;
                            case 47:
                                this.I = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.J = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.S = obtainStyledAttributes.getDimensionPixelOffset(index, this.S);
                                break;
                            case 50:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                break;
                            case 51:
                                this.X = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.m);
                                this.m = resourceId15;
                                if (resourceId15 != -1) {
                                    break;
                                } else {
                                    this.m = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId16;
                                if (resourceId16 != -1) {
                                    break;
                                } else {
                                    this.n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 54:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 55:
                                this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                break;
                            default:
                                switch (i3) {
                                    case 64:
                                        c.l(this, obtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        c.l(this, obtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.c0 = false;
            this.Z = true;
            this.a0 = true;
            int i2 = this.width;
            if (i2 == -2 && this.V) {
                this.Z = false;
                if (this.K == 0) {
                    this.K = 1;
                }
            }
            int i3 = this.height;
            if (i3 == -2 && this.W) {
                this.a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.Z = false;
                if (i2 == 0 && this.K == 1) {
                    this.width = -2;
                    this.V = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.a0 = false;
                if (i3 == 0 && this.L == 1) {
                    this.height = -2;
                    this.W = true;
                }
            }
            if (this.c != -1.0f || this.a != -1 || this.b != -1) {
                this.c0 = true;
                this.Z = true;
                this.a0 = true;
                if (!(this.f25p0 instanceof e)) {
                    this.f25p0 = new e();
                }
                ((e) this.f25p0).Y(this.U);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0082  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L_0x0011
                r11 = r3
                goto L_0x0012
            L_0x0011:
                r11 = r2
            L_0x0012:
                r4 = -1
                r10.f17h0 = r4
                r10.f18i0 = r4
                r10.f0 = r4
                r10.f16g0 = r4
                r10.f19j0 = r4
                r10.f20k0 = r4
                int r5 = r10.v
                r10.f19j0 = r5
                int r5 = r10.x
                r10.f20k0 = r5
                float r5 = r10.D
                r10.f21l0 = r5
                int r6 = r10.a
                r10.f22m0 = r6
                int r7 = r10.b
                r10.f23n0 = r7
                float r8 = r10.c
                r10.f24o0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x0094
                int r11 = r10.r
                if (r11 == r4) goto L_0x0043
                r10.f17h0 = r11
            L_0x0041:
                r2 = r3
                goto L_0x004a
            L_0x0043:
                int r11 = r10.s
                if (r11 == r4) goto L_0x004a
                r10.f18i0 = r11
                goto L_0x0041
            L_0x004a:
                int r11 = r10.t
                if (r11 == r4) goto L_0x0051
                r10.f16g0 = r11
                r2 = r3
            L_0x0051:
                int r11 = r10.u
                if (r11 == r4) goto L_0x0058
                r10.f0 = r11
                r2 = r3
            L_0x0058:
                int r11 = r10.z
                if (r11 == r9) goto L_0x005e
                r10.f20k0 = r11
            L_0x005e:
                int r11 = r10.A
                if (r11 == r9) goto L_0x0064
                r10.f19j0 = r11
            L_0x0064:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x006c
                float r2 = r11 - r5
                r10.f21l0 = r2
            L_0x006c:
                boolean r2 = r10.c0
                if (r2 == 0) goto L_0x00b8
                int r2 = r10.U
                if (r2 != r3) goto L_0x00b8
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0082
                float r11 = r11 - r8
                r10.f24o0 = r11
                r10.f22m0 = r4
                r10.f23n0 = r4
                goto L_0x00b8
            L_0x0082:
                if (r6 == r4) goto L_0x008b
                r10.f23n0 = r6
                r10.f22m0 = r4
                r10.f24o0 = r2
                goto L_0x00b8
            L_0x008b:
                if (r7 == r4) goto L_0x00b8
                r10.f22m0 = r7
                r10.f23n0 = r4
                r10.f24o0 = r2
                goto L_0x00b8
            L_0x0094:
                int r11 = r10.r
                if (r11 == r4) goto L_0x009a
                r10.f16g0 = r11
            L_0x009a:
                int r11 = r10.s
                if (r11 == r4) goto L_0x00a0
                r10.f0 = r11
            L_0x00a0:
                int r11 = r10.t
                if (r11 == r4) goto L_0x00a6
                r10.f17h0 = r11
            L_0x00a6:
                int r11 = r10.u
                if (r11 == r4) goto L_0x00ac
                r10.f18i0 = r11
            L_0x00ac:
                int r11 = r10.z
                if (r11 == r9) goto L_0x00b2
                r10.f19j0 = r11
            L_0x00b2:
                int r11 = r10.A
                if (r11 == r9) goto L_0x00b8
                r10.f20k0 = r11
            L_0x00b8:
                int r11 = r10.t
                if (r11 != r4) goto L_0x0102
                int r11 = r10.u
                if (r11 != r4) goto L_0x0102
                int r11 = r10.s
                if (r11 != r4) goto L_0x0102
                int r11 = r10.r
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f
                if (r11 == r4) goto L_0x00d7
                r10.f17h0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
                goto L_0x00e5
            L_0x00d7:
                int r11 = r10.g
                if (r11 == r4) goto L_0x00e5
                r10.f18i0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
            L_0x00e5:
                int r11 = r10.d
                if (r11 == r4) goto L_0x00f4
                r10.f0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
                goto L_0x0102
            L_0x00f4:
                int r11 = r10.e
                if (r11 == r4) goto L_0x0102
                r10.f16g0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
            L_0x0102:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }

        public a(int i2, int i3) {
            super(i2, i3);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
