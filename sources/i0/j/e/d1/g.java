package i0.j.e.d1;

import android.util.Pair;
import java.lang.ref.WeakReference;

/* compiled from: WeakReferencePair */
public class g<T, V> extends Pair<WeakReference<T>, WeakReference<V>> {
    public g(T t, V v) {
        super(new WeakReference(t), new WeakReference(v));
    }
}
