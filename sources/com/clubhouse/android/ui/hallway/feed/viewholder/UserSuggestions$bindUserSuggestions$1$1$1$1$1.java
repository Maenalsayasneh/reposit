package com.clubhouse.android.ui.hallway.feed.viewholder;

import com.clubhouse.android.data.models.local.user.UserInList;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.p.c0.e0.z0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: UserSuggestions.kt */
public final class UserSuggestions$bindUserSuggestions$1$1$1$1$1 extends Lambda implements a<i> {
    public final /* synthetic */ z0 c;
    public final /* synthetic */ m d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserSuggestions$bindUserSuggestions$1$1$1$1$1(z0 z0Var, m mVar) {
        super(0);
        this.c = z0Var;
        this.d = mVar;
    }

    public Object invoke() {
        l<? super UserInList, i> lVar = this.c.m;
        if (lVar != null) {
            lVar.invoke(this.d.g);
        }
        return i.a;
    }
}
