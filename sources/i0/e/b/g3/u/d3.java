package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.clubs.ClubArgs;
import com.clubhouse.android.ui.profile.ProfileFragment;
import h0.b0.v;
import h0.t.q;
import java.util.Map;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class d3 implements View.OnClickListener {
    public final /* synthetic */ ProfileFragment c;
    public final /* synthetic */ ClubWithAdmin d;

    public /* synthetic */ d3(ProfileFragment profileFragment, ClubWithAdmin clubWithAdmin) {
        this.c = profileFragment;
        this.d = clubWithAdmin;
    }

    public final void onClick(View view) {
        ProfileFragment profileFragment = this.c;
        ClubWithAdmin clubWithAdmin = this.d;
        i.e(profileFragment, "this$0");
        i.e(clubWithAdmin, "$club");
        v.a1(profileFragment, y4.a.a(new ClubArgs(Integer.valueOf(clubWithAdmin.x), (String) null, (String) null, false, false, SourceLocation.PROFILE, (Map) null, 94)), (q) null, 2);
    }
}
