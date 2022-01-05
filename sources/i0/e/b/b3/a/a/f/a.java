package i0.e.b.b3.a.a.f;

/* compiled from: UserPresence.kt */
public final class a implements i0.e.b.a3.e.a<Integer> {
    public final int c;
    public final int d;

    public a(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return getId().intValue() == aVar.getId().intValue() && this.d == aVar.d;
    }

    public Integer getId() {
        return Integer.valueOf(this.c);
    }

    public int hashCode() {
        return Integer.hashCode(this.d) + (getId().hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UserPresence(id=");
        P0.append(getId().intValue());
        P0.append(", lastActiveMinutes=");
        return i0.d.a.a.a.s0(P0, this.d, ')');
    }
}
