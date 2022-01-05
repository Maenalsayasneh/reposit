package i0.j.e.q0;

import i0.j.e.t0.b;
import java.util.LinkedList;
import java.util.List;
import k0.b.y.e;

/* compiled from: LoggingFileResolver */
public class h implements e<Long, List<b>> {
    public final /* synthetic */ j c;

    public h(j jVar) {
        this.c = jVar;
    }

    public Object apply(Object obj) throws Exception {
        Long l = (Long) obj;
        return new LinkedList(this.c.c);
    }
}
