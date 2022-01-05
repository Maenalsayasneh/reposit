package s0.a.a;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

public class j0 implements w {
    public x c;

    public j0(x xVar) {
        this.c = xVar;
    }

    public r c() {
        try {
            return j();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage(), e);
        }
    }

    public r j() throws IOException {
        return new i0(this.c.c());
    }
}
