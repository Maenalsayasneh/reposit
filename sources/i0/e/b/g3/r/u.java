package i0.e.b.g3.r;

import android.content.DialogInterface;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.ui.onboarding.FollowSuggestionsFragment;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class u implements DialogInterface.OnClickListener {
    public final /* synthetic */ FollowSuggestionsFragment c;

    public /* synthetic */ u(FollowSuggestionsFragment followSuggestionsFragment) {
        this.c = followSuggestionsFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FollowSuggestionsFragment followSuggestionsFragment = this.c;
        i.e(followSuggestionsFragment, "this$0");
        ((AmplitudeAnalytics) v.l(followSuggestionsFragment)).a("Onboarding-Follow-Suggestions-Skipped");
        k<Object>[] kVarArr = FollowSuggestionsFragment.Z1;
        followSuggestionsFragment.O0().p(b1.a);
    }
}
