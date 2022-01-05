package s0.a.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class p0 extends h {
    public p0(n nVar, k kVar, r rVar, int i, r rVar2) {
        super(nVar, kVar, rVar, i, rVar2);
    }

    public r A() {
        return this;
    }

    public void t(q qVar, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        n nVar = this.c;
        if (nVar != null) {
            byteArrayOutputStream.write(nVar.r("DER"));
        }
        k kVar = this.d;
        if (kVar != null) {
            byteArrayOutputStream.write(kVar.r("DER"));
        }
        r rVar = this.q;
        if (rVar != null) {
            byteArrayOutputStream.write(rVar.r("DER"));
        }
        byteArrayOutputStream.write(new e1(true, this.x, this.y).r("DER"));
        qVar.f(z, 32, 8, byteArrayOutputStream.toByteArray());
    }

    public int u() throws IOException {
        return getEncoded().length;
    }

    public r z() {
        return this;
    }
}
