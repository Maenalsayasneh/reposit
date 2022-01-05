package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.data.models.remote.response.GetCanCreateClubResponse;
import com.clubhouse.android.user.model.User;
import i0.b.b.b;
import i0.e.b.g3.u.q4;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: HalfProfileViewModel.kt */
public final class HalfProfileViewModel$canCreateClub$2 extends Lambda implements p<q4, b<? extends GetCanCreateClubResponse>, q4> {
    public static final HalfProfileViewModel$canCreateClub$2 c = new HalfProfileViewModel$canCreateClub$2();

    public HalfProfileViewModel$canCreateClub$2() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        q4 q4Var = (q4) obj;
        b bVar = (b) obj2;
        i.e(q4Var, "$this$execute");
        i.e(bVar, "it");
        return q4.copy$default(q4Var, (User) null, (SourceLocation) null, false, false, false, false, false, false, (b) null, bVar, (UserProfile) null, (List) null, false, (FollowNotificationType) null, false, false, false, false, (Integer) null, (EventInProfile) null, false, false, 4193791, (Object) null);
    }
}
