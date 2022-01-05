package i0.e.b.g3.l;

import android.content.Context;
import android.view.View;
import com.clubhouse.android.core.R;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.clubs.ClubFragment;
import com.instabug.library.model.NetworkLog;
import i0.e.a.b.a;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class o0 implements View.OnClickListener {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ v1 d;

    public /* synthetic */ o0(ClubFragment clubFragment, v1 v1Var) {
        this.c = clubFragment;
        this.d = v1Var;
    }

    public final void onClick(View view) {
        String str;
        ClubFragment clubFragment = this.c;
        v1 v1Var = this.d;
        i.e(clubFragment, "this$0");
        i.e(v1Var, "$state");
        a aVar = clubFragment.f2;
        if (aVar != null) {
            aVar.e("Share-Type-Club", SourceLocation.CLUB);
            ClubWithAdmin clubWithAdmin = v1Var.i;
            if (clubWithAdmin != null && (str = clubWithAdmin.Y1) != null) {
                Context requireContext = clubFragment.requireContext();
                i.d(requireContext, "requireContext()");
                i.e(requireContext, "<this>");
                i0.d.a.a.a.e(requireContext, R.string.share_prompt, i0.d.a.a.a.K("android.intent.action.SEND", NetworkLog.PLAIN_TEXT, "android.intent.extra.TEXT", str));
                return;
            }
            return;
        }
        i.m("actionTrailRecorder");
        throw null;
    }
}
