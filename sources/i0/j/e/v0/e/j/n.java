package i0.j.e.v0.e.j;

import i0.j.e.t0.g;
import io.reactivex.internal.operators.completable.CompletableConcatArray;
import io.reactivex.internal.operators.completable.CompletableCreate;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.List;
import java.util.Objects;
import k0.b.a;
import k0.b.y.e;
import k0.b.z.e.c.l;

/* compiled from: AttributesRepository */
public class n implements e<List<g>, k0.b.e> {
    public final /* synthetic */ q c;

    public n(q qVar) {
        this.c = qVar;
    }

    public Object apply(Object obj) throws Exception {
        List list = (List) obj;
        Objects.requireNonNull(this.c.b);
        Objects.requireNonNull(this.c.b);
        Objects.requireNonNull(list, "item is null");
        return RxJavaPlugins.onAssembly((a) new CompletableConcatArray(new k0.b.e[]{RxJavaPlugins.onAssembly((a) new CompletableCreate(new b())), RxJavaPlugins.onAssembly(new l(list)).l(new a())}));
    }
}
