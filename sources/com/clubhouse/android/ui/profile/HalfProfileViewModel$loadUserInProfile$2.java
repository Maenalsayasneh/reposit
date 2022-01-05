package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.data.models.remote.response.GetProfileResponse;
import com.clubhouse.android.user.model.User;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.u.q4;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: HalfProfileViewModel.kt */
public final class HalfProfileViewModel$loadUserInProfile$2 extends Lambda implements p<q4, b<? extends GetProfileResponse>, q4> {
    public final /* synthetic */ HalfProfileViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileViewModel$loadUserInProfile$2(HalfProfileViewModel halfProfileViewModel) {
        super(2);
        this.c = halfProfileViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        q4 q4Var = (q4) obj;
        b bVar = (b) obj2;
        i.e(q4Var, "$this$execute");
        i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof f0) {
            HalfProfileViewModel halfProfileViewModel = this.c;
            UserProfile userProfile = ((GetProfileResponse) ((f0) bVar).b).a;
            Objects.requireNonNull(halfProfileViewModel);
            halfProfileViewModel.m(new HalfProfileViewModel$updateUserProfile$1(userProfile));
        } else if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return q4.copy$default(q4Var, (User) null, (SourceLocation) null, false, false, false, false, false, false, bVar, (b) null, (UserProfile) null, (List) null, false, (FollowNotificationType) null, false, false, false, false, (Integer) null, (EventInProfile) null, false, false, 4194047, (Object) null);
    }
}
