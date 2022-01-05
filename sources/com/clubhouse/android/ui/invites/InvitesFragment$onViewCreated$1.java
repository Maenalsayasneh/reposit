package com.clubhouse.android.ui.invites;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.clubhouse.android.core.ui.Banner;
import com.clubhouse.android.data.models.local.SuggestedInvite;
import com.clubhouse.app.R;
import com.stripe.android.model.PaymentMethod;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt__IndentKt;
import m0.i;
import m0.j.g;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.invites.InvitesFragment$onViewCreated$1", f = "InvitesFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: InvitesFragment.kt */
public final class InvitesFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ InvitesFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvitesFragment$onViewCreated$1(InvitesFragment invitesFragment, m0.l.c<? super InvitesFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = invitesFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        InvitesFragment$onViewCreated$1 invitesFragment$onViewCreated$1 = new InvitesFragment$onViewCreated$1(this.d, cVar);
        invitesFragment$onViewCreated$1.c = obj;
        return invitesFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        InvitesFragment$onViewCreated$1 invitesFragment$onViewCreated$1 = new InvitesFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        invitesFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        invitesFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof d) {
            final InvitesFragment invitesFragment = this.d;
            v.c2(invitesFragment, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showBanner");
                    String str = ((d) bVar).a;
                    if (str == null) {
                        str = invitesFragment.getString(R.string.common_error_try_again);
                        m0.n.b.i.d(str, "getString(R.string.common_error_try_again)");
                    }
                    jVar.c.b.setText(str);
                    jVar.h(Banner.Style.Negative);
                    return i.a;
                }
            });
        } else if (bVar instanceof i0.e.b.g3.q.j) {
            Context requireContext = this.d.requireContext();
            m0.n.b.i.d(requireContext, "requireContext()");
            SuggestedInvite suggestedInvite = ((i0.e.b.g3.q.j) bVar).a;
            m0.n.b.i.e(requireContext, "<this>");
            m0.n.b.i.e(suggestedInvite, "invite");
            String str2 = suggestedInvite.y;
            if (str2 == null || str2.length() == 0) {
                str = requireContext.getString(R.string.i_have_an_invite, new Object[]{"👋 ", ""});
            } else {
                String str3 = suggestedInvite.y;
                m0.n.b.i.c(str3);
                str = requireContext.getString(R.string.i_have_an_invite, new Object[]{"", m0.n.b.i.k((String) g.w(StringsKt__IndentKt.E(str3, new String[]{" "}, false, 0, 6)), " ")});
            }
            m0.n.b.i.d(str, "if (invite.name.isNullOrEmpty()) {\n        getString(R.string.i_have_an_invite, \"\\uD83D\\uDC4B \", \"\")\n    } else {\n        val firstName = invite.name!!.split(\" \").firstOrNull()\n        getString(R.string.i_have_an_invite, \"\", firstName.plus(\" \"))\n    }");
            String str4 = suggestedInvite.c;
            m0.n.b.i.e(requireContext, "<this>");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(m0.n.b.i.k("sms:", str4)));
            if (str4 != null) {
                intent.putExtra(PaymentMethod.BillingDetails.PARAM_ADDRESS, str4);
            }
            intent.putExtra("sms_body", str);
            requireContext.startActivity(intent);
        }
        return i.a;
    }
}
