package i0.e.c.i;

import android.view.View;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.di.FragmentName;
import com.clubhouse.android.ui.profile.HalfProfileArgs;
import com.clubhouse.backchannel.members.BackchannelChatMembersFragment;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ BackchannelChatMembersFragment c;
    public final /* synthetic */ ChatMember d;

    public /* synthetic */ d(BackchannelChatMembersFragment backchannelChatMembersFragment, ChatMember chatMember) {
        this.c = backchannelChatMembersFragment;
        this.d = chatMember;
    }

    public final void onClick(View view) {
        BackchannelChatMembersFragment backchannelChatMembersFragment = this.c;
        ChatMember chatMember = this.d;
        i.e(backchannelChatMembersFragment, "this$0");
        i.e(chatMember, "$member");
        SourceLocation sourceLocation = SourceLocation.BACKCHANNEL;
        i.e(backchannelChatMembersFragment, "<this>");
        i.e(chatMember, "user");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        v.f(backchannelChatMembersFragment, FragmentName.HALF_PROFILE, new HalfProfileArgs(chatMember, sourceLocation, false, false, false, 16));
    }
}
