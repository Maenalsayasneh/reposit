package h0.b.e;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import h0.b.e.a;
import h0.b.e.i.g;
import h0.b.f.c;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode */
public class d extends a implements g.a {
    public WeakReference<View> Y1;
    public boolean Z1;
    public g a2;
    public Context q;
    public ActionBarContextView x;
    public a.C0017a y;

    public d(Context context, ActionBarContextView actionBarContextView, a.C0017a aVar, boolean z) {
        this.q = context;
        this.x = actionBarContextView;
        this.y = aVar;
        g gVar = new g(actionBarContextView.getContext());
        gVar.m = 1;
        this.a2 = gVar;
        gVar.f = this;
    }

    public boolean a(g gVar, MenuItem menuItem) {
        return this.y.d(this, menuItem);
    }

    public void b(g gVar) {
        i();
        c cVar = this.x.x;
        if (cVar != null) {
            cVar.n();
        }
    }

    public void c() {
        if (!this.Z1) {
            this.Z1 = true;
            this.x.sendAccessibilityEvent(32);
            this.y.a(this);
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
        return this.a2;
    }

    public MenuInflater f() {
        return new f(this.x.getContext());
    }

    public CharSequence g() {
        return this.x.getSubtitle();
    }

    public CharSequence h() {
        return this.x.getTitle();
    }

    public void i() {
        this.y.c(this, this.a2);
    }

    public boolean j() {
        return this.x.l2;
    }

    public void k(View view) {
        this.x.setCustomView(view);
        this.Y1 = view != null ? new WeakReference<>(view) : null;
    }

    public void l(int i) {
        this.x.setSubtitle(this.q.getString(i));
    }

    public void m(CharSequence charSequence) {
        this.x.setSubtitle(charSequence);
    }

    public void n(int i) {
        this.x.setTitle(this.q.getString(i));
    }

    public void o(CharSequence charSequence) {
        this.x.setTitle(charSequence);
    }

    public void p(boolean z) {
        this.d = z;
        this.x.setTitleOptional(z);
    }
}
