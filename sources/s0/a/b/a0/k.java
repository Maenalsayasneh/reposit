package s0.a.b.a0;

import s0.a.b.i;
import s0.a.b.k0.u1;
import s0.a.b.k0.v1;
import s0.a.b.u;

public class k implements u {
    public final u a;
    public u1 b;

    public k(u uVar) {
        this.a = uVar;
    }

    public void a(i iVar, byte[] bArr, int i) {
        v1 v1Var = (v1) iVar;
        this.a.init(this.b.d);
        this.a.a(v1Var.d, bArr, i);
        this.a.init(this.b.c);
        u uVar = this.a;
        uVar.a(v1Var.c, bArr, uVar.b() + i);
    }

    public int b() {
        return this.a.b() * 2;
    }

    public void init(i iVar) {
        this.b = (u1) iVar;
    }
}
