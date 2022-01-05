package i0.h.a.a.i.s.i;

import com.google.android.datatransport.runtime.EventInternal;
import i0.d.a.a.a;
import i0.h.a.a.i.h;
import java.util.Objects;

/* compiled from: AutoValue_PersistedEvent */
public final class b extends h {
    public final long a;
    public final h b;
    public final EventInternal c;

    public b(long j, h hVar, EventInternal eventInternal) {
        this.a = j;
        Objects.requireNonNull(hVar, "Null transportContext");
        this.b = hVar;
        Objects.requireNonNull(eventInternal, "Null event");
        this.c = eventInternal;
    }

    public EventInternal a() {
        return this.c;
    }

    public long b() {
        return this.a;
    }

    public h c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a != hVar.b() || !this.b.equals(hVar.c()) || !this.c.equals(hVar.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("PersistedEvent{id=");
        P0.append(this.a);
        P0.append(", transportContext=");
        P0.append(this.b);
        P0.append(", event=");
        P0.append(this.c);
        P0.append("}");
        return P0.toString();
    }
}
