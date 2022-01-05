package j$.time.zone;

import j$.time.Duration;
import j$.time.f;
import j$.time.k;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class a implements Comparable<a>, Serializable {
    private final f a;
    private final k b;
    private final k c;

    a(long j, k kVar, k kVar2) {
        this.a = f.e0(j, 0, kVar);
        this.b = kVar;
        this.c = kVar2;
    }

    a(f fVar, k kVar, k kVar2) {
        this.a = fVar;
        this.b = kVar;
        this.c = kVar2;
    }

    public k B() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public List I() {
        if (P()) {
            return Collections.emptyList();
        }
        return Arrays.asList(new k[]{this.b, this.c});
    }

    public boolean P() {
        return this.c.V() > this.b.V();
    }

    public long Q() {
        return this.a.X(this.b);
    }

    public int compareTo(Object obj) {
        a aVar = (a) obj;
        return this.a.K(this.b).o(aVar.a.K(aVar.b));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
    }

    public int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 16);
    }

    public f k() {
        return this.a.j0((long) (this.c.V() - this.b.V()));
    }

    public f o() {
        return this.a;
    }

    public Duration p() {
        return Duration.p((long) (this.c.V() - this.b.V()));
    }

    public k q() {
        return this.c;
    }

    public String toString() {
        StringBuilder b2 = j$.com.android.tools.r8.a.b("Transition[");
        b2.append(P() ? "Gap" : "Overlap");
        b2.append(" at ");
        b2.append(this.a);
        b2.append(this.b);
        b2.append(" to ");
        b2.append(this.c);
        b2.append(']');
        return b2.toString();
    }
}
