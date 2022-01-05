package h0.b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import h0.b0.j;

/* compiled from: Visibility */
public abstract class e0 extends j {
    public static final String[] t2 = {"android:visibility:visibility", "android:visibility:parent"};
    public int u2 = 3;

    /* compiled from: Visibility */
    public static class a extends AnimatorListenerAdapter implements j.d {
        public final View a;
        public final int b;
        public final ViewGroup c;
        public final boolean d;
        public boolean e;
        public boolean f = false;

        public a(View view, int i, boolean z) {
            this.a = view;
            this.b = i;
            this.c = (ViewGroup) view.getParent();
            this.d = z;
            g(true);
        }

        public void a(j jVar) {
        }

        public void b(j jVar) {
            g(false);
        }

        public void c(j jVar) {
            f();
            jVar.y(this);
        }

        public void d(j jVar) {
        }

        public void e(j jVar) {
            g(true);
        }

        public final void f() {
            if (!this.f) {
                w.a.f(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z) {
            ViewGroup viewGroup;
            if (this.d && this.e != z && (viewGroup = this.c) != null) {
                this.e = z;
                u.a(viewGroup, z);
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        public void onAnimationEnd(Animator animator) {
            f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f) {
                w.a.f(this.a, this.b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f) {
                w.a.f(this.a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: Visibility */
    public static class b {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    public final void M(r rVar) {
        rVar.a.put("android:visibility:visibility", Integer.valueOf(rVar.b.getVisibility()));
        rVar.a.put("android:visibility:parent", rVar.b.getParent());
        int[] iArr = new int[2];
        rVar.b.getLocationOnScreen(iArr);
        rVar.a.put("android:visibility:screenLocation", iArr);
    }

    public final b N(r rVar, r rVar2) {
        b bVar = new b();
        bVar.a = false;
        bVar.b = false;
        if (rVar == null || !rVar.a.containsKey("android:visibility:visibility")) {
            bVar.c = -1;
            bVar.e = null;
        } else {
            bVar.c = ((Integer) rVar.a.get("android:visibility:visibility")).intValue();
            bVar.e = (ViewGroup) rVar.a.get("android:visibility:parent");
        }
        if (rVar2 == null || !rVar2.a.containsKey("android:visibility:visibility")) {
            bVar.d = -1;
            bVar.f = null;
        } else {
            bVar.d = ((Integer) rVar2.a.get("android:visibility:visibility")).intValue();
            bVar.f = (ViewGroup) rVar2.a.get("android:visibility:parent");
        }
        if (rVar != null && rVar2 != null) {
            int i = bVar.c;
            int i2 = bVar.d;
            if (i == i2 && bVar.e == bVar.f) {
                return bVar;
            }
            if (i != i2) {
                if (i == 0) {
                    bVar.b = false;
                    bVar.a = true;
                } else if (i2 == 0) {
                    bVar.b = true;
                    bVar.a = true;
                }
            } else if (bVar.f == null) {
                bVar.b = false;
                bVar.a = true;
            } else if (bVar.e == null) {
                bVar.b = true;
                bVar.a = true;
            }
        } else if (rVar == null && bVar.d == 0) {
            bVar.b = true;
            bVar.a = true;
        } else if (rVar2 == null && bVar.c == 0) {
            bVar.b = false;
            bVar.a = true;
        }
        return bVar;
    }

    public abstract Animator O(ViewGroup viewGroup, View view, r rVar, r rVar2);

    public abstract Animator P(ViewGroup viewGroup, View view, r rVar, r rVar2);

    public void f(r rVar) {
        M(rVar);
    }

    /* JADX WARNING: type inference failed for: r17v9, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r0.N(r0.q(r4, false), r0.t(r4, false)).a != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x020f, code lost:
        if (r0.j2 != false) goto L_0x0211;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator n(android.view.ViewGroup r24, h0.b0.r r25, h0.b0.r r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            h0.b0.e0$b r4 = r0.N(r2, r3)
            boolean r5 = r4.a
            if (r5 == 0) goto L_0x02a4
            android.view.ViewGroup r5 = r4.e
            if (r5 != 0) goto L_0x0018
            android.view.ViewGroup r5 = r4.f
            if (r5 == 0) goto L_0x02a4
        L_0x0018:
            boolean r5 = r4.b
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x004a
            int r4 = r0.u2
            r4 = r4 & r7
            if (r4 != r7) goto L_0x0048
            if (r3 != 0) goto L_0x0026
            goto L_0x0048
        L_0x0026:
            if (r2 != 0) goto L_0x0041
            android.view.View r4 = r3.b
            android.view.ViewParent r4 = r4.getParent()
            android.view.View r4 = (android.view.View) r4
            h0.b0.r r5 = r0.q(r4, r8)
            h0.b0.r r4 = r0.t(r4, r8)
            h0.b0.e0$b r4 = r0.N(r5, r4)
            boolean r4 = r4.a
            if (r4 == 0) goto L_0x0041
            goto L_0x0048
        L_0x0041:
            android.view.View r4 = r3.b
            android.animation.Animator r6 = r0.O(r1, r4, r2, r3)
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            return r6
        L_0x004a:
            int r4 = r4.d
            int r5 = r0.u2
            r9 = 2
            r5 = r5 & r9
            if (r5 == r9) goto L_0x0055
        L_0x0052:
            r6 = 0
            goto L_0x02a3
        L_0x0055:
            if (r2 != 0) goto L_0x0058
            goto L_0x0052
        L_0x0058:
            android.view.View r5 = r2.b
            if (r3 == 0) goto L_0x005f
            android.view.View r10 = r3.b
            goto L_0x0060
        L_0x005f:
            r10 = 0
        L_0x0060:
            int r11 = androidx.transition.R.id.save_overlay_view
            java.lang.Object r12 = r5.getTag(r11)
            android.view.View r12 = (android.view.View) r12
            if (r12 == 0) goto L_0x0071
            r17 = r4
            r21 = r11
            r10 = 0
            goto L_0x021f
        L_0x0071:
            if (r10 == 0) goto L_0x0082
            android.view.ViewParent r12 = r10.getParent()
            if (r12 != 0) goto L_0x007a
            goto L_0x0082
        L_0x007a:
            r12 = 4
            if (r4 != r12) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            if (r5 != r10) goto L_0x0088
        L_0x0080:
            r13 = r8
            goto L_0x008a
        L_0x0082:
            if (r10 == 0) goto L_0x0088
            r13 = r8
            r12 = r10
            r10 = 0
            goto L_0x008b
        L_0x0088:
            r13 = r7
            r10 = 0
        L_0x008a:
            r12 = 0
        L_0x008b:
            if (r13 == 0) goto L_0x0216
            android.view.ViewParent r13 = r5.getParent()
            if (r13 != 0) goto L_0x009b
            r17 = r4
            r19 = r10
            r21 = r11
            goto L_0x0211
        L_0x009b:
            android.view.ViewParent r13 = r5.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 == 0) goto L_0x0216
            android.view.ViewParent r13 = r5.getParent()
            android.view.View r13 = (android.view.View) r13
            h0.b0.r r14 = r0.t(r13, r7)
            h0.b0.r r15 = r0.q(r13, r7)
            h0.b0.e0$b r14 = r0.N(r14, r15)
            boolean r14 = r14.a
            if (r14 != 0) goto L_0x01f2
            boolean r12 = h0.b0.q.a
            android.graphics.Matrix r12 = new android.graphics.Matrix
            r12.<init>()
            int r14 = r13.getScrollX()
            int r14 = -r14
            float r14 = (float) r14
            int r13 = r13.getScrollY()
            int r13 = -r13
            float r13 = (float) r13
            r12.setTranslate(r14, r13)
            h0.b0.c0 r13 = h0.b0.w.a
            r13.g(r5, r12)
            r13.h(r1, r12)
            android.graphics.RectF r13 = new android.graphics.RectF
            int r14 = r5.getWidth()
            float r14 = (float) r14
            int r15 = r5.getHeight()
            float r15 = (float) r15
            r6 = 0
            r13.<init>(r6, r6, r14, r15)
            r12.mapRect(r13)
            float r6 = r13.left
            int r6 = java.lang.Math.round(r6)
            float r14 = r13.top
            int r14 = java.lang.Math.round(r14)
            float r15 = r13.right
            int r15 = java.lang.Math.round(r15)
            float r9 = r13.bottom
            int r9 = java.lang.Math.round(r9)
            android.widget.ImageView r8 = new android.widget.ImageView
            android.content.Context r7 = r5.getContext()
            r8.<init>(r7)
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_CROP
            r8.setScaleType(r7)
            boolean r7 = h0.b0.q.a
            if (r7 == 0) goto L_0x0124
            boolean r7 = r5.isAttachedToWindow()
            r16 = 1
            r7 = r7 ^ 1
            if (r1 != 0) goto L_0x011f
            goto L_0x0125
        L_0x011f:
            boolean r17 = r24.isAttachedToWindow()
            goto L_0x0127
        L_0x0124:
            r7 = 0
        L_0x0125:
            r17 = 0
        L_0x0127:
            boolean r18 = h0.b0.q.b
            if (r18 == 0) goto L_0x0158
            if (r7 == 0) goto L_0x0158
            if (r17 != 0) goto L_0x0138
            r17 = r4
            r19 = r10
            r21 = r11
            r0 = 0
            goto L_0x01d5
        L_0x0138:
            android.view.ViewParent r17 = r5.getParent()
            r19 = r10
            r10 = r17
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            int r17 = r10.indexOfChild(r5)
            r20 = r10
            android.view.ViewGroupOverlay r10 = r24.getOverlay()
            r10.add(r5)
            r10 = r20
            r22 = r17
            r17 = r4
            r4 = r22
            goto L_0x015e
        L_0x0158:
            r19 = r10
            r17 = r4
            r4 = 0
            r10 = 0
        L_0x015e:
            float r20 = r13.width()
            r21 = r11
            int r11 = java.lang.Math.round(r20)
            float r20 = r13.height()
            int r3 = java.lang.Math.round(r20)
            if (r11 <= 0) goto L_0x01c6
            if (r3 <= 0) goto L_0x01c6
            r20 = 1233125376(0x49800000, float:1048576.0)
            int r2 = r11 * r3
            float r2 = (float) r2
            float r2 = r20 / r2
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r0, r2)
            float r2 = (float) r11
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r11 = r13.left
            float r11 = -r11
            float r13 = r13.top
            float r13 = -r13
            r12.postTranslate(r11, r13)
            r12.postScale(r0, r0)
            boolean r0 = h0.b0.q.c
            if (r0 == 0) goto L_0x01b4
            android.graphics.Picture r0 = new android.graphics.Picture
            r0.<init>()
            android.graphics.Canvas r2 = r0.beginRecording(r2, r3)
            r2.concat(r12)
            r5.draw(r2)
            r0.endRecording()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0)
            goto L_0x01c7
        L_0x01b4:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r3, r0)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r2.concat(r12)
            r5.draw(r2)
            goto L_0x01c7
        L_0x01c6:
            r0 = 0
        L_0x01c7:
            if (r18 == 0) goto L_0x01d5
            if (r7 == 0) goto L_0x01d5
            android.view.ViewGroupOverlay r2 = r24.getOverlay()
            r2.remove(r5)
            r10.addView(r5, r4)
        L_0x01d5:
            if (r0 == 0) goto L_0x01da
            r8.setImageBitmap(r0)
        L_0x01da:
            int r0 = r15 - r6
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r3 = r9 - r14
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r8.measure(r0, r2)
            r8.layout(r6, r14, r15, r9)
            r0 = r23
            r12 = r8
            goto L_0x021c
        L_0x01f2:
            r17 = r4
            r19 = r10
            r21 = r11
            int r0 = r13.getId()
            android.view.ViewParent r2 = r13.getParent()
            if (r2 != 0) goto L_0x0213
            r2 = -1
            if (r0 == r2) goto L_0x0213
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x0213
            r0 = r23
            boolean r2 = r0.j2
            if (r2 == 0) goto L_0x021c
        L_0x0211:
            r12 = r5
            goto L_0x021c
        L_0x0213:
            r0 = r23
            goto L_0x021c
        L_0x0216:
            r17 = r4
            r19 = r10
            r21 = r11
        L_0x021c:
            r10 = r19
            r7 = 0
        L_0x021f:
            if (r12 == 0) goto L_0x0278
            r2 = r25
            if (r7 != 0) goto L_0x0258
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.a
            java.lang.String r4 = "android:visibility:screenLocation"
            java.lang.Object r3 = r3.get(r4)
            int[] r3 = (int[]) r3
            r4 = 0
            r6 = r3[r4]
            r8 = 1
            r3 = r3[r8]
            r9 = 2
            int[] r9 = new int[r9]
            r1.getLocationOnScreen(r9)
            r4 = r9[r4]
            int r6 = r6 - r4
            int r4 = r12.getLeft()
            int r6 = r6 - r4
            r12.offsetLeftAndRight(r6)
            r4 = r9[r8]
            int r3 = r3 - r4
            int r4 = r12.getTop()
            int r3 = r3 - r4
            r12.offsetTopAndBottom(r3)
            android.view.ViewGroupOverlay r3 = r24.getOverlay()
            r3.add(r12)
        L_0x0258:
            r3 = r26
            android.animation.Animator r6 = r0.P(r1, r12, r2, r3)
            if (r7 != 0) goto L_0x02a3
            if (r6 != 0) goto L_0x026a
            android.view.ViewGroupOverlay r1 = r24.getOverlay()
            r1.remove(r12)
            goto L_0x02a3
        L_0x026a:
            r2 = r21
            r5.setTag(r2, r12)
            h0.b0.d0 r2 = new h0.b0.d0
            r2.<init>(r0, r1, r12, r5)
            r0.b(r2)
            goto L_0x02a3
        L_0x0278:
            r2 = r25
            r3 = r26
            if (r10 == 0) goto L_0x0052
            int r4 = r10.getVisibility()
            h0.b0.c0 r5 = h0.b0.w.a
            r6 = 0
            r5.f(r10, r6)
            android.animation.Animator r6 = r0.P(r1, r10, r2, r3)
            if (r6 == 0) goto L_0x02a0
            h0.b0.e0$a r1 = new h0.b0.e0$a
            r2 = r17
            r3 = 1
            r1.<init>(r10, r2, r3)
            r6.addListener(r1)
            r6.addPauseListener(r1)
            r0.b(r1)
            goto L_0x02a3
        L_0x02a0:
            r5.f(r10, r4)
        L_0x02a3:
            return r6
        L_0x02a4:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b0.e0.n(android.view.ViewGroup, h0.b0.r, h0.b0.r):android.animation.Animator");
    }

    public String[] s() {
        return t2;
    }

    public boolean u(r rVar, r rVar2) {
        if (rVar == null && rVar2 == null) {
            return false;
        }
        if (rVar != null && rVar2 != null && rVar2.a.containsKey("android:visibility:visibility") != rVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b N = N(rVar, rVar2);
        if (!N.a) {
            return false;
        }
        if (N.c == 0 || N.d == 0) {
            return true;
        }
        return false;
    }
}
