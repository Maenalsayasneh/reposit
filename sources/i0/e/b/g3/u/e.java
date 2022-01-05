package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.android.ui.profile.EditNameFragment;
import com.clubhouse.android.ui.profile.EditNameFragment$adaptUI$2$1;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ EditNameFragment c;

    public /* synthetic */ e(EditNameFragment editNameFragment) {
        this.c = editNameFragment;
    }

    public final void onClick(View view) {
        EditNameFragment editNameFragment = this.c;
        k<Object>[] kVarArr = EditNameFragment.Z1;
        i.e(editNameFragment, "this$0");
        EditNameFragment$adaptUI$2$1 editNameFragment$adaptUI$2$1 = new EditNameFragment$adaptUI$2$1(editNameFragment, editNameFragment.N0().b.getText().toString(), editNameFragment.N0().c.getText().toString());
        i.e(editNameFragment, "<this>");
        i.e(editNameFragment$adaptUI$2$1, "f");
        d.a aVar = new d.a(editNameFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
        editNameFragment$adaptUI$2$1.invoke(aVar);
        aVar.g();
    }
}
