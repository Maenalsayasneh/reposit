package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.ui.actionsheet.ActionSheetBuilder;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.g3.u.q4;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileFragment.kt */
public final class HalfProfileFragment$showNotifyOptions$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileFragment$showNotifyOptions$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        final q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        final HalfProfileFragment halfProfileFragment = this.c;
        v.e(halfProfileFragment, new l<ActionSheetBuilder, i>() {
            public Object invoke(Object obj) {
                String str;
                ActionSheetBuilder actionSheetBuilder = (ActionSheetBuilder) obj;
                m0.n.b.i.e(actionSheetBuilder, "$this$actionSheet");
                HalfProfileFragment halfProfileFragment = HalfProfileFragment.this;
                Object[] objArr = new Object[1];
                UserProfile userProfile = q4Var.k;
                if (userProfile == null) {
                    str = null;
                } else {
                    str = userProfile.u2;
                }
                objArr[0] = str;
                actionSheetBuilder.a = halfProfileFragment.getString(R.string.notify_me_when, objArr);
                actionSheetBuilder.c = true;
                FollowNotificationType[] values = FollowNotificationType.values();
                HalfProfileFragment halfProfileFragment2 = HalfProfileFragment.this;
                q4 q4Var = q4Var;
                ArrayList arrayList = new ArrayList(3);
                for (int i = 0; i < 3; i++) {
                    arrayList.add(Boolean.valueOf(actionSheetBuilder.a(new HalfProfileFragment$showNotifyOptions$1$1$1$1(halfProfileFragment2, values[i], q4Var))));
                }
                return i.a;
            }
        });
        return i.a;
    }
}
