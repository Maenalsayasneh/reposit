package com.instabug.anr.f;

import android.content.Context;
import com.instabug.anr.e.a;
import com.instabug.library.model.State;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;

/* compiled from: AnrsService */
public class f {
    public static f a;
    public NetworkManager b = new NetworkManager();

    public static synchronized f a() {
        f fVar;
        synchronized (f.class) {
            if (a == null) {
                a = new f();
            }
            fVar = a;
        }
        return fVar;
    }

    public Request b(Context context, a aVar) throws JSONException {
        ArrayList<State.StateItem> logsItems;
        Request buildRequest = this.b.buildRequest(context, Request.Endpoint.CRASH_LOGS, Request.RequestMethod.Post);
        buildRequest.setEndpoint(buildRequest.getEndpoint().replaceAll(":crash_token", aVar.f));
        State state = aVar.g;
        if (!(state == null || (logsItems = state.getLogsItems()) == null || logsItems.size() <= 0)) {
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
