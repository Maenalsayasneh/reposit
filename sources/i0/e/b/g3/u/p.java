package i0.e.b.g3.u;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import androidx.navigation.NavController;
import com.clubhouse.android.ui.profile.HalfProfileContainerFragment;
import g0.a.b.b.a;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class p implements DialogInterface.OnKeyListener {
    public final /* synthetic */ HalfProfileContainerFragment c;

    public /* synthetic */ p(HalfProfileContainerFragment halfProfileContainerFragment) {
        this.c = halfProfileContainerFragment;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        View view;
        HalfProfileContainerFragment halfProfileContainerFragment = this.c;
        k<Object>[] kVarArr = HalfProfileContainerFragment.l2;
        i.e(halfProfileContainerFragment, "this$0");
        if (i == 4 && keyEvent.getAction() == 1 && (view = halfProfileContainerFragment.getView()) != null) {
            i.f(view, "$this$findNavController");
            NavController F = a.F(view);
            i.b(F, "Navigation.findNavController(this)");
            if (F.k()) {
                return true;
            }
        }
        return false;
    }
}
