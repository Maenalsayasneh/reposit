package s0.a.a;

import i0.d.a.a.a;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import s0.a.e.b.b0.c.h3;

public abstract class v extends r implements Iterable {
    public final e[] c;
    public final boolean d;

    public v() {
        this.c = f.a;
        this.d = true;
    }

    public v(e eVar) {
        Objects.requireNonNull(eVar, "'element' cannot be null");
        this.c = new e[]{eVar};
        this.d = true;
    }

    public v(f fVar, boolean z) {
        e[] eVarArr;
        int i;
        Objects.requireNonNull(fVar, "'elementVector' cannot be null");
        boolean z2 = false;
        if (!z || (i = fVar.c) < 2) {
            eVarArr = fVar.d();
        } else {
            if (i == 0) {
                eVarArr = f.a;
            } else {
                e[] eVarArr2 = new e[i];
                System.arraycopy(fVar.b, 0, eVarArr2, 0, i);
                eVarArr = eVarArr2;
            }
            F(eVarArr);
        }
        this.c = eVarArr;
        this.d = (z || eVarArr.length < 2) ? true : z2;
    }

    public v(boolean z, e[] eVarArr) {
        this.c = eVarArr;
        this.d = z || eVarArr.length < 2;
    }

    public v(e[] eVarArr, boolean z) {
        if (!h3.H1(eVarArr)) {
            e[] b = f.b(eVarArr);
            if (z && b.length >= 2) {
                F(b);
            }
            this.c = b;
            this.d = z || b.length < 2;
            return;
        }
        throw new NullPointerException("'elements' cannot be null, or contain null");
    }

    public static byte[] B(e eVar) {
        try {
            return eVar.c().r("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public static v C(Object obj) {
        if (obj == null || (obj instanceof v)) {
            return (v) obj;
        }
        if (obj instanceof w) {
            return C(((w) obj).c());
        }
        if (obj instanceof byte[]) {
            try {
                return C(r.x((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException(a.V(e, a.P0("failed to construct set from byte[]: ")));
            }
        } else {
            if (obj instanceof e) {
                r c2 = ((e) obj).c();
                if (c2 instanceof v) {
                    return (v) c2;
                }
            }
            throw new IllegalArgumentException(a.c0(obj, a.P0("unknown object in getInstance: ")));
        }
    }

    public static v D(z zVar, boolean z) {
        if (!z) {
            r C = zVar.C();
            if (zVar.d) {
                return zVar instanceof k0 ? new i0((e) C) : new q1((e) C);
            }
            if (C instanceof v) {
                v vVar = (v) C;
                return zVar instanceof k0 ? vVar : (v) vVar.A();
            } else if (C instanceof s) {
                e[] F = ((s) C).F();
                return zVar instanceof k0 ? new i0(false, F) : new q1(false, F);
            } else {
                StringBuilder P0 = a.P0("unknown object in getInstance: ");
                P0.append(zVar.getClass().getName());
                throw new IllegalArgumentException(P0.toString());
            }
        } else if (zVar.d) {
            return C(zVar.C());
        } else {
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
    }

    public static boolean E(byte[] bArr, byte[] bArr2) {
        byte b = bArr[0] & -33;
        byte b2 = bArr2[0] & -33;
        if (b != b2) {
            return b < b2;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i = 1; i < min; i++) {
            if (bArr[i] != bArr2[i]) {
                return (bArr[i] & 255) < (bArr2[i] & 255);
            }
        }
        return (bArr[min] & 255) <= (bArr2[min] & 255);
    }

    public static void F(e[] eVarArr) {
        int length = eVarArr.length;
        if (length >= 2) {
            e eVar = eVarArr[0];
            e eVar2 = eVarArr[1];
            byte[] B = B(eVar);
            byte[] B2 = B(eVar2);
            if (E(B2, B)) {
                e eVar3 = eVar2;
                eVar2 = eVar;
                eVar = eVar3;
            } else {
                byte[] bArr = B2;
                B2 = B;
                B = bArr;
            }
            for (int i = 2; i < length; i++) {
                e eVar4 = eVarArr[i];
                byte[] B3 = B(eVar4);
                if (E(B, B3)) {
                    eVarArr[i - 2] = eVar;
                    eVar = eVar2;
                    B2 = B;
                    eVar2 = eVar4;
                    B = B3;
                } else if (E(B2, B3)) {
                    eVarArr[i - 2] = eVar;
                    eVar = eVar4;
                    B2 = B3;
                } else {
                    int i2 = i - 1;
                    while (true) {
                        i2--;
                        if (i2 <= 0) {
                            break;
                        }
                        e eVar5 = eVarArr[i2 - 1];
                        if (E(B(eVar5), B3)) {
                            break;
                        }
                        eVarArr[i2] = eVar5;
                    }
                    eVarArr[i2] = eVar4;
                }
            }
            eVarArr[length - 2] = eVar;
            eVarArr[length - 1] = eVar2;
        }
    }

    public r A() {
        return new q1(this.d, this.c);
    }

    public int hashCode() {
        int length = this.c.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i += this.c[length].c().hashCode();
        }
    }

    public Iterator<e> iterator() {
        return new s0.a.g.a(f.b(this.c));
    }

    public boolean s(r rVar) {
        if (!(rVar instanceof v)) {
            return false;
        }
        v vVar = (v) rVar;
        int length = this.c.length;
        if (vVar.c.length != length) {
            return false;
        }
        c1 c1Var = (c1) z();
        c1 c1Var2 = (c1) vVar.z();
        for (int i = 0; i < length; i++) {
            r c2 = c1Var.c[i].c();
            r c3 = c1Var2.c[i].c();
            if (c2 != c3 && !c2.s(c3)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        int length = this.c.length;
        if (length == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i = 0;
        while (true) {
            stringBuffer.append(this.c[i]);
            i++;
            if (i >= length) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public boolean y() {
        return true;
    }

    public r z() {
        e[] eVarArr;
        if (this.d) {
            eVarArr = this.c;
        } else {
            eVarArr = (e[]) this.c.clone();
            F(eVarArr);
        }
        return new c1(true, eVarArr);
    }
}
