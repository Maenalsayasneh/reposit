package i0.e.b.g3.k.w0.b;

import com.clubhouse.android.data.models.local.channel.Channel;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import h0.u.w;
import i0.b.b.j;
import i0.e.b.a3.d.a;
import i0.e.b.b3.b.e.m;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: PingUserViewModel.kt */
public final class f implements j {
    public final Channel a;
    public final w<a<m>> b;
    public final boolean c;

    public f(Channel channel, w<a<m>> wVar, boolean z) {
        i.e(channel, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        i.e(wVar, "userData");
        this.a = channel;
        this.b = wVar;
        this.c = z;
    }

    public static f copy$default(f fVar, Channel channel, w<a<m>> wVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            channel = fVar.a;
        }
        if ((i & 2) != 0) {
            wVar = fVar.b;
        }
        if ((i & 4) != 0) {
            z = fVar.c;
        }
        Objects.requireNonNull(fVar);
        i.e(channel, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        i.e(wVar, "userData");
        return new f(channel, wVar, z);
    }

    public final Channel component1() {
        return this.a;
    }

    public final w<a<m>> component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return i.a(this.a, fVar.a) && i.a(this.b, fVar.b) && this.c == fVar.c;
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("PingUserViewState(channel=");
        P0.append(this.a);
        P0.append(", userData=");
        P0.append(this.b);
        P0.append(", isLoaded=");
        return i0.d.a.a.a.C0(P0, this.c, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Channel channel, w wVar, boolean z, int i, m0.n.b.f fVar) {
        this(channel, (i & 2) != 0 ? w.c.a() : wVar, (i & 4) != 0 ? false : z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f(Channel channel) {
        this(channel, (w) null, false, 6, (m0.n.b.f) null);
        i.e(channel, "arg");
    }
}
