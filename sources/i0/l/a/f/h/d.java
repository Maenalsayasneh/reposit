package i0.l.a.f.h;

import com.nimbusds.jose.JWSAlgorithm;
import i0.l.a.g.a;
import java.util.Collections;
import java.util.Set;

/* compiled from: BaseJWSProvider */
public abstract class d {
    public final Set<JWSAlgorithm> a;
    public final a b = new a();

    public d(Set<JWSAlgorithm> set) {
        if (set != null) {
            this.a = Collections.unmodifiableSet(set);
            return;
        }
        throw new IllegalArgumentException("The supported JWS algorithm set must not be null");
    }
}
