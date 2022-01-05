package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import i0.b.b.b;
import i0.e.b.g3.u.c5;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ProfileViewModel.kt */
public final class ProfileViewModel$updateNotifyOptionsForUser$2 extends Lambda implements p<c5, b<? extends EmptySuccessResponse>, c5> {
    public final /* synthetic */ FollowNotificationType c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileViewModel$updateNotifyOptionsForUser$2(FollowNotificationType followNotificationType) {
        super(2);
        this.c = followNotificationType;
    }

    public Object invoke(Object obj, Object obj2) {
        c5 c5Var = (c5) obj;
        i.e(c5Var, "$this$execute");
        i.e((b) obj2, "it");
        return c5.copy$default(c5Var, (Integer) null, (SourceLocation) null, (Map) null, (String) null, (BasicUser) null, (b) null, false, false, false, (b) null, (b) null, (UserProfile) null, (List) null, this.c, (Integer) null, false, false, false, false, (EventInProfile) null, false, false, 4186111, (Object) null);
    }
}
