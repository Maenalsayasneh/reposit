package com.pubnub.api.vendor;

import com.pubnub.api.PubNubError;
import com.pubnub.api.PubNubException;
import com.pubnub.api.builder.PubNubErrorBuilder;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import s0.c.b;
import s0.c.c;

public class Crypto {
    private static final b log = c.e(Crypto.class);
    public boolean INIT;
    public String cipherKey;
    public boolean dynamicIV;
    public String initializationVector;
    public byte[] ivBytes;
    public byte[] keyBytes;

    public Crypto(String str) {
        this(str, false);
    }

    public static byte[] hexEncode(byte[] bArr) throws PubNubException {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        try {
            return stringBuffer.toString().getBytes(FileEncryptionUtil.ENCODING_UTF_8);
        } catch (UnsupportedEncodingException e) {
            throw PubNubException.builder().pubnubError(newCryptoError(12, e.toString())).errormsg(e.getMessage()).cause(e).build();
        }
    }

    public static byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
        }
        return bArr;
    }

    private void initCiphers() throws PubNubException {
        if (!this.INIT || this.dynamicIV) {
            try {
                this.keyBytes = new String(hexEncode(sha256(this.cipherKey.getBytes(FileEncryptionUtil.ENCODING_UTF_8))), FileEncryptionUtil.ENCODING_UTF_8).substring(0, 32).toLowerCase().getBytes(FileEncryptionUtil.ENCODING_UTF_8);
                if (this.dynamicIV) {
                    this.ivBytes = new byte[16];
                    new Random().nextBytes(this.ivBytes);
                    return;
                }
                this.ivBytes = this.initializationVector.getBytes(FileEncryptionUtil.ENCODING_UTF_8);
                this.INIT = true;
            } catch (UnsupportedEncodingException e) {
                throw PubNubException.builder().pubnubError(newCryptoError(11, e.toString())).errormsg(e.getMessage()).cause(e).build();
            }
        }
    }

    public static byte[] md5(String str) throws PubNubException {
        try {
            return MessageDigest.getInstance("MD5").digest(str.getBytes(FileEncryptionUtil.ENCODING_UTF_8));
        } catch (NoSuchAlgorithmException e) {
            throw PubNubException.builder().pubnubError(newCryptoError(118, e.toString())).errormsg(e.getMessage()).cause(e).build();
        } catch (UnsupportedEncodingException e2) {
            throw PubNubException.builder().pubnubError(newCryptoError(119, e2.toString())).errormsg(e2.getMessage()).cause(e2).build();
        }
    }

    private static PubNubError newCryptoError(int i, String str) {
        return PubNubErrorBuilder.createCryptoError(i, str);
    }

    public static byte[] sha256(byte[] bArr) throws PubNubException {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw PubNubException.builder().pubnubError(newCryptoError(111, e.toString())).errormsg(e.getMessage()).cause(e).build();
        }
    }

    public String decrypt(String str) throws PubNubException {
        byte[] bArr;
        try {
            initCiphers();
            if (this.dynamicIV) {
                byte[] decode = Base64.decode(str, 0);
                System.arraycopy(decode, 0, this.ivBytes, 0, 16);
                bArr = new byte[(decode.length - 16)];
                System.arraycopy(decode, 16, bArr, 0, decode.length - 16);
            } else {
                bArr = Base64.decode(str, 0);
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(this.ivBytes);
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.keyBytes, "AES");
            Cipher instance = Cipher.getInstance(FileEncryptionUtil.CIPHER_TRANSFORMATION);
            instance.init(2, secretKeySpec, ivParameterSpec);
            return new String(instance.doFinal(bArr), FileEncryptionUtil.ENCODING_UTF_8);
        } catch (IllegalArgumentException e) {
            throw PubNubException.builder().errormsg(e.toString()).cause(e).build();
        } catch (UnsupportedEncodingException e2) {
            throw PubNubException.builder().errormsg(e2.toString()).cause(e2).build();
        } catch (IllegalBlockSizeException e3) {
            throw PubNubException.builder().errormsg(e3.toString()).cause(e3).build();
        } catch (BadPaddingException e4) {
            throw PubNubException.builder().errormsg(e4.toString()).cause(e4).build();
        } catch (InvalidKeyException e5) {
            throw PubNubException.builder().errormsg(e5.toString()).cause(e5).build();
        } catch (InvalidAlgorithmParameterException e6) {
            throw PubNubException.builder().errormsg(e6.toString()).cause(e6).build();
        } catch (NoSuchAlgorithmException e7) {
            throw PubNubException.builder().errormsg(e7.toString()).cause(e7).build();
        } catch (NoSuchPaddingException e8) {
            throw PubNubException.builder().errormsg(e8.toString()).cause(e8).build();
        }
    }

    public String encrypt(String str) throws PubNubException {
        try {
            initCiphers();
            IvParameterSpec ivParameterSpec = new IvParameterSpec(this.ivBytes);
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.keyBytes, "AES");
            Cipher instance = Cipher.getInstance(FileEncryptionUtil.CIPHER_TRANSFORMATION);
            instance.init(1, secretKeySpec, ivParameterSpec);
            if (!this.dynamicIV) {
                return new String(Base64.encode(instance.doFinal(str.getBytes(FileEncryptionUtil.ENCODING_UTF_8)), 0), Charset.forName(FileEncryptionUtil.ENCODING_UTF_8));
            }
            byte[] doFinal = instance.doFinal(str.getBytes(FileEncryptionUtil.ENCODING_UTF_8));
            byte[] bArr = this.ivBytes;
            byte[] bArr2 = new byte[(bArr.length + doFinal.length)];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            System.arraycopy(doFinal, 0, bArr2, this.ivBytes.length, doFinal.length);
            return new String(Base64.encode(bArr2, 0), Charset.forName(FileEncryptionUtil.ENCODING_UTF_8));
        } catch (NoSuchAlgorithmException e) {
            throw PubNubException.builder().errormsg(e.toString()).cause(e).build();
        } catch (NoSuchPaddingException e2) {
            throw PubNubException.builder().errormsg(e2.toString()).cause(e2).build();
        } catch (InvalidKeyException e3) {
            throw PubNubException.builder().errormsg(e3.toString()).cause(e3).build();
        } catch (InvalidAlgorithmParameterException e4) {
            throw PubNubException.builder().errormsg(e4.toString()).cause(e4).build();
        } catch (UnsupportedEncodingException e5) {
            throw PubNubException.builder().errormsg(e5.toString()).cause(e5).build();
        } catch (IllegalBlockSizeException e6) {
            throw PubNubException.builder().errormsg(e6.toString()).cause(e6).build();
        } catch (BadPaddingException e7) {
            throw PubNubException.builder().errormsg(e7.toString()).cause(e7).build();
        }
    }

    public Crypto(String str, boolean z) {
        this.keyBytes = null;
        this.ivBytes = null;
        this.initializationVector = "0123456789012345";
        this.INIT = false;
        this.dynamicIV = false;
        this.cipherKey = str;
        this.dynamicIV = z;
    }

    public Crypto(String str, String str2) {
        this.keyBytes = null;
        this.ivBytes = null;
        this.initializationVector = "0123456789012345";
        this.INIT = false;
        this.dynamicIV = false;
        if (str2 != null) {
            this.initializationVector = str2;
        }
        this.cipherKey = str;
    }
}
