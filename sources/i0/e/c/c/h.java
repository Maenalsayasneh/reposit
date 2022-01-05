package i0.e.c.c;

import android.view.View;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.di.FragmentName;
import com.clubhouse.android.ui.profile.HalfProfileArgs;
import com.clubhouse.backchannel.chat.BackchannelChatFragment;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import i0.e.c.f.b.a.c;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ BackchannelChatFragment c;
    public final /* synthetic */ c d;

    public /* synthetic */ h(BackchannelChatFragment backchannelChatFragment, c cVar) {
        this.c = backchannelChatFragment;
        this.d = cVar;
    }

    public final void onClick(View view) {
        BackchannelChatFragment backchannelChatFragment = this.c;
        c cVar = this.d;
        i.e(backchannelChatFragment, "this$0");
        i.e(cVar, "$message");
        ChatMember chatMember = ((c.a) cVar).f;
        SourceLocation sourceLocation = SourceLocation.BACKCHANNEL;
        i.e(backchannelChatFragment, "<this>");
        i.e(chatMember, "user");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        v.f(backchannelChatFragment, FragmentName.HALF_PROFILE, new HalfProfileArgs(chatMember, sourceLocation, false, false, false, 16));
    }
}
