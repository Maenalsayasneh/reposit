package i0.e.b.g3.l;

import android.view.View;
import com.clubhouse.android.ui.clubs.ClubMemberSearchFragment;
import h0.b0.v;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class v0 implements View.OnClickListener {
    public final /* synthetic */ ClubMemberSearchFragment c;

    public /* synthetic */ v0(ClubMemberSearchFragment clubMemberSearchFragment) {
        this.c = clubMemberSearchFragment;
    }

    public final void onClick(View view) {
        ClubMemberSearchFragment clubMemberSearchFragment = this.c;
        ClubMemberSearchFragment.a aVar = ClubMemberSearchFragment.Z1;
        i.e(clubMemberSearchFragment, "this$0");
        clubMemberSearchFragment.N0().f.setText((CharSequence) null);
        i.d(view, "it");
        k.p(view);
        clubMemberSearchFragment.N0().f.clearFocus();
        v.x0(clubMemberSearchFragment);
    }
}
