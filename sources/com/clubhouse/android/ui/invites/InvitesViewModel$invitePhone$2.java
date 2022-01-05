package com.clubhouse.android.ui.invites;

import com.clubhouse.analytics.actiontrails.ActionTrailUploader;
import com.clubhouse.android.data.models.local.SuggestedInvite;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.shared.preferences.Key;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.f3.k.a;
import i0.e.b.g3.q.j;
import i0.e.b.g3.q.m;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: InvitesViewModel.kt */
public final class InvitesViewModel$invitePhone$2 extends Lambda implements p<m, b<? extends EmptySuccessResponse>, m> {
    public final /* synthetic */ String c;
    public final /* synthetic */ InvitesViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvitesViewModel$invitePhone$2(String str, InvitesViewModel invitesViewModel) {
        super(2);
        this.c = str;
        this.d = invitesViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        m mVar = (m) obj;
        b bVar = (b) obj2;
        i.e(mVar, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            final SuggestedInvite suggestedInvite = new SuggestedInvite(this.c, false, true, 0, (String) null, (String) null);
            this.d.m(new l<m, m>() {
                public Object invoke(Object obj) {
                    m mVar = (m) obj;
                    i.e(mVar, "$this$setState");
                    return m.copy$default(mVar, g.a0(mVar.a, SuggestedInvite.this), false, false, false, (String) null, 30, (Object) null);
                }
            });
            i0.e.b.f3.k.b bVar2 = this.d.o;
            String str = this.c;
            Objects.requireNonNull(bVar2);
            i.e(str, "phoneNumber");
            Key key = Key.INVITED_PHONE_NUMBERS;
            bVar2.j(key, g.e0(g.C0(a.d(bVar2, key, (Set) null, 2, (Object) null)), str));
            ActionTrailUploader actionTrailUploader = this.d.p.a;
            h0.g0.b bVar3 = ActionTrailUploader.a;
            actionTrailUploader.a("invite_reminder_send_success", g.o());
            this.d.o(new j(suggestedInvite));
        } else if (bVar instanceof c) {
            this.d.o(new d(((c) bVar).b.getMessage()));
        }
        return mVar;
    }
}
