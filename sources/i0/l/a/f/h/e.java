package i0.l.a.f.h;

import com.nimbusds.jose.JOSEException;
import i0.j.f.p.h;
import i0.l.a.g.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: ConcatKDF */
public class e {
    public final a a = new a();

    public e(String str) {
    }

    public static byte[] b(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        return h.T(h.f4(bArr.length), bArr);
    }

    public SecretKey a(SecretKey secretKey, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) throws JOSEException {
        MessageDigest messageDigest;
        int i2 = 1;
        byte[] T = h.T(bArr, bArr2, bArr3, bArr4, bArr5);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Provider provider = this.a.a;
        if (provider == null) {
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException e) {
                StringBuilder P0 = i0.d.a.a.a.P0("Couldn't get message digest for KDF: ");
                P0.append(e.getMessage());
                throw new JOSEException(P0.toString(), e);
            }
        } else {
            messageDigest = MessageDigest.getInstance("SHA-256", provider);
        }
        while (true) {
            int I3 = h.I3(messageDigest.getDigestLength());
            if (i2 > ((i + I3) - 1) / I3) {
                break;
            }
            messageDigest.update(h.f4(i2));
            messageDigest.update(secretKey.getEncoded());
            if (T != null) {
                messageDigest.update(T);
            }
            try {
                byteArrayOutputStream.write(messageDigest.digest());
                i2++;
            } catch (IOException e2) {
                throw new JOSEException(i0.d.a.a.a.V(e2, i0.d.a.a.a.P0("Couldn't write derived key: ")), e2);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int i3 = i / 8;
        if (byteArray.length == i3) {
            return new SecretKeySpec(byteArray, "AES");
        }
        return new SecretKeySpec(h.Y3(byteArray, 0, i3), "AES");
    }
}
