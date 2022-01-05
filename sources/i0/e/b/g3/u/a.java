package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.android.ui.profile.EditBioFragment;
import com.clubhouse.android.ui.profile.EditBioViewModel;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ EditBioFragment c;

    public /* synthetic */ a(EditBioFragment editBioFragment) {
        this.c = editBioFragment;
    }

    public final void onClick(View view) {
        EditBioFragment editBioFragment = this.c;
        k<Object>[] kVarArr = EditBioFragment.p2;
        i.e(editBioFragment, "this$0");
        ((EditBioViewModel) editBioFragment.r2.getValue()).p(new s5(editBioFragment.U0().a.getText().toString()));
        editBioFragment.dismiss();
    }
}
