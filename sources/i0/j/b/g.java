package i0.j.b;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.InstabugBackgroundService;
import com.instabug.bug.view.actionList.service.ReportCategoriesService;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import i0.d.a.a.a;
import i0.j.b.s.c;
import java.util.Objects;
import k0.b.y.d;

/* compiled from: ReportingPluginWrapper */
public final class g implements d<SDKCoreEvent> {
    public final /* synthetic */ Context c;

    public g(Context context) {
        this.c = context;
    }

    public void b(Object obj) throws Exception {
        SDKCoreEvent sDKCoreEvent = (SDKCoreEvent) obj;
        Context context = this.c;
        StringBuilder P0 = a.P0("receive new core event: ");
        P0.append(sDKCoreEvent.toString());
        InstabugSDKLogger.v(b.class, P0.toString());
        String type = sDKCoreEvent.getType();
        type.hashCode();
        char c2 = 65535;
        switch (type.hashCode()) {
            case 3599307:
                if (type.equals("user")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1738700944:
                if (type.equals(SDKCoreEvent.Invocation.TYPE_INVOCATION)) {
                    c2 = 1;
                    break;
                }
                break;
            case 1843485230:
                if (type.equals(SDKCoreEvent.Network.TYPE_NETWORK)) {
                    c2 = 2;
                    break;
                }
                break;
            case 1984987798:
                if (type.equals("session")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        if (c2 != 0) {
            if (c2 == 1) {
                sDKCoreEvent.getValue().equals(SDKCoreEvent.Invocation.VALUE_INVOKED);
            } else if (c2 != 2) {
                if (c2 == 3 && sDKCoreEvent.getValue().equals(SDKCoreEvent.Session.VALUE_STARTED)) {
                    int i = ReportCategoriesService.c;
                    long currentTimeMillis = System.currentTimeMillis();
                    Objects.requireNonNull(i0.j.b.s.a.h());
                    if (currentTimeMillis - c.a().b.getLong("report_categories_fetched_time", 0) > 86400000) {
                        InstabugBackgroundService.enqueueInstabugWork(context, ReportCategoriesService.class, 2611, new Intent(context, ReportCategoriesService.class));
                    }
                }
            } else if (!sDKCoreEvent.getValue().equals(SDKCoreEvent.Network.VALUE_ACTIVATED)) {
            } else {
                if (context != null) {
                    PoolProvider.postIOTask(new a(context));
                } else {
                    InstabugSDKLogger.e("Bug/CoreEventsHandler", "Context was null during Bugs retrieval from DB");
                }
            }
        } else if (sDKCoreEvent.getValue().equals(SDKCoreEvent.User.VALUE_LOGGED_OUT)) {
            Objects.requireNonNull(i0.j.b.s.a.h());
            c a = c.a();
            a.c.putLong("last_bug_time", 0);
            a.c.apply();
            Objects.requireNonNull(i0.j.b.s.a.h());
            c a2 = c.a();
            a2.c.putString("ib_e_pn", (String) null);
            a2.c.apply();
        }
    }
}
