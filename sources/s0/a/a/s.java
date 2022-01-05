package s0.a.a;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import s0.a.e.b.b0.c.h3;

public abstract class s extends r implements Iterable {
    public e[] c;

    public class a implements Enumeration {
        public int a = 0;

        public a() {
        }

        public boolean hasMoreElements() {
            return this.a < s.this.c.length;
        }

        public Object nextElement() {
            int i = this.a;
            e[] eVarArr = s.this.c;
            if (i < eVarArr.length) {
                this.a = i + 1;
                return eVarArr[i];
            }
            throw new NoSuchElementException();
        }
    }

    public s() {
        this.c = f.a;
    }

    public s(e eVar) {
        Objects.requireNonNull(eVar, "'element' cannot be null");
        this.c = new e[]{eVar};
    }

    public s(f fVar) {
        Objects.requireNonNull(fVar, "'elementVector' cannot be null");
        this.c = fVar.d();
    }

    public s(e[] eVarArr) {
        if (!h3.H1(eVarArr)) {
            this.c = f.b(eVarArr);
            return;
        }
        throw new NullPointerException("'elements' cannot be null, or contain null");
    }

    public s(e[] eVarArr, boolean z) {
        this.c = z ? f.b(eVarArr) : eVarArr;
    }

    public static s B(Object obj) {
        if (obj == null || (obj instanceof s)) {
            return (s) obj;
        }
        if (obj instanceof t) {
            return B(((t) obj).c());
        }
        if (obj instanceof byte[]) {
            try {
                return B(r.x((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException(i0.d.a.a.a.V(e, i0.d.a.a.a.P0("failed to construct sequence from byte[]: ")));
            }
        } else {
            if (obj instanceof e) {
                r c2 = ((e) obj).c();
                if (c2 instanceof s) {
                    return (s) c2;
                }
            }
            throw new IllegalArgumentException(i0.d.a.a.a.c0(obj, i0.d.a.a.a.P0("unknown object in getInstance: ")));
        }
    }

    public static s C(z zVar, boolean z) {
        if (!z) {
            r C = zVar.C();
            if (zVar.d) {
                return zVar instanceof k0 ? new g0((e) C) : new o1((e) C);
            }
            if (C instanceof s) {
                s sVar = (s) C;
                return zVar instanceof k0 ? sVar : (s) sVar.A();
            }
            StringBuilder P0 = i0.d.a.a.a.P0("unknown object in getInstance: ");
            P0.append(zVar.getClass().getName());
            throw new IllegalArgumentException(P0.toString());
        } else if (zVar.d) {
            return B(zVar.C());
        } else {
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
    }

    public r A() {
        return new o1(this.c, false);
    }

    public e D(int i) {
        return this.c[i];
    }

    public Enumeration E() {
        return new a();
    }

    public e[] F() {
        return this.c;
    }

    public int hashCode() {
        int length = this.c.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ this.c[length].c().hashCode();
        }
    }

    public Iterator<e> iterator() {
        return new s0.a.g.a(this.c);
    }

    public boolean s(r rVar) {
        if (!(rVar instanceof s)) {
            return false;
        }
        s sVar = (s) rVar;
        int size = size();
        if (sVar.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            r c2 = this.c[i].c();
            r c3 = sVar.c[i].c();
            if (c2 != c3 && !c2.s(c3)) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        return this.c.length;
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i = 0;
        while (true) {
            stringBuffer.append(this.c[i]);
            i++;
            if (i >= size) {
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
        return new b1(this.c, false);
    }
}
