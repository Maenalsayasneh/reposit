package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.shared.Flag;
import i0.b.b.b;
import i0.e.b.g3.u.c5;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: ProfileViewModel.kt */
public final class ProfileViewModel$updateUserProfile$1 extends Lambda implements l<c5, c5> {
    public final /* synthetic */ UserProfile c;
    public final /* synthetic */ ProfileViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileViewModel$updateUserProfile$1(UserProfile userProfile, ProfileViewModel profileViewModel) {
        super(1);
        this.c = userProfile;
        this.d = profileViewModel;
    }

    public Object invoke(Object obj) {
        EventInProfile eventInProfile;
        FollowNotificationType followNotificationType;
        c5 c5Var = (c5) obj;
        i.e(c5Var, "$this$setState");
        int intValue = this.c.getId().intValue();
        UserProfile userProfile = this.c;
        String str = userProfile.u2;
        List<EventInProfile> list = userProfile.r2;
        if (list == null) {
            eventInProfile = null;
        } else {
            eventInProfile = (EventInProfile) g.z(list, 0);
        }
        EventInProfile eventInProfile2 = eventInProfile;
        Integer b = this.d.n.b();
        int intValue2 = this.c.getId().intValue();
        Integer b2 = this.d.n.b();
        boolean z = b2 != null && intValue2 == b2.intValue();
        if (c5Var.q) {
            followNotificationType = this.c.e2;
            if (followNotificationType == null) {
                followNotificationType = FollowNotificationType.SOMETIMES;
            }
        } else {
            followNotificationType = FollowNotificationType.SOMETIMES;
        }
        return c5.copy$default(c5Var, Integer.valueOf(intValue), (SourceLocation) null, (Map) null, str, (BasicUser) null, (b) null, false, false, false, (b) null, (b) null, this.c, (List) null, followNotificationType, b, z, false, false, false, eventInProfile2, this.d.r.a(Flag.EnableMultiStepIncidentReport), false, 2562038, (Object) null);
    }
}
