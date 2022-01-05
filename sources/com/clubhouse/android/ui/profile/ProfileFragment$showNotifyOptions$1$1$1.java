package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.ui.actionsheet.ActionSheetBuilder;
import com.clubhouse.app.R;
import i0.e.b.g3.u.c5;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$showNotifyOptions$1$1$1 extends Lambda implements l<ActionSheetBuilder, i> {
    public final /* synthetic */ ProfileFragment c;
    public final /* synthetic */ UserProfile d;
    public final /* synthetic */ c5 q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$showNotifyOptions$1$1$1(ProfileFragment profileFragment, UserProfile userProfile, c5 c5Var) {
        super(1);
        this.c = profileFragment;
        this.d = userProfile;
        this.q = c5Var;
    }

    public Object invoke(Object obj) {
        ActionSheetBuilder actionSheetBuilder = (ActionSheetBuilder) obj;
        m0.n.b.i.e(actionSheetBuilder, "$this$actionSheet");
        actionSheetBuilder.a = this.c.getString(R.string.notify_me_when, this.d.u2);
        actionSheetBuilder.c = true;
        FollowNotificationType[] values = FollowNotificationType.values();
        ProfileFragment profileFragment = this.c;
        c5 c5Var = this.q;
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(Boolean.valueOf(actionSheetBuilder.a(new ProfileFragment$showNotifyOptions$1$1$1$1$1(profileFragment, values[i], c5Var))));
        }
        return i.a;
    }
}
