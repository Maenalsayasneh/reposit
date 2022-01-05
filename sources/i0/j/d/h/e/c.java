package i0.j.d.h.e;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.instabug.featuresrequest.R;
import i0.j.c.l.a;

/* compiled from: FeaturesMainFragment */
public class c implements PopupMenu.OnMenuItemClickListener {
    public final /* synthetic */ com.instabug.featuresrequest.ui.d.c a;

    public c(com.instabug.featuresrequest.ui.d.c cVar) {
        this.a = cVar;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (this.a.Y1 == null) {
            return false;
        }
        menuItem.setChecked(true);
        int itemId = menuItem.getItemId();
        if (itemId == R.id.sortBy_topRated) {
            com.instabug.featuresrequest.ui.d.c cVar = this.a;
            cVar.Y1.setText(a.E(cVar.getString(R.string.sort_by_top_rated)));
            com.instabug.featuresrequest.ui.d.c cVar2 = this.a;
            cVar2.Z1 = Boolean.TRUE;
            cVar2.a2 = 0;
            i0.j.d.e.a.a(0);
            com.instabug.featuresrequest.ui.d.c cVar3 = this.a;
            cVar3.L(cVar3.Z1.booleanValue());
            return true;
        } else if (itemId != R.id.sortBy_recentlyUpdated) {
            return false;
        } else {
            com.instabug.featuresrequest.ui.d.c cVar4 = this.a;
            cVar4.Y1.setText(a.E(cVar4.getString(R.string.sort_by_recently_updated)));
            com.instabug.featuresrequest.ui.d.c cVar5 = this.a;
            cVar5.Z1 = Boolean.FALSE;
            cVar5.a2 = 1;
            i0.j.d.e.a.a(1);
            com.instabug.featuresrequest.ui.d.c cVar6 = this.a;
            cVar6.L(cVar6.Z1.booleanValue());
            return true;
        }
    }
}
