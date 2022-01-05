package i0.e.c.h;

import android.view.View;
import com.clubhouse.backchannel.inbox.BackchannelInboxFragment;
import com.clubhouse.backchannel.inbox.BackchannelInboxFragment$buildChatModel$1$2$1;
import h0.b0.v;
import i0.e.c.f.b.a.a;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnLongClickListener {
    public final /* synthetic */ BackchannelInboxFragment c;
    public final /* synthetic */ a d;

    public /* synthetic */ d(BackchannelInboxFragment backchannelInboxFragment, a aVar) {
        this.c = backchannelInboxFragment;
        this.d = aVar;
    }

    public final boolean onLongClick(View view) {
        BackchannelInboxFragment backchannelInboxFragment = this.c;
        a aVar = this.d;
        k<Object>[] kVarArr = BackchannelInboxFragment.Z1;
        i.e(backchannelInboxFragment, "this$0");
        i.e(aVar, "$chat");
        v.e(backchannelInboxFragment, new BackchannelInboxFragment$buildChatModel$1$2$1(aVar, backchannelInboxFragment));
        return true;
    }
}
