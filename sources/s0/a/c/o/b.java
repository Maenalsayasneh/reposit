package s0.a.c.o;

import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;

public class b implements c {
    public SecureRandom a(String str) throws NoSuchAlgorithmException {
        return SecureRandom.getInstance(str);
    }

    public MessageDigest b(String str) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(str);
    }

    public Cipher c(String str) throws NoSuchAlgorithmException, NoSuchPaddingException {
        return Cipher.getInstance(str);
    }

    public Signature createSignature(String str) throws NoSuchAlgorithmException {
        return Signature.getInstance(str);
    }

    public Mac d(String str) throws NoSuchAlgorithmException {
        return Mac.getInstance(str);
    }

    public CertificateFactory e(String str) throws CertificateException {
        return CertificateFactory.getInstance(str);
    }

    public AlgorithmParameters f(String str) throws NoSuchAlgorithmException {
        return AlgorithmParameters.getInstance(str);
    }

    public SecretKeyFactory g(String str) throws NoSuchAlgorithmException {
        return SecretKeyFactory.getInstance(str);
    }

    public KeyFactory h(String str) throws NoSuchAlgorithmException {
        return KeyFactory.getInstance(str);
    }
}
