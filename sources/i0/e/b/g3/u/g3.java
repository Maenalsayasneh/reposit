package i0.e.b.g3.u;

import android.net.Uri;
import android.view.View;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.ui.profile.ProfileArgs;
import com.clubhouse.android.ui.profile.ProfileFragment;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.u.y4;
import java.util.Map;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class g3 implements View.OnClickListener {
    public final /* synthetic */ ProfileFragment c;
    public final /* synthetic */ UserInList d;

    public /* synthetic */ g3(ProfileFragment profileFragment, UserInList userInList) {
        this.c = profileFragment;
        this.d = userInList;
    }

    public final void onClick(View view) {
        ProfileFragment profileFragment = this.c;
        UserInList userInList = this.d;
        i.e(profileFragment, "this$0");
        i.e(userInList, "$user");
        ProfileArgs profileArgs = new ProfileArgs(userInList.getId(), (String) null, (BasicUser) null, false, (Uri) null, SourceLocation.PROFILE, (Map) null, 94);
        i.e(profileArgs, "mavericksArg");
        v.a1(profileFragment, new y4.h(profileArgs, (String) null), (q) null, 2);
    }
}
