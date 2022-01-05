package s0.a.h;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import s0.a.g.h;

public class c extends d {
    public int d2 = 5;
    public Set e2 = Collections.EMPTY_SET;

    public c(Set set, h hVar) throws InvalidAlgorithmParameterException {
        super(set);
        this.d = hVar != null ? (h) hVar.clone() : null;
    }

    public void b(PKIXParameters pKIXParameters) {
        super.b(pKIXParameters);
        c cVar = (c) pKIXParameters;
        this.d2 = cVar.d2;
        this.e2 = new HashSet(cVar.e2);
        if (pKIXParameters instanceof PKIXBuilderParameters) {
            this.d2 = ((PKIXBuilderParameters) pKIXParameters).getMaxPathLength();
        }
    }

    public Set c() {
        return Collections.unmodifiableSet(this.e2);
    }

    public Object clone() {
        try {
            Set<TrustAnchor> trustAnchors = getTrustAnchors();
            h hVar = this.d;
            c cVar = new c(trustAnchors, hVar != null ? (h) hVar.clone() : null);
            cVar.b(this);
            return cVar;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
