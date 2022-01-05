package i0.j.e.a;

import android.annotation.SuppressLint;
import com.instabug.library.analytics.model.Api;
import com.instabug.library.core.eventbus.SessionStateEventBus;
import com.instabug.library.model.session.SessionState;
import com.instabug.library.util.threading.PoolProvider;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k0.b.y.d;

@SuppressFBWarnings({"URF_UNREAD_FIELD", "DLS_DEAD_LOCAL_STORE", "DLS_DEAD_LOCAL_STORE"})
/* compiled from: AnalyticsLogger */
public class b {
    public final Map<String, Api> a = new ConcurrentHashMap();
    public final List<Api> b = Collections.synchronizedList(new ArrayList());
    public k0.b.w.a c = SessionStateEventBus.getInstance().subscribe(new a());

    /* compiled from: AnalyticsLogger */
    public class a implements d<SessionState> {
        public a() {
        }

        public void b(Object obj) throws Exception {
            PoolProvider.postIOTask(new a(this, (SessionState) obj));
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public final void a(String str, boolean z, Api.Parameter... parameterArr) {
        Api api = this.a.get(str);
        if (api != null) {
            api.incrementCount();
            this.a.put(str, api);
            return;
        }
        this.a.put(str, b(str, z, parameterArr));
    }

    public final Api b(String str, boolean z, Api.Parameter... parameterArr) {
        ArrayList arrayList;
        Api api = new Api();
        api.setApiName(str);
        api.setDeprecated(z);
        if (parameterArr != null) {
            arrayList = new ArrayList(Arrays.asList(parameterArr));
        } else {
            arrayList = new ArrayList();
        }
        api.setParameters(arrayList);
        return api;
    }
}
