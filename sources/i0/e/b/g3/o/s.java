package i0.e.b.g3.o;

import android.net.Uri;
import android.view.View;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.ui.events.HalfEventFragment;
import com.clubhouse.android.ui.profile.ProfileArgs;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import h0.t.q;
import java.util.Map;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class s implements View.OnClickListener {
    public final /* synthetic */ HalfEventFragment c;
    public final /* synthetic */ UserInList d;

    public /* synthetic */ s(HalfEventFragment halfEventFragment, UserInList userInList) {
        this.c = halfEventFragment;
        this.d = userInList;
    }

    public final void onClick(View view) {
        HalfEventFragment halfEventFragment = this.c;
        UserInList userInList = this.d;
        i.e(halfEventFragment, "this$0");
        i.e(userInList, "$user");
        i.e(halfEventFragment, "<this>");
        i.e(userInList, "user");
        SourceLocation sourceLocation = SourceLocation.BULLETIN;
        i.e(userInList, "<this>");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        ProfileArgs profileArgs = new ProfileArgs(userInList.getId(), (String) null, new BasicUser(userInList.getId().intValue(), userInList.getName(), userInList.C(), userInList.b()), false, (Uri) null, sourceLocation, (Map) null, 26);
        i.e(profileArgs, "mavericksArg");
        v.a1(halfEventFragment, new h0(profileArgs, (String) null), (q) null, 2);
    }
}
