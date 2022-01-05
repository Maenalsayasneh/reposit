package i0.e.c.h;

import android.view.View;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.backchannel.CreateChatArgs;
import com.clubhouse.backchannel.inbox.BackchannelInboxFragment;
import h0.b0.v;
import h0.t.q;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ BackchannelInboxFragment c;

    public /* synthetic */ f(BackchannelInboxFragment backchannelInboxFragment) {
        this.c = backchannelInboxFragment;
    }

    public final void onClick(View view) {
        BackchannelInboxFragment backchannelInboxFragment = this.c;
        k<Object>[] kVarArr = BackchannelInboxFragment.Z1;
        i.e(backchannelInboxFragment, "this$0");
        CreateChatArgs createChatArgs = new CreateChatArgs(SourceLocation.BACKCHANNEL, (Integer) null);
        i.e(createChatArgs, "mavericksArg");
        v.a1(backchannelInboxFragment, new i(createChatArgs), (q) null, 2);
    }
}
