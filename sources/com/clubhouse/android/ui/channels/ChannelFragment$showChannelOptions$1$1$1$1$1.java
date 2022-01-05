package com.clubhouse.android.ui.channels;

import android.content.Context;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.core.R;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.instabug.library.model.NetworkLog;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import h0.b0.v;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$showChannelOptions$1$1$1$1$1 extends Lambda implements a<i> {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ Channel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$showChannelOptions$1$1$1$1$1(ChannelFragment channelFragment, Channel channel) {
        super(0);
        this.c = channelFragment;
        this.d = channel;
    }

    public Object invoke() {
        ChannelFragment channelFragment = this.c;
        i0.e.a.b.a aVar = channelFragment.a2;
        if (aVar != null) {
            Channel channel = this.d;
            m0.n.b.i.e(channelFragment, "<this>");
            m0.n.b.i.e(aVar, "actionTrailRecorder");
            m0.n.b.i.e(channel, Include.INCLUDE_CHANNEL_PARAM_VALUE);
            aVar.e("Share-Type-Channel", SourceLocation.CHANNEL);
            ((AmplitudeAnalytics) v.l(channelFragment)).a("ShareLink-Presented");
            Context requireContext = channelFragment.requireContext();
            m0.n.b.i.d(requireContext, "requireContext()");
            String url = channel.getUrl();
            m0.n.b.i.e(requireContext, "<this>");
            if (url != null) {
                i0.d.a.a.a.e(requireContext, R.string.share_prompt, i0.d.a.a.a.K("android.intent.action.SEND", NetworkLog.PLAIN_TEXT, "android.intent.extra.TEXT", url));
            }
            return i.a;
        }
        m0.n.b.i.m("actionTrailRecorder");
        throw null;
    }
}
