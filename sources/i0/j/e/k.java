package i0.j.e;

import android.os.Handler;
import android.os.Looper;
import com.instabug.library.Feature;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import i0.j.e.n0.a;
import java.util.Objects;
import k0.b.y.d;

/* compiled from: InstabugDelegate */
public class k implements d<SDKCoreEvent> {
    public final /* synthetic */ i c;

    public k(i iVar) {
        this.c = iVar;
    }

    public void b(Object obj) throws Exception {
        SDKCoreEvent sDKCoreEvent = (SDKCoreEvent) obj;
        if (sDKCoreEvent.getType().equalsIgnoreCase(SDKCoreEvent.Feature.TYPE_FEATURES) && sDKCoreEvent.getValue().equals(SDKCoreEvent.Feature.VALUE_FETCHED)) {
            Objects.requireNonNull(this.c);
            if (z.j().h(Feature.VP_CUSTOMIZATION) == Feature.State.ENABLED) {
                new Handler(Looper.getMainLooper()).post(new a());
            }
        }
    }
}
