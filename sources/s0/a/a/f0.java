package s0.a.a;

import i0.d.a.a.a;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ParsingException;

public class f0 implements p {
    public x c;

    public f0(x xVar) {
        this.c = xVar;
    }

    public InputStream b() {
        return new m0(this.c);
    }

    public r c() {
        try {
            return j();
        } catch (IOException e) {
            throw new ASN1ParsingException(a.V(e, a.P0("IOException converting stream to byte array: ")), e);
        }
    }

    public r j() throws IOException {
        return new e0(s0.a.g.l.a.a(b()));
    }
}
