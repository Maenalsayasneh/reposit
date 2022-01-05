package i0.e.b.g3.l.c3;

import android.os.Build;
import android.view.View;
import com.clubhouse.android.ui.clubs.ClubRole;
import com.clubhouse.app.R;
import h0.b.e.i.g;
import h0.b.f.m0;
import h0.i.d.a.a;
import i0.e.b.g3.l.c3.p;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ p c;

    public /* synthetic */ d(p pVar) {
        this.c = pVar;
    }

    public final void onClick(View view) {
        int i;
        p pVar = this.c;
        i.e(pVar, "this$0");
        i.d(view, "it");
        m0 m0Var = new m0(view.getContext(), view);
        m0Var.a(R.menu.menu_club_member_admin_action);
        g gVar = m0Var.b;
        if (gVar instanceof a) {
            gVar.setGroupDividerEnabled(true);
        } else if (Build.VERSION.SDK_INT >= 28) {
            gVar.setGroupDividerEnabled(true);
        }
        ClubRole clubRole = pVar.o;
        if (clubRole == null) {
            i = -1;
        } else {
            i = p.b.a[clubRole.ordinal()];
        }
        if (i == 1) {
            m0Var.b.findItem(R.id.admin).setChecked(true);
        } else if (i == 2) {
            m0Var.b.findItem(R.id.leader).setChecked(true);
        } else if (i == 3) {
            m0Var.b.findItem(R.id.member).setChecked(true);
        }
        m0Var.e = pVar.t;
        if (!m0Var.d.f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }
}
