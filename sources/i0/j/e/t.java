package i0.j.e;

import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import k0.b.y.d;

/* compiled from: InstabugDelegate */
public class t implements d<SDKCoreEvent> {
    public final /* synthetic */ i c;

    public t(i iVar) {
        this.c = iVar;
    }

    public void b(Object obj) throws Exception {
        SDKCoreEvent sDKCoreEvent = (SDKCoreEvent) obj;
        if (sDKCoreEvent.getType().equals(SDKCoreEvent.Network.TYPE_NETWORK) && sDKCoreEvent.getValue().equals(SDKCoreEvent.Network.VALUE_ACTIVATED)) {
            this.c.b();
        }
    }
}
