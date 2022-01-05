package com.clubhouse.backchannel.chat;

import com.clubhouse.backchannel.R;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import h0.b.a.d;
import h0.b0.v;
import i0.e.c.c.s;
import i0.e.c.c.t;
import i0.e.c.c.u;
import i0.e.c.c.y;
import i0.e.c.f.b.a.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: BackchannelChatFragment.kt */
public final class BackchannelChatFragment$showBlockWarning$1 extends Lambda implements l<y, i> {
    public final /* synthetic */ BackchannelChatFragment c;
    public final /* synthetic */ List<ChatMember> d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatFragment$showBlockWarning$1(BackchannelChatFragment backchannelChatFragment, List<ChatMember> list) {
        super(1);
        this.c = backchannelChatFragment;
        this.d = list;
    }

    public Object invoke(Object obj) {
        final y yVar = (y) obj;
        m0.n.b.i.e(yVar, "state");
        final BackchannelChatFragment backchannelChatFragment = this.c;
        final List<ChatMember> list = this.d;
        AnonymousClass1 r1 = new l<d.a, i>() {
            public Object invoke(Object obj) {
                d.a aVar = (d.a) obj;
                m0.n.b.i.e(aVar, "$this$alertDialog");
                aVar.e(R.string.blocked_chat_member_warning_title);
                boolean z = false;
                aVar.a.k = false;
                BackchannelChatFragment backchannelChatFragment = BackchannelChatFragment.this;
                int i = R.string.blocked_chat_member_warning_message;
                Object[] objArr = new Object[1];
                List<ChatMember> list = list;
                ArrayList arrayList = new ArrayList(h.K(list, 10));
                for (ChatMember chatMember : list) {
                    Objects.requireNonNull(chatMember);
                    arrayList.add(v.f0(chatMember));
                }
                objArr[0] = g.E(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 63);
                aVar.a.f = backchannelChatFragment.getString(i, objArr);
                aVar.d(R.string.stay, new t(BackchannelChatFragment.this));
                a aVar2 = yVar.b;
                if (aVar2 != null && aVar2.s) {
                    z = true;
                }
                if (z) {
                    aVar.c(R.string.back, new s(BackchannelChatFragment.this));
                } else {
                    aVar.c(R.string.leave, new u(BackchannelChatFragment.this));
                }
                return i.a;
            }
        };
        m0.n.b.i.e(backchannelChatFragment, "<this>");
        m0.n.b.i.e(r1, "f");
        d.a aVar = new d.a(backchannelChatFragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
        r1.invoke(aVar);
        aVar.g();
        return i.a;
    }
}
