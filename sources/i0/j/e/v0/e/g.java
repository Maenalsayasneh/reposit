package i0.j.e.v0.e;

import com.instabug.library.network.d;
import com.instabug.library.settings.SettingsManager;
import io.reactivex.internal.operators.observable.ObservableTimer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import k0.b.d0.a;
import k0.b.l;
import k0.b.o;
import k0.b.q;
import k0.b.y.e;

/* compiled from: MigrateUUIDService */
public class g implements e<Integer, o<?>> {
    public Object apply(Object obj) throws Exception {
        Integer num = (Integer) obj;
        if (!SettingsManager.getInstance().shouldMakeUUIDMigrationRequest()) {
            return l.h(new d());
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        q a = a.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableTimer(Math.max((long) Math.pow(2.718281828459045d, (double) num.intValue()), 0), timeUnit, a));
    }
}
