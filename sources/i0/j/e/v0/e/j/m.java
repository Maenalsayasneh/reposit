package i0.j.e.v0.e.j;

import com.instabug.library.internal.utils.PreferencesUtils;
import com.instabug.library.network.Request;
import com.instabug.library.util.TaskDebouncer;
import i0.j.e.l0.a.a;
import i0.j.e.t0.g;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: AttributesRemoteDataSource */
public class m extends a<List<g>, Request> {
    public final PreferencesUtils a;
    public final i0.j.e.v0.a b;
    public final TaskDebouncer c = new TaskDebouncer(TimeUnit.SECONDS.toMillis(2));

    public m(i0.j.e.v0.a aVar, PreferencesUtils preferencesUtils) {
        this.a = preferencesUtils;
        this.b = aVar;
    }
}
