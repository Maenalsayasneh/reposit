package i0.h.c.u;

import java.util.Objects;

/* compiled from: AutoValue_LibraryVersion */
public final class a extends e {
    public final String a;
    public final String b;

    public a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.a = str;
        Objects.requireNonNull(str2, "Null version");
        this.b = str2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.a.equals(eVar.a()) || !this.b.equals(eVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("LibraryVersion{libraryName=");
        P0.append(this.a);
        P0.append(", version=");
        return i0.d.a.a.a.y0(P0, this.b, "}");
    }
}
