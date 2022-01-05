package i0.j.e;

import android.content.Context;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.model.common.Session;
import com.instabug.library.model.session.SessionLocalEntity;
import io.reactivex.internal.operators.single.SingleCreate;
import k0.b.s;
import k0.b.u;

/* compiled from: SessionManager */
public class g0 implements u<SessionLocalEntity> {
    public final /* synthetic */ Session a;

    public g0(Session session) {
        this.a = session;
    }

    public void a(s<SessionLocalEntity> sVar) throws Exception {
        Context applicationContext = Instabug.getApplicationContext();
        boolean isUsersPageEnabled = InstabugCore.isUsersPageEnabled();
        if (applicationContext != null) {
            ((SingleCreate.Emitter) sVar).a(new SessionLocalEntity.Factory().create(applicationContext, this.a, isUsersPageEnabled));
        }
    }
}
