package i0.j.b.q;

import android.annotation.SuppressLint;
import android.content.Context;
import com.instabug.bug.model.a;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.model.State;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: BugsService */
public class f {
    public static f a;
    public NetworkManager b = new NetworkManager();
    public Request c;

    public static f a() {
        f fVar;
        synchronized (f.class.getName()) {
            if (a == null) {
                f fVar2 = new f();
                a = fVar2;
                fVar2.b.setOnDoRequestListener((NetworkManager.OnDoRequestListener) null);
            }
            fVar = a;
        }
        return fVar;
    }

    public Request b(Context context, a aVar) throws JSONException {
        Request buildRequest = this.b.buildRequest(context, Request.Endpoint.BUG_LOGS, Request.RequestMethod.Post);
        String endpoint = buildRequest.getEndpoint();
        if (endpoint != null) {
            String str = aVar.d;
            if (str != null) {
                endpoint = endpoint.replaceAll(":bug_token", str);
            }
            buildRequest.setEndpoint(endpoint);
        }
        ArrayList<State.StateItem> logsItems = aVar.getState() != null ? aVar.getState().getLogsItems() : null;
        if (logsItems != null) {
            Iterator<State.StateItem> it = logsItems.iterator();
            while (it.hasNext()) {
                State.StateItem next = it.next();
                if (!(next.getKey() == null || next.getValue() == null)) {
                    buildRequest.addRequestBodyParameter(next.getKey(), next.getValue());
                }
            }
        }
        String str2 = aVar.Z1;
        if (str2 != null) {
            buildRequest.addRequestBodyParameter(InstabugDbContract.BugEntry.COLUMN_VIEW_HIERARCHY, str2);
        }
        return buildRequest;
    }
}
