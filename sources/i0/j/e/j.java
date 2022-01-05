package i0.j.e;

import android.annotation.SuppressLint;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.ui.onboarding.WelcomeMessage;
import i0.j.e.i;
import java.util.Objects;

/* compiled from: InstabugDelegate */
public class j implements Runnable {
    public final /* synthetic */ SDKCoreEvent c;
    public final /* synthetic */ i.b d;

    public j(i.b bVar, SDKCoreEvent sDKCoreEvent) {
        this.d = bVar;
        this.c = sDKCoreEvent;
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    public void run() {
        i.b bVar = this.d;
        i iVar = i.this;
        SDKCoreEvent sDKCoreEvent = this.c;
        WelcomeMessage.State state = bVar.c;
        Objects.requireNonNull(iVar);
        String type = sDKCoreEvent.getType();
        type.hashCode();
        if (type.equals(SDKCoreEvent.Invocation.TYPE_INVOCATION)) {
            iVar.c();
        } else if (type.equals(SDKCoreEvent.ForegroundStatus.TYPE_FOREGROUNDS_STATUS) && sDKCoreEvent.getValue().equalsIgnoreCase(SDKCoreEvent.ForegroundStatus.VALUE_AVAILABLE) && !InstabugCore.isForegroundBusy()) {
            iVar.h(state);
            iVar.c();
        }
        i.this.e2.removeCallbacks(this);
    }
}
