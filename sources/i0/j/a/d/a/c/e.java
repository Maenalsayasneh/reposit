package i0.j.a.d.a.c;

import com.instabug.apm.model.APMNetworkLog;
import com.instabug.library.model.common.Session;
import i0.j.a.d.a.d.f;
import i0.j.a.e.b;
import i0.j.a.e.c;
import i0.j.a.n.a.a;

/* compiled from: NetworkLogMigrationHandlerImpl */
public class e {
    public final c a;
    public final a b;
    public final b c;
    public final f d;
    public a e = i0.j.a.g.a.i();

    public e(c cVar, a aVar, b bVar, f fVar) {
        this.a = cVar;
        this.b = aVar;
        this.c = bVar;
        this.d = fVar;
    }

    public void a(APMNetworkLog aPMNetworkLog, Session session) {
        if (this.d != null) {
            long b2 = ((d) this.a).b(session.getId(), aPMNetworkLog);
            a aVar = this.e;
            StringBuilder P0 = i0.d.a.a.a.P0("Migrated network request: ");
            P0.append(aPMNetworkLog.getUrl());
            aVar.a(P0.toString());
            if (b2 > 0) {
                this.d.l(session.getId(), 1);
                int a2 = ((d) this.a).a(session.getId(), ((c) this.c).d());
                if (a2 > 0) {
                    this.d.g(session.getId(), a2);
                }
                ((d) this.a).c(((c) this.c).i());
            }
        }
    }
}
