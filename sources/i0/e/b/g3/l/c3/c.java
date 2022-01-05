package i0.e.b.g3.l.c3;

import android.view.MenuItem;
import com.clubhouse.android.ui.clubs.ClubRole;
import com.clubhouse.app.R;
import h0.b.f.m0;
import m0.n.a.a;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class c implements m0.a {
    public final /* synthetic */ p a;

    public /* synthetic */ c(p pVar) {
        this.a = pVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        p pVar = this.a;
        i.e(pVar, "this$0");
        switch (menuItem.getItemId()) {
            case R.id.admin:
                l<? super ClubRole, m0.i> lVar = pVar.r;
                if (lVar == null) {
                    return true;
                }
                lVar.invoke(ClubRole.ADMIN);
                return true;
            case R.id.leader:
                l<? super ClubRole, m0.i> lVar2 = pVar.r;
                if (lVar2 == null) {
                    return true;
                }
                lVar2.invoke(ClubRole.LEADER);
                return true;
            case R.id.member:
                l<? super ClubRole, m0.i> lVar3 = pVar.r;
                if (lVar3 == null) {
                    return true;
                }
                lVar3.invoke(ClubRole.MEMBER);
                return true;
            case R.id.remove_from_club:
                a<m0.i> aVar = pVar.s;
                if (aVar == null) {
                    return true;
                }
                aVar.invoke();
                return true;
            default:
                return false;
        }
    }
}
