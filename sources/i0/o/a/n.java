package i0.o.a;

import android.util.LruCache;
import i0.o.a.o;

/* compiled from: LruCache */
public class n extends LruCache<String, o.a> {
    public n(o oVar, int i) {
        super(i);
    }

    public int sizeOf(Object obj, Object obj2) {
        String str = (String) obj;
        return ((o.a) obj2).b;
    }
}
