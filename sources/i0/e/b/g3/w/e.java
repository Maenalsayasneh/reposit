package i0.e.b.g3.w;

import android.net.Uri;
import android.view.View;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.ui.profile.ProfileArgs;
import com.clubhouse.android.ui.search.ExploreFragment;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import h0.t.q;
import i0.e.b.b3.b.e.j;
import i0.e.b.b3.b.e.m;
import java.util.Map;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ ExploreFragment c;
    public final /* synthetic */ j d;

    public /* synthetic */ e(ExploreFragment exploreFragment, j jVar) {
        this.c = exploreFragment;
        this.d = jVar;
    }

    public final void onClick(View view) {
        ExploreFragment exploreFragment = this.c;
        j jVar = this.d;
        i.e(exploreFragment, "this$0");
        UserInList userInList = ((m) jVar).g;
        SourceLocation sourceLocation = SourceLocation.EXPLORE;
        i.e(userInList, "<this>");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        ProfileArgs profileArgs = new ProfileArgs(userInList.getId(), (String) null, new BasicUser(userInList.getId().intValue(), userInList.getName(), userInList.C(), userInList.b()), false, (Uri) null, sourceLocation, (Map) null, 26);
        i.e(profileArgs, "mavericksArg");
        v.a1(exploreFragment, new r(profileArgs, (String) null), (q) null, 2);
    }
}
