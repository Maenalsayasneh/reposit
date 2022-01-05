package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.ui.profile.HalfProfileFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class x implements View.OnClickListener {
    public final /* synthetic */ HalfProfileFragment c;
    public final /* synthetic */ UserInList d;

    public /* synthetic */ x(HalfProfileFragment halfProfileFragment, UserInList userInList) {
        this.c = halfProfileFragment;
        this.d = userInList;
    }

    public final void onClick(View view) {
        HalfProfileFragment halfProfileFragment = this.c;
        UserInList userInList = this.d;
        i.e(halfProfileFragment, "this$0");
        i.e(userInList, "$user");
        halfProfileFragment.U0().p(new f5(userInList.getId().intValue()));
    }
}
