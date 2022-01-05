package s0.a.a;

import i0.d.a.a.a;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ParsingException;

public class y0 implements p {
    public u1 c;

    public y0(u1 u1Var) {
        this.c = u1Var;
    }

    public InputStream b() {
        return this.c;
    }

    public r c() {
        try {
            return new x0(this.c.b());
        } catch (IOException e) {
            throw new ASN1ParsingException(a.V(e, a.P0("IOException converting stream to byte array: ")), e);
        }
    }

    public r j() throws IOException {
        return new x0(this.c.b());
    }
}
