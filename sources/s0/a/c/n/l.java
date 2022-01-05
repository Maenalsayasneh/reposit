package s0.a.c.n;

import java.security.spec.EncodedKeySpec;

public class l extends EncodedKeySpec {
    public final String c;

    public l(byte[] bArr) {
        super(bArr);
        String str;
        if (bArr[0] == 48) {
            str = "ASN.1";
        } else if (bArr[0] == 111) {
            str = "OpenSSH";
        } else {
            throw new IllegalArgumentException("unknown byte encoding");
        }
        this.c = str;
    }

    public String getFormat() {
        return this.c;
    }
}
