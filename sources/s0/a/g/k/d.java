package s0.a.g.k;

import i0.d.a.a.a;
import java.io.ByteArrayOutputStream;
import org.bouncycastle.util.encoders.DecoderException;
import org.bouncycastle.util.encoders.EncoderException;
import s0.a.g.j;

public class d {
    public static final e a = new e();

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.a(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException(a.a0(e, a.P0("exception decoding Hex string: ")), e);
        }
    }

    public static byte[] b(String str) {
        try {
            return a.c(str, 0, str.length());
        } catch (Exception e) {
            throw new DecoderException(a.a0(e, a.P0("exception decoding Hex string: ")), e);
        }
    }

    public static byte[] c(String str, int i, int i2) {
        try {
            return a.c(str, i, i2);
        } catch (Exception e) {
            throw new DecoderException(a.a0(e, a.P0("exception decoding Hex string: ")), e);
        }
    }

    public static byte[] d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static byte[] e(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.b(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new EncoderException(a.a0(e, a.P0("exception encoding Hex string: ")), e);
        }
    }

    public static String f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static String g(byte[] bArr, int i, int i2) {
        return j.a(e(bArr, i, i2));
    }
}
