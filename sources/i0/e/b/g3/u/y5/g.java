package i0.e.b.g3.u.y5;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryContainerFragment;
import i0.h.a.c.g.d;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class g implements DialogInterface.OnKeyListener {
    public final /* synthetic */ d c;

    public /* synthetic */ g(d dVar) {
        this.c = dVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        d dVar = this.c;
        k<Object>[] kVarArr = ReportIncidentSelectCategoryContainerFragment.l2;
        i.e(dVar, "$this_apply");
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        dVar.dismiss();
        return true;
    }
}
