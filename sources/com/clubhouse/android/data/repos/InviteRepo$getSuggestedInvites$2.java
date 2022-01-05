package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.Contact;
import com.clubhouse.android.data.models.remote.response.GetSuggestedInvitesResponse;
import i0.e.a.a;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: InviteRepo.kt */
public final class InviteRepo$getSuggestedInvites$2 extends Lambda implements l<GetSuggestedInvitesResponse, i> {
    public final /* synthetic */ InviteRepo c;
    public final /* synthetic */ List<Contact> d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteRepo$getSuggestedInvites$2(InviteRepo inviteRepo, List<Contact> list) {
        super(1);
        this.c = inviteRepo;
        this.d = list;
    }

    public Object invoke(Object obj) {
        GetSuggestedInvitesResponse getSuggestedInvitesResponse = (GetSuggestedInvitesResponse) obj;
        m0.n.b.i.e(getSuggestedInvitesResponse, "it");
        a aVar = this.c.c;
        AmplitudeAnalytics amplitudeAnalytics = (AmplitudeAnalytics) aVar;
        amplitudeAnalytics.b("Server-GetSuggestedInvites-Success", g.N(new Pair("SuggestedCount", Integer.valueOf(getSuggestedInvitesResponse.a.size())), new Pair("ContactsCount", Integer.valueOf(this.d.size())), new Pair("UploadContacts", Boolean.valueOf(this.c.c()))));
        return i.a;
    }
}
