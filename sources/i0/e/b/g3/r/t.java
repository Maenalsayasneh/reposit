package i0.e.b.g3.r;

import android.view.View;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.ui.onboarding.FollowSuggestionsFragment;

/* compiled from: lambda */
public final /* synthetic */ class t implements View.OnClickListener {
    public final /* synthetic */ FollowSuggestionsFragment c;
    public final /* synthetic */ UserInList d;

    public /* synthetic */ t(FollowSuggestionsFragment followSuggestionsFragment, UserInList userInList) {
        this.c = followSuggestionsFragment;
        this.d = userInList;
    }

    public final void onClick(View view) {
        FollowSuggestionsFragment.PagingItemController.m30buildItemModel$lambda0(this.c, this.d, view);
    }
}
