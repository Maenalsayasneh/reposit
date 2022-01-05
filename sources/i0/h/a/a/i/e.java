package i0.h.a.a.i;

import i0.d.a.a.a;
import i0.h.a.a.b;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: EncodedPayload */
public final class e {
    public final b a;
    public final byte[] b;

    public e(b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.a = bVar;
        this.b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.a.equals(eVar.a)) {
            return false;
        }
        return Arrays.equals(this.b, eVar.b);
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder P0 = a.P0("EncodedPayload{encoding=");
        P0.append(this.a);
        P0.append(", bytes=[...]}");
        return P0.toString();
    }
}
