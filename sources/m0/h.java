package m0;

import m0.n.b.f;
import m0.n.b.i;

/* compiled from: UShort.kt */
public final class h implements Comparable<h> {
    public static final a c = new a((f) null);
    public final short d;

    /* compiled from: UShort.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    public /* synthetic */ h(short s) {
        this.d = s;
    }

    public static String a(short s) {
        return String.valueOf(s & 65535);
    }

    public int compareTo(Object obj) {
        return i.g(this.d & 65535, ((h) obj).d & 65535);
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && this.d == ((h) obj).d;
    }

    public int hashCode() {
        return this.d;
    }

    public String toString() {
        return a(this.d);
    }
}
