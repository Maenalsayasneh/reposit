package s0.a.a;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Exception;
import org.bouncycastle.asn1.ASN1ParsingException;

public class q0 implements e, v1 {
    public x c;

    public q0(x xVar) {
        this.c = xVar;
    }

    public r c() {
        try {
            return j();
        } catch (IOException e) {
            throw new ASN1ParsingException("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new ASN1ParsingException("unable to get DER object", e2);
        }
    }

    public r j() throws IOException {
        try {
            return new l1(this.c.c());
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception(e.getMessage(), e);
        }
    }
}
