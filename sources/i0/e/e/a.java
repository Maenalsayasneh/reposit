package i0.e.e;

import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: WaveCoordinatorViewModel.kt */
public final class a implements c {
    public final int a;
    public final String b;

    public a(int i, String str) {
        i.e(str, "waveId");
        this.a = i;
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && i.a(this.b, aVar.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("AcceptWave(userId=");
        P0.append(this.a);
        P0.append(", waveId=");
        return i0.d.a.a.a.x0(P0, this.b, ')');
    }
}
