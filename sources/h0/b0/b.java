package h0.b0;

import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import h0.i.i.q;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ChangeBounds */
public class b extends j {
    public static f A2 = new f();
    public static final String[] t2 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<Drawable, PointF> u2 = new a(PointF.class, "boundsOrigin");
    public static final Property<i, PointF> v2 = new C0021b(PointF.class, "topLeft");
    public static final Property<i, PointF> w2 = new c(PointF.class, "bottomRight");
    public static final Property<View, PointF> x2 = new d(PointF.class, "bottomRight");
    public static final Property<View, PointF> y2 = new e(PointF.class, "topLeft");
    public static final Property<View, PointF> z2 = new f(PointF.class, "position");
    public int[] B2 = new int[2];

    /* compiled from: ChangeBounds */
    public static class a extends Property<Drawable, PointF> {
        public Rect a = new Rect();

        public a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            ((Drawable) obj).copyBounds(this.a);
            Rect rect = this.a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        public void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            drawable.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.a);
        }
    }

    /* renamed from: h0.b0.b$b  reason: collision with other inner class name */
    /* compiled from: ChangeBounds */
    public static class C0021b extends Property<i, PointF> {
        public C0021b(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            i iVar = (i) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            i iVar = (i) obj;
            PointF pointF = (PointF) obj2;
            Objects.requireNonNull(iVar);
            iVar.a = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.b = round;
            int i = iVar.f + 1;
            iVar.f = i;
            if (i == iVar.g) {
                w.b(iVar.e, iVar.a, round, iVar.c, iVar.d);
                iVar.f = 0;
                iVar.g = 0;
            }
        }
    }

    /* compiled from: ChangeBounds */
    public static class c extends Property<i, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            i iVar = (i) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            i iVar = (i) obj;
            PointF pointF = (PointF) obj2;
            Objects.requireNonNull(iVar);
            iVar.c = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.d = round;
            int i = iVar.g + 1;
            iVar.g = i;
            if (iVar.f == i) {
                w.b(iVar.e, iVar.a, iVar.b, iVar.c, round);
                iVar.f = 0;
                iVar.g = 0;
            }
        }
    }

    /* compiled from: ChangeBounds */
    public static class d extends Property<View, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            w.b(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* compiled from: ChangeBounds */
    public static class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            w.b(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* compiled from: ChangeBounds */
    public static class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            w.b(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds */
    public class g extends AnimatorListenerAdapter {
        public final /* synthetic */ i a;
        private i mViewBounds;

        public g(b bVar, i iVar) {
            this.a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* compiled from: ChangeBounds */
    public class h extends m {
        public boolean a = false;
        public final /* synthetic */ ViewGroup b;

        public h(b bVar, ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        public void b(j jVar) {
            u.a(this.b, false);
        }

        public void c(j jVar) {
            if (!this.a) {
                u.a(this.b, false);
            }
            jVar.y(this);
        }

        public void d(j jVar) {
            u.a(this.b, false);
            this.a = true;
        }

        public void e(j jVar) {
            u.a(this.b, true);
        }
    }

    /* compiled from: ChangeBounds */
    public static class i {
        public int a;
        public int b;
        public int c;
        public int d;
        public View e;
        public int f;
        public int g;

        public i(View view) {
            this.e = view;
        }
    }

    public final void M(r rVar) {
        View view = rVar.b;
        AtomicInteger atomicInteger = q.a;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            rVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            rVar.a.put("android:changeBounds:parent", rVar.b.getParent());
        }
    }

    public void f(r rVar) {
        M(rVar);
    }

    public void i(r rVar) {
        M(rVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator n(android.view.ViewGroup r19, h0.b0.r r20, h0.b0.r r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            if (r1 == 0) goto L_0x0135
            if (r2 != 0) goto L_0x000c
            goto L_0x0135
        L_0x000c:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.a
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.a
            java.lang.String r6 = "android:changeBounds:parent"
            java.lang.Object r4 = r4.get(r6)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r5 = r5.get(r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r4 == 0) goto L_0x0133
            if (r5 != 0) goto L_0x0024
            goto L_0x0133
        L_0x0024:
            android.view.View r4 = r2.b
            java.util.Map<java.lang.String, java.lang.Object> r5 = r1.a
            java.lang.String r6 = "android:changeBounds:bounds"
            java.lang.Object r5 = r5.get(r6)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            java.util.Map<java.lang.String, java.lang.Object> r7 = r2.a
            java.lang.Object r6 = r7.get(r6)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            int r7 = r5.left
            int r8 = r6.left
            int r9 = r5.top
            int r10 = r6.top
            int r11 = r5.right
            int r12 = r6.right
            int r5 = r5.bottom
            int r6 = r6.bottom
            int r13 = r11 - r7
            int r14 = r5 - r9
            int r15 = r12 - r8
            int r3 = r6 - r10
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.a
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.a
            java.lang.Object r0 = r2.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r2 = 1
            if (r13 == 0) goto L_0x0067
            if (r14 != 0) goto L_0x006b
        L_0x0067:
            if (r15 == 0) goto L_0x007c
            if (r3 == 0) goto L_0x007c
        L_0x006b:
            if (r7 != r8) goto L_0x0073
            if (r9 == r10) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            r16 = 0
            goto L_0x0075
        L_0x0073:
            r16 = r2
        L_0x0075:
            if (r11 != r12) goto L_0x0079
            if (r5 == r6) goto L_0x007e
        L_0x0079:
            int r16 = r16 + 1
            goto L_0x007e
        L_0x007c:
            r16 = 0
        L_0x007e:
            if (r1 == 0) goto L_0x0086
            boolean r17 = r1.equals(r0)
            if (r17 == 0) goto L_0x008a
        L_0x0086:
            if (r1 != 0) goto L_0x008c
            if (r0 == 0) goto L_0x008c
        L_0x008a:
            int r16 = r16 + 1
        L_0x008c:
            r0 = r16
            if (r0 <= 0) goto L_0x012f
            h0.b0.w.b(r4, r7, r9, r11, r5)
            r1 = 2
            if (r0 != r1) goto L_0x00ed
            if (r13 != r15) goto L_0x00ad
            if (r14 != r3) goto L_0x00ad
            r0 = r18
            h0.b0.e r1 = r0.s2
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r1 = r1.a(r3, r5, r6, r7)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = z2
            android.animation.ObjectAnimator r1 = g0.a.b.b.a.i0(r4, r3, r1)
            goto L_0x0115
        L_0x00ad:
            r0 = r18
            h0.b0.b$i r3 = new h0.b0.b$i
            r3.<init>(r4)
            h0.b0.e r13 = r0.s2
            float r7 = (float) r7
            float r9 = (float) r9
            float r8 = (float) r8
            float r10 = (float) r10
            android.graphics.Path r7 = r13.a(r7, r9, r8, r10)
            android.util.Property<h0.b0.b$i, android.graphics.PointF> r8 = v2
            android.animation.ObjectAnimator r7 = g0.a.b.b.a.i0(r3, r8, r7)
            h0.b0.e r8 = r0.s2
            float r9 = (float) r11
            float r5 = (float) r5
            float r10 = (float) r12
            float r6 = (float) r6
            android.graphics.Path r5 = r8.a(r9, r5, r10, r6)
            android.util.Property<h0.b0.b$i, android.graphics.PointF> r6 = w2
            android.animation.ObjectAnimator r5 = g0.a.b.b.a.i0(r3, r6, r5)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r8 = 0
            r1[r8] = r7
            r1[r2] = r5
            r6.playTogether(r1)
            h0.b0.b$g r1 = new h0.b0.b$g
            r1.<init>(r0, r3)
            r6.addListener(r1)
            r1 = r6
            goto L_0x0115
        L_0x00ed:
            r0 = r18
            if (r7 != r8) goto L_0x0105
            if (r9 == r10) goto L_0x00f4
            goto L_0x0105
        L_0x00f4:
            h0.b0.e r1 = r0.s2
            float r3 = (float) r11
            float r5 = (float) r5
            float r7 = (float) r12
            float r6 = (float) r6
            android.graphics.Path r1 = r1.a(r3, r5, r7, r6)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = x2
            android.animation.ObjectAnimator r1 = g0.a.b.b.a.i0(r4, r3, r1)
            goto L_0x0115
        L_0x0105:
            h0.b0.e r1 = r0.s2
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r1 = r1.a(r3, r5, r6, r7)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = y2
            android.animation.ObjectAnimator r1 = g0.a.b.b.a.i0(r4, r3, r1)
        L_0x0115:
            android.view.ViewParent r3 = r4.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x012e
            android.view.ViewParent r3 = r4.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            h0.b0.u.a(r3, r2)
            h0.b0.b$h r2 = new h0.b0.b$h
            r2.<init>(r0, r3)
            r0.b(r2)
        L_0x012e:
            return r1
        L_0x012f:
            r0 = r18
            r1 = 0
            return r1
        L_0x0133:
            r1 = 0
            return r1
        L_0x0135:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b0.b.n(android.view.ViewGroup, h0.b0.r, h0.b0.r):android.animation.Animator");
    }

    public String[] s() {
        return t2;
    }
}
