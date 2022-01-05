package s0.a.a;

import i0.d.a.a.a;
import java.io.IOException;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1ParsingException;
import s0.a.e.b.b0.c.h3;

public abstract class b extends r implements y {
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] d;
    public final int q;

    public b(byte[] bArr, int i) {
        Objects.requireNonNull(bArr, "'data' cannot be null");
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        } else if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        } else {
            this.d = h3.I(bArr);
            this.q = i;
        }
    }

    public r A() {
        return new k1(this.d, this.q);
    }

    public byte[] B() {
        byte[] bArr = this.d;
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] I = h3.I(bArr);
        int length = this.d.length - 1;
        I[length] = (byte) (I[length] & (255 << this.q));
        return I;
    }

    public byte[] C() {
        if (this.q == 0) {
            return h3.I(this.d);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
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
        } catch (IOException e) {
            throw new ASN1ParsingException(a.V(e, a.P0("Internal error encoding BitString: ")), e);
        }
    }

    public int hashCode() {
        byte[] bArr = this.d;
        int length = bArr.length - 1;
        if (length < 0) {
            return 1;
        }
        byte b = (byte) (bArr[length] & (255 << this.q));
        int i = 0;
        if (bArr != null) {
            int i2 = length + 1;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i2 = (i2 * 257) ^ bArr[0 + length];
            }
            i = i2;
        }
        return ((i * 257) ^ b) ^ this.q;
    }

    public boolean s(r rVar) {
        if (!(rVar instanceof b)) {
            return false;
        }
        b bVar = (b) rVar;
        if (this.q != bVar.q) {
            return false;
        }
        byte[] bArr = this.d;
        byte[] bArr2 = bVar.d;
        int length = bArr.length;
        if (length != bArr2.length) {
            return false;
        }
        int i = length - 1;
        if (i < 0) {
            return true;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        byte b = bArr[i];
        int i3 = this.q;
        return ((byte) (b & (255 << i3))) == ((byte) (bArr2[i] & (255 << i3)));
    }

    public String toString() {
        return e();
    }

    public r z() {
        return new o0(this.d, this.q);
    }
}
