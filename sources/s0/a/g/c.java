package s0.a.g;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class c<T> implements i<T>, Iterable {
    public Collection<T> c;

    public c(Collection<T> collection) {
        this.c = new ArrayList(collection);
    }

    public Collection<T> getMatches(h<T> hVar) {
        if (hVar == null) {
            return new ArrayList(this.c);
        }
        ArrayList arrayList = new ArrayList();
        for (T next : this.c) {
            if (hVar.r0(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public Iterator<T> iterator() {
        return ((ArrayList) getMatches((h) null)).iterator();
    }
}
