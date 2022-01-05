package i0.j.e.r0;

import com.instabug.library.model.session.SessionMapper;
import com.instabug.library.model.session.SessionsBatchDTO;
import com.instabug.library.network.RequestResponse;
import i0.j.e.d1.b;
import i0.j.e.d1.c;
import io.reactivex.internal.operators.observable.ObservableRetryPredicate;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import k0.b.a;
import k0.b.y.e;
import k0.b.z.e.a.d;
import k0.b.z.e.c.i;
import k0.b.z.e.c.k;

/* compiled from: SessionsSyncManager */
public class l implements e<List<SessionsBatchDTO>, k0.b.e> {
    public final /* synthetic */ r c;

    public l(r rVar) {
        this.c = rVar;
    }

    public Object apply(Object obj) throws Exception {
        r rVar = this.c;
        Objects.requireNonNull(rVar);
        ArrayList arrayList = new ArrayList();
        for (SessionsBatchDTO sessionsBatchDTO : (List) obj) {
            List<String> iDs = SessionMapper.toIDs(sessionsBatchDTO);
            k kVar = rVar.e;
            Objects.requireNonNull(kVar);
            k0.b.l<RequestResponse> doRequest = kVar.a.doRequest(SessionMapper.toRequest(SessionMapper.toJson(sessionsBatchDTO)));
            c cVar = kVar.b;
            Objects.requireNonNull(cVar);
            b bVar = new b(cVar);
            Objects.requireNonNull(doRequest);
            k0.b.l onAssembly = RxJavaPlugins.onAssembly(new ObservableRetryPredicate(doRequest, 3, bVar));
            Objects.requireNonNull(onAssembly);
            a onAssembly2 = RxJavaPlugins.onAssembly((a) new k(onAssembly));
            StringBuilder P0 = i0.d.a.a.a.P0("Synced a batch of ");
            P0.append(sessionsBatchDTO.getSessions().size());
            P0.append(" session/s.");
            a d = onAssembly2.d(new p(rVar, P0.toString()));
            e eVar = rVar.d;
            Objects.requireNonNull(eVar);
            Objects.requireNonNull(iDs, "source is null");
            a b = d.b(RxJavaPlugins.onAssembly(new i(iDs)).l(new c(eVar)));
            e eVar2 = rVar.d;
            Objects.requireNonNull(eVar2);
            a b2 = b.b(RxJavaPlugins.onAssembly(new i(iDs)).l(new g(eVar2)));
            Objects.requireNonNull(rVar.f);
            arrayList.add(b2.f(k0.b.d0.a.b()));
        }
        return RxJavaPlugins.onAssembly((a) new d(arrayList));
    }
}
