package i0.j.e.r0;

import com.instabug.library.model.session.CoreSession;
import com.instabug.library.model.session.SessionsBatchDTO;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.List;
import k0.b.y.e;

/* compiled from: SessionsSyncManager */
public class m implements e<List<CoreSession>, List<SessionsBatchDTO>> {
    public final /* synthetic */ r c;

    public m(r rVar) {
        this.c = rVar;
    }

    public Object apply(Object obj) throws Exception {
        List list = (List) obj;
        if (this.c.a.getSyncMode() == 1) {
            List<SessionsBatchDTO> a = this.c.b.a(list, 1);
            r rVar = this.c;
            StringBuilder P0 = a.P0("Syncing ");
            P0.append(((ArrayList) a).size());
            P0.append(" batches of max 1 session per batch.");
            r.a(rVar, P0.toString());
            return a;
        }
        int maxSessionsPerRequest = this.c.a.getMaxSessionsPerRequest();
        List<SessionsBatchDTO> a2 = this.c.b.a(list, maxSessionsPerRequest);
        r rVar2 = this.c;
        StringBuilder P02 = a.P0("Syncing ");
        P02.append(((ArrayList) a2).size());
        P02.append(" batches of max ");
        P02.append(maxSessionsPerRequest);
        P02.append(" sessions per batch.");
        r.a(rVar2, P02.toString());
        return a2;
    }
}
