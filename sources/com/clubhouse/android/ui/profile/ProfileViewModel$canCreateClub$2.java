package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.data.models.remote.response.GetCanCreateClubResponse;
import i0.b.b.b;
import i0.e.b.g3.u.c5;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ProfileViewModel.kt */
public final class ProfileViewModel$canCreateClub$2 extends Lambda implements p<c5, b<? extends GetCanCreateClubResponse>, c5> {
    public static final ProfileViewModel$canCreateClub$2 c = new ProfileViewModel$canCreateClub$2();

    public ProfileViewModel$canCreateClub$2() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        c5 c5Var = (c5) obj;
        b bVar = (b) obj2;
        i.e(c5Var, "$this$execute");
        i.e(bVar, "it");
        return c5.copy$default(c5Var, (Integer) null, (SourceLocation) null, (Map) null, (String) null, (BasicUser) null, (b) null, false, false, false, (b) null, bVar, (UserProfile) null, (List) null, (FollowNotificationType) null, (Integer) null, false, false, false, false, (EventInProfile) null, false, false, 4193279, (Object) null);
    }
}
