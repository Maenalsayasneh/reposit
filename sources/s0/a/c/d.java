package s0.a.c;

import java.security.cert.CRL;
import java.util.Collection;
import org.bouncycastle.util.StoreException;
import s0.a.g.h;
import s0.a.g.i;

public interface d<T extends CRL> extends i<T> {
    Collection<T> getMatches(h<T> hVar) throws StoreException;
}
