package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.android.databinding.DialogEditTextBinding;
import com.clubhouse.android.ui.profile.HalfProfileFragment;
import com.clubhouse.android.ui.profile.HalfProfileUtil$showVerifyEmailPromptDialog$1;
import com.clubhouse.android.ui.profile.HalfProfileViewModel;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class w0 implements View.OnClickListener {
    public final /* synthetic */ HalfProfileFragment c;

    public /* synthetic */ w0(HalfProfileFragment halfProfileFragment) {
        this.c = halfProfileFragment;
    }

    public final void onClick(View view) {
        HalfProfileFragment halfProfileFragment = this.c;
        i.e(halfProfileFragment, "$this_setUpViews");
        HalfProfileViewModel U0 = halfProfileFragment.U0();
        i.e(halfProfileFragment, "<this>");
        i.e(U0, "viewModel");
        DialogEditTextBinding inflate = DialogEditTextBinding.inflate(halfProfileFragment.getLayoutInflater());
        i.d(inflate, "inflate(layoutInflater)");
        HalfProfileUtil$showVerifyEmailPromptDialog$1 halfProfileUtil$showVerifyEmailPromptDialog$1 = new HalfProfileUtil$showVerifyEmailPromptDialog$1(inflate, U0);
        i.e(halfProfileFragment, "<this>");
        i.e(halfProfileUtil$showVerifyEmailPromptDialog$1, "f");
        d.a aVar = new d.a(halfProfileFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
        halfProfileUtil$showVerifyEmailPromptDialog$1.invoke(aVar);
        aVar.g();
    }
}
