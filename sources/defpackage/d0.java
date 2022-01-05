package defpackage;

import com.clubhouse.android.core.ui.Banner;
import com.clubhouse.android.data.models.local.channel.ChannelUserMessage;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.data.models.local.channel.UserMessage;
import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.app.R;
import i0.e.b.a3.f.j;
import i0.e.b.z2.g.s0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* renamed from: d0  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class d0 extends Lambda implements l<j, i> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(int i, Object obj, Object obj2) {
        super(1);
        this.c = i;
        this.d = obj;
        this.q = obj2;
    }

    public final Object invoke(Object obj) {
        int i = this.c;
        if (i == 0) {
            j jVar = (j) obj;
            m0.n.b.i.e(jVar, "$this$showBanner");
            jVar.e(((ChannelFragment) this.q).getString(R.string.invite_to_new_channel_declined, ((UserMessage) ((s0) this.d).a).c));
            jVar.h(Banner.Style.Negative);
            return i.a;
        } else if (i == 1) {
            j jVar2 = (j) obj;
            m0.n.b.i.e(jVar2, "$this$showBanner");
            jVar2.e(((ChannelFragment) this.d).getString(R.string.joined_as_listener, ((UserInChannel) this.q).e2));
            return i.a;
        } else if (i == 2) {
            j jVar3 = (j) obj;
            m0.n.b.i.e(jVar3, "$this$showBanner");
            jVar3.e(((ChannelFragment) this.q).getString(R.string.invite_to_speak_rejected, ((ChannelUserMessage) ((s0) this.d).a).c));
            jVar3.h(Banner.Style.Negative);
            return i.a;
        } else if (i == 3) {
            j jVar4 = (j) obj;
            m0.n.b.i.e(jVar4, "$this$showBanner");
            jVar4.e(((ChannelFragment) this.q).getString(R.string.invite_to_speak_accepted, ((ChannelUserMessage) ((s0) this.d).a).c));
            return i.a;
        } else {
            throw null;
        }
    }
}
