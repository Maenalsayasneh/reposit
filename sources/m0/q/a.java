package m0.q;

import java.lang.Comparable;

/* compiled from: Ranges.kt */
public interface a<T extends Comparable<? super T>> extends b<T> {
    boolean b(T t, T t2);

    boolean isEmpty();
}
