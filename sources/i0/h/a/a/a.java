package i0.h.a.a;

import com.google.android.datatransport.Priority;
import java.util.Objects;

/* compiled from: AutoValue_Event */
public final class a<T> extends c<T> {
    public final T a;
    public final Priority b;

    public a(Integer num, T t, Priority priority) {
        Objects.requireNonNull(t, "Null payload");
        this.a = t;
        Objects.requireNonNull(priority, "Null priority");
        this.b = priority;
    }

    public Integer a() {
        return null;
    }

    public T b() {
        return this.a;
    }

    public Priority c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (cVar.a() != null || !this.a.equals(cVar.b()) || !this.b.equals(cVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.b.hashCode() ^ ((-721379959 ^ this.a.hashCode()) * 1000003);
    }

    public String toString() {
        return "Event{code=" + null + ", payload=" + this.a + ", priority=" + this.b + "}";
    }
}
