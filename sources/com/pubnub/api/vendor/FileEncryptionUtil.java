package com.pubnub.api.vendor;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.PubNubUtil;
import i0.d.a.a.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class FileEncryptionUtil {
    public static final int BUFFER_SIZE_BYTES = 8192;
    public static final String CIPHER_TRANSFORMATION = "AES/CBC/PKCS5Padding";
    public static final String ENCODING_UTF_8 = "UTF-8";
    private static final int IV_SIZE_BYTES = 16;

    public static class IvAndData {
        public final byte[] dataToDecrypt;
        public final byte[] ivBytes;

        public IvAndData(byte[] bArr, byte[] bArr2) {
            this.ivBytes = bArr;
            this.dataToDecrypt = bArr2;
        }

        public boolean canEqual(Object obj) {
            return obj instanceof IvAndData;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IvAndData)) {
                return false;
            }
            IvAndData ivAndData = (IvAndData) obj;
            return ivAndData.canEqual(this) && Arrays.equals(getIvBytes(), ivAndData.getIvBytes()) && Arrays.equals(getDataToDecrypt(), ivAndData.getDataToDecrypt());
        }

        public byte[] getDataToDecrypt() {
            return this.dataToDecrypt;
        }

        public byte[] getIvBytes() {
            return this.ivBytes;
        }

        public int hashCode() {
            return Arrays.hashCode(getDataToDecrypt()) + ((Arrays.hashCode(getIvBytes()) + 59) * 59);
        }

        public String toString() {
            StringBuilder P0 = a.P0("FileEncryptionUtil.IvAndData(ivBytes=");
            P0.append(Arrays.toString(getIvBytes()));
            P0.append(", dataToDecrypt=");
            P0.append(Arrays.toString(getDataToDecrypt()));
            P0.append(")");
            return P0.toString();
        }
    }

    private FileEncryptionUtil() {
    }

    private static Cipher cipher(byte[] bArr, byte[] bArr2, int i) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher instance = Cipher.getInstance(CIPHER_TRANSFORMATION);
        instance.init(i, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
        return instance;
    }

    public static InputStream decrypt(String str, InputStream inputStream) throws PubNubException {
        try {
            byte[] keyBytes = keyBytes(str);
            IvAndData loadIvAndDataFromInputStream = loadIvAndDataFromInputStream(inputStream);
            return new ByteArrayInputStream(decryptionCipher(keyBytes, loadIvAndDataFromInputStream.ivBytes).doFinal(loadIvAndDataFromInputStream.dataToDecrypt));
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw PubNubException.builder().errormsg(e.toString()).cause(e).build();
        }
    }

    private static Cipher decryptionCipher(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {
        return cipher(bArr, bArr2, 2);
    }

    public static String effectiveCipherKey(PubNub pubNub, String str) {
        if (str != null) {
            return str;
        }
        if (pubNub.getConfiguration().getCipherKey() != null) {
            return pubNub.getConfiguration().getCipherKey();
        }
        return null;
    }

    public static InputStream encrypt(String str, InputStream inputStream) throws PubNubException {
        try {
            return new ByteArrayInputStream(encryptToBytes(str, PubNubUtil.readBytes(inputStream)));
        } catch (IOException e) {
            throw PubNubException.builder().errormsg(e.getMessage()).cause(e).build();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] encryptToBytes(java.lang.String r2, byte[] r3) throws com.pubnub.api.PubNubException {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ NoSuchAlgorithmException -> 0x003b, InvalidAlgorithmParameterException -> 0x0039, NoSuchPaddingException -> 0x0037, InvalidKeyException -> 0x0035, IOException -> 0x0033, BadPaddingException -> 0x0031, IllegalBlockSizeException -> 0x002f }
            r0.<init>()     // Catch:{ NoSuchAlgorithmException -> 0x003b, InvalidAlgorithmParameterException -> 0x0039, NoSuchPaddingException -> 0x0037, InvalidKeyException -> 0x0035, IOException -> 0x0033, BadPaddingException -> 0x0031, IllegalBlockSizeException -> 0x002f }
            byte[] r2 = keyBytes(r2)     // Catch:{ all -> 0x0023 }
            byte[] r1 = randomIv()     // Catch:{ all -> 0x0023 }
            javax.crypto.Cipher r2 = encryptionCipher(r2, r1)     // Catch:{ all -> 0x0023 }
            r0.write(r1)     // Catch:{ all -> 0x0023 }
            byte[] r2 = r2.doFinal(r3)     // Catch:{ all -> 0x0023 }
            r0.write(r2)     // Catch:{ all -> 0x0023 }
            byte[] r2 = r0.toByteArray()     // Catch:{ all -> 0x0023 }
            r0.close()     // Catch:{ NoSuchAlgorithmException -> 0x003b, InvalidAlgorithmParameterException -> 0x0039, NoSuchPaddingException -> 0x0037, InvalidKeyException -> 0x0035, IOException -> 0x0033, BadPaddingException -> 0x0031, IllegalBlockSizeException -> 0x002f }
            return r2
        L_0x0023:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r3 = move-exception
            r0.close()     // Catch:{ all -> 0x002a }
            goto L_0x002e
        L_0x002a:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ NoSuchAlgorithmException -> 0x003b, InvalidAlgorithmParameterException -> 0x0039, NoSuchPaddingException -> 0x0037, InvalidKeyException -> 0x0035, IOException -> 0x0033, BadPaddingException -> 0x0031, IllegalBlockSizeException -> 0x002f }
        L_0x002e:
            throw r3     // Catch:{ NoSuchAlgorithmException -> 0x003b, InvalidAlgorithmParameterException -> 0x0039, NoSuchPaddingException -> 0x0037, InvalidKeyException -> 0x0035, IOException -> 0x0033, BadPaddingException -> 0x0031, IllegalBlockSizeException -> 0x002f }
        L_0x002f:
            r2 = move-exception
            goto L_0x003c
        L_0x0031:
            r2 = move-exception
            goto L_0x003c
        L_0x0033:
            r2 = move-exception
            goto L_0x003c
        L_0x0035:
            r2 = move-exception
            goto L_0x003c
        L_0x0037:
            r2 = move-exception
            goto L_0x003c
        L_0x0039:
            r2 = move-exception
            goto L_0x003c
        L_0x003b:
            r2 = move-exception
        L_0x003c:
            com.pubnub.api.PubNubException$PubNubExceptionBuilder r3 = com.pubnub.api.PubNubException.builder()
            java.lang.String r2 = r2.toString()
            com.pubnub.api.PubNubException$PubNubExceptionBuilder r2 = r3.errormsg(r2)
            com.pubnub.api.PubNubException r2 = r2.build()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pubnub.api.vendor.FileEncryptionUtil.encryptToBytes(java.lang.String, byte[]):byte[]");
    }

    private static Cipher encryptionCipher(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {
        return cipher(bArr, bArr2, 1);
    }

    private static byte[] keyBytes(String str) throws UnsupportedEncodingException, PubNubException {
        return new String(Crypto.hexEncode(Crypto.sha256(str.getBytes(ENCODING_UTF_8))), ENCODING_UTF_8).substring(0, 32).toLowerCase().getBytes(ENCODING_UTF_8);
    }

    private static IvAndData loadIvAndDataFromInputStream(InputStream inputStream) throws IOException {
        int read;
        byte[] bArr = new byte[16];
        int i = 0;
        do {
            read = inputStream.read(bArr, i, 16 - i);
            if (read != -1) {
                i += read;
            }
            if (read == -1) {
                break;
            }
        } while (i < 16);
        if (read != -1) {
            return new IvAndData(bArr, PubNubUtil.readBytes(inputStream));
        }
        throw new IOException("EOF before IV fully read");
    }

    private static byte[] randomIv() throws NoSuchAlgorithmException {
        byte[] bArr = new byte[16];
        SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
        return bArr;
    }
}
