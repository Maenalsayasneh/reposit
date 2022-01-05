package i0.e.b.g3.l.w2;

import android.view.View;
import com.clubhouse.android.ui.clubs.description.EditClubDescriptionFragment;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ EditClubDescriptionFragment c;

    public /* synthetic */ a(EditClubDescriptionFragment editClubDescriptionFragment) {
        this.c = editClubDescriptionFragment;
    }

    public final void onClick(View view) {
        EditClubDescriptionFragment editClubDescriptionFragment = this.c;
        k<Object>[] kVarArr = EditClubDescriptionFragment.p2;
        i.e(editClubDescriptionFragment, "this$0");
        v.V1(editClubDescriptionFragment, InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION, editClubDescriptionFragment.U0().a.getText().toString());
        editClubDescriptionFragment.dismiss();
    }
}
