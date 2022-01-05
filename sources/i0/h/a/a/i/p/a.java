package i0.h.a.a.i.p;

import com.google.android.datatransport.runtime.EventInternal;
import java.util.Arrays;

/* compiled from: AutoValue_BackendRequest */
public final class a extends f {
    public final Iterable<EventInternal> a;
    public final byte[] b;

    public a(Iterable iterable, byte[] bArr, C0126a aVar) {
        this.a = iterable;
        this.b = bArr;
    }

    public Iterable<EventInternal> a() {
        return this.a;
    }

    public byte[] b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a.equals(fVar.a())) {
            if (Arrays.equals(this.b, fVar instanceof a ? ((a) fVar).b : fVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("BackendRequest{events=");
        P0.append(this.a);
        P0.append(", extras=");
        P0.append(Arrays.toString(this.b));
        P0.append("}");
        return P0.toString();
    }
}
