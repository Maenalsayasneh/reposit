package i0.l.a.f.h;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.KeyLengthException;
import i0.l.a.g.b;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* compiled from: DirectCryptoProvider */
public abstract class h extends c {
    public static final Set<JWEAlgorithm> SUPPORTED_ALGORITHMS;
    public static final Set<EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS = f.a;
    private final SecretKey cek;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWEAlgorithm.b2);
        SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(linkedHashSet);
    }

    public h(SecretKey secretKey) throws KeyLengthException {
        super(SUPPORTED_ALGORITHMS, getCompatibleEncryptionMethods(i0.j.f.p.h.z(secretKey.getEncoded())));
        this.cek = secretKey;
    }

    private static Set<EncryptionMethod> getCompatibleEncryptionMethods(int i) throws KeyLengthException {
        Set<EncryptionMethod> set = f.b.get(Integer.valueOf(i));
        if (set != null) {
            return set;
        }
        throw new KeyLengthException("The Content Encryption Key length must be 128 bits (16 bytes), 192 bits (24 bytes), 256 bits (32 bytes), 384 bits (48 bytes) or 512 bites (64 bytes)");
    }

    public /* bridge */ /* synthetic */ b getJCAContext() {
        return super.getJCAContext();
    }

    public SecretKey getKey() {
        return this.cek;
    }

    public /* bridge */ /* synthetic */ Set supportedEncryptionMethods() {
        return super.supportedEncryptionMethods();
    }

    public /* bridge */ /* synthetic */ Set supportedJWEAlgorithms() {
        return super.supportedJWEAlgorithms();
    }
}
