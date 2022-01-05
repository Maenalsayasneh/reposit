package i0.e.b.z2.i;

import i0.d.a.a.a;

/* compiled from: SpeakerVolume.kt */
public final class b {
    public final int a;
    public final int b;

    public b(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b;
    }

    public int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("SpeakerVolume(userId=");
        P0.append(this.a);
        P0.append(", volume=");
        return a.s0(P0, this.b, ')');
    }
}
