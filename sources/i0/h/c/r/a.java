package i0.h.c.r;

/* compiled from: AutoValue_InstallationTokenResult */
public final class a extends k {
    public final String a;
    public final long b;
    public final long c;

    public a(String str, long j, long j2, C0149a aVar) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public String a() {
        return this.a;
    }

    public long b() {
        return this.c;
    }

    public long c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.a.equals(kVar.a()) && this.b == kVar.c() && this.c == kVar.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("InstallationTokenResult{token=");
        P0.append(this.a);
        P0.append(", tokenExpirationTimestamp=");
        P0.append(this.b);
        P0.append(", tokenCreationTimestamp=");
        P0.append(this.c);
        P0.append("}");
        return P0.toString();
    }
}
