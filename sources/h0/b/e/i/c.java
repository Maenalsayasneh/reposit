package h0.b.e.i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import h0.f.h;
import h0.i.d.a.b;

/* compiled from: BaseMenuWrapper */
public abstract class c {
    public final Context a;
    public h<b, MenuItem> b;
    public h<h0.i.d.a.c, SubMenu> c;

    public c(Context context) {
        this.a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.b == null) {
            this.b = new h<>();
        }
        MenuItem orDefault = this.b.getOrDefault(menuItem, null);
        if (orDefault != null) {
            return orDefault;
        }
        j jVar = new j(this.a, bVar);
        this.b.put(bVar, jVar);
        return jVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof h0.i.d.a.c)) {
            return subMenu;
        }
        h0.i.d.a.c cVar = (h0.i.d.a.c) subMenu;
        if (this.c == null) {
            this.c = new h<>();
        }
        SubMenu subMenu2 = this.c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.a, cVar);
        this.c.put(cVar, sVar);
        return sVar;
    }
}
