package org.bouncycastle.jcajce.provider.keystore.bcfks;

import i0.d.a.a.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAKey;
import java.security.interfaces.RSAKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.bouncycastle.jcajce.BCFKSLoadStoreParameter;
import s0.a.a.c2.d;
import s0.a.a.c2.e;
import s0.a.a.c2.i;
import s0.a.a.c3.b;
import s0.a.a.c3.y0;
import s0.a.a.d3.m;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.v0;
import s0.a.a.w2.f;
import s0.a.a.w2.g;
import s0.a.a.w2.h;
import s0.a.a.w2.k;
import s0.a.a.w2.l;
import s0.a.a.w2.p;
import s0.a.b.b0.a0;
import s0.a.b.b0.z;
import s0.a.b.f0.v;
import s0.a.b.t;
import s0.a.c.o.c;
import s0.a.e.b.b0.c.h3;
import s0.a.g.j;

public class BcFKSKeyStoreSpi extends KeyStoreSpi {
    private static final BigInteger CERTIFICATE = BigInteger.valueOf(0);
    private static final BigInteger PRIVATE_KEY = BigInteger.valueOf(1);
    private static final BigInteger PROTECTED_PRIVATE_KEY = BigInteger.valueOf(3);
    private static final BigInteger PROTECTED_SECRET_KEY = BigInteger.valueOf(4);
    private static final BigInteger SECRET_KEY = BigInteger.valueOf(2);
    private static final Map<String, n> oidMap;
    private static final Map<n, String> publicAlgMap;
    private Date creationDate;
    private final Map<String, e> entries = new HashMap();
    private final c helper;
    private b hmacAlgorithm;
    private h hmacPkbdAlgorithm;
    private Date lastModifiedDate;
    private final Map<String, PrivateKey> privateKeyCache = new HashMap();
    private b signatureAlgorithm;
    private n storeEncryptionAlgorithm = s0.a.a.r2.b.P;
    private BCFKSLoadStoreParameter.a validator;
    private PublicKey verificationKey;

