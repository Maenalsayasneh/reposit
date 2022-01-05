package i0.e.b.z2.i;

/* compiled from: SpeakerState.kt */
public final class a {
    public final int a;
    public final boolean b;

    public a(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SpeakerState(userId=");
        P0.append(this.a);
        P0.append(", muted=");
        return i0.d.a.a.a.C0(P0, this.b, ')');
    }
}
