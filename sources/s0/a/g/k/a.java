package s0.a.g.k;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.util.encoders.DecoderException;

public class a {
    public static final c a = new b();

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            a.a(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException(i0.d.a.a.a.a0(e, i0.d.a.a.a.P0("unable to decode base64 string: ")), e);
        }
    }
}
