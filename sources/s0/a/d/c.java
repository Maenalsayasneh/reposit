package s0.a.d;

import java.io.IOException;
import java.security.Principal;
import s0.a.a.c3.x0;
import s0.a.a.j;
import s0.a.a.s;

public class c extends x0 implements Principal {
    public c(s0.a.a.b3.c cVar) {
        super(cVar.Y1);
    }

    public c(x0 x0Var) {
        super((s) x0Var.c());
    }

    public byte[] getEncoded() {
        try {
            return r("DER");
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    public String getName() {
        return toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(byte[] bArr) throws IOException {
        super(s.B(new j(bArr).i()));
        try {
        } catch (IllegalArgumentException e) {
            throw new IOException("not an ASN.1 Sequence: " + e);
        }
    }
}
