package i0.h.a.a.i.p;

import android.content.Context;
import i0.h.a.a.i.u.a;
import java.util.Objects;

/* compiled from: AutoValue_CreationContext */
public final class c extends g {
    public final Context a;
    public final a b;
    public final a c;
    public final String d;

    public c(Context context, a aVar, a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.d = str;
    }

    public Context a() {
        return this.a;
    }

    public String b() {
        return this.d;
    }

    public a c() {
        return this.c;
    }

    public a d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.a.equals(gVar.a()) || !this.b.equals(gVar.d()) || !this.c.equals(gVar.c()) || !this.d.equals(gVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("CreationContext{applicationContext=");
        P0.append(this.a);
        P0.append(", wallClock=");
        P0.append(this.b);
        P0.append(", monotonicClock=");
        P0.append(this.c);
        P0.append(", backendName=");
        return i0.d.a.a.a.y0(P0, this.d, "}");
    }
}
