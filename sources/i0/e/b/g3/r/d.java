package i0.e.b.g3.r;

import android.view.View;
import com.clubhouse.android.ui.onboarding.CollectNameUtil;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ CollectNameUtil c;

    public /* synthetic */ d(CollectNameUtil collectNameUtil) {
        this.c = collectNameUtil;
    }

    public final void onClick(View view) {
        CollectNameUtil collectNameUtil = this.c;
        i.e(collectNameUtil, "this$0");
        collectNameUtil.c(collectNameUtil.b.b.getText().toString(), collectNameUtil.b.c.getText().toString());
    }
}
