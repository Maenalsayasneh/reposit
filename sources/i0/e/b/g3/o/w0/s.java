package i0.e.b.g3.o.w0;

import android.view.View;
import com.clubhouse.android.ui.events.creation.EventHostClubFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class s implements View.OnClickListener {
    public final /* synthetic */ EventHostClubFragment c;

    public /* synthetic */ s(EventHostClubFragment eventHostClubFragment) {
        this.c = eventHostClubFragment;
    }

    public final void onClick(View view) {
        EventHostClubFragment eventHostClubFragment = this.c;
        k<Object>[] kVarArr = EventHostClubFragment.p2;
        i.e(eventHostClubFragment, "this$0");
        eventHostClubFragment.dismiss();
    }
}
