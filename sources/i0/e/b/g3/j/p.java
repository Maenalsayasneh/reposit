package i0.e.b.g3.j;

import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.activity.ActivityFragment;
import com.clubhouse.android.ui.clubs.ClubArgs;
import h0.b0.v;
import h0.t.q;
import java.util.Map;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class p implements View.OnClickListener {
    public final /* synthetic */ ClubWithAdmin c;
    public final /* synthetic */ ActivityFragment d;

    public /* synthetic */ p(ClubWithAdmin clubWithAdmin, ActivityFragment activityFragment) {
        this.c = clubWithAdmin;
        this.d = activityFragment;
    }

    public final void onClick(View view) {
        ClubWithAdmin clubWithAdmin = this.c;
        ActivityFragment activityFragment = this.d;
        i.e(activityFragment, "this$0");
        if (clubWithAdmin != null) {
            int i = clubWithAdmin.x;
            i.e(activityFragment, "<this>");
            ClubArgs clubArgs = new ClubArgs(Integer.valueOf(i), (String) null, (String) null, false, false, SourceLocation.ACTIVITY, (Map) null, 94);
            i.e(clubArgs, "mavericksArg");
            v.a1(activityFragment, new v(clubArgs), (q) null, 2);
        }
    }
}
