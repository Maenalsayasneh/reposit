package i0.e.b.g3.l;

import android.view.View;
import com.clubhouse.android.ui.clubs.ClubFragment;
import i0.e.b.b3.b.e.f;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class j implements View.OnClickListener {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ f d;

    public /* synthetic */ j(ClubFragment clubFragment, f fVar) {
        this.c = clubFragment;
        this.d = fVar;
    }

    public final void onClick(View view) {
        ClubFragment clubFragment = this.c;
        f fVar = this.d;
        i.e(clubFragment, "this$0");
        clubFragment.T0().p(new j2(fVar.g.getId().intValue()));
    }
}
