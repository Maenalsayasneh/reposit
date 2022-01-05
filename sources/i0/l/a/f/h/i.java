package i0.l.a.f.h;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import i0.d.a.a.a;
import i0.j.f.p.h;
import i0.l.a.j.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: LegacyConcatKDF */
public class i {
    public static final byte[] a = {0, 0, 0, 1};
    public static final byte[] b = {0, 0, 0, 0};
    public static final byte[] c = {69, 110, 99, 114, 121, 112, 116, 105, 111, 110};
    public static final byte[] d = {73, 110, 116, 101, 103, 114, 105, 116, 121};

    public static SecretKey a(SecretKey secretKey, EncryptionMethod encryptionMethod, byte[] bArr, byte[] bArr2) throws JOSEException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(h.f4(length / 2));
            byteArrayOutputStream.write(encryptionMethod.d.getBytes(c.a));
            if (bArr != null) {
                byteArrayOutputStream.write(h.f4(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(b);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(h.f4(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(b);
            }
            byteArrayOutputStream.write(c);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byte[] digest = MessageDigest.getInstance("SHA-" + length).digest(byteArray);
                int length2 = digest.length / 2;
                byte[] bArr3 = new byte[length2];
                System.arraycopy(digest, 0, bArr3, 0, length2);
                return new SecretKeySpec(bArr3, "AES");
            } catch (NoSuchAlgorithmException e) {
                throw new JOSEException(e.getMessage(), e);
            }
        } catch (IOException e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }

    public static SecretKey b(SecretKey secretKey, EncryptionMethod encryptionMethod, byte[] bArr, byte[] bArr2) throws JOSEException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(h.f4(length));
            byteArrayOutputStream.write(encryptionMethod.d.getBytes(c.a));
            if (bArr != null) {
                byteArrayOutputStream.write(h.f4(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(b);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(h.f4(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(b);
            }
            byteArrayOutputStream.write(d);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                return new SecretKeySpec(MessageDigest.getInstance("SHA-" + length).digest(byteArray), a.e0("HMACSHA", length));
            } catch (NoSuchAlgorithmException e) {
                throw new JOSEException(e.getMessage(), e);
            }
        } catch (IOException e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }
}
