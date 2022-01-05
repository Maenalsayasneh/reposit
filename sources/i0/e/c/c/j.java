package i0.e.c.c;

import android.view.View;
import com.clubhouse.backchannel.chat.BackchannelChatFragment;
import com.clubhouse.backchannel.chat.BackchannelChatFragment$showLongClickMenu$1;
import h0.b.f.m0;
import h0.b0.v;
import i0.e.c.f.b.a.c;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class j implements View.OnLongClickListener {
    public final /* synthetic */ BackchannelChatFragment c;
    public final /* synthetic */ c d;
    public final /* synthetic */ y q;

    public /* synthetic */ j(BackchannelChatFragment backchannelChatFragment, c cVar, y yVar) {
        this.c = backchannelChatFragment;
        this.d = cVar;
        this.q = yVar;
    }

    public final boolean onLongClick(View view) {
        BackchannelChatFragment backchannelChatFragment = this.c;
        c cVar = this.d;
        y yVar = this.q;
        i.e(backchannelChatFragment, "this$0");
        i.e(cVar, "$message");
        i.e(yVar, "$state");
        i.d(view, "view");
        k<Object>[] kVarArr = BackchannelChatFragment.Z1;
        BackchannelChatFragment$showLongClickMenu$1 backchannelChatFragment$showLongClickMenu$1 = new BackchannelChatFragment$showLongClickMenu$1((c.a) cVar, backchannelChatFragment, yVar, v.R1(backchannelChatFragment));
        i.e(backchannelChatFragment, "<this>");
        i.e(view, "anchor");
        i.e(backchannelChatFragment$showLongClickMenu$1, "f");
        m0 m0Var = new m0(backchannelChatFragment.requireContext(), view);
        backchannelChatFragment$showLongClickMenu$1.invoke(m0Var);
        if (m0Var.d.f()) {
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }
}
