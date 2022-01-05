package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.ui.profile.ProfileFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class f3 implements View.OnClickListener {
    public final /* synthetic */ ProfileFragment c;
    public final /* synthetic */ UserInList d;

    public /* synthetic */ f3(ProfileFragment profileFragment, UserInList userInList) {
        this.c = profileFragment;
        this.d = userInList;
    }

    public final void onClick(View view) {
        ProfileFragment profileFragment = this.c;
        UserInList userInList = this.d;
        i.e(profileFragment, "this$0");
        i.e(userInList, "$user");
        profileFragment.P0().p(new m4(userInList.getId().intValue()));
    }
}
