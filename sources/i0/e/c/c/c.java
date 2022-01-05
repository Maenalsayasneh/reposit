package i0.e.c.c;

import android.view.View;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.di.FragmentName;
import com.clubhouse.android.ui.profile.HalfProfileArgs;
import com.clubhouse.backchannel.chat.BackchannelChatFragment;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ BackchannelChatFragment c;
    public final /* synthetic */ ChatMember d;

    public /* synthetic */ c(BackchannelChatFragment backchannelChatFragment, ChatMember chatMember) {
        this.c = backchannelChatFragment;
        this.d = chatMember;
    }

    public final void onClick(View view) {
        BackchannelChatFragment backchannelChatFragment = this.c;
        ChatMember chatMember = this.d;
        i.e(backchannelChatFragment, "this$0");
        i.e(chatMember, "$user");
        SourceLocation sourceLocation = SourceLocation.BACKCHANNEL;
        i.e(backchannelChatFragment, "<this>");
        i.e(chatMember, "user");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        v.f(backchannelChatFragment, FragmentName.HALF_PROFILE, new HalfProfileArgs(chatMember, sourceLocation, false, false, false, 16));
    }
}
