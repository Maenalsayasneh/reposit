package i0.e.b.g3.q;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.clubhouse.android.data.models.local.SuggestedInvite;
import com.clubhouse.android.ui.invites.PendingInvitesFragment;
import com.clubhouse.app.R;
import com.stripe.android.model.PaymentMethod;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class g implements View.OnClickListener {
    public final /* synthetic */ PendingInvitesFragment c;
    public final /* synthetic */ SuggestedInvite d;

    public /* synthetic */ g(PendingInvitesFragment pendingInvitesFragment, SuggestedInvite suggestedInvite) {
        this.c = pendingInvitesFragment;
        this.d = suggestedInvite;
    }

    public final void onClick(View view) {
        PendingInvitesFragment pendingInvitesFragment = this.c;
        SuggestedInvite suggestedInvite = this.d;
        i.e(pendingInvitesFragment, "this$0");
        i.e(suggestedInvite, "$invite");
        Context requireContext = pendingInvitesFragment.requireContext();
        i.d(requireContext, "requireContext()");
        i.e(requireContext, "<this>");
        i.e(suggestedInvite, "invite");
        String str = suggestedInvite.c;
        String string = requireContext.getString(R.string.hey_did_you_get_my, new Object[]{str});
        i.e(requireContext, "<this>");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(i.k("sms:", str)));
        if (str != null) {
            intent.putExtra(PaymentMethod.BillingDetails.PARAM_ADDRESS, str);
        }
        if (string != null) {
            intent.putExtra("sms_body", string);
        }
        requireContext.startActivity(intent);
    }
}
