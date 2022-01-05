package s0.a.a;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

public class r1 implements w {
    public x c;

    public r1(x xVar) {
        this.c = xVar;
    }

    public r c() {
        try {
            return new q1(this.c.c());
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage(), e);
        }
    }

    public r j() throws IOException {
        return new q1(this.c.c());
    }
}
