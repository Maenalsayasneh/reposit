package s0.a.a;

import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.asn1.ASN1ParsingException;
import s0.a.e.b.b0.c.h3;

public class g1 extends r implements y {
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] d;

    public g1(byte[] bArr) {
        this.d = h3.I(bArr);
    }

    public String e() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            for (int i = 0; i != encoded.length; i++) {
                char[] cArr = c;
                stringBuffer.append(cArr[(encoded[i] >>> 4) & 15]);
                stringBuffer.append(cArr[encoded[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new ASN1ParsingException("internal error encoding UniversalString");
        }
    }

    public int hashCode() {
        return h3.m1(this.d);
    }

    public boolean s(r rVar) {
        if (!(rVar instanceof g1)) {
            return false;
        }
        return Arrays.equals(this.d, ((g1) rVar).d);
    }

    public void t(q qVar, boolean z) throws IOException {
        qVar.g(z, 28, this.d);
    }

    public String toString() {
        return e();
    }

    public int u() {
        return a2.a(this.d.length) + 1 + this.d.length;
    }

    public boolean y() {
        return false;
    }
}
