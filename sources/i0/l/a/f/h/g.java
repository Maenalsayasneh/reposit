package i0.l.a.f.h;

import com.nimbusds.jose.CommonSEHeader;
import java.util.Collections;
import java.util.Set;

/* compiled from: CriticalHeaderParamsDeferral */
public class g {
    public Set<String> a = Collections.emptySet();

    public boolean a(CommonSEHeader commonSEHeader) {
        Set<String> set = commonSEHeader.y;
        if (set == null) {
            return true;
        }
        for (String next : set) {
            if (!Collections.singleton("b64").contains(next) && !Collections.unmodifiableSet(this.a).contains(next)) {
                return false;
            }
        }
        return true;
    }

    public void b(Set<String> set) {
        if (set == null) {
            this.a = Collections.emptySet();
        } else {
            this.a = set;
        }
    }
}
