package h0.b.e.i;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;
import h0.b.e.i.m;
import h0.i.i.q;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MenuPopupHelper */
public class l {
    public final Context a;
    public final g b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g = 8388611;
    public boolean h;
    public m.a i;
    public k j;
    public PopupWindow.OnDismissListener k;
    public final PopupWindow.OnDismissListener l = new a();

    /* compiled from: MenuPopupHelper */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        public void onDismiss() {
            l.this.c();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i2, int i3) {
        this.a = context;
        this.b = gVar;
        this.f = view;
        this.c = z;
        this.d = i2;
        this.e = i3;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [h0.b.e.i.k, h0.b.e.i.m] */
    /* JADX WARNING: type inference failed for: r7v1, types: [h0.b.e.i.q] */
    /* JADX WARNING: type inference failed for: r1v13, types: [h0.b.e.i.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h0.b.e.i.k a() {
        /*
            r14 = this;
            h0.b.e.i.k r0 = r14.j
            if (r0 != 0) goto L_0x0078
            android.content.Context r0 = r14.a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getRealSize(r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = androidx.appcompat.R.dimen.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            if (r0 == 0) goto L_0x0046
            h0.b.e.i.d r0 = new h0.b.e.i.d
            android.content.Context r2 = r14.a
            android.view.View r3 = r14.f
            int r4 = r14.d
            int r5 = r14.e
            boolean r6 = r14.c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0058
        L_0x0046:
            h0.b.e.i.q r0 = new h0.b.e.i.q
            android.content.Context r8 = r14.a
            h0.b.e.i.g r9 = r14.b
            android.view.View r10 = r14.f
            int r11 = r14.d
            int r12 = r14.e
            boolean r13 = r14.c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0058:
            h0.b.e.i.g r1 = r14.b
            r0.l(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.l
            r0.r(r1)
            android.view.View r1 = r14.f
            r0.n(r1)
            h0.b.e.i.m$a r1 = r14.i
            r0.h(r1)
            boolean r1 = r14.h
            r0.o(r1)
            int r1 = r14.g
            r0.p(r1)
            r14.j = r0
        L_0x0078:
            h0.b.e.i.k r0 = r14.j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.e.i.l.a():h0.b.e.i.k");
    }

    public boolean b() {
        k kVar = this.j;
        return kVar != null && kVar.b();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void d(m.a aVar) {
        this.i = aVar;
        k kVar = this.j;
        if (kVar != null) {
            kVar.h(aVar);
        }
    }

    public final void e(int i2, int i3, boolean z, boolean z2) {
        k a2 = a();
        a2.s(z2);
        if (z) {
            int i4 = this.g;
            View view = this.f;
            AtomicInteger atomicInteger = q.a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f.getWidth();
            }
            a2.q(i2);
            a2.t(i3);
            int i5 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.c = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        a2.a();
    }

    public boolean f() {
        if (b()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        e(0, 0, false, false);
        return true;
    }
}
