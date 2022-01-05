package i0.e.b.g3.l;

import android.view.MenuItem;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.data.models.local.club.ClubRule;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import com.clubhouse.android.ui.clubs.ClubFragment;
import com.clubhouse.android.ui.clubs.ClubFragment$bindMenuForAdmin$1$1$1$1;
import com.clubhouse.android.ui.clubs.ClubFragment$bindMenuForAdmin$1$1$1$2;
import com.clubhouse.android.ui.clubs.ClubNavigation$showUpdateMembershipSetting$1;
import com.clubhouse.android.ui.clubs.create.topics.ClubTopicsArgs;
import com.clubhouse.android.ui.clubs.description.EditClubDescriptionArgs;
import com.clubhouse.android.ui.clubs.rules.EditClubRulesArgs;
import com.clubhouse.app.R;
import h0.b.a.d;
import h0.b.f.m0;
import h0.b0.v;
import h0.t.q;
import java.util.List;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class a0 implements m0.a {
    public final /* synthetic */ ClubFragment a;
    public final /* synthetic */ ClubWithAdmin b;
    public final /* synthetic */ GetClubResponse c;

    public /* synthetic */ a0(ClubFragment clubFragment, ClubWithAdmin clubWithAdmin, GetClubResponse getClubResponse) {
        this.a = clubFragment;
        this.b = clubWithAdmin;
        this.c = getClubResponse;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        ClubFragment clubFragment = this.a;
        ClubWithAdmin clubWithAdmin = this.b;
        GetClubResponse getClubResponse = this.c;
        i.e(clubFragment, "this$0");
        i.e(clubWithAdmin, "$club");
        i.e(getClubResponse, "$clubInfo");
        switch (menuItem.getItemId()) {
            case R.id.apply_to_join_setting:
                clubFragment.T0().p(new n2(!clubWithAdmin.h2));
                return true;
            case R.id.delete_club:
                ClubFragment$bindMenuForAdmin$1$1$1$2 clubFragment$bindMenuForAdmin$1$1$1$2 = new ClubFragment$bindMenuForAdmin$1$1$1$2(clubFragment);
                i.e(clubFragment, "<this>");
                i.e(clubFragment$bindMenuForAdmin$1$1$1$2, "f");
                d.a aVar = new d.a(clubFragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
                clubFragment$bindMenuForAdmin$1$1$1$2.invoke(aVar);
                aVar.g();
                return true;
            case R.id.edit_description:
                String str = clubWithAdmin.y;
                String str2 = clubWithAdmin.Z1;
                i.e(clubFragment, "<this>");
                i.e(str, "clubName");
                EditClubDescriptionArgs editClubDescriptionArgs = new EditClubDescriptionArgs(str, str2);
                i.e(editClubDescriptionArgs, "mavericksArg");
                v.a1(clubFragment, new h1(editClubDescriptionArgs), (q) null, 2);
                return true;
            case R.id.edit_rules:
                String str3 = clubWithAdmin.y;
                List<ClubRule> list = clubWithAdmin.a2;
                i.e(clubFragment, "<this>");
                i.e(str3, "clubName");
                i.e(list, "clubRules");
                EditClubRulesArgs editClubRulesArgs = new EditClubRulesArgs(str3, list);
                i.e(editClubRulesArgs, "mavericksArg");
                v.a1(clubFragment, new i1(editClubRulesArgs), (q) null, 2);
                return true;
            case R.id.edit_topics:
                List<Topic> list2 = getClubResponse.d2;
                i.e(clubFragment, "<this>");
                i.e(clubWithAdmin, "club");
                i.e(list2, "topics");
                ClubTopicsArgs clubTopicsArgs = new ClubTopicsArgs(clubWithAdmin, list2);
                i.e(clubTopicsArgs, "mavericksArg");
                v.a1(clubFragment, new g1(clubTopicsArgs), (q) null, 2);
                return true;
            case R.id.host_room_setting:
                clubFragment.T0().p(new p2(clubWithAdmin.x, !clubWithAdmin.e2));
                return true;
            case R.id.leave_club:
                ClubFragment$bindMenuForAdmin$1$1$1$1 clubFragment$bindMenuForAdmin$1$1$1$1 = new ClubFragment$bindMenuForAdmin$1$1$1$1(clubWithAdmin, clubFragment);
                i.e(clubFragment, "<this>");
                i.e(clubFragment$bindMenuForAdmin$1$1$1$1, "f");
                d.a aVar2 = new d.a(clubFragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
                clubFragment$bindMenuForAdmin$1$1$1$1.invoke(aVar2);
                aVar2.g();
                return true;
            case R.id.member_list_setting:
                clubFragment.T0().p(new q2(clubWithAdmin.x, !clubWithAdmin.i2));
                return true;
            case R.id.membership_setting:
                i.e(clubFragment, "<this>");
                v.v2(clubFragment.T0(), new ClubNavigation$showUpdateMembershipSetting$1(clubFragment));
                return true;
            default:
                return false;
        }
    }
}
