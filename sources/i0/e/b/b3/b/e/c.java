package i0.e.b.b3.b.e;

import com.clubhouse.android.data.models.local.channel.ChannelInFeed;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import i0.d.a.a.a;
import java.util.Map;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: PagingItem.kt */
public final class c extends j {
    public final ChannelInFeed b;
    public final Map<String, Object> c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(ChannelInFeed channelInFeed, Map<String, ? extends Object> map) {
        super((Map) map, (f) null);
        i.e(channelInFeed, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        this.b = channelInFeed;
        this.c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return i.a(this.b, cVar.b) && i.a(this.c, cVar.c);
    }

    public int hashCode() {
        int i;
        int hashCode = this.b.hashCode() * 31;
        Map<String, Object> map = this.c;
        if (map == null) {
            i = 0;
        } else {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ChannelItem(channel=");
        P0.append(this.b);
        P0.append(", loggingContext=");
        return a.B0(P0, this.c, ')');
    }
}
