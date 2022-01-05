package s0.a.a;

import i0.d.a.a.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;
import s0.a.e.b.b0.c.h3;
import s0.a.g.j;
import s0.a.g.k.d;

public abstract class o extends r implements p {
    public byte[] c;

    public o(byte[] bArr) {
        Objects.requireNonNull(bArr, "'string' cannot be null");
        this.c = bArr;
    }

    public static o B(Object obj) {
        if (obj == null || (obj instanceof o)) {
            return (o) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return B(r.x((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException(a.V(e, a.P0("failed to construct OCTET STRING from byte[]: ")));
            }
        } else {
            if (obj instanceof e) {
                r c2 = ((e) obj).c();
                if (c2 instanceof o) {
                    return (o) c2;
                }
            }
            throw new IllegalArgumentException(a.c0(obj, a.P0("illegal object in getInstance: ")));
        }
    }

    public static o C(z zVar, boolean z) {
        if (!z) {
            r C = zVar.C();
            if (zVar.d) {
                o B = B(C);
                if (zVar instanceof k0) {
                    return new e0(new o[]{B});
                }
                return (o) new e0(new o[]{B}).A();
            } else if (C instanceof o) {
                o oVar = (o) C;
                return zVar instanceof k0 ? oVar : (o) oVar.A();
            } else if (C instanceof s) {
                s sVar = (s) C;
                return zVar instanceof k0 ? e0.D(sVar) : (o) e0.D(sVar).A();
            } else {
                StringBuilder P0 = a.P0("unknown object in getInstance: ");
                P0.append(zVar.getClass().getName());
                throw new IllegalArgumentException(P0.toString());
            }
        } else if (zVar.d) {
            return B(zVar.C());
        } else {
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
    }

    public r A() {
        return new x0(this.c);
    }

    public InputStream b() {
        return new ByteArrayInputStream(this.c);
    }

    public int hashCode() {
        return h3.m1(this.c);
    }

    public r j() {
        return this;
    }

    public boolean s(r rVar) {
        if (!(rVar instanceof o)) {
            return false;
        }
        return Arrays.equals(this.c, ((o) rVar).c);
    }

    public String toString() {
        StringBuilder P0 = a.P0("#");
        P0.append(j.a(d.d(this.c)));
        return P0.toString();
    }

    public r z() {
        return new x0(this.c);
    }
}
