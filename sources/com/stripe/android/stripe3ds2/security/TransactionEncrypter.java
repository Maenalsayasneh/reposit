package com.stripe.android.stripe3ds2.security;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.util.Base64URL;
import i0.j.f.p.h;
import i0.l.a.a;
import i0.l.a.f.b;
import java.nio.charset.StandardCharsets;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/TransactionEncrypter;", "Li0/l/a/f/b;", "Lcom/nimbusds/jose/JWEHeader;", "header", "", "clearText", "Li0/l/a/a;", "encrypt", "(Lcom/nimbusds/jose/JWEHeader;[B)Li0/l/a/a;", "", "counter", "B", "key", "<init>", "([BB)V", "Crypto", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: TransactionEncrypter.kt */
public final class TransactionEncrypter extends b {
    private final byte counter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\bR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/TransactionEncrypter$Crypto;", "", "", "length", "", "sdkCounterAtoS", "", "getGcmIvAtoS", "(IB)[B", "pad", "counter", "getGcmId", "(IBB)[B", "sdkCounterStoA", "getGcmIvStoA", "BITS_IN_BYTE", "I", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: TransactionEncrypter.kt */
    public static final class Crypto {
        private static final int BITS_IN_BYTE = 8;
        public static final Crypto INSTANCE = new Crypto();

        private Crypto() {
        }

        private final byte[] getGcmId(int i, byte b, byte b2) {
            int i2 = i / 8;
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, b);
            bArr[i2 - 1] = b2;
            return bArr;
        }

        private final byte[] getGcmIvAtoS(int i, byte b) {
            return getGcmId(i, (byte) 255, b);
        }

        public final byte[] getGcmIvStoA(int i, byte b) {
            return getGcmId(i, (byte) 0, b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransactionEncrypter(byte[] bArr, byte b) throws KeyLengthException {
        super((SecretKey) new SecretKeySpec(bArr, "AES"));
        i.e(bArr, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        this.counter = b;
    }

    public a encrypt(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        byte[] bArr2;
        i0.l.a.f.h.b bVar;
        i.e(jWEHeader, "header");
        i.e(bArr, "clearText");
        JWEAlgorithm jWEAlgorithm = (JWEAlgorithm) jWEHeader.d;
        if (!(!i.a(jWEAlgorithm, JWEAlgorithm.b2))) {
            EncryptionMethod encryptionMethod = jWEHeader.i2;
            int i = encryptionMethod.d2;
            SecretKey key = getKey();
            i.d(key, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
            if (i == h.z(key.getEncoded())) {
                int i2 = encryptionMethod.d2;
                SecretKey key2 = getKey();
                i.d(key2, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
                if (i2 == h.z(key2.getEncoded())) {
                    byte[] n = h.n(jWEHeader, bArr);
                    byte[] bytes = jWEHeader.b().c.getBytes(StandardCharsets.US_ASCII);
                    if (i.a(jWEHeader.i2, EncryptionMethod.q)) {
                        bArr2 = Crypto.INSTANCE.getGcmIvStoA(128, this.counter);
                        SecretKey key3 = getKey();
                        i0.l.a.g.b jCAContext = getJCAContext();
                        i.d(jCAContext, "jcaContext");
                        Provider b = jCAContext.b();
                        i0.l.a.g.b jCAContext2 = getJCAContext();
                        i.d(jCAContext2, "jcaContext");
                        bVar = i0.l.a.f.h.a.d(key3, bArr2, n, bytes, b, jCAContext2.d());
                        i.d(bVar, "AESCBC.encryptAuthentica…rovider\n                )");
                    } else if (i.a(jWEHeader.i2, EncryptionMethod.a2)) {
                        bArr2 = Crypto.INSTANCE.getGcmIvStoA(96, this.counter);
                        bVar = h.y0(getKey(), new i0.l.a.j.b(bArr2), n, bytes, (Provider) null);
                        i.d(bVar, "AESGCM.encrypt(key, Cont…v), plainText, aad, null)");
                    } else {
                        throw new JOSEException(h.w4(jWEHeader.i2, i0.l.a.f.h.h.SUPPORTED_ENCRYPTION_METHODS));
                    }
                    return new a(jWEHeader, (Base64URL) null, Base64URL.d(bArr2), Base64URL.d(bVar.a), Base64URL.d(bVar.b));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("The Content Encryption Key length for ");
                sb.append(encryptionMethod);
                sb.append(" must be ");
                throw new KeyLengthException(i0.d.a.a.a.u0(sb, encryptionMethod.d2, " bits"));
            }
            throw new KeyLengthException(encryptionMethod.d2, encryptionMethod);
        }
        throw new JOSEException("Invalid algorithm " + jWEAlgorithm);
    }
}
