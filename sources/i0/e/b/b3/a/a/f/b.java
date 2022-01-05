package i0.e.b.b3.a.a.f;

import com.clubhouse.android.core.storage.Store;
import java.util.concurrent.TimeUnit;
import m0.n.b.i;

/* compiled from: UserPresence.kt */
public final class b {
    public static final long a = TimeUnit.MINUTES.toMinutes(5);
    public static final long b = TimeUnit.DAYS.toMinutes(1);

    public static final void a(Store<Integer, a> store, int i, Integer num) {
        i.e(store, "<this>");
        if (num != null) {
            store.f(new Store.a.c(new a(i, num.intValue())));
        } else {
            store.f(new Store.a.C0198a(Integer.valueOf(i)));
        }
    }
}
