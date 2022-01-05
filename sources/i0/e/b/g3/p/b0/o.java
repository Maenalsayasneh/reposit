package i0.e.b.g3.p.b0;

import com.clubhouse.wave.data.models.local.ReceivedWave;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: BuddyListViewModel.kt */
public final class o implements c {
    public final ReceivedWave a;

    public o(ReceivedWave receivedWave) {
        i.e(receivedWave, "wave");
        this.a = receivedWave;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && i.a(this.a, ((o) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("AcceptWave(wave=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
