package h0.b.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.R;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import h0.b.a.a;
import h0.b.e.a;
import h0.b.e.f;
import h0.b.e.g;
import h0.b.e.i.g;
import h0.b.f.a0;
import h0.b.f.p0;
import h0.i.i.b0;
import h0.i.i.q;
import h0.i.i.y;
import h0.i.i.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WindowDecorActionBar */
public class r extends a implements ActionBarOverlayLayout.d {
    public static final Interpolator a = new AccelerateInterpolator();
    public static final Interpolator b = new DecelerateInterpolator();
    public final z A = new b();
    public final b0 B = new c();
    public Context c;
    public Context d;
    public ActionBarOverlayLayout e;
    public ActionBarContainer f;
    public a0 g;
    public ActionBarContextView h;
    public View i;
    public boolean j;
    public d k;
    public h0.b.e.a l;
    public a.C0017a m;
    public boolean n;
    public ArrayList<a.b> o = new ArrayList<>();
    public boolean p;
    public int q = 0;
    public boolean r = true;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v = true;
    public g w;
    public boolean x;
    public boolean y;
    public final z z = new a();

    /* compiled from: WindowDecorActionBar */
    public class a extends h0.i.i.a0 {
        public a() {
        }

        public void b(View view) {
            View view2;
            r rVar = r.this;
            if (rVar.r && (view2 = rVar.i) != null) {
                view2.setTranslationY(0.0f);
                r.this.f.setTranslationY(0.0f);
            }
            r.this.f.setVisibility(8);
            r.this.f.setTransitioning(false);
            r rVar2 = r.this;
            rVar2.w = null;
            a.C0017a aVar = rVar2.m;
            if (aVar != null) {
                aVar.a(rVar2.l);
                rVar2.l = null;
                rVar2.m = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = r.this.e;
            if (actionBarOverlayLayout != null) {
                AtomicInteger atomicInteger = q.a;
                actionBarOverlayLayout.requestApplyInsets();
            }
        }
    }

    /* compiled from: WindowDecorActionBar */
    public class b extends h0.i.i.a0 {
        public b() {
        }

