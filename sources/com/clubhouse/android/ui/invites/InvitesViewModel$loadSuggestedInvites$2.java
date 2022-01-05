package com.clubhouse.android.ui.invites;

import com.clubhouse.android.data.models.local.PhoneContact;
import com.clubhouse.android.data.models.local.SuggestedInvite;
import com.clubhouse.android.data.models.remote.response.GetSuggestedInvitesResponse;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.q.m;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: InvitesViewModel.kt */
public final class InvitesViewModel$loadSuggestedInvites$2 extends Lambda implements p<m, b<? extends GetSuggestedInvitesResponse>, m> {
    public final /* synthetic */ InvitesViewModel c;
    public final /* synthetic */ Ref$ObjectRef<List<PhoneContact>> d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvitesViewModel$loadSuggestedInvites$2(InvitesViewModel invitesViewModel, Ref$ObjectRef<List<PhoneContact>> ref$ObjectRef) {
        super(2);
        this.c = invitesViewModel;
        this.d = ref$ObjectRef;
    }

    public Object invoke(Object obj, Object obj2) {
        Object obj3;
        String str;
        String str2;
        m mVar = (m) obj;
        b bVar = (b) obj2;
        i.e(mVar, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            List<SuggestedInvite> list = ((GetSuggestedInvitesResponse) ((f0) bVar).b).a;
            Ref$ObjectRef<List<PhoneContact>> ref$ObjectRef = this.d;
            final ArrayList arrayList = new ArrayList(h.K(list, 10));
            for (SuggestedInvite suggestedInvite : list) {
                Iterator it = ((Iterable) ref$ObjectRef.c).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    if (i.a(((PhoneContact) obj3).a, suggestedInvite.c)) {
                        break;
                    }
                }
                PhoneContact phoneContact = (PhoneContact) obj3;
                if (phoneContact == null || (str = phoneContact.b) == null) {
                    str = "";
                }
                if (phoneContact == null) {
                    str2 = null;
                } else {
                    str2 = phoneContact.c;
                }
                arrayList.add(SuggestedInvite.a(suggestedInvite, (String) null, false, false, 0, str, str2, 15));
            }
            this.c.m(new l<m, m>() {
                public Object invoke(Object obj) {
                    m mVar = (m) obj;
                    i.e(mVar, "$this$setState");
                    return m.copy$default(mVar, arrayList, false, false, false, (String) null, 26, (Object) null);
                }
            });
        } else if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
            this.c.m(q.c);
        } else if (bVar instanceof f) {
            this.c.m(q.d);
        }
        return mVar;
    }
}
