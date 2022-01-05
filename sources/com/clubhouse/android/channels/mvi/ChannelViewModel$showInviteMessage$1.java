package com.clubhouse.android.channels.mvi;

import android.text.SpannableString;
import android.text.TextUtils;
import com.clubhouse.android.channels.R;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import i0.e.b.d3.k;
import i0.e.b.z2.g.y0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$showInviteMessage$1 extends Lambda implements l<i0.e.b.z2.g.l, i> {
    public final /* synthetic */ ChannelViewModel c;
    public final /* synthetic */ UserInChannel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$showInviteMessage$1(ChannelViewModel channelViewModel, UserInChannel userInChannel) {
        super(1);
        this.c = channelViewModel;
        this.d = userInChannel;
    }

    public Object invoke(Object obj) {
        String str;
        SpannableString spannableString;
        i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
        m0.n.b.i.e(lVar, "state");
        if (lVar.S) {
            str = this.c.p.getString(R.string.received_speaker_invite_clips_enabled_message);
        } else {
            str = this.c.p.getString(R.string.received_speaker_invite_message);
        }
        m0.n.b.i.d(str, "if (state.isClipsEnabled) {\n                resources.getString(R.string.received_speaker_invite_clips_enabled_message)\n            } else {\n                resources.getString(R.string.received_speaker_invite_message)\n            }");
        String str2 = this.d.e2;
        if (str2 == null) {
            spannableString = null;
        } else {
            spannableString = k.w(str2, this.c.o, 0, str2.length());
        }
        ChannelViewModel channelViewModel = this.c;
        CharSequence expandTemplate = TextUtils.expandTemplate(str, new CharSequence[]{spannableString});
        m0.n.b.i.d(expandTemplate, "expandTemplate(template, userName)");
        channelViewModel.o(new y0(expandTemplate, this.d.getId().intValue()));
        return i.a;
    }
}
