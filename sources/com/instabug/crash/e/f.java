package com.instabug.crash.e;

import android.content.Context;
import com.instabug.crash.c.a;
import com.instabug.library.model.State;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;

/* compiled from: CrashesService */
public class f {
    public static f a;
    public NetworkManager b = new NetworkManager();

    public static f a() {
        if (a == null) {
            a = new f();
        }
        return a;
    }

    public Request b(Context context, a aVar) throws JSONException {
        Request buildRequest = this.b.buildRequest(context, Request.Endpoint.CRASH_LOGS, Request.RequestMethod.Post);
        buildRequest.setEndpoint(buildRequest.getEndpoint().replaceAll(":crash_token", aVar.d));
        ArrayList<State.StateItem> logsItems = aVar.y.getLogsItems();
        if (logsItems != null && logsItems.size() > 0) {
            Iterator<State.StateItem> it = logsItems.iterator();
            while (it.hasNext()) {
                State.StateItem next = it.next();
                if (next.getKey() != null) {
                    buildRequest.addRequestBodyParameter(next.getKey(), next.getValue());
                }
            }
        }
        return buildRequest;
    }
}
