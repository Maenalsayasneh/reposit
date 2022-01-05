package i0.e.b.g3.r;

import com.clubhouse.android.data.models.local.channel.ChannelInRoom;
import h0.t.l;
import i0.b.b.b;
import i0.b.b.g0;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: WelcomeRoomViewModel.kt */
public final class y2 implements j {
    public final b<ChannelInRoom> a;
    public final b<l> b;

    public y2() {
        this((b) null, (b) null, 3, (f) null);
    }

    public y2(b<? extends ChannelInRoom> bVar, b<? extends l> bVar2) {
        i.e(bVar, "welcomeChannel");
        i.e(bVar2, "navigateTo");
        this.a = bVar;
        this.b = bVar2;
    }

    public static y2 copy$default(y2 y2Var, b<ChannelInRoom> bVar, b<l> bVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = y2Var.a;
        }
        if ((i & 2) != 0) {
            bVar2 = y2Var.b;
        }
        Objects.requireNonNull(y2Var);
        i.e(bVar, "welcomeChannel");
        i.e(bVar2, "navigateTo");
        return new y2(bVar, bVar2);
    }

    public final b<ChannelInRoom> component1() {
        return this.a;
    }

    public final b<l> component2() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return i.a(this.a, y2Var.a) && i.a(this.b, y2Var.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("WelcomeRoomViewState(welcomeChannel=");
        P0.append(this.a);
        P0.append(", navigateTo=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2(b bVar, b bVar2, int i, f fVar) {
        this((i & 1) != 0 ? g0.b : bVar, (i & 2) != 0 ? g0.b : bVar2);
    }
}
