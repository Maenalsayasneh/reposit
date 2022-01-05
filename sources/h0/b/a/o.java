package h0.b.a;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import h0.b.a.a;
import h0.b.e.h;
import h0.b.e.i.g;
import h0.b.e.i.m;
import h0.b.f.a0;
import h0.b.f.y0;
import h0.i.i.q;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ToolbarActionBar */
public class o extends a {
    public a0 a;
    public boolean b;
    public Window.Callback c;
    public boolean d;
    public boolean e;
    public ArrayList<a.b> f = new ArrayList<>();
    public final Runnable g = new a();
    public final Toolbar.f h;

    /* compiled from: ToolbarActionBar */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            o oVar = o.this;
            Menu y = oVar.y();
            g gVar = y instanceof g ? (g) y : null;
            if (gVar != null) {
                gVar.z();
            }
            try {
                y.clear();
                if (!oVar.c.onCreatePanelMenu(0, y) || !oVar.c.onPreparePanel(0, (View) null, y)) {
                    y.clear();
                }
            } finally {
                if (gVar != null) {
                    gVar.y();
                }
            }
        }
    }

    /* compiled from: ToolbarActionBar */
    public class b implements Toolbar.f {
        public b() {
        }
    }

    /* compiled from: ToolbarActionBar */
    public final class c implements m.a {
        public boolean c;

        public c() {
        }

        public void c(g gVar, boolean z) {
            if (!this.c) {
                this.c = true;
                o.this.a.i();
                Window.Callback callback = o.this.c;
                if (callback != null) {
                    callback.onPanelClosed(108, gVar);
                }
                this.c = false;
            }
        }

        public boolean d(g gVar) {
            Window.Callback callback = o.this.c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* compiled from: ToolbarActionBar */
    public final class d implements g.a {
        public d() {
        }

        public boolean a(g gVar, MenuItem menuItem) {
            return false;
        }

        public void b(g gVar) {
            o oVar = o.this;
            if (oVar.c == null) {
                return;
            }
            if (oVar.a.b()) {
                o.this.c.onPanelClosed(108, gVar);
            } else if (o.this.c.onPreparePanel(0, (View) null, gVar)) {
                o.this.c.onMenuOpened(108, gVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar */
    public class e extends h {
        public e(Window.Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(o.this.a.getContext());
            }
            return this.c.onCreatePanelView(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = this.c.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                o oVar = o.this;
                if (!oVar.b) {
                    oVar.a.c();
                    o.this.b = true;
                }
            }
            return onPreparePanel;
        }
    }

    public o(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.h = bVar;
        this.a = new y0(toolbar, false);
        e eVar = new e(callback);
        this.c = eVar;
        this.a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.a.setWindowTitle(charSequence);
    }

    public boolean a() {
        return this.a.g();
    }

    public boolean b() {
        if (!this.a.k()) {
            return false;
        }
        this.a.collapseActionView();
        return true;
    }

    public void c(boolean z) {
        if (z != this.e) {
            this.e = z;
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                this.f.get(i).a(z);
            }
        }
    }

    public int d() {
        return this.a.u();
    }

    public Context e() {
        return this.a.getContext();
    }

    public void f() {
        this.a.r(8);
    }

    public boolean g() {
        this.a.s().removeCallbacks(this.g);
        ViewGroup s = this.a.s();
        Runnable runnable = this.g;
        AtomicInteger atomicInteger = q.a;
        s.postOnAnimation(runnable);
        return true;
    }

    public void h(Configuration configuration) {
    }

    public void i() {
        this.a.s().removeCallbacks(this.g);
    }

    public boolean j(int i, KeyEvent keyEvent) {
        Menu y = y();
        if (y == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        y.setQwertyMode(z);
        return y.performShortcut(i, keyEvent, 0);
    }

    public boolean k(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.a.h();
        }
        return true;
    }

    public boolean l() {
        return this.a.h();
    }

    public void m(Drawable drawable) {
        this.a.e(drawable);
    }

    public void n(View view, a.C0015a aVar) {
        view.setLayoutParams(aVar);
        this.a.v(view);
    }

    public void o(boolean z) {
    }

    public void p(boolean z) {
        z(z ? 4 : 0, 4);
    }

    public void q(boolean z) {
        z(z ? 16 : 0, 16);
    }

    public void r(boolean z) {
        z(z ? 2 : 0, 2);
    }

    public void s(boolean z) {
    }

    public void t(int i) {
        a0 a0Var = this.a;
        a0Var.setTitle(i != 0 ? a0Var.getContext().getText(i) : null);
    }

    public void u(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    public void v(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    public void w() {
        this.a.r(0);
    }

    public final Menu y() {
        if (!this.d) {
            this.a.q(new c(), new d());
            this.d = true;
        }
        return this.a.m();
    }

    public void z(int i, int i2) {
        this.a.l((i & i2) | ((~i2) & this.a.u()));
    }
}
