package h0.b.e.i;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import h0.b.e.i.m;
import h0.b.f.i0;
import h0.b.f.j0;
import h0.i.i.q;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CascadingMenuPopup */
public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int d = R.layout.abc_cascading_menu_item_layout;
    public final int Y1;
    public final boolean Z1;
    public final Handler a2;
    public final List<g> b2 = new ArrayList();
    public final List<C0018d> c2 = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener d2 = new a();
    public final View.OnAttachStateChangeListener e2 = new b();
    public final i0 f2 = new c();
    public int g2;
    public int h2;
    public View i2;
    public View j2;
    public int k2;
    public boolean l2;
    public boolean m2;
    public int n2;
    public int o2;
    public boolean p2;
    public final Context q;
    public boolean q2;
    public m.a r2;
    public ViewTreeObserver s2;
    public PopupWindow.OnDismissListener t2;
    public boolean u2;
    public final int x;
    public final int y;

    /* compiled from: CascadingMenuPopup */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (d.this.b() && d.this.c2.size() > 0 && !d.this.c2.get(0).a.t2) {
                View view = d.this.j2;
                if (view == null || !view.isShown()) {
                    d.this.dismiss();
                    return;
                }
                for (C0018d dVar : d.this.c2) {
                    dVar.a.a();
                }
            }
        }
    }

    /* compiled from: CascadingMenuPopup */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.s2;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.s2 = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.s2.removeGlobalOnLayoutListener(dVar.d2);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup */
    public class c implements i0 {

        /* compiled from: CascadingMenuPopup */
        public class a implements Runnable {
            public final /* synthetic */ C0018d c;
            public final /* synthetic */ MenuItem d;
            public final /* synthetic */ g q;

            public a(C0018d dVar, MenuItem menuItem, g gVar) {
                this.c = dVar;
                this.d = menuItem;
                this.q = gVar;
            }

            public void run() {
                C0018d dVar = this.c;
                if (dVar != null) {
                    d.this.u2 = true;
                    dVar.b.c(false);
                    d.this.u2 = false;
                }
                if (this.d.isEnabled() && this.d.hasSubMenu()) {
                    this.q.r(this.d, 4);
                }
            }
        }

        public c() {
        }

        public void c(g gVar, MenuItem menuItem) {
            C0018d dVar = null;
            d.this.a2.removeCallbacksAndMessages((Object) null);
            int size = d.this.c2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == d.this.c2.get(i).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < d.this.c2.size()) {
                    dVar = d.this.c2.get(i2);
                }
                d.this.a2.postAtTime(new a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        public void d(g gVar, MenuItem menuItem) {
            d.this.a2.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: h0.b.e.i.d$d  reason: collision with other inner class name */
    /* compiled from: CascadingMenuPopup */
    public static class C0018d {
        public final j0 a;
        public final g b;
        public final int c;

        public C0018d(j0 j0Var, g gVar, int i) {
            this.a = j0Var;
            this.b = gVar;
            this.c = i;
        }
    }

    public d(Context context, View view, int i, int i3, boolean z) {
        int i4 = 0;
        this.g2 = 0;
        this.h2 = 0;
        this.q = context;
        this.i2 = view;
        this.y = i;
        this.Y1 = i3;
        this.Z1 = z;
        this.p2 = false;
        AtomicInteger atomicInteger = q.a;
        this.k2 = view.getLayoutDirection() != 1 ? 1 : i4;
        Resources resources = context.getResources();
        this.x = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a2 = new Handler();
    }

    public void a() {
        if (!b()) {
            for (g v : this.b2) {
                v(v);
            }
            this.b2.clear();
            View view = this.i2;
            this.j2 = view;
            if (view != null) {
                boolean z = this.s2 == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.s2 = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.d2);
                }
                this.j2.addOnAttachStateChangeListener(this.e2);
            }
        }
    }

    public boolean b() {
        return this.c2.size() > 0 && this.c2.get(0).a.b();
    }

    public void c(g gVar, boolean z) {
        int size = this.c2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (gVar == this.c2.get(i).b) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i3 = i + 1;
            if (i3 < this.c2.size()) {
                this.c2.get(i3).b.c(false);
            }
            C0018d remove = this.c2.remove(i);
            remove.b.u(this);
            if (this.u2) {
                remove.a.u2.setExitTransition((Transition) null);
                remove.a.u2.setAnimationStyle(0);
            }
            remove.a.dismiss();
            int size2 = this.c2.size();
            if (size2 > 0) {
                this.k2 = this.c2.get(size2 - 1).c;
            } else {
                View view = this.i2;
                AtomicInteger atomicInteger = q.a;
                this.k2 = view.getLayoutDirection() == 1 ? 0 : 1;
            }
            if (size2 == 0) {
                dismiss();
                m.a aVar = this.r2;
                if (aVar != null) {
                    aVar.c(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.s2;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.s2.removeGlobalOnLayoutListener(this.d2);
                    }
                    this.s2 = null;
                }
                this.j2.removeOnAttachStateChangeListener(this.e2);
                this.t2.onDismiss();
            } else if (z) {
                this.c2.get(0).b.c(false);
            }
        }
    }

    public void d(boolean z) {
        for (C0018d dVar : this.c2) {
            ListAdapter adapter = dVar.a.y.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((f) adapter).notifyDataSetChanged();
        }
    }

    public void dismiss() {
        int size = this.c2.size();
        if (size > 0) {
            C0018d[] dVarArr = (C0018d[]) this.c2.toArray(new C0018d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0018d dVar = dVarArr[i];
                if (dVar.a.b()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    public boolean e() {
        return false;
    }

    public void h(m.a aVar) {
        this.r2 = aVar;
    }

    public ListView j() {
        if (this.c2.isEmpty()) {
            return null;
        }
        List<C0018d> list = this.c2;
        return list.get(list.size() - 1).a.y;
    }

    public boolean k(r rVar) {
        for (C0018d next : this.c2) {
            if (rVar == next.b) {
                next.a.y.requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        rVar.b(this, this.q);
        if (b()) {
            v(rVar);
        } else {
            this.b2.add(rVar);
        }
        m.a aVar = this.r2;
        if (aVar != null) {
            aVar.d(rVar);
        }
        return true;
    }

    public void l(g gVar) {
        gVar.b(this, this.q);
        if (b()) {
            v(gVar);
        } else {
            this.b2.add(gVar);
        }
    }

    public void n(View view) {
        if (this.i2 != view) {
            this.i2 = view;
            int i = this.g2;
            AtomicInteger atomicInteger = q.a;
            this.h2 = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    public void o(boolean z) {
        this.p2 = z;
    }

    public void onDismiss() {
        C0018d dVar;
        int size = this.c2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.c2.get(i);
            if (!dVar.a.b()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.b.c(false);
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
        if (this.g2 != i) {
            this.g2 = i;
            View view = this.i2;
            AtomicInteger atomicInteger = q.a;
            this.h2 = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    public void q(int i) {
        this.l2 = true;
        this.n2 = i;
    }

    public void r(PopupWindow.OnDismissListener onDismissListener) {
        this.t2 = onDismissListener;
    }

    public void s(boolean z) {
        this.q2 = z;
    }

    public void t(int i) {
        this.m2 = true;
        this.o2 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013c, code lost:
        if (((r7.getWidth() + r8[0]) + r2) > r9.right) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0142, code lost:
        if ((r8[0] - r2) < 0) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0146, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(h0.b.e.i.g r15) {
        /*
            r14 = this;
            android.content.Context r0 = r14.q
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            h0.b.e.i.f r1 = new h0.b.e.i.f
            boolean r2 = r14.Z1
            int r3 = d
            r1.<init>(r15, r0, r2, r3)
            boolean r2 = r14.b()
            r3 = 1
            if (r2 != 0) goto L_0x001d
            boolean r2 = r14.p2
            if (r2 == 0) goto L_0x001d
            r1.q = r3
            goto L_0x0029
        L_0x001d:
            boolean r2 = r14.b()
            if (r2 == 0) goto L_0x0029
            boolean r2 = h0.b.e.i.k.u(r15)
            r1.q = r2
        L_0x0029:
            android.content.Context r2 = r14.q
            int r4 = r14.x
            r5 = 0
            int r2 = h0.b.e.i.k.m(r1, r5, r2, r4)
            h0.b.f.j0 r4 = new h0.b.f.j0
            android.content.Context r6 = r14.q
            int r7 = r14.y
            int r8 = r14.Y1
            r4.<init>(r6, r5, r7, r8)
            h0.b.f.i0 r6 = r14.f2
            r4.w2 = r6
            r4.l2 = r14
            android.widget.PopupWindow r6 = r4.u2
            r6.setOnDismissListener(r14)
            android.view.View r6 = r14.i2
            r4.k2 = r6
            int r6 = r14.h2
            r4.g2 = r6
            r4.s(r3)
            android.widget.PopupWindow r6 = r4.u2
            r7 = 2
            r6.setInputMethodMode(r7)
            r4.p(r1)
            r4.r(r2)
            int r1 = r14.h2
            r4.g2 = r1
            java.util.List<h0.b.e.i.d$d> r1 = r14.c2
            int r1 = r1.size()
            r6 = 0
            if (r1 <= 0) goto L_0x00e0
            java.util.List<h0.b.e.i.d$d> r1 = r14.c2
            int r7 = r1.size()
            int r7 = r7 - r3
            java.lang.Object r1 = r1.get(r7)
            h0.b.e.i.d$d r1 = (h0.b.e.i.d.C0018d) r1
            h0.b.e.i.g r7 = r1.b
            int r8 = r7.size()
            r9 = r6
        L_0x0080:
            if (r9 >= r8) goto L_0x0096
            android.view.MenuItem r10 = r7.getItem(r9)
            boolean r11 = r10.hasSubMenu()
            if (r11 == 0) goto L_0x0093
            android.view.SubMenu r11 = r10.getSubMenu()
            if (r15 != r11) goto L_0x0093
            goto L_0x0097
        L_0x0093:
            int r9 = r9 + 1
            goto L_0x0080
        L_0x0096:
            r10 = r5
        L_0x0097:
            if (r10 != 0) goto L_0x009a
            goto L_0x00e2
        L_0x009a:
            h0.b.f.j0 r5 = r1.a
            h0.b.f.c0 r5 = r5.y
            android.widget.ListAdapter r7 = r5.getAdapter()
            boolean r8 = r7 instanceof android.widget.HeaderViewListAdapter
            if (r8 == 0) goto L_0x00b3
            android.widget.HeaderViewListAdapter r7 = (android.widget.HeaderViewListAdapter) r7
            int r8 = r7.getHeadersCount()
            android.widget.ListAdapter r7 = r7.getWrappedAdapter()
            h0.b.e.i.f r7 = (h0.b.e.i.f) r7
            goto L_0x00b6
        L_0x00b3:
            h0.b.e.i.f r7 = (h0.b.e.i.f) r7
            r8 = r6
        L_0x00b6:
            int r9 = r7.getCount()
            r11 = r6
        L_0x00bb:
            r12 = -1
            if (r11 >= r9) goto L_0x00c8
            h0.b.e.i.i r13 = r7.getItem(r11)
            if (r10 != r13) goto L_0x00c5
            goto L_0x00c9
        L_0x00c5:
            int r11 = r11 + 1
            goto L_0x00bb
        L_0x00c8:
            r11 = r12
        L_0x00c9:
            if (r11 != r12) goto L_0x00cc
            goto L_0x00e1
        L_0x00cc:
            int r11 = r11 + r8
            int r7 = r5.getFirstVisiblePosition()
            int r11 = r11 - r7
            if (r11 < 0) goto L_0x00e1
            int r7 = r5.getChildCount()
            if (r11 < r7) goto L_0x00db
            goto L_0x00e1
        L_0x00db:
            android.view.View r5 = r5.getChildAt(r11)
            goto L_0x00e2
        L_0x00e0:
            r1 = 0
        L_0x00e1:
            r5 = 0
        L_0x00e2:
            if (r5 == 0) goto L_0x01ab
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 28
            if (r7 > r8) goto L_0x0102
            java.lang.reflect.Method r7 = h0.b.f.j0.v2
            if (r7 == 0) goto L_0x0107
            android.widget.PopupWindow r8 = r4.u2     // Catch:{ Exception -> 0x00fa }
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00fa }
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x00fa }
            r9[r6] = r10     // Catch:{ Exception -> 0x00fa }
            r7.invoke(r8, r9)     // Catch:{ Exception -> 0x00fa }
            goto L_0x0107
        L_0x00fa:
            java.lang.String r7 = "MenuPopupWindow"
            java.lang.String r8 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r7, r8)
            goto L_0x0107
        L_0x0102:
            android.widget.PopupWindow r7 = r4.u2
            r7.setTouchModal(r6)
        L_0x0107:
            android.widget.PopupWindow r7 = r4.u2
            r8 = 0
            r7.setEnterTransition(r8)
            java.util.List<h0.b.e.i.d$d> r7 = r14.c2
            int r8 = r7.size()
            int r8 = r8 - r3
            java.lang.Object r7 = r7.get(r8)
            h0.b.e.i.d$d r7 = (h0.b.e.i.d.C0018d) r7
            h0.b.f.j0 r7 = r7.a
            h0.b.f.c0 r7 = r7.y
            r8 = 2
            int[] r8 = new int[r8]
            r7.getLocationOnScreen(r8)
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            android.view.View r10 = r14.j2
            r10.getWindowVisibleDisplayFrame(r9)
            int r10 = r14.k2
            if (r10 != r3) goto L_0x013f
            r8 = r8[r6]
            int r7 = r7.getWidth()
            int r7 = r7 + r8
            int r7 = r7 + r2
            int r8 = r9.right
            if (r7 <= r8) goto L_0x0144
            goto L_0x0146
        L_0x013f:
            r7 = r8[r6]
            int r7 = r7 - r2
            if (r7 >= 0) goto L_0x0146
        L_0x0144:
            r7 = r3
            goto L_0x0147
        L_0x0146:
            r7 = r6
        L_0x0147:
            if (r7 != r3) goto L_0x014b
            r8 = r3
            goto L_0x014c
        L_0x014b:
            r8 = r6
        L_0x014c:
            r14.k2 = r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 26
            r10 = 5
            if (r7 < r9) goto L_0x015a
            r4.k2 = r5
            r7 = r6
            r11 = r7
            goto L_0x018b
        L_0x015a:
            r7 = 2
            int[] r9 = new int[r7]
            android.view.View r11 = r14.i2
            r11.getLocationOnScreen(r9)
            int[] r7 = new int[r7]
            r5.getLocationOnScreen(r7)
            int r11 = r14.h2
            r11 = r11 & 7
            if (r11 != r10) goto L_0x0181
            r11 = r9[r6]
            android.view.View r12 = r14.i2
            int r12 = r12.getWidth()
            int r12 = r12 + r11
            r9[r6] = r12
            r11 = r7[r6]
            int r12 = r5.getWidth()
            int r12 = r12 + r11
            r7[r6] = r12
        L_0x0181:
            r11 = r7[r6]
            r12 = r9[r6]
            int r11 = r11 - r12
            r7 = r7[r3]
            r9 = r9[r3]
            int r7 = r7 - r9
        L_0x018b:
            int r9 = r14.h2
            r9 = r9 & r10
            if (r9 != r10) goto L_0x0198
            if (r8 == 0) goto L_0x0193
            goto L_0x019e
        L_0x0193:
            int r2 = r5.getWidth()
            goto L_0x01a0
        L_0x0198:
            if (r8 == 0) goto L_0x01a0
            int r2 = r5.getWidth()
        L_0x019e:
            int r11 = r11 + r2
            goto L_0x01a1
        L_0x01a0:
            int r11 = r11 - r2
        L_0x01a1:
            r4.a2 = r11
            r4.f2 = r3
            r4.e2 = r3
            r4.l(r7)
            goto L_0x01c9
        L_0x01ab:
            boolean r2 = r14.l2
            if (r2 == 0) goto L_0x01b3
            int r2 = r14.n2
            r4.a2 = r2
        L_0x01b3:
            boolean r2 = r14.m2
            if (r2 == 0) goto L_0x01bc
            int r2 = r14.o2
            r4.l(r2)
        L_0x01bc:
            android.graphics.Rect r2 = r14.c
            if (r2 == 0) goto L_0x01c6
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r2)
            goto L_0x01c7
        L_0x01c6:
            r3 = 0
        L_0x01c7:
            r4.s2 = r3
        L_0x01c9:
            h0.b.e.i.d$d r2 = new h0.b.e.i.d$d
            int r3 = r14.k2
            r2.<init>(r4, r15, r3)
            java.util.List<h0.b.e.i.d$d> r3 = r14.c2
            r3.add(r2)
            r4.a()
            h0.b.f.c0 r2 = r4.y
            r2.setOnKeyListener(r14)
            if (r1 != 0) goto L_0x0207
            boolean r1 = r14.q2
            if (r1 == 0) goto L_0x0207
            java.lang.CharSequence r1 = r15.n
            if (r1 == 0) goto L_0x0207
            int r1 = androidx.appcompat.R.layout.abc_popup_menu_header_item_layout
            android.view.View r0 = r0.inflate(r1, r2, r6)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.setEnabled(r6)
            java.lang.CharSequence r15 = r15.n
            r1.setText(r15)
            r15 = 0
            r2.addHeaderView(r0, r15, r6)
            r4.a()
        L_0x0207:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.e.i.d.v(h0.b.e.i.g):void");
    }
}
