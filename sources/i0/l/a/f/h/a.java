package i0.l.a.f.h;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyLengthException;
import com.pubnub.api.vendor.FileEncryptionUtil;
import i0.j.f.p.h;
import java.nio.ByteBuffer;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AESCBC */
public class a {
    public static Cipher a(SecretKey secretKey, boolean z, byte[] bArr, Provider provider) throws JOSEException {
        try {
            Cipher i1 = h.i1(FileEncryptionUtil.CIPHER_TRANSFORMATION, provider);
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getEncoded(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            if (z) {
                i1.init(1, secretKeySpec, ivParameterSpec);
            } else {
                i1.init(2, secretKeySpec, ivParameterSpec);
            }
            return i1;
        } catch (Exception e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public static byte[] b(SecretKey secretKey, byte[] bArr, byte[] bArr2, Provider provider) throws JOSEException {
        try {
            return a(secretKey, false, bArr, provider).doFinal(bArr2);
        } catch (Exception e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public static byte[] c(SecretKey secretKey, byte[] bArr, byte[] bArr2, Provider provider) throws JOSEException {
        try {
            return a(secretKey, true, bArr, provider).doFinal(bArr2);
        } catch (Exception e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public static b d(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider, Provider provider2) throws JOSEException {
        SecretKeySpec secretKeySpec;
        SecretKeySpec secretKeySpec2;
        byte[] encoded = secretKey.getEncoded();
        int i = 32;
        if (encoded.length == 32) {
            i = 16;
            secretKeySpec2 = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
            secretKeySpec = new SecretKeySpec(encoded, 16, 16, "AES");
        } else if (encoded.length == 48) {
            i = 24;
            secretKeySpec2 = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
            secretKeySpec = new SecretKeySpec(encoded, 24, 24, "AES");
        } else if (encoded.length == 64) {
            secretKeySpec2 = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
            secretKeySpec = new SecretKeySpec(encoded, 32, 32, "AES");
        } else {
            throw new KeyLengthException("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
        }
        byte[] c = c(secretKeySpec, bArr, bArr2, provider);
        byte[] R = h.R(bArr3);
        return new b(c, Arrays.copyOf(h.N(secretKeySpec2, ByteBuffer.allocate(bArr3.length + bArr.length + c.length + R.length).put(bArr3).put(bArr).put(c).put(R).array(), provider2), i));
    }

    public static byte[] e(byte[] bArr) throws JOSEException {
        byte[] bArr2;
        int length = bArr.length / 2;
        int i = length;
        while (i > 0 && bArr[length - i] == 0) {
            i--;
        }
        int i2 = length - i;
        int i3 = bArr[i2] < 0 ? i + 1 : i;
        int i4 = length;
        while (i4 > 0 && bArr[(length * 2) - i4] == 0) {
            i4--;
        }
        int i5 = (length * 2) - i4;
        int i6 = bArr[i5] < 0 ? i4 + 1 : i4;
        int X = i0.d.a.a.a.X(i3, 2, 2, i6);
        if (X <= 255) {
            int i7 = 1;
            if (X < 128) {
                bArr2 = new byte[i0.d.a.a.a.X(i3, 4, 2, i6)];
            } else {
                bArr2 = new byte[i0.d.a.a.a.X(i3, 5, 2, i6)];
                bArr2[1] = -127;
                i7 = 2;
            }
            bArr2[0] = 48;
            int i8 = i7 + 1;
            bArr2[i7] = (byte) X;
            int i9 = i8 + 1;
            bArr2[i8] = 2;
            bArr2[i9] = (byte) i3;
            int i10 = i9 + 1 + i3;
            System.arraycopy(bArr, i2, bArr2, i10 - i, i);
            int i11 = i10 + 1;
            bArr2[i10] = 2;
            bArr2[i11] = (byte) i6;
            System.arraycopy(bArr, i5, bArr2, ((i11 + 1) + i6) - i4, i4);
            return bArr2;
        }
        throw new JOSEException("Invalid ECDSA signature format");
    }
}
