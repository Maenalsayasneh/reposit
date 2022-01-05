package com.clubhouse.backchannel.chat;

import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clubhouse.backchannel.R;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import h0.b0.v;
import i0.e.c.c.y;
import i0.e.c.f.b.a.a;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;
import m0.r.k;

/* compiled from: BackchannelChatFragment.kt */
public final class BackchannelChatFragment$invalidate$1 extends Lambda implements l<y, i> {
    public final /* synthetic */ BackchannelChatFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatFragment$invalidate$1(BackchannelChatFragment backchannelChatFragment) {
        super(1);
        this.c = backchannelChatFragment;
    }

    public Object invoke(Object obj) {
        String str;
        ChatMember chatMember;
        List<ChatMember> list;
        List<ChatMember> list2;
        y yVar = (y) obj;
        m0.n.b.i.e(yVar, "state");
        BackchannelChatFragment backchannelChatFragment = this.c;
        k<Object>[] kVarArr = BackchannelChatFragment.Z1;
        backchannelChatFragment.O0().h.setEnabled(yVar.d);
        Button button = this.c.O0().h;
        m0.n.b.i.d(button, "binding.send");
        int i = 8;
        button.setVisibility(yVar.k ? 0 : 8);
        Button button2 = this.c.O0().i;
        m0.n.b.i.d(button2, "binding.startRoom");
        if (yVar.j) {
            i = 0;
        }
        button2.setVisibility(i);
        TextView textView = this.c.O0().j;
        a aVar = yVar.b;
        i iVar = null;
        if (aVar == null) {
            str = null;
        } else {
            str = aVar.u;
        }
        textView.setText(str);
        this.c.O0().a.g();
        this.c.O0().e.setVisibility(yVar.l ? 0 : 4);
        LinearLayout linearLayout = this.c.O0().d;
        m0.n.b.i.d(linearLayout, "binding.blockRequest");
        i0.e.b.d3.k.L(linearLayout, Boolean.valueOf(yVar.m));
        if (yVar.m) {
            a aVar2 = yVar.b;
            if (aVar2 == null || (list2 = aVar2.l) == null) {
                chatMember = null;
            } else {
                chatMember = (ChatMember) g.w(list2);
            }
            if (chatMember == null) {
                a aVar3 = yVar.b;
                if (aVar3 == null || (list = aVar3.n) == null) {
                    chatMember = null;
                } else {
                    chatMember = (ChatMember) g.w(list);
                }
            }
            if (chatMember != null) {
                BackchannelChatFragment backchannelChatFragment2 = this.c;
                backchannelChatFragment2.O0().c.setText(backchannelChatFragment2.getString(R.string.block_button_label, v.f0(chatMember)));
                backchannelChatFragment2.O0().c.setOnClickListener(new i0.e.c.c.l(backchannelChatFragment2, chatMember));
                iVar = i.a;
            }
            if (iVar == null) {
                LinearLayout linearLayout2 = this.c.O0().d;
                m0.n.b.i.d(linearLayout2, "binding.blockRequest");
                i0.e.b.d3.k.p(linearLayout2);
            }
        }
        FrameLayout frameLayout = this.c.O0().g;
        m0.n.b.i.d(frameLayout, "binding.roomLoading");
        i0.e.b.d3.k.L(frameLayout, Boolean.valueOf(yVar.i));
        return i.a;
    }
}
