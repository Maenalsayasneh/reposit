package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.channels.R;
import com.clubhouse.android.data.models.local.channel.AllUserMessage;
import i0.e.b.a3.b.d;
import i0.e.b.z2.g.k;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelControlModel.kt */
public final class ChannelControlModel$handleClipsSettingsChange$2 extends Lambda implements l<k, i> {
    public final /* synthetic */ ChannelControlModel c;
    public final /* synthetic */ AllUserMessage d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelControlModel$handleClipsSettingsChange$2(ChannelControlModel channelControlModel, AllUserMessage allUserMessage) {
        super(1);
        this.c = channelControlModel;
        this.d = allUserMessage;
    }

    public Object invoke(Object obj) {
        k kVar = (k) obj;
        m0.n.b.i.e(kVar, "state");
        int i = this.c.q.a;
        Integer num = this.d.b;
        if ((num == null || i != num.intValue()) && (kVar.d.h() || kVar.d.f())) {
            ChannelControlModel channelControlModel = this.c;
            channelControlModel.o(new d(channelControlModel.t.getString(R.string.clips_disabled_for_room)));
        }
        return i.a;
    }
}
