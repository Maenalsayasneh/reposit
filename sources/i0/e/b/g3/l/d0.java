package i0.e.b.g3.l;

import android.view.MenuItem;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.ui.clubs.ClubFragment;
import com.clubhouse.android.ui.clubs.ClubFragment$bindMenuForLeader$1$1$1$1;
import com.clubhouse.app.R;
import h0.b.a.d;
import h0.b.f.m0;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class d0 implements m0.a {
    public final /* synthetic */ ClubFragment a;
    public final /* synthetic */ ClubWithAdmin b;

    public /* synthetic */ d0(ClubFragment clubFragment, ClubWithAdmin clubWithAdmin) {
        this.a = clubFragment;
        this.b = clubWithAdmin;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        ClubFragment clubFragment = this.a;
        ClubWithAdmin clubWithAdmin = this.b;
        i.e(clubFragment, "this$0");
        i.e(clubWithAdmin, "$club");
        if (menuItem.getItemId() != R.id.leave_club) {
            return false;
        }
        ClubFragment$bindMenuForLeader$1$1$1$1 clubFragment$bindMenuForLeader$1$1$1$1 = new ClubFragment$bindMenuForLeader$1$1$1$1(clubWithAdmin, clubFragment);
        i.e(clubFragment, "<this>");
        i.e(clubFragment$bindMenuForLeader$1$1$1$1, "f");
        d.a aVar = new d.a(clubFragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
        clubFragment$bindMenuForLeader$1$1$1$1.invoke(aVar);
        aVar.g();
        return true;
    }
}
