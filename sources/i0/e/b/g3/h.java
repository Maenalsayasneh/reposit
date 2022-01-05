package i0.e.b.g3;

import com.clubhouse.android.ui.ChannelDisplayState;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: NavigationViewModel.kt */
public final class h implements j {
    public final ChannelDisplayState a;

    public h() {
        this((ChannelDisplayState) null, 1, (f) null);
    }

    public h(ChannelDisplayState channelDisplayState) {
        i.e(channelDisplayState, "channelDisplayState");
        this.a = channelDisplayState;
    }

    public static h copy$default(h hVar, ChannelDisplayState channelDisplayState, int i, Object obj) {
        if ((i & 1) != 0) {
            channelDisplayState = hVar.a;
        }
        Objects.requireNonNull(hVar);
        i.e(channelDisplayState, "channelDisplayState");
        return new h(channelDisplayState);
    }

    public final ChannelDisplayState component1() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.a == ((h) obj).a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("NavigationState(channelDisplayState=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(ChannelDisplayState channelDisplayState, int i, f fVar) {
        this((i & 1) != 0 ? ChannelDisplayState.NONE : channelDisplayState);
    }
}
