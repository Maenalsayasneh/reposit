package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.user.model.User;
import i0.b.b.b;
import i0.e.b.g3.u.q4;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: HalfProfileViewModel.kt */
public final class HalfProfileViewModel$updateNotifyOptionsForUser$2 extends Lambda implements p<q4, b<? extends EmptySuccessResponse>, q4> {
    public final /* synthetic */ FollowNotificationType c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileViewModel$updateNotifyOptionsForUser$2(FollowNotificationType followNotificationType) {
        super(2);
        this.c = followNotificationType;
    }

    public Object invoke(Object obj, Object obj2) {
        q4 q4Var = (q4) obj;
        i.e(q4Var, "$this$execute");
        i.e((b) obj2, "it");
        return q4.copy$default(q4Var, (User) null, (SourceLocation) null, false, false, false, false, false, false, (b) null, (b) null, (UserProfile) null, (List) null, false, this.c, false, false, false, false, (Integer) null, (EventInProfile) null, false, false, 4186111, (Object) null);
    }
}
