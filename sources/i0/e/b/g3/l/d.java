package i0.e.b.g3.l;

import android.view.View;
import com.clubhouse.android.ui.clubs.ClubFragment;
import com.clubhouse.app.R;
import i0.e.b.a3.f.e;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ ClubFragment c;

    public /* synthetic */ d(ClubFragment clubFragment) {
        this.c = clubFragment;
    }

    public final void onClick(View view) {
        ClubFragment clubFragment = this.c;
        k<Object>[] kVarArr = ClubFragment.e2;
        i.e(clubFragment, "this$0");
        e.b(clubFragment, clubFragment.getString(R.string.clubhouse_club_migration_faq));
    }
}
