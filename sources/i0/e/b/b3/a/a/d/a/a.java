package i0.e.b.b3.a.a.d.a;

import com.clubhouse.android.data.models.local.channel.ChannelInFeed;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: FeedItem.kt */
public final class a extends e {
    public final ChannelInFeed a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(ChannelInFeed channelInFeed) {
        super((f) null);
        i.e(channelInFeed, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        this.a = channelInFeed;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && i.a(this.a, ((a) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChannelFeedItem(channel=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
