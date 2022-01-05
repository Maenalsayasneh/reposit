package defpackage;

import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.android.ui.channels.ChannelFragment$showChannelOptions$1$1$1$1$1;
import com.clubhouse.android.ui.channels.ChannelFragment$showChannelOptions$1$1$1$5$1;
import com.clubhouse.android.ui.channels.ChannelFragment$showChannelOptions$1$1$1$6$1;
import com.clubhouse.android.ui.channels.ChannelFragment$showChannelOptions$1$1$1$7$1;
import com.clubhouse.app.R;
import i0.e.b.g3.i.c;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* renamed from: r  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class r extends Lambda implements l<c, i> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(int i, Object obj, Object obj2) {
        super(1);
        this.c = i;
        this.d = obj;
        this.q = obj2;
    }

    public final Object invoke(Object obj) {
        int i = this.c;
        if (i == 0) {
            c cVar = (c) obj;
            m0.n.b.i.e(cVar, "$this$action");
            String string = ((ChannelFragment) this.d).getString(R.string.share_room);
            m0.n.b.i.d(string, "getString(R.string.share_room)");
            cVar.b(string);
            cVar.a(new ChannelFragment$showChannelOptions$1$1$1$1$1((ChannelFragment) this.d, (Channel) this.q));
            return i.a;
        } else if (i == 1) {
            c cVar2 = (c) obj;
            m0.n.b.i.e(cVar2, "$this$action");
            String string2 = ((ChannelFragment) this.d).getString(R.string.review_club_rules);
            m0.n.b.i.d(string2, "getString(R.string.review_club_rules)");
            cVar2.b(string2);
            cVar2.a(new ChannelFragment$showChannelOptions$1$1$1$5$1((ChannelFragment) this.d, (Channel) this.q));
            return i.a;
        } else if (i == 2) {
            c cVar3 = (c) obj;
            m0.n.b.i.e(cVar3, "$this$action");
            String string3 = ((ChannelFragment) this.d).getString(R.string.share_audio_debug);
            m0.n.b.i.d(string3, "getString(R.string.share_audio_debug)");
            cVar3.b(string3);
            cVar3.a(new ChannelFragment$showChannelOptions$1$1$1$6$1((ChannelFragment) this.d, (i0.e.b.z2.g.l) this.q));
            return i.a;
        } else if (i == 3) {
            c cVar4 = (c) obj;
            m0.n.b.i.e(cVar4, "$this$action");
            String string4 = ((ChannelFragment) this.d).getString(R.string.report_room_title);
            m0.n.b.i.d(string4, "getString(R.string.report_room_title)");
            cVar4.b(string4);
            cVar4.a(new ChannelFragment$showChannelOptions$1$1$1$7$1((ChannelFragment) this.d, (i0.e.b.z2.g.l) this.q));
            return i.a;
        } else {
            throw null;
        }
    }
}
