package i0.e.b.g3.l.x2;

import android.content.Intent;
import android.view.View;
import com.clubhouse.android.core.R;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.clubs.invites.GrowClubFragment;
import com.instabug.library.model.NetworkLog;
import h0.o.a.k;
import i0.e.a.b.a;
import i0.e.b.g3.l.v1;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ GrowClubFragment c;
    public final /* synthetic */ v1 d;

    public /* synthetic */ b(GrowClubFragment growClubFragment, v1 v1Var) {
        this.c = growClubFragment;
        this.d = v1Var;
    }

    public final void onClick(View view) {
        GrowClubFragment growClubFragment = this.c;
        v1 v1Var = this.d;
        i.e(growClubFragment, "this$0");
        i.e(v1Var, "$clubViewState");
        a aVar = growClubFragment.a2;
        if (aVar != null) {
            aVar.e("Share-Type-Club", SourceLocation.CLUB);
            k requireActivity = growClubFragment.requireActivity();
            i.d(requireActivity, "requireActivity()");
            String str = v1Var.l;
            i.e(requireActivity, "<this>");
            if (str != null) {
                requireActivity.startActivity(Intent.createChooser(i0.d.a.a.a.K("android.intent.action.SEND", NetworkLog.PLAIN_TEXT, "android.intent.extra.TEXT", str), requireActivity.getString(R.string.share_prompt)));
                return;
            }
            return;
        }
        i.m("actionTrailRecorder");
        throw null;
    }
}
