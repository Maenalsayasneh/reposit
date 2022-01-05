package i0.e.b.z2.f;

import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: ChannelArgs.kt */
public final class e implements b {
    public final String a;
    public final Channel b;
    public final SourceLocation c;

    public e(String str, Channel channel, SourceLocation sourceLocation, int i) {
        int i2 = i & 2;
        i.e(str, "channelId");
        i.e(sourceLocation, "sourceLocation");
        this.a = str;
        this.b = null;
        this.c = sourceLocation;
    }

    public e(Channel channel, SourceLocation sourceLocation) {
        i.e(channel, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        i.e(sourceLocation, "sourceLocation");
        String e = channel.e();
        i.e(e, "channelId");
        i.e(sourceLocation, "sourceLocation");
        this.a = e;
        this.b = channel;
        this.c = sourceLocation;
    }
}
