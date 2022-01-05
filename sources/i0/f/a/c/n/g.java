package i0.f.a.c.n;

import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: AnnotatedMethodMap */
public final class g implements Iterable<AnnotatedMethod> {
    public Map<m, AnnotatedMethod> c;

    public g() {
    }

    public Iterator<AnnotatedMethod> iterator() {
        Map<m, AnnotatedMethod> map = this.c;
        if (map == null) {
            return Collections.emptyIterator();
        }
        return map.values().iterator();
    }

    public g(Map<m, AnnotatedMethod> map) {
        this.c = map;
    }
}
