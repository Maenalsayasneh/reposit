package i0.l.a;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import java.util.Set;

/* compiled from: JWEProvider */
public interface d {
    Set<EncryptionMethod> supportedEncryptionMethods();

    Set<JWEAlgorithm> supportedJWEAlgorithms();
}