    public static class Def extends BcFKSKeyStoreSpi {
        public Def() {
            super(new s0.a.c.o.b());
        }

        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return BcFKSKeyStoreSpi.super.engineAliases();
        }

        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return BcFKSKeyStoreSpi.super.engineContainsAlias(str);
        }

        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineDeleteEntry(str);
        }

        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCertificate(str);
        }

        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return BcFKSKeyStoreSpi.super.engineGetCertificateAlias(certificate);
        }

        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCertificateChain(str);
        }

        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCreationDate(str);
        }

        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return BcFKSKeyStoreSpi.super.engineGetKey(str, cArr);
        }

        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return BcFKSKeyStoreSpi.super.engineIsCertificateEntry(str);
        }

        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return BcFKSKeyStoreSpi.super.engineIsKeyEntry(str);
        }

        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            BcFKSKeyStoreSpi.super.engineLoad(inputStream, cArr);
        }

        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            BcFKSKeyStoreSpi.super.engineLoad(loadStoreParameter);
        }

        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineSetCertificateEntry(str, certificate);
        }

        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        public /* bridge */ /* synthetic */ int engineSize() {
            return BcFKSKeyStoreSpi.super.engineSize();
        }

        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            BcFKSKeyStoreSpi.super.engineStore(outputStream, cArr);
        }

        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            BcFKSKeyStoreSpi.super.engineStore(loadStoreParameter);
        }
    }

    public static class DefShared extends SharedKeyStoreSpi {
        public DefShared() {
            super(new s0.a.c.o.b());
        }

        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return BcFKSKeyStoreSpi.super.engineAliases();
        }

        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return BcFKSKeyStoreSpi.super.engineContainsAlias(str);
        }

        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCertificate(str);
        }

        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return BcFKSKeyStoreSpi.super.engineGetCertificateAlias(certificate);
        }

        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCertificateChain(str);
        }

        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCreationDate(str);
        }

        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return BcFKSKeyStoreSpi.super.engineIsCertificateEntry(str);
        }

        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return BcFKSKeyStoreSpi.super.engineIsKeyEntry(str);
        }

        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            BcFKSKeyStoreSpi.super.engineLoad(inputStream, cArr);
        }

        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            BcFKSKeyStoreSpi.super.engineLoad(loadStoreParameter);
        }

        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        public /* bridge */ /* synthetic */ int engineSize() {
            return BcFKSKeyStoreSpi.super.engineSize();
        }

        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            BcFKSKeyStoreSpi.super.engineStore(outputStream, cArr);
        }

        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            BcFKSKeyStoreSpi.super.engineStore(loadStoreParameter);
        }
    }

    public static class ExtKeyStoreException extends KeyStoreException {
        private final Throwable cause;

        public ExtKeyStoreException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        public Throwable getCause() {
            return this.cause;
        }
    }

    public static class SharedKeyStoreSpi extends BcFKSKeyStoreSpi implements s0.a.a.w2.n, y0 {
        private final Map<String, byte[]> cache;
        private final byte[] seedKey;

        public SharedKeyStoreSpi(c cVar) {
            super(cVar);
            try {
                byte[] bArr = new byte[32];
                this.seedKey = bArr;
                cVar.a("DEFAULT").nextBytes(bArr);
                this.cache = new HashMap();
            } catch (GeneralSecurityException e) {
                StringBuilder P0 = a.P0("can't create random - ");
                P0.append(e.toString());
                throw new IllegalArgumentException(P0.toString());
            }
        }

        private byte[] calculateMac(String str, char[] cArr) throws NoSuchAlgorithmException, InvalidKeyException {
            byte[] bArr;
            if (cArr != null) {
                bArr = h3.R(j.f(cArr), j.f(str.toCharArray()));
            } else {
                byte[] bArr2 = this.seedKey;
                String str2 = j.a;
                bArr = h3.R(bArr2, j.f(str.toCharArray()));
            }
            return m0.r.t.a.r.m.a1.a.B1(bArr, this.seedKey, 16384, 8, 1, 32);
        }

        public void engineDeleteEntry(String str) throws KeyStoreException {
            throw new KeyStoreException("delete operation not supported in shared mode");
        }

        public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            try {
                byte[] calculateMac = calculateMac(str, cArr);
                if (!this.cache.containsKey(str) || h3.U(this.cache.get(str), calculateMac)) {
                    Key engineGetKey = BcFKSKeyStoreSpi.super.engineGetKey(str, cArr);
                    if (engineGetKey != null && !this.cache.containsKey(str)) {
                        this.cache.put(str, calculateMac);
                    }
                    return engineGetKey;
                }
                throw new UnrecoverableKeyException(a.o0("unable to recover key (", str, ")"));
            } catch (InvalidKeyException e) {
                StringBuilder T0 = a.T0("unable to recover key (", str, "): ");
                T0.append(e.getMessage());
                throw new UnrecoverableKeyException(T0.toString());
            }
        }

        public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in shared mode");
        }

        public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in shared mode");
        }

        public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in shared mode");
        }
    }

    public static class Std extends BcFKSKeyStoreSpi {
        public Std() {
            super(new s0.a.c.o.a());
        }

        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return BcFKSKeyStoreSpi.super.engineAliases();
        }

        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return BcFKSKeyStoreSpi.super.engineContainsAlias(str);
        }

        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineDeleteEntry(str);
        }

        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCertificate(str);
        }

        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return BcFKSKeyStoreSpi.super.engineGetCertificateAlias(certificate);
        }

        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCertificateChain(str);
        }

        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCreationDate(str);
        }

        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return BcFKSKeyStoreSpi.super.engineGetKey(str, cArr);
        }

        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return BcFKSKeyStoreSpi.super.engineIsCertificateEntry(str);
        }

        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return BcFKSKeyStoreSpi.super.engineIsKeyEntry(str);
        }

        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            BcFKSKeyStoreSpi.super.engineLoad(inputStream, cArr);
        }

        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            BcFKSKeyStoreSpi.super.engineLoad(loadStoreParameter);
        }

        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineSetCertificateEntry(str, certificate);
        }

        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        public /* bridge */ /* synthetic */ int engineSize() {
            return BcFKSKeyStoreSpi.super.engineSize();
        }

        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            BcFKSKeyStoreSpi.super.engineStore(outputStream, cArr);
        }

        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            BcFKSKeyStoreSpi.super.engineStore(loadStoreParameter);
        }
    }

    public static class StdShared extends SharedKeyStoreSpi {
        public StdShared() {
            super(new s0.a.c.o.a());
        }

        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return BcFKSKeyStoreSpi.super.engineAliases();
        }

        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return BcFKSKeyStoreSpi.super.engineContainsAlias(str);
        }

        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCertificate(str);
        }

        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return BcFKSKeyStoreSpi.super.engineGetCertificateAlias(certificate);
        }

        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCertificateChain(str);
        }

        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCreationDate(str);
        }

        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return BcFKSKeyStoreSpi.super.engineIsCertificateEntry(str);
        }

        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return BcFKSKeyStoreSpi.super.engineIsKeyEntry(str);
        }

        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            BcFKSKeyStoreSpi.super.engineLoad(inputStream, cArr);
        }

        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            BcFKSKeyStoreSpi.super.engineLoad(loadStoreParameter);
        }

        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        public /* bridge */ /* synthetic */ int engineSize() {
            return BcFKSKeyStoreSpi.super.engineSize();
        }

        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            BcFKSKeyStoreSpi.super.engineStore(outputStream, cArr);
        }

        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            BcFKSKeyStoreSpi.super.engineStore(loadStoreParameter);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        oidMap = hashMap;
        HashMap hashMap2 = new HashMap();
        publicAlgMap = hashMap2;
        n nVar = s0.a.a.v2.b.e;
        hashMap.put("DESEDE", nVar);
        hashMap.put("TRIPLEDES", nVar);
        hashMap.put("TDEA", nVar);
        hashMap.put("HMACSHA1", s0.a.a.w2.n.Y);
        hashMap.put("HMACSHA224", s0.a.a.w2.n.Z);
        hashMap.put("HMACSHA256", s0.a.a.w2.n.a0);
        hashMap.put("HMACSHA384", s0.a.a.w2.n.b0);
        hashMap.put("HMACSHA512", s0.a.a.w2.n.c0);
        hashMap.put("SEED", s0.a.a.p2.a.a);
        hashMap.put("CAMELLIA.128", s0.a.a.t2.a.a);
        hashMap.put("CAMELLIA.192", s0.a.a.t2.a.b);
        hashMap.put("CAMELLIA.256", s0.a.a.t2.a.c);
        hashMap.put("ARIA.128", s0.a.a.s2.a.e);
        hashMap.put("ARIA.192", s0.a.a.s2.a.i);
        hashMap.put("ARIA.256", s0.a.a.s2.a.m);
        hashMap2.put(s0.a.a.w2.n.n, "RSA");
        hashMap2.put(m.h1, "EC");
        hashMap2.put(s0.a.a.v2.b.i, "DH");
        hashMap2.put(s0.a.a.w2.n.G, "DH");
        hashMap2.put(m.N1, "DSA");
    }

    public BcFKSKeyStoreSpi(c cVar) {
        this.helper = cVar;
    }

    private byte[] calculateMac(byte[] bArr, b bVar, h hVar, char[] cArr) throws NoSuchAlgorithmException, IOException, NoSuchProviderException {
        String str = bVar.c.d;
        Mac d = this.helper.d(str);
        try {
            if (cArr == null) {
                cArr = new char[0];
            }
            d.init(new SecretKeySpec(generateKey(hVar, "INTEGRITY_CHECK", cArr, -1), str));
            return d.doFinal(bArr);
        } catch (InvalidKeyException e) {
            StringBuilder P0 = a.P0("Cannot set up MAC calculation: ");
            P0.append(e.getMessage());
            throw new IOException(P0.toString());
        }
    }

    private Cipher createCipher(String str, byte[] bArr) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, NoSuchProviderException {
        Cipher c = this.helper.c(str);
        c.init(1, new SecretKeySpec(bArr, "AES"));
        return c;
    }

    private s0.a.a.c2.c createPrivateKeySequence(f fVar, Certificate[] certificateArr) throws CertificateEncodingException {
        s0.a.a.c3.n[] nVarArr = new s0.a.a.c3.n[certificateArr.length];
        for (int i = 0; i != certificateArr.length; i++) {
            nVarArr[i] = s0.a.a.c3.n.s(certificateArr[i].getEncoded());
        }
        return new s0.a.a.c2.c(fVar, nVarArr);
    }

    private Certificate decodeCertificate(Object obj) {
        c cVar = this.helper;
        if (cVar != null) {
            try {
                return cVar.e("X.509").generateCertificate(new ByteArrayInputStream(s0.a.a.c3.n.s(obj).getEncoded()));
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(s0.a.a.c3.n.s(obj).getEncoded()));
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    private byte[] decryptData(String str, b bVar, char[] cArr, byte[] bArr) throws IOException {
        AlgorithmParameters algorithmParameters;
        Cipher cipher;
        if (bVar.c.w(s0.a.a.w2.n.O)) {
            k s = k.s(bVar.d);
            g gVar = s.d;
            try {
                if (gVar.c.c.w(s0.a.a.r2.b.P)) {
                    cipher = this.helper.c("AES/CCM/NoPadding");
                    algorithmParameters = this.helper.f("CCM");
                    algorithmParameters.init(s0.a.a.e2.a.s(gVar.c.d).getEncoded());
                } else if (gVar.c.c.w(s0.a.a.r2.b.Q)) {
                    cipher = this.helper.c("AESKWP");
                    algorithmParameters = null;
                } else {
                    throw new IOException("BCFKS KeyStore cannot recognize protection encryption algorithm.");
                }
                h hVar = s.c;
                if (cArr == null) {
                    cArr = new char[0];
                }
                cipher.init(2, new SecretKeySpec(generateKey(hVar, str, cArr, 32), "AES"), algorithmParameters);
                return cipher.doFinal(bArr);
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException(e2.toString());
            }
        } else {
            throw new IOException("BCFKS KeyStore cannot recognize protection algorithm.");
        }
    }

    private Date extractCreationDate(e eVar, Date date) {
        try {
            return eVar.q.D();
        } catch (ParseException unused) {
            return date;
        }
    }

    private char[] extractPassword(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException {
        KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            return null;
        }
        if (protectionParameter instanceof KeyStore.PasswordProtection) {
            return ((KeyStore.PasswordProtection) protectionParameter).getPassword();
        }
        if (protectionParameter instanceof KeyStore.CallbackHandlerProtection) {
            CallbackHandler callbackHandler = ((KeyStore.CallbackHandlerProtection) protectionParameter).getCallbackHandler();
            PasswordCallback passwordCallback = new PasswordCallback("password: ", false);
            try {
                callbackHandler.handle(new Callback[]{passwordCallback});
                return passwordCallback.getPassword();
            } catch (UnsupportedCallbackException e) {
                StringBuilder P0 = a.P0("PasswordCallback not recognised: ");
                P0.append(e.getMessage());
                throw new IllegalArgumentException(P0.toString(), e);
            }
        } else {
            StringBuilder P02 = a.P0("no support for protection parameter of type ");
            P02.append(protectionParameter.getClass().getName());
            throw new IllegalArgumentException(P02.toString());
        }
    }

    private byte[] generateKey(h hVar, String str, char[] cArr, int i) throws IOException {
        byte[] PKCS12PasswordToBytes = t.PKCS12PasswordToBytes(cArr);
        byte[] PKCS12PasswordToBytes2 = t.PKCS12PasswordToBytes(str.toCharArray());
        if (s0.a.a.q2.c.y.w(hVar.c.c)) {
            s0.a.a.q2.f s = s0.a.a.q2.f.s(hVar.c.d);
            BigInteger bigInteger = s.y;
            if (bigInteger != null) {
                i = bigInteger.intValue();
            } else if (i == -1) {
                throw new IOException("no keyLength found in ScryptParams");
            }
            return m0.r.t.a.r.m.a1.a.B1(h3.R(PKCS12PasswordToBytes, PKCS12PasswordToBytes2), s.t(), s.d.intValue(), s.q.intValue(), s.q.intValue(), i);
        } else if (hVar.c.c.w(s0.a.a.w2.n.P)) {
            l s2 = l.s(hVar.c.d);
            if (s2.u() != null) {
                i = s2.u().intValue();
            } else if (i == -1) {
                throw new IOException("no keyLength found in PBKDF2Params");
            }
            if (s2.v().c.w(s0.a.a.w2.n.c0)) {
                v vVar = new v(new a0());
                vVar.init(h3.R(PKCS12PasswordToBytes, PKCS12PasswordToBytes2), s2.d.c, s2.t().intValue());
                return ((s0.a.b.k0.y0) vVar.generateDerivedParameters(i * 8)).c;
            } else if (s2.v().c.w(s0.a.a.r2.b.r)) {
                v vVar2 = new v(new z(512));
                vVar2.init(h3.R(PKCS12PasswordToBytes, PKCS12PasswordToBytes2), s2.d.c, s2.t().intValue());
                return ((s0.a.b.k0.y0) vVar2.generateDerivedParameters(i * 8)).c;
            } else {
                StringBuilder P0 = a.P0("BCFKS KeyStore: unrecognized MAC PBKD PRF: ");
                P0.append(s2.v().c);
                throw new IOException(P0.toString());
            }
        } else {
            throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD.");
        }
    }

    private h generatePkbdAlgorithmIdentifier(n nVar, int i) {
        byte[] bArr = new byte[64];
        getDefaultSecureRandom().nextBytes(bArr);
        n nVar2 = s0.a.a.w2.n.P;
        if (nVar2.w(nVar)) {
            return new h(nVar2, new l(bArr, 51200, i, new b(s0.a.a.w2.n.c0, v0.c)));
        }
        throw new IllegalStateException("unknown derivation algorithm: " + nVar);
    }

    private h generatePkbdAlgorithmIdentifier(h hVar, int i) {
        n nVar = s0.a.a.q2.c.y;
        if (nVar.w(hVar.c.c)) {
            s0.a.a.q2.f s = s0.a.a.q2.f.s(hVar.c.d);
            byte[] bArr = new byte[s.t().length];
            getDefaultSecureRandom().nextBytes(bArr);
            return new h(nVar, new s0.a.a.q2.f(bArr, s.d, s.q, s.x, BigInteger.valueOf((long) i)));
        }
        l s2 = l.s(hVar.c.d);
        byte[] bArr2 = new byte[s2.d.c.length];
        getDefaultSecureRandom().nextBytes(bArr2);
        return new h(s0.a.a.w2.n.P, new l(bArr2, s2.t().intValue(), i, s2.v()));
    }

    private h generatePkbdAlgorithmIdentifier(s0.a.b.o0.c cVar, int i) {
        n nVar = s0.a.a.q2.c.y;
        Objects.requireNonNull(cVar);
        if (nVar.w((r) null)) {
            s0.a.b.o0.g gVar = (s0.a.b.o0.g) cVar;
            byte[] bArr = new byte[0];
            getDefaultSecureRandom().nextBytes(bArr);
            return new h(nVar, new s0.a.a.q2.f(bArr, 0, 0, 0, i));
        }
        s0.a.b.o0.b bVar = (s0.a.b.o0.b) cVar;
        byte[] bArr2 = new byte[0];
        getDefaultSecureRandom().nextBytes(bArr2);
        return new h(s0.a.a.w2.n.P, new l(bArr2, 0, i, (b) null));
    }

    private b generateSignatureAlgId(Key key, BCFKSLoadStoreParameter.SignatureAlgorithm signatureAlgorithm2) throws IOException {
        if (key == null) {
            return null;
        }
        if (key instanceof s0.a.d.d.a) {
            if (signatureAlgorithm2 == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withECDSA) {
                return new b(m.m1);
            }
            if (signatureAlgorithm2 == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA3_512withECDSA) {
                return new b(s0.a.a.r2.b.d0);
            }
        }
        if (key instanceof DSAKey) {
            if (signatureAlgorithm2 == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withDSA) {
                return new b(s0.a.a.r2.b.V);
            }
            if (signatureAlgorithm2 == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA3_512withDSA) {
                return new b(s0.a.a.r2.b.Z);
            }
        }
        if (key instanceof RSAKey) {
            if (signatureAlgorithm2 == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withRSA) {
                return new b(s0.a.a.w2.n.B, v0.c);
            }
            if (signatureAlgorithm2 == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA3_512withRSA) {
                return new b(s0.a.a.r2.b.f53h0, v0.c);
            }
        }
        throw new IOException("unknown signature algorithm");
    }

    private SecureRandom getDefaultSecureRandom() {
        return s0.a.b.j.a();
    }

    private s0.a.a.c2.b getEncryptedObjectStoreData(b bVar, char[] cArr) throws IOException, NoSuchAlgorithmException {
        e[] eVarArr = (e[]) this.entries.values().toArray(new e[this.entries.size()]);
        h generatePkbdAlgorithmIdentifier = generatePkbdAlgorithmIdentifier(this.hmacPkbdAlgorithm, 32);
        if (cArr == null) {
            cArr = new char[0];
        }
        byte[] generateKey = generateKey(generatePkbdAlgorithmIdentifier, "STORE_ENCRYPTION", cArr, 32);
        s0.a.a.c2.h hVar = new s0.a.a.c2.h(bVar, this.creationDate, this.lastModifiedDate, new s0.a.a.c2.f(eVarArr), (String) null);
        try {
            n nVar = this.storeEncryptionAlgorithm;
            n nVar2 = s0.a.a.r2.b.P;
            if (nVar.w(nVar2)) {
                Cipher createCipher = createCipher("AES/CCM/NoPadding", generateKey);
                return new s0.a.a.c2.b(new b(s0.a.a.w2.n.O, new k(generatePkbdAlgorithmIdentifier, new g(nVar2, s0.a.a.e2.a.s(createCipher.getParameters().getEncoded())))), createCipher.doFinal(hVar.getEncoded()));
            }
            return new s0.a.a.c2.b(new b(s0.a.a.w2.n.O, new k(generatePkbdAlgorithmIdentifier, new g(s0.a.a.r2.b.Q))), createCipher("AESKWP", generateKey).doFinal(hVar.getEncoded()));
        } catch (NoSuchPaddingException e) {
            throw new NoSuchAlgorithmException(e.toString());
        } catch (BadPaddingException e2) {
            throw new IOException(e2.toString());
        } catch (IllegalBlockSizeException e3) {
            throw new IOException(e3.toString());
        } catch (InvalidKeyException e4) {
            throw new IOException(e4.toString());
        } catch (NoSuchProviderException e5) {
            throw new IOException(e5.toString());
        }
    }

    private static String getPublicKeyAlg(n nVar) {
        String str = publicAlgMap.get(nVar);
        return str != null ? str : nVar.d;
    }

    private boolean isSimilarHmacPbkd(s0.a.b.o0.c cVar, h hVar) {
        Objects.requireNonNull(cVar);
        n nVar = hVar.c.c;
        throw null;
    }

    private void verifyMac(byte[] bArr, s0.a.a.c2.j jVar, char[] cArr) throws NoSuchAlgorithmException, IOException, NoSuchProviderException {
        if (!h3.U(calculateMac(bArr, jVar.c, jVar.d, cArr), h3.I(jVar.q.c))) {
            throw new IOException("BCFKS KeyStore corrupted: MAC calculation failed");
        }
    }

    private void verifySig(s0.a.a.e eVar, s0.a.a.c2.l lVar, PublicKey publicKey) throws GeneralSecurityException, IOException {
        Signature createSignature = this.helper.createSignature(lVar.c.c.d);
        createSignature.initVerify(publicKey);
        createSignature.update(eVar.c().r("DER"));
        byte[] B = lVar.q.B();
        int i = lVar.q.q;
        Objects.requireNonNull(B, "'data' cannot be null");
        if (B.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        } else if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        } else {
            byte[] I = h3.I(B);
            if (i != 0) {
                throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
            } else if (!createSignature.verify(h3.I(I))) {
                throw new IOException("BCFKS KeyStore corrupted: signature calculation failed");
            }
        }
    }

    public Enumeration<String> engineAliases() {
        final Iterator it = new HashSet(this.entries.keySet()).iterator();
        return new Enumeration() {
            public boolean hasMoreElements() {
                return it.hasNext();
            }

            public Object nextElement() {
                return it.next();
            }
        };
    }

    public boolean engineContainsAlias(String str) {
        Objects.requireNonNull(str, "alias value is null");
        return this.entries.containsKey(str);
    }

    public void engineDeleteEntry(String str) throws KeyStoreException {
        if (this.entries.get(str) != null) {
            this.privateKeyCache.remove(str);
            this.entries.remove(str);
            this.lastModifiedDate = new Date();
        }
    }

    public Certificate engineGetCertificate(String str) {
        e eVar = this.entries.get(str);
        if (eVar == null) {
            return null;
        }
        if (eVar.c.equals(PRIVATE_KEY) || eVar.c.equals(PROTECTED_PRIVATE_KEY)) {
            return decodeCertificate(s0.a.a.c2.c.t(eVar.s()).s()[0]);
        }
        if (eVar.c.equals(CERTIFICATE)) {
            return decodeCertificate(eVar.s());
        }
        return null;
    }

    public String engineGetCertificateAlias(Certificate certificate) {
        if (certificate == null) {
            return null;
        }
        try {
            byte[] encoded = certificate.getEncoded();
            for (String next : this.entries.keySet()) {
                e eVar = this.entries.get(next);
                if (eVar.c.equals(CERTIFICATE)) {
                    if (Arrays.equals(eVar.s(), encoded)) {
                        return next;
                    }
                } else if (eVar.c.equals(PRIVATE_KEY) || eVar.c.equals(PROTECTED_PRIVATE_KEY)) {
                    try {
                        if (Arrays.equals(s0.a.a.c2.c.t(eVar.s()).s()[0].c.getEncoded(), encoded)) {
                            return next;
                        }
                    } catch (IOException unused) {
                        continue;
                    }
                }
            }
        } catch (CertificateEncodingException unused2) {
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.security.cert.X509Certificate[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, s0.a.a.c2.e> r0 = r4.entries
            java.lang.Object r5 = r0.get(r5)
            s0.a.a.c2.e r5 = (s0.a.a.c2.e) r5
            if (r5 == 0) goto L_0x003c
            java.math.BigInteger r0 = r5.c
            java.math.BigInteger r1 = PRIVATE_KEY
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001e
            java.math.BigInteger r0 = r5.c
            java.math.BigInteger r1 = PROTECTED_PRIVATE_KEY
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003c
        L_0x001e:
            byte[] r5 = r5.s()
            s0.a.a.c2.c r5 = s0.a.a.c2.c.t(r5)
            s0.a.a.c3.n[] r5 = r5.s()
            int r0 = r5.length
            java.security.cert.X509Certificate[] r1 = new java.security.cert.X509Certificate[r0]
            r2 = 0
        L_0x002e:
            if (r2 == r0) goto L_0x003b
            r3 = r5[r2]
            java.security.cert.Certificate r3 = r4.decodeCertificate(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L_0x002e
        L_0x003b:
            return r1
        L_0x003c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.engineGetCertificateChain(java.lang.String):java.security.cert.Certificate[]");
    }

    public Date engineGetCreationDate(String str) {
        e eVar = this.entries.get(str);
        if (eVar == null) {
            return null;
        }
        try {
            return eVar.x.D();
        } catch (ParseException unused) {
            return new Date();
        }
    }

    public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        e eVar = this.entries.get(str);
        s0.a.a.c2.k kVar = null;
        if (eVar == null) {
            return null;
        }
        if (eVar.c.equals(PRIVATE_KEY) || eVar.c.equals(PROTECTED_PRIVATE_KEY)) {
            PrivateKey privateKey = this.privateKeyCache.get(str);
            if (privateKey != null) {
                return privateKey;
            }
            f s = f.s(s0.a.a.c2.c.t(eVar.s()).c);
            try {
                p s2 = p.s(decryptData("PRIVATE_KEY_ENCRYPTION", s.c, cArr, s.d.c));
                PrivateKey generatePrivate = this.helper.h(getPublicKeyAlg(s2.d.c)).generatePrivate(new PKCS8EncodedKeySpec(s2.getEncoded()));
                this.privateKeyCache.put(str, generatePrivate);
                return generatePrivate;
            } catch (Exception e) {
                throw new UnrecoverableKeyException(a.a0(e, a.T0("BCFKS KeyStore unable to recover private key (", str, "): ")));
            }
        } else if (eVar.c.equals(SECRET_KEY) || eVar.c.equals(PROTECTED_SECRET_KEY)) {
            byte[] s3 = eVar.s();
            d dVar = s3 instanceof d ? (d) s3 : s3 != null ? new d(s.B(s3)) : null;
            try {
                byte[] decryptData = decryptData("SECRET_KEY_ENCRYPTION", dVar.c, cArr, h3.I(dVar.d.c));
                if (decryptData instanceof s0.a.a.c2.k) {
                    kVar = (s0.a.a.c2.k) decryptData;
                } else if (decryptData != null) {
                    kVar = new s0.a.a.c2.k(s.B(decryptData));
                }
                return this.helper.g(kVar.c.d).generateSecret(new SecretKeySpec(h3.I(kVar.d.c), kVar.c.d));
            } catch (Exception e2) {
                throw new UnrecoverableKeyException(a.a0(e2, a.T0("BCFKS KeyStore unable to recover secret key (", str, "): ")));
            }
        } else {
            throw new UnrecoverableKeyException(a.o0("BCFKS KeyStore unable to recover secret key (", str, "): type not recognized"));
        }
    }

    public boolean engineIsCertificateEntry(String str) {
        e eVar = this.entries.get(str);
        if (eVar != null) {
            return eVar.c.equals(CERTIFICATE);
        }
        return false;
    }

    public boolean engineIsKeyEntry(String str) {
        e eVar = this.entries.get(str);
        if (eVar == null) {
            return false;
        }
        BigInteger bigInteger = eVar.c;
        if (bigInteger.equals(PRIVATE_KEY) || bigInteger.equals(SECRET_KEY) || bigInteger.equals(PROTECTED_PRIVATE_KEY) || bigInteger.equals(PROTECTED_SECRET_KEY)) {
            return true;
        }
        return false;
    }

    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
        b bVar;
        s0.a.a.c2.h hVar;
        PublicKey publicKey;
        s0.a.a.e eVar;
        this.entries.clear();
        this.privateKeyCache.clear();
        s0.a.a.c3.n[] nVarArr = null;
        this.creationDate = null;
        this.lastModifiedDate = null;
        this.hmacAlgorithm = null;
        if (inputStream == null) {
            Date date = new Date();
            this.creationDate = date;
            this.lastModifiedDate = date;
            this.verificationKey = null;
            this.validator = null;
            this.hmacAlgorithm = new b(s0.a.a.w2.n.c0, v0.c);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(s0.a.a.w2.n.P, 64);
            return;
        }
        try {
            r i = new s0.a.a.j(inputStream).i();
            s0.a.a.c2.g gVar = i instanceof s0.a.a.c2.g ? (s0.a.a.c2.g) i : i != null ? new s0.a.a.c2.g(s.B(i)) : null;
            i iVar = gVar.d;
            int i2 = iVar.c;
            if (i2 == 0) {
                s0.a.a.c2.j s = s0.a.a.c2.j.s(iVar.d);
                bVar = s.c;
                this.hmacAlgorithm = bVar;
                this.hmacPkbdAlgorithm = s.d;
                try {
                    verifyMac(gVar.c.c().getEncoded(), s, cArr);
                } catch (NoSuchProviderException e) {
                    throw new IOException(e.getMessage());
                }
            } else if (i2 == 1) {
                s0.a.a.c2.l s2 = s0.a.a.c2.l.s(iVar.d);
                b bVar2 = s2.c;
                try {
                    s sVar = s2.d;
                    if (sVar != null) {
                        int size = sVar.size();
                        s0.a.a.c3.n[] nVarArr2 = new s0.a.a.c3.n[size];
                        for (int i3 = 0; i3 != size; i3++) {
                            nVarArr2[i3] = s0.a.a.c3.n.s(s2.d.D(i3));
                        }
                        nVarArr = nVarArr2;
                    }
                    if (this.validator == null) {
                        eVar = gVar.c;
                        publicKey = this.verificationKey;
                    } else if (nVarArr != null) {
                        CertificateFactory e2 = this.helper.e("X.509");
                        int length = nVarArr.length;
                        X509Certificate[] x509CertificateArr = new X509Certificate[length];
                        for (int i4 = 0; i4 != length; i4++) {
                            x509CertificateArr[i4] = (X509Certificate) e2.generateCertificate(new ByteArrayInputStream(nVarArr[i4].getEncoded()));
                        }
                        if (this.validator.a(x509CertificateArr)) {
                            eVar = gVar.c;
                            publicKey = x509CertificateArr[0].getPublicKey();
                        } else {
                            throw new IOException("certificate chain in key store signature not valid");
                        }
                    } else {
                        throw new IOException("validator specified but no certifcates in store");
                    }
                    verifySig(eVar, s2, publicKey);
                    bVar = bVar2;
                } catch (GeneralSecurityException e3) {
                    StringBuilder P0 = a.P0("error verifying signature: ");
                    P0.append(e3.getMessage());
                    throw new IOException(P0.toString(), e3);
                }
            } else {
                throw new IOException("BCFKS KeyStore unable to recognize integrity check.");
            }
            s0.a.a.e eVar2 = gVar.c;
            if (eVar2 instanceof s0.a.a.c2.b) {
                s0.a.a.c2.b bVar3 = (s0.a.a.c2.b) eVar2;
                hVar = s0.a.a.c2.h.s(decryptData("STORE_ENCRYPTION", bVar3.c, cArr, bVar3.d.c));
            } else {
                hVar = s0.a.a.c2.h.s(eVar2);
            }
            try {
                this.creationDate = hVar.q.D();
                this.lastModifiedDate = hVar.x.D();
                if (hVar.d.equals(bVar)) {
                    Iterator<s0.a.a.e> it = hVar.y.iterator();
                    while (true) {
                        s0.a.g.a aVar = (s0.a.g.a) it;
                        if (aVar.hasNext()) {
                            e t = e.t(aVar.next());
                            this.entries.put(t.d, t);
                        } else {
                            return;
                        }
                    }
                } else {
                    throw new IOException("BCFKS KeyStore storeData integrity algorithm does not match store integrity algorithm.");
                }
            } catch (ParseException unused) {
                throw new IOException("BCFKS KeyStore unable to parse store data information.");
            }
        } catch (Exception e4) {
            throw new IOException(e4.getMessage());
        }
    }

    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
        if (loadStoreParameter == null) {
            throw new IllegalArgumentException("'parameter' arg cannot be null");
        } else if (loadStoreParameter instanceof BCFKSLoadStoreParameter) {
            char[] extractPassword = extractPassword((BCFKSLoadStoreParameter) loadStoreParameter);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier((s0.a.b.o0.c) null, 64);
            this.storeEncryptionAlgorithm = BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM == null ? s0.a.a.r2.b.P : s0.a.a.r2.b.Q;
            this.hmacAlgorithm = BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512 == null ? new b(s0.a.a.w2.n.c0, v0.c) : new b(s0.a.a.r2.b.r, v0.c);
            this.verificationKey = null;
            this.validator = null;
            this.signatureAlgorithm = generateSignatureAlgId((Key) null, (BCFKSLoadStoreParameter.SignatureAlgorithm) null);
            engineLoad((InputStream) null, extractPassword);
        } else if (loadStoreParameter instanceof s0.a.c.b) {
            s0.a.c.b bVar = (s0.a.c.b) loadStoreParameter;
            engineLoad((InputStream) null, extractPassword(loadStoreParameter));
        } else {
            StringBuilder P0 = a.P0("no support for 'parameter' of type ");
            P0.append(loadStoreParameter.getClass().getName());
            throw new IllegalArgumentException(P0.toString());
        }
    }

    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        Date date;
        e eVar = this.entries.get(str);
        Date date2 = new Date();
        if (eVar == null) {
            date = date2;
        } else if (eVar.c.equals(CERTIFICATE)) {
            date = extractCreationDate(eVar, date2);
        } else {
            throw new KeyStoreException(a.n0("BCFKS KeyStore already has a key entry with alias ", str));
        }
        try {
            this.entries.put(str, new e(CERTIFICATE, str, date, date2, certificate.getEncoded(), (String) null));
            this.lastModifiedDate = date2;
        } catch (CertificateEncodingException e) {
            StringBuilder P0 = a.P0("BCFKS KeyStore unable to handle certificate: ");
            P0.append(e.getMessage());
            throw new ExtKeyStoreException(P0.toString(), e);
        }
    }

    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        s0.a.a.c2.k kVar;
        d dVar;
        f fVar;
        Date date = new Date();
        e eVar = this.entries.get(str);
        Date extractCreationDate = eVar != null ? extractCreationDate(eVar, date) : date;
        this.privateKeyCache.remove(str);
        if (key instanceof PrivateKey) {
            if (certificateArr != null) {
                try {
                    byte[] encoded = key.getEncoded();
                    h generatePkbdAlgorithmIdentifier = generatePkbdAlgorithmIdentifier(s0.a.a.w2.n.P, 32);
                    if (cArr == null) {
                        cArr = new char[0];
                    }
                    byte[] generateKey = generateKey(generatePkbdAlgorithmIdentifier, "PRIVATE_KEY_ENCRYPTION", cArr, 32);
                    n nVar = this.storeEncryptionAlgorithm;
                    n nVar2 = s0.a.a.r2.b.P;
                    if (nVar.w(nVar2)) {
                        Cipher createCipher = createCipher("AES/CCM/NoPadding", generateKey);
                        fVar = new f(new b(s0.a.a.w2.n.O, new k(generatePkbdAlgorithmIdentifier, new g(nVar2, s0.a.a.e2.a.s(createCipher.getParameters().getEncoded())))), createCipher.doFinal(encoded));
                    } else {
                        fVar = new f(new b(s0.a.a.w2.n.O, new k(generatePkbdAlgorithmIdentifier, new g(s0.a.a.r2.b.Q))), createCipher("AESKWP", generateKey).doFinal(encoded));
                    }
                    this.entries.put(str, new e(PRIVATE_KEY, str, extractCreationDate, date, createPrivateKeySequence(fVar, certificateArr).getEncoded(), (String) null));
                } catch (Exception e) {
                    throw new ExtKeyStoreException(a.b0(e, a.P0("BCFKS KeyStore exception storing private key: ")), e);
                }
            } else {
                throw new KeyStoreException("BCFKS KeyStore requires a certificate chain for private key storage.");
            }
        } else if (!(key instanceof SecretKey)) {
            throw new KeyStoreException("BCFKS KeyStore unable to recognize key.");
        } else if (certificateArr == null) {
            try {
                byte[] encoded2 = key.getEncoded();
                h generatePkbdAlgorithmIdentifier2 = generatePkbdAlgorithmIdentifier(s0.a.a.w2.n.P, 32);
                if (cArr == null) {
                    cArr = new char[0];
                }
                byte[] generateKey2 = generateKey(generatePkbdAlgorithmIdentifier2, "SECRET_KEY_ENCRYPTION", cArr, 32);
                String g = j.g(key.getAlgorithm());
                if (g.indexOf("AES") > -1) {
                    kVar = new s0.a.a.c2.k(s0.a.a.r2.b.s, encoded2);
                } else {
                    Map<String, n> map = oidMap;
                    n nVar3 = map.get(g);
                    if (nVar3 != null) {
                        kVar = new s0.a.a.c2.k(nVar3, encoded2);
                    } else {
                        n nVar4 = map.get(g + "." + (encoded2.length * 8));
                        if (nVar4 != null) {
                            kVar = new s0.a.a.c2.k(nVar4, encoded2);
                        } else {
                            throw new KeyStoreException("BCFKS KeyStore cannot recognize secret key (" + g + ") for storage.");
                        }
                    }
                }
                n nVar5 = this.storeEncryptionAlgorithm;
                n nVar6 = s0.a.a.r2.b.P;
                if (nVar5.w(nVar6)) {
                    Cipher createCipher2 = createCipher("AES/CCM/NoPadding", generateKey2);
                    dVar = new d(new b(s0.a.a.w2.n.O, new k(generatePkbdAlgorithmIdentifier2, new g(nVar6, s0.a.a.e2.a.s(createCipher2.getParameters().getEncoded())))), createCipher2.doFinal(kVar.getEncoded()));
                } else {
                    dVar = new d(new b(s0.a.a.w2.n.O, new k(generatePkbdAlgorithmIdentifier2, new g(s0.a.a.r2.b.Q))), createCipher("AESKWP", generateKey2).doFinal(kVar.getEncoded()));
                }
                this.entries.put(str, new e(SECRET_KEY, str, extractCreationDate, date, dVar.getEncoded(), (String) null));
            } catch (Exception e2) {
                throw new ExtKeyStoreException(a.b0(e2, a.P0("BCFKS KeyStore exception storing private key: ")), e2);
            }
        } else {
            throw new KeyStoreException("BCFKS KeyStore cannot store certificate chain with secret key.");
        }
        this.lastModifiedDate = date;
    }

    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        Date date = new Date();
        e eVar = this.entries.get(str);
        Date extractCreationDate = eVar != null ? extractCreationDate(eVar, date) : date;
        if (certificateArr != null) {
            try {
                f s = f.s(bArr);
                try {
                    this.privateKeyCache.remove(str);
                    this.entries.put(str, new e(PROTECTED_PRIVATE_KEY, str, extractCreationDate, date, createPrivateKeySequence(s, certificateArr).getEncoded(), (String) null));
                } catch (Exception e) {
                    throw new ExtKeyStoreException(a.b0(e, a.P0("BCFKS KeyStore exception storing protected private key: ")), e);
                }
            } catch (Exception e2) {
                throw new ExtKeyStoreException("BCFKS KeyStore private key encoding must be an EncryptedPrivateKeyInfo.", e2);
            }
        } else {
            try {
                this.entries.put(str, new e(PROTECTED_SECRET_KEY, str, extractCreationDate, date, bArr, (String) null));
            } catch (Exception e3) {
                throw new ExtKeyStoreException(a.b0(e3, a.P0("BCFKS KeyStore exception storing protected private key: ")), e3);
            }
        }
        this.lastModifiedDate = date;
    }

    public int engineSize() {
        return this.entries.size();
    }

    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
        h hVar;
        BigInteger bigInteger;
        if (this.creationDate != null) {
            s0.a.a.c2.b encryptedObjectStoreData = getEncryptedObjectStoreData(this.hmacAlgorithm, cArr);
            if (s0.a.a.q2.c.y.w(this.hmacPkbdAlgorithm.c.c)) {
                s0.a.a.q2.f s = s0.a.a.q2.f.s(this.hmacPkbdAlgorithm.c.d);
                hVar = this.hmacPkbdAlgorithm;
                bigInteger = s.y;
            } else {
                l s2 = l.s(this.hmacPkbdAlgorithm.c.d);
                hVar = this.hmacPkbdAlgorithm;
                bigInteger = s2.u();
            }
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(hVar, bigInteger.intValue());
            try {
                outputStream.write(new s0.a.a.c2.g(encryptedObjectStoreData, new i(new s0.a.a.c2.j(this.hmacAlgorithm, this.hmacPkbdAlgorithm, calculateMac(encryptedObjectStoreData.getEncoded(), this.hmacAlgorithm, this.hmacPkbdAlgorithm, cArr)))).getEncoded());
                outputStream.flush();
            } catch (NoSuchProviderException e) {
                StringBuilder P0 = a.P0("cannot calculate mac: ");
                P0.append(e.getMessage());
                throw new IOException(P0.toString());
            }
        } else {
            throw new IOException("KeyStore not initialized");
        }
    }

    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
        if (loadStoreParameter == null) {
            throw new IllegalArgumentException("'parameter' arg cannot be null");
        } else if (loadStoreParameter instanceof s0.a.c.a) {
            s0.a.c.a aVar = (s0.a.c.a) loadStoreParameter;
            char[] extractPassword = extractPassword(loadStoreParameter);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier((s0.a.b.o0.c) null, 64);
            engineStore((OutputStream) null, extractPassword);
        } else if (loadStoreParameter instanceof BCFKSLoadStoreParameter) {
            BCFKSLoadStoreParameter bCFKSLoadStoreParameter = (BCFKSLoadStoreParameter) loadStoreParameter;
            extractPassword(bCFKSLoadStoreParameter);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier((s0.a.b.o0.c) null, 64);
            this.storeEncryptionAlgorithm = BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM == null ? s0.a.a.r2.b.P : s0.a.a.r2.b.Q;
            this.hmacAlgorithm = BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512 == null ? new b(s0.a.a.w2.n.c0, v0.c) : new b(s0.a.a.r2.b.r, v0.c);
            bCFKSLoadStoreParameter.a();
            throw null;
        } else if (loadStoreParameter instanceof s0.a.c.b) {
            ((s0.a.c.b) loadStoreParameter).a();
            throw null;
        } else {
            StringBuilder P0 = a.P0("no support for 'parameter' of type ");
            P0.append(loadStoreParameter.getClass().getName());
            throw new IllegalArgumentException(P0.toString());
        }
    }
}
