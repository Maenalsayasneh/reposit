package com.clubhouse.android.ui.channels;

import com.clubhouse.android.channels.model.AudienceType;
import com.clubhouse.app.R;
import i0.e.b.g3.i.c;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$audienceOption$1 extends Lambda implements l<c, i> {
    public final /* synthetic */ AudienceType c;
    public final /* synthetic */ ChannelFragment d;
    public final /* synthetic */ boolean q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$audienceOption$1(AudienceType audienceType, ChannelFragment channelFragment, boolean z) {
        super(1);
        this.c = audienceType;
        this.d = channelFragment;
        this.q = z;
    }

    public Object invoke(Object obj) {
        c cVar = (c) obj;
        m0.n.b.i.e(cVar, "$this$action");
        cVar.a = Integer.valueOf(this.c.getActionIcon());
        cVar.c = Integer.valueOf(R.color.clubhouse_green);
        String string = this.d.getString(this.c.getActionTitle());
        m0.n.b.i.d(string, "getString(type.actionTitle)");
        cVar.b(string);
        cVar.e = this.d.getString(this.c.getExplanation());
        cVar.f = this.q;
        final ChannelFragment channelFragment = this.d;
        final AudienceType audienceType = this.c;
        cVar.a(new a<i>() {
            public Object invoke() {
                ChannelFragment.this.S0().p(new i0.e.b.z2.g.i(audienceType));
                return i.a;
            }
        });
        return i.a;
    }
}
