package i0.b.a;

import java.util.HashMap;
import java.util.Map;

/* compiled from: ViewTypeManager */
public class o0 {
    public static final Map<Class, Integer> a = new HashMap();
    public t<?> b;

    public static int a(t<?> tVar) {
        int q = tVar.q();
        if (q != 0) {
            return q;
        }
        Class<?> cls = tVar.getClass();
        Map<Class, Integer> map = a;
        Integer num = map.get(cls);
        if (num == null) {
            num = Integer.valueOf((-map.size()) - 1);
            map.put(cls, num);
        }
        return num.intValue();
    }
}
