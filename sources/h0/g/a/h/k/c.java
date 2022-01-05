package h0.g.a.h.k;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ChainRun */
public class c extends WidgetRun {
    public ArrayList<WidgetRun> k = new ArrayList<>();
    public int l;

    public c(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        ConstraintWidget constraintWidget2;
        Object obj;
        int i2;
        Object obj2;
        this.f = i;
        ConstraintWidget constraintWidget3 = this.b;
        ConstraintWidget t = constraintWidget3.t(i);
        while (true) {
            ConstraintWidget constraintWidget4 = t;
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = constraintWidget4;
            if (constraintWidget3 == null) {
                break;
            }
            t = constraintWidget3.t(this.f);
        }
        this.b = constraintWidget2;
        ArrayList<WidgetRun> arrayList = this.k;
        int i3 = this.f;
        if (i3 == 0) {
            obj = constraintWidget2.d;
        } else {
            obj = i3 == 1 ? constraintWidget2.e : null;
        }
        arrayList.add(obj);
        ConstraintWidget s = constraintWidget2.s(this.f);
        while (s != null) {
            ArrayList<WidgetRun> arrayList2 = this.k;
            int i4 = this.f;
            if (i4 == 0) {
                obj2 = s.d;
            } else {
                obj2 = i4 == 1 ? s.e : null;
            }
            arrayList2.add(obj2);
            s = s.s(this.f);
        }
        Iterator<WidgetRun> it = this.k.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            int i5 = this.f;
            if (i5 == 0) {
                next.b.b = this;
            } else if (i5 == 1) {
                next.b.c = this;
            }
        }
        if ((this.f == 0 && ((h0.g.a.h.c) this.b.W).R0) && this.k.size() > 1) {
            ArrayList<WidgetRun> arrayList3 = this.k;
            this.b = arrayList3.get(arrayList3.size() - 1).b;
        }
        if (this.f == 0) {
            i2 = this.b.B0;
        } else {
            i2 = this.b.C0;
        }
        this.l = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(h0.g.a.h.k.d r26) {
        /*
            r25 = this;
            r0 = r25
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.h
            boolean r2 = r1.j
            if (r2 == 0) goto L_0x03f5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r0.i
            boolean r3 = r2.j
            if (r3 != 0) goto L_0x0010
            goto L_0x03f5
        L_0x0010:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.b
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.W
            boolean r4 = r3 instanceof h0.g.a.h.c
            if (r4 == 0) goto L_0x001d
            h0.g.a.h.c r3 = (h0.g.a.h.c) r3
            boolean r3 = r3.R0
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            int r2 = r2.g
            int r1 = r1.g
            int r2 = r2 - r1
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r1 = r0.k
            int r1 = r1.size()
            r4 = 0
        L_0x002a:
            r6 = -1
            r7 = 8
            if (r4 >= r1) goto L_0x0040
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r8 = r0.k
            java.lang.Object r8 = r8.get(r4)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r8 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r8
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r8.b
            int r8 = r8.f8o0
            if (r8 != r7) goto L_0x0041
            int r4 = r4 + 1
            goto L_0x002a
        L_0x0040:
            r4 = r6
        L_0x0041:
            int r8 = r1 + -1
            r9 = r8
        L_0x0044:
            if (r9 < 0) goto L_0x0058
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r10 = r0.k
            java.lang.Object r10 = r10.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r10 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r10
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r10.b
            int r10 = r10.f8o0
            if (r10 != r7) goto L_0x0057
            int r9 = r9 + -1
            goto L_0x0044
        L_0x0057:
            r6 = r9
        L_0x0058:
            r9 = 0
        L_0x0059:
            r11 = 2
            if (r9 >= r11) goto L_0x00f8
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0063:
            if (r13 >= r1) goto L_0x00ea
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r5 = r0.k
            java.lang.Object r5 = r5.get(r13)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r5.b
            int r10 = r11.f8o0
            if (r10 != r7) goto L_0x0075
            goto L_0x00e3
        L_0x0075:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x0080
            if (r13 < r4) goto L_0x0080
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r5.h
            int r10 = r10.f
            int r14 = r14 + r10
        L_0x0080:
            h0.g.a.h.k.f r10 = r5.e
            int r7 = r10.g
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r5.d
            r19 = r7
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r12 == r7) goto L_0x008e
            r7 = 1
            goto L_0x008f
        L_0x008e:
            r7 = 0
        L_0x008f:
            if (r7 == 0) goto L_0x00ad
            int r10 = r0.f
            if (r10 != 0) goto L_0x009e
            h0.g.a.h.k.j r12 = r11.d
            h0.g.a.h.k.f r12 = r12.e
            boolean r12 = r12.j
            if (r12 != 0) goto L_0x009e
            return
        L_0x009e:
            r12 = 1
            if (r10 != r12) goto L_0x00aa
            h0.g.a.h.k.l r10 = r11.e
            h0.g.a.h.k.f r10 = r10.e
            boolean r10 = r10.j
            if (r10 != 0) goto L_0x00aa
            return
        L_0x00aa:
            r20 = r7
            goto L_0x00c4
        L_0x00ad:
            r20 = r7
            r12 = 1
            int r7 = r5.a
            if (r7 != r12) goto L_0x00bb
            if (r9 != 0) goto L_0x00bb
            int r7 = r10.m
            int r15 = r15 + 1
            goto L_0x00c1
        L_0x00bb:
            boolean r7 = r10.j
            if (r7 == 0) goto L_0x00c4
            r7 = r19
        L_0x00c1:
            r20 = 1
            goto L_0x00c6
        L_0x00c4:
            r7 = r19
        L_0x00c6:
            if (r20 != 0) goto L_0x00d8
            int r15 = r15 + 1
            float[] r7 = r11.F0
            int r10 = r0.f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00d9
            float r17 = r17 + r7
            goto L_0x00d9
        L_0x00d8:
            int r14 = r14 + r7
        L_0x00d9:
            if (r13 >= r8) goto L_0x00e3
            if (r13 >= r6) goto L_0x00e3
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r5.i
            int r5 = r5.f
            int r5 = -r5
            int r14 = r14 + r5
        L_0x00e3:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x0063
        L_0x00ea:
            if (r14 < r2) goto L_0x00f5
            if (r15 != 0) goto L_0x00ef
            goto L_0x00f5
        L_0x00ef:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0059
        L_0x00f5:
            r5 = r16
            goto L_0x00fd
        L_0x00f8:
            r5 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x00fd:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r0.h
            int r7 = r7.g
            if (r3 == 0) goto L_0x0107
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r0.i
            int r7 = r7.g
        L_0x0107:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r2) goto L_0x011e
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L_0x0117
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L_0x011e
        L_0x0117:
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L_0x011e:
            if (r15 <= 0) goto L_0x01ff
            int r10 = r2 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x012a:
            if (r12 >= r1) goto L_0x01b3
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r9 = r0.k
            java.lang.Object r9 = r9.get(r12)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r9 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r9
            r19 = r11
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r9.b
            r20 = r14
            int r14 = r11.f8o0
            r21 = r7
            r7 = 8
            if (r14 != r7) goto L_0x0143
            goto L_0x019b
        L_0x0143:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r9.d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r14) goto L_0x019b
            h0.g.a.h.k.f r7 = r9.e
            boolean r14 = r7.j
            if (r14 != 0) goto L_0x019b
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x0164
            float[] r14 = r11.F0
            r22 = r3
            int r3 = r0.f
            r3 = r14[r3]
            float r3 = r3 * r10
            float r3 = r3 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r14
            int r3 = (int) r3
            goto L_0x0168
        L_0x0164:
            r22 = r3
            r3 = r19
        L_0x0168:
            int r14 = r0.f
            if (r14 != 0) goto L_0x0171
            int r14 = r11.u
            int r11 = r11.t
            goto L_0x0175
        L_0x0171:
            int r14 = r11.x
            int r11 = r11.w
        L_0x0175:
            r23 = r10
            int r10 = r9.a
            r24 = r5
            r5 = 1
            if (r10 != r5) goto L_0x0185
            int r5 = r7.m
            int r5 = java.lang.Math.min(r3, r5)
            goto L_0x0186
        L_0x0185:
            r5 = r3
        L_0x0186:
            int r5 = java.lang.Math.max(r11, r5)
            if (r14 <= 0) goto L_0x0190
            int r5 = java.lang.Math.min(r14, r5)
        L_0x0190:
            if (r5 == r3) goto L_0x0195
            int r13 = r13 + 1
            r3 = r5
        L_0x0195:
            h0.g.a.h.k.f r5 = r9.e
            r5.c(r3)
            goto L_0x01a1
        L_0x019b:
            r22 = r3
            r24 = r5
            r23 = r10
        L_0x01a1:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r3 = r22
            r10 = r23
            r5 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x012a
        L_0x01b3:
            r22 = r3
            r24 = r5
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x01f0
            int r15 = r15 - r13
            r3 = 0
            r5 = 0
        L_0x01c0:
            if (r3 >= r1) goto L_0x01ee
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r7 = r0.k
            java.lang.Object r7 = r7.get(r3)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r7
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r7.b
            int r9 = r9.f8o0
            r10 = 8
            if (r9 != r10) goto L_0x01d3
            goto L_0x01eb
        L_0x01d3:
            if (r3 <= 0) goto L_0x01dc
            if (r3 < r4) goto L_0x01dc
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r7.h
            int r9 = r9.f
            int r5 = r5 + r9
        L_0x01dc:
            h0.g.a.h.k.f r9 = r7.e
            int r9 = r9.g
            int r5 = r5 + r9
            if (r3 >= r8) goto L_0x01eb
            if (r3 >= r6) goto L_0x01eb
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r7.i
            int r7 = r7.f
            int r7 = -r7
            int r5 = r5 + r7
        L_0x01eb:
            int r3 = r3 + 1
            goto L_0x01c0
        L_0x01ee:
            r14 = r5
            goto L_0x01f2
        L_0x01f0:
            r14 = r20
        L_0x01f2:
            int r3 = r0.l
            r5 = 2
            if (r3 != r5) goto L_0x01fd
            if (r13 != 0) goto L_0x01fd
            r3 = 0
            r0.l = r3
            goto L_0x0209
        L_0x01fd:
            r3 = 0
            goto L_0x0209
        L_0x01ff:
            r22 = r3
            r24 = r5
            r21 = r7
            r20 = r14
            r3 = 0
            r5 = 2
        L_0x0209:
            if (r14 <= r2) goto L_0x020d
            r0.l = r5
        L_0x020d:
            if (r24 <= 0) goto L_0x0215
            if (r15 != 0) goto L_0x0215
            if (r4 != r6) goto L_0x0215
            r0.l = r5
        L_0x0215:
            int r5 = r0.l
            r7 = 1
            if (r5 != r7) goto L_0x02b7
            r9 = r24
            if (r9 <= r7) goto L_0x0223
            int r2 = r2 - r14
            int r5 = r9 + -1
            int r2 = r2 / r5
            goto L_0x022a
        L_0x0223:
            if (r9 != r7) goto L_0x0229
            int r2 = r2 - r14
            r5 = 2
            int r2 = r2 / r5
            goto L_0x022a
        L_0x0229:
            r2 = r3
        L_0x022a:
            if (r15 <= 0) goto L_0x022d
            r2 = r3
        L_0x022d:
            r5 = r3
            r7 = r21
        L_0x0230:
            if (r5 >= r1) goto L_0x03f5
            if (r22 == 0) goto L_0x0239
            int r3 = r5 + 1
            int r3 = r1 - r3
            goto L_0x023a
        L_0x0239:
            r3 = r5
        L_0x023a:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r9 = r0.k
            java.lang.Object r3 = r9.get(r3)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r3.b
            int r9 = r9.f8o0
            r10 = 8
            if (r9 != r10) goto L_0x0255
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.h
            r9.c(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.i
            r3.c(r7)
            goto L_0x02b3
        L_0x0255:
            if (r5 <= 0) goto L_0x025c
            if (r22 == 0) goto L_0x025b
            int r7 = r7 - r2
            goto L_0x025c
        L_0x025b:
            int r7 = r7 + r2
        L_0x025c:
            if (r5 <= 0) goto L_0x026d
            if (r5 < r4) goto L_0x026d
            if (r22 == 0) goto L_0x0268
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.h
            int r9 = r9.f
            int r7 = r7 - r9
            goto L_0x026d
        L_0x0268:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.h
            int r9 = r9.f
            int r7 = r7 + r9
        L_0x026d:
            if (r22 == 0) goto L_0x0275
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.i
            r9.c(r7)
            goto L_0x027a
        L_0x0275:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.h
            r9.c(r7)
        L_0x027a:
            h0.g.a.h.k.f r9 = r3.e
            int r10 = r9.g
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r3.d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x028b
            int r11 = r3.a
            r12 = 1
            if (r11 != r12) goto L_0x028b
            int r10 = r9.m
        L_0x028b:
            if (r22 == 0) goto L_0x028f
            int r7 = r7 - r10
            goto L_0x0290
        L_0x028f:
            int r7 = r7 + r10
        L_0x0290:
            if (r22 == 0) goto L_0x0298
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.h
            r9.c(r7)
            goto L_0x029d
        L_0x0298:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.i
            r9.c(r7)
        L_0x029d:
            r9 = 1
            r3.g = r9
            if (r5 >= r8) goto L_0x02b3
            if (r5 >= r6) goto L_0x02b3
            if (r22 == 0) goto L_0x02ad
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.i
            int r3 = r3.f
            int r3 = -r3
            int r7 = r7 - r3
            goto L_0x02b3
        L_0x02ad:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.i
            int r3 = r3.f
            int r3 = -r3
            int r7 = r7 + r3
        L_0x02b3:
            int r5 = r5 + 1
            goto L_0x0230
        L_0x02b7:
            r9 = r24
            if (r5 != 0) goto L_0x034c
            int r2 = r2 - r14
            r5 = 1
            int r7 = r9 + 1
            int r2 = r2 / r7
            if (r15 <= 0) goto L_0x02c3
            r2 = r3
        L_0x02c3:
            r5 = r3
            r7 = r21
        L_0x02c6:
            if (r5 >= r1) goto L_0x03f5
            if (r22 == 0) goto L_0x02cf
            int r3 = r5 + 1
            int r3 = r1 - r3
            goto L_0x02d0
        L_0x02cf:
            r3 = r5
        L_0x02d0:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r9 = r0.k
            java.lang.Object r3 = r9.get(r3)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r3.b
            int r9 = r9.f8o0
            r10 = 8
            if (r9 != r10) goto L_0x02eb
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.h
            r9.c(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.i
            r3.c(r7)
            goto L_0x0348
        L_0x02eb:
            if (r22 == 0) goto L_0x02ef
            int r7 = r7 - r2
            goto L_0x02f0
        L_0x02ef:
            int r7 = r7 + r2
        L_0x02f0:
            if (r5 <= 0) goto L_0x0301
            if (r5 < r4) goto L_0x0301
            if (r22 == 0) goto L_0x02fc
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.h
            int r9 = r9.f
            int r7 = r7 - r9
            goto L_0x0301
        L_0x02fc:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.h
            int r9 = r9.f
            int r7 = r7 + r9
        L_0x0301:
            if (r22 == 0) goto L_0x0309
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.i
            r9.c(r7)
            goto L_0x030e
        L_0x0309:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.h
            r9.c(r7)
        L_0x030e:
            h0.g.a.h.k.f r9 = r3.e
            int r10 = r9.g
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r3.d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x0323
            int r11 = r3.a
            r12 = 1
            if (r11 != r12) goto L_0x0323
            int r9 = r9.m
            int r10 = java.lang.Math.min(r10, r9)
        L_0x0323:
            if (r22 == 0) goto L_0x0327
            int r7 = r7 - r10
            goto L_0x0328
        L_0x0327:
            int r7 = r7 + r10
        L_0x0328:
            if (r22 == 0) goto L_0x0330
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.h
            r9.c(r7)
            goto L_0x0335
        L_0x0330:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.i
            r9.c(r7)
        L_0x0335:
            if (r5 >= r8) goto L_0x0348
            if (r5 >= r6) goto L_0x0348
            if (r22 == 0) goto L_0x0342
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.i
            int r3 = r3.f
            int r3 = -r3
            int r7 = r7 - r3
            goto L_0x0348
        L_0x0342:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.i
            int r3 = r3.f
            int r3 = -r3
            int r7 = r7 + r3
        L_0x0348:
            int r5 = r5 + 1
            goto L_0x02c6
        L_0x034c:
            r7 = 2
            if (r5 != r7) goto L_0x03f5
            int r5 = r0.f
            if (r5 != 0) goto L_0x0358
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r0.b
            float r5 = r5.f4k0
            goto L_0x035c
        L_0x0358:
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r0.b
            float r5 = r5.f5l0
        L_0x035c:
            if (r22 == 0) goto L_0x0362
            r7 = 1065353216(0x3f800000, float:1.0)
            float r5 = r7 - r5
        L_0x0362:
            int r2 = r2 - r14
            float r2 = (float) r2
            float r2 = r2 * r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r5
            int r2 = (int) r2
            if (r2 < 0) goto L_0x036d
            if (r15 <= 0) goto L_0x036e
        L_0x036d:
            r2 = r3
        L_0x036e:
            if (r22 == 0) goto L_0x0373
            int r7 = r21 - r2
            goto L_0x0375
        L_0x0373:
            int r7 = r21 + r2
        L_0x0375:
            r5 = r3
        L_0x0376:
            if (r5 >= r1) goto L_0x03f5
            if (r22 == 0) goto L_0x037f
            int r2 = r5 + 1
            int r2 = r1 - r2
            goto L_0x0380
        L_0x037f:
            r2 = r5
        L_0x0380:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r3 = r0.k
            java.lang.Object r2 = r3.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r2.b
            int r3 = r3.f8o0
            r9 = 8
            if (r3 != r9) goto L_0x039c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r2.h
            r3.c(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.i
            r2.c(r7)
            r12 = 1
            goto L_0x03f2
        L_0x039c:
            if (r5 <= 0) goto L_0x03ad
            if (r5 < r4) goto L_0x03ad
            if (r22 == 0) goto L_0x03a8
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r2.h
            int r3 = r3.f
            int r7 = r7 - r3
            goto L_0x03ad
        L_0x03a8:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r2.h
            int r3 = r3.f
            int r7 = r7 + r3
        L_0x03ad:
            if (r22 == 0) goto L_0x03b5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r2.i
            r3.c(r7)
            goto L_0x03ba
        L_0x03b5:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r2.h
            r3.c(r7)
        L_0x03ba:
            h0.g.a.h.k.f r3 = r2.e
            int r10 = r3.g
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r2.d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03cc
            int r11 = r2.a
            r12 = 1
            if (r11 != r12) goto L_0x03cd
            int r10 = r3.m
            goto L_0x03cd
        L_0x03cc:
            r12 = 1
        L_0x03cd:
            if (r22 == 0) goto L_0x03d1
            int r7 = r7 - r10
            goto L_0x03d2
        L_0x03d1:
            int r7 = r7 + r10
        L_0x03d2:
            if (r22 == 0) goto L_0x03da
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r2.h
            r3.c(r7)
            goto L_0x03df
        L_0x03da:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r2.i
            r3.c(r7)
        L_0x03df:
            if (r5 >= r8) goto L_0x03f2
            if (r5 >= r6) goto L_0x03f2
            if (r22 == 0) goto L_0x03ec
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.i
            int r2 = r2.f
            int r2 = -r2
            int r7 = r7 - r2
            goto L_0x03f2
        L_0x03ec:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.i
            int r2 = r2.f
            int r2 = -r2
            int r7 = r7 + r2
        L_0x03f2:
            int r5 = r5 + 1
            goto L_0x0376
        L_0x03f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.a.h.k.c.a(h0.g.a.h.k.d):void");
    }

    public void d() {
        Iterator<WidgetRun> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.k.size();
        if (size >= 1) {
            ConstraintWidget constraintWidget = this.k.get(0).b;
            ConstraintWidget constraintWidget2 = this.k.get(size - 1).b;
            if (this.f == 0) {
                ConstraintAnchor constraintAnchor = constraintWidget.K;
                ConstraintAnchor constraintAnchor2 = constraintWidget2.M;
                DependencyNode i = i(constraintAnchor, 0);
                int e = constraintAnchor.e();
                ConstraintWidget m = m();
                if (m != null) {
                    e = m.K.e();
                }
                if (i != null) {
                    DependencyNode dependencyNode = this.h;
                    dependencyNode.l.add(i);
                    dependencyNode.f = e;
                    i.k.add(dependencyNode);
                }
                DependencyNode i2 = i(constraintAnchor2, 0);
                int e2 = constraintAnchor2.e();
                ConstraintWidget n = n();
                if (n != null) {
                    e2 = n.M.e();
                }
                if (i2 != null) {
                    DependencyNode dependencyNode2 = this.i;
                    dependencyNode2.l.add(i2);
                    dependencyNode2.f = -e2;
                    i2.k.add(dependencyNode2);
                }
            } else {
                ConstraintAnchor constraintAnchor3 = constraintWidget.L;
                ConstraintAnchor constraintAnchor4 = constraintWidget2.N;
                DependencyNode i3 = i(constraintAnchor3, 1);
                int e3 = constraintAnchor3.e();
                ConstraintWidget m2 = m();
                if (m2 != null) {
                    e3 = m2.L.e();
                }
                if (i3 != null) {
                    DependencyNode dependencyNode3 = this.h;
                    dependencyNode3.l.add(i3);
                    dependencyNode3.f = e3;
                    i3.k.add(dependencyNode3);
                }
                DependencyNode i4 = i(constraintAnchor4, 1);
                int e4 = constraintAnchor4.e();
                ConstraintWidget n2 = n();
                if (n2 != null) {
                    e4 = n2.N.e();
                }
                if (i4 != null) {
                    DependencyNode dependencyNode4 = this.i;
                    dependencyNode4.l.add(i4);
                    dependencyNode4.f = -e4;
                    i4.k.add(dependencyNode4);
                }
            }
            this.h.a = this;
            this.i.a = this;
        }
    }

    public void e() {
        for (int i = 0; i < this.k.size(); i++) {
            this.k.get(i).e();
        }
    }

    public void f() {
        this.c = null;
        Iterator<WidgetRun> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public long j() {
        int size = this.k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            WidgetRun widgetRun = this.k.get(i);
            j = ((long) widgetRun.i.f) + widgetRun.j() + j + ((long) widgetRun.h.f);
        }
        return j;
    }

    public boolean k() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            if (!this.k.get(i).k()) {
                return false;
            }
        }
        return true;
    }

    public final ConstraintWidget m() {
        for (int i = 0; i < this.k.size(); i++) {
            ConstraintWidget constraintWidget = this.k.get(i).b;
            if (constraintWidget.f8o0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final ConstraintWidget n() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = this.k.get(size).b;
            if (constraintWidget.f8o0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        Iterator<WidgetRun> it = this.k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
