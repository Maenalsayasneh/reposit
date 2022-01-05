package i0.j.e.v0.e.j;

import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.TaskDebouncer;
import com.instabug.library.util.TimeUtils;
import i0.j.e.t0.g;
import java.util.List;
import k0.b.l;
import k0.b.o;
import k0.b.y.d;
import k0.b.y.e;
import k0.b.z.b.a;

/* compiled from: AttributesRepository */
public class p implements e<Request, o<List<g>>> {
    public final /* synthetic */ q c;

    public p(q qVar) {
        this.c = qVar;
    }

    public Object apply(Object obj) throws Exception {
        l<RequestResponse> lVar;
        Request request = (Request) obj;
        m mVar = this.c.a;
        TaskDebouncer taskDebouncer = mVar.c;
        if (TimeUtils.currentTimeMillis() - mVar.a.getLong("key_user_attrs_last_sync") > mVar.a.getLong("key_user_attrs_ttl")) {
            lVar = mVar.b.doRequest(request);
        } else {
            lVar = l.g();
        }
        l<RequestResponse> i = taskDebouncer.debounce(lVar).i(new l());
        k kVar = new k(mVar);
        d dVar = a.d;
        k0.b.y.a aVar = a.c;
        return i.f(kVar, dVar, aVar, aVar).i(new j()).f(new i(mVar), dVar, aVar, aVar).p(new h()).p(new g()).f(new f(mVar), dVar, aVar, aVar).p(new e()).p(new d());
    }
}
