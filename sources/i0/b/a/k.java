package i0.b.a;

import h0.f.e;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: DiffPayload */
public class k {
    public final t<?> a;
    public final e<t<?>> b;

    public k(t<?> tVar) {
        List<?> singletonList = Collections.singletonList(tVar);
        if (!singletonList.isEmpty()) {
            int size = singletonList.size();
            if (size == 1) {
                this.a = (t) singletonList.get(0);
                this.b = null;
                return;
            }
            this.a = null;
            this.b = new e<>(size);
            Iterator<?> it = singletonList.iterator();
            while (it.hasNext()) {
                t tVar2 = (t) it.next();
                this.b.o(tVar2.b, tVar2);
            }
            return;
        }
        throw new IllegalStateException("Models must not be empty");
    }
}
