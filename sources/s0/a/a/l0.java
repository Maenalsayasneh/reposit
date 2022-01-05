package s0.a.a;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

public class l0 implements e, v1 {
    public boolean c;
    public int d;
    public x q;

    public l0(boolean z, int i, x xVar) {
        this.c = z;
        this.d = i;
        this.q = xVar;
    }

    public r c() {
        try {
            return j();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage());
        }
    }

    public r j() throws IOException {
        return this.q.b(this.c, this.d);
    }
}