        public void b(View view) {
            r rVar = r.this;
            rVar.w = null;
            rVar.f.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar */
    public class c implements b0 {
        public c() {
        }
    }

    /* compiled from: WindowDecorActionBar */
    public class d extends h0.b.e.a implements g.a {
        public WeakReference<View> Y1;
        public final Context q;
        public final h0.b.e.i.g x;
        public a.C0017a y;

        public d(Context context, a.C0017a aVar) {
            this.q = context;
            this.y = aVar;
            h0.b.e.i.g gVar = new h0.b.e.i.g(context);
            gVar.m = 1;
            this.x = gVar;
            gVar.f = this;
        }

        public boolean a(h0.b.e.i.g gVar, MenuItem menuItem) {
            a.C0017a aVar = this.y;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        public void b(h0.b.e.i.g gVar) {
            if (this.y != null) {
                i();
                h0.b.f.c cVar = r.this.h.x;
                if (cVar != null) {
                    cVar.n();
                }
            }
        }

        public void c() {
            r rVar = r.this;
            if (rVar.k == this) {
                boolean z = rVar.s;
                boolean z2 = rVar.t;
                boolean z3 = true;
                if (z || z2) {
                    z3 = false;
                }
                if (!z3) {
                    rVar.l = this;
                    rVar.m = this.y;
                } else {
                    this.y.a(this);
                }
                this.y = null;
                r.this.y(false);
                ActionBarContextView actionBarContextView = r.this.h;
                if (actionBarContextView.d2 == null) {
                    actionBarContextView.h();
                }
                r.this.g.s().sendAccessibilityEvent(32);
                r rVar2 = r.this;
                rVar2.e.setHideOnContentScrollEnabled(rVar2.y);
                r.this.k = null;
            }
        }

        public View d() {
            WeakReference<View> weakReference = this.Y1;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public Menu e() {
            return this.x;
        }

        public MenuInflater f() {
            return new f(this.q);
        }

        public CharSequence g() {
            return r.this.h.getSubtitle();
        }

        public CharSequence h() {
            return r.this.h.getTitle();
        }

        public void i() {
            if (r.this.k == this) {
                this.x.z();
                try {
                    this.y.c(this, this.x);
                } finally {
                    this.x.y();
                }
            }
        }

        public boolean j() {
            return r.this.h.l2;
        }

        public void k(View view) {
            r.this.h.setCustomView(view);
            this.Y1 = new WeakReference<>(view);
        }

        public void l(int i) {
            r.this.h.setSubtitle(r.this.c.getResources().getString(i));
        }

        public void m(CharSequence charSequence) {
            r.this.h.setSubtitle(charSequence);
        }

        public void n(int i) {
            r.this.h.setTitle(r.this.c.getResources().getString(i));
        }

        public void o(CharSequence charSequence) {
            r.this.h.setTitle(charSequence);
        }

        public void p(boolean z) {
            this.d = z;
            r.this.h.setTitleOptional(z);
        }
    }

    public r(Activity activity, boolean z2) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        z(decorView);
        if (!z2) {
            this.i = decorView.findViewById(16908290);
        }
    }

    public void A(int i2, int i3) {
        int u2 = this.g.u();
        if ((i3 & 4) != 0) {
            this.j = true;
        }
        this.g.l((i2 & i3) | ((~i3) & u2));
    }

    public final void B(boolean z2) {
        this.p = z2;
        if (!z2) {
            this.g.j((p0) null);
            this.f.setTabContainer((p0) null);
        } else {
            this.f.setTabContainer((p0) null);
            this.g.j((p0) null);
        }
        boolean z3 = true;
        boolean z4 = this.g.o() == 2;
        this.g.y(!this.p && z4);
        ActionBarOverlayLayout actionBarOverlayLayout = this.e;
        if (this.p || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z3);
    }

    public final void C(boolean z2) {
        View view;
        View view2;
        View view3;
        if (this.u || (!this.s && !this.t)) {
            if (!this.v) {
                this.v = true;
                h0.b.e.g gVar = this.w;
                if (gVar != null) {
                    gVar.a();
                }
                this.f.setVisibility(0);
                if (this.q != 0 || (!this.x && !z2)) {
                    this.f.setAlpha(1.0f);
                    this.f.setTranslationY(0.0f);
                    if (this.r && (view2 = this.i) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.A.b((View) null);
                } else {
                    this.f.setTranslationY(0.0f);
                    float f2 = (float) (-this.f.getHeight());
                    if (z2) {
                        int[] iArr = {0, 0};
                        this.f.getLocationInWindow(iArr);
                        f2 -= (float) iArr[1];
                    }
                    this.f.setTranslationY(f2);
                    h0.b.e.g gVar2 = new h0.b.e.g();
                    y b2 = q.b(this.f);
                    b2.j(0.0f);
                    b2.h(this.B);
                    if (!gVar2.e) {
                        gVar2.a.add(b2);
                    }
                    if (this.r && (view3 = this.i) != null) {
                        view3.setTranslationY(f2);
                        y b3 = q.b(this.i);
                        b3.j(0.0f);
                        if (!gVar2.e) {
                            gVar2.a.add(b3);
                        }
                    }
                    Interpolator interpolator = b;
                    boolean z3 = gVar2.e;
                    if (!z3) {
                        gVar2.c = interpolator;
                    }
                    if (!z3) {
                        gVar2.b = 250;
                    }
                    z zVar = this.A;
                    if (!z3) {
                        gVar2.d = zVar;
                    }
                    this.w = gVar2;
                    gVar2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.e;
                if (actionBarOverlayLayout != null) {
                    AtomicInteger atomicInteger = q.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
            }
        } else if (this.v) {
            this.v = false;
            h0.b.e.g gVar3 = this.w;
            if (gVar3 != null) {
                gVar3.a();
            }
            if (this.q != 0 || (!this.x && !z2)) {
                this.z.b((View) null);
                return;
            }
            this.f.setAlpha(1.0f);
            this.f.setTransitioning(true);
            h0.b.e.g gVar4 = new h0.b.e.g();
            float f3 = (float) (-this.f.getHeight());
            if (z2) {
                int[] iArr2 = {0, 0};
                this.f.getLocationInWindow(iArr2);
                f3 -= (float) iArr2[1];
            }
            y b4 = q.b(this.f);
            b4.j(f3);
            b4.h(this.B);
            if (!gVar4.e) {
                gVar4.a.add(b4);
            }
            if (this.r && (view = this.i) != null) {
                y b5 = q.b(view);
                b5.j(f3);
                if (!gVar4.e) {
                    gVar4.a.add(b5);
                }
            }
            Interpolator interpolator2 = a;
            boolean z4 = gVar4.e;
            if (!z4) {
                gVar4.c = interpolator2;
            }
            if (!z4) {
                gVar4.b = 250;
            }
            z zVar2 = this.z;
            if (!z4) {
                gVar4.d = zVar2;
            }
            this.w = gVar4;
            gVar4.b();
        }
    }

    public boolean b() {
        a0 a0Var = this.g;
        if (a0Var == null || !a0Var.k()) {
            return false;
        }
        this.g.collapseActionView();
        return true;
    }

    public void c(boolean z2) {
        if (z2 != this.n) {
            this.n = z2;
            int size = this.o.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.o.get(i2).a(z2);
            }
        }
    }

    public int d() {
        return this.g.u();
    }

    public Context e() {
        if (this.d == null) {
            TypedValue typedValue = new TypedValue();
            this.c.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.d = new ContextThemeWrapper(this.c, i2);
            } else {
                this.d = this.c;
            }
        }
        return this.d;
    }

    public void f() {
        if (!this.s) {
            this.s = true;
            C(false);
        }
    }

    public void h(Configuration configuration) {
        B(this.c.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }

    public boolean j(int i2, KeyEvent keyEvent) {
        h0.b.e.i.g gVar;
        d dVar = this.k;
        if (dVar == null || (gVar = dVar.x) == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        gVar.setQwertyMode(z2);
        return gVar.performShortcut(i2, keyEvent, 0);
    }

    public void m(Drawable drawable) {
        this.f.setPrimaryBackground(drawable);
    }

    public void n(View view, a.C0015a aVar) {
        view.setLayoutParams(aVar);
        this.g.v(view);
    }

    public void o(boolean z2) {
        if (!this.j) {
            A(z2 ? 4 : 0, 4);
        }
    }

    public void p(boolean z2) {
        A(z2 ? 4 : 0, 4);
    }

    public void q(boolean z2) {
        A(z2 ? 16 : 0, 16);
    }

    public void r(boolean z2) {
        A(z2 ? 2 : 0, 2);
    }

    public void s(boolean z2) {
        h0.b.e.g gVar;
        this.x = z2;
        if (!z2 && (gVar = this.w) != null) {
            gVar.a();
        }
    }

    public void t(int i2) {
        this.g.setTitle(this.c.getString(i2));
    }

    public void u(CharSequence charSequence) {
        this.g.setTitle(charSequence);
    }

    public void v(CharSequence charSequence) {
        this.g.setWindowTitle(charSequence);
    }

    public void w() {
        if (this.s) {
            this.s = false;
            C(false);
        }
    }

    public h0.b.e.a x(a.C0017a aVar) {
        d dVar = this.k;
        if (dVar != null) {
            dVar.c();
        }
        this.e.setHideOnContentScrollEnabled(false);
        this.h.h();
        d dVar2 = new d(this.h.getContext(), aVar);
        dVar2.x.z();
        try {
            if (!dVar2.y.b(dVar2, dVar2.x)) {
                return null;
            }
            this.k = dVar2;
            dVar2.i();
            this.h.f(dVar2);
            y(true);
            this.h.sendAccessibilityEvent(32);
            return dVar2;
        } finally {
            dVar2.x.y();
        }
    }

    public void y(boolean z2) {
        y yVar;
        y yVar2;
        if (z2) {
            if (!this.u) {
                this.u = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.e;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                C(false);
            }
        } else if (this.u) {
            this.u = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.e;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            C(false);
        }
        ActionBarContainer actionBarContainer = this.f;
        AtomicInteger atomicInteger = q.a;
        if (actionBarContainer.isLaidOut()) {
            if (z2) {
                yVar = this.g.p(4, 100);
                yVar2 = this.h.e(0, 200);
            } else {
                yVar2 = this.g.p(0, 200);
                yVar = this.h.e(8, 100);
            }
            h0.b.e.g gVar = new h0.b.e.g();
            gVar.a.add(yVar);
            View view = (View) yVar.a.get();
            yVar2.g(view != null ? view.animate().getDuration() : 0);
            gVar.a.add(yVar2);
            gVar.b();
        } else if (z2) {
            this.g.r(4);
            this.h.setVisibility(0);
        } else {
            this.g.r(0);
            this.h.setVisibility(8);
        }
    }

    public final void z(View view) {
        a0 a0Var;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof a0) {
            a0Var = (a0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            a0Var = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder P0 = i0.d.a.a.a.P0("Can't make a decor toolbar out of ");
            P0.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(P0.toString());
        }
        this.g = a0Var;
        this.h = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f = actionBarContainer;
        a0 a0Var2 = this.g;
        if (a0Var2 == null || this.h == null || actionBarContainer == null) {
            throw new IllegalStateException(r.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.c = a0Var2.getContext();
        boolean z2 = (this.g.u() & 4) != 0;
        if (z2) {
            this.j = true;
        }
        Context context = this.c;
        this.g.t((context.getApplicationInfo().targetSdkVersion < 14) || z2);
        B(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.c.obtainStyledAttributes((AttributeSet) null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(R.styleable.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.e;
            if (actionBarOverlayLayout2.b2) {
                this.y = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f;
            AtomicInteger atomicInteger = q.a;
            actionBarContainer2.setElevation((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public r(Dialog dialog) {
        new ArrayList();
        z(dialog.getWindow().getDecorView());
    }
}
