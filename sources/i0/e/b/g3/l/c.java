package i0.e.b.g3.l;

import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.ui.clubs.ClubFragment;
import com.clubhouse.android.ui.clubs.ClubFragment$bindMenuForLeader$1$1;
import h0.b.f.m0;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ ClubWithAdmin d;

    public /* synthetic */ c(ClubFragment clubFragment, ClubWithAdmin clubWithAdmin) {
        this.c = clubFragment;
        this.d = clubWithAdmin;
    }

    public final void onClick(View view) {
        ClubFragment clubFragment = this.c;
        ClubWithAdmin clubWithAdmin = this.d;
        k<Object>[] kVarArr = ClubFragment.e2;
        i.e(clubFragment, "this$0");
        i.e(clubWithAdmin, "$club");
        i.d(view, "it");
        ClubFragment$bindMenuForLeader$1$1 clubFragment$bindMenuForLeader$1$1 = new ClubFragment$bindMenuForLeader$1$1(clubFragment, clubWithAdmin);
        i.e(clubFragment, "<this>");
        i.e(view, "anchor");
        i.e(clubFragment$bindMenuForLeader$1$1, "f");
        m0 m0Var = new m0(clubFragment.requireContext(), view);
        clubFragment$bindMenuForLeader$1$1.invoke(m0Var);
        if (!m0Var.d.f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }
}
