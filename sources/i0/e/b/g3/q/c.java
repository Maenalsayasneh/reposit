package i0.e.b.g3.q;

import android.content.Context;
import android.view.View;
import com.clubhouse.android.ui.invites.InvitesFragment;
import com.clubhouse.android.ui.invites.InvitesViewModel;
import i0.e.b.i3.b;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ InvitesFragment c;
    public final /* synthetic */ Phonenumber$PhoneNumber d;

    public /* synthetic */ c(InvitesFragment invitesFragment, Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        this.c = invitesFragment;
        this.d = phonenumber$PhoneNumber;
    }

    public final void onClick(View view) {
        InvitesFragment invitesFragment = this.c;
        Phonenumber$PhoneNumber phonenumber$PhoneNumber = this.d;
        i.e(invitesFragment, "this$0");
        i.e(phonenumber$PhoneNumber, "$number");
        k<Object>[] kVarArr = InvitesFragment.Z1;
        InvitesViewModel O0 = invitesFragment.O0();
        Context requireContext = invitesFragment.requireContext();
        i.d(requireContext, "requireContext()");
        i.e(requireContext, "<this>");
        i.e(phonenumber$PhoneNumber, "phoneNumber");
        if (b.b == null) {
            PhoneNumberUtil b = PhoneNumberUtil.b(requireContext);
            i.d(b, "createInstance(context)");
            b.b = b;
        }
        PhoneNumberUtil phoneNumberUtil = b.b;
        if (phoneNumberUtil != null) {
            String e = phoneNumberUtil.e(phonenumber$PhoneNumber, PhoneNumberUtil.PhoneNumberFormat.E164);
            i.d(e, "phoneUtil.format(phoneNumber, numberFormat)");
            O0.p(new i(e));
            return;
        }
        i.m("phoneUtil");
        throw null;
    }
}
