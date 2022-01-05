package s0.a.a;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

public class c0 implements e, v1 {
    public final int c;
    public final x d;

    public c0(int i, x xVar) {
        this.c = i;
        this.d = xVar;
    }

    public r c() {
        try {
            return j();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage(), e);
        }
    }

    public r j() throws IOException {
        return new b0(this.c, this.d.c());
    }
}
