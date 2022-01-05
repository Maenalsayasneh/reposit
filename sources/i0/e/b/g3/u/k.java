package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.android.ui.profile.EditUsernameFragment;
import com.clubhouse.android.ui.profile.EditUsernameFragment$adaptUI$2$1;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ EditUsernameFragment c;

    public /* synthetic */ k(EditUsernameFragment editUsernameFragment) {
        this.c = editUsernameFragment;
    }

    public final void onClick(View view) {
        EditUsernameFragment editUsernameFragment = this.c;
        m0.r.k<Object>[] kVarArr = EditUsernameFragment.Z1;
        i.e(editUsernameFragment, "this$0");
        EditUsernameFragment$adaptUI$2$1 editUsernameFragment$adaptUI$2$1 = new EditUsernameFragment$adaptUI$2$1(editUsernameFragment, editUsernameFragment.N0().f.getText().toString());
        i.e(editUsernameFragment, "<this>");
        i.e(editUsernameFragment$adaptUI$2$1, "f");
        d.a aVar = new d.a(editUsernameFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
        editUsernameFragment$adaptUI$2$1.invoke(aVar);
        aVar.g();
    }
}
