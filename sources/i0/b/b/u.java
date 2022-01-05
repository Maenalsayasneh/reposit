package i0.b.b;

import com.airbnb.mvrx.MavericksViewModel;
import com.airbnb.mvrx.MavericksViewModelConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import m0.i;
import m0.l.e;
import m0.n.a.p;

/* compiled from: MavericksViewModelConfigFactory.kt */
public class u {
    public final List<p<MavericksViewModel<?>, MavericksViewModelConfig<?>, i>> a;
    public final boolean b;
    public final e c;
    public final e d;
    public final e e;

    public u(boolean z, e eVar, e eVar2, e eVar3, int i) {
        EmptyCoroutineContext emptyCoroutineContext = null;
        EmptyCoroutineContext emptyCoroutineContext2 = (i & 2) != 0 ? EmptyCoroutineContext.c : null;
        EmptyCoroutineContext emptyCoroutineContext3 = (i & 4) != 0 ? EmptyCoroutineContext.c : null;
        emptyCoroutineContext = (i & 8) != 0 ? EmptyCoroutineContext.c : emptyCoroutineContext;
        m0.n.b.i.e(emptyCoroutineContext2, "contextOverride");
        m0.n.b.i.e(emptyCoroutineContext3, "storeContextOverride");
        m0.n.b.i.e(emptyCoroutineContext, "subscriptionCoroutineContextOverride");
        this.b = z;
        this.c = emptyCoroutineContext2;
        this.d = emptyCoroutineContext3;
        this.e = emptyCoroutineContext;
        this.a = new ArrayList();
    }
}
