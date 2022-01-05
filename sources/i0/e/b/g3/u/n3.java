package i0.e.b.g3.u;

import android.content.Context;
import android.view.MenuItem;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.ui.profile.HalfProfileUtil$showBlockConfirmationDialog$1;
import com.clubhouse.android.ui.profile.HalfProfileUtil$showUnblockConfirmationDialog$1;
import com.clubhouse.android.ui.profile.ProfileFragment;
import com.clubhouse.android.ui.profile.ProfileViewModel;
import com.clubhouse.android.ui.profile.reports.ReportProfileArgs;
import com.clubhouse.android.ui.profile.reports.ReportProfileLegacyArgs;
import com.clubhouse.app.R;
import com.instabug.library.model.NetworkLog;
import h0.b.a.d;
import h0.b.f.m0;
import h0.b0.v;
import h0.t.q;
import i0.e.a.b.a;
import i0.e.b.g3.u.y4;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class n3 implements m0.a {
    public final /* synthetic */ ProfileFragment a;
    public final /* synthetic */ c5 b;
    public final /* synthetic */ UserProfile c;

    public /* synthetic */ n3(ProfileFragment profileFragment, c5 c5Var, UserProfile userProfile) {
        this.a = profileFragment;
        this.b = c5Var;
        this.c = userProfile;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        ProfileFragment profileFragment = this.a;
        c5 c5Var = this.b;
        UserProfile userProfile = this.c;
        i.e(profileFragment, "this$0");
        i.e(c5Var, "$state");
        switch (menuItem.getItemId()) {
            case R.id.block:
                ProfileViewModel P0 = profileFragment.P0();
                i.e(profileFragment, "<this>");
                i.e(userProfile, "user");
                i.e(P0, "viewModel");
                HalfProfileUtil$showBlockConfirmationDialog$1 halfProfileUtil$showBlockConfirmationDialog$1 = new HalfProfileUtil$showBlockConfirmationDialog$1(profileFragment, userProfile, P0);
                i.e(profileFragment, "<this>");
                i.e(halfProfileUtil$showBlockConfirmationDialog$1, "f");
                d.a aVar = new d.a(profileFragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
                halfProfileUtil$showBlockConfirmationDialog$1.invoke(aVar);
                aVar.g();
                return true;
            case R.id.report_incident:
                if (c5Var.u) {
                    ReportProfileArgs reportProfileArgs = new ReportProfileArgs(userProfile, (String) null, false, false, v.R1(profileFragment), 14);
                    i.e(reportProfileArgs, "mavericksArg");
                    v.a1(profileFragment, new y4.j(reportProfileArgs), (q) null, 2);
                    return true;
                }
                ReportProfileLegacyArgs reportProfileLegacyArgs = new ReportProfileLegacyArgs(userProfile, (String) null, false, false, 14);
                i.e(reportProfileLegacyArgs, "mavericksArg");
                v.a1(profileFragment, new y4.k(reportProfileLegacyArgs), (q) null, 2);
                return true;
            case R.id.share:
                a aVar2 = profileFragment.d2;
                if (aVar2 != null) {
                    aVar2.e("Share-Type-Profile", c5Var.b);
                    Context requireContext = profileFragment.requireContext();
                    i.d(requireContext, "requireContext()");
                    String str = userProfile.i2;
                    i.e(requireContext, "<this>");
                    if (str == null) {
                        return true;
                    }
                    i0.d.a.a.a.e(requireContext, com.clubhouse.android.core.R.string.share_prompt, i0.d.a.a.a.K("android.intent.action.SEND", NetworkLog.PLAIN_TEXT, "android.intent.extra.TEXT", str));
                    return true;
                }
                i.m("actionTrailRecorder");
                throw null;
            case R.id.unblock:
                ProfileViewModel P02 = profileFragment.P0();
                i.e(profileFragment, "<this>");
                i.e(userProfile, "user");
                i.e(P02, "viewModel");
                HalfProfileUtil$showUnblockConfirmationDialog$1 halfProfileUtil$showUnblockConfirmationDialog$1 = new HalfProfileUtil$showUnblockConfirmationDialog$1(profileFragment, userProfile, P02);
                i.e(profileFragment, "<this>");
                i.e(halfProfileUtil$showUnblockConfirmationDialog$1, "f");
                d.a aVar3 = new d.a(profileFragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
                halfProfileUtil$showUnblockConfirmationDialog$1.invoke(aVar3);
                aVar3.g();
                return true;
            default:
                return false;
        }
    }
}
