package i0.e.b.g3.l.v2.z;

import android.view.View;
import com.clubhouse.android.ui.clubs.create.topics.ClubTopicsFragment;
import com.clubhouse.android.ui.clubs.create.topics.ClubTopicsFragment$handleBackNavigation$1;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ ClubTopicsFragment c;

    public /* synthetic */ a(ClubTopicsFragment clubTopicsFragment) {
        this.c = clubTopicsFragment;
    }

    public final void onClick(View view) {
        ClubTopicsFragment clubTopicsFragment = this.c;
        k<Object>[] kVarArr = ClubTopicsFragment.Z1;
        i.e(clubTopicsFragment, "this$0");
        v.v2(clubTopicsFragment.O0(), new ClubTopicsFragment$handleBackNavigation$1(clubTopicsFragment));
    }
}
