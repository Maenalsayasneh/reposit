package i0.e.b.g3.r;

import android.view.View;
import com.clubhouse.android.ui.onboarding.CollectUsernameWithSuggestionsFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class j implements View.OnClickListener {
    public final /* synthetic */ CollectUsernameWithSuggestionsFragment c;

    public /* synthetic */ j(CollectUsernameWithSuggestionsFragment collectUsernameWithSuggestionsFragment) {
        this.c = collectUsernameWithSuggestionsFragment;
    }

    public final void onClick(View view) {
        CollectUsernameWithSuggestionsFragment collectUsernameWithSuggestionsFragment = this.c;
        k<Object>[] kVarArr = CollectUsernameWithSuggestionsFragment.Z1;
        i.e(collectUsernameWithSuggestionsFragment, "this$0");
        collectUsernameWithSuggestionsFragment.P0(collectUsernameWithSuggestionsFragment.N0().h.getText().toString());
    }
}
