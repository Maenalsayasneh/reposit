package i0.b.c.e;

import java.util.Objects;

/* compiled from: ResourceId.kt */
public final class c {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        Objects.requireNonNull((c) obj);
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(0);
    }

    public String toString() {
        return "ResourceId(resId=0)";
    }
}
