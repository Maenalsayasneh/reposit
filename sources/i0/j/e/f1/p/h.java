package i0.j.e.f1.p;

import android.view.View;
import io.reactivex.internal.operators.maybe.MaybeCreate;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import k0.b.k;
import k0.b.y.e;

/* compiled from: Functions */
public final class h implements e<Collection<View>, k<? extends View>> {
    public Object apply(Object obj) throws Exception {
        return RxJavaPlugins.onAssembly(new MaybeCreate(new i(((Collection) obj).iterator())));
    }
}
