package i0.l.a.f;

import com.nimbusds.jose.CompressionAlgorithm;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.util.Base64URL;
import i0.l.a.b;
import i0.l.a.f.h.f;
import i0.l.a.f.h.g;
import i0.l.a.f.h.h;
import i0.l.a.f.h.i;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.InvalidCipherTextException;
import s0.a.b.i0.n;

/* compiled from: DirectDecrypter */
public class a extends h implements b {
    public final g a = new g();

    public a(byte[] bArr) throws KeyLengthException {
        super(new SecretKeySpec(bArr, "AES"));
    }

    public byte[] a(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) throws JOSEException {
        byte[] bArr;
        SecretKeySpec secretKeySpec;
        SecretKeySpec secretKeySpec2;
        Cipher cipher;
        JWEAlgorithm jWEAlgorithm = (JWEAlgorithm) jWEHeader.d;
        if (!jWEAlgorithm.equals(JWEAlgorithm.b2)) {
            throw new JOSEException(i0.j.f.p.h.x4(jWEAlgorithm, h.SUPPORTED_ALGORITHMS));
        } else if (base64URL != null) {
            throw new JOSEException("Unexpected present JWE encrypted key");
        } else if (base64URL2 == null) {
            throw new JOSEException("Unexpected present JWE initialization vector (IV)");
        } else if (base64URL4 == null) {
            throw new JOSEException("Missing JWE authentication tag");
        } else if (this.a.a(jWEHeader)) {
            SecretKey key = getKey();
            i0.l.a.g.b jCAContext = getJCAContext();
            Set<EncryptionMethod> set = f.a;
            f.a(key, jWEHeader.i2);
            byte[] bytes = jWEHeader.b().c.getBytes(StandardCharsets.US_ASCII);
            if (jWEHeader.i2.equals(EncryptionMethod.q) || jWEHeader.i2.equals(EncryptionMethod.x) || jWEHeader.i2.equals(EncryptionMethod.y)) {
                byte[] a2 = base64URL2.a();
                byte[] a3 = base64URL3.a();
                byte[] a4 = base64URL4.a();
                Provider b = jCAContext.b();
                Provider d = jCAContext.d();
                byte[] encoded = key.getEncoded();
                int i = 32;
                if (encoded.length == 32) {
                    i = 16;
                    secretKeySpec = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
                    secretKeySpec2 = new SecretKeySpec(encoded, 16, 16, "AES");
                } else if (encoded.length == 48) {
                    i = 24;
                    secretKeySpec = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
                    secretKeySpec2 = new SecretKeySpec(encoded, 24, 24, "AES");
                } else if (encoded.length == 64) {
                    secretKeySpec = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
                    secretKeySpec2 = new SecretKeySpec(encoded, 32, 32, "AES");
                } else {
                    throw new KeyLengthException("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
                }
                byte[] R = i0.j.f.p.h.R(bytes);
                if (i0.j.f.p.h.o(Arrays.copyOf(i0.j.f.p.h.N(secretKeySpec, ByteBuffer.allocate(bytes.length + a2.length + a3.length + R.length).put(bytes).put(a2).put(a3).put(R).array(), d), i), a4)) {
                    bArr = i0.l.a.f.h.a.b(secretKeySpec2, a2, a3, b);
                } else {
                    throw new JOSEException("MAC check failed");
                }
            } else {
                SecretKeySpec secretKeySpec3 = null;
                if (jWEHeader.i2.equals(EncryptionMethod.a2) || jWEHeader.i2.equals(EncryptionMethod.b2) || jWEHeader.i2.equals(EncryptionMethod.c2)) {
                    byte[] a5 = base64URL2.a();
                    byte[] a6 = base64URL3.a();
                    byte[] a7 = base64URL4.a();
                    Provider b2 = jCAContext.b();
                    if (key != null) {
                        secretKeySpec3 = new SecretKeySpec(key.getEncoded(), "AES");
                    }
                    if (b2 != null) {
                        try {
                            cipher = Cipher.getInstance("AES/GCM/NoPadding", b2);
                        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
                            StringBuilder P0 = i0.d.a.a.a.P0("Couldn't create AES/GCM/NoPadding cipher: ");
                            P0.append(e.getMessage());
                            throw new JOSEException(P0.toString(), e);
                        } catch (NoClassDefFoundError unused) {
                            n b0 = i0.j.f.p.h.b0(secretKeySpec3, false, a5, bytes);
                            int length = a6.length + a7.length;
                            byte[] bArr2 = new byte[length];
                            System.arraycopy(a6, 0, bArr2, 0, a6.length);
                            System.arraycopy(a7, 0, bArr2, a6.length, a7.length);
                            byte[] bArr3 = new byte[b0.getOutputSize(length)];
                            try {
                                b0.doFinal(bArr3, b0.processBytes(bArr2, 0, length, bArr3, 0));
                                bArr = bArr3;
                            } catch (InvalidCipherTextException e2) {
                                StringBuilder P02 = i0.d.a.a.a.P0("Couldn't validate GCM authentication tag: ");
                                P02.append(e2.getMessage());
                                throw new JOSEException(P02.toString(), e2);
                            }
                        }
                    } else {
                        cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    }
                    cipher.init(2, secretKeySpec3, new GCMParameterSpec(128, a5));
                    cipher.updateAAD(bytes);
                    try {
                        bArr = cipher.doFinal(i0.j.f.p.h.T(a6, a7));
                    } catch (BadPaddingException | IllegalBlockSizeException e3) {
                        StringBuilder P03 = i0.d.a.a.a.P0("AES/GCM/NoPadding decryption failed: ");
                        P03.append(e3.getMessage());
                        throw new JOSEException(P03.toString(), e3);
                    }
                } else if (jWEHeader.i2.equals(EncryptionMethod.Y1) || jWEHeader.i2.equals(EncryptionMethod.Z1)) {
                    jCAContext.b();
                    i.b(key, jWEHeader.i2, jWEHeader.Y1.get("epu") instanceof String ? new Base64URL((String) jWEHeader.Y1.get("epu")).a() : null, jWEHeader.Y1.get("epv") instanceof String ? new Base64URL((String) jWEHeader.Y1.get("epv")).a() : null);
                    StringBuilder sb = new StringBuilder();
                    sb.append(jWEHeader.b().c);
                    sb.append(".");
                    throw null;
                } else {
                    throw new JOSEException(i0.j.f.p.h.w4(jWEHeader.i2, f.a));
                }
            }
            CompressionAlgorithm compressionAlgorithm = jWEHeader.k2;
            if (compressionAlgorithm == null) {
                return bArr;
            }
            if (compressionAlgorithm.equals(CompressionAlgorithm.c)) {
                try {
                    return i0.j.f.p.h.v0(bArr);
                } catch (Exception e4) {
                    throw new JOSEException(i0.d.a.a.a.a0(e4, i0.d.a.a.a.P0("Couldn't decompress plain text: ")), e4);
                }
            } else {
                throw new JOSEException("Unsupported compression algorithm: " + compressionAlgorithm);
            }
        } else {
            throw new JOSEException("Unsupported critical header parameter(s)");
        }
    }
}
