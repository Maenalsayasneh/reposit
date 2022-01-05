package i0.e.b.g3.p;

import android.net.Uri;
import android.view.View;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.hallway.HallwayFragment;
import com.clubhouse.android.ui.profile.ProfileArgs;
import com.clubhouse.android.user.model.UserSelf;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import h0.t.q;
import java.util.Map;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ HallwayFragment c;
    public final /* synthetic */ UserSelf d;

    public /* synthetic */ d(HallwayFragment hallwayFragment, UserSelf userSelf) {
        this.c = hallwayFragment;
        this.d = userSelf;
    }

    public final void onClick(View view) {
        HallwayFragment hallwayFragment = this.c;
        UserSelf userSelf = this.d;
        i.e(hallwayFragment, "this$0");
        i.e(userSelf, "$self");
        SourceLocation sourceLocation = SourceLocation.HALLWAY;
        i.e(userSelf, "<this>");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        ProfileArgs profileArgs = new ProfileArgs(Integer.valueOf(userSelf.a), (String) null, new BasicUser(userSelf.a, userSelf.b, userSelf.c, userSelf.d), true, (Uri) null, sourceLocation, (Map) null, 82);
        i.e(profileArgs, "mavericksArg");
        v.a1(hallwayFragment, new p(profileArgs, (String) null), (q) null, 2);
    }
}
