package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.clubs.ClubArgs;
import com.clubhouse.android.ui.profile.HalfProfileFragment;
import h0.t.q;
import java.util.Map;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class v implements View.OnClickListener {
    public final /* synthetic */ HalfProfileFragment c;
    public final /* synthetic */ ClubWithAdmin d;

    public /* synthetic */ v(HalfProfileFragment halfProfileFragment, ClubWithAdmin clubWithAdmin) {
        this.c = halfProfileFragment;
        this.d = clubWithAdmin;
    }

    public final void onClick(View view) {
        HalfProfileFragment halfProfileFragment = this.c;
        ClubWithAdmin clubWithAdmin = this.d;
        i.e(halfProfileFragment, "this$0");
        i.e(clubWithAdmin, "$club");
        h0.b0.v.a1(halfProfileFragment, o4.a.a(new ClubArgs(Integer.valueOf(clubWithAdmin.x), (String) null, (String) null, false, false, SourceLocation.PROFILE, (Map) null, 94)), (q) null, 2);
    }
}
