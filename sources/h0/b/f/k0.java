package h0.b.f;

import android.view.MenuItem;
import h0.b.e.i.g;
import h0.b.f.m0;

/* compiled from: PopupMenu */
public class k0 implements g.a {
    public final /* synthetic */ m0 c;

    public k0(m0 m0Var) {
        this.c = m0Var;
    }

    public boolean a(g gVar, MenuItem menuItem) {
        m0.a aVar = this.c.e;
        if (aVar != null) {
            return aVar.onMenuItemClick(menuItem);
        }
        return false;
    }

    public void b(g gVar) {
    }
}
