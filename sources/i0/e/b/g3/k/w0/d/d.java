package i0.e.b.g3.k.w0.d;

import com.clubhouse.android.data.models.local.channel.UserInChannel;
import h0.u.w;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: SearchInRoomViewModel.kt */
public final class d implements j {
    public final w<UserInChannel> a;

    public d() {
        this((w) null, 1, (f) null);
    }

    public d(w<UserInChannel> wVar) {
        i.e(wVar, "userData");
        this.a = wVar;
    }

    public static d copy$default(d dVar, w<UserInChannel> wVar, int i, Object obj) {
        if ((i & 1) != 0) {
            wVar = dVar.a;
        }
        Objects.requireNonNull(dVar);
        i.e(wVar, "userData");
        return new d(wVar);
    }

    public final w<UserInChannel> component1() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && i.a(this.a, ((d) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("SearchInRoomViewState(userData=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(w wVar, int i, f fVar) {
        this((i & 1) != 0 ? w.c.a() : wVar);
    }
}
