package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.user.model.User;
import i0.b.b.b;
import i0.e.b.g3.u.q4;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: HalfProfileViewModel.kt */
public final class HalfProfileViewModel$getSuggestedFollows$1 extends Lambda implements l<q4, q4> {
    public static final HalfProfileViewModel$getSuggestedFollows$1 c = new HalfProfileViewModel$getSuggestedFollows$1();

    public HalfProfileViewModel$getSuggestedFollows$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        q4 q4Var = (q4) obj;
        i.e(q4Var, "$this$setState");
        return q4.copy$default(q4Var, (User) null, (SourceLocation) null, false, false, false, false, false, false, (b) null, (b) null, (UserProfile) null, (List) null, true, (FollowNotificationType) null, false, false, false, false, (Integer) null, (EventInProfile) null, false, false, 4190207, (Object) null);
    }
}
