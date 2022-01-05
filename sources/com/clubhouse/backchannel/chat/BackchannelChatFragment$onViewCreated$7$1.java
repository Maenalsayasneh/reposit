package com.clubhouse.backchannel.chat;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.di.FragmentName;
import com.clubhouse.android.ui.profile.HalfProfileArgs;
import com.clubhouse.backchannel.members.BackchannelChatMembersFragment;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatType;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import h0.o.a.c0;
import i0.e.c.c.y;
import i0.e.c.f.b.a.a;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: BackchannelChatFragment.kt */
public final class BackchannelChatFragment$onViewCreated$7$1 extends Lambda implements l<y, i> {
    public final /* synthetic */ BackchannelChatFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatFragment$onViewCreated$7$1(BackchannelChatFragment backchannelChatFragment) {
        super(1);
        this.c = backchannelChatFragment;
    }

    public Object invoke(Object obj) {
        ChatType chatType;
        ChatMember chatMember;
        y yVar = (y) obj;
        m0.n.b.i.e(yVar, "state");
        a aVar = yVar.b;
        ChatType chatType2 = null;
        if (aVar == null) {
            chatType = null;
        } else {
            chatType = aVar.f;
        }
        if (chatType == ChatType.GROUP) {
            final BackchannelChatFragment backchannelChatFragment = this.c;
            v.G(backchannelChatFragment, new l<c0, i>() {
                public Object invoke(Object obj) {
                    c0 c0Var = (c0) obj;
                    m0.n.b.i.e(c0Var, "$this$commitSafe");
                    c0Var.c(c0Var.k(BackchannelChatMembersFragment.class, BackchannelChatFragment.this.getArguments()), (String) null);
                    return i.a;
                }
            });
        } else {
            if (aVar != null) {
                chatType2 = aVar.f;
            }
            if (chatType2 == ChatType.ONE_ON_ONE && (chatMember = (ChatMember) g.w(aVar.n)) != null) {
                BackchannelChatFragment backchannelChatFragment2 = this.c;
                SourceLocation sourceLocation = SourceLocation.BACKCHANNEL;
                m0.n.b.i.e(backchannelChatFragment2, "<this>");
                m0.n.b.i.e(chatMember, "user");
                m0.n.b.i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
                v.f(backchannelChatFragment2, FragmentName.HALF_PROFILE, new HalfProfileArgs(chatMember, sourceLocation, false, false, false, 16));
            }
        }
        return i.a;
    }
}
