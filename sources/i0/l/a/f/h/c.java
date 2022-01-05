package i0.l.a.f.h;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import i0.l.a.d;
import i0.l.a.g.b;
import java.util.Collections;
import java.util.Set;

/* compiled from: BaseJWEProvider */
public abstract class c implements d {
    private final Set<JWEAlgorithm> algs;
    private final Set<EncryptionMethod> encs;
    private final b jcaContext = new b();

    public c(Set<JWEAlgorithm> set, Set<EncryptionMethod> set2) {
        if (set != null) {
            this.algs = Collections.unmodifiableSet(set);
            if (set2 != null) {
                this.encs = set2;
                return;
            }
            throw new IllegalArgumentException("The supported encryption methods must not be null");
        }
        throw new IllegalArgumentException("The supported JWE algorithm set must not be null");
    }

    public Set<EncryptionMethod> supportedEncryptionMethods() {
        return this.encs;
    }

    public Set<JWEAlgorithm> supportedJWEAlgorithms() {
        return this.algs;
    }

    public b getJCAContext() {
        return this.jcaContext;
    }
}
