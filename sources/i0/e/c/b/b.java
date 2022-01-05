package i0.e.c.b;

import android.view.View;
import com.clubhouse.backchannel.archive.BackchannelArchiveFragment;
import com.clubhouse.backchannel.chat.ChatArgs;
import h0.b0.v;
import h0.t.q;
import i0.e.c.f.b.a.a;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ BackchannelArchiveFragment c;
    public final /* synthetic */ a d;

    public /* synthetic */ b(BackchannelArchiveFragment backchannelArchiveFragment, a aVar) {
        this.c = backchannelArchiveFragment;
        this.d = aVar;
    }

    public final void onClick(View view) {
        BackchannelArchiveFragment backchannelArchiveFragment = this.c;
        a aVar = this.d;
        i.e(backchannelArchiveFragment, "this$0");
        i.e(aVar, "$chat");
        ChatArgs chatArgs = new ChatArgs(aVar.a);
        i.e(chatArgs, "mavericksArg");
        v.a1(backchannelArchiveFragment, new d(chatArgs), (q) null, 2);
    }
}
