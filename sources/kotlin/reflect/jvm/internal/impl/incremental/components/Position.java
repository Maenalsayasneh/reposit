package kotlin.reflect.jvm.internal.impl.incremental.components;

import java.io.Serializable;
import m0.n.b.f;

/* compiled from: LookupLocation.kt */
public final class Position implements Serializable {
    public static final a c = new a((f) null);
    public static final Position d = new Position(-1, -1);
    public final int q;
    public final int x;

    /* compiled from: LookupLocation.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    public Position(int i, int i2) {
        this.q = i;
        this.x = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        return this.q == position.q && this.x == position.x;
    }

    public int hashCode() {
        return (this.q * 31) + this.x;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("Position(line=");
        P0.append(this.q);
        P0.append(", column=");
        return i0.d.a.a.a.s0(P0, this.x, ')');
    }
}
