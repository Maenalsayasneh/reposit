package m0.k;

import java.util.Comparator;
import m0.n.b.i;

/* compiled from: Comparisons.kt */
public final class b implements Comparator<Comparable<? super Object>> {
    public static final b c = new b();

    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        i.e(comparable, "a");
        i.e(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return a.c;
    }
}
