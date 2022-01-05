package i0.e.b.g3.r;

import android.view.View;
import com.clubhouse.android.ui.onboarding.WelcomeRoomFragment;
import com.clubhouse.android.ui.onboarding.WelcomeRoomFragment$onViewCreated$3$1;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class d0 implements View.OnClickListener {
    public final /* synthetic */ WelcomeRoomFragment c;

    public /* synthetic */ d0(WelcomeRoomFragment welcomeRoomFragment) {
        this.c = welcomeRoomFragment;
    }

    public final void onClick(View view) {
        WelcomeRoomFragment welcomeRoomFragment = this.c;
        k<Object>[] kVarArr = WelcomeRoomFragment.Z1;
        i.e(welcomeRoomFragment, "this$0");
        WelcomeRoomFragment$onViewCreated$3$1 welcomeRoomFragment$onViewCreated$3$1 = new WelcomeRoomFragment$onViewCreated$3$1(welcomeRoomFragment);
        i.e(welcomeRoomFragment, "<this>");
        i.e(welcomeRoomFragment$onViewCreated$3$1, "f");
        d.a aVar = new d.a(welcomeRoomFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
        welcomeRoomFragment$onViewCreated$3$1.invoke(aVar);
        aVar.g();
    }
}
