package s0.a.a;

import i0.d.a.a.a;
import java.io.IOException;

public class c extends r {
    public static final c c = new c((byte) 0);
    public static final c d = new c((byte) -1);
    public final byte q;

    public c(byte b) {
        this.q = b;
    }

    public static c B(byte[] bArr) {
        if (bArr.length == 1) {
            byte b = bArr[0];
            return b != -1 ? b != 0 ? new c(b) : c : d;
        }
        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
    }

    public static c C(Object obj) {
        if (obj == null || (obj instanceof c)) {
            return (c) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (c) r.x((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException(a.V(e, a.P0("failed to construct boolean from byte[]: ")));
            }
        } else {
            throw new IllegalArgumentException(a.c0(obj, a.P0("illegal object in getInstance: ")));
        }
    }

    public static c D(z zVar, boolean z) {
        r C = zVar.C();
        return (z || (C instanceof c)) ? C(C) : B(o.B(C).c);
    }

    public boolean E() {
        return this.q != 0;
    }

    public int hashCode() {
        return E() ? 1 : 0;
    }

    public boolean s(r rVar) {
        return (rVar instanceof c) && E() == ((c) rVar).E();
    }

    public void t(q qVar, boolean z) throws IOException {
        byte b = this.q;
        if (z) {
            qVar.a.write(1);
        }
        qVar.i(1);
        qVar.a.write(b);
    }

    public String toString() {
        return E() ? "TRUE" : "FALSE";
    }

    public int u() {
        return 3;
    }

    public boolean y() {
        return false;
    }

    public r z() {
        return E() ? d : c;
    }
}
