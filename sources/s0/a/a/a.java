package s0.a.a;

import java.io.IOException;
import java.util.Arrays;
import s0.a.e.b.b0.c.h3;
import s0.a.g.k.d;

public abstract class a extends r {
    public final boolean c;
    public final int d;
    public final byte[] q;

    public a(boolean z, int i, byte[] bArr) {
        this.c = z;
        this.d = i;
        this.q = h3.I(bArr);
    }

    public static a B(Object obj) {
        if (obj == null || (obj instanceof a)) {
            return (a) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return B(r.x((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException(i0.d.a.a.a.V(e, i0.d.a.a.a.P0("Failed to construct object from byte[]: ")));
            }
        } else {
            throw new IllegalArgumentException(i0.d.a.a.a.c0(obj, i0.d.a.a.a.P0("unknown object in getInstance: ")));
        }
    }

    public r C(int i) throws IOException {
        int i2;
        if (i < 31) {
            byte[] encoded = getEncoded();
            if ((encoded[0] & 31) == 31) {
                i2 = 2;
                byte b = encoded[1] & 255;
                if ((b & Byte.MAX_VALUE) != 0) {
                    while ((b & 128) != 0) {
                        b = encoded[i2] & 255;
                        i2++;
                    }
                } else {
                    throw new IOException("corrupted stream - invalid high tag number found");
                }
            } else {
                i2 = 1;
            }
            int length = (encoded.length - i2) + 1;
            byte[] bArr = new byte[length];
            System.arraycopy(encoded, i2, bArr, 1, length - 1);
            bArr[0] = (byte) i;
            if ((encoded[0] & 32) != 0) {
                bArr[0] = (byte) (bArr[0] | 32);
            }
            return r.x(bArr);
        }
        throw new IOException("unsupported tag number");
    }

    public int hashCode() {
        return (this.c ^ this.d) ^ h3.m1(this.q) ? 1 : 0;
    }

    public boolean s(r rVar) {
        if (!(rVar instanceof a)) {
            return false;
        }
        a aVar = (a) rVar;
        return this.c == aVar.c && this.d == aVar.d && Arrays.equals(this.q, aVar.q);
    }

    public void t(q qVar, boolean z) throws IOException {
        qVar.f(z, this.c ? 96 : 64, this.d, this.q);
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (this.c) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(this.d));
        stringBuffer.append("]");
        if (this.q != null) {
            stringBuffer.append(" #");
            str = d.f(this.q);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }

    public int u() throws IOException {
        return a2.a(this.q.length) + a2.b(this.d) + this.q.length;
    }

    public boolean y() {
        return this.c;
    }
}
