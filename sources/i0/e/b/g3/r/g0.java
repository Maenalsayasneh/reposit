package i0.e.b.g3.r;

import android.content.DialogInterface;
import com.clubhouse.android.ui.onboarding.WelcomeRoomFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class g0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ WelcomeRoomFragment c;

    public /* synthetic */ g0(WelcomeRoomFragment welcomeRoomFragment) {
        this.c = welcomeRoomFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        WelcomeRoomFragment welcomeRoomFragment = this.c;
        i.e(welcomeRoomFragment, "this$0");
        k<Object>[] kVarArr = WelcomeRoomFragment.Z1;
        welcomeRoomFragment.O0().p(m1.a);
        dialogInterface.cancel();
    }
}
