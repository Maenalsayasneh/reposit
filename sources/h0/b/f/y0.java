package h0.b.f;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import h0.b.e.i.g;
import h0.b.e.i.i;
import h0.b.e.i.m;
import h0.i.i.a0;
import h0.i.i.q;
import h0.i.i.y;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ToolbarWidgetWrapper */
public class y0 implements a0 {
    public Toolbar a;
    public int b;
    public View c;
    public View d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public boolean h;
    public CharSequence i;
    public CharSequence j;
    public CharSequence k;
    public Window.Callback l;
    public boolean m;
    public c n;
    public int o = 0;
    public Drawable p;

    /* compiled from: ToolbarWidgetWrapper */
    public class a extends a0 {
        public boolean a = false;
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        public void a(View view) {
            this.a = true;
        }

        public void b(View view) {
            if (!this.a) {
                y0.this.a.setVisibility(this.b);
            }
        }

        public void c(View view) {
            y0.this.a.setVisibility(0);
        }
    }

    public y0(Toolbar toolbar, boolean z) {
        int i2;
        Drawable drawable;
        int i3 = R.string.abc_action_bar_up_description;
        this.a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        String str = null;
        w0 q = w0.q(toolbar.getContext(), (AttributeSet) null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        this.p = q.g(R.styleable.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence n2 = q.n(R.styleable.ActionBar_title);
            if (!TextUtils.isEmpty(n2)) {
                setTitle(n2);
            }
            CharSequence n3 = q.n(R.styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(n3)) {
                this.j = n3;
                if ((this.b & 8) != 0) {
                    this.a.setSubtitle(n3);
                }
            }
            Drawable g2 = q.g(R.styleable.ActionBar_logo);
            if (g2 != null) {
                this.f = g2;
                B();
            }
            Drawable g3 = q.g(R.styleable.ActionBar_icon);
            if (g3 != null) {
                this.e = g3;
                B();
            }
            if (this.g == null && (drawable = this.p) != null) {
                this.g = drawable;
                A();
            }
            l(q.j(R.styleable.ActionBar_displayOptions, 0));
            int l2 = q.l(R.styleable.ActionBar_customNavigationLayout, 0);
            if (l2 != 0) {
                v(LayoutInflater.from(this.a.getContext()).inflate(l2, this.a, false));
                l(this.b | 16);
            }
            int k2 = q.k(R.styleable.ActionBar_height, 0);
            if (k2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = k2;
                this.a.setLayoutParams(layoutParams);
            }
            int e2 = q.e(R.styleable.ActionBar_contentInsetStart, -1);
            int e3 = q.e(R.styleable.ActionBar_contentInsetEnd, -1);
            if (e2 >= 0 || e3 >= 0) {
                Toolbar toolbar2 = this.a;
                int max = Math.max(e2, 0);
                int max2 = Math.max(e3, 0);
                toolbar2.d();
                toolbar2.m2.a(max, max2);
            }
            int l3 = q.l(R.styleable.ActionBar_titleTextStyle, 0);
            if (l3 != 0) {
                Toolbar toolbar3 = this.a;
                Context context = toolbar3.getContext();
                toolbar3.e2 = l3;
                TextView textView = toolbar3.d;
                if (textView != null) {
                    textView.setTextAppearance(context, l3);
                }
            }
            int l4 = q.l(R.styleable.ActionBar_subtitleTextStyle, 0);
            if (l4 != 0) {
                Toolbar toolbar4 = this.a;
                Context context2 = toolbar4.getContext();
                toolbar4.f2 = l4;
                TextView textView2 = toolbar4.q;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, l4);
                }
            }
            int l5 = q.l(R.styleable.ActionBar_popupTheme, 0);
            if (l5 != 0) {
                this.a.setPopupTheme(l5);
            }
        } else {
            if (this.a.getNavigationIcon() != null) {
                i2 = 15;
                this.p = this.a.getNavigationIcon();
            } else {
                i2 = 11;
            }
            this.b = i2;
        }
        q.b.recycle();
        if (i3 != this.o) {
            this.o = i3;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                int i4 = this.o;
                this.k = i4 != 0 ? getContext().getString(i4) : str;
                z();
            }
        }
        this.k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new x0(this));
    }

    public final void A() {
        if ((this.b & 4) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.g;
            if (drawable == null) {
                drawable = this.p;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.a.setNavigationIcon((Drawable) null);
    }

    public final void B() {
        Drawable drawable;
        int i2 = this.b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f;
            if (drawable == null) {
                drawable = this.e;
            }
        } else {
            drawable = this.e;
        }
        this.a.setLogo(drawable);
    }

    public void a(Menu menu, m.a aVar) {
        i iVar;
        if (this.n == null) {
            c cVar = new c(this.a.getContext());
            this.n = cVar;
            Objects.requireNonNull(cVar);
        }
        c cVar2 = this.n;
        cVar2.y = aVar;
        Toolbar toolbar = this.a;
        g gVar = (g) menu;
        if (gVar != null || toolbar.c != null) {
            toolbar.f();
            g gVar2 = toolbar.c.i2;
            if (gVar2 != gVar) {
                if (gVar2 != null) {
                    gVar2.u(toolbar.C2);
                    gVar2.u(toolbar.D2);
                }
                if (toolbar.D2 == null) {
                    toolbar.D2 = new Toolbar.d();
                }
                cVar2.j2 = true;
                if (gVar != null) {
                    gVar.b(cVar2, toolbar.c2);
                    gVar.b(toolbar.D2, toolbar.c2);
                } else {
                    cVar2.i(toolbar.c2, (g) null);
                    Toolbar.d dVar = toolbar.D2;
                    g gVar3 = dVar.c;
                    if (!(gVar3 == null || (iVar = dVar.d) == null)) {
                        gVar3.d(iVar);
                    }
                    dVar.c = null;
                    cVar2.d(true);
                    toolbar.D2.d(true);
                }
                toolbar.c.setPopupTheme(toolbar.d2);
                toolbar.c.setPresenter(cVar2);
                toolbar.C2 = cVar2;
            }
        }
    }

    public boolean b() {
        return this.a.p();
    }

    public void c() {
        this.m = true;
    }

    public void collapseActionView() {
        i iVar;
        Toolbar.d dVar = this.a.D2;
        if (dVar == null) {
            iVar = null;
        } else {
            iVar = dVar.d;
        }
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d() {
        /*
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.a
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r0.c
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.l2
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.f.y0.d():boolean");
    }

    public void e(Drawable drawable) {
        Toolbar toolbar = this.a;
        AtomicInteger atomicInteger = q.a;
        toolbar.setBackground(drawable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            h0.b.f.c r0 = r0.m2
            if (r0 == 0) goto L_0x001e
            h0.b.f.c$c r3 = r0.o2
            if (r3 != 0) goto L_0x0019
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = r2
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            if (r0 == 0) goto L_0x001e
            r0 = r1
            goto L_0x001f
        L_0x001e:
            r0 = r2
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r2
        L_0x0023:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.f.y0.f():boolean");
    }

    public boolean g() {
        ActionMenuView actionMenuView = this.a.c;
        if (actionMenuView != null) {
            c cVar = actionMenuView.m2;
            if (cVar != null && cVar.j()) {
                return true;
            }
        }
        return false;
    }

    public Context getContext() {
        return this.a.getContext();
    }

    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    public boolean h() {
        return this.a.v();
    }

    public void i() {
        c cVar;
        ActionMenuView actionMenuView = this.a.c;
        if (actionMenuView != null && (cVar = actionMenuView.m2) != null) {
            cVar.a();
        }
    }

    public void j(p0 p0Var) {
        Toolbar toolbar;
        View view = this.c;
        if (view != null && view.getParent() == (toolbar = this.a)) {
            toolbar.removeView(this.c);
        }
        this.c = null;
    }

    public boolean k() {
        Toolbar.d dVar = this.a.D2;
        return (dVar == null || dVar.d == null) ? false : true;
    }

    public void l(int i2) {
        View view;
        int i3 = this.b ^ i2;
        this.b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    z();
                }
                A();
            }
            if ((i3 & 3) != 0) {
                B();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.setTitle(this.i);
                    this.a.setSubtitle(this.j);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) != 0 && (view = this.d) != null) {
                if ((i2 & 16) != 0) {
                    this.a.addView(view);
                } else {
                    this.a.removeView(view);
                }
            }
        }
    }

    public Menu m() {
        return this.a.getMenu();
    }

    public void n(int i2) {
        this.f = i2 != 0 ? h0.b.b.a.a.a(getContext(), i2) : null;
        B();
    }

    public int o() {
        return 0;
    }

    public y p(int i2, long j2) {
        y b2 = q.b(this.a);
        b2.a(i2 == 0 ? 1.0f : 0.0f);
        b2.c(j2);
        a aVar = new a(i2);
        View view = (View) b2.a.get();
        if (view != null) {
            b2.f(view, aVar);
        }
        return b2;
    }

    public void q(m.a aVar, g.a aVar2) {
        Toolbar toolbar = this.a;
        toolbar.E2 = aVar;
        toolbar.F2 = aVar2;
        ActionMenuView actionMenuView = toolbar.c;
        if (actionMenuView != null) {
            actionMenuView.n2 = aVar;
            actionMenuView.o2 = aVar2;
        }
    }

    public void r(int i2) {
        this.a.setVisibility(i2);
    }

    public ViewGroup s() {
        return this.a;
    }

    public void setIcon(int i2) {
        this.e = i2 != 0 ? h0.b.b.a.a.a(getContext(), i2) : null;
        B();
    }

    public void setTitle(CharSequence charSequence) {
        this.h = true;
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.h) {
            this.i = charSequence;
            if ((this.b & 8) != 0) {
                this.a.setTitle(charSequence);
            }
        }
    }

    public void t(boolean z) {
    }

    public int u() {
        return this.b;
    }

    public void v(View view) {
        View view2 = this.d;
        if (!(view2 == null || (this.b & 16) == 0)) {
            this.a.removeView(view2);
        }
        this.d = view;
        if (view != null && (this.b & 16) != 0) {
            this.a.addView(view);
        }
    }

    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void x() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void y(boolean z) {
        this.a.setCollapsible(z);
    }

    public final void z() {
        if ((this.b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.k)) {
            this.a.setNavigationContentDescription(this.o);
        } else {
            this.a.setNavigationContentDescription(this.k);
        }
    }

    public void setIcon(Drawable drawable) {
        this.e = drawable;
        B();
    }
}
