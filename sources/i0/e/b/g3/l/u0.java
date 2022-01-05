package i0.e.b.g3.l;

import android.view.View;
import android.widget.Button;
import com.clubhouse.android.ui.clubs.ClubMemberSearchFragment;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class u0 implements View.OnFocusChangeListener {
    public final /* synthetic */ ClubMemberSearchFragment a;

    public /* synthetic */ u0(ClubMemberSearchFragment clubMemberSearchFragment) {
        this.a = clubMemberSearchFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        ClubMemberSearchFragment clubMemberSearchFragment = this.a;
        ClubMemberSearchFragment.a aVar = ClubMemberSearchFragment.Z1;
        i.e(clubMemberSearchFragment, "this$0");
        if (z) {
            Button button = clubMemberSearchFragment.N0().b;
            i.d(button, "binding.cancel");
            k.K(button);
        }
    }
}
