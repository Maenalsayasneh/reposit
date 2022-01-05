package i0.h.a.a.i.s.i;

/* compiled from: AutoValue_EventStoreConfig */
public final class a extends d {
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;

    public a(long j, int i, int i2, long j2, int i3, C0127a aVar) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = i3;
    }

    public int a() {
        return this.d;
    }

    public long b() {
        return this.e;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.f;
    }

    public long e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.b == dVar.e() && this.c == dVar.c() && this.d == dVar.a() && this.e == dVar.b() && this.f == dVar.d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.e;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EventStoreConfig{maxStorageSizeInBytes=");
        P0.append(this.b);
        P0.append(", loadBatchSize=");
        P0.append(this.c);
        P0.append(", criticalSectionEnterTimeoutMs=");
        P0.append(this.d);
        P0.append(", eventCleanUpAge=");
        P0.append(this.e);
        P0.append(", maxBlobByteSizePerRow=");
        return i0.d.a.a.a.u0(P0, this.f, "}");
    }
}
