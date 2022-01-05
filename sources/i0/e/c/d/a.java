package i0.e.c.d;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import androidx.navigation.NavController;
import com.clubhouse.android.core.ui.BaseBottomSheetFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class a implements DialogInterface.OnKeyListener {
    public final /* synthetic */ BaseBottomSheetFragment c;

    public /* synthetic */ a(BaseBottomSheetFragment baseBottomSheetFragment) {
        this.c = baseBottomSheetFragment;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        View view;
        BaseBottomSheetFragment baseBottomSheetFragment = this.c;
        i.e(baseBottomSheetFragment, "$this_handleBackPress");
        if (i == 4 && keyEvent.getAction() == 1 && (view = baseBottomSheetFragment.getView()) != null) {
            i.f(view, "$this$findNavController");
            NavController F = g0.a.b.b.a.F(view);
            i.b(F, "Navigation.findNavController(this)");
            if (F.l()) {
                return true;
            }
        }
        return false;
    }
}
