package i0.e.b.g3.r;

import android.view.View;
import com.clubhouse.android.ui.onboarding.CollectUsernameHelper;

/* compiled from: lambda */
public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ CollectUsernameHelper c;

    public /* synthetic */ i(CollectUsernameHelper collectUsernameHelper) {
        this.c = collectUsernameHelper;
    }

    public final void onClick(View view) {
        CollectUsernameHelper collectUsernameHelper = this.c;
        m0.n.b.i.e(collectUsernameHelper, "this$0");
        collectUsernameHelper.b(collectUsernameHelper.b.f.getText().toString());
    }
}
