package m0.k;

import java.util.Comparator;
import m0.n.b.i;

/* compiled from: Comparisons.kt */
public final class a implements Comparator<Comparable<? super Object>> {
    public static final a c = new a();

    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        i.e(comparable, "a");
        i.e(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return b.c;
    }
}
