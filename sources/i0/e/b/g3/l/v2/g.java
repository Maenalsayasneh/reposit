package i0.e.b.g3.l.v2;

import android.widget.CompoundButton;
import com.clubhouse.android.ui.clubs.create.CreateClubFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class g implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ CreateClubFragment a;

    public /* synthetic */ g(CreateClubFragment createClubFragment) {
        this.a = createClubFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CreateClubFragment createClubFragment = this.a;
        k<Object>[] kVarArr = CreateClubFragment.e2;
        i.e(createClubFragment, "this$0");
        createClubFragment.S0().p(new s(z));
    }
}
