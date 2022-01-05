package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.data.models.local.user.UserProfile;
import i0.b.b.b;
import i0.e.b.g3.u.c5;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ProfileViewModel.kt */
public final class ProfileViewModel$removeUser$1 extends Lambda implements l<c5, i> {
    public final /* synthetic */ ProfileViewModel c;
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileViewModel$removeUser$1(ProfileViewModel profileViewModel, int i) {
        super(1);
        this.c = profileViewModel;
        this.d = i;
    }

    public Object invoke(Object obj) {
        final c5 c5Var = (c5) obj;
        m0.n.b.i.e(c5Var, "state");
        ProfileViewModel profileViewModel = this.c;
        final int i = this.d;
        profileViewModel.m(new l<c5, c5>() {
            public Object invoke(Object obj) {
                ArrayList arrayList;
                c5 c5Var = (c5) obj;
                m0.n.b.i.e(c5Var, "$this$setState");
                List<UserInList> list = c5.this.m;
                if (list == null) {
                    arrayList = null;
                } else {
                    int i = i;
                    ArrayList arrayList2 = new ArrayList();
                    for (T next : list) {
                        if (((UserInList) next).getId().intValue() != i) {
                            arrayList2.add(next);
                        }
                    }
                    arrayList = arrayList2;
                }
                return c5.copy$default(c5Var, (Integer) null, (SourceLocation) null, (Map) null, (String) null, (BasicUser) null, (b) null, false, false, false, (b) null, (b) null, (UserProfile) null, arrayList, (FollowNotificationType) null, (Integer) null, false, false, false, false, (EventInProfile) null, false, false, 4190207, (Object) null);
            }
        });
        return i.a;
    }
}
