package i0.j.e.r0;

import com.instabug.library.model.session.CoreSession;
import com.instabug.library.model.session.SessionLocalEntity;
import com.instabug.library.model.session.SessionMapper;
import java.util.List;
import k0.b.y.e;

/* compiled from: SessionsSyncManager */
public class n implements e<List<SessionLocalEntity>, List<CoreSession>> {
    public final /* synthetic */ r c;

    public n(r rVar) {
        this.c = rVar;
    }

    public Object apply(Object obj) throws Exception {
        List list = (List) obj;
        r rVar = this.c;
        r.a(rVar, list.size() + " sessions ready for sync.");
        return SessionMapper.toModels(list);
    }
}
