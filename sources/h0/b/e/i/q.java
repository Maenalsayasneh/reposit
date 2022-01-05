package h0.b.e.i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import h0.b.e.i.m;
import h0.b.f.c0;
import h0.b.f.j0;
import java.util.Objects;

/* compiled from: StandardMenuPopup */
public final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {
    public static final int d = R.layout.abc_popup_menu_item_layout;
    public final boolean Y1;
    public final int Z1;
    public final int a2;
    public final int b2;
    public final j0 c2;
    public final ViewTreeObserver.OnGlobalLayoutListener d2 = new a();
    public final View.OnAttachStateChangeListener e2 = new b();
    public PopupWindow.OnDismissListener f2;
    public View g2;
    public View h2;
    public m.a i2;
    public ViewTreeObserver j2;
    public boolean k2;
    public boolean l2;
    public int m2;
    public int n2 = 0;
    public boolean o2;
    public final Context q;
    public final g x;
    public final f y;

    /* compiled from: StandardMenuPopup */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (q.this.b()) {
                q qVar = q.this;
                if (!qVar.c2.t2) {
                    View view = qVar.h2;
                    if (view == null || !view.isShown()) {
                        q.this.dismiss();
                    } else {
                        q.this.c2.a();
                    }
                }
            }
        }
    }

    /* compiled from: StandardMenuPopup */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.j2;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.j2 = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.j2.removeGlobalOnLayoutListener(qVar.d2);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i, int i3, boolean z) {
        this.q = context;
        this.x = gVar;
        this.Y1 = z;
        this.y = new f(gVar, LayoutInflater.from(context), z, d);
        this.a2 = i;
        this.b2 = i3;
        Resources resources = context.getResources();
        this.Z1 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.g2 = view;
        this.c2 = new j0(context, (AttributeSet) null, i, i3);
        gVar.b(this, context);
    }

    public void a() {
        View view;
        boolean z = true;
        if (!b()) {
            if (this.k2 || (view = this.g2) == null) {
                z = false;
            } else {
                this.h2 = view;
                this.c2.u2.setOnDismissListener(this);
                j0 j0Var = this.c2;
                j0Var.l2 = this;
                j0Var.s(true);
                View view2 = this.h2;
                boolean z2 = this.j2 == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.j2 = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.d2);
                }
                view2.addOnAttachStateChangeListener(this.e2);
                j0 j0Var2 = this.c2;
                j0Var2.k2 = view2;
                j0Var2.g2 = this.n2;
                if (!this.l2) {
                    this.m2 = k.m(this.y, (ViewGroup) null, this.q, this.Z1);
                    this.l2 = true;
                }
                this.c2.r(this.m2);
                this.c2.u2.setInputMethodMode(2);
                j0 j0Var3 = this.c2;
                Rect rect = this.c;
                Objects.requireNonNull(j0Var3);
                j0Var3.s2 = rect != null ? new Rect(rect) : null;
                this.c2.a();
                c0 c0Var = this.c2.y;
                c0Var.setOnKeyListener(this);
                if (this.o2 && this.x.n != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.q).inflate(R.layout.abc_popup_menu_header_item_layout, c0Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.x.n);
                    }
                    frameLayout.setEnabled(false);
                    c0Var.addHeaderView(frameLayout, (Object) null, false);
                }
                this.c2.p(this.y);
                this.c2.a();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public boolean b() {
        return !this.k2 && this.c2.b();
    }

    public void c(g gVar, boolean z) {
        if (gVar == this.x) {
            dismiss();
            m.a aVar = this.i2;
            if (aVar != null) {
                aVar.c(gVar, z);
            }
        }
    }

    public void d(boolean z) {
        this.l2 = false;
        f fVar = this.y;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    public void dismiss() {
        if (b()) {
            this.c2.dismiss();
        }
    }

    public boolean e() {
        return false;
    }

    public void h(m.a aVar) {
        this.i2 = aVar;
    }

    public ListView j() {
        return this.c2.y;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(h0.b.e.i.r r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x0078
            h0.b.e.i.l r0 = new h0.b.e.i.l
            android.content.Context r3 = r9.q
            android.view.View r5 = r9.h2
            boolean r6 = r9.Y1
            int r7 = r9.a2
            int r8 = r9.b2
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            h0.b.e.i.m$a r2 = r9.i2
            r0.d(r2)
            boolean r2 = h0.b.e.i.k.u(r10)
            r0.h = r2
            h0.b.e.i.k r3 = r0.j
            if (r3 == 0) goto L_0x002a
            r3.o(r2)
        L_0x002a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f2
            r0.k = r2
            r2 = 0
            r9.f2 = r2
            h0.b.e.i.g r2 = r9.x
            r2.c(r1)
            h0.b.f.j0 r2 = r9.c2
            int r3 = r2.a2
            boolean r4 = r2.d2
            if (r4 != 0) goto L_0x0040
            r2 = r1
            goto L_0x0042
        L_0x0040:
            int r2 = r2.b2
        L_0x0042:
            int r4 = r9.n2
            android.view.View r5 = r9.g2
            java.util.concurrent.atomic.AtomicInteger r6 = h0.i.i.q.a
            int r5 = r5.getLayoutDirection()
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x005c
            android.view.View r4 = r9.g2
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x005c:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L_0x0064
            goto L_0x006d
        L_0x0064:
            android.view.View r4 = r0.f
            if (r4 != 0) goto L_0x006a
            r0 = r1
            goto L_0x006e
        L_0x006a:
            r0.e(r3, r2, r5, r5)
        L_0x006d:
            r0 = r5
        L_0x006e:
            if (r0 == 0) goto L_0x0078
            h0.b.e.i.m$a r0 = r9.i2
            if (r0 == 0) goto L_0x0077
            r0.d(r10)
        L_0x0077:
            return r5
        L_0x0078:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.e.i.q.k(h0.b.e.i.r):boolean");
    }

    public void l(g gVar) {
    }

    public void n(View view) {
        this.g2 = view;
    }

    public void o(boolean z) {
        this.y.q = z;
    }

    public void onDismiss() {
        this.k2 = true;
        this.x.c(true);
        ViewTreeObserver viewTreeObserver = this.j2;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.j2 = this.h2.getViewTreeObserver();
            }
            this.j2.removeGlobalOnLayoutListener(this.d2);
            this.j2 = null;
        }
        this.h2.removeOnAttachStateChangeListener(this.e2);
        PopupWindow.OnDismissListener onDismissListener = this.f2;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void p(int i) {
        this.n2 = i;
    }

    public void q(int i) {
        this.c2.a2 = i;
    }

    public void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2 = onDismissListener;
    }

    public void s(boolean z) {
        this.o2 = z;
    }

    public void t(int i) {
        j0 j0Var = this.c2;
        j0Var.b2 = i;
        j0Var.d2 = true;
    }
}
