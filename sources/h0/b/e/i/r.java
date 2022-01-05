package h0.b.e.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: SubMenuBuilder */
public class r extends g implements SubMenu {
    public i A;
    public g z;

    public r(Context context, g gVar, i iVar) {
        super(context);
        this.z = gVar;
        this.A = iVar;
    }

    public boolean d(i iVar) {
        return this.z.d(iVar);
    }

    public boolean e(g gVar, MenuItem menuItem) {
        return super.e(gVar, menuItem) || this.z.e(gVar, menuItem);
    }

    public boolean f(i iVar) {
        return this.z.f(iVar);
    }

    public MenuItem getItem() {
        return this.A;
    }

    public String j() {
        i iVar = this.A;
        int i = iVar != null ? iVar.a : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates" + ":" + i;
    }

    public g k() {
        return this.z.k();
    }

    public boolean m() {
        return this.z.m();
    }

    public boolean n() {
        return this.z.n();
    }

    public boolean o() {
        return this.z.o();
    }

    public void setGroupDividerEnabled(boolean z2) {
        this.z.setGroupDividerEnabled(z2);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        x(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        x(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        x(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z2) {
        this.z.setQwertyMode(z2);
    }

    public SubMenu setHeaderIcon(int i) {
        x(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        x(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }
}
