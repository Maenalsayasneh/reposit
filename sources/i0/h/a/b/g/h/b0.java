package i0.h.a.b.g.h;

import com.google.android.gms.internal.recaptcha.zzeo;
import com.pubnub.api.vendor.FileEncryptionUtil;
import i0.h.a.b.g.h.z;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class b0 {
    public static final Charset a = Charset.forName(FileEncryptionUtil.ENCODING_UTF_8);
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        int i = length + 0;
        if (length < 0) {
            throw new zzeo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else if ((0 - 0) + length <= Integer.MAX_VALUE) {
            int i2 = i + 0 + 0;
        } else {
            try {
                throw new zzeo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            } catch (zzeo e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static Object b(Object obj, Object obj2) {
        return ((z.b) ((m) ((y0) obj).c()).e((y0) obj2)).g();
    }
}
