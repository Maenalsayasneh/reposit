package i0.e.c.c;

import android.view.View;
import com.clubhouse.backchannel.chat.BackchannelChatFragment;
import com.clubhouse.backchannel.chat.BackchannelChatFragment$promptForRetry$1;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import i0.e.c.f.b.a.c;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ BackchannelChatFragment c;
    public final /* synthetic */ c d;

    public /* synthetic */ d(BackchannelChatFragment backchannelChatFragment, c cVar) {
        this.c = backchannelChatFragment;
        this.d = cVar;
    }

    public final void onClick(View view) {
        BackchannelChatFragment backchannelChatFragment = this.c;
        c cVar = this.d;
        i.e(backchannelChatFragment, "this$0");
        i.e(cVar, "$message");
        String str = ((c.a) cVar).c;
        k<Object>[] kVarArr = BackchannelChatFragment.Z1;
        BackchannelChatFragment$promptForRetry$1 backchannelChatFragment$promptForRetry$1 = new BackchannelChatFragment$promptForRetry$1(backchannelChatFragment, str);
        i.e(backchannelChatFragment, "<this>");
        i.e(backchannelChatFragment$promptForRetry$1, "f");
        d.a aVar = new d.a(backchannelChatFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
        backchannelChatFragment$promptForRetry$1.invoke(aVar);
        aVar.g();
    }
}
