package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserProfile;
import i0.b.b.b;
import i0.e.b.g3.u.c5;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: ProfileViewModel.kt */
public final class ProfileViewModel$updateInstagramProfile$1 extends Lambda implements l<c5, c5> {
    public static final ProfileViewModel$updateInstagramProfile$1 c = new ProfileViewModel$updateInstagramProfile$1();

    public ProfileViewModel$updateInstagramProfile$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        c5 c5Var = (c5) obj;
        i.e(c5Var, "$this$setState");
        return c5.copy$default(c5Var, (Integer) null, (SourceLocation) null, (Map) null, (String) null, (BasicUser) null, (b) null, false, true, false, (b) null, (b) null, (UserProfile) null, (List) null, (FollowNotificationType) null, (Integer) null, false, false, false, false, (EventInProfile) null, false, false, 4194175, (Object) null);
    }
}
