package i0.j.f.s.e;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: GesturesHandler */
public class b {
    public static boolean a = false;
    public static float b = -1.0f;
    public static int c = -1;
    public static float d;
    public static float e;
    public static C0192b f;

    /* compiled from: GesturesHandler */
    public static class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ View a;

        public a(View view) {
            this.a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            layoutParams.height = intValue;
            this.a.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: i0.j.f.s.e.b$b  reason: collision with other inner class name */
    /* compiled from: GesturesHandler */
    public interface C0192b {
        void a();

        void g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.view.MotionEvent r7, boolean r8, boolean r9, i0.j.f.s.e.b.C0192b r10, android.view.View r11, android.view.ViewGroup.LayoutParams r12) {
        /*
            int r0 = r7.getActionMasked()
            if (r0 == 0) goto L_0x01a2
            r1 = 1060320051(0x3f333333, float:0.7)
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 == r4) goto L_0x0120
            r5 = 2
            if (r0 == r5) goto L_0x0013
            goto L_0x01b4
        L_0x0013:
            if (r9 == 0) goto L_0x005f
            float r0 = b
            float r5 = r7.getRawY()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0038
            int r0 = r12.height
            float r0 = (float) r0
            float r5 = r7.getRawY()
            float r6 = b
            float r5 = r5 - r6
            float r0 = r0 - r5
            int r0 = (int) r0
            r12.height = r0
            r11.setLayoutParams(r12)
            float r7 = r7.getRawY()
            b = r7
            goto L_0x00ec
        L_0x0038:
            float r0 = b
            float r5 = r7.getRawY()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ec
            int r0 = r12.height
            int r5 = c
            if (r0 >= r5) goto L_0x00ec
            float r0 = (float) r0
            float r5 = b
            float r6 = r7.getRawY()
            float r5 = r5 - r6
            float r5 = r5 + r0
            int r0 = (int) r5
            r12.height = r0
            r11.setLayoutParams(r12)
            float r7 = r7.getRawY()
            b = r7
            goto L_0x00ec
        L_0x005f:
            if (r8 == 0) goto L_0x00a5
            float r0 = b
            float r5 = r7.getRawY()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0083
            int r0 = r12.height
            float r0 = (float) r0
            float r5 = r7.getRawY()
            float r6 = b
            float r5 = r5 - r6
            float r0 = r0 - r5
            int r0 = (int) r0
            r12.height = r0
            r11.setLayoutParams(r12)
            float r7 = r7.getRawY()
            b = r7
            goto L_0x00ec
        L_0x0083:
            float r0 = b
            float r5 = r7.getRawY()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ec
            int r0 = r12.height
            float r0 = (float) r0
            float r5 = b
            float r6 = r7.getRawY()
            float r5 = r5 - r6
            float r5 = r5 + r0
            int r0 = (int) r5
            r12.height = r0
            r11.setLayoutParams(r12)
            float r7 = r7.getRawY()
            b = r7
            goto L_0x00ec
        L_0x00a5:
            float r0 = b
            float r5 = r7.getRawY()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c7
            int r0 = r12.height
            float r0 = (float) r0
            float r5 = r7.getRawY()
            float r6 = b
            float r5 = r5 - r6
            float r0 = r0 - r5
            int r0 = (int) r0
            r12.height = r0
            r11.setLayoutParams(r12)
            float r7 = r7.getRawY()
            b = r7
            goto L_0x00ec
        L_0x00c7:
            float r0 = b
            float r5 = r7.getRawY()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ec
            int r0 = r12.height
            int r5 = c
            if (r0 >= r5) goto L_0x00e6
            float r0 = (float) r0
            float r5 = b
            float r6 = r7.getRawY()
            float r5 = r5 - r6
            float r5 = r5 + r0
            int r0 = (int) r5
            r12.height = r0
            r11.setLayoutParams(r12)
        L_0x00e6:
            float r7 = r7.getRawY()
            b = r7
        L_0x00ec:
            if (r8 == 0) goto L_0x0108
            int r7 = r12.height
            float r7 = (float) r7
            int r8 = c
            float r8 = (float) r8
            float r7 = r7 / r8
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0104
            if (r9 != 0) goto L_0x01b4
            r10.a()
            a = r3
            goto L_0x01b4
        L_0x0104:
            a = r3
            goto L_0x01b4
        L_0x0108:
            int r7 = r12.height
            float r7 = (float) r7
            int r8 = c
            float r8 = (float) r8
            float r7 = r7 / r8
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x011c
            a = r4
            r10.g()
            c = r2
            goto L_0x01b4
        L_0x011c:
            a = r3
            goto L_0x01b4
        L_0x0120:
            float r0 = r7.getX()
            float r7 = r7.getY()
            float r5 = d
            float r6 = e
            float r5 = r5 - r0
            float r0 = java.lang.Math.abs(r5)
            float r6 = r6 - r7
            float r7 = java.lang.Math.abs(r6)
            r5 = 5
            float r5 = (float) r5
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0142
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0142
            r7 = r4
            goto L_0x0143
        L_0x0142:
            r7 = r3
        L_0x0143:
            if (r7 == 0) goto L_0x0155
            if (r8 == 0) goto L_0x0155
            boolean r7 = a
            if (r7 != 0) goto L_0x0155
            if (r9 != 0) goto L_0x0155
            r10.a()
            a = r4
            c = r2
            r3 = r4
        L_0x0155:
            boolean r7 = a
            if (r7 != 0) goto L_0x019c
            if (r8 == 0) goto L_0x0190
            int r7 = c
            int r8 = r12.height
            if (r7 == r8) goto L_0x0176
            if (r7 <= r8) goto L_0x0176
            float r9 = (float) r8
            float r12 = (float) r7
            float r9 = r9 / r12
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x0172
            a = r4
            r10.g()
            c = r2
            goto L_0x019c
        L_0x0172:
            b(r11, r8, r7)
            goto L_0x019d
        L_0x0176:
            if (r7 == r8) goto L_0x019c
            if (r7 >= r8) goto L_0x019c
            float r12 = (float) r8
            float r0 = (float) r7
            float r12 = r12 / r0
            r0 = 1068708659(0x3fb33333, float:1.4)
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x018c
            if (r9 != 0) goto L_0x019d
            r10.a()
            c = r2
            goto L_0x019d
        L_0x018c:
            b(r11, r8, r7)
            goto L_0x019d
        L_0x0190:
            int r7 = c
            int r8 = r12.height
            if (r7 == r8) goto L_0x019c
            if (r7 <= r8) goto L_0x019c
            b(r11, r8, r7)
            goto L_0x019d
        L_0x019c:
            r4 = r3
        L_0x019d:
            if (r4 == 0) goto L_0x01b4
            c = r2
            goto L_0x01b4
        L_0x01a2:
            float r8 = r7.getX()
            d = r8
            float r8 = r7.getY()
            e = r8
            float r7 = r7.getRawY()
            b = r7
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.s.e.b.a(android.view.MotionEvent, boolean, boolean, i0.j.f.s.e.b$b, android.view.View, android.view.ViewGroup$LayoutParams):void");
    }

    public static void b(View view, int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new a(view));
        ofInt.setDuration(300);
        ofInt.start();
    }

    public static void c(View view, MotionEvent motionEvent, boolean z, boolean z2, C0192b bVar) {
        View view2;
        if (f == null) {
            f = bVar;
        }
        if (z) {
            view2 = (View) view.getParent();
        } else {
            view2 = (View) view.getParent().getParent().getParent().getParent();
        }
        View view3 = view2;
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (c == -1) {
            c = layoutParams.height;
        }
        a(motionEvent, z, z2, bVar, view3, layoutParams);
    }
}
