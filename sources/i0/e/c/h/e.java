package i0.e.c.h;

import android.view.View;
import com.clubhouse.backchannel.chat.ChatArgs;
import com.clubhouse.backchannel.inbox.BackchannelInboxFragment;
import h0.b0.v;
import h0.t.q;
import i0.e.c.f.b.a.a;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ BackchannelInboxFragment c;
    public final /* synthetic */ a d;

    public /* synthetic */ e(BackchannelInboxFragment backchannelInboxFragment, a aVar) {
        this.c = backchannelInboxFragment;
        this.d = aVar;
    }

    public final void onClick(View view) {
        BackchannelInboxFragment backchannelInboxFragment = this.c;
        a aVar = this.d;
        k<Object>[] kVarArr = BackchannelInboxFragment.Z1;
        i.e(backchannelInboxFragment, "this$0");
        i.e(aVar, "$chat");
        ChatArgs chatArgs = new ChatArgs(aVar.a);
        i.e(chatArgs, "mavericksArg");
        v.a1(backchannelInboxFragment, new h(chatArgs), (q) null, 2);
    }
}
