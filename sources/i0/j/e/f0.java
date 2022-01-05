package i0.j.e;

import com.instabug.library.model.session.SessionLocalEntity;
import i0.j.e.r0.b;
import io.reactivex.internal.operators.completable.CompletableCreate;
import io.reactivex.plugins.RxJavaPlugins;
import k0.b.a;
import k0.b.y.e;

/* compiled from: SessionManager */
public class f0 implements e<SessionLocalEntity, a> {
    public Object apply(Object obj) throws Exception {
        return RxJavaPlugins.onAssembly((a) new CompletableCreate(new b((SessionLocalEntity) obj)));
    }
}
