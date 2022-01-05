package i0.j.e.r0;

import io.reactivex.internal.operators.completable.CompletableCreate;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import k0.b.a;
import k0.b.y.e;

/* compiled from: SessionsLocalDataSource */
public class g implements e<String, k0.b.e> {
    public final /* synthetic */ e c;

    public g(e eVar) {
        this.c = eVar;
    }

    public Object apply(Object obj) throws Exception {
        Objects.requireNonNull(this.c);
        return RxJavaPlugins.onAssembly((a) new CompletableCreate(new h((String) obj)));
    }
}
