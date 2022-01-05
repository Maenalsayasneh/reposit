package s0.a.a;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import org.bouncycastle.asn1.ASN1ParsingException;

public class x1 implements Enumeration {
    public j a;
    public Object b = a();

    public x1(byte[] bArr) {
        this.a = new j(bArr, true);
    }

    public final Object a() {
        try {
            return this.a.i();
        } catch (IOException e) {
            throw new ASN1ParsingException("malformed DER construction: " + e, e);
        }
    }

    public boolean hasMoreElements() {
        return this.b != null;
    }

    public Object nextElement() {
        Object obj = this.b;
        if (obj != null) {
            this.b = a();
            return obj;
        }
        throw new NoSuchElementException();
    }
}
