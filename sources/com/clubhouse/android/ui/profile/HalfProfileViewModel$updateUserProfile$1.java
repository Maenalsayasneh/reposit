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
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: HalfProfileViewModel.kt */
public final class HalfProfileViewModel$updateUserProfile$1 extends Lambda implements l<q4, q4> {
    public final /* synthetic */ UserProfile c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileViewModel$updateUserProfile$1(UserProfile userProfile) {
        super(1);
        this.c = userProfile;
    }

    public Object invoke(Object obj) {
        EventInProfile eventInProfile;
        FollowNotificationType followNotificationType;
        q4 q4Var = (q4) obj;
        i.e(q4Var, "$this$setState");
        List<EventInProfile> list = this.c.r2;
        if (list == null) {
            eventInProfile = null;
        } else {
            eventInProfile = (EventInProfile) g.z(list, 0);
        }
        EventInProfile eventInProfile2 = eventInProfile;
        if (q4Var.p) {
            followNotificationType = this.c.e2;
            if (followNotificationType == null) {
                followNotificationType = FollowNotificationType.SOMETIMES;
            }
        } else {
            followNotificationType = FollowNotificationType.SOMETIMES;
        }
        return q4.copy$default(q4Var, (User) null, (SourceLocation) null, false, false, false, false, false, false, (b) null, (b) null, this.c, (List) null, false, followNotificationType, false, false, false, false, (Integer) null, eventInProfile2, false, false, 3660799, (Object) null);
    }
}
