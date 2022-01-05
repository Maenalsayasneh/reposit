package i0.h.c.u;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: DefaultUserAgentPublisher */
public class c implements h {
    public final String a;
    public final d b;

    public c(Set<e> set, d dVar) {
        this.a = b(set);
        this.b = dVar;
    }

    public static String b(Set<e> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<e> it = set.iterator();
        while (it.hasNext()) {
            e next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public String a() {
        Set<T> unmodifiableSet;
        Set<T> unmodifiableSet2;
        d dVar = this.b;
        synchronized (dVar.b) {
            unmodifiableSet = Collections.unmodifiableSet(dVar.b);
        }
        if (unmodifiableSet.isEmpty()) {
            return this.a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(' ');
        d dVar2 = this.b;
        synchronized (dVar2.b) {
            unmodifiableSet2 = Collections.unmodifiableSet(dVar2.b);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
