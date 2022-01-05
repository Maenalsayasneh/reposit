package com.clubhouse.android.ui.invites;

import i0.e.b.g3.q.m;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: InvitesViewModel.kt */
public final class InvitesViewModel$checkForContactsPermission$1 extends Lambda implements l<m, m> {
    public final /* synthetic */ boolean c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvitesViewModel$checkForContactsPermission$1(boolean z) {
        super(1);
        this.c = z;
    }

    public Object invoke(Object obj) {
        m mVar = (m) obj;
        i.e(mVar, "$this$setState");
        return m.copy$default(mVar, (List) null, this.c, false, false, (String) null, 29, (Object) null);
    }
}
