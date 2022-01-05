package s0.a.a;

import i0.d.a.a.a;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Exception;

public class k0 extends z {
    public k0(boolean z, int i, e eVar) {
        super(z, i, eVar);
    }

    public void t(q qVar, boolean z) throws IOException {
        Enumeration enumeration;
        qVar.m(z, 160, this.c);
        qVar.a.write(128);
        if (!this.d) {
            e eVar = this.q;
            if (eVar instanceof o) {
                enumeration = eVar instanceof e0 ? ((e0) eVar).E() : new e0(((o) eVar).c).E();
            } else if (eVar instanceof s) {
                enumeration = ((s) eVar).E();
            } else if (eVar instanceof v) {
                v vVar = (v) eVar;
                Objects.requireNonNull(vVar);
                enumeration = new u(vVar);
            } else {
                StringBuilder P0 = a.P0("not implemented: ");
                P0.append(this.q.getClass().getName());
                throw new ASN1Exception(P0.toString());
            }
            qVar.d(enumeration);
        } else {
            qVar.l(this.q.c(), true);
        }
        qVar.a.write(0);
        qVar.a.write(0);
    }

    public int u() throws IOException {
        int u = this.q.c().u();
        if (this.d) {
            return a2.a(u) + a2.b(this.c) + u;
        }
        return a2.b(this.c) + (u - 1);
    }

    public boolean y() {
        return this.d || this.q.c().y();
    }
}
