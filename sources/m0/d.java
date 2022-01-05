package m0;

import m0.n.b.f;
import m0.n.b.i;

/* compiled from: UByte.kt */
public final class d implements Comparable<d> {
    public static final a c = new a((f) null);
    public final byte d;

    /* compiled from: UByte.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    public /* synthetic */ d(byte b) {
        this.d = b;
    }

    public static String a(byte b) {
        return String.valueOf(b & 255);
    }

    public int compareTo(Object obj) {
        return i.g(this.d & 255, ((d) obj).d & 255);
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && this.d == ((d) obj).d;
    }

    public int hashCode() {
        return this.d;
    }

    public String toString() {
        return a(this.d);
    }
}
