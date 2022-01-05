package i0.e.b.g3.l;

import android.view.View;
import com.clubhouse.android.ui.clubs.ClubMemberSearchFragment;
import i0.e.b.b3.b.e.f;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class t0 implements View.OnClickListener {
    public final /* synthetic */ ClubMemberSearchFragment c;
    public final /* synthetic */ f d;

    public /* synthetic */ t0(ClubMemberSearchFragment clubMemberSearchFragment, f fVar) {
        this.c = clubMemberSearchFragment;
        this.d = fVar;
    }

    public final void onClick(View view) {
        ClubMemberSearchFragment clubMemberSearchFragment = this.c;
        f fVar = this.d;
        i.e(clubMemberSearchFragment, "this$0");
        ClubMemberSearchFragment.a aVar = ClubMemberSearchFragment.Z1;
        clubMemberSearchFragment.O0().p(new j2(fVar.g.getId().intValue()));
    }
}
