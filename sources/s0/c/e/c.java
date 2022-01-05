package s0.c.e;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import s0.c.a;
import s0.c.b;

/* compiled from: SubstituteLoggerFactory */
public class c implements a {
    public boolean a = false;
    public final Map<String, b> b = new HashMap();
    public final LinkedBlockingQueue<s0.c.d.c> c = new LinkedBlockingQueue<>();

    public synchronized b a(String str) {
        b bVar;
        bVar = this.b.get(str);
        if (bVar == null) {
            bVar = new b(str, this.c, this.a);
            this.b.put(str, bVar);
        }
        return bVar;
    }
}
