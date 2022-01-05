package i0.e.b.g3.u;

import android.net.Uri;
import android.view.View;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.ui.profile.HalfProfileFragment;
import com.clubhouse.android.ui.profile.ProfileArgs;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.u.o4;
import java.util.Map;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class w implements View.OnClickListener {
    public final /* synthetic */ HalfProfileFragment c;
    public final /* synthetic */ UserInList d;

    public /* synthetic */ w(HalfProfileFragment halfProfileFragment, UserInList userInList) {
        this.c = halfProfileFragment;
        this.d = userInList;
    }

    public final void onClick(View view) {
        HalfProfileFragment halfProfileFragment = this.c;
        UserInList userInList = this.d;
        i.e(halfProfileFragment, "this$0");
        i.e(userInList, "$user");
        halfProfileFragment.P0();
        ProfileArgs profileArgs = new ProfileArgs(userInList.getId(), (String) null, (BasicUser) null, false, (Uri) null, SourceLocation.PROFILE, (Map) null, 94);
        i.e(profileArgs, "mavericksArg");
        v.a1(halfProfileFragment, new o4.h(profileArgs, (String) null), (q) null, 2);
    }
}
