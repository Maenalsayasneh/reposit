package com.clubhouse.android.ui.invites;

import com.clubhouse.analytics.actiontrails.ActionTrailUploader;
import com.clubhouse.android.data.models.local.SuggestedInvite;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.q.j;
import i0.e.b.g3.q.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: InvitesViewModel.kt */
public final class InvitesViewModel$invite$2 extends Lambda implements p<m, b<? extends EmptySuccessResponse>, m> {
    public final /* synthetic */ InvitesViewModel c;
    public final /* synthetic */ String d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvitesViewModel$invite$2(InvitesViewModel invitesViewModel, String str) {
        super(2);
        this.c = invitesViewModel;
        this.d = str;
    }

    public Object invoke(Object obj, Object obj2) {
        m mVar = (m) obj;
        b bVar = (b) obj2;
        i.e(mVar, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            List<SuggestedInvite> list = mVar.a;
            String str = this.d;
            int i = 0;
            Iterator<SuggestedInvite> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (i.a(it.next().c, str)) {
                    break;
                } else {
                    i++;
                }
            }
            final List<T> A0 = g.A0(mVar.a);
            ArrayList arrayList = (ArrayList) A0;
            arrayList.set(i, SuggestedInvite.a(mVar.a.get(i), (String) null, false, true, 0, (String) null, (String) null, 59));
            this.c.m(new l<m, m>() {
                public Object invoke(Object obj) {
                    m mVar = (m) obj;
                    i.e(mVar, "$this$setState");
                    return m.copy$default(mVar, A0, false, false, false, (String) null, 30, (Object) null);
                }
            });
            ActionTrailUploader actionTrailUploader = this.c.p.a;
            h0.g0.b bVar2 = ActionTrailUploader.a;
            actionTrailUploader.a("invite_send_success", g.o());
            this.c.o(new j((SuggestedInvite) arrayList.get(i)));
        } else if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return mVar;
    }
}
