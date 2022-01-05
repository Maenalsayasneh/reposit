package i0.e.b.z2.f;

import com.pubnub.api.endpoints.objects_api.utils.Include;
import m0.n.b.i;

/* compiled from: PubSubChannelData.kt */
public final class f {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final Long e;
    public final boolean f;

    public f(String str, String str2, String str3, int i, int i2, Long l, boolean z) {
        i.e(str, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        i.e(str2, "pubSubOrigin");
        i.e(str3, "pubSubToken");
        this.a = str2;
        this.b = str3;
        this.c = i;
        this.d = i2;
        this.e = l;
        this.f = z;
    }
}
